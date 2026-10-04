package com.aspose.words.internal;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGV {

    /* JADX INFO: renamed from: eC */
    zzZ8O f50829eC;

    /* JADX INFO: renamed from: eD */
    Date f50830eD;

    public zzYGV(zzZ8O zzz8o) throws zzYH1, IOException {
        this.f50829eC = zzz8o;
        try {
            this.f50830eD = zzz8o.zzXIK().getDate();
        } catch (ParseException unused) {
            throw new zzYH1("unable to parse genTime field");
        }
    }

    public final BigInteger zzXyq() {
        if (this.f50829eC.zzXIJ() != null) {
            return this.f50829eC.zzXIJ().zzXKZ();
        }
        return null;
    }

    public final byte[] zzXyr() {
        return this.f50829eC.zzXIM().zzXIN();
    }

    public final zzZDA zzXys() {
        return this.f50829eC.zzXIM().zzXJ3().zzXJk();
    }
}
