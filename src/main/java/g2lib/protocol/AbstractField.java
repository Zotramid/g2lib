package g2lib.protocol;

public class AbstractField {
    public final Enum<?> enum_;

    public <T extends Enum<T>> AbstractField(Enum<T> e) {
        this.enum_ = e;
    }

    public String name() {
        return String.format("%s.%s", enum_.getDeclaringClass().getSimpleName(), enum_.name());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SizedField && ((SizedField) obj).enum_ == enum_;
    }

    @Override
    public int hashCode() {
        return enum_.hashCode();
    }
}
