public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return this.rightLink = item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return this.leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(this.value.hashCode() > item.value.hashCode()){
            return 1;
        } else if (this.value.hashCode() < item.value.hashCode()) {
            return -1;
        }else{
            return 0;
        }
    }
}
