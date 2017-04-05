package BugDB.BugDBSystem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUpdates is a Querydsl query type for Updates
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUpdates extends EntityPathBase<Updates> {

    private static final long serialVersionUID = 1084120585L;

    public static final QUpdates updates = new QUpdates("updates");

    public final NumberPath<Integer> bugId = createNumber("bugId", Integer.class);

    public final StringPath chg = createString("chg");

    public final StringPath comments = createString("comments");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.sql.Timestamp> time = createDateTime("time", java.sql.Timestamp.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QUpdates(String variable) {
        super(Updates.class, forVariable(variable));
    }

    public QUpdates(Path<? extends Updates> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUpdates(PathMetadata metadata) {
        super(Updates.class, metadata);
    }

}

