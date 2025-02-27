#include<iostream>
using namespace std;
class studinfo
{
	public:
	int id;
	string nm;
	void getdata()
	{
		cout<<"Enter an ID: ";
		cin>>id;
		cout<<"Enter an name: ";
		cin>>nm;	
	}
};
class result :public studinfo
{	
	public:
	void printdata()
	{	
		cout<<"ID: "<<id<<"\n";
		cout<<"Name: "<<nm;
	}
};
main()
{
	result rs;
	rs.getdata();
	rs.printdata();
} 
