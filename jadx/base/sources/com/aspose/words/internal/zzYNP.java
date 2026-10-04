package com.aspose.words.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNP extends SecretKeySpec implements Destroyable {
    private transient zzYUD zzVPP;
    private final AtomicBoolean zzWlx;

    public zzYNP(zzYUD zzyud) {
        this(zzyud, zzYNC.zzS(zzyud.zzXGV()));
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzVPP = null;
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final String getAlgorithm() {
        zzYPJ.zzZ(this);
        return super.getAlgorithm();
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final byte[] getEncoded() {
        zzYPJ.zzZ(this);
        return zzYGU.zzVI(this.zzVPP.zzXK4());
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final String getFormat() {
        zzYPJ.zzZ(this);
        return "RAW";
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzWlx.get();
    }

    public final zzZ46 zzXAj() {
        zzYPJ.zzZ(this);
        return new zzZ43(this.zzVPP.zzXGV(), this.zzVPP.zzXK4());
    }

    public zzYNP(zzYUD zzyud, String str) {
        super(zzyud.zzXK4(), str);
        this.zzWlx = new AtomicBoolean(false);
        this.zzVPP = zzyud;
    }
}
