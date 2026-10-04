package oO0o0OO;

/* JADX INFO: renamed from: oO0o0OO.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33652OoooOoo implements InterfaceC33610OooOO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33651OoooOoO f121331OooOo0o;

    public C33652OoooOoo(InterfaceC33651OoooOoO interfaceC33651OoooOoO) {
        this.f121331OooOo0o = interfaceC33651OoooOoO;
    }

    @Override // oO0o0OO.InterfaceC33610OooOO0
    public final void OooO00o(Throwable th) {
        this.f121331OooOo0o.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f121331OooOo0o + ']';
    }
}
