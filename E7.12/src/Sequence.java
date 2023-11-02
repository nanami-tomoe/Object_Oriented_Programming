public class Sequence {
    private int[] values;

    public Sequence(int size) {
        values = new int[size];
    }

    public void set(int i, int n) {
        values[i] = n;
    }

    public int get(int i) {
        return values[i];
    }

    public int size() {
        return values.length;
    }

    public boolean equals(Sequence other) {
        // 배열 크기 비교
        if (this.size() != other.size()) {
            return false;
        }

        // 모든 요소 비교
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) != other.get(i)) {
                return false;
            }
        }

        return true;
    }
}
