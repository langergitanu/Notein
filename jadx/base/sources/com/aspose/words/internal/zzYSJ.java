package com.aspose.words.internal;

import com.orion.notein.domain.models.backup.BackupFile;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class zzYSJ implements zzYM2 {
    private final BigInteger zzWkJ;
    private final zzYLX zzWkK;
    private final byte[] zzWoA;
    private final zzYM1 zzWoB;
    private final BigInteger zzWov;
    private final BigInteger zzWow;

    public zzYSJ(zzZ33 zzz33) {
        this(zzz33.zzXHv(), zzz33.zzXHu(), zzz33.zzXIz(), zzz33.zzXHt(), zzz33.getSeed(), null);
    }

    public static zzYLX zzY(zzYM1 zzym1, zzYLX zzylx) {
        if (zzylx == null) {
            throw new IllegalArgumentException("Point has null value");
        }
        zzYLX zzylxZzXze = zzYM3.zzX(zzym1, zzylx).zzXze();
        if (zzylxZzXze.zzXzd()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (zzylxZzXze.isValid()) {
            return zzylxZzXze;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzYSJ) {
            zzYSJ zzysj = (zzYSJ) obj;
            if (this.zzWoB.zzV(zzysj.zzWoB) && this.zzWkK.zzU(zzysj.zzWkK) && this.zzWow.equals(zzysj.zzWow) && this.zzWov.equals(zzysj.zzWov)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.zzWov.hashCode() * 37) + (this.zzWow.hashCode() * 37) + (this.zzWkK.hashCode() * 37) + this.zzWoB.hashCode();
    }

    public final BigInteger zzXCh() {
        return this.zzWkJ;
    }

    public final BigInteger zzXHt() {
        return this.zzWov;
    }

    public final zzYLX zzXHu() {
        return this.zzWkK;
    }

    public final zzYM1 zzXHv() {
        return this.zzWoB;
    }

    public final BigInteger zzXIz() {
        return this.zzWow;
    }

    public zzYSJ(zzZ33 zzz33, BigInteger bigInteger) {
        this(zzz33.zzXHv(), zzz33.zzXHu(), zzz33.zzXIz(), zzz33.zzXHt(), zzz33.getSeed(), bigInteger);
    }

    private zzYSJ(zzYM1 zzym1, zzYLX zzylx, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        if (zzym1 == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger != null) {
            this.zzWoB = zzym1;
            this.zzWkK = zzY(zzym1, zzylx);
            this.zzWow = bigInteger;
            this.zzWov = bigInteger2;
            this.zzWoA = bArr;
            this.zzWkJ = bigInteger3;
            return;
        }
        throw new NullPointerException(BackupFile.PREFIX_NOTE_DIR);
    }
}
