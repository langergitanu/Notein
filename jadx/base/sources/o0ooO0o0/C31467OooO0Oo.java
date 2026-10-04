package o0ooO0o0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31460OooO0o0;
import o0oooOO0.C31836OooO0O0;

/* JADX INFO: renamed from: o0ooO0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31467OooO0Oo extends AbstractC31473OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f112544OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        int i2;
        while (true) {
            int i3 = inputStream.read();
            if (i3 == -1) {
                break;
            }
            while (true) {
                if (i3 != 0 && i3 != 9 && i3 != 10 && i3 != 12 && i3 != 13 && i3 != 32) {
                    break;
                }
                i3 = inputStream.read();
            }
            if (i3 == -1 || i3 == 62) {
                break;
            }
            int[] iArr = f112544OooO00o;
            if (iArr[i3] == -1) {
                StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i3, "Invalid hex, int: ", " char: ");
                sbOooO0OO.append((char) i3);
                Log.e("PdfBox-Android", sbOooO0OO.toString());
            }
            i2 = iArr[i3] * 16;
            int i4 = inputStream.read();
            if (i4 == -1 || i4 == 62) {
                break;
            }
            if (i4 >= 0) {
                if (iArr[i4] == -1) {
                    StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i4, "Invalid hex, int: ", " char: ");
                    sbOooO0OO2.append((char) i4);
                    Log.e("PdfBox-Android", sbOooO0OO2.toString());
                }
                i2 += iArr[i4];
            }
            outputStream.write(i2);
        }
        outputStream.write(i2);
        outputStream.flush();
        return new C31472OooOO0(c31448OooOOo);
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        while (true) {
            int i = c31460OooO0o0.read();
            if (i == -1) {
                outputStream.flush();
                return;
            }
            C31836OooO0O0.OooO0O0((byte) i, outputStream);
        }
    }
}
