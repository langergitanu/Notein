package com.microsoft.identity.common.internal.broker.ipc;

import OooO0o.C20424OooO0Oo;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.exception.BrokerCommunicationException;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.internal.util.AccountManagerUtil;
import com.microsoft.identity.common.internal.util.ProcessUtil;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.logging.Logger;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class AccountManagerAddAccountStrategy implements IIpcStrategy {
    private static final String TAG = "AccountManagerAddAccountStrategy";
    private final Context mContext;

    public AccountManagerAddAccountStrategy(Context context) {
        this.mContext = context;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public Bundle communicateToBroker(BrokerOperationBundle brokerOperationBundle) throws BrokerCommunicationException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":communicateToBroker");
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Broker operation: ", brokerOperationBundle.getOperation().name(), " brokerPackage: ");
        sbOooO0o0.append(brokerOperationBundle.getTargetBrokerAppPackageName());
        Logger.info(strOooO0OO, sbOooO0o0.toString());
        try {
            AccountManagerFuture<Bundle> accountManagerFutureAddAccount = AccountManager.get(this.mContext).addAccount(AuthenticationConstants.Broker.BROKER_ACCOUNT_TYPE, AuthenticationConstants.Broker.AUTHTOKEN_TYPE, null, brokerOperationBundle.getAccountManagerBundle(), null, null, ProcessUtil.getPreferredHandler());
            Logger.verbose(strOooO0OO, "Received result from broker");
            return accountManagerFutureAddAccount.getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Logger.error(strOooO0OO, e.getMessage(), e);
            throw new BrokerCommunicationException(BrokerCommunicationException.Category.CONNECTION_ERROR, getType(), "Failed to connect to AccountManager", e);
        }
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public IIpcStrategy.Type getType() {
        return IIpcStrategy.Type.ACCOUNT_MANAGER_ADD_ACCOUNT;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public boolean isSupportedByTargetedBroker(String str) {
        HashSet hashSet = new HashSet();
        hashSet.add(AuthenticationConstants.Broker.BROKER_PACKAGE_NAME);
        return AccountManagerUtil.canUseAccountManagerOperation(this.mContext, hashSet);
    }
}
