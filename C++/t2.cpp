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
	void printdata()
	{
		cout<<"ID: "<<id<<"\n";
		cout<<"Name: "<<nm;
	}
};
main()
{
	studinfo st;
	st.getdata();
	st.printdata();
} 
