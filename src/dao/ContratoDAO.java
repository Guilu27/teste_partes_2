package dao;

public class ContratoDAO implements IContratoDAO {
    @Override
    public void salvar() {
        throw new  UnsupportedOperationException("Nao conseguiu acessar o banco");
    }

    @Override
    public void buscar() {
        throw new  UnsupportedOperationException("Nenhum contrato encontrado");
    }

    @Override
    public void excluir() {
        throw new  UnsupportedOperationException("Contrato não excluido");
    }

    @Override
    public void atualizar() {
        throw new  UnsupportedOperationException("Contrato não atualizado");
    }
}
