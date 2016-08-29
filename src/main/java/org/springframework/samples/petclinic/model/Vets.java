package org.springframework.samples.petclinic.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by U27688 on 8/25/2016.
 */
@XmlRootElement
public class Vets {
    private List<Vet> vets;

    @XmlElement
    public  List<Vet> getVetList(){
       if(vets == null)
          vets = new ArrayList<>();

            return vets;
    }
}
