package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNO extends zzZOD {
    protected Map<Integer, Integer> zzZVZ;
    protected Map<Integer, Integer> zzZW0;

    public zzZNO(zzZNZ zzznz) {
        super(zzznz);
        this.zzZW0 = new HashMap();
        this.zzZVZ = new HashMap();
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

    public final zzZNO zzY(Map<Integer, Integer> map) {
        this.zzZW0.putAll(map);
        return this;
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3) {
        return zzZ(cArr, i, i2, atomicReference, i3, Integer.MAX_VALUE);
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ zzZO3 zzik() {
        return super.zzik();
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final /* bridge */ /* synthetic */ zzZO6 zzil() {
        return super.zzil();
    }

    public final zzZNO zzX(Map<Integer, Integer> map) {
        this.zzZVZ.putAll(map);
        return this;
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final int zzZ(char[] cArr, int i, int i2, AtomicReference<byte[]> atomicReference, int i3, int i4) {
        CharsetEncoder charsetEncoderZzhO = zzhO();
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        ByteBuffer byteBufferWrap = atomicReference.get() != null ? ByteBuffer.wrap(atomicReference.get(), i3, Math.min(atomicReference.get().length - i3, i4)) : ByteBuffer.allocate((int) (charsetEncoderZzhO.averageBytesPerChar() * charBufferWrap.remaining()));
        while (charBufferWrap.hasRemaining()) {
            CoderResult coderResultEncode = charsetEncoderZzhO.encode(charBufferWrap, byteBufferWrap, false);
            if (coderResultEncode.isUnmappable()) {
                char c = charBufferWrap.get();
                if (this.zzZVZ.containsKey(Integer.valueOf(c))) {
                    byteBufferWrap.put(this.zzZVZ.get(Integer.valueOf(c)).byteValue());
                } else if (c < 256) {
                    byteBufferWrap.put((byte) c);
                } else {
                    byteBufferWrap.put(charsetEncoderZzhO.replacement()[0]);
                }
            }
            if (coderResultEncode.isUnderflow() || coderResultEncode.isMalformed() || coderResultEncode.isOverflow()) {
                break;
            }
        }
        byteBufferWrap.flip();
        if (atomicReference.get() == null) {
            atomicReference.set(zzZO0.zzZ(byteBufferWrap));
        }
        return byteBufferWrap.limit();
    }

    @Override // com.aspose.words.internal.zzZOD, com.aspose.words.internal.zzZO0
    public final int zzZ(byte[] bArr, int i, int i2, AtomicReference<char[]> atomicReference, int i3) {
        CharBuffer charBufferWrap = atomicReference.get() != null ? CharBuffer.wrap(atomicReference.get()) : CharBuffer.allocate(i2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        CharsetDecoder charsetDecoderZzih = zzih();
        while (byteBufferWrap.remaining() > 0 && charBufferWrap.remaining() > 0) {
            CoderResult coderResultDecode = charsetDecoderZzih.decode(byteBufferWrap, charBufferWrap, false);
            if (coderResultDecode.isOverflow() || coderResultDecode.isUnderflow()) {
                break;
            }
            for (int length = coderResultDecode.length(); length > 0 && charBufferWrap.hasRemaining() && byteBufferWrap.hasRemaining(); length--) {
                int i4 = byteBufferWrap.get() & 255;
                if (this.zzZW0.containsKey(Integer.valueOf(i4))) {
                    charBufferWrap.put(Character.toChars(this.zzZW0.get(Integer.valueOf(i4)).intValue()));
                } else {
                    charBufferWrap.put((char) i4);
                }
            }
        }
        charBufferWrap.flip();
        if (atomicReference.get() == null) {
            atomicReference.set(zzZO0.zzZ(charBufferWrap));
        }
        return charBufferWrap.limit();
    }
}
