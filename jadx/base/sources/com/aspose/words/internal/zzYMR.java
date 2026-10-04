package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYMR {

    /* JADX INFO: renamed from: q */
    private static Map f51225q = new HashMap();

    static {
        HashSet<zzZDA> hashSet = new HashSet();
        Enumeration enumerationZzXKn = zzZ77.zzXKn();
        while (enumerationZzXKn.hasMoreElements()) {
            hashSet.add(zzZ77.zzwM((String) enumerationZzXKn.nextElement()));
        }
        for (zzZDA zzzda : hashSet) {
            try {
                f51225q.put(zzZ77.zzX(zzzda).zzXHv(), zzZ31.zzN(zzzda).zzXHv());
            } catch (UnsupportedOperationException unused) {
            }
        }
    }

    public static ECParameterSpec zzP(zzZ33 zzz33) {
        return new ECParameterSpec(zzW(zzz33.zzXHv()), new ECPoint(zzz33.zzXHu().zzXzn().toBigInteger(), zzz33.zzXHu().zzXzm().toBigInteger()), zzz33.zzXIz(), zzz33.zzXHt().intValue());
    }

    private static EllipticCurve zzW(zzYM1 zzym1) {
        return new EllipticCurve(zzZ(zzym1.zzXzL()), zzym1.zzXzK().toBigInteger(), zzym1.zzXzJ().toBigInteger(), null);
    }

    private static zzYM1 zzZ(EllipticCurve ellipticCurve, BigInteger bigInteger, int i) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            zzYM1.zzV zzv = new zzYM1.zzV(((ECFieldFp) field).getP(), a, b, bigInteger, BigInteger.valueOf(i));
            return f51225q.containsKey(zzv) ? (zzYM1) f51225q.get(zzv) : zzv;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrZzZT = zzZT(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new zzYM1.zzW(m, iArrZzZT[0], iArrZzZT[1], iArrZzZT[2], a, b, bigInteger, BigInteger.valueOf(i));
    }

    private static int[] zzZT(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
            return iArr2;
        }
        if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 < i3 && i2 < (i = iArr[2])) {
            iArr2[0] = i2;
            if (i3 < i) {
                iArr2[1] = i3;
                iArr2[2] = i;
                return iArr2;
            }
            iArr2[1] = i;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        int i4 = iArr[2];
        if (i3 < i4) {
            iArr2[0] = i3;
            int i5 = iArr[0];
            if (i5 < i4) {
                iArr2[1] = i5;
                iArr2[2] = i4;
                return iArr2;
            }
            iArr2[1] = i4;
            iArr2[2] = i5;
            return iArr2;
        }
        iArr2[0] = i4;
        int i6 = iArr[0];
        if (i6 < i3) {
            iArr2[1] = i6;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        iArr2[1] = i3;
        iArr2[2] = i6;
        return iArr2;
    }

    private static ECField zzZ(zzYIB zzyib) {
        if (zzYM3.zzX(zzyib)) {
            return new ECFieldFp(zzyib.zzXyD());
        }
        zzYI7 zzyi7ZzXyB = ((zzYI6) zzyib).zzXyB();
        return new ECFieldF2m(zzyi7ZzXyB.zzsh(), zzYGU.zzZx(zzYGU.zzM(zzyi7ZzXyB.zzXyC(), r0.length - 1)));
    }

    public static zzZ33 zzZ(ECParameterSpec eCParameterSpec) {
        zzYM1 zzym1ZzZ = zzZ(eCParameterSpec.getCurve(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        return new zzZ33(zzym1ZzZ, zzZ(zzym1ZzZ, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    private static zzYLX zzZ(zzYM1 zzym1, ECPoint eCPoint) {
        return zzym1.zzY(eCPoint.getAffineX(), eCPoint.getAffineY());
    }
}
