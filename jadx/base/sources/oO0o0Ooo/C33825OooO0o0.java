package oO0o0Ooo;

import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33825OooO0o0 extends RuntimeException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final transient InterfaceC34415OooO0oo f121923OooOo0o;

    public C33825OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f121923OooOo0o = interfaceC34415OooO0oo;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f121923OooOo0o.toString();
    }
}
