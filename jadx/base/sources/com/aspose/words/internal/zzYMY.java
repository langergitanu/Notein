package com.aspose.words.internal;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMY extends ECParameterSpec {

    /* JADX INFO: renamed from: l */
    private final zzZ33 f51235l;
    private final byte[] zzWtc;

    public zzYMY(zzZ33 zzz33) {
        this(zzz33, zzYMR.zzP(zzz33), zzZ8I.zzXIv());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzYMY) {
            return this.f51235l.equals(((zzYMY) obj).f51235l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51235l.hashCode();
    }

    public final byte[] zzXIw() {
        return zzYGU.zzVI(this.zzWtc);
    }

    private zzYMY(zzZ33 zzz33, ECParameterSpec eCParameterSpec, byte[] bArr) {
        super(eCParameterSpec.getCurve(), eCParameterSpec.getGenerator(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        this.f51235l = zzz33;
        this.zzWtc = zzYGU.zzVI(bArr);
    }
}
