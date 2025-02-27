#include<iostream>
using namespace std;
void stddata(int id,string nm)
{
	cout<<"Id : "<<id;
	cout<<"\nNAME : "<<nm<<"\n";

}
main()
{
	int stdid,n;
	string stdnm;
	cout<<"student number";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cout<<"Enter student id: ";
		cin>>stdid;
		cout<<"\nEnter student name: "<<"\n";
		cin>>stdnm;
		stddata(stdid,stdnm);
	}
}
