package kata6;

import java.util.List;
public class HistogramBuilder<T> {
    private final List<T> items;

    public HistogramBuilder(List<T> items) {
        this.items = items;
    }
    
    public <A> Histogram<A> build(Attribute<T, A> attribute) {
        Histogram<A> histogram = new Histogram<>();
        for (T item : items) {
            A value = attribute.get(item);
            histogram.increment(value);
        }
        return histogram;
    }
}

