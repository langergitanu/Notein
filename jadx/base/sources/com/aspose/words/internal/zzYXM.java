package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYXM extends SecureRandom {
    private final SecureRandom zzWd9;
    private final zzZ5G zzWk1;

    private void zzWr(byte[] bArr) {
        synchronized (this) {
            try {
                if (bArr == null) {
                    throw new NullPointerException("bytes cannot be null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        return zzYRO.zzZ(this.zzWk1, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        zzWr(bArr);
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
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

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.zzWd9;
                if (secureRandom != null) {
                    secureRandom.setSeed(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
