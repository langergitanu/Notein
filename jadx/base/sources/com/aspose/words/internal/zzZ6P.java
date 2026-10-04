package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6P implements zzYGL {
    private BigInteger zzWn8;
    private byte[] zzWn9;
    private zzZ8C zzWpA;

    public zzZ6P(zzZ8C zzz8c, BigInteger bigInteger, byte[] bArr) {
        this.zzWpA = zzz8c;
        this.zzWn8 = bigInteger;
        this.zzWn9 = bArr;
    }

    private static boolean zzt(Object obj, Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    @Override // com.aspose.words.internal.zzYGL
    public final Object clone() {
        return new zzZ6P(this.zzWpA, this.zzWn8, this.zzWn9);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZ6P)) {
            return false;
        }
        zzZ6P zzz6p = (zzZ6P) obj;
        return zzYGU.zzp(this.zzWn9, zzz6p.zzWn9) && zzt(this.zzWn8, zzz6p.zzWn8) && zzt(this.zzWpA, zzz6p.zzWpA);
    }

    public final int hashCode() {
        int iHashCode = zzYGU.hashCode(this.zzWn9);
        BigInteger bigInteger = this.zzWn8;
        if (bigInteger != null) {
            iHashCode ^= bigInteger.hashCode();
        }
        zzZ8C zzz8c = this.zzWpA;
        return zzz8c != null ? iHashCode ^ zzz8c.hashCode() : iHashCode;
    }

    @Override // com.aspose.words.internal.zzYGL
    public final boolean zzWP(Object obj) {
        if (obj instanceof zzZ6T) {
            zzZ6T zzz6t = (zzZ6T) obj;
            if (this.zzWn8 != null) {
                zzZAL zzzal = new zzZAL(zzz6t.zzXHp());
                return zzzal.zzXJR().equals(this.zzWpA) && zzzal.zzXJQ().zzXKZ().equals(this.zzWn8);
            }
            if (this.zzWn9 != null) {
                zzZ7U zzz7uZzQ = zzz6t.zzQ(zzZ7U.zzWqK);
                if (zzz7uZzQ == null) {
                    return zzYGU.zzp(this.zzWn9, zzZ6Q.zzZ(zzz6t.zzXId()));
                }
                return zzYGU.zzp(this.zzWn9, zzZD9.zzYz(zzz7uZzQ.zzXHY()).zzXL5());
            }
        } else if (obj instanceof byte[]) {
            return zzYGU.zzp(this.zzWn9, (byte[]) obj);
        }
        return false;
    }
}
