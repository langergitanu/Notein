package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public class zzZP extends zzZL implements Cloneable {
    private zzEP zzO;
    private byte[] zzP;
    private boolean zzYI;
    private long zzYV;
    private long zzZN;
    private Collection<zz4> zzZa;

    public zzZP(long j, long j2, byte[] bArr) {
        this(j, j2, bArr, null);
    }

    public final byte[] getImageBytes() {
        return this.zzP;
    }

    public final int getImageType() throws Exception {
        return zzEF.zzZU(this.zzP);
    }

    public final long getSize() {
        return this.zzYV;
    }

    @Override // com.aspose.words.internal.zzZL
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setImageBytes(byte[] bArr) {
        this.zzP = bArr;
    }

    public final void setSize(long j) {
        this.zzYV = j;
    }

    public final Collection<zz4> zzM(int i) {
        if (this.zzZa == null) {
            this.zzZa = new ArrayList(i);
        }
        return this.zzZa;
    }

    public final void zzY(long j) {
        this.zzZN = j;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final void zzZ7() {
        this.zzZa = null;
    }

    public final Collection<zz4> zzZ8() {
        return zzM(0);
    }

    public final void zzZ9() {
        this.zzYI = true;
    }

    public final long zzZT() {
        return this.zzZN;
    }

    public final boolean zzZa() {
        return this.zzYI;
    }

    public final Collection<zz4> zzZb() {
        return this.zzZa;
    }

    public final void zzZc() {
        this.zzO = null;
    }

    public final zzEP zzZd() {
        return this.zzO;
    }

    public final zzZQ4 zzZj() {
        return new zzZQ4(this.zzZN, this.zzYV);
    }

    public zzZP(long j, long j2, byte[] bArr, zzEP zzep) {
        this.zzZN = j;
        this.zzYV = j2;
        this.zzO = zzep;
        this.zzP = zzXN.zzV(bArr);
    }

    public static zzZP zzY(zzZP zzzp) throws Exception {
        zzZP zzzp2 = (zzZP) zzzp.memberwiseClone();
        zzzp2.zzP = zzEF.zzDL();
        zzzp2.zzO = null;
        return zzzp2;
    }
}
