public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
