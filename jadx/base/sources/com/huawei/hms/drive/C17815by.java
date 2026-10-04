package com.huawei.hms.drive;

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
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.drive.by */
/* JADX INFO: loaded from: classes6.dex */
public final class C17815by {

    /* JADX INFO: renamed from: a */
    private final List<C17781ar> f53036a;

    /* JADX INFO: renamed from: b */
    private int f53037b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f53038c;

    /* JADX INFO: renamed from: d */
    private boolean f53039d;

    public C17815by(List<C17781ar> list) {
        this.f53036a = list;
    }

    /* JADX INFO: renamed from: b */
    private boolean m76402b(SSLSocket sSLSocket) {
        for (int i = this.f53037b; i < this.f53036a.size(); i++) {
            if (this.f53036a.get(i).m76013a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public C17781ar m76403a(SSLSocket sSLSocket) throws IOException {
        C17781ar c17781ar;
        int i = this.f53037b;
        int size = this.f53036a.size();
        while (true) {
            if (i >= size) {
                c17781ar = null;
                break;
            }
            c17781ar = this.f53036a.get(i);
            if (c17781ar.m76013a(sSLSocket)) {
                this.f53037b = i + 1;
                break;
            }
            i++;
        }
        if (c17781ar != null) {
            this.f53038c = m76402b(sSLSocket);
            AbstractC17804bn.f52952a.mo76226a(c17781ar, sSLSocket, this.f53039d);
            return c17781ar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f53039d + ", modes=" + this.f53036a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* JADX INFO: renamed from: a */
    public boolean m76404a(IOException iOException) {
        this.f53039d = true;
        if (!this.f53038c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
