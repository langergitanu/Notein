package o0oo0oo;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0oo0oo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31399Oooo0o implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f112115OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31395Oooo00O f112116OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long[] f112117OooOoO0;

    public C31399Oooo0o(File file) throws IOException {
        C31395Oooo00O c31395Oooo00O = new C31395Oooo00O(file);
        this.f112116OooOo0o = c31395Oooo00O;
        if (!new String(c31395Oooo00O.OooOOo0(4), C31413OooO0O0.f112172OooO0Oo).equals("ttcf")) {
            throw new IOException("Missing TTC header");
        }
        float fOooOOoo = c31395Oooo00O.OooOOoo();
        int iOooo0OO = (int) c31395Oooo00O.Oooo0OO();
        this.f112115OooOo = iOooo0OO;
        if (iOooo0OO <= 0 || iOooo0OO > 1024) {
            throw new IOException(C21532OooOOo.OooO0OO(iOooo0OO, "Invalid number of fonts "));
        }
        this.f112117OooOoO0 = new long[iOooo0OO];
        for (int i = 0; i < this.f112115OooOo; i++) {
            this.f112117OooOoO0[i] = c31395Oooo00O.Oooo0OO();
        }
        if (fOooOOoo >= 2.0f) {
            c31395Oooo00O.ooOO();
            c31395Oooo00O.ooOO();
            c31395Oooo00O.ooOO();
        }
    }

    public final C31401Oooo0oO OooO00o(int i) throws IOException {
        long[] jArr = this.f112117OooOoO0;
        long j = jArr[i];
        C31395Oooo00O c31395Oooo00O = this.f112116OooOo0o;
        c31395Oooo00O.seek(j);
        C31398Oooo0OO c31391OooOoo0 = new String(c31395Oooo00O.OooOOo0(4), C31413OooO0O0.f112172OooO0Oo).equals("OTTO") ? new C31391OooOoo0(false, true) : new C31398Oooo0OO(false, true);
        c31395Oooo00O.seek(jArr[i]);
        return c31391OooOoo0.OooO0OO(new Oooo0(c31395Oooo00O));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112116OooOo0o.close();
    }
}
