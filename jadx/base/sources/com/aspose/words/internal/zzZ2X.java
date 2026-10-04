package com.aspose.words.internal;

import com.aspose.words.internal.zzYHR;
import java.math.BigInteger;
import java.security.Permission;
import java.security.SecureRandom;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2X {
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    public static void checkPermission(Permission permission) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(permission);
        }
    }

    public static boolean zzG(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !zzG(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static boolean zzT(zzZDK zzzdk) {
        zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzzdk);
        if (zzzd4ZzYy.size() == 2) {
            return true;
        }
        if (zzzd4ZzYy.size() > 3) {
            return false;
        }
        return zzZDD.zzYB(zzzd4ZzYy.zzg6(2)).zzXKZ().compareTo(BigInteger.valueOf((long) zzZDD.zzYB(zzzd4ZzYy.zzg6(0)).zzXKZ().bitLength())) <= 0;
    }

    public static boolean zzU(zzZDK zzzdk) {
        return (zzzdk == null || zzZC8.zzWHS.equals(zzzdk.zzXL0())) ? false : true;
    }

    public static BigInteger zzW(BigInteger bigInteger) {
        if (!zzZ3F.zzY(bigInteger)) {
            if ((bigInteger.intValue() & 1) == 0) {
                throw new IllegalArgumentException("RSA modulus is even");
            }
            if (!bigInteger.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(BigInteger.ONE)) {
                throw new IllegalArgumentException("RSA modulus has a small prime factor");
            }
            int iBitLength = bigInteger.bitLength() / 2;
            zzYHR.zzZ zzZ = zzYHR.zzZ(bigInteger, zzZ1L.zzWhM.zzZ(new SecureRandom(), false).zzZ(zzYGN.zzWX(System.currentTimeMillis()), false, zzYGI.zzwb(Thread.currentThread().toString())), iBitLength >= 1536 ? 3 : iBitLength >= 1024 ? 4 : iBitLength >= 512 ? 7 : 50);
            if (!zzZ.zzXyy()) {
                throw new IllegalArgumentException("RSA modulus is not composite");
            }
            if (!zzZ.zzXyx()) {
                throw new IllegalArgumentException("RSA modulus is a power of a prime");
            }
        }
        return bigInteger;
    }

    public static zzZ74 zzX(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzZ74(((zzZ2W) zzz33).zzXGj()) : zzz33 instanceof zzZ30 ? new zzZ74((zzZDC) zzZC8.zzWHS) : new zzZ74(new zzZ72(zzz33.zzXHv(), zzz33.zzXHu(), zzz33.zzXIz(), zzz33.zzXHt(), zzz33.getSeed()));
    }

    public static zzYLX zzY(zzYM1 zzym1, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Point encoding has null value");
        }
        zzYLX zzylxZzVO = zzym1.zzVO(bArr);
        if (zzylxZzVO == null) {
            throw new IllegalArgumentException("Point has null value");
        }
        zzYLX zzylxZzXze = zzylxZzVO.zzXze();
        if (zzylxZzXze.zzXzd()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        return zzylxZzXze;
    }

    public static BigInteger zzZ(zzZ38 zzz38, BigInteger bigInteger) {
        BigInteger bigInteger2 = zzWkF;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(zzz38.getP().subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("Y value is out of range");
        }
        if (zzz38.getQ() == null || BigInteger.ONE.equals(bigInteger.modPow(zzz38.getQ(), zzz38.getP()))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    public static BigInteger zzZ(zzZ36 zzz36, BigInteger bigInteger) {
        if (zzz36 == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = zzWkF;
        if (bigInteger2.compareTo(bigInteger) > 0 || zzz36.getP().subtract(bigInteger2).compareTo(bigInteger) < 0 || !BigInteger.ONE.equals(bigInteger.modPow(zzz36.getQ(), zzz36.getP()))) {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        return bigInteger;
    }

    public static byte[] zzY(zzZ86 zzz86, zzZDK zzzdk) {
        try {
            return zzZ(new zzZ94(zzz86, zzzdk.zzXL0()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static BigInteger zzZ(BigInteger bigInteger, BigInteger bigInteger2) {
        if ((bigInteger2.intValue() & 1) != 0) {
            return zzW(bigInteger);
        }
        throw new IllegalArgumentException("RSA publicExponent is even");
    }

    public static zzYLX zzZ(zzYM1 zzym1, zzYLX zzylx) {
        if (zzylx != null) {
            zzYLX zzylxZzXze = zzYM3.zzX(zzym1, zzylx).zzXze();
            if (!zzylxZzXze.zzXzd()) {
                if (zzylxZzXze.isValid()) {
                    return zzylxZzXze;
                }
                throw new IllegalArgumentException("Point not on curve");
            }
            throw new IllegalArgumentException("Point at infinity");
        }
        throw new IllegalArgumentException("Point has null value");
    }

    public static int zzW(zzZ33 zzz33) {
        return zzz33.zzXIz().bitLength();
    }

    public static byte[] zzZ(zzZDB zzzdb) {
        try {
            return zzzdb.getEncoded("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] zzZ(zzZ86 zzz86, zzZDK zzzdk) {
        try {
            return zzZ(new zzZ7D(zzz86, zzzdk.zzXL0()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] zzZ(zzZ86 zzz86, zzZDK zzzdk, zzZD2 zzzd2, byte[] bArr) {
        try {
            return zzZ(new zzZ94(zzz86, zzzdk.zzXL0(), zzzd2, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void zzZ(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }
}
