public class Tree {
    double heightFt;
    double treeDiameterInches;
    TreeType treeType;

    void grow(){
        this.heightFt = this.heightFt+10;
        this.treeDiameterInches = this.treeDiameterInches+1;
    }
}