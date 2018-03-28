package kata.bank.project.service;

import java.time.LocalDateTime;
import java.util.List;

import kata.bank.project.model.account.Account;
import kata.bank.project.model.operation.Transaction;

public interface ITransactionService {

    void makeDeposit(final Account account, final Double amount);

    void makeWithdrawal(final Account account, final Double amount);

    double calculateOperationsAmountInAccount(final Account account);

    double calculateOperationsAmount(final List<Transaction> operations);

    long returnTransactionsCountAfter(final LocalDateTime dateTime, final Account account);

    long returnTransactionsCountBefore(final LocalDateTime dateTime, final Account account);

}
