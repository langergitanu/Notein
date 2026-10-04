package o0ooOoo;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;

/* JADX INFO: renamed from: o0ooOoo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31674OooO0o0 implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113211OooOo0o;

    public C31674OooO0o0() {
        this.f113211OooOo0o = new C31436OooO0Oo();
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113211OooOo0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31674OooO0o0)) {
            return false;
        }
        return this.f113211OooOo0o.equals(((C31674OooO0o0) obj).f113211OooOo0o);
    }

    public final int hashCode() {
        return this.f113211OooOo0o.hashCode();
    }

    public C31674OooO0o0(C31436OooO0Oo c31436OooO0Oo) {
        this.f113211OooOo0o = c31436OooO0Oo;
    }
}
