import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;


public class Esma_Beydili_2020510018 {
   
	
	
	static int greedy(int n, int c, int p, int salary[], int demand[]) {
		
		int totalCost=0;
		for(int i=0; i<n; i++) {
			
			
			if(demand[i]>p) 
			{
				int coach = demand[i]-p;
				int yearCost = coach*c;
				totalCost += yearCost;
				System.out.println("Year : "+ (i+1) +" , Coach Number : "+ coach+" , Year Cost : "+ yearCost+" , TotalCost : "+totalCost);
			}
			else 
			{
				System.out.println("Year : "+ (i+1) +" , Coach Number : "+ 0+" , Year Cost : "+ 0+" , TotalCost : "+totalCost);
			}
			
		}
		
		return totalCost;
	}
	

        //  Driver code
        public static void main(String args[])throws FileNotFoundException
        {  
        	
        	//int demand[]= {4,2,5};
         	 int demand[] = FileReadConvertArray("yearly_player_demand.txt");
             int salary[] = FileReadConvertArray("players_salary.txt");
             int n = demand.length;   int p=5; int c=5;
             System.out.println("Greedy results : "+greedy(n, c, p, salary,demand));
        	
        }

        public static int[] FileReadConvertArray(String txt_name) throws FileNotFoundException
        {
        	 File student = new File(txt_name);
             Scanner idLineReader = new Scanner(student);
             
             int idAmount = 0;
             while (idLineReader.hasNextLine()) {
             	idAmount++;
             	idLineReader.nextLine();
             }
             
             idLineReader.close();
             
             int[] idArr = new int [idAmount-1];
             int num=0;

            Scanner idReader = new  Scanner(student);
             while (idReader.hasNextLine()) {
            	 
             	String[] line = idReader.nextLine().split("	");
             	if(num!=0)
             	{ //System.out.println(line[0]);
             		idArr[num-1]=Integer.parseInt(line[1]);
             	}
             	num++;
             }
             idReader.close();
             //System.out.println("***");
             
             return idArr;
        }
	
	
	
}


