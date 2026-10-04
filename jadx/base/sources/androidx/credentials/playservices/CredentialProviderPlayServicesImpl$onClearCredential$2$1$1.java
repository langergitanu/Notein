package androidx.credentials.playservices;

import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO0.OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
    final /* synthetic */ OooOOO<Void, o0000OO.OooO00o> $callback;

    /* JADX INFO: renamed from: $e */
    final /* synthetic */ Exception f17$e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, OooOOO<Void, o0000OO.OooO00o> oooOOO) {
        super(0);
        this.f17$e = exc;
        this.$executor = executor;
        this.$callback = oooOOO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(OooOOO callback, Exception e) {
        OooOOO0.OooO0oO(callback, "$callback");
        OooOOO0.OooO0oO(e, "$e");
        callback.onError(new o0000OO.OooO0OO(e.getMessage()));
    }

    @Override // oO0O000o.OooO00o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
        invoke2();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.f17$e);
        Executor executor = this.$executor;
        final OooOOO<Void, o0000OO.OooO00o> oooOOO = this.$callback;
        final Exception exc = this.f17$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.OooO0Oo
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(oooOOO, exc);
            }
        });
    }
}
