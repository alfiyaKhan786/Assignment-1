
public class Team {
	static  {
		System.out.println("Team details");
	}
	 static public int TeamId;
	 static public String TeamName;
	 static public String MemberName;
Team(int TeamId,String TeamName,String MemberName){
	this.TeamId=TeamId;
	this.TeamName=TeamName;
	this.MemberName=MemberName;
	}
 static void getData() {
	System.out.println(TeamId+" "+TeamName+" "+MemberName);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Team t1=new Team(1910,"BackEnd","Ankit" );
t1.getData();
Team t2=new Team(2501,"FrontEnd","Alfiya");
Team.getData();
Team t3=new Team(5801,"DataBase","Piyush");
Team.getData();
Team t4=new Team(9101,"Devops","Animesh");
Team.getData();

	}

}
