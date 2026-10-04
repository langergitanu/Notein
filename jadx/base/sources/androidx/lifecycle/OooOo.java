package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends AbstractC21982OooOo0O implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f65547OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC21979OooOOo0 f65548OooOo0o;

    public OooOo(AbstractC21979OooOOo0 abstractC21979OooOOo0, InterfaceC34415OooO0oo coroutineContext) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        this.f65548OooOo0o = abstractC21979OooOOo0;
        this.f65547OooOo = coroutineContext;
        if (abstractC21979OooOOo0.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            oO00o00.OooO0OO.OooO0O0(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.AbstractC21982OooOo0O
    public final AbstractC21979OooOOo0 OooO00o() {
        return this.f65548OooOo0o;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f65547OooOo;
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65548OooOo0o;
        if (abstractC21979OooOOo0.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) <= 0) {
            abstractC21979OooOOo0.OooO0OO(this);
            oO00o00.OooO0OO.OooO0O0(this.f65547OooOo, null);
        }
    }
}
