package NumberSix;

import java.util.List;

public class MySqlImpl implements CustomerRepository{
    @Override
    public List<String> findNames() {
        return List.of("Dora", "Kevin");
    }
}
