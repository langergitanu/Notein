package com.aspose.words.internal;

import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZZ {
    public static void checkPermission(final Permission permission) {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYZZ.2
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    securityManager.checkPermission(permission);
                    return null;
                }
            });
        }
    }

    private static byte[] zzY(final zzZ46 zzz46) {
        return (byte[]) AccessController.doPrivileged(new PrivilegedAction<byte[]>() { // from class: com.aspose.words.internal.zzYZZ.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDZ, reason: merged with bridge method [inline-methods] */
            public byte[] run() {
                return zzz46.zzXK4();
            }
        });
    }

    public static zzYUD zzZ(zzZ46 zzz46) {
        return new zzYUD(zzz46.zzXGV(), zzY(zzz46));
    }
}
