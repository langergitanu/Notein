package com.microsoft.identity.client;

import android.app.Activity;
import androidx.concurrent.futures.OooO00o;
import androidx.fragment.app.Fragment;
import com.microsoft.identity.client.IMultipleAccountPublicClientApplication;
import com.microsoft.identity.client.IPublicClientApplication;
import com.microsoft.identity.client.PublicClientApplication;
import com.microsoft.identity.client.claims.ClaimsRequest;
import com.microsoft.identity.client.exception.MsalArgumentException;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.client.exception.MsalException;
import com.microsoft.identity.client.internal.AsyncResult;
import com.microsoft.identity.client.internal.CommandParametersAdapter;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.client.internal.controllers.MSALControllerFactory;
import com.microsoft.identity.client.internal.controllers.MsalExceptionAdapter;
import com.microsoft.identity.common.internal.commands.LoadAccountCommand;
import com.microsoft.identity.common.internal.commands.RemoveAccountCommand;
import com.microsoft.identity.common.internal.migration.TokenMigrationCallback;
import com.microsoft.identity.common.java.cache.ICacheRecord;
import com.microsoft.identity.common.java.commands.CommandCallback;
import com.microsoft.identity.common.java.controllers.CommandDispatcher;
import com.microsoft.identity.common.java.dto.AccountRecord;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.util.ResultFuture;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes9.dex */
public class MultipleAccountPublicClientApplication extends PublicClientApplication implements IMultipleAccountPublicClientApplication {
    private static final String TAG = "MultipleAccountPublicClientApplication";

    public MultipleAccountPublicClientApplication(PublicClientApplicationConfiguration publicClientApplicationConfiguration) throws MsalClientException {
        super(publicClientApplicationConfiguration);
    }

    private void getAccountInternal(final String str, final IMultipleAccountPublicClientApplication.GetAccountCallback getAccountCallback, final String str2) {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getAccountInternal");
        if (getAccountCallback == null) {
            throw new IllegalArgumentException("callback cannot be null or empty");
        }
        try {
            MsalUtils.validateNonNullArg(str, "identifier");
        } catch (MsalArgumentException e) {
            getAccountCallback.onError((MsalException) e);
        }
        performMigration(new TokenMigrationCallback() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.3
            @Override // com.microsoft.identity.common.internal.migration.TokenMigrationCallback
            public void onMigrationFinished(int i) {
                com.microsoft.identity.common.logging.Logger.verbose(strOooO0OO, "Get account with the identifier.");
                PublicClientApplicationConfiguration publicClientApplicationConfiguration = MultipleAccountPublicClientApplication.this.mPublicClientConfiguration;
                CommandDispatcher.submitSilent(new LoadAccountCommand(CommandParametersAdapter.createCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache()), new MSALControllerFactory(MultipleAccountPublicClientApplication.this.mPublicClientConfiguration), new CommandCallback<List<ICacheRecord>, BaseException>() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.3.1
                    @Override // com.microsoft.identity.common.java.commands.CommandCallback
                    public void onCancel() {
                    }

                    @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
                    public void onError(BaseException baseException) {
                        com.microsoft.identity.common.logging.Logger.error(strOooO0OO, baseException.getMessage(), baseException);
                        getAccountCallback.onError(MsalExceptionAdapter.msalExceptionFromBaseException(baseException));
                    }

                    @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
                    public void onTaskCompleted(List<ICacheRecord> list) {
                        if (list == null || list.size() == 0) {
                            com.microsoft.identity.common.logging.Logger.verbose(strOooO0OO, "No account found.");
                            getAccountCallback.onTaskCompleted((IAccount) null);
                            return;
                        }
                        List<IAccount> listAdapt = AccountAdapter.adapt(list);
                        String strTrim = str.trim();
                        MultipleAccountPublicClientApplication multipleAccountPublicClientApplication = MultipleAccountPublicClientApplication.this;
                        PublicClientApplication.AccountMatcher accountMatcher = new PublicClientApplication.AccountMatcher(multipleAccountPublicClientApplication.homeAccountMatcher, multipleAccountPublicClientApplication.localAccountMatcher, multipleAccountPublicClientApplication.usernameMatcher);
                        for (IAccount iAccount : listAdapt) {
                            if (accountMatcher.matches(strTrim, iAccount)) {
                                getAccountCallback.onTaskCompleted(iAccount);
                                return;
                            }
                        }
                        getAccountCallback.onTaskCompleted((IAccount) null);
                    }
                }, str2));
            }
        });
    }

    private void getAccountsInternal(final IPublicClientApplication.LoadAccountsCallback loadAccountsCallback, final String str) {
        performMigration(new TokenMigrationCallback() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.1
            @Override // com.microsoft.identity.common.internal.migration.TokenMigrationCallback
            public void onMigrationFinished(int i) {
                PublicClientApplicationConfiguration publicClientApplicationConfiguration = MultipleAccountPublicClientApplication.this.mPublicClientConfiguration;
                CommandDispatcher.submitSilent(new LoadAccountCommand(CommandParametersAdapter.createCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache()), new MSALControllerFactory(MultipleAccountPublicClientApplication.this.mPublicClientConfiguration), PublicClientApplication.getLoadAccountsCallback(loadAccountsCallback), str));
            }
        });
    }

    private void removeAccountInternal(IAccount iAccount, final IMultipleAccountPublicClientApplication.RemoveAccountCallback removeAccountCallback, String str) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":removeAccountInternal");
        MultiTenantAccount multiTenantAccount = (MultiTenantAccount) iAccount;
        if (multiTenantAccount == null) {
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Requisite IAccount or IAccount fields were null. Insufficient criteria to remove IAccount.");
            removeAccountCallback.onError(new MsalClientException(MsalClientException.INVALID_PARAMETER));
            return;
        }
        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setEnvironment(multiTenantAccount.getEnvironment());
        accountRecord.setHomeAccountId(multiTenantAccount.getHomeAccountId());
        PublicClientApplicationConfiguration publicClientApplicationConfiguration = this.mPublicClientConfiguration;
        CommandDispatcher.submitSilent(new RemoveAccountCommand(CommandParametersAdapter.createRemoveAccountCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), accountRecord), new MSALControllerFactory(this.mPublicClientConfiguration), new CommandCallback<Boolean, BaseException>() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.5
            @Override // com.microsoft.identity.common.java.commands.CommandCallback
            public void onCancel() {
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(BaseException baseException) {
                removeAccountCallback.onError(MsalExceptionAdapter.msalExceptionFromBaseException(baseException));
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(Boolean bool) {
                removeAccountCallback.onRemoved();
            }
        }, str));
    }

    @Override // com.microsoft.identity.client.PublicClientApplication, com.microsoft.identity.client.IPublicClientApplication
    public void acquireToken(AcquireTokenParameters acquireTokenParameters) {
        acquireTokenInternal(acquireTokenParameters, PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_WITH_PARAMETERS);
    }

    @Override // com.microsoft.identity.client.PublicClientApplication, com.microsoft.identity.client.IPublicClientApplication
    public IAuthenticationResult acquireTokenSilent(AcquireTokenSilentParameters acquireTokenSilentParameters) throws MsalException, InterruptedException {
        return acquireTokenSilentInternal(acquireTokenSilentParameters, PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS);
    }

    @Override // com.microsoft.identity.client.PublicClientApplication, com.microsoft.identity.client.IPublicClientApplication
    public void acquireTokenSilentAsync(AcquireTokenSilentParameters acquireTokenSilentParameters) {
        acquireTokenSilentAsyncInternal(acquireTokenSilentParameters, PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_ASYNC_WITH_PARAMETERS);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    public void getAccount(String str, IMultipleAccountPublicClientApplication.GetAccountCallback getAccountCallback) {
        getAccountInternal(str, getAccountCallback, PublicApiId.MULTIPLE_ACCOUNT_PCA_GET_ACCOUNT_WITH_IDENTIFIER_CALLBACK);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    public void getAccounts(IPublicClientApplication.LoadAccountsCallback loadAccountsCallback) {
        getAccountsInternal(loadAccountsCallback, PublicApiId.MULTIPLE_ACCOUNT_PCA_GET_ACCOUNTS_WITH_CALLBACK);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    public void removeAccount(IAccount iAccount, IMultipleAccountPublicClientApplication.RemoveAccountCallback removeAccountCallback) {
        removeAccountInternal(iAccount, removeAccountCallback, PublicApiId.MULTIPLE_ACCOUNT_PCA_REMOVE_ACCOUNT_WITH_ACCOUNT_CALLBACK);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    @Deprecated
    public void acquireToken(Activity activity, String[] strArr, String str, AuthenticationCallback authenticationCallback) {
        acquireTokenInternal(buildAcquireTokenParameters(activity, (Fragment) null, Arrays.asList(strArr), (IAccount) null, (Prompt) null, (List<Map.Entry<String, String>>) null, (String[]) null, (String) null, authenticationCallback, str, (ClaimsRequest) null), PublicApiId.f57075x7e2b03bc);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    @Deprecated
    public IAuthenticationResult acquireTokenSilent(String[] strArr, IAccount iAccount, String str) throws MsalException, InterruptedException {
        return acquireTokenSilentSyncInternal(strArr, str, iAccount, false, PublicApiId.f57074xbf15be41);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    @Deprecated
    public void acquireTokenSilentAsync(String[] strArr, IAccount iAccount, String str, SilentAuthenticationCallback silentAuthenticationCallback) {
        acquireTokenSilentAsyncInternal(buildAcquireTokenSilentParameters(strArr, iAccount, str, false, null, silentAuthenticationCallback), PublicApiId.f57073xdf988906);
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    public IAccount getAccount(String str) throws MsalException, InterruptedException {
        MsalUtils.throwOnMainThread("getAccount");
        final ResultFuture resultFuture = new ResultFuture();
        getAccountInternal(str, new IMultipleAccountPublicClientApplication.GetAccountCallback() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication.GetAccountCallback, com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(MsalException msalException) {
                resultFuture.setResult(new AsyncResult(null, msalException));
            }

            @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication.GetAccountCallback, com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(IAccount iAccount) {
                resultFuture.setResult(new AsyncResult(iAccount, null));
            }
        }, PublicApiId.MULTIPLE_ACCOUNT_PCA_GET_ACCOUNT_WITH_IDENTIFIER);
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return (IAccount) asyncResult.getResult();
            }
            throw asyncResult.getException();
        } catch (ExecutionException e) {
            throw new MsalClientException("unknown_error", "Unexpected error while loading account", e);
        }
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    public List<IAccount> getAccounts() throws MsalException, InterruptedException {
        MsalUtils.throwOnMainThread("getAccounts");
        final ResultFuture resultFuture = new ResultFuture();
        getAccountsInternal(new IPublicClientApplication.LoadAccountsCallback() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.microsoft.identity.client.IPublicClientApplication.LoadAccountsCallback, com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(MsalException msalException) {
                resultFuture.setResult(new AsyncResult(null, msalException));
            }

            @Override // com.microsoft.identity.client.IPublicClientApplication.LoadAccountsCallback, com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(List<IAccount> list) {
                resultFuture.setResult(new AsyncResult(list, null));
            }
        }, PublicApiId.MULTIPLE_ACCOUNT_PCA_GET_ACCOUNTS);
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return (List) asyncResult.getResult();
            }
            throw asyncResult.getException();
        } catch (ExecutionException e) {
            throw new MsalClientException("unknown_error", "Unexpected error while loading accounts.", e);
        }
    }

    @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication
    public boolean removeAccount(IAccount iAccount) throws MsalException, InterruptedException {
        final ResultFuture resultFuture = new ResultFuture();
        removeAccountInternal(iAccount, new IMultipleAccountPublicClientApplication.RemoveAccountCallback() { // from class: com.microsoft.identity.client.MultipleAccountPublicClientApplication.6
            @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication.RemoveAccountCallback
            public void onError(MsalException msalException) {
                resultFuture.setResult(new AsyncResult(Boolean.FALSE, msalException));
            }

            @Override // com.microsoft.identity.client.IMultipleAccountPublicClientApplication.RemoveAccountCallback
            public void onRemoved() {
                resultFuture.setResult(new AsyncResult(Boolean.TRUE, null));
            }
        }, PublicApiId.MULTIPLE_ACCOUNT_PCA_REMOVE_ACCOUNT_WITH_ACCOUNT);
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return ((Boolean) asyncResult.getResult()).booleanValue();
            }
            throw asyncResult.getException();
        } catch (ExecutionException e) {
            throw new MsalClientException("unknown_error", "Unexpected error while removing account.", e);
        }
    }
}
