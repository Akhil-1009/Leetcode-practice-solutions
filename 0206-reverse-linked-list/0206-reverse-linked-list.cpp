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
    pair<ListNode*,ListNode*> helper(ListNode* head)
    {
        if(head==NULL)
        {
            pair<ListNode*,ListNode*> temp;
            temp.first=NULL;
            temp.second=NULL;
            return temp;
        }
        if(head->next==NULL)
        {
            pair<ListNode*,ListNode*> temp;
            temp.first=head;
            temp.second=head;
            return temp;
        }
        pair<ListNode*,ListNode*> ans=helper(head->next);
        pair<ListNode*,ListNode*> finalans;
        ListNode* tail=ans.second;
        tail->next=head;
        head->next=NULL;
        finalans.first=ans.first;
        finalans.second=head;
        return finalans;
        
    }
    ListNode* reverseList(ListNode* head) {
        return helper(head).first;
//         ListNode* current=head;
//         ListNode* prev=NULL;
//         while(current!=NULL)
//         {
//             ListNode* next=current->next;
//             current->next=prev;
//             prev=current;
//             current=next;
            
//         }
//         head=prev;
//         return head;
    }
};