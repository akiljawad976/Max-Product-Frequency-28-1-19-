package Problem.ArrayProblems;

/**
 * Hello world!
 *
 */
public class ArrayProblems 
{
	static int multiplyingfirst2Max() {
		int[] array= {5,10,11,20,8,9,12};
        int max = -1;
        int index = 0;
        for(int i =0;i<array.length;i++) {
        	if(max<array[i]) {
        		max=array[i];
        		index=i;
        	}
        }
        array[index]=0;
        int secondMax=-1;
        for(int i =0;i<array.length;i++) {
        	if(secondMax<array[i]) {
        		secondMax=array[i];
        	}
        }
        max=max*secondMax;
        //System.out.println(max);
        return max;
	}
	static int[] mostAndLessFrequency(){
		int[] array = {1,5,4,9,3,2,4,5,1,6,3,5,4,1,5,8,3,5,4,6,9,7,4,5};
		int max = -1;
		int min = 99;
		int freq = 0;
		int maxindex = 0;
		int minindex = 0;
		int[] arrayIndexes= {0,0,0,0,0,0,0,0,0,0};
		int[] arrayFrequencies= {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0;i<array.length;i++) {
			if(arrayIndexes[array[i]]==0) {
				arrayIndexes[array[i]]=1;
				for(int j = 0;j<array.length;j++) {
					if(array[i]==array[j]) {
						freq++;
					}
				}
				arrayFrequencies[array[i]]=freq;
				freq=0;
				if(max<arrayFrequencies[array[i]]) {
	        		max=arrayFrequencies[array[i]];
	        		maxindex=array[i];
				}else if(min>arrayFrequencies[array[i]]) {
	        		min=arrayFrequencies[array[i]];
	        		minindex=array[i];
	        	}
			}else {
				continue;
			}
		}
//		System.out.println("Max Freuency Number :"+maxindex+ " No. of Occurances :"+max);
//		System.out.println("Min Freuency Number :"+minindex+ " No. of Occurances :"+min);
		int arr[]= {max,maxindex,min,minindex};
		return arr;
	}
}
