package Modele;
import java.util.ArrayList;
import java.util.HashMap;

//import Vu.*;
//import Fichier.*;
public class Agenda 
{
	HashMap <String,ArrayList<Evt>> chMap;
	public Agenda ()
	{
		chMap = new HashMap<String,ArrayList<Evt>>();
	}
	public void ajout(String parCle,Evt parEvt)
	{
		if(chMap.containsKey(parCle))
			chMap.get(parCle);
		else 
		{
			ArrayList newList = new ArrayList <Evt>();
			newList.add(parEvt);
			chMap.put(parCle, newList);
		}
	}
}
