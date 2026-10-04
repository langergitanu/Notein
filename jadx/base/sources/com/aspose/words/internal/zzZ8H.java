package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ8H {
    private static zzYM0 zzZ(zzYM0 zzym0) {
        zzYM0 zzym0ZzW = zzym0;
        for (int i = 1; i < zzym0.getFieldSize(); i++) {
            zzym0ZzW = zzym0ZzW.zzXzy().zzW(zzym0);
        }
        return zzym0ZzW;
    }

    private static zzYM0 zzZ(zzYM1 zzym1, zzYM0 zzym0) {
        zzYM0 zzym0ZzW;
        if (zzym0.isZero()) {
            return zzym0;
        }
        zzYM0 zzym0ZzP = zzym1.zzP(zzYM2.ZERO);
        Random random = new Random();
        int fieldSize = zzym0.getFieldSize();
        do {
            zzYM0 zzym0ZzP2 = zzym1.zzP(new BigInteger(fieldSize, random));
            zzYM0 zzym0ZzW2 = zzym0;
            zzym0ZzW = zzym0ZzP;
            for (int i = 1; i <= fieldSize - 1; i++) {
                zzYM0 zzym0ZzXzy = zzym0ZzW2.zzXzy();
                zzym0ZzW = zzym0ZzW.zzXzy().zzW(zzym0ZzXzy.zzU(zzym0ZzP2));
                zzym0ZzW2 = zzym0ZzXzy.zzW(zzym0);
            }
            if (!zzym0ZzW2.isZero()) {
                return null;
            }
        } while (zzym0ZzW.zzXzy().zzW(zzym0ZzW).isZero());
        return zzym0ZzW;
    }

    public static byte[] zzZ(zzYLX zzylx) {
        zzYLX zzylxZzXze = zzylx.zzXze();
        zzYM0 zzym0ZzXzn = zzylxZzXze.zzXzn();
        byte[] encoded = zzym0ZzXzn.getEncoded();
        if (!zzym0ZzXzn.isZero()) {
            if (zzZ(zzylxZzXze.zzXzm().zzT(zzym0ZzXzn)).zzXzv()) {
                int length = encoded.length - 1;
                encoded[length] = (byte) (encoded[length] | 1);
                return encoded;
            }
            int length2 = encoded.length - 1;
            encoded[length2] = (byte) (encoded[length2] & 254);
        }
        return encoded;
    }

    public static zzYLX zzZ(zzYM1 zzym1, byte[] bArr) {
        zzYM0 zzym0ZzU;
        zzYM0 zzym0ZzP = zzym1.zzP(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        zzYM0 zzym0ZzP2 = zzym1.zzP(new BigInteger(1, bArr));
        if (!zzZ(zzym0ZzP2).equals(zzym1.zzXzK())) {
            zzym0ZzP2 = zzym0ZzP2.zzXzA();
        }
        if (zzym0ZzP2.isZero()) {
            zzym0ZzU = zzym1.zzXzJ().zzXzw();
        } else {
            zzYM0 zzym0ZzZ = zzZ(zzym1, zzym0ZzP2.zzXzy().zzXzx().zzU(zzym1.zzXzJ()).zzW(zzym1.zzXzK()).zzW(zzym0ZzP2));
            if (zzym0ZzZ != null) {
                if (!zzZ(zzym0ZzZ).equals(zzym0ZzP)) {
                    zzym0ZzZ = zzym0ZzZ.zzXzA();
                }
                zzym0ZzU = zzym0ZzP2.zzU(zzym0ZzZ);
            } else {
                zzym0ZzU = null;
            }
        }
        if (zzym0ZzU != null) {
            return zzym1.zzY(zzym0ZzP2.toBigInteger(), zzym0ZzU.toBigInteger());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }
}
