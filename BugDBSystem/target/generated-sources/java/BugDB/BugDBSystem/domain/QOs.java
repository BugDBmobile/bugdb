package BugDB.BugDBSystem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOs is a Querydsl query type for Os
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOs extends EntityPathBase<Os> {

    private static final long serialVersionUID = -1980693179L;

    public static final QOs os = new QOs("os");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QOs(String variable) {
        super(Os.class, forVariable(variable));
    }

    public QOs(Path<? extends Os> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOs(PathMetadata metadata) {
        super(Os.class, metadata);
    }

}

