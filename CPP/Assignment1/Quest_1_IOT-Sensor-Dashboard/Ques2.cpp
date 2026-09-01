
#include <iostream>
using namespace std;

int main() {
//step1
	int N;
	cout<<"Readings entered :";
	cin>>N;

	double readings[100];
	for(int i = 0;i < N;i++)
	{
		cin>>readings[i];
	}

	//step2
	int skip = 0;
	cout<<"\n Valid readings";
	for(int i = 0;i <N;i++)
	{
		if(readings[i] < 0)
		{
			skip++;
			continue;
		}
		cout<<readings[i]<<"\t";
	}
	cout<<"\nSkipped (errors) :"<<skip <<endl;

	//step3
	for(int i = 1;i <=N;i++)
		{
			if(readings[i] >= 45)
			{
				cout<<"First CRITICAL   : Index "<<i+1 << " → "<<readings[i]<<"C"<<endl;
				break;
			}
		}
//step 4
	double min = 99;
	double max =0;
	double sum = 0;
	int valid = 0;
	for(int i = 0;i <N;i++)
		{
			if(readings[i]< 0)
			{
				continue;
			}
			if(readings[i] < min)
			{
				min = readings[i];

			}

			if(readings[i] > max)
			{
				max=readings[i];
			}
			sum+=readings[i];
			valid++;
		}
	double avg = sum/valid;

	cout<<"min  "<<min<<"C"<<endl;
	cout<<"Max  "<<max<<"C"<<endl;
	cout <<"valid "<<valid<<endl;
	cout <<"Avg "<<avg<<"C"<<endl;

//step 5

	int normal=0;
	     int warning =0;
	     int critical = 0;
	     int shutdown = 0;
	     for (int i=0;i<N;i++){
	        if (readings[i]>0 && readings[i]<=29){
	            normal +=1;
	        }
	        if (readings[i]>29 && readings[i]<=44){
	            warning +=1;
	        }
	        if (readings[i]>44 && readings[i]<=59){
	            critical +=1;
	        }
	        if (readings[i]>=065){
	            shutdown +=1;
	        }
	     }

	cout<< "no of normal : " << normal << endl;
	cout<< "no of warning : " << warning << endl;
	cout<< "no of critical : " << critical << endl;
	cout<< "no of shutdown : " << shutdown <<endl;


	return 0;
}
