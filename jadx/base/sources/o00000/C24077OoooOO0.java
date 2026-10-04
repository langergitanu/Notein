package o00000;

import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: o00000.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24077OoooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34680OooO0O0 f81123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC24054OooOo0 f81124OooO0O0;

    public C24077OoooOO0(C34680OooO0O0 text, InterfaceC24054OooOo0 interfaceC24054OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        this.f81123OooO00o = text;
        this.f81124OooO0O0 = interfaceC24054OooOo0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24077OoooOO0)) {
            return false;
        }
        C24077OoooOO0 c24077OoooOO0 = (C24077OoooOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81123OooO00o, c24077OoooOO0.f81123OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81124OooO0O0, c24077OoooOO0.f81124OooO0O0);
    }

    public final int hashCode() {
        return this.f81124OooO0O0.hashCode() + (this.f81123OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f81123OooO00o) + ", offsetMapping=" + this.f81124OooO0O0 + ')';
    }
}
