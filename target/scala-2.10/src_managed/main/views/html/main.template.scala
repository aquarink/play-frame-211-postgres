
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*9.70*/routes/*9.76*/.Assets.at("stylesheets/jquery-ui.css"))),format.raw/*9.115*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.index())),format.raw/*15.53*/("""">
                    Play 2.0 sample application &mdash; Computer database
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*22.14*/content)),format.raw/*22.21*/("""
        </section>
        
        <script src=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Assets.at("javascripts/jquery-1.12.4.js"))),format.raw/*25.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Assets.at("javascripts/jquery-ui.js"))),format.raw/*26.67*/(""""></script>
        <script>
		  $( function() """),format.raw/*28.19*/("""{"""),format.raw/*28.20*/("""
		    $( "#dp1" ).datepicker();
		    $( "#dp2" ).datepicker();
		  """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/(""" );
		</script>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.Html = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 10 16:14:43 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/main.scala.html
                    HASH: 0f95c0f05d310cc3346b6444b51ee0a0f1b72a4d
                    MATRIX: 720->1|812->16|994->163|1008->169|1073->212|1181->285|1195->291|1251->325|1359->398|1373->404|1434->443|1594->567|1609->573|1651->593|1871->777|1900->784|1987->835|2002->841|2066->883|2136->917|2151->923|2211->961|2286->1008|2315->1009|2411->1078|2439->1079
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|43->15|43->15|43->15|50->22|50->22|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|59->31|59->31
                    -- GENERATED --
                */
            