public class Link {
    private class Node{
        private Book data;
        private Node next;

        public Node(Book data){
            this.data = data;
        }

        public void addNode(Node newNode){
            if(this.next == null){
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        public boolean containsNode(Book data){
            if(data.compare(this.data)) {
                return true;
            } else {
                if (this.next != null){
                    return this.next.containsNode(data);
                } else{
                    return false;
                }
            }
        }

        public Book getNode(int index){
            if(Link.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, Book data){
            if(Link.this.foot++ == index){
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        public void removeNode(Node previous, Book data){
            if(data.compare(this.data)){
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        public void toArrayNode(){
            Link.this.retArray[Link.this.foot++] = this.data;
            if(this.next != null){
                this.next.toArrayNode();
            }
        }
    }

    //===============以上为内部类=================
    private Node root;
    private int count = 0;
    private int foot = 0;
    private Book[] retArray;

    public void add(Book data){
        if(data == null){
            return;
        }
        Node newNode = new Node(data);

        if(this.root == null){
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return this.count == 0;
    }

    public boolean contains(Book data){
        if(data == null || this.root == null){
            return false;
        }
        return this.root.containsNode(data);
    }

    public Book get(int index){
        if(index > this.count - 1){
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    public void set(int index, Book data){
        if(index > this.count - 1){
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }

    public void remove(Book data){
        if(this.contains(data)){
            if(data.compare(this.root.data)){
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
            this.count--;
        }
    }

    public Book[] toArray(){
        if(this.root == null)
            return null;
        this.foot = 0;
        this.retArray = new Book[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    public void clear(){
        this.root = null;
        this.count = 0;
    }
}
