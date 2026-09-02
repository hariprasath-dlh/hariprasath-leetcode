// Last updated: 02/09/2026, 09:18:40
1class Solution {
2    public Node copyRandomList(Node head) {
3        if(head == null) return null;
4        HashMap<Node, Node> map = new HashMap<>();
5        Node cur = head;
6        while(cur != null) {
7            map.put(cur, new Node(cur.val));
8            cur = cur.next;
9        }
10        cur = head;
11        while(cur != null) {
12            map.get(cur).next = map.get(cur.next);
13            map.get(cur).random = map.get(cur.random);
14            cur = cur.next;
15        }
16        return map.get(head);
17    }
18}