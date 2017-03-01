package io.fharenheit.hibernate;

/**
 * Represents the the understood types or styles of formatting.
 *
 * @author Steve Ebersole
 */
public enum FormatStyle {

    BASIC("basic", new BasicFormatterImpl()),
    DDL("ddl", new DDLFormatterImpl()),
    NONE("none", new NoFormatImpl());

    private final String name;
    private final Formatter formatter;

    private FormatStyle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public String getName() {
        return name;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    private static class NoFormatImpl implements Formatter {
        public String format(String source) {
            return source;
        }
    }

}