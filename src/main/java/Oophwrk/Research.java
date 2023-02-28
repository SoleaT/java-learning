package Oophwrk;

public class Research implements IO{

    public void twoPeopleRelations(FamilyPerson p1, FamilyPerson p2) {

    }

    public FamilyNode getPersonParents(FamilyPerson p) {
        return p.getParents();
    }

    @Override
    public void printRelations(FamilyPerson p) {
//        System.out.printf("\nИсследуем связи %s %s\n",p.getName(),p.getSurname());
        System.out.println(IO.CYAN+"\nИнформация: "+IO.RESET);
        p.printInfo();
        FamilyNode pp=this.getPersonParents(p);
        if (this.getPersonParents(p)!=null) {
            System.out.print(IO.CYAN+"\nРодители:"+IO.RESET);
            pp.printCouple();
            if (pp.getHusbParents()!=null | pp.getWifeParents()!=null) {
                System.out.print(IO.CYAN +"Бабушки и дедушки:"+IO.RESET);
                pp.printParents();
            }
        }
        if (p.getFamily()!=null){
            p.getFamily().printChildren();
        }
    }
}
