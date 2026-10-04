package com.huawei.hms.network.embedded;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.wa */
/* JADX INFO: loaded from: classes9.dex */
public class C18406wa {

    /* JADX INFO: renamed from: b */
    public static final int f56549b = 4;

    /* JADX INFO: renamed from: c */
    public static final int f56550c = 5;

    /* JADX INFO: renamed from: a */
    public static final C18406wa f56548a = m79844e();

    /* JADX INFO: renamed from: d */
    public static final Logger f56551d = Logger.getLogger(C18118b8.class.getName());

    /* JADX INFO: renamed from: c */
    public static C18406wa m79842c() {
        C18406wa c18406waM79398i = C18315pa.m79398i();
        if (c18406waM79398i != null) {
            return c18406waM79398i;
        }
        C18406wa c18406waM79420i = C18328qa.m79420i();
        if (c18406waM79420i != null) {
            return c18406waM79420i;
        }
        C18406wa c18406waM79462i = C18341ra.m79462i();
        if (c18406waM79462i != null) {
            return c18406waM79462i;
        }
        throw new NullPointerException("No platform found on Android");
    }

    /* JADX INFO: renamed from: d */
    public static C18406wa m79843d() {
        C18354sa c18354saM79535i;
        if (m79847h() && (c18354saM79535i = C18354sa.m79535i()) != null) {
            return c18354saM79535i;
        }
        C18380ua c18380uaM79654i = C18380ua.m79654i();
        if (c18380uaM79654i != null) {
            return c18380uaM79654i;
        }
        C18406wa c18406waM79571i = C18367ta.m79571i();
        return c18406waM79571i != null ? c18406waM79571i : new C18406wa();
    }

    /* JADX INFO: renamed from: e */
    public static C18406wa m79844e() {
        return m79846g() ? m79842c() : m79843d();
    }

    /* JADX INFO: renamed from: f */
    public static C18406wa m79845f() {
        return f56548a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m79846g() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m79847h() {
        if ("conscrypt".equals(C18313p8.m79365a("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* JADX INFO: renamed from: a */
    public AbstractC18107ab m79848a(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager x509TrustManagerMo79431c = mo79431c(sSLSocketFactory);
        if (x509TrustManagerMo79431c != null) {
            return mo79423a(x509TrustManagerMo79431c);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + m79845f() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC18149db mo79428b(X509TrustManager x509TrustManager) {
        return new C18445za(x509TrustManager.getAcceptedIssuers());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public AbstractC18107ab mo79423a(X509TrustManager x509TrustManager) {
        return new C18432ya(mo79428b(x509TrustManager));
    }

    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public X509TrustManager mo79431c(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objM79839a = m79839a(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objM79839a == null) {
                return null;
            }
            return (X509TrustManager) m79839a(objM79839a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m79839a(Object obj, Class<T> cls, String str) {
        Object objM79839a;
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (objM79839a = m79839a(obj, (Class<Object>) Object.class, "delegate")) == null) {
            return null;
        }
        return (T) m79839a(objM79839a, cls, str);
    }

    /* JADX INFO: renamed from: b */
    public SSLContext mo79429b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public Object mo79424a(String str) {
        if (f56551d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void mo79537b(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: a */
    public String m79849a() {
        return "OkHttp";
    }

    /* JADX INFO: renamed from: b */
    public boolean mo79430b(String str) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m79840a(List<EnumC18132c8> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC18132c8 enumC18132c8 = list.get(i);
            if (enumC18132c8 != EnumC18132c8.HTTP_1_0) {
                arrayList.add(enumC18132c8.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m79841b(List<EnumC18132c8> list) {
        C18261lb c18261lb = new C18261lb();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC18132c8 enumC18132c8 = list.get(i);
            if (enumC18132c8 != EnumC18132c8.HTTP_1_0) {
                c18261lb.writeByte(enumC18132c8.toString().length());
                c18261lb.mo78261a(enumC18132c8.toString());
            }
        }
        return c18261lb.mo78400q();
    }

    /* JADX INFO: renamed from: a */
    public void mo79425a(int i, String str, Throwable th) {
        f56551d.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: a */
    public void mo79426a(String str, Object obj) {
        if (obj == null) {
            str = C21111o0ooOoO.OooO0Oo(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo79425a(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: a */
    public void mo79427a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo79572a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) throws IOException {
    }
}
