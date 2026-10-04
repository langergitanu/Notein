package o00oo0O0;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p616io.C23988OooooOO;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;

/* JADX INFO: renamed from: o00oo0O0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25679OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25679OooOo0o f87627OooO00o;

    public static final String OooO00o(CharsetDecoder charsetDecoder, AbstractC32268OooO0oO input) throws Throwable {
        CoderResult coderResultDecode;
        C32271OooO00o c32271OooO00oOooO0O0;
        boolean z = true;
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        StringBuilder sb = new StringBuilder((int) Math.min(Integer.MAX_VALUE, input instanceof C32266OooO0Oo ? input.Oooo0() : Math.max(input.Oooo0(), 16L)));
        CharBuffer charBuffer = oO00Oo00.OooO00o.f115971OooO00o;
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        C32271OooO00o c32271OooO00oOoOO = input.ooOO(1);
        int iRemaining = 0;
        if (c32271OooO00oOoOO != null) {
            int i = 1;
            int i2 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int i3 = c32271OooO00oOoOO.f115946OooO0OO;
                    int i4 = c32271OooO00oOoOO.f115945OooO0O0;
                    int i5 = i3 - i4;
                    if (i5 >= i) {
                        int i6 = Integer.MAX_VALUE - iRemaining2;
                        if (i6 == 0) {
                            i = 0;
                        } else {
                            try {
                                ByteBuffer byteBuffer = c32271OooO00oOoOO.f115944OooO00o;
                                ByteBuffer byteBuffer2 = C32250OooO0O0.f115830OooO00o;
                                ByteBuffer byteBufferOooO0o = C23988OooooOO.OooO0o(byteBuffer, i4, i5);
                                charBufferAllocate.clear();
                                if (i6 < 8192) {
                                    charBufferAllocate.limit(i6);
                                }
                                CoderResult coderResultDecode2 = charsetDecoder.decode(byteBufferOooO0o, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                sb.append((CharSequence) charBufferAllocate);
                                if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                    oO00Oo00.OooO00o.OooO0o0(coderResultDecode2);
                                }
                                i2 = (coderResultDecode2.isUnderflow() && byteBufferOooO0o.hasRemaining()) ? i2 + 1 : 1;
                                if (byteBufferOooO0o.limit() != i5) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                c32271OooO00oOoOO.OooO0OO(byteBufferOooO0o.position());
                                i = i2;
                            } finally {
                            }
                        }
                        i5 = c32271OooO00oOoOO.f115946OooO0OO - c32271OooO00oOoOO.f115945OooO0O0;
                    }
                    if (i5 == 0) {
                        try {
                            c32271OooO00oOooO0O0 = C32273OooO0Oo.OooO0O0(input, c32271OooO00oOoOO);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                C32273OooO0Oo.OooO00o(input, c32271OooO00oOoOO);
                            }
                            throw th;
                        }
                    } else if (i5 < i || c32271OooO00oOoOO.f115948OooO0o - c32271OooO00oOoOO.f115949OooO0o0 < 8) {
                        C32273OooO0Oo.OooO00o(input, c32271OooO00oOoOO);
                        c32271OooO00oOooO0O0 = input.ooOO(i);
                    } else {
                        c32271OooO00oOooO0O0 = c32271OooO00oOoOO;
                    }
                    if (c32271OooO00oOooO0O0 == null) {
                        break;
                    }
                    if (i <= 0) {
                        iRemaining = 1;
                        c32271OooO00oOoOO = c32271OooO00oOooO0O0;
                        break;
                    }
                    c32271OooO00oOoOO = c32271OooO00oOooO0O0;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (iRemaining != 0) {
                C32273OooO0Oo.OooO00o(input, c32271OooO00oOoOO);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i7 = Integer.MAX_VALUE - iRemaining;
            if (i7 == 0) {
                break;
            }
            if (i7 < 8192) {
                charBufferAllocate.limit(i7);
            }
            coderResultDecode = charsetDecoder.decode(oO00Oo00.OooO00o.f115972OooO0O0, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            sb.append((CharSequence) charBufferAllocate);
            if (coderResultDecode.isUnmappable() || coderResultDecode.isMalformed()) {
                oO00Oo00.OooO00o.OooO0o0(coderResultDecode);
            }
        } while (coderResultDecode.isOverflow());
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final C32266OooO0Oo OooO0O0(CharsetEncoder charsetEncoder, String input, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        try {
            OooO0OO(charsetEncoder, oooO0OO, input, i, i2);
            return oooO0OO.ooOO();
        } catch (Throwable th) {
            oooO0OO.close();
            throw th;
        }
    }

    public static final void OooO0OO(CharsetEncoder charsetEncoder, oO00Oo0.OooO0OO destination, CharSequence input, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        if (i >= i2) {
            return;
        }
        C32271OooO00o c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(destination, 1, null);
        while (true) {
            try {
                int iOooO0O0 = oO00Oo00.OooO00o.OooO0O0(charsetEncoder, input, i, i2, c32271OooO00oOooO0OO);
                if (iOooO0O0 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i += iOooO0O0;
                int i3 = i >= i2 ? 0 : iOooO0O0 == 0 ? 8 : 1;
                if (i3 > 0) {
                    c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(destination, i3, c32271OooO00oOooO0OO);
                } else {
                    destination.OooO00o();
                    C32271OooO00o c32271OooO00oOooO0OO2 = C32273OooO0Oo.OooO0OO(destination, 1, null);
                    int i4 = 1;
                    while (true) {
                        try {
                            i4 = oO00Oo00.OooO00o.OooO00o(charsetEncoder, c32271OooO00oOooO0OO2) ? 0 : i4 + 1;
                            if (i4 <= 0) {
                                return;
                            } else {
                                c32271OooO00oOooO0OO2 = C32273OooO0Oo.OooO0OO(destination, 1, c32271OooO00oOooO0OO2);
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static boolean OooO0Oo(Uri uri) {
        return uri != null && FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
