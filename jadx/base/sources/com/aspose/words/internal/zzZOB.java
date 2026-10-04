package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
final class zzZOB extends zzZOD {
    public zzZOB(zzZNZ zzznz) {
        super(zzznz);
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final int zzZ(byte[] bArr, int i, int i2, AtomicReference<char[]> atomicReference, int i3) {
        CharBuffer charBufferWrap = atomicReference.get() != null ? CharBuffer.wrap(atomicReference.get()) : CharBuffer.allocate(i2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        CharsetDecoder charsetDecoderZzih = zzih();
        charsetDecoderZzih.reset();
        while (true) {
            if (byteBufferWrap.remaining() <= 0 || charBufferWrap.remaining() <= 0) {
                break;
            }
            CoderResult coderResultDecode = charsetDecoderZzih.decode(byteBufferWrap, charBufferWrap, false);
            if (coderResultDecode.isOverflow()) {
                break;
            }
            if (!coderResultDecode.isUnderflow()) {
                for (int length = coderResultDecode.length(); length > 0 && charBufferWrap.hasRemaining() && byteBufferWrap.hasRemaining(); length--) {
                    byteBufferWrap.get();
                    charBufferWrap.put(charsetDecoderZzih.replacement());
                }
            } else if (byteBufferWrap.hasRemaining() && charBufferWrap.hasRemaining()) {
                byteBufferWrap.get();
                if (byteBufferWrap.hasRemaining()) {
                    byteBufferWrap.get();
                }
                charBufferWrap.put(charsetDecoderZzih.replacement());
            }
        }
        charBufferWrap.flip();
        if (atomicReference.get() == null) {
            char[] cArr = new char[charBufferWrap.limit()];
            charBufferWrap.get(cArr);
            atomicReference.set(cArr);
        }
        return byteBufferWrap.position();
    }
}
