#include <iostream>
using namespace std;

//creation of a class
class MyClass {       // The class
  public:             // Access specifier
    int myNum;        // Attribute (int variable)
    string myString;  // Attribute (string variable)
    void myMethod();   // Method/function declaration
};

// Method/function definition outside the class
void MyClass::myMethod() {
  cout << "Method in oop";
}

//The main program...
int main(int argc, char const *argv[])
{
    
    MyClass myObj;  // Create an object of MyClass

//Calling of the method
    myObj.myMethod();

  // Access attributes and set values
  myObj.myNum = 15; 
  myObj.myString = "chrisAfrotech";

  // Print attribute values
  cout << myObj.myNum << "\n";
  cout << myObj.myString << "\n";

    return 0;
}
