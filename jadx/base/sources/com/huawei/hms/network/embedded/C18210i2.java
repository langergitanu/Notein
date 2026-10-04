package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.network.exception.NetworkCanceledException;
import com.huawei.hms.network.exception.NetworkInternalException;
import com.huawei.hms.network.exception.NetworkTimeoutException;
import com.huawei.hms.network.exception.NetworkUnsupportedException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18210i2 {

    /* JADX INFO: renamed from: a */
    public static final String f55089a = "ErrorCodeUtil";

    /* JADX INFO: renamed from: b */
    public static final int f55090b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f55091c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f55092d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f55093e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f55094f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f55095g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f55096h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f55097i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f55098j = 9;

    /* JADX INFO: renamed from: k */
    public static final int f55099k = 10;

    /* JADX INFO: renamed from: l */
    public static final int f55100l = 11;

    /* JADX INFO: renamed from: m */
    public static final int f55101m = 12;

    /* JADX INFO: renamed from: n */
    public static final int f55102n = 13;

    /* JADX INFO: renamed from: o */
    public static final int f55103o = 14;

    /* JADX INFO: renamed from: a */
    public static int m78753a(int i) {
        return i == 404 ? 8 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m78754a(IOException iOException) {
        if (iOException instanceof PortUnreachableException) {
            return 2;
        }
        if ((iOException instanceof ConnectException) || (iOException instanceof HttpRetryException)) {
            return 3;
        }
        if (iOException instanceof SocketTimeoutException) {
            return 4;
        }
        if (iOException instanceof UnknownHostException) {
            return 5;
        }
        if (iOException instanceof NoRouteToHostException) {
            return 6;
        }
        if (iOException instanceof UnknownServiceException) {
            return 7;
        }
        if (iOException instanceof ProtocolException) {
            return 9;
        }
        if (iOException instanceof SSLKeyException) {
            return 11;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return 12;
        }
        if (iOException instanceof SSLProtocolException) {
            return 13;
        }
        if (iOException instanceof SSLHandshakeException) {
            return 14;
        }
        return iOException instanceof SSLException ? 10 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m78755a(Exception exc) {
        return exc instanceof NetworkCanceledException ? ExceptionCode.CANCEL : exc instanceof NetworkTimeoutException ? ExceptionCode.NETWORK_TIMEOUT : exc instanceof NetworkUnsupportedException ? ExceptionCode.NETWORK_UNSUPPORTED : exc instanceof NetworkInternalException ? ExceptionCode.CRASH_EXCEPTION : ExceptionCode.getErrorCodeFromException(exc);
    }
}
