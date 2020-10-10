#include <iostream>
using namespace std;

//Compiler version g++ 6.3.0
class Array{
  int arr[100]={0},brr[100]={0},size,k=0;
  public:
    void accept();
    void set();
    void get();
    void sum();
};
void Array::accept(){
  cout<<"Enter size of array : ";
  cin>>size;
  cout<<"Enter the number for concatenation : ";
  cin>>k;
  cout<<"Enter the elements of array : ";
  for(int j=0;j<size;j++)
    {
    
      cin>>arr[j];
     
    }
}
void Array::set(){
  int i=0;
  while(i<size*k)
  {
    for(int j=0;j<size;j++)
    {
      brr[i]=arr[j];
      i++;
    }
  }
}
void Array::get(){
 
    for(int j=0;j<size*k;j++)
    {
     cout<< brr[j]<<" ";   
  }
}
void Array::sum(){
  int i=0,sum=0,max=0;
  max=arr[0];
  for(int i=0;i<size*k;i++)
  {
    sum=brr[i];
    for(int j=i+1;j<size*k;j++)
    {
     sum+=brr[j];
       if(sum>max)
        { max=sum;
          cout<<endl<<max<<endl;}
    }
  }
  cout<<"\nsum of subarray : "<<max;
  
}
int main()
{
    
    Array obj;
    obj.accept();
    obj.set();
    obj.get();
    obj.sum();
}
