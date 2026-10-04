package com.microsoft.identity.common.internal.broker.ipc;

import OooOoo.C20593OooO0Oo;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.os.Bundle;
import com.hihonor.honorid.core.data.UserAccountInfo;
import com.microsoft.identity.common.exception.BrokerCommunicationException;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.BrokerValidator;
import com.microsoft.identity.common.internal.broker.IBrokerValidator;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.internal.util.AccountManagerUtil;
import com.microsoft.identity.common.logging.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.OooO00o;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001$BS\b\u0000\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006%"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp;", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "", "", "accountTypeForEachPackage", "Lkotlin/Function2;", "Landroid/os/Bundle;", "sendRequestViaAccountManager", "Lkotlin/Function0;", "", "Landroid/accounts/AuthenticatorDescription;", "getAccountManagerApps", "Lcom/microsoft/identity/common/internal/broker/IBrokerValidator;", "brokerValidator", "<init>", "(Ljava/util/Map;LoO0O000o/OooOOOo;LoO0O000o/OooO00o;Lcom/microsoft/identity/common/internal/broker/IBrokerValidator;)V", "targetPackageName", UserAccountInfo.TAG_ACCOUNT_TYPE, "LoO00ooO/OooOooO;", "validateTargetApp", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/microsoft/identity/common/internal/broker/ipc/BrokerOperationBundle;", "bundle", "communicateToBroker", "(Lcom/microsoft/identity/common/internal/broker/ipc/BrokerOperationBundle;)Landroid/os/Bundle;", "targetedBrokerPackageName", "", "isSupportedByTargetedBroker", "(Ljava/lang/String;)Z", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy$Type;", "getType", "()Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy$Type;", "Ljava/util/Map;", "LoO0O000o/OooOOOo;", "LoO0O000o/OooO00o;", "Lcom/microsoft/identity/common/internal/broker/IBrokerValidator;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp implements IIpcStrategy {
    public static final String AUTHAPP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE = "com.microsoft.authapppassthroughbackup";
    public static final String CONTENT_PROVIDER_PATH_KEY = "CONTENT_PROVIDER_PATH";
    public static final String CP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE = "com.microsoft.cppassthroughbackup";
    public static final String LTW_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE = "com.microsoft.ltwpassthroughbackup";
    public static final String REQUEST_BUNDLE_KEY = "REQUEST_BUNDLE";
    private final Map<String, String> accountTypeForEachPackage;
    private final IBrokerValidator brokerValidator;
    private final OooO00o<AuthenticatorDescription[]> getAccountManagerApps;
    private final InterfaceC32508OooOOOo<String, Bundle, Bundle> sendRequestViaAccountManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.class).OooOO0();

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp$Companion;", "", "()V", "AUTHAPP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE", "", "CONTENT_PROVIDER_PATH_KEY", "CP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE", "LTW_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE", "REQUEST_BUNDLE_KEY", "TAG", "getTAG", "()Ljava/lang/String;", "getAccountTypeForEachPackage", "", "getAccountTypeForEachPackage$common_distRelease", "tryCreateInstance", "Lcom/microsoft/identity/common/internal/broker/ipc/AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp;", "context", "Landroid/content/Context;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final Map<String, String> getAccountTypeForEachPackage$common_distRelease() {
            BrokerData.Companion companion = BrokerData.INSTANCE;
            Map<String, String> mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(companion.getDebugMockLtw().getPackageName(), AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.LTW_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE), new C32443OooOOO(companion.getProdLTW().getPackageName(), AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.LTW_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE), new C32443OooOOO(companion.getDebugMockCp().getPackageName(), AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.CP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE), new C32443OooOOO(companion.getProdCompanyPortal().getPackageName(), AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.CP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE), new C32443OooOOO(companion.getDebugMockAuthApp().getPackageName(), AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.AUTHAPP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE), new C32443OooOOO(companion.getProdMicrosoftAuthenticator().getPackageName(), AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.AUTHAPP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE));
            Iterator<T> it = companion.getProdBrokers().iterator();
            while (it.hasNext()) {
                mapOooO0oo.containsKey(((BrokerData) it.next()).getPackageName());
            }
            return mapOooO0oo;
        }

        public final String getTAG() {
            return AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.TAG;
        }

        public final AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp tryCreateInstance(Context context) {
            OooOOO0.OooO0oO(context, "context");
            if (!AccountManagerUtil.canUseAccountManagerOperation(context, OooOOO.OoooOo0(new String[]{AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.LTW_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE, AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.CP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE, AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp.AUTHAPP_BACKUP_IPC_ACCOUNT_MANAGER_ACCOUNT_TYPE}))) {
                return null;
            }
            AccountManager accountManager = AccountManager.get(context);
            return new AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp(getAccountTypeForEachPackage$common_distRelease(), new C18566xf8cb962f(accountManager), new C18567xf8cb9630(accountManager), new BrokerValidator(context));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp(Map<String, String> accountTypeForEachPackage, InterfaceC32508OooOOOo<? super String, ? super Bundle, Bundle> sendRequestViaAccountManager, OooO00o<AuthenticatorDescription[]> getAccountManagerApps, IBrokerValidator brokerValidator) {
        OooOOO0.OooO0oO(accountTypeForEachPackage, "accountTypeForEachPackage");
        OooOOO0.OooO0oO(sendRequestViaAccountManager, "sendRequestViaAccountManager");
        OooOOO0.OooO0oO(getAccountManagerApps, "getAccountManagerApps");
        OooOOO0.OooO0oO(brokerValidator, "brokerValidator");
        this.accountTypeForEachPackage = accountTypeForEachPackage;
        this.sendRequestViaAccountManager = sendRequestViaAccountManager;
        this.getAccountManagerApps = getAccountManagerApps;
        this.brokerValidator = brokerValidator;
    }

    private final void validateTargetApp(String targetPackageName, String accountType) throws BrokerCommunicationException {
        for (AuthenticatorDescription authenticatorDescription : this.getAccountManagerApps.invoke()) {
            AuthenticatorDescription authenticatorDescription2 = authenticatorDescription;
            if (OooOOO0.OooO0O0(authenticatorDescription2.packageName, targetPackageName) && OooOOO0.OooO0O0(authenticatorDescription2.type, accountType)) {
                AuthenticatorDescription authenticatorDescription3 = authenticatorDescription;
                IBrokerValidator iBrokerValidator = this.brokerValidator;
                String str = authenticatorDescription3.packageName;
                OooOOO0.OooO0o(str, "targetAppInfo.packageName");
                if (!iBrokerValidator.isValidBrokerPackage(str)) {
                    throw new BrokerCommunicationException(BrokerCommunicationException.Category.VALIDATION_ERROR, getType(), androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), authenticatorDescription3.packageName, " is not a valid broker app."), null);
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public Bundle communicateToBroker(BrokerOperationBundle bundle) throws BrokerCommunicationException {
        OooOOO0.OooO0oO(bundle, "bundle");
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":communicateToBroker");
        String str = bundle.targetBrokerAppPackageName;
        OooOOO0.OooO0o(str, "bundle.targetBrokerAppPackageName");
        String str2 = this.accountTypeForEachPackage.get(str);
        if (str2 == null) {
            throw new BrokerCommunicationException(BrokerCommunicationException.Category.OPERATION_NOT_SUPPORTED_ON_CLIENT_SIDE, getType(), C20593OooO0Oo.OooO0O0("AccountManagerBackupIpcStrategy doesn't recognize ", str, " as a broker"), null);
        }
        String str3 = str2;
        validateTargetApp(str, str3);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(REQUEST_BUNDLE_KEY, bundle.bundle);
        bundle2.putString(CONTENT_PROVIDER_PATH_KEY, bundle.operation.getContentApi().getPath());
        try {
            return this.sendRequestViaAccountManager.invoke(str3, bundle2);
        } catch (Throwable th) {
            String message = th.getMessage();
            String strConcat = (message == null || message.length() == 0) ? th.getClass().getSimpleName().concat(" is thrown") : th.getMessage();
            Logger.error(strOooO0OO, strConcat, th);
            throw new BrokerCommunicationException(BrokerCommunicationException.Category.CONNECTION_ERROR, getType(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("AccountManager failed to respond - ", strConcat), th);
        }
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public IIpcStrategy.Type getType() {
        return IIpcStrategy.Type.ACCOUNT_MANAGER_ADD_ACCOUNT;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public boolean isSupportedByTargetedBroker(String targetedBrokerPackageName) {
        OooOOO0.OooO0oO(targetedBrokerPackageName, "targetedBrokerPackageName");
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":isSupportedByTargetedBroker");
        try {
            String str = this.accountTypeForEachPackage.get(targetedBrokerPackageName);
            if (str != null) {
                validateTargetApp(targetedBrokerPackageName, str);
                return true;
            }
            Logger.info(strOooO0OO, "AccountManagerBackupIpcStrategy doesn't recognize " + targetedBrokerPackageName + " as a broker");
            return false;
        } catch (Throwable th) {
            Logger.error(strOooO0OO, th.getMessage(), th);
            return false;
        }
    }
}
