package o00000;

import o00000.InterfaceC24054OooOo0;
import oO0o0O0o.C33595OooOOo;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: o00000.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24056OooOo0o implements o000oOoO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char f81067OooO0O0;

    public C24056OooOo0o() {
        this(0);
    }

    @Override // o00000.o000oOoO
    public final C24077OoooOO0 OooO00o(C34680OooO0O0 text) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        return new C24077OoooOO0(new C34680OooO0O0(6, C33595OooOOo.OooOo00(String.valueOf(this.f81067OooO0O0), text.f124887OooOo0o.length()), null), InterfaceC24054OooOo0.OooO00o.f81062OooO00o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24056OooOo0o) {
            return this.f81067OooO0O0 == ((C24056OooOo0o) obj).f81067OooO0O0;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.f81067OooO0O0);
    }

    public C24056OooOo0o(int i) {
        this.f81067OooO0O0 = (char) 8226;
    }
}
