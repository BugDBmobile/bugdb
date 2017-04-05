package BugDB.BugDBSystem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QComponent is a Querydsl query type for Component
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QComponent extends EntityPathBase<Component> {

    private static final long serialVersionUID = -1287895428L;

    public static final QComponent component = new QComponent("component");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QComponent(String variable) {
        super(Component.class, forVariable(variable));
    }

    public QComponent(Path<? extends Component> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComponent(PathMetadata metadata) {
        super(Component.class, metadata);
    }

}

