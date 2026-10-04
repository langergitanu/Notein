package ooOOoOO0;

import OooO0Oo.C20398OooO0O0;
import io.ktor.utils.p616io.jvm.javaio.C24002OooO0o0;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: ooOOoOO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35122OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24002OooO0o0 f126114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CharsetDecoder f126115OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ByteBuffer f126116OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f126117OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public char f126118OooO0o0;

    public C35122OooOO0(C24002OooO0o0 c24002OooO0o0, Charset charset) {
        byte[] bArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
        this.f126114OooO00o = c24002OooO0o0;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f126115OooO0O0 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        C35119OooO0o0 c35119OooO0o0 = C35119OooO0o0.f126110OooO0O0;
        synchronized (c35119OooO0o0) {
            C34426OooOO0o<byte[]> c34426OooOO0o = c35119OooO0o0.f126109OooO00o;
            byte[] bArrRemoveLast = c34426OooOO0o.isEmpty() ? null : c34426OooOO0o.removeLast();
            bArr = bArrRemoveLast != null ? bArrRemoveLast : null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        this.f126116OooO0OO = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO00o(char[] cArr, int i, int i2) throws CharacterCodingException {
        int i3;
        CharsetDecoder charsetDecoder;
        char c;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Unexpected arguments: ", i, ", ", ", ", i2);
            sbOooO0O0.append(cArr.length);
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
        boolean z = true;
        if (this.f126117OooO0Oo) {
            cArr[i] = this.f126118OooO0o0;
            i++;
            i2--;
            this.f126117OooO0Oo = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (this.f126117OooO0Oo) {
                this.f126117OooO0Oo = false;
                c = this.f126118OooO0o0;
            } else {
                char[] cArr2 = new char[2];
                int iOooO00o = OooO00o(cArr2, 0, 2);
                if (iOooO00o == -1) {
                    c = 65535;
                } else if (iOooO00o == 1) {
                    c = cArr2[0];
                } else {
                    if (iOooO00o != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iOooO00o).toString());
                    }
                    this.f126118OooO0o0 = cArr2[1];
                    this.f126117OooO0Oo = true;
                    c = cArr2[0];
                }
            }
            if (c != 65535) {
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z2 = false;
        while (true) {
            charsetDecoder = this.f126115OooO0O0;
            ByteBuffer byteBuffer = this.f126116OooO0OO;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            if (coderResultDecode.isUnderflow()) {
                if (z2 || !charBuffer.hasRemaining()) {
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f126114OooO00o.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining >= 0) {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z2 = true;
                    } else {
                        continue;
                    }
                } finally {
                    byteBuffer.flip();
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
