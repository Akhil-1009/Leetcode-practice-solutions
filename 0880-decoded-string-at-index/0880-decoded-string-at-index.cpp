 class Solution {
public:
    std::string decodeAtIndex(string s, int k) {
        long long length_of_decoded_string = 0;
        int i = 0;
        
        while (length_of_decoded_string < k) {
            if (isdigit(s[i])) {
                length_of_decoded_string *= s[i] - '0';
            } else {
                length_of_decoded_string++;
            }
            i++;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            if (isdigit(s[j])) {
                length_of_decoded_string /= s[j] - '0';
                k %= length_of_decoded_string;
            } else {
                if (k == 0 || k == length_of_decoded_string) {
                    return std::string(1, s[j]);  // Convert char to std::string
                }
                length_of_decoded_string--;
            }
        }
        
        return ""; // Default return, should never reach here given problem constraints
    }
};