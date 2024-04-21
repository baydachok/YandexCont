//package ru.baydak.stage2;
//import javafx.util.Pair;
//public class Task1 {
//    #include <iostream>
//#include <map>
//#include <vector>
//    using namespace std;
//
//    map<pair<int, int>, int> points;
//
//    bool hasConsecutive(vector<int>& sequence) {
//        int onesCount = 0;
//        for (int value : sequence) {
//            if (value == 1) {
//                onesCount++;
//            }
//            else {
//                onesCount = 0;
//            }
//            if (onesCount == 5) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    bool checkLines(int posX, int posY) {
//        vector<int> horizontal, vertical, diagonal1, diagonal2;
//        for (int i = -4; i <= 4; ++i) {
//            if (points.count({ posX, posY + i }) && points[{posX, posY + i}] == points[{posX, posY}]) {
//                horizontal.push_back(1);
//            }
//            else {
//                horizontal.push_back(0);
//            }
//            if (points.count({ posX + i, posY }) && points[{posX + i, posY}] == points[{posX, posY}]) {
//                vertical.push_back(1);
//            }
//            else {
//                vertical.push_back(0);
//            }
//            if (points.count({ posX + i, posY + i }) && points[{posX + i, posY + i}] == points[{posX, posY}]) {
//                diagonal1.push_back(1);
//            }
//            else {
//                diagonal1.push_back(0);
//            }
//
//            if (points.count({ posX - i, posY + i }) && points[{posX - i, posY + i}] == points[{posX, posY}]) {
//                diagonal2.push_back(1);
//            }
//            else {
//                diagonal2.push_back(0);
//            }
//        }
//        if (hasConsecutive(horizontal) || hasConsecutive(vertical) || hasConsecutive(diagonal1) || hasConsecutive(diagonal2)) {
//            return true;
//        }
//        else {
//            return false;
//        }
//
//    }
//
//    void solve() {
//        int n;
//        cin >> n;
//        for (int i = 0; i < n; ++i) {
//            int posX, posY;
//            cin >> posX >> posY;
//            points[{posX, posY}] = (i % 2);
//
//            if (checkLines(posX, posY) && i == n - 1) {
//                if (i % 2 == 0) {
//                    cout << "First" << endl;
//                    return;
//                }
//                else {
//                    cout << "Second" << endl;
//                    return;
//                }
//            }
//            else if (checkLines(posX, posY)) {
//                cout << "Inattention" << endl;
//                return;
//            }
//        }
//        cout << "Draw" << endl;
//    }
//
//    int main() {
//        ios::sync_with_stdio(NULL), cin.tie(0), cout.tie(0);
//        solve();
//        return 0;
//    }
//
//}
