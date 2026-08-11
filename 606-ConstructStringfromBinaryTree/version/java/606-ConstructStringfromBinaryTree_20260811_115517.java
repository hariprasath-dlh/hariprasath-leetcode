// Last updated: 11/08/2026, 11:55:17
1class Solution {
2    StringBuilder sb;
3    private void doEv(TreeNode root){
4        if(root == null)return;
5        if(root.left == null && root.right==null){
6            sb.append(root.val);
7            return;
8        }
9        sb.append(root.val);
10        sb.append('(');
11        doEv(root.left);
12        sb.append(')');
13        if(root.right!=null){
14        sb.append('(');
15        doEv(root.right);
16        sb.append(')');
17        }
18        return;
19    }
20    public String tree2str(TreeNode t) {
21        sb = new StringBuilder();
22        doEv(t);
23        return sb.toString();
24    }
25}