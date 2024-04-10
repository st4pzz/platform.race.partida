package insper.store.partida;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-partida")
public interface PartidaController {

    @PostMapping("/partida")
    public ResponseEntity<PartidaOut> create(
        @RequestBody(required = true) PartidaIn in
    );


    @PutMapping("/partida/{id}")
    public ResponseEntity<PartidaOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) PartidaIn in
    );

    @GetMapping("/partida")
    public ResponseEntity<PartidaOut> read(
        @RequestHeader(required = true, name = "id-Partida") String idPartida
    );
    
}
