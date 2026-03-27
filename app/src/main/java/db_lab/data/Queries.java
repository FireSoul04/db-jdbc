package db_lab.data;

public final class Queries {

    public static final String TAGS_FOR_PRODUCT =
        """
            select tag_name
            from tagged
            where product_code = ?
        """;

    public static final String LIST_PRODUCTS =
        """
            select code, name
            from product
        """;

    public static final String PRODUCT_COMPOSITION =
        """
            select code, description, percent
            from composition c, material m
            where c.product_code = ?
            and m.code = c.material_code
        """;

    public static final String FIND_PRODUCT =
        """
            select code, name, description
            from product
            where code = ?
        """;
}
