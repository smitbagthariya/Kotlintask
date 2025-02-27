#include<iostream>
using namespace std;
class a
{
	public:
		int a;
		void adata()
		{
			cout<<"Enter value of a: ";
			cin>>a;
		}
};
class b : public a
{
	public:
		int b;
		void bdata()
		{
			cout<<"Enter value of b: ";
			cin>>b;
		}
};
class sum : public b
{
	int sum,sub,mul;
	float div;
	public:
	void adddata()
	{
	sum =a+b;
	cout<<"Sum: "<<sum<<"\n";
	}
	void subdata()
	{
	sub=a-b;
	cout<<"Sub: "<<sub<<"\n";
	}
	void muldata()
	{
	mul=a*b;
	cout<<"Mul: "<<mul<<"\n";
	}
	void divdata()
	{
	div=a/b;
	cout<<"Div: "<<div;
	}
};
main()
{
	sum s1;
	s1.adata();
	s1.bdata();
	s1.adddata();
	s1.subdata();
	s1.muldata();
	s1.divdata();
}
