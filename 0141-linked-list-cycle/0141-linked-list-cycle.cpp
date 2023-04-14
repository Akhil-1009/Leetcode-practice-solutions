/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
#include<unordered_map>
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if(head==NULL)
        {
            return false;
        }
       ListNode* slow=head;
        ListNode* fast=head->next;
        while(fast!=NULL&&fast->next!=NULL)
        {
            if(fast==slow)
            {
                return true;
            }
            slow=slow->next;
            fast=fast->next->next;
        }
        return false;
        
        // unordered_map<ListNode*,bool> visited;
        
        // ListNode* temp=head;
        // while(temp!=NULL)
        // { if(visited.find(temp)!=visited.end())
        // {
        //     return true;
        // }
        //  visited[temp]=true; 
        //  temp=temp->next;
        // }
        // return false;
        
    }
};