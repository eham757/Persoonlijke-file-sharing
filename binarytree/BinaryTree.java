package nl.hhs.dsal.week7.binarytree;

/**
 *
 * @author remcoruijsenaars
 */
public class BinaryTree {
    
    private Node root;


    public BinaryTree(Node node){
        root = node;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }





    /**
     * Opgave 2 ()
     * @return true waneer de boom een zoekboom is, false indien dit niet het geval is.
     *
     * Een binaire boom is een zoekboom indien voor alle knopen geldt dat de data nodes van alle kinderen in de linkersubboom
     * kleiner zijn en dat de data nodes van alle kinderen in de rechtersubboom groter zijn.
     */
    public boolean isSearchTree(){
        return isSearchTree(root);
    }

    private boolean isSearchTree(Node node){
        if(node.oneChild()){
            if(node.getLeft() != null){
                return node.getLeft().isLeaf();
            }else{
                return node.getRight().isLeaf();
            }
        }else if(node.isLeaf()){
            return true;
        }else{
            if(isSearchTree(node.getLeft())){
                return isSearchTree(node.getRight());
                  
            }else{
                return false;
            }
        }
    }

}
