public class ListMap implements Map {
    private ListMapEntry first;

    public ListMap() {
        this.first = null;
    }

    public void set(String key, String value) {
        ListMapEntry p = this.first;
        boolean isFound = false;

        while (p != null && !isFound) {
            if (p.getKey().equals(key)) {
                isFound = true;
            } else {
                p = p.getNext();
            }
        }

        if (isFound) {
            p.setValue(value);

        } else {
            if (this.first == null) {
                this.first = new ListMapEntry(key, value);

            } else {
                this.first = new ListMapEntry(key, value, this.first);
            }
        }
    }

    public String get(String key) {
        ListMapEntry p = this.first;
        String value = null;

        while (p != null && value == null) {
            if (p.getKey().equals(key)) {
                value = p.getValue();
            } else {
                p = p.getNext();
            }
        }

        return value;
    }

    public int size() {
        ListMapEntry p = this.first;
        int N = 0;

        while (p != null) {
            N++;
            p = p.getNext();
        }

        return N;
    }
}
