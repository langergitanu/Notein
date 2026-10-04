package o0ooO0o0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import com.gemalto.jp2.JP2Decoder;
import com.gemalto.jp2.JP2Encoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31477OooOOOO extends AbstractC31473OooOO0O {
    public static Bitmap OooO0o0(InputStream inputStream, C31472OooOO0 c31472OooOO0) throws IOException {
        try {
            Class.forName("com.gemalto.jp2.JP2Decoder");
            Bitmap bitmapDecode = new JP2Decoder(inputStream).decode();
            C31436OooO0Oo c31436OooO0Oo = c31472OooOO0.f112595OooO00o;
            if (!c31436OooO0Oo.Oooo00o(C31441OooOO0.f112325o000OO0o)) {
                c31436OooO0Oo.o000OOoO(C31441OooOO0.f112457oo0o0Oo);
            }
            c31436OooO0Oo.o000Oo(C31441OooOO0.f112422o00OOOo, bitmapDecode.getWidth());
            c31436OooO0Oo.o000Oo(C31441OooOO0.f112314o000O00O, bitmapDecode.getHeight());
            if (!c31436OooO0Oo.f112222OooOoO0.containsKey(C31441OooOO0.f112433o00Ooo) && Build.VERSION.SDK_INT > 26) {
                bitmapDecode.getColorSpace();
            }
            return bitmapDecode;
        } catch (ClassNotFoundException unused) {
            throw new C31480OooOOo0("Cannot read JPX image: JP2Android is not installed.");
        }
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        return OooO0O0(inputStream, outputStream, c31448OooOOo, i);
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO0O0(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        C31472OooOO0 c31472OooOO0 = new C31472OooOO0(c31436OooO0Oo);
        c31436OooO0Oo.OooOooo(c31448OooOOo);
        Bitmap bitmapOooO0o0 = OooO0o0(inputStream, c31472OooOO0);
        int height = bitmapOooO0o0.getHeight() * bitmapOooO0o0.getWidth();
        int[] iArr = new int[height];
        bitmapOooO0o0.getPixels(iArr, 0, bitmapOooO0o0.getWidth(), 0, 0, bitmapOooO0o0.getWidth(), bitmapOooO0o0.getHeight());
        byte[] bArr = new byte[3072];
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            if (i2 + 3 >= 3072) {
                outputStream.write(bArr, 0, i2);
                i2 = 0;
            }
            int i4 = iArr[i3];
            bArr[i2] = (byte) Color.red(i4);
            bArr[i2 + 1] = (byte) Color.green(i4);
            bArr[i2 + 2] = (byte) Color.blue(i4);
            i2 += 3;
        }
        outputStream.write(bArr, 0, i2);
        return c31472OooOO0;
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        C31455OooO00o.OooO0OO(new ByteArrayInputStream(new JP2Encoder(BitmapFactory.decodeStream(c31460OooO0o0)).encode()), outputStream);
        outputStream.flush();
    }
}
