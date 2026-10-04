package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYG5 implements zzYG4 {
    private static final List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: eU */
    private List f50808eU;

    /* JADX INFO: renamed from: eV */
    private byte[] f50809eV;
    private String type;

    public zzYG5(String str, byte[] bArr) {
        this(str, EMPTY_LIST, bArr);
    }

    public final String getType() {
        return this.type;
    }

    @Override // com.aspose.words.internal.zzYG4
    public final zzYG5 zzXyj() throws zzYG7 {
        return this;
    }

    public final byte[] zzXyk() {
        return zzYGU.zzVI(this.f50809eV);
    }

    public final List zzXyl() {
        return this.f50808eU;
    }

    private zzYG5(String str, List list, byte[] bArr) {
        this.type = str;
        this.f50808eU = Collections.unmodifiableList(list);
        this.f50809eV = zzYGU.zzVI(bArr);
    }
}
