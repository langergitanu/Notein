package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21922OoooOOO extends Writer {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final StringBuilder f65071OooOo = new StringBuilder(128);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f65072OooOo0o = "FragmentManager";

    public final void OooO00o() {
        StringBuilder sb = this.f65071OooOo;
        if (sb.length() > 0) {
            Log.d(this.f65072OooOo0o, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        OooO00o();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                OooO00o();
            } else {
                this.f65071OooOo.append(c);
            }
        }
    }
}
