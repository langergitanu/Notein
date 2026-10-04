package oO00Oo;

import oO0o0OO.InterfaceC33627OooOoOO;

/* JADX INFO: renamed from: oO00Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32255OooO0Oo extends Exception implements InterfaceC33627OooOoOO<C32255OooO0Oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f115862OooOo0o;

    public C32255OooO0Oo(long j) {
        this.f115862OooOo0o = j;
    }

    @Override // oO0o0OO.InterfaceC33627OooOoOO
    public final Throwable OooO00o() {
        C32255OooO0Oo c32255OooO0Oo = new C32255OooO0Oo(this.f115862OooOo0o);
        c32255OooO0Oo.initCause(this);
        return c32255OooO0Oo;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: " + this.f115862OooOo0o;
    }
}
