package com.huawei.hms.network.embedded;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.pa */
/* JADX INFO: loaded from: classes9.dex */
public class C18315pa extends C18341ra {
    public C18315pa(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    private void m79397c(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C18406wa m79398i() {
        if (!C18406wa.m79846g()) {
            return null;
        }
        try {
            if (C18341ra.m79463j() >= 29) {
                return new C18315pa(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.C18341ra, com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) throws IOException {
        try {
            m79397c(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C18406wa.m79840a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18341ra, com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
