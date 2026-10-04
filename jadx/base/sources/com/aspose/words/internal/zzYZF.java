package com.aspose.words.internal;

import com.google.android.gms.stats.CodePackage;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZF {
    static final SecureRandom zzWbb = new zzZ();

    public static class zzZ extends SecureRandom {

        /* JADX INFO: renamed from: com.aspose.words.internal.zzYZF$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19092zzZ extends Provider {
            public C19092zzZ() {
                super("BCFIPS_TEST_RNG", 1.0d, "BCFIPS Test Secure Random Provider");
            }
        }

        public zzZ() {
            super(new zzY((byte) 0), new C19092zzZ());
        }

        public static class zzY extends SecureRandomSpi {
            private final AtomicLong zzWba;

            private zzY() {
                this.zzWba = new AtomicLong(System.currentTimeMillis());
            }

            @Override // java.security.SecureRandomSpi
            public final byte[] engineGenerateSeed(int i) {
                byte[] bArr = new byte[i];
                engineNextBytes(bArr);
                return bArr;
            }

            @Override // java.security.SecureRandomSpi
            public final void engineNextBytes(byte[] bArr) {
                zzYZP zzyzp = new zzYZP();
                int iZzQI = zzyzp.zzQI();
                byte[] bArr2 = new byte[iZzQI];
                byte[] bArr3 = new byte[8];
                int i = 0;
                for (int length = bArr.length; length > 0; length -= iZzQI) {
                    zzYGN.zzW(this.zzWba.getAndIncrement(), bArr3, 0);
                    zzyzp.update(bArr3, 0, 8);
                    zzyzp.doFinal(bArr2, 0);
                    if (length > iZzQI) {
                        System.arraycopy(bArr2, 0, bArr, i, iZzQI);
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i, length);
                    }
                    i += iZzQI;
                }
            }

            @Override // java.security.SecureRandomSpi
            public final void engineSetSeed(byte[] bArr) {
            }

            public /* synthetic */ zzY(byte b) {
                this();
            }
        }
    }

    public static void checkPermission(final Permission permission) {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYZF.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    securityManager.checkPermission(permission);
                    return null;
                }
            });
        }
    }

    public static int zzX(zzYM1 zzym1) {
        int fieldSize = zzym1.getFieldSize();
        if (fieldSize >= 512) {
            return 256;
        }
        if (fieldSize >= 384) {
            return 192;
        }
        if (fieldSize >= 256) {
            return 128;
        }
        if (fieldSize >= 224) {
            return 112;
        }
        if (fieldSize >= 160) {
            return 80;
        }
        throw new zzZ0H("Requested security strength unknown");
    }

    public static void zzY(SecureRandom secureRandom, int i, zzZ1P zzz1p) {
        zzZ(secureRandom, i, zzz1p, "Attempt to create key pair with unapproved RNG");
    }

    public static void zzZ(SecureRandom secureRandom, String str) {
        if (!(secureRandom instanceof zzZ0O) && !(secureRandom.getProvider() instanceof zzYQ8)) {
            throw new zzZ0H(str);
        }
    }

    public static int zzfx(int i) {
        if (i >= 15360) {
            return 256;
        }
        if (i >= 7680) {
            return 192;
        }
        if (i >= 3072) {
            return 128;
        }
        if (i >= 2048) {
            return 112;
        }
        if (i >= 1024) {
            return 80;
        }
        throw new zzZ0H("Requested security strength unknown");
    }

    public static int zzY(zzZ5W zzz5w, int i) {
        return (zzz5w.getName().endsWith("GMAC") || zzz5w.getName().endsWith("CMAC") || zzz5w.getName().endsWith(CodePackage.GCM)) ? i : i / 2;
    }

    public static void zzZ(SecureRandom secureRandom, zzZ1P zzz1p, String str) {
        if (!(secureRandom instanceof zzZ0O) && !(secureRandom.getProvider() instanceof zzYQ8)) {
            throw new zzZ0H(str, zzz1p);
        }
    }

    public static void zzZ(SecureRandom secureRandom, int i, zzZ1P zzz1p, String str) {
        if (secureRandom instanceof zzZ0O) {
            if (((zzZ0O) secureRandom).zzXGf() < i) {
                throw new zzZ0H("FIPS SecureRandom security strength not as high as required for operation", zzz1p);
            }
        } else {
            if (secureRandom.getProvider() instanceof zzYQ8) {
                if (((zzYQ8) secureRandom.getProvider()).zzXBm() < i) {
                    throw new zzZ0H("FIPS SecureRandom security strength not as high as required for operation", zzz1p);
                }
                return;
            }
            throw new zzZ0H(str, zzz1p);
        }
    }

    public static void zzZ(SecureRandom secureRandom, int i, zzZ1P zzz1p) {
        zzZ(secureRandom, i, zzz1p, "Attempt to create key with unapproved RNG");
    }

    public static void zzZ(boolean z, zzZ1P zzz1p) {
        if (z != zzZ5L.zzXH0()) {
            if (z) {
                throw new zzZ0H("Attempt to use approved implementation in unapproved thread", zzz1p);
            }
            throw new zzZ0H("Attempt to use unapproved implementation in approved thread", zzz1p);
        }
    }

    public static zzYS8 zzZ(zzYUD zzyud) {
        return new zzYS7(zzyud.zzXK4());
    }

    public static zzYS4 zzZ(zzYUD zzyud, byte[] bArr) {
        return new zzYS4(new zzYS7(zzyud.zzXK4()), bArr);
    }

    public static zzYT3 zzZ(zzYUD zzyud, byte[] bArr, int i) {
        return new zzYT3(new zzYS7(zzyud.zzXK4()), i, bArr);
    }
}
