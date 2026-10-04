package oO0OOoo0;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

/* JADX INFO: renamed from: oO0OOoo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33137OooO0oo implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final Method run() throws Exception {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
