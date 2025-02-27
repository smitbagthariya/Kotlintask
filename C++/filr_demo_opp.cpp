#include<iostream>
#include<fstream>
using namespace std;
main()
{
	fstream file("text.txt",ios::app);
	int id;
	string name;
	int n,i;
	
	cout<<"Enter number of student: ";
	cin>>n;
		
	for(i=0;i<=n;i++)
	{
		cout<<"Enter student id : ";
		cin>>id;
		cout<<"Enter student name : ";
		cin>>name;
	}
	while(getline(file,name))
	{
		cout<<name<<"\n";
	}
	
	
}
