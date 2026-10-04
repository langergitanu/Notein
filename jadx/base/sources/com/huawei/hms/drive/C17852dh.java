package com.huawei.hms.drive;

import android.net.ssl.SSLSockets;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.drive.dh */
/* JADX INFO: loaded from: classes6.dex */
class C17852dh extends C17853di {
    public C17852dh(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private void m76719c(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            Bundle.getByteArray(sSLSocket);
        }
    }

    @Override // com.huawei.hms.drive.C17853di, com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76721a(SSLSocket sSLSocket, String str, List<EnumC17796bf> list) {
        m76719c(sSLSocket);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        String[] strArr = (String[]) C17858dn.m76754a(list).toArray(new String[0]);
        try {
            Method method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            method.setAccessible(true);
            method.invoke(sSLParameters, strArr);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C17858dn.m76756e().mo76729a(5, "invoke setApplicationProtocols failed:".concat(e.getClass().getName()), new Exception());
        }
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.huawei.hms.drive.C17853di, com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public String mo76720a(SSLSocket sSLSocket) {
        String str;
        try {
            Method method = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            method.setAccessible(true);
            str = (String) method.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C17858dn.m76756e().mo76729a(5, "invoke getApplicationProtocol failed:".concat(e.getClass().getName()), new Exception());
            str = null;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static C17858dn m76718a() {
        try {
            if (C17853di.m76726d() >= 29) {
                return new C17852dh(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
