package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZI4 extends CharsetEncoder {
    private final zzZI5 zzZHQ;
    private final CharsetEncoder zzZHR;
    private int zzZHS;
    private final LinkedList<byte[]> zzZHT;

    public static class zzZ implements zzZI5 {
        private static final byte[] zzZHO = new byte[0];
        private final zzZO1 zzZHP;
        private final StringBuilder zzZHV = new StringBuilder();
        private final int zzZHW;

        public zzZ(zzZO2 zzzo2) {
            this.zzZHP = zzzo2.zzFR();
            this.zzZHW = zzzo2.zzFQ();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[PHI: r1
          0x0020: PHI (r1v2 int) = (r1v1 int), (r1v5 int), (r1v5 int) binds: [B:6:0x000b, B:8:0x0010, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.aspose.words.internal.zzZI5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final byte[] zzZ(zzZI4 zzzi4, char[] cArr) {
            int i = 0;
            while (i < cArr.length) {
                char c = cArr[i];
                if (!Character.isHighSurrogate(c) || (i = i + 1) >= cArr.length) {
                    this.zzZHP.zzz(c);
                } else {
                    char c2 = cArr[i];
                    if (Character.isLowSurrogate(c2)) {
                        this.zzZHP.zzZ(c, c2);
                    }
                }
                i++;
            }
            while (this.zzZHP.movePrevious()) {
            }
            this.zzZHV.setLength(0);
            while (this.zzZHP.getRemaining() > 0) {
                this.zzZHV.append(this.zzZHP.zzFP());
            }
            return this.zzZHV.length() > 0 ? zzzi4.charset().encode(this.zzZHV.toString()).array() : zzZHO;
        }
    }

    private zzZI4(CharsetEncoder charsetEncoder, zzZI5 zzzi5) {
        super(charsetEncoder.charset(), charsetEncoder.averageBytesPerChar(), charsetEncoder.maxBytesPerChar(), charsetEncoder.replacement());
        this.zzZHT = new LinkedList<>();
        this.zzZHS = 0;
        this.zzZHQ = zzzi5;
        this.zzZHR = charsetEncoder;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        if (this.zzZHS > byteBuffer.remaining()) {
            return CoderResult.OVERFLOW;
        }
        Iterator<byte[]> it = this.zzZHT.iterator();
        while (it.hasNext()) {
            byteBuffer.put(it.next());
        }
        this.zzZHT.clear();
        this.zzZHS = 0;
        while (charBuffer.remaining() > 0) {
            CoderResult coderResultEncode = this.zzZHR.encode(charBuffer, byteBuffer, false);
            if (coderResultEncode.isUnderflow() || coderResultEncode.isOverflow()) {
                return coderResultEncode;
            }
            char[] cArr = new char[coderResultEncode.length()];
            charBuffer.get(cArr);
            byte[] bArrZzZ = this.zzZHQ.zzZ(this, cArr);
            if (bArrZzZ.length > byteBuffer.remaining()) {
                this.zzZHT.add(bArrZzZ);
                this.zzZHS += bArrZzZ.length;
                return CoderResult.OVERFLOW;
            }
            byteBuffer.put(bArrZzZ);
        }
        return CoderResult.UNDERFLOW;
    }

    public zzZI4(CharsetEncoder charsetEncoder, zzZO2 zzzo2) {
        this(charsetEncoder, new zzZ(zzzo2));
    }
}
