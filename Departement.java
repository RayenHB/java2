package tpp2_2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employe> LEmployes;
	
	
	public Departement(int idDep) {
		this.idDep = idDep;
		LEmployes = new HashSet<>();
	}
	
	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public void ajoutEmploye(Employe E)
	{
		if(E.getCin()>0)
		{
			E.setIdDept(this.idDep);
			this.LEmployes.add(E);
		}
		
	}
	public void retirerEmploye(Employe E)
	{
		this.LEmployes.remove(E);
	}
	public void afficheDep()
	{
		System.out.println("Departement " + idDep + ":");
        for (Employe E : LEmployes) {
            System.out.println(E.toString());
        }
        
	}
	 public boolean existeE(int cin) {
	        for (Employe employe : this.LEmployes) {
	            if (employe.getCin() == cin) {
	                return true;
	            }
	        }
	        return false;
	    }
	public Employe getEmpSalMax()
	{
		TreeSet<Employe> l = new TreeSet<>(this.LEmployes);
		return l.first();
	}
}
