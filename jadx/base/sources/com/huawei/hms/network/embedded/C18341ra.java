package com.huawei.hms.network.embedded;

import android.os.Build;
import android.util.Log;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ra */
/* JADX INFO: loaded from: classes9.dex */
public class C18341ra extends C18406wa {

    /* JADX INFO: renamed from: l */
    public static final int f56033l = 4000;

    /* JADX INFO: renamed from: e */
    public final Class<?> f56034e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f56035f;

    /* JADX INFO: renamed from: g */
    public final Method f56036g;

    /* JADX INFO: renamed from: h */
    public final Method f56037h;

    /* JADX INFO: renamed from: i */
    public final Method f56038i;

    /* JADX INFO: renamed from: j */
    public final Method f56039j;

    /* JADX INFO: renamed from: k */
    public final b f56040k = b.m79464a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ra$a */
    public static final class a extends AbstractC18107ab {

        /* JADX INFO: renamed from: a */
        public final Object f56041a;

        /* JADX INFO: renamed from: b */
        public final Method f56042b;

        public a(Object obj, Method method) {
            this.f56041a = obj;
            this.f56042b = method;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18107ab
        /* JADX INFO: renamed from: a */
        public List<Certificate> mo77913a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f56042b.invoke(this.f56041a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ra$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Method f56043a;

        /* JADX INFO: renamed from: b */
        public final Method f56044b;

        /* JADX INFO: renamed from: c */
        public final Method f56045c;

        public b(Method method, Method method2, Method method3) {
            this.f56043a = method;
            this.f56044b = method2;
            this.f56045c = method3;
        }

        /* JADX INFO: renamed from: a */
        public static b m79464a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new b(method, method3, method2);
        }

        /* JADX INFO: renamed from: a */
        public Object m79465a(String str) {
            Method method = this.f56043a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f56044b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m79466a(Object obj) {
            if (obj != null) {
                try {
                    this.f56045c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ra$c */
    public static final class c implements InterfaceC18149db {

        /* JADX INFO: renamed from: a */
        public final X509TrustManager f56046a;

        /* JADX INFO: renamed from: b */
        public final Method f56047b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f56047b = method;
            this.f56046a = x509TrustManager;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18149db
        /* JADX INFO: renamed from: a */
        public X509Certificate mo78256a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f56047b.invoke(this.f56046a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f56046a.equals(cVar.f56046a) && this.f56047b.equals(cVar.f56047b);
        }

        public int hashCode() {
            return (this.f56047b.hashCode() * 31) + this.f56046a.hashCode();
        }
    }

    public C18341ra(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f56034e = cls;
        this.f56035f = cls2;
        this.f56036g = method;
        this.f56037h = method2;
        this.f56038i = method3;
        this.f56039j = method4;
    }

    /* JADX INFO: renamed from: i */
    public static C18406wa m79462i() {
        if (!C18406wa.m79846g()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new C18341ra(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m79463j() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public AbstractC18107ab mo79423a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo79423a(x509TrustManager);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public InterfaceC18149db mo79428b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo79428b(x509TrustManager);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: c */
    public X509TrustManager mo79431c(SSLSocketFactory sSLSocketFactory) {
        Object objM79839a = C18406wa.m79839a(sSLSocketFactory, this.f56034e, "sslParameters");
        if (objM79839a == null) {
            try {
                objM79839a = C18406wa.m79839a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo79431c(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C18406wa.m79839a(objM79839a, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) C18406wa.m79839a(objM79839a, X509TrustManager.class, "trustManager");
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public Object mo79424a(String str) {
        return this.f56040k.m79465a(str);
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        if (!this.f56035f.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f56038i.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79425a(int i, String str, Throwable th) {
        int iMin;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public SSLContext mo79429b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79426a(String str, Object obj) {
        if (this.f56040k.m79466a(obj)) {
            return;
        }
        mo79425a(5, str, (Throwable) null);
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public boolean mo79430b(String str) {
        try {
            try {
                Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                return m79461b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return super.mo79430b(str);
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m79461b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m79460a(str, cls, obj);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79427a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C18313p8.m79384a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) throws IOException {
        if (this.f56035f.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f56036g.invoke(sSLSocket, Boolean.TRUE);
                    this.f56037h.invoke(sSLSocket, str);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new AssertionError(e);
                }
            }
            this.f56039j.invoke(sSLSocket, C18406wa.m79841b(list));
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m79460a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo79430b(str);
        }
    }
}
