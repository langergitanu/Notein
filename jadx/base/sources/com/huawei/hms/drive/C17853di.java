package com.huawei.hms.drive;

import android.os.Build;
import android.util.Log;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.drive.di */
/* JADX INFO: loaded from: classes6.dex */
class C17853di extends C17858dn {

    /* JADX INFO: renamed from: a */
    private final Class<?> f53359a;

    /* JADX INFO: renamed from: b */
    private final C17857dm<Socket> f53360b;

    /* JADX INFO: renamed from: c */
    private final C17857dm<Socket> f53361c;

    /* JADX INFO: renamed from: d */
    private final C17857dm<Socket> f53362d;

    /* JADX INFO: renamed from: e */
    private final C17857dm<Socket> f53363e;

    /* JADX INFO: renamed from: f */
    private final c f53364f = c.m76737a();

    /* JADX INFO: renamed from: com.huawei.hms.drive.di$a */
    public static final class a extends AbstractC17863ds {

        /* JADX INFO: renamed from: a */
        private final Object f53365a;

        /* JADX INFO: renamed from: b */
        private final Method f53366b;

        public a(Object obj, Method method) {
            this.f53365a = obj;
            this.f53366b = method;
        }

        @Override // com.huawei.hms.drive.AbstractC17863ds
        /* JADX INFO: renamed from: a */
        public List<Certificate> mo76735a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f53366b.invoke(this.f53365a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, str);
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

    /* JADX INFO: renamed from: com.huawei.hms.drive.di$b */
    public static final class b implements InterfaceC17865du {

        /* JADX INFO: renamed from: a */
        private final X509TrustManager f53367a;

        /* JADX INFO: renamed from: b */
        private final Method f53368b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f53368b = method;
            this.f53367a = x509TrustManager;
        }

        @Override // com.huawei.hms.drive.InterfaceC17865du
        /* JADX INFO: renamed from: a */
        public X509Certificate mo76736a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f53368b.invoke(this.f53367a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw C17806bp.m76327a("unable to get issues and signature", (Exception) e);
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
            return this.f53367a.equals(bVar.f53367a) && this.f53368b.equals(bVar.f53368b);
        }

        public int hashCode() {
            return (this.f53368b.hashCode() * 31) + this.f53367a.hashCode();
        }
    }

    public C17853di(Class<?> cls, C17857dm<Socket> c17857dm, C17857dm<Socket> c17857dm2, C17857dm<Socket> c17857dm3, C17857dm<Socket> c17857dm4) {
        this.f53359a = cls;
        this.f53360b = c17857dm;
        this.f53361c = c17857dm2;
        this.f53362d = c17857dm3;
        this.f53363e = c17857dm4;
    }

    /* JADX INFO: renamed from: d */
    public static int m76726d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76731a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C17806bp.m76341a(e)) {
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

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: b */
    public boolean mo76733b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m76723a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo76733b(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw C17806bp.m76327a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C17806bp.m76327a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C17806bp.m76327a("unable to determine cleartext support", e);
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: c */
    public SSLContext mo76734c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.di$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final Method f53369a;

        /* JADX INFO: renamed from: b */
        private final Method f53370b;

        /* JADX INFO: renamed from: c */
        private final Method f53371c;

        public c(Method method, Method method2, Method method3) {
            this.f53369a = method;
            this.f53370b = method2;
            this.f53371c = method3;
        }

        /* JADX INFO: renamed from: a */
        public Object m76738a(String str) {
            Method method = this.f53369a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f53370b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m76739a(Object obj) {
            if (obj != null) {
                try {
                    this.f53371c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public static c m76737a() {
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
    }

    /* JADX INFO: renamed from: b */
    private boolean m76725b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo76733b(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17858dn m76724b() {
        Class<?> cls;
        C17857dm c17857dm;
        C17857dm c17857dm2;
        try {
            if (m76726d() == 0) {
                return null;
            }
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            C17857dm c17857dm3 = new C17857dm(null, "setUseSessionTickets", Boolean.TYPE);
            C17857dm c17857dm4 = new C17857dm(null, "setHostname", String.class);
            if (m76722a()) {
                c17857dm = new C17857dm(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                c17857dm2 = new C17857dm(null, "setAlpnProtocols", byte[].class);
            } else {
                c17857dm = null;
                c17857dm2 = null;
            }
            return new C17853di(cls2, c17857dm3, c17857dm4, c17857dm, c17857dm2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76721a(SSLSocket sSLSocket, String str, List<EnumC17796bf> list) {
        if (str != null) {
            this.f53360b.m76750b(sSLSocket, Boolean.TRUE);
            this.f53361c.m76750b(sSLSocket, str);
        }
        C17857dm<Socket> c17857dm = this.f53363e;
        if (c17857dm == null || !c17857dm.m76749a(sSLSocket)) {
            return;
        }
        this.f53363e.m76752d(sSLSocket, C17858dn.m76755b(list));
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public String mo76720a(SSLSocket sSLSocket) {
        byte[] bArr;
        C17857dm<Socket> c17857dm = this.f53362d;
        if (c17857dm == null || !c17857dm.m76749a(sSLSocket) || (bArr = (byte[]) this.f53362d.m76752d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C17806bp.f52958e);
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: b */
    public InterfaceC17865du mo76732b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo76732b(x509TrustManager);
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76729a(int i, String str, Throwable th) {
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

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public Object mo76728a(String str) {
        return this.f53364f.m76738a(str);
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76730a(String str, Object obj) {
        if (this.f53364f.m76739a(obj)) {
            return;
        }
        mo76729a(5, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: a */
    private boolean m76723a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m76725b(str, cls, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m76722a() {
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

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public AbstractC17863ds mo76727a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo76727a(x509TrustManager);
        }
    }
}
