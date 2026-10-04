package androidx.credentials.playservices.controllers.BeginSignIn;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.OooOO0O;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class CredentialProviderBeginSignInController$handleResponse$5 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: $e */
    final /* synthetic */ OooOO0O f18$e;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, OooOO0O oooOO0O) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.f18$e = oooOO0O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, OooOO0O e) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(e, "$e");
        this$0.getCallback().onError(e);
    }

    @Override // oO0O000o.OooO00o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
        invoke2();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final OooOO0O oooOO0O = this.f18$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.OooO0Oo
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(credentialProviderBeginSignInController, oooOO0O);
            }
        });
    }
}
