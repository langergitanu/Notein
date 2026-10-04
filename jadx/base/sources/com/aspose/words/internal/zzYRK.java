package com.aspose.words.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRK implements SecretKey {
    private String zzVXe;
    private byte[] zzVXf;
    private SecretKey zzVXg;
    private final AtomicBoolean zzWlx = new AtomicBoolean(false);
    private final AtomicBoolean zzVXd = new AtomicBoolean(false);

    public zzYRK(SecretKey secretKey, String str, byte[] bArr) {
        this.zzVXg = secretKey;
        this.zzVXf = zzYGU.zzVI(bArr);
        this.zzVXe = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] zzXC2() {
        if (this.zzVXd.get()) {
            return null;
        }
        return this.zzVXf;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzVXg = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecretKey) {
            return this.zzVXg.equals(obj);
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        if (isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
        return this.zzVXg.getAlgorithm();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
        return this.zzVXg.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        if (isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
        return this.zzVXg.getFormat();
    }

    public final int hashCode() {
        return this.zzVXg.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzWlx.get();
    }

    public final zzYR3 zzXC1() {
        if (isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
        if (this.zzVXf == null) {
            return null;
        }
        return new zzYR3() { // from class: com.aspose.words.internal.zzYRK.1
            private void zzXGG() {
                zzYRK.this.zzVXd.set(true);
                if (zzYRK.this.zzVXf != null) {
                    zzYGU.fill(zzYRK.this.zzVXf, (byte) 0);
                }
            }

            @Override // javax.security.auth.Destroyable
            public final void destroy() {
                zzXGG();
            }

            @Override // java.security.Key
            public final String getAlgorithm() {
                return zzYRK.this.zzVXe;
            }

            @Override // java.security.Key
            public final byte[] getEncoded() {
                return zzYRK.this.zzXC2();
            }

            @Override // java.security.Key
            public final String getFormat() {
                return "RAW";
            }

            @Override // javax.security.auth.Destroyable
            public final boolean isDestroyed() {
                return zzYRK.this.zzVXd.get();
            }
        };
    }
}
