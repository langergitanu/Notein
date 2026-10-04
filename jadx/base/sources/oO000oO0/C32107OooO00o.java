package oO000oO0;

import java.io.IOException;
import java.net.SocketTimeoutException;
import oO000oo.C32134OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO0Ooo0O.C33418OoooO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33614OooOOO0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: renamed from: oO000oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32107OooO00o implements Callback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32134OooO0o0 f115093OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33614OooOOO0 f115094OooO0O0;

    public C32107OooO00o(C32134OooO0o0 requestData, C33614OooOOO0 c33614OooOOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        this.f115093OooO00o = requestData;
        this.f115094OooO0O0 = c33614OooOOO0;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(call, "call");
        C33614OooOOO0 c33614OooOOO0 = this.f115094OooO0O0;
        if (c33614OooOOO0.OooOo()) {
            return;
        }
        if (iOException instanceof OooOOO) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            C32134OooO0o0 c32134OooO0o0 = this.f115093OooO00o;
            iOException = (message == null || !C33599OooOo0O.OooOoOO(message, "connect", true)) ? C33418OoooO.OooO0O0(c32134OooO0o0, iOException) : C33418OoooO.OooO00o(c32134OooO0o0, iOException);
        }
        c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(call, "call");
        if (call.getF124390Oooo0o0()) {
            return;
        }
        this.f115094OooO0O0.resumeWith(response);
    }
}
