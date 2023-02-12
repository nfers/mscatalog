package br.com.nfers.mscatalog.brand.api.contract;


import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/brands")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name="brand", description = "Operations on brand resource")
public interface BrandAPI {


    @GET
    @Operation(summary = "Get All Brands")
    @APIResponse(responseCode = "200", description = "Get Brands")
    @APIResponse(responseCode = "404", description = "Not Found Brand")
    Response getAll();

    @POST
    @Operation(summary = "Get All Brands")
    @APIResponse(responseCode = "200", description = "Get Brands")
    @APIResponse(responseCode = "404", description = "Brand already exists")
    @APIResponse(responseCode = "404", description = "Not Found Brand")
    Response create();

    @PUT
    @Operation(summary = "Update Brand")
    @APIResponse(responseCode = "200", description = "Update brand by id")
    @APIResponse(responseCode = "404", description = "Not Found Brand")
    Response update(@PathParam("id") String id);

    @DELETE
    @Path("/{id}")
    @Operation(summary = "Delete Brand")
    @APIResponse(responseCode = "200", description = "Delete Brand by ID")
    @APIResponse(responseCode = "404", description = "Not Found Brand")
    Response delete(@PathParam("id") String id);
}
