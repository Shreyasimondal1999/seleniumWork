package collectionINJava;

import java.util.ArrayList;
import java.util.List;

class HelmetShowroom1 {
    private List<Helmet1> helmets;
 
    public HelmetShowroom1() {
        this.helmets = new ArrayList<>();
    }
 
    public void addHelmet(Helmet1 helmet) {
        helmets.add(helmet);
    }
 
    public List<Helmet1> getHelmets() {
        return helmets;
    }
}
