package $package;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class MyController {

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public @ResponseBody String test() {
		return "Hello!";
	}
}
