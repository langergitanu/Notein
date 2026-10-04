package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRP implements zzZ5F {
    private final boolean zzVXq;
    private final SecureRandom zzVXr;

    public zzYRP(SecureRandom secureRandom, boolean z) {
        this.zzVXr = secureRandom;
        this.zzVXq = z;
    }

    @Override // com.aspose.words.internal.zzZ5F
    public final zzZ5G zzg0(final int i) {
        return new zzZ5G() { // from class: com.aspose.words.internal.zzYRP.1
            @Override // com.aspose.words.internal.zzZ5G
            public final int zzXGW() {
                return i;
            }

            @Override // com.aspose.words.internal.zzZ5G
            public final byte[] zzXGX() {
                if (!(zzYRP.this.zzVXr instanceof zzZ0O) && !(zzYRP.this.zzVXr instanceof zzYXM) && !(zzYRP.this.zzVXr.getProvider() instanceof zzYQ8)) {
                    return zzYRP.this.zzVXr.generateSeed((i + 7) / 8);
                }
                byte[] bArr = new byte[(i + 7) / 8];
                zzYRP.this.zzVXr.nextBytes(bArr);
                return bArr;
            }
        };
    }
}
