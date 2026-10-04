package com.huawei.hms.drive;

import android.os.Bundle;
import java.io.IOException;
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
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: com.huawei.hms.drive.dn */
/* JADX INFO: loaded from: classes6.dex */
public class C17858dn {

    /* JADX INFO: renamed from: a */
    private static final C17858dn f53385a = m76753a();

    /* JADX INFO: renamed from: b */
    private static final Logger f53386b = Logger.getLogger(C17795be.class.getName());

    /* JADX INFO: renamed from: e */
    public static C17858dn m76756e() {
        return f53385a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m76757f() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* JADX INFO: renamed from: a */
    public String mo76720a(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void mo76745b(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: c */
    public SSLContext mo76734c() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public void mo76721a(SSLSocket sSLSocket, String str, List<EnumC17796bf> list) {
    }

    /* JADX INFO: renamed from: b */
    public boolean mo76733b(String str) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m76755b(List<EnumC17796bf> list) {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC17796bf enumC17796bf = list.get(i);
            if (enumC17796bf != EnumC17796bf.HTTP_1_0) {
                c34524OooO0Oo.o0OoO0o(enumC17796bf.toString().length());
                c34524OooO0Oo.o000Oo0o(enumC17796bf.toString());
            }
        }
        return c34524OooO0Oo.o0000oo(c34524OooO0Oo.f123723OooOo);
    }

    /* JADX INFO: renamed from: a */
    public void mo76742a(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: a */
    public void mo76731a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo76729a(int i, String str, Throwable th) {
        f53386b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: a */
    public Object mo76728a(String str) {
        if (f53386b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void mo76730a(String str, Object obj) {
        String str2 = str;
        if (obj == null) {
            str2 = Bundle.getInt(str);
        }
        mo76729a(5, str2, (Throwable) obj);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC17865du mo76732b(X509TrustManager x509TrustManager) {
        return new C17862dr(x509TrustManager.getAcceptedIssuers());
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m76754a(List<EnumC17796bf> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC17796bf enumC17796bf = list.get(i);
            if (enumC17796bf != EnumC17796bf.HTTP_1_0) {
                arrayList.add(enumC17796bf.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC17863ds mo76727a(X509TrustManager x509TrustManager) {
        return new C17861dq(mo76732b(x509TrustManager));
    }

    /* JADX INFO: renamed from: a */
    private static C17858dn m76753a() {
        C17854dj c17854djM76740a;
        C17858dn c17858dnM76718a = C17852dh.m76718a();
        if (c17858dnM76718a != null) {
            return c17858dnM76718a;
        }
        C17858dn c17858dnM76724b = C17853di.m76724b();
        if (c17858dnM76724b != null) {
            return c17858dnM76724b;
        }
        if (m76757f() && (c17854djM76740a = C17854dj.m76740a()) != null) {
            return c17854djM76740a;
        }
        C17855dk c17855dkM76743a = C17855dk.m76743a();
        if (c17855dkM76743a != null) {
            return c17855dkM76743a;
        }
        C17858dn c17858dnM76744a = C17856dl.m76744a();
        return c17858dnM76744a != null ? c17858dnM76744a : new C17858dn();
    }
}
