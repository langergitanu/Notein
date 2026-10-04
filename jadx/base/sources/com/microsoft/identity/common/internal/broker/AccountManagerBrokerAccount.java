package com.microsoft.identity.common.internal.broker;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.java.broker.IBrokerAccount;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class AccountManagerBrokerAccount implements IBrokerAccount {
    private static final String TAG = "AccountManagerBrokerAccount";
    private final Account mAccount;

    private AccountManagerBrokerAccount(Account account) {
        if (account == null) {
            throw new NullPointerException("account is marked non-null but is null");
        }
        this.mAccount = account;
    }

    public static AccountManagerBrokerAccount adapt(Account account) {
        if (account != null) {
            return new AccountManagerBrokerAccount(account);
        }
        throw new NullPointerException("account is marked non-null but is null");
    }

    public static AccountManagerBrokerAccount cast(AccountManager accountManager, IBrokerAccount iBrokerAccount) {
        if (accountManager == null) {
            throw new NullPointerException("accountManager is marked non-null but is null");
        }
        if (iBrokerAccount != null) {
            return iBrokerAccount instanceof AccountManagerBrokerAccount ? (AccountManagerBrokerAccount) iBrokerAccount : create(accountManager, iBrokerAccount.getUsername(), iBrokerAccount.getType());
        }
        throw new NullPointerException("account is marked non-null but is null");
    }

    public static AccountManagerBrokerAccount create(AccountManager accountManager, String str, String str2) {
        if (accountManager == null) {
            throw new NullPointerException("accountManager is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("accountName is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("accountType is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":create");
        Account account = getAccount(accountManager, str, str2);
        if (account == null) {
            account = new Account(str, str2);
            Logger.verbose(strOooO0OO, "Creating account.");
            Logger.verbosePII(strOooO0OO, "Creating account with name :" + account.name);
            accountManager.addAccountExplicitly(account, null, null);
        }
        setVisibility(accountManager, account, AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_PACKAGE_NAME);
        setVisibility(accountManager, account, AuthenticationConstants.Broker.COMPANY_PORTAL_APP_PACKAGE_NAME);
        if (BrokerData.getShouldTrustDebugBrokers()) {
            setVisibility(accountManager, account, BrokerData.getDebugMockCp().getPackageName());
            setVisibility(accountManager, account, BrokerData.getDebugMockAuthApp().getPackageName());
            setVisibility(accountManager, account, BrokerData.getDebugBrokerHost().getPackageName());
        }
        return adapt(account);
    }

    private static void setVisibility(AccountManager accountManager, Account account, String str) {
        if (accountManager == null) {
            throw new NullPointerException("accountManager is marked non-null but is null");
        }
        if (account == null) {
            throw new NullPointerException("account is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("packageName is marked non-null but is null");
        }
        if (accountManager.getAccountVisibility(account, str) != 1) {
            accountManager.setAccountVisibility(account, str, 1);
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AccountManagerBrokerAccount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountManagerBrokerAccount)) {
            return false;
        }
        AccountManagerBrokerAccount accountManagerBrokerAccount = (AccountManagerBrokerAccount) obj;
        if (!accountManagerBrokerAccount.canEqual(this)) {
            return false;
        }
        Account account = getAccount();
        Account account2 = accountManagerBrokerAccount.getAccount();
        return account != null ? account.equals(account2) : account2 == null;
    }

    public Account getAccount() {
        return this.mAccount;
    }

    @Override // com.microsoft.identity.common.java.broker.IBrokerAccount
    public String getType() {
        return this.mAccount.type;
    }

    @Override // com.microsoft.identity.common.java.broker.IBrokerAccount
    public String getUsername() {
        return this.mAccount.name;
    }

    public int hashCode() {
        Account account = getAccount();
        return 59 + (account == null ? 43 : account.hashCode());
    }

    private static Account getAccount(AccountManager accountManager, String str, String str2) {
        if (accountManager == null) {
            throw new NullPointerException("accountManager is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("accountName is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("accountType is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getAccount");
        Account[] accountsByType = accountManager.getAccountsByType(str2);
        if (accountsByType != null) {
            for (Account account : accountsByType) {
                if (account.name.equalsIgnoreCase(str)) {
                    return account;
                }
            }
        }
        Logger.verbose(strOooO0OO, "Account not found.");
        return null;
    }
}
