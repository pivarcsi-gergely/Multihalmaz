package hu.petrik.multihalmaz.MultiSet;

import hu.petrik.multihalmaz.MultiSetElem;

import java.util.ArrayList;
import java.util.List;

public class MultiSet {

    private List<MultiSetElem> elements;


    public MultiSet()
    {
        this.elements = new ArrayList<>();
    }

    public void add(MultiSetElem element){
        if (!this.elements.contains(element)){
            this.elements.add(element);
            element.setElemSzam(1);
        }
        else {
            element.setElemSzam(+1);
        }
    }

    public boolean remove(MultiSetElem element){
        //return this.elements.remove(element);

        boolean isRemoved = false;

        if (element.getElemSzam() < 0){

            isRemoved = true;
        }
        else if(element.getElemSzam() == 0) {
            this.elements.remove(element);
            isRemoved = true;
        }

        return isRemoved;
    }
}
