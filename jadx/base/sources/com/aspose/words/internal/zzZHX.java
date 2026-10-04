package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes5.dex */
final class zzZHX extends CharsetEncoder {
    static boolean zzZHr = true;
    private final byte zzZHA;
    private final byte zzZHB;
    private final zzZI1 zzZHC;
    private final boolean zzZHD;
    private int zzZHs;
    private int zzZHt;
    private final zzZHZ zzZHu;
    private boolean zzZHz;

    public zzZHX(zzZHZ zzzhz, zzZI1 zzzi1, boolean z) {
        super(zzzhz, 1.5f, 5.0f);
        this.zzZHu = zzzhz;
        this.zzZHC = zzzi1;
        this.zzZHD = z;
        this.zzZHB = zzzhz.zzcJ();
        this.zzZHA = zzzhz.zzcI();
    }

    private void zzZ(ByteBuffer byteBuffer, char c) {
        if (this.zzZHz) {
            if (this.zzZHt != 0) {
                byteBuffer.put(this.zzZHC.zzPw(this.zzZHs));
            }
            if (this.zzZHC.zzZF(c) || c == this.zzZHA || this.zzZHD) {
                byteBuffer.put(this.zzZHA);
            }
            this.zzZHz = false;
            this.zzZHs = 0;
            this.zzZHt = 0;
        }
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        byte b;
        while (charBuffer.hasRemaining()) {
            if (byteBuffer.remaining() < 4) {
                return CoderResult.OVERFLOW;
            }
            char c = charBuffer.get();
            if (this.zzZHu.zzZE(c)) {
                zzZ(byteBuffer, c);
                byteBuffer.put((byte) c);
            } else if (this.zzZHz || c != (b = this.zzZHB)) {
                zzZ(c, byteBuffer);
            } else {
                byteBuffer.put(b);
                byteBuffer.put(this.zzZHA);
            }
        }
        return (!this.zzZHz || charBuffer.hasRemaining() || ((float) byteBuffer.limit()) <= ((float) charBuffer.limit()) * 5.0f) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult implFlush(ByteBuffer byteBuffer) {
        if (this.zzZHz) {
            if (byteBuffer.remaining() < 2) {
                return CoderResult.OVERFLOW;
            }
            if (this.zzZHt != 0) {
                byteBuffer.put(this.zzZHC.zzPw(this.zzZHs));
            }
            byteBuffer.put(this.zzZHA);
        }
        return CoderResult.UNDERFLOW;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final void implReset() {
        this.zzZHz = false;
        this.zzZHs = 0;
        this.zzZHt = 0;
    }

    private void zzZ(char c, ByteBuffer byteBuffer) {
        if (!this.zzZHz) {
            byteBuffer.put(this.zzZHB);
        }
        this.zzZHz = true;
        this.zzZHt += 16;
        while (true) {
            int i = this.zzZHt;
            if (i >= 6) {
                int i2 = i - 6;
                this.zzZHt = i2;
                int i3 = (this.zzZHs + (c >> i2)) & 63;
                this.zzZHs = i3;
                byteBuffer.put(this.zzZHC.zzPw(i3));
                this.zzZHs = 0;
            } else {
                this.zzZHs = (c << (6 - i)) & 63;
                return;
            }
        }
    }
}
