public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren={"Rechteck,27,5,167,60", "Kreis,20,70,270"};
    private int currentFigur = 0;

    @Override
    public String[] readNextFigurData() {
        if(currentFigur < testFiguren.length){
            String[] figurData = testFiguren[currentFigur].split(",");
            currentFigur++;
            return figurData;
        }
        return null;
    }
}
