package com.aspose.words.internal;

import com.aspose.words.internal.zzZ5L;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMS extends ECParameterSpec {
    public zzYMS() {
        this(zzYMR.zzP((zzZ33) zzZ5L.zzZ(zzZ5L.zzZ.zzWlH)));
    }

    public zzYMS(zzZ30 zzz30) {
        this(zzYMR.zzP(zzz30));
    }

    private zzYMS(ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec.getCurve(), eCParameterSpec.getGenerator(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
    }
}
