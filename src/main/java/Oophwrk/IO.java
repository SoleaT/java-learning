package Oophwrk;

public interface IO {
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String YELLOW = "\u001B[33m";
    String CYAN = "\u001B[36m";
    String GREEN = "\u001B[32m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    default void printRelations(FamilyPerson p) {

    }

    default void descendTree(FamilyPerson p) {

    }

    default void ascendTree(FamilyPerson p) {

    }

    default void printInfo() {

    }

    default void printFamilyNode() {

    }

}
