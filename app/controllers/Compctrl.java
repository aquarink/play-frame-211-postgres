package controllers;

import java.util.*;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.*;
import views.html.*;
import models.*;

public class Compctrl extends Controller {
	
	public static Result companylist(int page, String sortBy, String order, String filter) {
        return ok(
        	companylist.render(
                Company.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
}
