package states.data;

import org.springframework.stereotype.Component;
import states.model.State;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yeshua on 12/3/2017.
 */
@Component
public class StateRepository {

    private static final List<State> ALL_STATES = Arrays.asList(
            new State("Florida", 20000000, "Tallahassee", "english" ),
            new State("Illinois", 128000000, "Springfield", "english" ),
            new State("California", 39506094, "Sacramento", "english" ),
            new State("Newyork", 19743395, "Albany", "english" ),
            new State("Texas", 28295553	, "Austin   ", "english" )
    );

    public List<State> getAllStates(){
        return ALL_STATES;
    }

    public State findByName(final String name){
        return ALL_STATES.stream().filter(state -> state.getName().equals(name)).findFirst().get();
    }
}
