package oO0OO0OO;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import oO0OOoo0.C33131OooO0O0;
import oO0OOoo0.C33135OooO0o0;
import oO0OOoo0.C33143OooOOO;
import oO0OOoo0.EnumC33141OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<EnumC33141OooOO0O> f118736OooO00o = Collections.unmodifiableList(Arrays.asList(EnumC33141OooOO0O.HTTP_2));

    public static SSLSocket OooO00o(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, C33131OooO0O0 c33131OooO0O0) throws IOException {
        EnumC33141OooOO0O enumC33141OooOO0O;
        Preconditions.checkNotNull(sSLSocketFactory, "sslSocketFactory");
        Preconditions.checkNotNull(socket, "socket");
        Preconditions.checkNotNull(c33131OooO0O0, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = c33131OooO0O0.f119805OooO0O0;
        String[] strArr2 = strArr != null ? (String[]) C33143OooOOO.OooO00o(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) C33143OooOOO.OooO00o(c33131OooO0O0.f119806OooO0OO, sSLSocket.getEnabledProtocols());
        C33131OooO0O0.OooO00o oooO00o = new C33131OooO0O0.OooO00o(c33131OooO0O0);
        if (!oooO00o.f119808OooO00o) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            oooO00o.f119809OooO0O0 = null;
        } else {
            oooO00o.f119809OooO0O0 = (String[]) strArr2.clone();
        }
        if (!oooO00o.f119808OooO00o) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            oooO00o.f119810OooO0OO = null;
        } else {
            oooO00o.f119810OooO0OO = (String[]) strArr3.clone();
        }
        C33131OooO0O0 c33131OooO0O02 = new C33131OooO0O0(oooO00o);
        sSLSocket.setEnabledProtocols(c33131OooO0O02.f119806OooO0OO);
        String[] strArr4 = c33131OooO0O02.f119805OooO0O0;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        C32910OooOO0o c32910OooOO0o = C32910OooOO0o.f118720OooO0OO;
        boolean z = c33131OooO0O0.f119807OooO0Oo;
        List<EnumC33141OooOO0O> list = f118736OooO00o;
        String strOooO0Oo = c32910OooOO0o.OooO0Oo(sSLSocket, str, z ? list : null);
        if (strOooO0Oo.equals("http/1.0")) {
            enumC33141OooOO0O = EnumC33141OooOO0O.HTTP_1_0;
        } else if (strOooO0Oo.equals("http/1.1")) {
            enumC33141OooOO0O = EnumC33141OooOO0O.HTTP_1_1;
        } else if (strOooO0Oo.equals("h2")) {
            enumC33141OooOO0O = EnumC33141OooOO0O.HTTP_2;
        } else {
            if (!strOooO0Oo.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(strOooO0Oo));
            }
            enumC33141OooOO0O = EnumC33141OooOO0O.SPDY_3;
        }
        Preconditions.checkState(list.contains(enumC33141OooOO0O), "Only " + list + " are supported, but negotiated protocol is %s", strOooO0Oo);
        if (C33135OooO0o0.f119824OooO00o.verify((str.startsWith("[") && str.endsWith("]")) ? androidx.core.content.OooO0OO.OooO00o(1, 1, str) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
