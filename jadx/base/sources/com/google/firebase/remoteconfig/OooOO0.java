package com.google.firebase.remoteconfig;

import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.result.AuthAccount;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import o0oOoO0.C30996OooO0Oo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOO0 implements Continuation, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68641OooOo0o;

    public /* synthetic */ OooOO0(Object obj) {
        this.f68641OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult it = (ActivityResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        if (it.f62240OooOo0o == -1) {
            o0O00OOO.OooO0o<AuthAccount> authResultFromIntent = AccountAuthManager.parseAuthResultFromIntent(it.f62239OooOo);
            if (authResultFromIntent.OooO()) {
                String authorizationCode = authResultFromIntent.OooO0oO().getAuthorizationCode();
                kotlin.jvm.internal.OooOOO0.OooO0o(authorizationCode, "getAuthorizationCode(...)");
                UserSettingFragment userSettingFragment = (UserSettingFragment) this.f68641OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = userSettingFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30996OooO0Oo(userSettingFragment, authorizationCode, null), 3);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) this.f68641OooOo0o, task);
    }
}
