public class TestaEquipamento {
    public static void main(String[] args){
        Equipamento equip = new Equipamento();
        equip.setAtributo1("Primeiro Atributo");
        equip.setAtributo2("Segundo Atributo");

        Computador comp = new Computador();
        comp.setAtributo1("Primeiro Atributo");
        comp.setAtributo2("Segundo Atributo");
        comp.setAtributo3("Terceiro Atributo");
        comp.setAtributo4("Quarto Atributo");

        System.out.println("Primeiro objeto");
        System.out.println("Atributo 1: " + equip.getAtributo1());
        System.out.println("Atributo 2: " + equip.getAtributo2());
        System.out.println("Segundo objeto");
        System.out.println("Atributo 1: " + comp.getAtributo1());
        System.out.println("Atributo 2: " + comp.getAtributo2());
        System.out.println("Atributo 3: " + comp.getAtributo3());
        System.out.println("Atributo 4: " + comp.getAtributo4());
        
    }
}
