package androidx.lifecycle;

import java.io.Closeable;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: androidx.lifecycle.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21972OooO0Oo implements Closeable, InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f65513OooOo0o;

    public C21972OooO0Oo(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f65513OooOo0o = interfaceC34415OooO0oo;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f65513OooOo0o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oO00o00.OooO0OO.OooO0O0(this.f65513OooOo0o, null);
    }
}
