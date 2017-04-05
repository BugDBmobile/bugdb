package BugDB.BugDBSystem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSeverity is a Querydsl query type for Severity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSeverity extends EntityPathBase<Severity> {

    private static final long serialVersionUID = -596296290L;

    public static final QSeverity severity = new QSeverity("severity");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QSeverity(String variable) {
        super(Severity.class, forVariable(variable));
    }

    public QSeverity(Path<? extends Severity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSeverity(PathMetadata metadata) {
        super(Severity.class, metadata);
    }

}

