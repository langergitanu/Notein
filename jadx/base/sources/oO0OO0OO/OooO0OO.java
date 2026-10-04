package oO0OO0OO;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import oO000OoO.C32078OooO0oo;
import oO000OoO.EnumC32073OooO00o;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO implements oO000OoO.OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO000OoO.OooO0OO f118643OooOo0o;

    public OooO0OO(oO000OoO.OooO0OO oooO0OO) {
        this.f118643OooOo0o = (oO000OoO.OooO0OO) Preconditions.checkNotNull(oooO0OO, "delegate");
    }

    @Override // oO000OoO.OooO0OO
    public final void OooOoO(EnumC32073OooO00o enumC32073OooO00o, byte[] bArr) throws IOException {
        this.f118643OooOo0o.OooOoO(enumC32073OooO00o, bArr);
    }

    @Override // oO000OoO.OooO0OO
    public final void OooOoO0() throws IOException {
        this.f118643OooOo0o.OooOoO0();
    }

    @Override // oO000OoO.OooO0OO
    public final void OoooO0(C32078OooO0oo c32078OooO0oo) throws IOException {
        this.f118643OooOo0o.OoooO0(c32078OooO0oo);
    }

    @Override // oO000OoO.OooO0OO
    public final void OoooO00(ArrayList arrayList, int i, boolean z) throws IOException {
        this.f118643OooOo0o.OoooO00(arrayList, i, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f118643OooOo0o.close();
    }

    @Override // oO000OoO.OooO0OO
    public final void flush() throws IOException {
        this.f118643OooOo0o.flush();
    }

    @Override // oO000OoO.OooO0OO
    public final void o00000O(int i, long j) throws IOException {
        this.f118643OooOo0o.o00000O(i, j);
    }

    @Override // oO000OoO.OooO0OO
    public final int o0000OO0() {
        return this.f118643OooOo0o.o0000OO0();
    }

    @Override // oO000OoO.OooO0OO
    public final void o000O0O0(boolean z, int i, C34524OooO0Oo c34524OooO0Oo, int i2) throws IOException {
        this.f118643OooOo0o.o000O0O0(z, i, c34524OooO0Oo, i2);
    }
}
