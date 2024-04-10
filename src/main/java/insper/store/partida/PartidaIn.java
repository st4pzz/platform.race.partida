package insper.store.partida;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PartidaIn (
    String id,
    String time1,
    String time2,
    String id_jogador
) {
    
}
