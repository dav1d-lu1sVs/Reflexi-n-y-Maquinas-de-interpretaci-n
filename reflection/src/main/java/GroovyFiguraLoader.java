import groovy.lang.GroovyClassLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GroovyFiguraLoader {

    public static List<Class<?>> cargarFiguras(String rutaPlugins) {

        List<Class<?>> clases = new ArrayList<>();

        File carpeta = new File(rutaPlugins);

        // si no existe la carpeta
        if (!carpeta.exists()) {
            System.out.println("Carpeta plugins no encontrada");
            return clases;
        }

        try (GroovyClassLoader loader =
                     new GroovyClassLoader()) {

            File[] archivos = carpeta.listFiles();

            if (archivos == null) return clases;

            for (File archivo : archivos) {

                if (archivo.getName().endsWith(".groovy")) {

                    System.out.println("Cargando plugin: "
                            + archivo.getName());

                    Class<?> clazz =
                            loader.parseClass(archivo);

                    clases.add(clazz);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return clases;
    }
}