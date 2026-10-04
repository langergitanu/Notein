package o0000OO0;

import android.content.Context;
import android.os.CancellationSignal;
import o000Oo00.InterfaceC24514OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f81436OooO00o;

    public OooOOOO(InterfaceC24514OooO00o strokeRenderer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeRenderer, "strokeRenderer");
        this.f81436OooO00o = strokeRenderer;
    }

    @Override // o0000OO0.OooOOO0
    public void OooO00o(Context context, C24192Oooo0oo c24192Oooo0oo, CancellationSignal cancellationSignal, OooO oooO, C24168OooOO0o c24168OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC24171OooOOo0 interfaceC24171OooOOo0OooO00o = C24170OooOOo.OooO00o(new C24170OooOOo(context));
        if (interfaceC24171OooOOo0OooO00o == null) {
            c24168OooOO0o.onError(new o0000OO.OooOOO0("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC24171OooOOo0OooO00o.onGetCredential(context, c24192Oooo0oo, cancellationSignal, oooO, c24168OooOO0o);
        }
    }

    public OooOOOO(Context context) {
        this.f81436OooO00o = context;
    }
}
