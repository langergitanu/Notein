package com.huawei.hms.network.embedded;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18160e8;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.x9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18418x9 implements InterfaceC18429y7 {

    /* JADX INFO: renamed from: b */
    public static final int f56670b = 20;

    /* JADX INFO: renamed from: a */
    public final C18118b8 f56671a;

    public C18418x9(C18118b8 c18118b8) {
        this.f56671a = c18118b8;
    }

    /* JADX INFO: renamed from: a */
    private int m79986a(C18188g8 c18188g8, int i) {
        String strM78582b = c18188g8.m78582b("Retry-After");
        if (strM78582b == null) {
            return i;
        }
        if (strM78582b.matches("\\d+")) {
            return Integer.valueOf(strM78582b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
    public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
        C18175f9 c18175f9Mo77968a;
        C18160e8 c18160e8M79987a;
        C18160e8 c18160e8Request = aVar.request();
        C18379u9 c18379u9 = (C18379u9) aVar;
        C18287n9 c18287n9M79653f = c18379u9.m79653f();
        StringBuffer stringBuffer = new StringBuffer("{");
        int i = 0;
        C18188g8 c18188g8 = null;
        while (true) {
            c18287n9M79653f.prepareToConnect(c18160e8Request);
            if (c18287n9M79653f.isCanceled()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    C18188g8 c18188g8M79644a = c18379u9.m79644a(c18160e8Request, c18287n9M79653f, null);
                    if (c18188g8 != null) {
                        c18188g8M79644a = c18188g8M79644a.m78574D().m78611c(c18188g8.m78574D().m78600a((AbstractC18202h8) null).m78605a()).m78605a();
                    }
                    c18188g8 = c18188g8M79644a;
                    c18175f9Mo77968a = AbstractC18286n8.f55777a.mo77968a(c18188g8);
                    c18160e8M79987a = m79987a(c18188g8, c18175f9Mo77968a != null ? c18175f9Mo77968a.m78427b().mo78789b() : null);
                } catch (C18259l9 e) {
                    if (!m79989a(e.m79066b(), c18287n9M79653f, false, c18160e8Request)) {
                        throw e.m79064a();
                    }
                } catch (IOException e2) {
                    if (!m79989a(e2, c18287n9M79653f, true ^ (e2 instanceof C18106aa), c18160e8Request)) {
                        throw e2;
                    }
                }
                if (c18160e8M79987a == null) {
                    if (c18175f9Mo77968a != null && c18175f9Mo77968a.m78432f()) {
                        c18287n9M79653f.timeoutEarlyExit();
                    }
                    if (stringBuffer.length() <= 1) {
                        return c18188g8;
                    }
                    StringBuffer stringBufferDelete = stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
                    stringBufferDelete.append("}");
                    return c18188g8.m78574D().m78604a("X-HwPs-Redirects", stringBufferDelete.toString()).m78605a();
                }
                AbstractC18174f8 abstractC18174f8M78300b = c18160e8M79987a.m78300b();
                if (abstractC18174f8M78300b != null && abstractC18174f8M78300b.isOneShot()) {
                    return c18188g8;
                }
                C18313p8.m79378a(c18188g8.m78585s());
                if (c18287n9M79653f.hasExchange()) {
                    c18175f9Mo77968a.m78429c();
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException(C21532OooOOo.OooO0OO(i, "Too many follow-up requests: "));
                }
                if (c18188g8.m78589w() >= 300 && c18188g8.m78589w() < 400) {
                    stringBuffer.append(c18160e8M79987a.m78310k().m79929h());
                    stringBuffer.append("=");
                    stringBuffer.append(c18188g8.m78589w());
                    stringBuffer.append(", ");
                }
                c18160e8Request = c18160e8M79987a;
            } finally {
                c18287n9M79653f.exchangeDoneDueToException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C18160e8 m79987a(C18188g8 c18188g8, C18216i8 c18216i8) throws IOException {
        String strM78582b;
        C18416x7 c18416x7M79924d;
        AbstractC18174f8 abstractC18174f8M78300b;
        if (c18188g8 == null) {
            throw new IllegalStateException();
        }
        int iM78589w = c18188g8.m78589w();
        String strM78307h = c18188g8.m78578H().m78307h();
        if (iM78589w == 307 || iM78589w == 308) {
            if (strM78307h.equals("GET") || strM78307h.equals("HEAD")) {
                if (this.f56671a.m77952m() && (strM78582b = c18188g8.m78582b("Location")) != null && (c18416x7M79924d = c18188g8.m78578H().m78310k().m79924d(strM78582b)) != null && (c18416x7M79924d.m79940s().equals(c18188g8.m78578H().m78310k().m79940s()) || this.f56671a.m77953n())) {
                    C18160e8.a aVarM78308i = c18188g8.m78578H().m78308i();
                    if (C18366t9.m79567b(strM78307h)) {
                        boolean zM79569d = C18366t9.m79569d(strM78307h);
                        if (C18366t9.m79568c(strM78307h)) {
                            aVarM78308i.m78318a("GET", (AbstractC18174f8) null);
                        } else {
                            aVarM78308i.m78318a(strM78307h, zM79569d ? c18188g8.m78578H().m78300b() : null);
                        }
                        if (!zM79569d) {
                            aVarM78308i.m78326b(HttpHeaders.TRANSFER_ENCODING);
                            aVarM78308i.m78326b("Content-Length");
                            aVarM78308i.m78326b("Content-Type");
                        }
                    }
                    if (!C18313p8.m79383a(c18188g8.m78578H().m78310k(), c18416x7M79924d)) {
                        aVarM78308i.m78326b("Authorization");
                    }
                    return aVarM78308i.m78314a(c18416x7M79924d).m78323a();
                }
            }
        } else {
            if (iM78589w == 401) {
                return this.f56671a.m77935a().mo77929b(c18216i8, c18188g8);
            }
            if (iM78589w != 503) {
                if (iM78589w == 407) {
                    if ((c18216i8 != null ? c18216i8.m78767b() : this.f56671a.m77961v()).type() == Proxy.Type.HTTP) {
                        return this.f56671a.m77962w().mo77929b(c18216i8, c18188g8);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (iM78589w != 408) {
                    switch (iM78589w) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        default:
                            return null;
                    }
                } else if (this.f56671a.m77965z() && (((abstractC18174f8M78300b = c18188g8.m78578H().m78300b()) == null || !abstractC18174f8M78300b.isOneShot()) && ((c18188g8.m78575E() == null || c18188g8.m78575E().m78589w() != 408) && m79986a(c18188g8, 0) <= 0))) {
                    return c18188g8.m78578H();
                }
            } else if ((c18188g8.m78575E() == null || c18188g8.m78575E().m78589w() != 503) && m79986a(c18188g8, Integer.MAX_VALUE) == 0) {
                return c18188g8.m78578H();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private boolean m79988a(IOException iOException, C18160e8 c18160e8) {
        AbstractC18174f8 abstractC18174f8M78300b = c18160e8.m78300b();
        return (abstractC18174f8M78300b != null && abstractC18174f8M78300b.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: a */
    private boolean m79989a(IOException iOException, C18287n9 c18287n9, boolean z, C18160e8 c18160e8) {
        if (c18287n9.getExchangeFinder() != null && c18287n9.getSelection() != null) {
            c18287n9.getSelection().m79186h();
        }
        if (this.f56671a.m77965z()) {
            return !(z && m79988a(iOException, c18160e8)) && m79990a(iOException, z) && c18287n9.canRetry();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m79990a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }
}
