package ru.baydak.stage2;

//#include <bits/stdc++.h>
//using namespace std;
//
//        int numElements, windowSize;
//
//void process(){
//    cin >> numElements >> windowSize;
//    long long result = 0;
//    deque<pair<int, int>> dq;
//    vector<int> takenCount(numElements);
//    for (int i = 0; i < numElements; ++i) {
//        int value;
//        cin >> value;
//        while (!dq.empty() && dq.front().second <= i - windowSize) {
//            dq.pop_front();
//        }
//        while (!dq.empty() && dq.back().first >= value) {
//            dq.pop_back();
//        }
//        dq.push_back({value, i});
//        result += dq.front().first;
//        takenCount[dq.front().second]++;
//    }
//    cout << result << endl;
//    for (int i = 0; i < numElements; ++i) {
//        cout << takenCount[i] << " ";
//    }
//    cout << endl;
//}
//
//int main(){
//    ios::sync_with_stdio(NULL), cin.tie(0), cout.tie(0);
//    process();
//    return 0;
//}
