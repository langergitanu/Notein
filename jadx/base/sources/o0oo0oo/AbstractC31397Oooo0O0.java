package o0oo0oo;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: o0oo0oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31397Oooo0O0 implements Closeable {
    public abstract long OooO00o() throws IOException;

    public abstract InputStream OooO0OO() throws IOException;

    public abstract long OooOOO0();

    public final byte[] OooOOo0(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Unexpected end of TTF stream reached");
    }

    public final float OooOOoo() throws IOException {
        return (float) ((((double) ooOO()) / 65536.0d) + ((double) Oooo000()));
    }

    public final Calendar OooOooo() throws IOException {
        long j = readLong();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeInMillis((j * 1000) + calendar.getTimeInMillis());
        return calendar;
    }

    public final int[] Oooo0(int i) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = read();
        }
        return iArr;
    }

    public abstract short Oooo000() throws IOException;

    public final String Oooo00o(int i, Charset charset) throws IOException {
        return new String(OooOOo0(i), charset);
    }

    public final long Oooo0OO() throws IOException {
        long j = read();
        long j2 = read();
        long j3 = read();
        long j4 = read();
        if (j4 >= 0) {
            return (j << 24) + (j2 << 16) + (j3 << 8) + j4;
        }
        throw new EOFException();
    }

    public final int[] o00Oo0(int i) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = ooOO();
        }
        return iArr;
    }

    public abstract int ooOO() throws IOException;

    public abstract int read() throws IOException;

    public abstract int read(byte[] bArr, int i, int i2) throws IOException;

    public abstract long readLong() throws IOException;

    public final int readUnsignedByte() throws IOException {
        int i = read();
        if (i != -1) {
            return i;
        }
        throw new EOFException("premature EOF");
    }

    public abstract void seek(long j) throws IOException;
}
