#include<iostream>
using namespace std;

class student
{
    public:
    string name;
    int roll_n0;
    char section;
    void print()
    {
        cout<<name<<endl;
        cout<<roll_n0<<endl;
        cout<<section<<endl;
    }
};
int main()
{
    student s1;
    s1.name="raja";
    s1.roll_n0=2820070;
    s1.section='c';
    s1.print();
    return 0;
}