package abstractsports;

import java.util.logging.Logger;

abstract class sports
{
	abstract void setvisitorteam(String name);
	abstract void sethometeam(String name);
	
}
abstract class cricket extends sports
{
	abstract void setvisitorteamscore(int score);
	abstract void sethometeamscore(int score);
}
class match extends cricket
{
	String hometeamname,visitorteamname;
	int hometeamscore,visitorteamscore;
	void setvisitorteam(String name)
	{
		visitorteamname=name;
	}
	void sethometeam(String name)
	{
		hometeamname=name;
	}
	void setvisitorteamscore(int score)
	{
		hometeamscore=score;
	}
	void sethometeamscore(int score)
	{
		hometeamscore=score;
	}
	void result()
	{
		if(hometeamscore>visitorteamscore)
		{
			Logger log =Logger.getLogger("infologging");
			log.info(hometeamname+"won the match");
		}
		else if(visitorteamscore>hometeamscore)
		{Logger log =Logger.getLogger("infologging");
			log.info(visitorteamname+"won the match");
			}
		else 
		{
			Logger log =Logger.getLogger("infologging");
			log.info("match was down");
		}
	}
}

public class enduser {

	public static void main(String[] args) {
		match ref=new match();
		ref.setvisitorteam("Australia");
		ref.sethometeam("india");
		ref.setvisitorteamscore(359);
		ref.sethometeamscore(356);
		ref.result();
		

	}

}
