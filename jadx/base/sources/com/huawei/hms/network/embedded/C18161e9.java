package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18161e9 {

    /* JADX INFO: renamed from: a */
    public final List<C18257l7> f54633a;

    /* JADX INFO: renamed from: b */
    public int f54634b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f54635c;

    /* JADX INFO: renamed from: d */
    public boolean f54636d;

    public C18161e9(List<C18257l7> list) {
        this.f54633a = list;
    }

    /* JADX INFO: renamed from: b */
    private boolean m78333b(SSLSocket sSLSocket) {
        for (int i = this.f54634b; i < this.f54633a.size(); i++) {
            if (this.f54633a.get(i).m79052a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public C18257l7 m78334a(SSLSocket sSLSocket) throws IOException {
        C18257l7 c18257l7;
        int i = this.f54634b;
        int size = this.f54633a.size();
        while (true) {
            if (i >= size) {
                c18257l7 = null;
                break;
            }
            c18257l7 = this.f54633a.get(i);
            i++;
            if (c18257l7.m79052a(sSLSocket)) {
                this.f54634b = i;
                break;
            }
        }
        if (c18257l7 != null) {
            this.f54635c = m78333b(sSLSocket);
            AbstractC18286n8.f55777a.mo77971a(c18257l7, sSLSocket, this.f54636d);
            return c18257l7;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f54636d + ", modes=" + this.f54633a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* JADX INFO: renamed from: a */
    public boolean m78335a(IOException iOException) {
        this.f54636d = true;
        if (!this.f54635c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
