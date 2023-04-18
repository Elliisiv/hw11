package MixStreemElements_5;

class IndexedValue<T> implements Comparable<IndexedValue<T>> {
    final int index;
    final long insertionOrder;
    final T value;

    public IndexedValue(int index, long insertionOrder, T value) {
        this.index = index;
        this.insertionOrder = insertionOrder;
        this.value = value;
    }

    @Override
    public int compareTo(IndexedValue<T> other) {
        int result = Integer.compare(index, other.index);
        if (result != 0) {
            return result;
        }
        return Long.compare(insertionOrder, other.insertionOrder);
    }
}