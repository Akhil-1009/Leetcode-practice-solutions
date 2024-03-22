/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    
public:
    ListNode *reverse(ListNode* head)
    {
        ListNode* curr=head;
        ListNode* prev=NULL;
        while(curr!=NULL)
        {
            ListNode* next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    bool isPalindrome(ListNode* head) {
        ListNode* fast=head->next;
        ListNode* slow=head;
        while(fast!=NULL&&fast->next!=NULL)
        {
            fast=fast->next->next;
            slow=slow->next;
        }
        ListNode* second=slow->next;
        slow->next=NULL;
        ListNode* newsecond=reverse(second);
        ListNode* temp1=head;
        ListNode* temp2=newsecond;
        bool ans=true;
        while(temp2!=NULL)
        {if(temp2->val!=temp1->val)
        {
            ans=false;
            break;
        }
         temp1=temp1->next;
         temp2=temp2->next;
            
        }
        second=reverse(newsecond);
        slow->next=second;
        return ans;
        
    }
};