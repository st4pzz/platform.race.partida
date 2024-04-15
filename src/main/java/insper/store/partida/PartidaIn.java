package insper.store.partida;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PartidaIn (
    
    String time1,
    String time2,
    String data,
    String local,
    String campeonato
) {
    
}
