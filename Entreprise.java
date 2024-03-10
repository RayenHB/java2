package tpp2_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Entreprise {
	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;
	
	public Entreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
		Liste_Deps = new HashMap<>();
	}
	
	public void ajoutDep(Departement d)
	{
		this.Liste_Deps.put(d.getIdDep(),d);
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public HashMap<Integer, Departement> getListe_Deps() {
		return Liste_Deps;
	}

	public void setListe_Deps(HashMap<Integer, Departement> liste_Deps) {
		Liste_Deps = liste_Deps;
	}
	
	public void retirerDep(Departement d)
	{
		this.Liste_Deps.remove(d.getIdDep());
	}
	public void afficheE()
	{
		System.out.println("entreprise " + this.nomEntreprise + ":");
		Set<Entry<Integer,Departement>> s= this.Liste_Deps.entrySet();
        for (Entry <Integer,Departement>e: s) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
	}
	public void UpdateDep(Employe E, int idDep)
	{
		Collection <Departement> l = this.Liste_Deps.values();
		for(Departement d:l)
		{
			if(d.existeE(E.getCin()))
			{
				deprc=d;
			}
		}
		
	}
	
	
}
