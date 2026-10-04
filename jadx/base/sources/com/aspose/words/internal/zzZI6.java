package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZI6 extends CharsetDecoder {
    private final zzZI7 zzZHY;
    private final CharsetDecoder zzZHZ;
    private int zzZI0;
    private final LinkedList<char[]> zzZI1;

    public static class zzZ implements zzZI7 {
        private static final char[] zzZHU = new char[0];
        private final StringBuilder zzZHV = new StringBuilder();
        private final int zzZHW;
        private final zzZO4 zzZHX;

        public zzZ(zzZO5 zzzo5) {
            this.zzZHX = zzzo5.zzi7();
            this.zzZHW = zzzo5.zzFQ();
        }

        @Override // com.aspose.words.internal.zzZI7
        public final char[] zzYJ(byte[] bArr) {
            for (byte b : bArr) {
                byte[] bArr2 = {b};
                if (Character.isValidCodePoint(bArr2[0])) {
                    byte b2 = bArr2[0];
                    if (b2 != 0) {
                        this.zzZHV.append(Character.toChars(b2));
                    }
                } else {
                    this.zzZHX.zzi6();
                    this.zzZHV.setLength(0);
                    while (this.zzZHX.getRemaining() > 0) {
                        this.zzZHV.append(this.zzZHX.zzFP());
                    }
                }
            }
            return this.zzZHV.length() > 0 ? this.zzZHV.toString().toCharArray() : zzZHU;
        }
    }

    private zzZI6(CharsetDecoder charsetDecoder, zzZI7 zzzi7) {
        super(charsetDecoder.charset(), charsetDecoder.averageCharsPerByte(), charsetDecoder.maxCharsPerByte());
        this.zzZI1 = new LinkedList<>();
        this.zzZI0 = 0;
        this.zzZHY = zzzi7;
        this.zzZHZ = charsetDecoder;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        charsetDecoder.onMalformedInput(codingErrorAction);
        charsetDecoder.onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        if (this.zzZI0 > charBuffer.remaining()) {
            return CoderResult.OVERFLOW;
        }
        Iterator<char[]> it = this.zzZI1.iterator();
        while (it.hasNext()) {
            charBuffer.put(it.next());
        }
        this.zzZI1.clear();
        this.zzZI0 = 0;
        while (byteBuffer.remaining() > 0) {
            CoderResult coderResultDecode = this.zzZHZ.decode(byteBuffer, charBuffer, false);
            if (!coderResultDecode.isOverflow()) {
                if (!coderResultDecode.isUnderflow()) {
                    int length = coderResultDecode.length();
                    byte[] bArr = new byte[length];
                    if (length <= byteBuffer.remaining()) {
                        byteBuffer.get(bArr);
                    }
                    char[] cArrZzYJ = this.zzZHY.zzYJ(bArr);
                    if (cArrZzYJ.length > charBuffer.remaining()) {
                        this.zzZI1.add(cArrZzYJ);
                        this.zzZI0 += cArrZzYJ.length;
                        return CoderResult.OVERFLOW;
                    }
                    charBuffer.put(cArrZzYJ);
                } else if (byteBuffer.remaining() > 1 && charBuffer.remaining() > 0) {
                    byte[] bArr2 = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr2);
                    char[] cArrZzYJ2 = this.zzZHY.zzYJ(bArr2);
                    if (cArrZzYJ2.length > charBuffer.remaining()) {
                        this.zzZI1.add(cArrZzYJ2);
                        this.zzZI0 += cArrZzYJ2.length;
                        return CoderResult.OVERFLOW;
                    }
                    charBuffer.put(cArrZzYJ2);
                }
            }
            return coderResultDecode;
        }
        return CoderResult.UNDERFLOW;
    }

    public zzZI6(CharsetDecoder charsetDecoder, zzZO5 zzzo5) {
        this(charsetDecoder, new zzZ(zzzo5));
    }
}
