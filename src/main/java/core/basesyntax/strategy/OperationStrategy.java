package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.OperationHandler;

public interface OperationStrategy {
    public OperationHandler get(FruitTransaction.Operation operation);
}