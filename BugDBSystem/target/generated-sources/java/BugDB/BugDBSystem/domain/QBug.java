package BugDB.BugDBSystem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBug is a Querydsl query type for Bug
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBug extends EntityPathBase<Bug> {

    private static final long serialVersionUID = -1271958733L;

    public static final QBug bug = new QBug("bug");

    public final NumberPath<Integer> assigned = createNumber("assigned", Integer.class);

    public final NumberPath<Integer> bugNo = createNumber("bugNo", Integer.class);

    public final StringPath bugType = createString("bugType");

    public final NumberPath<Integer> componentId = createNumber("componentId", Integer.class);

    public final StringPath customer = createString("customer");

    public final DateTimePath<java.sql.Timestamp> filed = createDateTime("filed", java.sql.Timestamp.class);

    public final NumberPath<Integer> filedBy = createNumber("filedBy", Integer.class);

    public final NumberPath<Integer> fixedBy = createNumber("fixedBy", Integer.class);

    public final StringPath fixedVer = createString("fixedVer");

    public final NumberPath<Integer> osId = createNumber("osId", Integer.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final NumberPath<Integer> severityId = createNumber("severityId", Integer.class);

    public final NumberPath<Integer> statusId = createNumber("statusId", Integer.class);

    public final StringPath subject = createString("subject");

    public final StringPath tags = createString("tags");

    public QBug(String variable) {
        super(Bug.class, forVariable(variable));
    }

    public QBug(Path<? extends Bug> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBug(PathMetadata metadata) {
        super(Bug.class, metadata);
    }

}

