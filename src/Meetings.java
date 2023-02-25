public class Meetings extends Tasks {
    private boolean offline;


    /**
     * @param offline булевая переменная: оффлайн / онлайн
     */
    public Meetings(String name, String date, double duration, boolean personal, boolean priority, Employee responsible, boolean offline) {
        super(name, date, duration, personal, priority, responsible);
        this.offline = offline;
    }

    @Override
    public String toString() {
        return super.toString() + ", оффлайн встреча: " + offline;
    }

    public boolean getOffline(){
        return offline;
    }

    public void setOffline(boolean offlineSet){
        this.offline = offlineSet;
    }


}
