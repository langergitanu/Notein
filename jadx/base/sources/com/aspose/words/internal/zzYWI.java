package com.aspose.words.internal;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWI {
    private static byte[] zzY(final zzZ46 zzz46) {
        return (byte[]) AccessController.doPrivileged(new PrivilegedAction<byte[]>() { // from class: com.aspose.words.internal.zzYWI.1
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
