package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO0.OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lo0000OO/OooO0o;", "e", "LoO00ooO/OooOooO;", "invoke", "(Lo0000OO/OooO0o;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class C0097xb96e2c36 extends OooOOOO implements InterfaceC32507OooOO0o<o0000OO.OooO0o, C32460OooOooO> {
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097xb96e2c36(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, o0000OO.OooO0o e) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(e, "$e");
        OooOOO oooOOO = this$0.callback;
        if (oooOOO != null) {
            oooOOO.onError(e);
        } else {
            OooOOO0.OooOOOO("callback");
            throw null;
        }
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(o0000OO.OooO0o oooO0o) {
        invoke2(oooO0o);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final o0000OO.OooO0o e) {
        OooOOO0.OooO0oO(e, "e");
        Executor executor = this.this$0.executor;
        if (executor == null) {
            OooOOO0.OooOOOO("executor");
            throw null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                C0097xb96e2c36.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, e);
            }
        });
    }
}
