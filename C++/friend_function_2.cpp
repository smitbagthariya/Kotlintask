#include<iostream>
using namespace std;
class parent
{
	private:
	int id;
	string name;
	
	friend void getdata(parent& p);	
};
class child:public perent
{	
	public:
	void getdata(parent& p)
	{
		cout<<"Enter an id: ";
		cin>>id;
		cout<<"Enter an name: ";
		cin>>name;
	}
};
void getdata(parent& p)
{
	cout<<"ID: "<<p.id;
	cout<<"NAME: "<<p.name;
}
main()
{
	parent p1;
	getdata(p1);
}
