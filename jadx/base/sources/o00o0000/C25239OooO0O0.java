package o00o0000;

import androidx.fragment.app.C21929Ooooo0o;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00o0000.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25239OooO0O0<T> implements InterfaceC25145OooOo0o<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f85961OooOo0o;

    public C25239OooO0O0(T t) {
        C21929Ooooo0o.OooO0OO(t, "Argument must not be null");
        this.f85961OooOo0o = t;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<T> OooO00o() {
        return (Class<T>) this.f85961OooOo0o.getClass();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final T get() {
        return this.f85961OooOo0o;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        return 1;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
    }
}
