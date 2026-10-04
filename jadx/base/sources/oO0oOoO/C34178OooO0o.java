package oO0oOoO;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: oO0oOoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34178OooO0o extends FilterInputStream {
    public C34178OooO0o(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int iOooO0O0 = oOO00.OooO00o.OooO0O0(((FilterInputStream) this).in, bArr, i, i2);
        if (iOooO0O0 > 0) {
            return iOooO0O0;
        }
        return -1;
    }
}
