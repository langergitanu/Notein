package com.aspose.words.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes5.dex */
final class zzZHY extends CharsetDecoder {
    private final byte zzZHA;
    private final byte zzZHB;
    private final zzZI1 zzZHC;
    private final boolean zzZHD;
    private boolean zzZHv;
    private boolean zzZHw;
    private int zzZHx;
    private int zzZHy;
    private boolean zzZHz;

    public zzZHY(zzZHZ zzzhz, zzZI1 zzzi1, boolean z) {
        super(zzzhz, 0.6f, 1.0f);
        this.zzZHC = zzzi1;
        this.zzZHD = z;
        this.zzZHB = zzzhz.zzcJ();
        this.zzZHA = zzzhz.zzcI();
    }

    private static CoderResult zzX(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() - 1);
        return CoderResult.malformedForLength(1);
    }

    private static CoderResult zzY(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() - 1);
        return CoderResult.OVERFLOW;
    }

    private CoderResult zzZ(ByteBuffer byteBuffer, CharBuffer charBuffer, byte b) {
        int iZzA = this.zzZHC.zzA(b);
        if (iZzA < 0) {
            if (this.zzZHD) {
                return zzX(byteBuffer);
            }
            charBuffer.put((char) b);
            CoderResult coderResultZzX = zzcH() ? zzX(byteBuffer) : null;
            zzcG();
            return coderResultZzX;
        }
        int i = this.zzZHy;
        int i2 = i + 6;
        this.zzZHy = i2;
        if (i2 < 16) {
            this.zzZHx += iZzA << (16 - i2);
            return null;
        }
        int i3 = i - 10;
        this.zzZHy = i3;
        int i4 = this.zzZHx + (iZzA >> i3);
        this.zzZHx = i4;
        charBuffer.put((char) i4);
        this.zzZHx = (iZzA << (16 - this.zzZHy)) & 65535;
        return null;
    }

    private void zzcG() {
        this.zzZHz = false;
        this.zzZHy = 0;
        this.zzZHx = 0;
    }

    private boolean zzcH() {
        return this.zzZHx != 0 || this.zzZHy >= 6;
    }

    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (this.zzZHz) {
                if (b == this.zzZHA) {
                    if (zzcH()) {
                        return zzX(byteBuffer);
                    }
                    if (!this.zzZHw) {
                        this.zzZHv = true;
                    } else {
                        if (!charBuffer.hasRemaining()) {
                            return zzY(byteBuffer);
                        }
                        charBuffer.put((char) this.zzZHB);
                    }
                    zzcG();
                } else {
                    if (!charBuffer.hasRemaining()) {
                        return zzY(byteBuffer);
                    }
                    CoderResult coderResultZzZ = zzZ(byteBuffer, charBuffer, b);
                    if (coderResultZzZ != null) {
                        return coderResultZzZ;
                    }
                }
                this.zzZHw = false;
            } else if (b == this.zzZHB) {
                this.zzZHz = true;
                if (this.zzZHv && this.zzZHD) {
                    return zzX(byteBuffer);
                }
                this.zzZHw = true;
            } else {
                if (!charBuffer.hasRemaining()) {
                    return zzY(byteBuffer);
                }
                charBuffer.put((char) b);
                this.zzZHv = false;
            }
        }
        return CoderResult.UNDERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult implFlush(CharBuffer charBuffer) {
        return ((this.zzZHz && this.zzZHD) || zzcH()) ? CoderResult.malformedForLength(1) : CoderResult.UNDERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    public final void implReset() {
        zzcG();
        this.zzZHv = false;
    }
}
