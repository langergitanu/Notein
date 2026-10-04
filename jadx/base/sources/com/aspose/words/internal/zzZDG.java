package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZDG extends zzZD5 {
    protected int zzO1;
    protected int zzWIv = -1;
    protected zzZD5 zzWIw;
    protected zzZD5 zzWIx;
    protected zzZDD zzWIy;
    protected zzZDA zzWIz;

    public zzZDG(zzZDJ zzzdj) {
        int i = 0;
        zzZD5 zzzd5ZzZ = zzZ(zzzdj, 0);
        if (zzzd5ZzZ instanceof zzZDA) {
            this.zzWIz = (zzZDA) zzzd5ZzZ;
            zzzd5ZzZ = zzZ(zzzdj, 1);
            i = 1;
        }
        if (zzzd5ZzZ instanceof zzZDD) {
            this.zzWIy = (zzZDD) zzzd5ZzZ;
            i++;
            zzzd5ZzZ = zzZ(zzzdj, i);
        }
        if (!(zzzd5ZzZ instanceof zzZCY)) {
            this.zzWIx = zzzd5ZzZ;
            i++;
            zzzd5ZzZ = zzZ(zzzdj, i);
        }
        if (zzzdj.size() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(zzzd5ZzZ instanceof zzZCY)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        zzZCY zzzcy = (zzZCY) zzzd5ZzZ;
        zzZJ(zzzcy.zzXKy());
        this.zzWIw = zzzcy.zzXKw();
    }

    private static zzZD5 zzZ(zzZDJ zzzdj, int i) {
        if (zzzdj.size() > i) {
            return zzzdj.zzg8(i).zzXL0();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void zzZJ(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "invalid encoding value: "));
        }
        this.zzO1 = i;
    }

    public final int getEncoding() {
        return this.zzO1;
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        zzZDA zzzda = this.zzWIz;
        int iHashCode = zzzda != null ? zzzda.hashCode() : 0;
        zzZDD zzzdd = this.zzWIy;
        if (zzzdd != null) {
            iHashCode ^= zzzdd.hashCode();
        }
        zzZD5 zzzd5 = this.zzWIx;
        if (zzzd5 != null) {
            iHashCode ^= zzzd5.hashCode();
        }
        return iHashCode ^ this.zzWIw.hashCode();
    }

    public final zzZDD zzXKV() {
        return this.zzWIy;
    }

    public final zzZD5 zzXKW() {
        return this.zzWIw;
    }

    public final zzZDA zzXKX() {
        return this.zzWIz;
    }

    public final zzZD5 zzXKY() {
        return this.zzWIx;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        return this instanceof zzZCF ? this : new zzZCF(this.zzWIz, this.zzWIy, this.zzWIx, this.zzO1, this.zzWIw);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        if (this.zzWIv < 0) {
            this.zzWIv = getEncoded().length;
        }
        return this.zzWIv;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        zzZD5 zzzd52;
        zzZDD zzzdd;
        zzZDA zzzda;
        if (!(zzzd5 instanceof zzZDG)) {
            return false;
        }
        if (this == zzzd5) {
            return true;
        }
        zzZDG zzzdg = (zzZDG) zzzd5;
        zzZDA zzzda2 = this.zzWIz;
        if (zzzda2 != null && ((zzzda = zzzdg.zzWIz) == null || !zzzda.equals(zzzda2))) {
            return false;
        }
        zzZDD zzzdd2 = this.zzWIy;
        if (zzzdd2 != null && ((zzzdd = zzzdg.zzWIy) == null || !zzzdd.equals(zzzdd2))) {
            return false;
        }
        zzZD5 zzzd53 = this.zzWIx;
        if (zzzd53 == null || ((zzzd52 = zzzdg.zzWIx) != null && zzzd52.equals(zzzd53))) {
            return this.zzWIw.equals(zzzdg.zzWIw);
        }
        return false;
    }

    public zzZDG(zzZDA zzzda, zzZDD zzzdd, zzZD5 zzzd5, int i, zzZD5 zzzd52) {
        this.zzWIz = zzzda;
        this.zzWIy = zzzdd;
        this.zzWIx = zzzd5;
        zzZJ(i);
        this.zzWIw = zzzd52.zzXL0();
    }
}
