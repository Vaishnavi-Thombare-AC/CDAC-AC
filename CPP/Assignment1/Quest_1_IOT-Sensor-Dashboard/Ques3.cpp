#include <iostream>
using namespace std;

int main()
{
    double temp[3][3];

    // Input
    for(int floor = 0; floor < 3; floor++)
    {
        for(int room = 0; room < 3; room++)
        {
            cin >> temp[floor][room];
        }
    }

    // Display table
    cout << "Room1\tRoom2\tRoom3\n";

    for(int floor = 0; floor < 3; floor++)
    {
        cout << "Floor " << floor + 1 << "\t";

        for(int room = 0; room < 3; room++)
        {
            cout << temp[floor][room] << "\t";
        }

        cout << endl;
    }

    // Hottest room
    double hottest = temp[0][0];
    int hottestFloor = 0;
    int hottestRoom = 0;

    for(int floor = 0; floor < 3; floor++)
    {
        for(int room = 0; room < 3; room++)
        {
            if(temp[floor][room] > hottest)
            {
                hottest = temp[floor][room];
                hottestFloor = floor;
                hottestRoom = room;
            }
        }
    }

    cout << "Hottest Room : Floor "
         << hottestFloor + 1
         << ", Room "
         << hottestRoom + 1
         << " -> "
         << hottest << "C" << endl;

    // Hottest floor
    double highestAverage = 0;
    int hottestFloorAverage = 0;

    for(int floor = 0; floor < 3; floor++)
    {
        double sum = 0;

        for(int room = 0; room < 3; room++)
        {
            sum = sum + temp[floor][room];
        }

        double average = sum / 3;

        if(average > highestAverage)
        {
            highestAverage = average;
            hottestFloorAverage = floor;
        }
    }

    cout << "Hottest Floor : Floor "
         << hottestFloorAverage + 1
         << " (avg "
         << highestAverage
         << "C)" << endl;

    // WARNING count
    int warningCount = 0;

    for(int floor = 0; floor < 3; floor++)
    {
        for(int room = 0; room < 3; room++)
        {
            if(temp[floor][room] >= 30)
            {
                warningCount++;
            }
        }
    }

    cout << "Rooms at WARNING or above : "
         << warningCount << endl;

    return 0;
}