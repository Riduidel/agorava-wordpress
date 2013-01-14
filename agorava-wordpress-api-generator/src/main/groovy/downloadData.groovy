import groovyx.net.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.TEXT
log.info "query to use : "+project.properties["query.to.use"];
log.info "target directory :"+project.properties["jsonschema2pojo.source.directory"];
log.info "element to generate :"+project.properties["element.to.generate"]           ;

def http = new HTTPBuilder(project.properties["server.address"]);
http.request(GET, TEXT) { request ->
    uri.path = project.properties["query.to.use"];
    headers.'authorization' = 'Bearer '+project.properties["wordpress.test.secret"];
    response.success = { resp, reader ->
        assert resp.status == 200;
        log.info "My response handler got response: ${resp.statusLine}";
        log.info "Response length: ${resp.headers.'Content-Length'}";
        System.out << reader; // print response reader
    }
}
