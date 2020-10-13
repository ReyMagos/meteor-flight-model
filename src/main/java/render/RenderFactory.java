package render;

import org.reflections.Reflections;

import java.awt.*;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Set;

public class RenderFactory {

    private static final HashMap<Class<?>, Class<Render<?>>> renders = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static void init() {
        Reflections reflections = new Reflections();
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(RegisterRender.class);
        for (Class<?> clazz: annotatedClasses) {
            Class<Render<?>> render;
            try {
                render = (Class<Render<?>>)clazz;
            } catch (ClassCastException exc) {
                System.err.println("Annotation render.RegisterRender applied to not a render.Render class!");
                continue;
            }
            ParameterizedType type = (ParameterizedType)render.getGenericSuperclass();
            Class<?> classOfRender = (Class<?>)type.getActualTypeArguments()[0];
            renders.put(classOfRender, render);
        }
    }

    @SuppressWarnings("unchecked")
    public static void makeRenderFor(Object object, Graphics2D g2) {
        Class<?> clazz = object.getClass();
        Class<Render<?>> renderClass = renders.get(clazz);
        if (renderClass == null) {
            System.err.println("There is no render for this object");
        } else {
            try {
                Render<Object> render = (Render<Object>)renderClass.newInstance();
                render.render(g2, object);
            } catch (InstantiationException | IllegalAccessException | ClassCastException exc) {
                exc.printStackTrace(); // Never will be reached
            }
        }
    }
}
