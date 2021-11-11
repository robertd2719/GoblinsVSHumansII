package assets;

public class NonActor extends Asset{
    private String name;
    private int rowPosition;
    private int columnPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }
    public void setPosition(int row,int column){
        this.setColumnPosition(column);
        this.setRowPosition(row);
    }

    @Override
    public String toString() {
        return Character.toString(this.getName().charAt(0));
    }
}

