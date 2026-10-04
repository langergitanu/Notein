package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3U implements zzZ5V {
    protected final zzZ86 zzWlq;
    private zzZ34 zzWlr;
    private zzZ5W zzWlz;

    public zzZ3U(zzZ5W zzz5w, zzZ34 zzz34) {
        this.zzWlz = zzz5w;
        this.zzWlr = zzz34;
        this.zzWlq = null;
    }

    private static zzZ34 zzW(zzZ86 zzz86) {
        zzZDA zzzdaZzXJk = zzz86.zzXJk();
        if (!zzzdaZzXJk.equals(zzZ8G.zzWt9) && !zzzdaZzXJk.equals(zzZ8G.zzWta)) {
            throw new IllegalArgumentException("Unknown algorithm type: " + zzz86.zzXJk());
        }
        zzZ8I zzz8iZzXs = zzZ8I.zzXs(zzz86.zzXJj());
        if (zzz8iZzXs.zzXIy()) {
            return new zzZ34(zzz8iZzXs.zzXIu(), zzz8iZzXs.zzXIw());
        }
        zzZ8K zzz8kZzXIx = zzz8iZzXs.zzXIx();
        byte[] bArrZzXIA = zzz8kZzXIx.zzXIA();
        zzZDA zzzdaZzXJk2 = zzz86.zzXJk();
        zzZDA zzzda = zzZ8G.zzWta;
        if (zzzdaZzXJk2.equals(zzzda)) {
            zzXf(bArrZzXIA);
        }
        zzZ8L zzz8lZzXIB = zzz8kZzXIx.zzXIB();
        BigInteger bigIntegerZzZ = zzZ(zzz8lZzXIB.getM(), zzz8kZzXIx.zzXIz());
        zzYM1.zzW zzw = new zzYM1.zzW(zzz8lZzXIB.getM(), zzz8lZzXIB.zzXIE(), zzz8lZzXIB.zzXID(), zzz8lZzXIB.zzXIC(), zzz8kZzXIx.getA(), new BigInteger(1, bArrZzXIA), zzz8kZzXIx.zzXIz(), bigIntegerZzZ);
        byte[] bArrZzN7 = zzz8kZzXIx.zzN7();
        if (zzz86.zzXJk().equals(zzzda)) {
            zzXf(bArrZzN7);
        }
        return new zzZ34(new zzZ33(zzw, zzZ8H.zzZ(zzw, bArrZzN7), zzz8kZzXIx.zzXIz(), bigIntegerZzZ));
    }

    public static void zzXGE() {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public static void zzXf(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private static BigInteger zzZ(int i, BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (iBitLength > 1 && !bigInteger.testBit(iBitLength - 2)) {
            iBitLength--;
        }
        return zzYM2.ONE.shiftLeft(Math.max(0, i - iBitLength));
    }

    public zzZ34 zzXGB() {
        return this.zzWlr;
    }

    public final void zzXGG() {
        this.zzWlz = null;
        this.zzWlr = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public zzZ5W zzXGV() {
        return this.zzWlz;
    }

    public zzZ3U(zzZ5W zzz5w, zzZ86 zzz86) {
        this.zzWlz = zzz5w;
        this.zzWlr = zzW(zzz86);
        this.zzWlq = zzz86;
    }
}
