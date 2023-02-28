package Oophwrk;

import java.util.ArrayList;

public class FamilyNode implements IO {
    private String familyName;
    private FamilyPerson husband;
    private FamilyPerson wife;

    public FamilyNode getHusbParents() {
        return husbParents;
    }

    public FamilyNode getWifeParents() {
        return wifeParents;
    }

    private FamilyNode husbParents;
    private FamilyNode wifeParents;
    public ArrayList<FamilyPerson> children = new ArrayList<>();

    public FamilyNode(FamilyPerson husband, FamilyPerson wife) {
        this.husband = husband;
        this.wife = wife;
        this.husband.setFamily(this);
        this.wife.setFamily(this);
    }

    public void addWifeParents(FamilyNode f) {
        this.wifeParents = f;
        f.setChild(this.wife);
    }

    public void addHusbandParents(FamilyNode f) {
        this.husbParents = f;
        f.setChild(this.husband);
    }

    @Override
    public void printFamilyNode() {
        System.out.printf("%s\n______________\nСемья: %s%s",IO.GREEN, this.familyName,IO.RESET);
        printCouple();
        printChildren();
        printParents();
    }

    public void printChildren() {
        if (children.size() > 0) {
            System.out.print(IO.YELLOW +"Дети:"+IO.RESET);
            for (FamilyPerson child : children) {
                System.out.print("\nРебенок ");
                child.printInfo();
            }
        }
    }

    public void printCouple() {
        System.out.print(IO.YELLOW +"\nМуж: "+IO.RESET);
        getHusband().printInfo();
        System.out.print(IO.YELLOW +"\nЖена: "+IO.RESET);
        getWife().printInfo();
        System.out.printf(", в девичестве %s%n", getWife().getMaidenName());
    }

    public void printParents() {
        if (this.husbParents != null) {
            System.out.print(IO.YELLOW +"\nРодители мужа: "+IO.RESET);
            this.husbParents.getHusband().printInfo();
            System.out.print(", ");
            this.husbParents.getWife().printInfo();
        }
        if (this.wifeParents != null) {
            System.out.print(IO.YELLOW +"\nРодители жены: "+IO.RESET);
            this.wifeParents.getHusband().printInfo();
            System.out.print(", ");
            this.wifeParents.getWife().printInfo();
        }
    }

    public FamilyPerson getHusband() {
        return husband;
    }

    public FamilyPerson getWife() {
        return wife;
    }

    public void setChild(FamilyPerson child) {
        this.children.add(child);
        child.setParents(this);
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
