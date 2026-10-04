package oO00Oo;

import oO0o0OO.InterfaceC33627OooOoOO;

/* JADX INFO: renamed from: oO00Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32256OooO0o extends Exception implements InterfaceC33627OooOoOO<C32256OooO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f115863OooOo0o;

    public C32256OooO0o(String violation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(violation, "violation");
        this.f115863OooOo0o = violation;
    }

    @Override // oO0o0OO.InterfaceC33627OooOoOO
    public final Throwable OooO00o() {
        C32256OooO0o c32256OooO0o = new C32256OooO0o(this.f115863OooOo0o);
        c32256OooO0o.initCause(this);
        return c32256OooO0o;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Received illegal frame: " + this.f115863OooOo0o;
    }
}
