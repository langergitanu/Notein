package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNM extends zzZOA {
    protected static final byte[] zzZVX = {-1, -2};

    public static class zzZ extends zzZO8 {
        public zzZ(zzZO0 zzzo0) {
            super(zzzo0);
        }

        @Override // com.aspose.words.internal.zzZO8, com.aspose.words.internal.zzZO6
        public final int zzZ(byte[] bArr, int i, int i2, char[] cArr, int i3) {
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
                if (coderResultDecode.isOverflow()) {
                    break;
                }
                if (coderResultDecode.isUnderflow()) {
                    if (byteBufferWrap.remaining() <= 1 || charBufferWrap.remaining() <= 0) {
                        break;
                    }
                    byteBufferWrap.get();
                    byteBufferWrap.get();
                    charBufferWrap.put(this.zzZWE.replacement());
                } else if (byteBufferWrap.remaining() > 1 && charBufferWrap.remaining() > 0) {
                    byteBufferWrap.get();
                    byteBufferWrap.get();
                    charBufferWrap.put(this.zzZWE.replacement());
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
                int length2 = coderResult.length();
                this.zzZWF = new byte[length2];
                byteBufferWrap.position(byteBufferWrap.position() - length2);
                byteBufferWrap.get(this.zzZWF);
                this.zzZWG = length2;
            }
            if (coderResult.isOverflow()) {
                throw new IllegalArgumentException("Decode Overflow: insufficient space in the 'chars' array.");
            }
            return length - charBufferWrap.remaining();
        }
    }

    public zzZNM() {
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
        return this.zzZWI ? zzZVX : zzZO0.zzZWx;
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ zzZO3 zzik() {
        return super.zzik();
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final zzZO6 zzil() {
        return new zzZ(this);
    }

    public zzZNM(boolean z) {
        super(new zzZNZ(1200, "utf-16", "utf-16", "utf-16", "utf-16", 1200, "UTF-16LE"), true);
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
        while (byteBufferWrap.remaining() > 0 && charBufferWrap.remaining() > 0) {
            CoderResult coderResultDecode = charsetDecoderZzih.decode(byteBufferWrap, charBufferWrap, false);
            if (coderResultDecode.isOverflow()) {
                break;
            }
            if (coderResultDecode.isUnderflow()) {
                if (byteBufferWrap.remaining() <= 1 || charBufferWrap.remaining() <= 0) {
                    break;
                }
                byteBufferWrap.get();
                byteBufferWrap.get();
                charBufferWrap.put(charsetDecoderZzih.replacement());
            } else if (byteBufferWrap.remaining() > 1 && charBufferWrap.remaining() > 0) {
                byteBufferWrap.get();
                byteBufferWrap.get();
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
