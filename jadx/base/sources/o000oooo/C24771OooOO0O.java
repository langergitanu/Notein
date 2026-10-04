package o000oooo;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.InterfaceC24758OooO0Oo;

/* JADX INFO: renamed from: o000oooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24771OooOO0O implements InterfaceC24758OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SQLiteProgram f83999OooOo0o;

    public C24771OooOO0O(SQLiteProgram delegate) {
        OooOOO0.OooO0oO(delegate, "delegate");
        this.f83999OooOo0o = delegate;
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooO0o(int i, long j) {
        this.f83999OooOo0o.bindLong(i, j);
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooO0oO(int i) {
        this.f83999OooOo0o.bindNull(i);
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooOOOO(double d, int i) {
        this.f83999OooOo0o.bindDouble(i, d);
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OoooOO0(int i, String value) {
        OooOOO0.OooO0oO(value, "value");
        this.f83999OooOo0o.bindString(i, value);
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooooO0(int i, byte[] value) {
        OooOOO0.OooO0oO(value, "value");
        this.f83999OooOo0o.bindBlob(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f83999OooOo0o.close();
    }
}
