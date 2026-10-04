package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNI extends zzZOA {
    private static final byte[] zzZVU = {-17, -69, -65};

    public zzZNI() {
        this(true);
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ int zzQA(int i) {
        return super.zzQA(i);
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ int zzQB(int i) {
        return super.zzQB(i);
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ int zzX(char[] cArr, int i, int i2) {
        return super.zzX(cArr, i, i2);
    }

    @Override // com.aspose.words.internal.zzZOA, com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ int zzZ(char[] cArr, int i, int i2, AtomicReference atomicReference, int i3) {
        return super.zzZ(cArr, i, i2, (AtomicReference<byte[]>) atomicReference, i3);
    }

    @Override // com.aspose.words.internal.zzZO0
    public final byte[] zzi3() {
        return this.zzZWI ? zzZVU : zzZO0.zzZWx;
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ zzZO3 zzik() {
        return super.zzik();
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ zzZO6 zzil() {
        return super.zzil();
    }

    public zzZNI(boolean z) {
        super(new zzZNZ(65001, "utf-8", "utf-8", "utf-8", "utf-8", 1200), z);
    }

    @Override // com.aspose.words.internal.zzZOA, com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ int zzZ(char[] cArr, int i, int i2, AtomicReference atomicReference, int i3, int i4) {
        return super.zzZ(cArr, i, i2, atomicReference, i3, i4);
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
            if (coderResultDecode.isUnderflow()) {
                if (byteBufferWrap.hasRemaining() && charBufferWrap.hasRemaining()) {
                    byteBufferWrap.get();
                    if (byteBufferWrap.hasRemaining()) {
                        byteBufferWrap.get();
                    }
                    charBufferWrap.put(charsetDecoderZzih.replacement());
                }
            } else {
                for (int length = coderResultDecode.length(); length > 0 && charBufferWrap.hasRemaining() && byteBufferWrap.hasRemaining(); length--) {
                    byteBufferWrap.get();
                    charBufferWrap.put(charsetDecoderZzih.replacement());
                }
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
