package o0ooO0o0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31476OooOOO0 extends AbstractC31473OooOO0O {
    public static void OooO0o0(InputStream inputStream, OutputStream outputStream) throws DataFormatException, IOException {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int i = inputStream.read(bArr);
        if (i > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, i);
            byte[] bArr2 = new byte[1024];
            boolean z = false;
            while (true) {
                try {
                    try {
                        int iInflate = inflater.inflate(bArr2);
                        if (iInflate == 0) {
                            if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                                break;
                            } else {
                                inflater.setInput(bArr, 0, inputStream.read(bArr));
                            }
                        } else {
                            outputStream.write(bArr2, 0, iInflate);
                            z = true;
                        }
                    } catch (DataFormatException e) {
                        if (!z) {
                            throw e;
                        }
                        Log.w("PdfBox-Android", "FlateFilter: premature end of stream due to a DataFormatException");
                    }
                } finally {
                    inflater.end();
                }
            }
        }
        outputStream.flush();
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        try {
            OooO0o0(inputStream, C31479OooOOo.OooO00o(outputStream, AbstractC31473OooOO0O.OooO0Oo(c31448OooOOo, i)));
            return new C31472OooOO0(c31448OooOOo);
        } catch (DataFormatException e) {
            Log.e("PdfBox-Android", "FlateFilter: stop reading corrupt stream due to a DataFormatException");
            throw new IOException(e);
        }
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        int i;
        try {
            i = Integer.parseInt(System.getProperty("com.tom_roush.pdfbox.filter.deflatelevel", "-1"));
        } catch (NumberFormatException e) {
            Log.w("PdfBox-Android", e.getMessage(), e);
            i = -1;
        }
        Deflater deflater = new Deflater(Math.max(-1, Math.min(9, i)));
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
        C31455OooO00o.OooO0OO(c31460OooO0o0, deflaterOutputStream);
        deflaterOutputStream.close();
        outputStream.flush();
        deflater.end();
    }
}
