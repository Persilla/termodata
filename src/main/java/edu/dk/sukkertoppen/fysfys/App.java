package edu.dk.sukkertoppen.fysfys;

import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.hbs.Hbs;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {

    use(new Hbs());

    get("/", req -> Results.html("home").put("model", "verden"));
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
