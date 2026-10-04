package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
class zzZOD extends zzZO0 {
    public zzZOD(zzZNZ zzznz, Charset charset) {
        super(zzznz, charset);
    }

    @Override // com.aspose.words.internal.zzZO0
    public int zzQA(int i) {
        return (int) (i * this.zzZWp);
    }

    @Override // com.aspose.words.internal.zzZO0
    public int zzQB(int i) {
        return (int) (i * this.zzZWo);
    }

    @Override // com.aspose.words.internal.zzZO0
    public int zzX(char[] cArr, int i, int i2) {
        return zzW(cArr, i, i2).length;
    }

    @Override // com.aspose.words.internal.zzZO0
    public int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3) {
        return zzZ(cArr, i, i2, atomicReference, i3, Integer.MAX_VALUE);
    }

    @Override // com.aspose.words.internal.zzZO0
    public zzZO3 zzik() {
        return new zzZO7(this);
    }

    @Override // com.aspose.words.internal.zzZO0
    public zzZO6 zzil() {
        return new zzZO8(this);
    }

    public zzZOD(zzZNZ zzznz) {
        super(zzznz);
    }

    @Override // com.aspose.words.internal.zzZO0
    public int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3, int i4) {
        CharsetEncoder charsetEncoderZzhO = zzhO();
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        int iAverageBytesPerChar = (int) (charsetEncoderZzhO.averageBytesPerChar() * charBufferWrap.remaining());
        ByteBuffer byteBufferWrap = atomicReference.get() != null ? ByteBuffer.wrap(atomicReference.get(), i3, Math.min(atomicReference.get().length - i3, i4)) : ByteBuffer.allocate(iAverageBytesPerChar);
        while (charBufferWrap.hasRemaining()) {
            CoderResult coderResultEncode = charsetEncoderZzhO.encode(charBufferWrap, byteBufferWrap, false);
            if (coderResultEncode.isUnmappable()) {
                charBufferWrap.get();
                byteBufferWrap.put(charsetEncoderZzhO.replacement());
            }
            if (coderResultEncode.isOverflow() && charBufferWrap.hasRemaining()) {
                iAverageBytesPerChar = (iAverageBytesPerChar * 2) + 1;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iAverageBytesPerChar);
                byteBufferWrap.flip();
                byteBufferAllocate.put(byteBufferWrap);
                byteBufferWrap = byteBufferAllocate;
            } else if (coderResultEncode.isUnderflow() || coderResultEncode.isMalformed()) {
                break;
            }
        }
        byteBufferWrap.flip();
        if (atomicReference.get() == null) {
            atomicReference.set(zzZO0.zzZ(byteBufferWrap));
        }
        return byteBufferWrap.limit();
    }

    @Override // com.aspose.words.internal.zzZO0
    public int zzZ(byte[] bArr, int i, int i2, AtomicReference<char[]> atomicReference, int i3) {
        CharBuffer charBufferAllocate;
        if (atomicReference.get() != null) {
            charBufferAllocate = CharBuffer.wrap(atomicReference.get());
        } else {
            charBufferAllocate = CharBuffer.allocate(i2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        CharsetDecoder charsetDecoderZzih = zzih();
        charsetDecoderZzih.reset();
        while (byteBufferWrap.remaining() > 0 && charBufferAllocate.remaining() > 0) {
            CoderResult coderResultDecode = charsetDecoderZzih.decode(byteBufferWrap, charBufferAllocate, false);
            if (coderResultDecode.isOverflow() || coderResultDecode.isUnderflow()) {
                break;
            }
            for (int length = coderResultDecode.length(); length > 0 && charBufferAllocate.hasRemaining() && byteBufferWrap.hasRemaining(); length--) {
                byteBufferWrap.get();
                charBufferAllocate.put(charsetDecoderZzih.replacement());
            }
        }
        charBufferAllocate.flip();
        if (atomicReference.get() == null) {
            atomicReference.set(zzZO0.zzZ(charBufferAllocate));
        }
        return charBufferAllocate.limit();
    }
}
