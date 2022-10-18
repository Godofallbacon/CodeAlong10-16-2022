package NumberSix;

import java.util.List;

public class PostgreSqlImpl implements CustomerRepository{
    @Override
    public List<String> findNames() {
        return List.of("Dora", "Kevin");
    }
}
