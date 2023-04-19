public interface Protection {                        // защита (инструмент защиты)
    boolean isIntact();

    int protection();

    int blockVariant();

    void safetyMarginReduce();
    
    int safetyMargin();
}