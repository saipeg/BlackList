package annotations;

@Service(name = "Petrov")
public class SimpleService {
    public void initService() {
        System.out.println("Init Service is worked");
    }
}
