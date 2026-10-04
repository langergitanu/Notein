package com.aspose.words.internal;

import android.os.Bundle;
import java.math.BigInteger;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPJ {
    public static String zzQ(BigInteger bigInteger) {
        return new zzYGR(bigInteger.toByteArray(), 32).toString();
    }

    public static String zzR(BigInteger bigInteger) {
        return new zzYGR(bigInteger.toByteArray()).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzY(String str, BigInteger bigInteger, zzZ38 zzz38) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        Bundle.putString(sb, zzZ(bigInteger, zzz38));
        sb.append(bigInteger.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    public static void zzZ(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }

    public static String zzwp(String str) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        sb.append(str);
        sb.append(" Private Key [RESTRICTED]");
        sb.append(strLineSeparator);
        return sb.toString();
    }

    public static String zzwq(String str) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        sb.append(str);
        sb.append(" Private Key [DESTROYED]");
        sb.append(strLineSeparator);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzZ(String str, BigInteger bigInteger, zzZ38 zzz38) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        BigInteger bigIntegerModPow = zzz38.getG().modPow(bigInteger, zzz38.getP());
        sb.append(str);
        sb.append(" Private Key [");
        Bundle.putString(sb, zzZ(bigIntegerModPow, zzz38));
        sb.append(bigIntegerModPow.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzY(String str, BigInteger bigInteger, zzZ36 zzz36) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        Bundle.putString(sb, zzZ(bigInteger, zzz36));
        sb.append(bigInteger.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    private static String zzZ(BigInteger bigInteger, zzZ38 zzz38) {
        return new zzYGR(zzYGU.zzV(bigInteger.toByteArray(), zzz38.getP().toByteArray(), zzz38.getG().toByteArray())).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzZ(String str, BigInteger bigInteger, zzZ36 zzz36) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        BigInteger bigIntegerModPow = zzz36.getG().modPow(bigInteger, zzz36.getP());
        sb.append(str);
        sb.append(" Private Key [");
        Bundle.putString(sb, zzZ(bigIntegerModPow, zzz36));
        sb.append(bigIntegerModPow.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzY(String str, BigInteger bigInteger, zzZ2Z zzz2z) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        Bundle.putString(sb, zzZ(bigInteger, zzz2z));
        sb.append(bigInteger.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    private static String zzZ(BigInteger bigInteger, zzZ36 zzz36) {
        return new zzYGR(zzYGU.zzW(bigInteger.toByteArray(), zzz36.getP().toByteArray(), zzz36.getQ().toByteArray(), zzz36.getG().toByteArray())).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzZ(String str, BigInteger bigInteger, zzZ2Z zzz2z) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        BigInteger bigIntegerModPow = zzz2z.getA().modPow(bigInteger, zzz2z.getP());
        sb.append(str);
        sb.append(" Private Key [");
        Bundle.putString(sb, zzZ(bigIntegerModPow, zzz2z));
        sb.append(bigIntegerModPow.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    private static String zzZ(BigInteger bigInteger, zzZ2Z zzz2z) {
        return new zzYGR(zzYGU.zzV(bigInteger.toByteArray(), zzz2z.getP().toByteArray(), zzz2z.getA().toByteArray())).toString();
    }

    public static String zzZ(String str, zzYLX zzylx, zzZ33 zzz33) {
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = zzYGI.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(zzZ(zzylx, zzz33));
        stringBuffer.append("]");
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            X: ");
        stringBuffer.append(zzylx.zzXzn().toBigInteger().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(zzylx.zzXzm().toBigInteger().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, java.lang.StringBuilder] */
    public static String zzZ(String str, BigInteger bigInteger, zzZ33 zzz33) {
        ?? sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        zzYLX zzylxZzZ = zzZ(bigInteger, zzz33);
        sb.append(str);
        sb.append(" Private Key [");
        Bundle.putString(sb, zzZ(zzylxZzZ, zzz33));
        sb.append(zzylxZzZ.zzXzn().toBigInteger().toString(16));
        sb.append(strLineSeparator);
        sb.append("            Y: ");
        sb.append(zzylxZzZ.zzXzm().toBigInteger().toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    private static zzYLX zzZ(BigInteger bigInteger, zzZ33 zzz33) {
        return zzz33.zzXHu().zzK(bigInteger).zzXze();
    }

    private static String zzZ(zzYLX zzylx, zzZ33 zzz33) {
        zzYM1 zzym1ZzXHv = zzz33.zzXHv();
        zzYLX zzylxZzXHu = zzz33.zzXHu();
        if (zzym1ZzXHv != null) {
            return new zzYGR(zzYGU.zzW(zzylx.zzOC(false), zzym1ZzXHv.zzXzK().getEncoded(), zzym1ZzXHv.zzXzJ().getEncoded(), zzylxZzXHu.zzOC(false))).toString();
        }
        return new zzYGR(zzylx.zzOC(false)).toString();
    }

    public static String zzZ(String str, String str2, zzZ3K zzz3k) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        byte[] bArrZzXGx = zzz3k.zzXGx();
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        sb.append(" [");
        sb.append(new zzYGR(bArrZzXGx).toString());
        sb.append("]");
        sb.append(strLineSeparator);
        sb.append("    public data: ");
        sb.append(zzYGC.zzVE(bArrZzXGx));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    public static String zzZ(String str, String str2, zzZ3A zzz3a) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = zzYGI.lineSeparator();
        byte[] bArrZzXGx = zzz3a.zzXGx();
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        sb.append(" [");
        sb.append(new zzYGR(bArrZzXGx).toString());
        sb.append("]");
        sb.append(strLineSeparator);
        sb.append("    public data: ");
        sb.append(zzYGC.zzVE(bArrZzXGx));
        sb.append(strLineSeparator);
        return sb.toString();
    }
}
