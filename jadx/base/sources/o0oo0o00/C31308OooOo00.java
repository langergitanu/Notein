package o0oo0o00;

import java.io.IOException;

/* JADX INFO: renamed from: o0oo0o00.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31308OooOo00 extends AbstractC31307OooOo0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object[] f111786OooOoo = new Object[32];

    public C31308OooOo00() {
        OooOOO0(6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f111781OooOo0o;
        if (i > 1 || (i == 1 && this.f111780OooOo[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f111781OooOo0o = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f111781OooOo0o == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}
