package o00o0o0o;

import java.io.IOException;
import java.io.OutputStream;
import o00O0oo0.C24969OooOO0;
import o00ooO0.C25748OooOoO;

/* JADX INFO: renamed from: o00o0o0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25442OooO extends OutputStream {
    public abstract C25748OooOoO OooO00o();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C24969OooOO0.OooO0o(e);
            throw null;
        }
    }

    public abstract int size();
}
