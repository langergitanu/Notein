package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes5.dex */
class zzZO8 extends zzZO6 {
    static final /* synthetic */ boolean zzVr = true;
    protected byte[] zzZWF;
    protected int zzZWG;

    public zzZO8(zzZO0 zzzo0) {
        super(zzzo0);
        this.zzZWG = 0;
    }

    @Override // com.aspose.words.internal.zzZO6
    public int zzZ(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        ByteBuffer byteBufferWrap;
        if (cArr == null || bArr == null) {
            throw new NullPointerException(cArr == null ? "chars" : "bytes");
        }
        if (i2 < 0 || i3 < 0) {
            throw new IndexOutOfBoundsException(i2 >= 0 ? "charIndex" : "byteCount");
        }
        if (i3 > cArr.length || i2 < 0 || i2 > bArr.length + i) {
            throw new IndexOutOfBoundsException(i3 > cArr.length ? "charIndex" : "byteCount");
        }
        int length = cArr.length - i3;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i3, length);
        int i4 = this.zzZWG;
        if (i4 > 0) {
            byteBufferWrap = ByteBuffer.allocate((i4 + i2) - i);
            byteBufferWrap.put(this.zzZWF);
            byteBufferWrap.put(bArr, i, i2);
            byteBufferWrap.rewind();
            this.zzZWF = null;
        } else {
            byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        }
        CoderResult coderResult = CoderResult.UNDERFLOW;
        while (byteBufferWrap.remaining() > 0 && charBufferWrap.remaining() > 0) {
            CoderResult coderResultDecode = this.zzZWE.decode(byteBufferWrap, charBufferWrap, false);
            if (coderResultDecode.isUnderflow() || coderResultDecode.isOverflow()) {
                break;
            }
            if (!zzVr && !coderResultDecode.isMalformed() && !coderResultDecode.isUnmappable()) {
                throw new AssertionError();
            }
            for (int length2 = coderResultDecode.length(); length2 > 0 && byteBufferWrap.remaining() > 0 && charBufferWrap.remaining() > 0; length2--) {
                charBufferWrap.put((char) (byteBufferWrap.get() & 255));
            }
        }
        int iRemaining = byteBufferWrap.remaining();
        this.zzZWG = iRemaining;
        if (iRemaining > 0) {
            byte[] bArr2 = new byte[iRemaining];
            this.zzZWF = bArr2;
            byteBufferWrap.get(bArr2);
        }
        if (coderResult.isError()) {
            int length3 = coderResult.length();
            this.zzZWF = new byte[length3];
            byteBufferWrap.position(byteBufferWrap.position() - length3);
            byteBufferWrap.get(this.zzZWF);
            this.zzZWG = length3;
        }
        if (coderResult.isOverflow()) {
            throw new IllegalArgumentException("Decode Overflow: insufficient space in the 'chars' array.");
        }
        return length - charBufferWrap.remaining();
    }
}
