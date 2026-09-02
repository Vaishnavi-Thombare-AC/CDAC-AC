#include <iostream>
#include <string>
using namespace std;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:

    Product()
    {
        productId = 0;
        name = "";
        price = 0;
        quantity = 0;
    }

    Product(int id, string n, double p, int q)
    {
        productId = id;
        name = n;
        price = p;
        quantity = q;
    }

    void acceptDetails()
    {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails() const
    {
        cout << productId << "\t"
             << name << "\t\t"
             << price << "\t"
             << quantity << "\t"
             << totalValue();

        if(quantity < 10)
        {
            cout << "\tLOW STOCK";
        }

        cout << endl;
    }

    double totalValue() const
    {
        return price * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }

    string getName() const
    {
        return name;
    }
};


// Function overloading part B

double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate)
{
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}



double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * discountPercent / 100);
}


int main()
{
    Product products[5];

    for(int i = 0; i < 5; i++)
    {
        cout << "\nProduct " << i + 1 << endl;
        products[i].acceptDetails();
    }

    cout << "\n==== INVENTORY REPORT =====" << endl;

    cout << "ID\tName\t\tPrice\tQty\tTotal Value" << endl;

    for(int i = 0; i < 5; i++)
    {
        products[i].displayDetails();
    }



    int highest = 0;

    for(int i = 1; i < 5; i++)
    {
        if(products[i].totalValue() > products[highest].totalValue())
        {
            highest = i;
        }
    }

    cout << "\nHighest Value Product : "
         << products[highest].getName()
         << " (Rs. "
         << products[highest].totalValue()
         << ")" << endl;

    int threshold;

    cout << "\nEnter low stock threshold: ";
    cin >> threshold;

    cout << "Low Stock (threshold: "
         << threshold << ") : ";

    for(int i = 0; i < 5; i++)
    {
        if(products[i].isLowStock(threshold))
        {
            cout << products[i].getName() << " ";
        }
    }

    cout << endl;



    cout << "\n===== REORDER COST =====" << endl;

    cout << "Integer quantity : "<< reorderCost(10, 50.0)<< endl;

    cout << "Double quantity  : "<< reorderCost(10.5, 50.0)<< endl;

    cout << "With tax         : "<< reorderCost(10, 50.0, 18.0)<< endl;



    cout << "\n===== DISCOUNT =====" << endl;

    cout << "Default discount : "<< applyDiscount(1000)<< endl;

    cout << "20% discount     : "<< applyDiscount(1000, 20.0)<< endl;

    return 0;
}