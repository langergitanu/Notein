package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO0.OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class C0099xb96e2c39 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
    final /* synthetic */ o0000OO0.OooO0OO $response;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0099xb96e2c39(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, o0000OO0.OooO0OO oooO0OO) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$response = oooO0OO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, o0000OO0.OooO0OO response) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(response, "$response");
        OooOOO oooOOO = this$0.callback;
        if (oooOOO != null) {
            oooOOO.onResult(response);
        } else {
            OooOOO0.OooOOOO("callback");
            throw null;
        }
    }

    @Override // oO0O000o.OooO00o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
        invoke2();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            OooOOO0.OooOOOO("executor");
            throw null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        final o0000OO0.OooO0OO oooO0OO = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.OooO0Oo
            @Override // java.lang.Runnable
            public final void run() {
                C0099xb96e2c39.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, oooO0OO);
            }
        });
    }
}
