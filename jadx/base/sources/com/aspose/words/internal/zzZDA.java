package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import com.aspose.slides.OooOOO;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDA extends zzZD5 {
    private static final ConcurrentMap<zzZ, zzZDA> zzWIp = new ConcurrentHashMap();
    private byte[] zzWIq;
    private final String zzWIr;

    public static class zzZ {
        private final int key;
        private final byte[] zzWIo;

        public zzZ(byte[] bArr) {
            this.key = zzYGU.hashCode(bArr);
            this.zzWIo = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zzZ) {
                return zzYGU.zzp(this.zzWIo, ((zzZ) obj).zzWIo);
            }
            return false;
        }

        public final int hashCode() {
            return this.key;
        }
    }

    private zzZDA(byte[] bArr) {
        boolean z;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                z = z2;
                long j2 = j + ((long) (b & Ascii.DEL));
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                    z2 = z;
                }
            } else {
                z = z2;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b & Ascii.DEL));
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    stringBuffer.append(bigIntegerOr);
                    j = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                    z2 = z;
                }
            }
        }
        this.zzWIr = stringBuffer.toString();
        this.zzWIq = zzYGU.zzVI(bArr);
    }

    private synchronized byte[] zzXKL() {
        try {
            if (this.zzWIq == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzZ(byteArrayOutputStream);
                this.zzWIq = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzWIq;
    }

    public static zzZDA zzXp(byte[] bArr) {
        zzZDA zzzda = zzWIp.get(new zzZ(bArr));
        return zzzda == null ? new zzZDA(bArr) : zzzda;
    }

    public static zzZDA zzY(zzZCY zzzcy) {
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        return zzzd5ZzXKw instanceof zzZDA ? zzYA(zzzd5ZzXKw) : zzXp(zzZD9.zzYz(zzzd5ZzXKw).zzXL5());
    }

    public static zzZDA zzYA(Object obj) {
        if (obj == null || (obj instanceof zzZDA)) {
            return (zzZDA) obj;
        }
        if (obj instanceof zzZDK) {
            zzZDK zzzdk = (zzZDK) obj;
            if (zzzdk.zzXL0() instanceof zzZDA) {
                return (zzZDA) zzzdk.zzXL0();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
        }
        try {
            return (zzZDA) zzZD5.zzXo((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct object identifier from byte[]: ")));
        }
    }

    private static boolean zzYN(String str, int i) {
        boolean z;
        char cCharAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    private static void zzZ(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private static boolean zzk(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return zzYN(str, 2);
    }

    public final String getId() {
        return this.zzWIr;
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return this.zzWIr.hashCode();
    }

    public final String toString() {
        return this.zzWIr;
    }

    public final zzZDA zzXKK() {
        zzZ zzz = new zzZ(zzXKL());
        ConcurrentMap<zzZ, zzZDA> concurrentMap = zzWIp;
        zzZDA zzzda = concurrentMap.get(zzz);
        if (zzzda != null) {
            return zzzda;
        }
        zzZDA zzzdaPutIfAbsent = concurrentMap.putIfAbsent(zzz, this);
        return zzzdaPutIfAbsent == null ? this : zzzdaPutIfAbsent;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        int length = zzXKL().length;
        return zzZBC.zzg4(length) + 1 + length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    public final zzZDA zzwP(String str) {
        return new zzZDA(this, str);
    }

    private static void zzZ(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Ascii.DEL);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public final boolean zzY(zzZDA zzzda) {
        String str = this.zzWIr;
        String str2 = zzzda.zzWIr;
        return str.length() > str2.length() && str.charAt(str2.length()) == '.' && str.startsWith(str2);
    }

    private void zzZ(ByteArrayOutputStream byteArrayOutputStream) {
        zzZBD zzzbd = new zzZBD(this.zzWIr);
        int i = Integer.parseInt(zzzbd.nextToken()) * 40;
        String strNextToken = zzzbd.nextToken();
        if (strNextToken.length() <= 18) {
            zzZ(byteArrayOutputStream, Long.parseLong(strNextToken) + ((long) i));
        } else {
            zzZ(byteArrayOutputStream, new BigInteger(strNextToken).add(BigInteger.valueOf(i)));
        }
        while (zzzbd.hasMoreTokens()) {
            String strNextToken2 = zzzbd.nextToken();
            if (strNextToken2.length() <= 18) {
                zzZ(byteArrayOutputStream, Long.parseLong(strNextToken2));
            } else {
                zzZ(byteArrayOutputStream, new BigInteger(strNextToken2));
            }
        }
    }

    public zzZDA(String str) {
        if (str != null) {
            if (zzk(str)) {
                this.zzWIr = str;
                return;
            }
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("string ", str, " not an OID"));
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        byte[] bArrZzXKL = zzXKL();
        zzzd7.write(6);
        zzzd7.zzg7(bArrZzXKL.length);
        zzzd7.write(bArrZzXKL);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 == this) {
            return true;
        }
        if (zzzd5 instanceof zzZDA) {
            return this.zzWIr.equals(((zzZDA) zzzd5).zzWIr);
        }
        return false;
    }

    private zzZDA(zzZDA zzzda, String str) {
        if (zzYN(str, 0)) {
            this.zzWIr = OooOOO.OooO0O0(new StringBuilder(), zzzda.zzWIr, ".", str);
            return;
        }
        throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("string ", str, " not a valid OID branch"));
    }
}
