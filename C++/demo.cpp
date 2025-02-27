#include<iostream>
using namespace std;
class student
{
	public:
	FILE *fl;
	int id,i;
	int n;
	char name[10];

	
	void getdata()
	{
		fl=fopen("demo.txt","w");
		
		fl=fopen("demo.txt","w");
		
		cout<<"Enter number of student: ";
		cin>>n;
		
		for(i=0;i<=n;i++)
		{
			cout<<"Enter student id : ";
			cin>>id;
			cout<<"Enter student name : ";
			cin>>name;
		}
	}
	
	void display()
	{
		fprintf(fl,"ID:%d",id);
		fprintf(fl,"NAME: %s",name);
	}
};
main()
{
	student s1;
	s1.getdata();
	s1.display();
}
