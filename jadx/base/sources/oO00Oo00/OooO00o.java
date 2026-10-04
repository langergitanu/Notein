package oO00Oo00;

import io.ktor.utils.p616io.C23988OooooOO;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.OooOOO0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final CharBuffer f115971OooO00o = CharBuffer.allocate(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ByteBuffer f115972OooO0O0;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        OooOOO0.OooO0Oo(byteBufferAllocate);
        f115972OooO0O0 = byteBufferAllocate;
    }

    public static final boolean OooO00o(CharsetEncoder charsetEncoder, C32271OooO00o c32271OooO00o) throws CharacterCodingException {
        int i = c32271OooO00o.f115946OooO0OO;
        int i2 = c32271OooO00o.f115949OooO0o0 - i;
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        ByteBuffer byteBufferOooO0o = C23988OooooOO.OooO0o(c32271OooO00o.f115944OooO00o, i, i2);
        CoderResult coderResultEncode = charsetEncoder.encode(f115971OooO00o, byteBufferOooO0o, true);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            OooO0o0(coderResultEncode);
        }
        boolean zIsUnderflow = coderResultEncode.isUnderflow();
        if (byteBufferOooO0o.limit() != i2) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        c32271OooO00o.OooO00o(byteBufferOooO0o.position());
        return zIsUnderflow;
    }

    public static final int OooO0O0(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2, C32271OooO00o c32271OooO00o) throws CharacterCodingException {
        OooOOO0.OooO0oO(input, "input");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i, i2);
        int iRemaining = charBufferWrap.remaining();
        int i3 = c32271OooO00o.f115946OooO0OO;
        int i4 = c32271OooO00o.f115949OooO0o0 - i3;
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        ByteBuffer byteBufferOooO0o = C23988OooooOO.OooO0o(c32271OooO00o.f115944OooO00o, i3, i4);
        CoderResult coderResultEncode = charsetEncoder.encode(charBufferWrap, byteBufferOooO0o, false);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            OooO0o0(coderResultEncode);
        }
        if (byteBufferOooO0o.limit() != i4) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        c32271OooO00o.OooO00o(byteBufferOooO0o.position());
        return iRemaining - charBufferWrap.remaining();
    }

    public static final byte[] OooO0OO(CharsetEncoder charsetEncoder, String input, int i) {
        OooOOO0.OooO0oO(input, "input");
        if (i == input.length()) {
            byte[] bytes = input.getBytes(charsetEncoder.charset());
            OooOOO0.OooO0o(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String strSubstring = input.substring(0, i);
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        OooOOO0.OooO0o(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    public static final String OooO0Oo(Charset charset) {
        OooOOO0.OooO0oO(charset, "<this>");
        String strName = charset.name();
        OooOOO0.OooO0o(strName, "name()");
        return strName;
    }

    public static final void OooO0o0(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new OooO0O0(message);
        }
    }
}
