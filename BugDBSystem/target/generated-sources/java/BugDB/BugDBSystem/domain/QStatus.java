package BugDB.BugDBSystem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStatus is a Querydsl query type for Status
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStatus extends EntityPathBase<Status> {

    private static final long serialVersionUID = 2059546323L;

    public static final QStatus status = new QStatus("status");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QStatus(String variable) {
        super(Status.class, forVariable(variable));
    }

    public QStatus(Path<? extends Status> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStatus(PathMetadata metadata) {
        super(Status.class, metadata);
    }

}

