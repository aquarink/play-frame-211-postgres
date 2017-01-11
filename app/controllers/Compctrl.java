package controllers;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import play.libs.Json;
import play.mvc.*;
import play.api.libs.ws.WS;
import play.data.*;
import static play.data.Form.*;
import views.html.*;
import models.*;
import play.libs.F.Function;
import play.libs.F.Promise;

public class Compctrl extends Controller {
	
	public static Result GO_HOMES = redirect(
	        routes.Compctrl.companysingle(0, "title", "asc", "")
	 );
	
	public static Result companylist(int page, String sortBy, String order, String filter) {
		
		// Singular
			
			String DataJson = Jsonctrl.httpConnection("", "http://localhost/json-list.html"); // string
			
			Jsondatalist jsondatalist = new Jsondatalist();
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			try {  
				jsondatalist = objectMapper.readValue(DataJson, Jsondatalist.class);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ok(
	        		companylist.render(
	        				jsondatalist,
	                sortBy, order, filter
	            )
	        );
	    }
	
	
	public static Result companysingle(int page, String sortBy, String order, String filter) {
	
	// Singular
		
		String DataJson = Jsonctrl.httpConnection("", "http://localhost/json-single.html"); // string
		
		DataJson jsondatasingle = new DataJson();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {  
			jsondatasingle = objectMapper.readValue(DataJson, DataJson.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ok(
        		companysingle.render(
        				jsondatasingle,
                sortBy, order, filter
            )
        );
    }
	
	public static Result companyedit(Long id) {
        Form<Company> companyFrm = form(Company.class).fill(
            Company.find.byId(id)
        );
        return ok(
            companyedit.render(id, companyFrm)
        );
    }
	
	public static Result companyupdate(Long id) {
        Form<Company> companyFrm = form(Company.class).bindFromRequest();
        if(companyFrm.hasErrors()) {
            return badRequest(companyedit.render(id, companyFrm));
        }
        companyFrm.get().update(id);
        flash("success", "Computer " + companyFrm.get().name + " has been updated");
        return GO_HOMES;
    }
	
	public static Result companycreate() {
        Form<Company> companyFrm = form(Company.class);
        return ok(
            companycreate.render(companyFrm)
        );
    }
	
	public static Result companysave() {
        Form<Company> companyFrm = form(Company.class).bindFromRequest();
        if(companyFrm.hasErrors()) {
            return badRequest(companycreate.render(companyFrm));
        }
        companyFrm.get().save();
        flash("success", "Company " + companyFrm.get().name + " has been created");
        return GO_HOMES;
    }
	
	public static Result companydelete(Long id) {
        Company.find.ref(id).delete();
        flash("success", "Company has been deleted");
        return GO_HOMES;
    }
	
	
}
