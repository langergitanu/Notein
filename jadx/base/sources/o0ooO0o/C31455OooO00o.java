package o0ooO0o;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: o0ooO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31455OooO00o {
    public static IOException OooO00o(Closeable closeable, String str, IOException iOException) {
        try {
            closeable.close();
            return iOException;
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Error closing ".concat(str), e);
            return iOException == null ? e : iOException;
        }
    }

    public static void OooO0O0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void OooO0OO(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static byte[] OooO0Oo(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OooO0OO(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
