package com.microsoft.identity.common.internal.broker.ipc;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;

/* JADX INFO: renamed from: com.microsoft.identity.common.internal.broker.ipc.AccountManagerBackupIpcStrategyTargetingSpecificBrokerApp$Companion$tryCreateInstance$2 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"<anonymous>", "", "Landroid/accounts/AuthenticatorDescription;", "invoke", "()[Landroid/accounts/AuthenticatorDescription;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class C18567xf8cb9630 extends OooOOOO implements OooO00o<AuthenticatorDescription[]> {
    final /* synthetic */ AccountManager $accountManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18567xf8cb9630(AccountManager accountManager) {
        super(0);
        this.$accountManager = accountManager;
    }

    @Override // oO0O000o.OooO00o
    public final AuthenticatorDescription[] invoke() {
        AuthenticatorDescription[] authenticatorTypes = this.$accountManager.getAuthenticatorTypes();
        OooOOO0.OooO0o(authenticatorTypes, "accountManager.authenticatorTypes");
        return authenticatorTypes;
    }
}
