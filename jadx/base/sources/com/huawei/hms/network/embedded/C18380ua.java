package com.huawei.hms.network.embedded;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ua */
/* JADX INFO: loaded from: classes9.dex */
public final class C18380ua extends C18406wa {

    /* JADX INFO: renamed from: e */
    public final Method f56316e;

    /* JADX INFO: renamed from: f */
    public final Method f56317f;

    public C18380ua(Method method, Method method2) {
        this.f56316e = method;
        this.f56317f = method2;
    }

    /* JADX INFO: renamed from: i */
    public static C18380ua m79654i() {
        try {
            return new C18380ua(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listM79840a = C18406wa.m79840a(list);
            this.f56316e.invoke(sSLParameters, listM79840a.toArray(new String[listM79840a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f56317f.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: c */
    public X509TrustManager mo79431c(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
