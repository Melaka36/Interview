#include <iostream>
#include <vector>
#include <algorithm>

long long MaxPairwiseProduct(const std::vector<int>& numbers) {
    int n = numbers.size();

    // Find the indices of the two largest elements
    int max_index1 = -1;
    for (int i = 0; i < n; ++i) {
        if ((max_index1 == -1) || (numbers[i] > numbers[max_index1])) {
            max_index1 = i;
        }
    }

    int max_index2 = -1;
    for (int j = 0; j < n; ++j) {
        if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2]))) {
            max_index2 = j;
        }
    }

    // Calculate and return the product
    return static_cast<long long>(numbers[max_index1]) * numbers[max_index2];
}

int main() {
    // Read the input size
    int n;
    std::cin >> n;

    // Read the array of integers
    std::vector<int> numbers(n);
    for (int i = 0; i < n; ++i) {
        std::cin >> numbers[i];
    }

    // Calculate and print the maximum pairwise product
    std::cout << MaxPairwiseProduct(numbers) << std::endl;

    return 0;
}
