package tpp2_2;


public class Test {
    public static void main(String[] args) {
      
        Departement dep1 = new Departement(1);

        
        Employe emp1 = new Employe(123, "sara", 600, 1);
        Employe emp2 = new Employe(456, "abir", 550, 1);
        Employe emp3 = new Employe(789, "monia", 500, 1);

       
        dep1.ajoutEmploye(emp1);
        dep1.ajoutEmploye(emp2);
        dep1.ajoutEmploye(emp3);

        
        dep1.afficheDep();

       
        int cin = 456;
        System.out.println("cin est " + cin + " existe dans le departement : " + dep1.existeE(cin));


        dep1.retirerEmploye(emp2);


        dep1.afficheDep();

        
        Employe empSalMax = dep1.getEmpSalMax();
        System.out.println("L'employe avec le salaire maximum dans le departement est : " + empSalMax.toString());
    }
}

