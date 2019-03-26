package workshop.sb.config.controller.service.implementation;

import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Service
public class GreetServiceSecondImplementation implements GreetService {

    @Override
    public String getMsg() {
        return MSG + " Second";
    }
}
