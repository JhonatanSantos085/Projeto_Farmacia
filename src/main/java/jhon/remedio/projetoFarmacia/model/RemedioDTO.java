package jhon.remedio.projetoFarmacia.model;

public record RemedioDTO(
        String nome,
        Via via,
        String lote,
        String quantidade,
        String validade,
        Laboratorio laboratorio
) {
}
