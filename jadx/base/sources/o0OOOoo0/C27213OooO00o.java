package o0OOOoo0;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: renamed from: o0OOOoo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27213OooO00o implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f124724OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(sSLSession);
        return okHostnameVerifier.verify(str, sSLSession);
    }
}
