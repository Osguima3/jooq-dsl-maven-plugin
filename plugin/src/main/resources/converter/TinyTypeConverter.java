import org.osguima3.jooqdsl.model.converter.Converter;

import javax.annotation.Generated;
import java.util.function.Function;

/**
 * This class is generated by jOOQ DSL.
 */
@Generated(
    value = "https://github.com/Osguima3/jooq-dsl-maven-plugin",
    comments = "This class is generated by jOOQ DSL"
)
public class TinyTypeConverter<T, U, V> implements org.jooq.Converter<T, V> {

    private org.jooq.Converter<T, U> converter;

    private Function<U, V> fromTinyType;

    private Function<V, U> toTinyType;

    private Class<T> fromType;

    private Class<V> toType;

    public TinyTypeConverter(
            Converter<T, U> converter, Function<U, V> fromTinyType, Function<V, U> toTinyType,
            Class<T> fromType, Class<V> toType) {
        this(new SimpleConverter<T, U>(converter, fromType, null), fromTinyType, toTinyType, fromType, toType);
    }

    public TinyTypeConverter(
            org.jooq.Converter<T, U> converter, Function<U, V> fromTinyType, Function<V, U> toTinyType,
            Class<T> fromType, Class<V> toType) {
        this.converter = converter;
        this.fromTinyType = fromTinyType;
        this.toTinyType = toTinyType;
        this.fromType = fromType;
        this.toType = toType;
    }

    @Override
    public V from(T databaseObject) {
        return databaseObject == null ? null : fromTinyType.apply(converter.from(databaseObject));
    }

    @Override
    public T to(V userObject) {
        return userObject == null ? null : converter.to(toTinyType.apply(userObject));
    }

    @Override
    public Class<T> fromType() {
        return fromType;
    }

    @Override
    public Class<V> toType() {
        return toType;
    }
}
