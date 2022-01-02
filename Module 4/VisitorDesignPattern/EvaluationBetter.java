public class Evaluation implements Visitor {
    @Override
    public int visit(Add visitable) {
        int l; int r;
        l = visitable.getLeft().accept(this);
        r = visitable.getRight().accept(this);
        return r+l;
    }

    @Override
    public int visit(Mult visitable) {
        int l; int r;
        l = visitable.getLeft().accept(this);
        r = visitable.getRight().accept(this);
        return r*l;
    }

    @Override
    public int visit(Div visitable) {
        int l; int r;
        l = visitable.getLeft().accept(this);
        r = visitable.getRight().accept(this);
        try{
            return l/r;
        }
        catch (Exception e){
            throw new IllegalArgumentException("Division by zero");
        }
    }

    @Override
    public int visit(Sub visitable) {
        int l; int r;
        l = visitable.getLeft().accept(this);
        r = visitable.getRight().accept(this);
        return l-r;
    }

    @Override
    public int visit(Leaf visitable) {
        return visitable.getValue();
    }
}
