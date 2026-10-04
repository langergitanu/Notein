package oO0Ooo;

import OooooOO.C21327Oooo0;
import kotlin.jvm.internal.C24035Oooo00o;
import oOo0oooO.InterfaceC34588OooO0oO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33303OooOO0O extends AbstractC33338OoooOO0<C33303OooOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34588OooO0oO f120539OooO00o;

    public C33303OooOO0O(InterfaceC34588OooO0oO annotations) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotations, "annotations");
        this.f120539OooO00o = annotations;
    }

    @Override // oO0Ooo.AbstractC33338OoooOO0
    public final C33303OooOO0O OooO00o(AbstractC33338OoooOO0 abstractC33338OoooOO0) {
        C33303OooOO0O c33303OooOO0O = (C33303OooOO0O) abstractC33338OoooOO0;
        return c33303OooOO0O == null ? this : new C33303OooOO0O(C21327Oooo0.OooO00o(this.f120539OooO00o, c33303OooOO0O.f120539OooO00o));
    }

    @Override // oO0Ooo.AbstractC33338OoooOO0
    public final InterfaceC34595OooO0Oo<? extends C33303OooOO0O> OooO0O0() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(C33303OooOO0O.class);
    }

    @Override // oO0Ooo.AbstractC33338OoooOO0
    public final C33303OooOO0O OooO0OO(AbstractC33338OoooOO0 abstractC33338OoooOO0) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0((C33303OooOO0O) abstractC33338OoooOO0, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C33303OooOO0O) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(((C33303OooOO0O) obj).f120539OooO00o, this.f120539OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f120539OooO00o.hashCode();
    }
}
