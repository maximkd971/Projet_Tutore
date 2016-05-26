package Modele;
//import Vu.*;
//import Fichier.*;

public class Evt
{
	private Date chDate;
	private String chTitre;
	private String chLieu;
	private String chHeureDebut;
	private String chMinuteDebut;
	private String chHeureFin;
	private String chMinuteFin;
	
	public Evt (Date parDate,String parTitre,String parLieu,String parHeureDebut, String parMinuteDebut,String parHeureFin,String parMinuteFin )
	{
		chDate = parDate;
		chTitre = parTitre;
		chLieu = parLieu;
		chHeureDebut = parHeureDebut;
		chMinuteDebut = parMinuteDebut;
		chHeureFin = parHeureFin;
		chMinuteFin = parMinuteFin;
	}
	public String toString()
	{
		return(chDate.toString()+","+chTitre+","+chLieu+","+chHeureDebut+":"+chMinuteDebut+" - "+chHeureFin+":"+chMinuteFin);	// 02:30 - 03:15
	}
	
	public void setTitre(String parTitre)
	{
		chTitre=parTitre;
	}
	public String getTitre() {
		return chTitre;
	}
	
	public void SetDate(Date parDate)
	{
		chDate=parDate;
	}
	
	public Date getDate() {
		return chDate;
	}
	
	
	public int precede(Evt parEvt)
	{
		if(chDate==parEvt.chDate)
		{
			if(chTitre.compareTo(parEvt.chTitre)<0)
				return 1;
			if(chTitre.compareTo(parEvt.chTitre)<0)
				return -1;
			return chDate.precede(parEvt.chDate);		
		}
		return 0;
	}
}