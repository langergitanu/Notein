package com.huawei.hms.network.embedded;

import android.os.Build;
import android.util.Log;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.qa */
/* JADX INFO: loaded from: classes9.dex */
public class C18328qa extends C18406wa {

    /* JADX INFO: renamed from: k */
    public static final int f55969k = 4000;

    /* JADX INFO: renamed from: e */
    public final Class<?> f55970e;

    /* JADX INFO: renamed from: f */
    public final C18393va<Socket> f55971f;

    /* JADX INFO: renamed from: g */
    public final C18393va<Socket> f55972g;

    /* JADX INFO: renamed from: h */
    public final C18393va<Socket> f55973h;

    /* JADX INFO: renamed from: i */
    public final C18393va<Socket> f55974i;

    /* JADX INFO: renamed from: j */
    public final c f55975j = c.m79432a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.qa$a */
    public static final class a extends AbstractC18107ab {

        /* JADX INFO: renamed from: a */
        public final Object f55976a;

        /* JADX INFO: renamed from: b */
        public final Method f55977b;

        public a(Object obj, Method method) {
            this.f55976a = obj;
            this.f55977b = method;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18107ab
        /* JADX INFO: renamed from: a */
        public List<Certificate> mo77913a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f55977b.invoke(this.f55976a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, str);
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

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.qa$b */
    public static final class b implements InterfaceC18149db {

        /* JADX INFO: renamed from: a */
        public final X509TrustManager f55978a;

        /* JADX INFO: renamed from: b */
        public final Method f55979b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f55979b = method;
            this.f55978a = x509TrustManager;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18149db
        /* JADX INFO: renamed from: a */
        public X509Certificate mo78256a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f55979b.invoke(this.f55978a, x509Certificate);
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f55978a.equals(bVar.f55978a) && this.f55979b.equals(bVar.f55979b);
        }

        public int hashCode() {
            return (this.f55979b.hashCode() * 31) + this.f55978a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.qa$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Method f55980a;

        /* JADX INFO: renamed from: b */
        public final Method f55981b;

        /* JADX INFO: renamed from: c */
        public final Method f55982c;

        public c(Method method, Method method2, Method method3) {
            this.f55980a = method;
            this.f55981b = method2;
            this.f55982c = method3;
        }

        /* JADX INFO: renamed from: a */
        public static c m79432a() {
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
            return new c(method, method3, method2);
        }

        /* JADX INFO: renamed from: a */
        public Object m79433a(String str) {
            Method method = this.f55980a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f55981b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m79434a(Object obj) {
            if (obj != null) {
                try {
                    this.f55982c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public C18328qa(Class<?> cls, C18393va<Socket> c18393va, C18393va<Socket> c18393va2, C18393va<Socket> c18393va3, C18393va<Socket> c18393va4) {
        this.f55970e = cls;
        this.f55971f = c18393va;
        this.f55972g = c18393va2;
        this.f55973h = c18393va3;
        this.f55974i = c18393va4;
    }

    /* JADX INFO: renamed from: i */
    public static C18406wa m79420i() {
        Class<?> cls;
        C18393va c18393va;
        C18393va c18393va2;
        if (m79421j() == 0 || m79421j() >= 21) {
            return null;
        }
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            C18393va c18393va3 = new C18393va(null, "setUseSessionTickets", Boolean.TYPE);
            C18393va c18393va4 = new C18393va(null, "setHostname", String.class);
            if (m79422k()) {
                c18393va = new C18393va(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                c18393va2 = new C18393va(null, "setAlpnProtocols", byte[].class);
            } else {
                c18393va = null;
                c18393va2 = null;
            }
            return new C18328qa(cls2, c18393va3, c18393va4, c18393va, c18393va2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m79421j() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m79422k() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
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
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo79428b(x509TrustManager);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: c */
    public X509TrustManager mo79431c(SSLSocketFactory sSLSocketFactory) {
        Object objM79839a = C18406wa.m79839a(sSLSocketFactory, this.f55970e, "sslParameters");
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
        return this.f55975j.m79433a(str);
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        byte[] bArr;
        C18393va<Socket> c18393va = this.f55973h;
        if (c18393va == null || !c18393va.m79789a(sSLSocket) || (bArr = (byte[]) this.f55973h.m79792d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, Charset.forName("UTF-8"));
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
        if (this.f55975j.m79434a(obj)) {
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
                return m79419b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return super.mo79430b(str);
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m79419b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m79418a(str, cls, obj);
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
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) {
        if (str != null) {
            this.f55971f.m79791c(sSLSocket, Boolean.TRUE);
            this.f55972g.m79791c(sSLSocket, str);
        }
        C18393va<Socket> c18393va = this.f55974i;
        if (c18393va == null || !c18393va.m79789a(sSLSocket)) {
            return;
        }
        this.f55974i.m79792d(sSLSocket, C18406wa.m79841b(list));
    }

    /* JADX INFO: renamed from: a */
    private boolean m79418a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo79430b(str);
        }
    }
}
