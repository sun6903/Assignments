public class EmpWageComputationmulticompany
{
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static int computeEmpWage(String company, int empRatePerhour, int numofworkingdays, int maxhourspermonth)
        {
        int empHrs=0,totalemphrs=0,totalworkingdays=0;
         while(totalemphrs<=maxhourspermonth && totalworkingdays<numofworkingdays)
                {
                totalworkingdays++;
                int empCheck=(int)Math.floor(Math.random()*10)%3;
                switch(empCheck)
                {
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                case  IS_PART_TIME:
                        empHrs=8;
                        break;
                default:
                        empHrs=0;
                }
                totalemphrs+=empHrs;
                System.out.println("DAY #: "+ totalworkingdays + "empHrs : " +empHrs);
                }
                int totalEmpwage = totalemphrs*empRatePerhour;
                System.out.println("Total emp wage for company: "+company+ "is : "+totalEmpwage);
                return totalEmpwage;
                }
        public static void main(String[] args)

        {
	System.out.println("Welcome to Employee Wage Computation program on master branch");
        computeEmpWage("Spencers",20,5,50);
        computeEmpWage("Reliance",10,8,60);
	 computeEmpWage("More",15,4,70);
	 computeEmpWage("Heritage",30,6,40);


        }

}
