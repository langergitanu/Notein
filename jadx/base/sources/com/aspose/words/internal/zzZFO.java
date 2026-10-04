package com.aspose.words.internal;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZFO extends zzZF1 {
    transient zzZF2 zzWMM;
    int zzWMN;
    int zzWMO;
    int zzWMP;
    long zzWMQ;
    protected int zzWMR;
    zzZF7 zzWMS;
    final String zzYrz;
    protected char[] zzZnz;

    public zzZFO(zzZF1 zzzf1, String str, String str2, zzZF7 zzzf7) {
        super(zzzf1, str);
        this.zzWMQ = 0L;
        this.zzWMP = 1;
        this.zzWMO = 0;
        this.zzWMN = 0;
        this.zzWMM = null;
        this.zzWMS = zzzf7;
        this.zzYrz = str2;
    }

    @Override // com.aspose.words.internal.zzZF1
    public final String getSystemId() {
        zzZF7 zzzf7 = this.zzWMS;
        if (zzzf7 == null) {
            return null;
        }
        return zzzf7.toString();
    }

    @Override // com.aspose.words.internal.zzZF1
    public final zzZF2 zzV(long j, int i, int i2) {
        zzZF2 zzzf2ZzXNG;
        zzZF1 zzzf1 = this.zzWLO;
        if (zzzf1 == null) {
            zzzf2ZzXNG = null;
        } else {
            if (this.zzWMM == null) {
                this.zzWMM = zzzf1.zzXNG();
            }
            zzzf2ZzXNG = this.zzWLO.zzXNG();
        }
        return new zzZF2(zzzf2ZzXNG, this.zzYrz, getSystemId(), j, i, i2);
    }

    @Override // com.aspose.words.internal.zzZF1
    public final void zzX(zzZF3 zzzf3) {
        zzzf3.zzWLX = this.zzZnz;
        zzzf3.zzWMh = this.zzWMR;
        zzzf3.zzWMi = this.zzWMN;
        zzzf3.zzWLW = this.zzWMQ;
        zzzf3.zzWLV = this.zzWMP;
        zzzf3.zzWLU = this.zzWMO;
    }

    @Override // com.aspose.words.internal.zzZF1
    public final zzZF2 zzXNG() {
        long j = this.zzWMQ;
        int i = this.zzWMN;
        return zzV((j + ((long) i)) - 1, this.zzWMP, (i - this.zzWMO) + 1);
    }

    @Override // com.aspose.words.internal.zzZF1
    public final URL zzXNH() throws IOException {
        zzZF7 zzzf7 = this.zzWMS;
        if (zzzf7 == null) {
            return null;
        }
        return zzzf7.zzXN9();
    }

    @Override // com.aspose.words.internal.zzZF1
    public final void zzY(zzZF3 zzzf3) {
        this.zzWMN = zzzf3.zzWMi;
        this.zzWMQ = zzzf3.zzWLW;
        this.zzWMP = zzzf3.zzWLV;
        this.zzWMO = zzzf3.zzWLU;
    }

    @Override // com.aspose.words.internal.zzZF1
    public abstract void zzZ(zzZF3 zzzf3);
}
