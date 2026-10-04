package o00oo0O0;

import o00o0o.AbstractC25434OooO00o;

/* JADX INFO: renamed from: o00oo0O0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25670OooOOOO<K, V> implements InterfaceC25674OooOOoo<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25674OooOOoo<K, V> f87608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25676OooOo0 f87609OooO0O0;

    public C25670OooOOOO(InterfaceC25674OooOOoo<K, V> interfaceC25674OooOOoo, InterfaceC25676OooOo0 interfaceC25676OooOo0) {
        this.f87608OooO00o = interfaceC25674OooOOoo;
        this.f87609OooO0O0 = interfaceC25676OooOo0;
    }

    @Override // o00oo0O0.InterfaceC25674OooOOoo
    public final AbstractC25434OooO00o<V> OooO0Oo(K k, AbstractC25434OooO00o<V> abstractC25434OooO00o) {
        this.f87609OooO0O0.OooO0OO(k);
        return this.f87608OooO00o.OooO0Oo(k, abstractC25434OooO00o);
    }

    @Override // o00oo0O0.InterfaceC25674OooOOoo
    public final AbstractC25434OooO00o<V> get(K k) {
        AbstractC25434OooO00o<V> abstractC25434OooO00o = this.f87608OooO00o.get(k);
        InterfaceC25676OooOo0 interfaceC25676OooOo0 = this.f87609OooO0O0;
        if (abstractC25434OooO00o == null) {
            interfaceC25676OooOo0.OooO0O0(k);
            return abstractC25434OooO00o;
        }
        interfaceC25676OooOo0.OooO00o(k);
        return abstractC25434OooO00o;
    }
}
