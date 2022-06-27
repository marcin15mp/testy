package biz;

import model.Account;

import java.util.stream.Collectors;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository)  {
        this.accountRepository = accountRepository;
    }

    List<Account> getAllActiveAccount() {
        return accountRepository.getAllAccounts().stream()
                .filter()
                .collect(Collectors.toList());
    }
}
