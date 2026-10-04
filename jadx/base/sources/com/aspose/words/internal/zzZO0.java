package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.microsoft.identity.client.internal.MsalUtils;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZO0 implements Cloneable {
    private static final zzZNX zzZWs;
    private zzZO5 zzZWl;
    private zzZO2 zzZWm;
    private final boolean zzZWn;
    protected final float zzZWo;
    protected final float zzZWp;
    protected final Charset zzZWq;
    protected final zzZNZ zzZWr;
    protected static final byte[] zzZWx = new byte[0];
    protected static final Charset zzZWw = Charset.forName("UTF-8");
    private static final Charset zzZWv = zzhQ();
    private static final Map<Integer, zzZO0> zzZWu = new ConcurrentHashMap();
    private static final Map<String, Integer> zzZWt = new ConcurrentHashMap();

    public static class zzY extends zzZO3 {
        public zzY(zzZO0 zzzo0) {
            super(zzzo0);
            this.zzZWy = zzzo0.zzZWm != null ? zzzo0.zzZWm.zzFR() : null;
        }

        @Override // com.aspose.words.internal.zzZO3
        public final int zzZ(char[] cArr, int i, byte[] bArr) {
            return this.zzMW.zzZ(cArr, 0, i, bArr, 0);
        }

        @Override // com.aspose.words.internal.zzZO3
        public final int zzZ(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
            return this.zzMW.zzY(cArr, i, i2, bArr, i3, i4);
        }
    }

    public static class zzZ extends zzZO6 {
        public zzZ(zzZO0 zzzo0) {
            super(zzzo0);
            this.zzZWC = zzzo0.zzZWl != null ? zzzo0.zzZWl.zzi7() : null;
        }

        @Override // com.aspose.words.internal.zzZO6
        public final int zzY(byte[] bArr, int i, int i2, char[] cArr, int i3) {
            return this.zzMW.zzZ(bArr, i, i2, cArr, i3);
        }

        @Override // com.aspose.words.internal.zzZO6
        public final int zzZ(byte[] bArr, int i, int i2, char[] cArr, int i3) {
            return zzY(bArr, i, i2, cArr, i3);
        }
    }

    static {
        zzZNX zzznx = new zzZNX();
        zzZWs = zzznx;
        zzZNY.zzZ(new zzZO9());
        zzZNY.zzZ(new zzZNW());
        zzZNY.zzZ(zzznx);
    }

    public zzZO0(zzZNZ zzznz) {
        this(zzznz, zzZ(zzznz));
    }

    private char[] zzQ(byte[] bArr, int i, int i2) {
        AtomicReference<char[]> atomicReference = new AtomicReference<>();
        zzZ(bArr, i, i2, atomicReference, 0);
        return atomicReference.get();
    }

    public static zzZO0 zzQz(int i) {
        Map<Integer, zzZO0> map = zzZWu;
        zzZO0 zzzo0 = map.get(Integer.valueOf(i));
        if (zzzo0 != null) {
            return zzzo0;
        }
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Code page cannot be less than 0, but codePage="));
        }
        zzZO0 zzzo0ZzQy = zzZNY.zzQy(i);
        if (i == 0) {
            zzzo0ZzQy = zzZNY.zzQy(1200);
        }
        if (zzzo0ZzQy == null) {
            zzZHV.zzL(o0Oo0oo.OooO0O0(i, "System does not support the given encoding: codepage=", ", UTF-8 will be used instead"));
            zzzo0ZzQy = zzQz(65001);
        }
        if (map.get(Integer.valueOf(i)) == null) {
            map.put(Integer.valueOf(i), zzzo0ZzQy);
        }
        return zzzo0ZzQy;
    }

    public static zzZO0 zzV3(String str) {
        Map<String, Integer> map = zzZWt;
        if (!map.containsKey(str)) {
            int iZzV2 = zzZNY.zzV2(str);
            if (iZzV2 == -1) {
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("System cannot find the given encoding by name=", str));
            }
            if (map.get(str) == null) {
                map.put(str, Integer.valueOf(iZzV2));
            }
        }
        return zzQz(map.get(str).intValue());
    }

    private static byte[] zzYN(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (bArr.length == 1) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length % 2 == 0 ? bArr.length - 1 : bArr.length - 2;
        for (int i = 0; i <= length; i += 2) {
            int i2 = i + 1;
            bArr2[i] = bArr[i2];
            bArr2[i2] = bArr[i];
        }
        int i3 = length + 1;
        if (i3 < bArr.length) {
            bArr2[i3] = bArr[i3];
        }
        return bArr2;
    }

    public static zzZO0 zzZ4(boolean z) {
        return z ? new zzZNN(true) : new zzZNM(true);
    }

    public static zzZO0 zzZ5(boolean z) {
        return z ? new zzZNL(true) : new zzZNK(true);
    }

    private boolean zzhP() {
        try {
            return ((double) zzhO().maxBytesPerChar()) <= 1.0d;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Charset zzhQ() {
        Charset charsetForName;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        String property = System.getProperty("sun.jnu.encoding");
        if (zzZKN.zzU3(property)) {
            charsetForName = null;
        } else {
            try {
                charsetForName = Charset.forName(property);
            } catch (Exception e) {
                zzZHV.zzZ(e);
                charsetForName = null;
            }
        }
        return charsetForName != null ? charsetForName : charsetDefaultCharset;
    }

    public static zzZO0 zzhR() {
        return zzV3(zzZWv.name());
    }

    public static zzZO0 zzhS() {
        return zzQz(1201);
    }

    public static zzZO0 zzhT() {
        return zzQz(12000);
    }

    public static zzZO0 zzhU() {
        return zzQz(1200);
    }

    public static zzZO0 zzhV() {
        return zzQz(65001);
    }

    public static zzZO0 zzhW() {
        return zzQz(65000);
    }

    public static zzZO0 zzhX() {
        return zzQz(20127);
    }

    public final byte[] getBytes(String str) {
        return zzW(str.toCharArray(), 0, str.length());
    }

    public final int getCodePage() {
        return this.zzZWr.zzZWk;
    }

    public String toString() {
        return this.zzZWr.zzZWj;
    }

    public abstract int zzQA(int i);

    public abstract int zzQB(int i);

    public final String zzR(byte[] bArr, int i, int i2) {
        return new String(zzQ(bArr, i, i2));
    }

    public final int zzV4(String str) {
        char[] charArray = str.toCharArray();
        return zzX(charArray, 0, charArray.length);
    }

    public abstract int zzX(char[] cArr, int i, int i2);

    public final byte[] zzX(char[] cArr) {
        return zzW(cArr, 0, cArr.length);
    }

    public final int zzY(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        AtomicReference<byte[]> atomicReference = new AtomicReference<>();
        atomicReference.set(bArr);
        return zzZ(cArr, i, i2, atomicReference, i3, i4);
    }

    public final char[] zzYO(byte[] bArr) {
        return zzQ(bArr, 0, bArr.length);
    }

    public final String zzYP(byte[] bArr) {
        return zzZn(zzYN(bArr));
    }

    public final int zzZ(String str, int i, byte[] bArr, int i2) {
        return zzZ(str.toCharArray(), 0, i, bArr, i2);
    }

    public abstract int zzZ(byte[] bArr, int i, int i2, AtomicReference<char[]> atomicReference, int i3);

    public abstract int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3);

    public abstract int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3, int i4);

    public final String zzZn(byte[] bArr) {
        if (bArr != null) {
            return zzR(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("bytes cannot be null");
    }

    public final CharsetEncoder zzhO() {
        try {
            if (this.zzZWm != null) {
                return new zzZI4(zzZKA.zzZU(this.zzZWq), this.zzZWm);
            }
            CharsetEncoder charsetEncoderZzZU = zzZKA.zzZU(this.zzZWq);
            charsetEncoderZzZU.onMalformedInput(CodingErrorAction.REPLACE);
            charsetEncoderZzZU.onUnmappableCharacter(CodingErrorAction.REPORT);
            return charsetEncoderZzZU;
        } catch (UnsupportedOperationException e) {
            zzZHV.zzY(e);
            CharsetEncoder charsetEncoderZzZU2 = zzZKA.zzZU(zzZWw);
            charsetEncoderZzZU2.onMalformedInput(CodingErrorAction.REPLACE);
            charsetEncoderZzZU2.onUnmappableCharacter(CodingErrorAction.REPORT);
            return charsetEncoderZzZU2;
        }
    }

    public final String zzhY() {
        return this.zzZWr.zzZWj;
    }

    /* JADX INFO: renamed from: zzhZ, reason: merged with bridge method [inline-methods] */
    public final zzZO0 clone() {
        try {
            zzZO0 zzzo0 = (zzZO0) super.clone();
            zzzo0.zzZWm = null;
            zzzo0.zzZWl = null;
            return zzzo0;
        } catch (CloneNotSupportedException e) {
            zzZHV.zzY(e);
            throw new RuntimeException("Cannot clone the encoding " + this.zzZWr.zzZWk);
        }
    }

    public final boolean zzi0() {
        return this.zzZWn;
    }

    public final String zzi1() {
        return this.zzZWr.zzZWg;
    }

    public final String zzi2() {
        return this.zzZWr.zzZWh;
    }

    public byte[] zzi3() {
        return zzZWx;
    }

    public final int zzi4() {
        return this.zzZWr.zzZWf;
    }

    public CharsetDecoder zzih() {
        try {
            if (this.zzZWl != null) {
                return new zzZI6(zzZKA.zzZV(this.zzZWq), this.zzZWl);
            }
            CharsetDecoder charsetDecoderZzZV = zzZKA.zzZV(this.zzZWq);
            charsetDecoderZzZV.onMalformedInput(CodingErrorAction.REPLACE);
            charsetDecoderZzZV.onUnmappableCharacter(CodingErrorAction.REPORT);
            charsetDecoderZzZV.replaceWith(MsalUtils.QUERY_STRING_SYMBOL);
            return charsetDecoderZzZV;
        } catch (UnsupportedOperationException e) {
            zzZHV.zzY(e);
            CharsetDecoder charsetDecoderZzZV2 = zzZKA.zzZV(zzZWw);
            charsetDecoderZzZV2.onUnmappableCharacter(CodingErrorAction.REPORT);
            charsetDecoderZzZV2.onMalformedInput(CodingErrorAction.REPLACE);
            return charsetDecoderZzZV2;
        }
    }

    public zzZO3 zzik() {
        return new zzY(this);
    }

    public zzZO6 zzil() {
        return new zzZ(this);
    }

    public zzZO0(zzZNZ zzznz, Charset charset) {
        this.zzZWr = zzznz;
        this.zzZWq = charset;
        this.zzZWn = zzhP();
        this.zzZWp = zzih().maxCharsPerByte();
        this.zzZWo = zzhO().maxBytesPerChar();
    }

    public static Charset zzX(zzZO0 zzzo0) {
        if (zzzo0 == null) {
            return null;
        }
        return zzzo0.zzZWq;
    }

    public final byte[] zzW(char[] cArr, int i, int i2) {
        AtomicReference<byte[]> atomicReference = new AtomicReference<>();
        zzZ(cArr, i, i2, atomicReference, 0);
        return atomicReference.get();
    }

    public final int zzZ(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        return zzY(cArr, 0, i2, bArr, i3, bArr.length - i3);
    }

    public final int zzZ(byte[] bArr, char[] cArr) {
        return zzZ(bArr, 0, bArr.length, cArr, 0);
    }

    public final int zzZ(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        AtomicReference<char[]> atomicReference = new AtomicReference<>();
        atomicReference.set(cArr);
        return zzZ(bArr, i, i2, atomicReference, i3);
    }

    public final void zzZ(zzZO2 zzzo2) {
        this.zzZWm = zzzo2;
    }

    public static byte[] zzZ(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == bArrArray.length) {
            return bArrArray;
        }
        byte[] bArr = new byte[iRemaining];
        System.arraycopy(bArrArray, 0, bArr, 0, iRemaining);
        return bArr;
    }

    public static char[] zzZ(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iRemaining = charBuffer.remaining();
        if (iRemaining == cArrArray.length) {
            return cArrArray;
        }
        char[] cArr = new char[iRemaining];
        System.arraycopy(cArrArray, 0, cArr, 0, iRemaining);
        return cArr;
    }

    public static byte[] zzZ(zzZO0 zzzo0, zzZO0 zzzo02, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (zzzo0 == null) {
            throw new NullPointerException("srcEncoding");
        }
        if (zzzo02 != null) {
            return zzzo02.zzX(zzzo0.zzYO(bArr));
        }
        throw new NullPointerException("dstEncoding");
    }

    public static zzZO0 zzZ(int i, zzZO2 zzzo2, zzZO5 zzzo5) {
        zzZO0 zzzo0ZzQz = zzQz(i);
        if (zzzo0ZzQz == null) {
            return zzzo0ZzQz;
        }
        zzZO0 zzzo0Clone = zzzo0ZzQz.clone();
        zzzo0Clone.zzZWm = zzzo2;
        zzzo0Clone.zzZWl = zzzo5;
        return zzzo0Clone;
    }

    public static zzZO0 zzZ(Charset charset) {
        if (charset != null) {
            return zzQz(zzZWs.zzV5(charset.displayName()).intValue());
        }
        throw new IllegalArgumentException("The argument cannot be null ");
    }

    private static Charset zzZ(zzZNZ zzznz) {
        if (Charset.isSupported(zzznz.zzZWe)) {
            return Charset.forName(zzznz.zzZWe);
        }
        if (Charset.isSupported(zzznz.zzZWj)) {
            return Charset.forName(zzznz.zzZWj);
        }
        if (Charset.isSupported(zzznz.zzZWi)) {
            return Charset.forName(zzznz.zzZWi);
        }
        if (Charset.isSupported(zzznz.zzZWh)) {
            return Charset.forName(zzznz.zzZWh);
        }
        if (Charset.isSupported(zzznz.zzZWg)) {
            return Charset.forName(zzznz.zzZWg);
        }
        return zzZWw;
    }
}
