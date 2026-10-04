package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
class zzZOA extends zzZOD {
    protected boolean zzZWI;

    public zzZOA(zzZNZ zzznz, boolean z) {
        super(zzznz);
        this.zzZWI = z;
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3) {
        return zzZ(cArr, i, i2, atomicReference, i3, Integer.MAX_VALUE);
    }

    @Override // com.aspose.words.internal.zzZO0
    public final CharsetDecoder zzih() {
        CharsetDecoder charsetDecoderZzih = super.zzih();
        charsetDecoderZzih.replaceWith("�");
        return charsetDecoderZzih;
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3, int i4) {
        CharsetEncoder charsetEncoderZzhO = zzhO();
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        int iAverageBytesPerChar = (int) (charsetEncoderZzhO.averageBytesPerChar() * charBufferWrap.remaining());
        ByteBuffer byteBufferWrap = atomicReference.get() != null ? ByteBuffer.wrap(atomicReference.get(), i3, Math.min(atomicReference.get().length - i3, i4)) : ByteBuffer.allocate(iAverageBytesPerChar);
        while (charBufferWrap.hasRemaining()) {
            CoderResult coderResultEncode = charsetEncoderZzhO.encode(charBufferWrap, byteBufferWrap, false);
            if (coderResultEncode.isUnderflow()) {
                break;
            }
            if (coderResultEncode.isOverflow() && charBufferWrap.hasRemaining()) {
                iAverageBytesPerChar = (iAverageBytesPerChar * 2) + 1;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iAverageBytesPerChar);
                byteBufferWrap.flip();
                byteBufferAllocate.put(byteBufferWrap);
                byteBufferWrap = byteBufferAllocate;
            } else if (coderResultEncode.isUnmappable()) {
                for (int i5 = 0; i5 < coderResultEncode.length(); i5++) {
                    charBufferWrap.get();
                    byteBufferWrap.put(charsetEncoderZzhO.replacement());
                }
            }
        }
        byteBufferWrap.flip();
        if (atomicReference.get() == null) {
            atomicReference.set(zzZO0.zzZ(byteBufferWrap));
        }
        return byteBufferWrap.limit();
    }

    public zzZOA(zzZNZ zzznz, Charset charset) {
        this(zzznz, charset, (byte) 0);
    }

    private zzZOA(zzZNZ zzznz, Charset charset, byte b) {
        super(zzznz, charset);
        this.zzZWI = false;
    }
}
