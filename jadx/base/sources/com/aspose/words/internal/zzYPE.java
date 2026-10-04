package com.aspose.words.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPE extends SecretKeySpec implements PBEKey, Destroyable {
    private final char[] zzVX1;
    private final byte[] zzWAR;
    private final int zzWfC;
    private final AtomicBoolean zzWlx;

    public zzYPE(byte[] bArr, String str, PBEKeySpec pBEKeySpec) {
        super(bArr, str);
        this.zzWlx = new AtomicBoolean(false);
        this.zzVX1 = pBEKeySpec.getPassword();
        this.zzWAR = pBEKeySpec.getSalt();
        this.zzWfC = pBEKeySpec.getIterationCount();
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        char[] cArr = this.zzVX1;
        if (cArr != null) {
            zzYGU.zzE(cArr);
        }
        byte[] bArr = this.zzWAR;
        if (bArr != null) {
            zzYGU.fill(bArr, (byte) 0);
        }
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this);
        return super.getAlgorithm();
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final byte[] getEncoded() {
        zzYPJ.zzZ(this);
        return super.getEncoded();
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final int getIterationCount() {
        zzYPJ.zzZ(this);
        return this.zzWfC;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final char[] getPassword() {
        zzYPJ.zzZ(this);
        return this.zzVX1;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final byte[] getSalt() {
        zzYPJ.zzZ(this);
        return zzYGU.zzVI(this.zzWAR);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzWlx.get();
    }
}
