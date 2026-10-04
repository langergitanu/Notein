package androidx.credentials.playservices.controllers.GetSignInIntent;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.OooOO0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lo0000OO/OooOO0O;", "e", "LoO00ooO/OooOooO;", "invoke", "(Lo0000OO/OooOO0O;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends OooOOOO implements InterfaceC32507OooOO0o<OooOO0O, C32460OooOooO> {
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, OooOO0O e) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(e, "$e");
        this$0.getCallback().onError(e);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(OooOO0O oooOO0O) {
        invoke2(oooOO0O);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final OooOO0O e) {
        OooOOO0.OooO0oO(e, "e");
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(credentialProviderGetSignInIntentController, e);
            }
        });
    }
}
