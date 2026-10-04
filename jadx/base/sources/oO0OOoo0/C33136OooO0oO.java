package oO0OOoo0;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

/* JADX INFO: renamed from: oO0OOoo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33136OooO0oO implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final Method run() throws Exception {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
