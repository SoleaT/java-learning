package Oophwrk;

import java.util.ArrayList;

public class Relations implements Processing{
    private Man husband;
    private Man wife;
    private Relations husbParents;
    private Relations wifeParents;
    public ArrayList<Man> children;

    public Relations(Man husband, Man wife) {
        this.husband = husband;
        this.wife = wife;
    }

    public Man getHusband() {
        return husband;
    }

    public Man getWife() {
        return wife;
    }

    public void setChild(Man child) {
        this.children.add(child);
    }

}
