package com.aspose.words.internal;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMV extends ECParameterSpec {

    /* JADX INFO: renamed from: l */
    private zzZ33 f51230l;

    public zzYMV(zzZ33 zzz33) {
        this(zzz33, zzYMR.zzP(zzz33));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzYMV) {
            return this.f51230l.equals(((zzYMV) obj).f51230l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51230l.hashCode();
    }

    public final String toString() {
        zzZ33 zzz33 = this.f51230l;
        return zzz33 instanceof zzZ2W ? ((zzZ2W) zzz33).zzXGj().getId() : super.toString();
    }

    public final zzZ33 zzXGy() {
        return this.f51230l;
    }

    public zzYMV(ECParameterSpec eCParameterSpec) {
        this(zzYMR.zzZ(eCParameterSpec), eCParameterSpec);
    }

    private zzYMV(zzZ33 zzz33, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec.getCurve(), eCParameterSpec.getGenerator(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        this.f51230l = zzz33;
    }
}
