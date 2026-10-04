package com.huawei.hms.drive;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.drive.dk */
/* JADX INFO: loaded from: classes6.dex */
final class C17855dk extends C17858dn {

    /* JADX INFO: renamed from: a */
    final Method f53372a;

    /* JADX INFO: renamed from: b */
    final Method f53373b;

    public C17855dk(Method method, Method method2) {
        this.f53372a = method;
        this.f53373b = method2;
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76721a(SSLSocket sSLSocket, String str, List<EnumC17796bf> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listM76754a = C17858dn.m76754a(list);
            this.f53372a.invoke(sSLParameters, listM76754a.toArray(new String[listM76754a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C17806bp.m76327a("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public String mo76720a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f53373b.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C17806bp.m76327a("unable to get selected protocols", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C17855dk m76743a() {
        try {
            return new C17855dk(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
