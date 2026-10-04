package o0ooO0o0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31481OooOOoo extends AbstractC31473OooOO0O {
    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        byte[] bArr = new byte[128];
        while (true) {
            int i2 = inputStream.read();
            if (i2 == -1 || i2 == 128) {
                break;
            }
            if (i2 <= 127) {
                int i3 = i2 + 1;
                while (i3 > 0) {
                    int i4 = inputStream.read(bArr, 0, i3);
                    if (i4 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i4);
                    i3 -= i4;
                }
            } else {
                int i5 = inputStream.read();
                if (i5 == -1) {
                    break;
                }
                for (int i6 = 0; i6 < 257 - i2; i6++) {
                    outputStream.write(i5);
                }
            }
        }
        return new C31472OooOO0(c31448OooOOo);
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        Log.w("PdfBox-Android", "RunLengthDecodeFilter.encode is not implemented yet, skipping this stream.");
    }
}
