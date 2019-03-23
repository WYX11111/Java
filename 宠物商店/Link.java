public class Link {
    private class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }

        public void addaNode(Node newNode){
            if(this.next == null){
                this.next = newNode;
            } else {
                this.next.addaNode(newNode);
            }
        }

        public boolean containsNode(Object data){
            if(data.equals(this.data)){
                return true;
            } else {
                if(this.next != null){
                    return this.next.containsNode(data);
                } else {
                    return false;
                }
            }
        }

        public Object getNode(int index){
            if(Link.this.foot++ == index){
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, Object data){
            if(Link.this.foot++ == index){
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        public void removeNode(Node previous, Object data){
            if(data.equals(this.data)){
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        public void toArraryNode(){
            Link.this.retArray[Link.this.foot++] = this.data;
            if(this.next != null){
                this.next.toArraryNode();
            }
        }
    }
    //=============以上是内部类================

    private Node root;
    private int cout = 0;
    private int foot = 0;
    private Object[] retArray;

    public void add(Object data){
        if(data == null){
            return;
        }
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        } else {
            this.root.addaNode(newNode);
        }
        this.cout++;
    }

    public int size(){
        return this.cout;
    }

    public boolean isEmpty(){
        return this.cout == 0;
    }

    public boolean contains(Object data){
        if(data == null || this.root == null){
            return false;
        }
        return this.root.containsNode(data);
    }

    public Object get (int index){
        if(index > this.cout){
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    public void set(int index, Object data){
        if(index > this.cout){
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }

    public void remove(Object data){
        if(this.contains(data)){
            if(data.equals(this.root.data)){
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
            this.cout--;
        }
    }

    public Object[] toArray(){
        if(this.root == null){
            return null;
        }
        this.foot = 0;
        this.retArray = new Object[this.cout];
        this.root.toArraryNode();
        return this.retArray;
    }

    public void clear(){
        this.root = null;
        this.cout = 0;
    }
}
