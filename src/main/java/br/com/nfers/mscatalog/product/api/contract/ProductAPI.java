package br.com.nfers.mscatalog.product.api.contract;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name="product", description = "Operations on product resource")
public interface ProductAPI {

    @GET
    @Operation(summary = "Get All Products")
    @APIResponse(responseCode = "200", description = "Get Products")
    @APIResponse(responseCode = "404", description = "Not Found Products")
    Response getAll();
}
