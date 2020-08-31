public class EmpWageComputationClassmethods
{
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
        public static int EmpWage()
        {
        int empHrs=0,totalemphrs=0,totalworkingdays=0;
         while(totalemphrs<=MAX_HRS_IN_MONTH && totalworkingdays<NUM_OF_WORKING_DAYS)
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
                int totalEmpwage = totalemphrs*EMP_RATE_PER_HOUR;
                System.out.println("Total employee wage is : "+totalEmpwage);
                return totalEmpwage;
                }
        public static void main(String[] args)

        {
        EmpWage();

        }
}
