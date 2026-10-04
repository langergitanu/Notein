package com.microsoft.identity.common.internal.broker.ipc;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import com.hihonor.honorid.core.data.UserAccountInfo;
import com.microsoft.identity.common.internal.util.ProcessUtil;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: com.microsoft.identity.common.internal.broker.ipc.AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp$Companion$tryCreateInstance$1 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m80612d2 = {"<anonymous>", "Landroid/os/Bundle;", UserAccountInfo.TAG_ACCOUNT_TYPE, "", "requestBundle", "invoke"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class C18566xf8cb962f extends OooOOOO implements InterfaceC32508OooOOOo<String, Bundle, Bundle> {
    final /* synthetic */ AccountManager $accountManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18566xf8cb962f(AccountManager accountManager) {
        super(2);
        this.$accountManager = accountManager;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Bundle invoke(String accountType, Bundle requestBundle) throws OperationCanceledException, IOException, AuthenticatorException {
        OooOOO0.OooO0oO(accountType, "accountType");
        OooOOO0.OooO0oO(requestBundle, "requestBundle");
        Bundle result = this.$accountManager.addAccount(accountType, null, null, requestBundle, null, null, ProcessUtil.getPreferredHandler()).getResult(5L, TimeUnit.SECONDS);
        OooOOO0.OooO0o(result, "accountManager.addAccoun…sult(5, TimeUnit.SECONDS)");
        return result;
    }
}
