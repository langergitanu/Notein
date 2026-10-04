package com.aspose.words.internal;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGM {
    public static boolean zzwd(final String str) {
        try {
            return TelemetryEventStrings.Value.TRUE.equals(AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: com.aspose.words.internal.zzYGM.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzZVZ, reason: merged with bridge method [inline-methods] */
                public String run() {
                    String property = Security.getProperty(str);
                    if (property == null && (property = System.getProperty(str)) == null) {
                        return null;
                    }
                    return zzYGI.toLowerCase(property);
                }
            }));
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
