package annotations;

@Service(name ="Barnie", lazeLoad = true)
public class LazyService {
    public void lazyInit() throws Exception {
        System.out.println("Lazy Init is worked, tried throw Exception");
    }
}
