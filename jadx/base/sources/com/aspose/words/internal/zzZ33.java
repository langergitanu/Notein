package com.aspose.words.internal;

import com.aspose.words.internal.zzZ5L;
import com.orion.notein.domain.models.backup.BackupFile;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ33 {
    private volatile BigInteger zzWkJ;
    private final zzYLX zzWkK;
    private final byte[] zzWoA;
    private final zzYM1 zzWoB;
    private final BigInteger zzWov;
    private final BigInteger zzWow;

    public zzZ33(zzYM1 zzym1, zzYLX zzylx, BigInteger bigInteger, BigInteger bigInteger2) {
        this(zzym1, zzylx, bigInteger, bigInteger2, null);
    }

    public static zzZ33 zzU(zzZ86 zzz86) {
        if (!zzz86.zzXJk().equals(zzZ6W.zzWoc)) {
            throw new IllegalArgumentException("Unknown algorithm type: " + zzz86.zzXJk());
        }
        zzZ74 zzz74ZzWS = zzZ74.zzWS(zzz86.zzXJj());
        if (!zzz74ZzWS.zzXIy()) {
            if (zzz74ZzWS.zzXHy()) {
                return new zzZ30((zzZ33) zzZ5L.zzZ(zzZ5L.zzZ.zzWlH));
            }
            zzZ72 zzz72ZzWR = zzZ72.zzWR(zzz74ZzWS.zzXHx());
            return new zzZ33(zzz72ZzWR.zzXHv(), zzz72ZzWR.zzXHu(), zzz72ZzWR.zzXIz(), zzz72ZzWR.zzXHt(), zzz72ZzWR.getSeed());
        }
        zzZDA zzzda = (zzZDA) zzz74ZzWS.zzXHx();
        zzZ72 zzz72ZzX = zzZ39.zzX(zzzda);
        if (zzz72ZzX == null) {
            zzz72ZzX = zzZ77.zzX(zzzda);
        }
        return new zzZ2W(zzzda, zzz72ZzX.zzXHv(), zzz72ZzX.zzXHu(), zzz72ZzX.zzXIz(), zzz72ZzX.zzXHt(), zzz72ZzX.getSeed());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ33)) {
            return false;
        }
        zzZ33 zzz33 = (zzZ33) obj;
        return this.zzWkK.zzU(zzz33.zzWkK) && this.zzWoB.zzV(zzz33.zzWoB) && this.zzWov.equals(zzz33.zzWov) && this.zzWow.equals(zzz33.zzWow);
    }

    public final byte[] getSeed() {
        return zzYGU.zzVI(this.zzWoA);
    }

    public int hashCode() {
        return this.zzWov.hashCode() + ((this.zzWow.hashCode() + ((this.zzWkK.hashCode() + (this.zzWoB.hashCode() * 31)) * 31)) * 31);
    }

    public final BigInteger zzXGm() {
        if (this.zzWkJ == null) {
            if (this.zzWov == null) {
                throw new IllegalStateException("no H provided for these parameters");
            }
            synchronized (this) {
                try {
                    if (this.zzWkJ == null) {
                        this.zzWkJ = this.zzWov.modInverse(this.zzWow);
                    }
                } finally {
                }
            }
        }
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

    public zzZ33(zzYM1 zzym1, zzYLX zzylx, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.zzWkJ = null;
        if (zzym1 == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException(BackupFile.PREFIX_NOTE_DIR);
        }
        this.zzWoB = zzym1;
        this.zzWkK = zzZ2X.zzZ(zzym1, zzylx);
        this.zzWow = bigInteger;
        this.zzWov = bigInteger2;
        this.zzWoA = zzYGU.zzVI(bArr);
    }
}
