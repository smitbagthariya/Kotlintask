#include<iostream>
using namespace std;
class calculator
{
	public:
	
	int a,b;
	void printdata()
	{
		cout<<"Enter a: ";
		cin>>a;
		cout<<"Enter b: ";
		cin>>b;
	}
	void getdata(int a,int b)
	{
		cout<<"\nSum: "<<a+b;
		cout<<"\nSub: "<<a-b;
		cout<<"\nMul:"<<a*b;
	}

	void getdata(char a,char b)
	{
		cout<<"\nDiv: "<<a/b;
	}
};
main()
{
	calculator c1;
	c1.printdata();
	c1.getdata(c1.a,c1.b);
	c1.getdata('a','b');	
}
