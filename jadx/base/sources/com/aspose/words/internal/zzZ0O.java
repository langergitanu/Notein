package com.aspose.words.internal;

import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ0O extends SecureRandom {
    private final boolean zzWd8;
    private final SecureRandom zzWd9;
    private final zzZ2M zzWk0;

    public static class zzY extends SecureRandomSpi {
        private final boolean zzWd8;
        private final SecureRandom zzWd9;
        private final zzZ2M zzWk0;
        private final zzZ5G zzWk1;

        public zzY(SecureRandom secureRandom, zzZ2M zzz2m, zzZ5G zzz5g, boolean z) {
            this.zzWd9 = secureRandom;
            this.zzWk0 = zzz2m;
            this.zzWk1 = zzz5g;
            this.zzWd8 = z;
        }

        @Override // java.security.SecureRandomSpi
        public final byte[] engineGenerateSeed(int i) {
            return zzYRO.zzZ(this.zzWk1, i);
        }

        @Override // java.security.SecureRandomSpi
        public final void engineNextBytes(byte[] bArr) {
            synchronized (this.zzWk0) {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("bytes cannot be null");
                    }
                    if (bArr.length != 0 && this.zzWk0.zzY(bArr, null, this.zzWd8) < 0) {
                        this.zzWk0.zzXa(null);
                        this.zzWk0.zzY(bArr, null, this.zzWd8);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.security.SecureRandomSpi
        public final void engineSetSeed(byte[] bArr) {
            synchronized (this.zzWk0) {
                try {
                    SecureRandom secureRandom = this.zzWd9;
                    if (secureRandom != null) {
                        secureRandom.setSeed(bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class zzZ extends Provider {
        public zzZ() {
            super("BCFIPS_RNG", 1.0d, "BCFIPS Secure Random Provider");
        }
    }

    public zzZ0O(SecureRandom secureRandom, zzZ2M zzz2m, zzZ5G zzz5g, boolean z) {
        super(new zzY(secureRandom, zzz2m, zzz5g, z), new zzZ());
        this.zzWd9 = secureRandom;
        this.zzWk0 = zzz2m;
        this.zzWd8 = z;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        zzZ2M zzz2m = this.zzWk0;
        if (zzz2m != null) {
            synchronized (zzz2m) {
                this.zzWd9.setSeed(j);
            }
        }
    }

    public final void zzXEh() {
        this.zzWk0.zzXa(null);
    }

    public final int zzXGf() {
        return this.zzWk0.zzXGf();
    }
}
