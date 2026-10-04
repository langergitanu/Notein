package androidx.credentials.playservices.controllers.GetSignInIntent;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.OooOO0O;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class CredentialProviderGetSignInIntentController$handleResponse$4 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
    final /* synthetic */ C24034Oooo00O<OooOO0O> $exception;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C24034Oooo00O<OooOO0O> c24034Oooo00O) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = c24034Oooo00O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, C24034Oooo00O exception) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(exception, "$exception");
        this$0.getCallback().onError(exception.f80942OooOo0o);
    }

    @Override // oO0O000o.OooO00o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
        invoke2();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final C24034Oooo00O<OooOO0O> c24034Oooo00O = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.OooO0OO
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(credentialProviderGetSignInIntentController, c24034Oooo00O);
            }
        });
    }
}
