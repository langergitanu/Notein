package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZI2 extends Charset {
    private final int[][] zzZHJ;
    private final int[] zzZHK;

    public class zzY extends CharsetEncoder {
        public zzY(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        @Override // java.nio.charset.CharsetEncoder
        public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            int[][] iArr = zzZI2.this.zzZHJ;
            int iRemaining = byteBuffer.remaining();
            while (charBuffer.hasRemaining()) {
                int i = iRemaining - 1;
                if (iRemaining <= 0) {
                    return CoderResult.OVERFLOW;
                }
                char c = charBuffer.get();
                int[] iArr2 = iArr[c >>> '\b'];
                int i2 = iArr2 != null ? iArr2[c & 255] : -1;
                if (i2 == -1) {
                    charBuffer.position(charBuffer.position() - 1);
                    return CoderResult.unmappableForLength(1);
                }
                byteBuffer.put((byte) (i2 & 255));
                iRemaining = i;
            }
            return CoderResult.UNDERFLOW;
        }
    }

    public class zzZ extends CharsetDecoder {
        public zzZ(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        @Override // java.nio.charset.CharsetDecoder
        public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            int[] iArr = zzZI2.this.zzZHK;
            int iRemaining = charBuffer.remaining();
            while (byteBuffer.hasRemaining()) {
                int i = iRemaining - 1;
                if (iRemaining <= 0) {
                    return CoderResult.OVERFLOW;
                }
                int i2 = iArr[byteBuffer.get() & 255];
                if (i2 == -1) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    return CoderResult.malformedForLength(1);
                }
                charBuffer.put((char) i2);
                iRemaining = i;
            }
            return CoderResult.UNDERFLOW;
        }
    }

    public zzZI2(String str, String[] strArr, int[] iArr, int[][] iArr2) {
        super(str, strArr);
        this.zzZHK = iArr;
        this.zzZHJ = iArr2;
    }

    public static int[][] zzG(int[] iArr) {
        int[][] iArr2 = new int[256][];
        for (int i = 0; i < 256; i++) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                zzZ(iArr2, i2, i);
            }
        }
        return iArr2;
    }

    private static int[] zzcK() {
        int[] iArr = new int[256];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // java.nio.charset.Charset
    public boolean contains(Charset charset) {
        return getClass().isInstance(charset);
    }

    @Override // java.nio.charset.Charset
    public CharsetDecoder newDecoder() {
        return new zzZ(this);
    }

    @Override // java.nio.charset.Charset
    public CharsetEncoder newEncoder() {
        return new zzY(this);
    }

    private static int[][] zzZ(int[][] iArr, int i, int i2) {
        int i3 = (i >>> 8) & 255;
        int i4 = i & 255;
        int[] iArr2 = iArr[i3];
        if (iArr2 != null) {
            iArr2[i4] = i2;
            return iArr;
        }
        if (i2 >= 0) {
            int[] iArrZzcK = zzcK();
            iArr[i3] = iArrZzcK;
            iArrZzcK[i4] = i2;
        }
        return iArr;
    }
}
