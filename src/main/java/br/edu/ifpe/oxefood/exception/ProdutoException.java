
package br.edu.ifpe.oxefood.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ProdutoException extends RuntimeException {

    public static final String MSG_VALOR_MINIMO_PRODUTO =
            "Não é permitido inserir produtos com valores inferiores a R$ 10.";

    public ProdutoException(String msg) {
        super(msg);
    }
}
