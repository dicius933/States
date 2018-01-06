package states.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import states.data.StateRepository;
import states.model.State;

import java.util.List;

/**
 * Created by yeshua on 11/29/2017.
 */
@Controller
public class StateController {
    @Autowired
    private StateRepository stateRepository;

    @RequestMapping(value = "/")
    public String listStates(Model model){
        List<State> allStates = stateRepository.getAllStates();
        model.addAttribute("states", allStates);
        return "home";
    }

    @RequestMapping(value = "/state/{name}")
    public String stateDetails(@PathVariable String name, Model model){
        State state = stateRepository.findByName(name);
        model.addAttribute("state", state);
        return "state-details";
    }

}
