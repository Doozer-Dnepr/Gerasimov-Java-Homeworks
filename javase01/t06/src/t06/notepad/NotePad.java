package t06.notepad;

public class NotePad {
    private String [] notePad;

    public String getNote(int index) {
        return notePad[index];
    }
    public String [] getData() {
        return notePad;
    }
    public int getNumberOfNotes() {
        return notePad.length;
    }
    public void setNote(int index, String value) {
        notePad[index] = value;
    }
    public void setData(String [] notes) {
        notePad = new String [notes.length];
        System.arraycopy(notes, 0, notePad, 0, notes.length);
    }
    public void deleteNote(int index) {
        String [] notePadNew = new String [notePad.length-1];
        System.arraycopy(notePad, index-1, notePadNew, index, notePad.length-2);
        setData(notePadNew);
    }
    public void insertNote(int index, String value) {
        String [] notePadNew = new String [notePad.length+1];
        System.arraycopy(notePad, 0, notePadNew, 0, index-1);
        notePadNew[index-1] = value;
        System.arraycopy(notePad, index, notePadNew, index-1, notePad.length-index+1);
        setData(notePadNew);
    }
}
