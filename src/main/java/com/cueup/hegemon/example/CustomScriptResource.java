package com.cueup.hegemon.example;

import com.cueup.hegemon.LoadError;
import com.cueup.hegemon.LoadPath;
import com.cueup.hegemon.Script;
import com.google.common.io.ByteStreams;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import java.io.InputStream;

/**
 * The CustomScriptResource is an example of evaluating non-bundled code. This can be used to implement application
 * consoles or test in-development code in a production environment.
 *
 * NOTE: This isn't secure, and could do VERY BAD THINGS if used improperly. Don't do this without understanding the
 * attack vector you're opening. Even legitimate users can cause problems on accident.
 */
@Path("/customScript")
@Produces(MediaType.APPLICATION_JSON)
public class CustomScriptResource {
  @POST
  public Object post(String postBody) throws IOException, LoadError {
    final Script compiled =
        new Script("function run() { " +  postBody + " }",
            LoadPath.defaultPath(), "hegemon/core");
    return compiled.run("run");
  }
}
