package annotations;

public class AnnotationProcessor {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

    }

    static void inspectService(Class<?> service) {
        // service. - we can check all annotations
        if(service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
            System.out.println(ann.lazeLoad());
        }


    }

}
