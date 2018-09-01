package me.cwuyi;

import me.cwuyi.util.ListNode;

public class RemoveLinkedListElements {

    /**
     * Leetcode 203
     *
     * 如果这个值不等于val就留下，否则跳过，注意处理edge case
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode last = null, ret = null;

        while (head != null) {
            if (head.val != val) {

                if (last != null) {
                    last.next = head;
                }

                last = head;

                if (ret == null) {
                    ret = last;
                }

            } else {
                if (last != null) {
                    last.next = null;
                }
            }
            head = head.next;
        }

        return ret;
    }
}
