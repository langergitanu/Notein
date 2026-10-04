package com.huawei.hms.network.embedded;

import com.huawei.hms.network.exception.NetworkCanceledExceptionImpl;
import com.huawei.hms.network.exception.NetworkInternalExceptionImpl;
import com.huawei.hms.network.exception.NetworkTimeoutExceptionImpl;
import com.huawei.hms.network.exception.NetworkUnsupportedExceptionImpl;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18127c3 {
    /* JADX INFO: renamed from: a */
    public static IOException m78085a(String str) {
        return C18321q3.apiAvailable(4) ? new NetworkCanceledExceptionImpl(str) : new IOException(str);
    }

    /* JADX INFO: renamed from: b */
    public static IOException m78087b(String str) {
        return C18321q3.apiAvailable(4) ? new NetworkInternalExceptionImpl(str) : new IOException(str);
    }

    /* JADX INFO: renamed from: c */
    public static IOException m78089c(String str) {
        return C18321q3.apiAvailable(4) ? new NetworkTimeoutExceptionImpl(str) : new IOException(str);
    }

    /* JADX INFO: renamed from: d */
    public static IOException m78091d(String str) {
        return C18321q3.apiAvailable(4) ? new NetworkUnsupportedExceptionImpl(str) : new IOException(str);
    }

    /* JADX INFO: renamed from: a */
    public static IOException m78086a(String str, Throwable th) {
        return C18321q3.apiAvailable(4) ? new NetworkCanceledExceptionImpl(str, th) : new IOException(str, th);
    }

    /* JADX INFO: renamed from: b */
    public static IOException m78088b(String str, Throwable th) {
        return C18321q3.apiAvailable(4) ? new NetworkInternalExceptionImpl(str, th) : new IOException(str, th);
    }

    /* JADX INFO: renamed from: c */
    public static IOException m78090c(String str, Throwable th) {
        return C18321q3.apiAvailable(4) ? new NetworkTimeoutExceptionImpl(str, th) : new IOException(str, th);
    }

    /* JADX INFO: renamed from: d */
    public static IOException m78092d(String str, Throwable th) {
        return C18321q3.apiAvailable(4) ? new NetworkUnsupportedExceptionImpl(str, th) : new IOException(str, th);
    }
}
