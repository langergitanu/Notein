package Oooo0oO;

import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0oO.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21061OoooO0 implements o0000OO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC21063OoooO0O f61012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<C21060OoooO, InterfaceC21063OoooO0O> f61013OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C21061OoooO0(InterfaceC32507OooOO0o<? super C21060OoooO, ? extends InterfaceC21063OoooO0O> interfaceC32507OooOO0o) {
        this.f61013OooOo0o = interfaceC32507OooOO0o;
    }

    @Override // Oooo0oO.o0000OO0
    public final void OooO0o0() {
        this.f61012OooOo = this.f61013OooOo0o.invoke(C21065OoooOOO.f61015OooO00o);
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0OO() {
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0oO() {
        InterfaceC21063OoooO0O interfaceC21063OoooO0O = this.f61012OooOo;
        if (interfaceC21063OoooO0O != null) {
            interfaceC21063OoooO0O.dispose();
        }
        this.f61012OooOo = null;
    }
}
