package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZO7 extends zzZO3 {
    public zzZO7(zzZO0 zzzo0) {
        super(zzzo0);
    }

    @Override // com.aspose.words.internal.zzZO3
    public final int zzZ(char[] cArr, int i, byte[] bArr) {
        return zzZ(cArr, 0, i, bArr, 0, Integer.MAX_VALUE);
    }

    @Override // com.aspose.words.internal.zzZO3
    public final int zzZ(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        if (cArr == null) {
            throw new NullPointerException("chars");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("charIndex, charCount");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException("byteIndex");
        }
        this.zzZWA.reset();
        this.zzZWA.onUnmappableCharacter(CodingErrorAction.REPLACE);
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        int iMin = Math.min(bArr.length - i3, i4);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i3, iMin);
        CoderResult coderResultEncode = this.zzZWA.encode(charBufferWrap, byteBufferWrap, false);
        if (coderResultEncode.isOverflow()) {
            this.zzZWA.encode(charBufferWrap, byteBufferWrap, true);
            coderResultEncode = this.zzZWA.flush(byteBufferWrap);
        }
        if (coderResultEncode.isOverflow()) {
            throw new IllegalArgumentException("Encode Overflow: insufficient space in the 'bytes' array.");
        }
        this.zzZWB = i2 - charBufferWrap.length();
        return iMin - byteBufferWrap.remaining();
    }
}
