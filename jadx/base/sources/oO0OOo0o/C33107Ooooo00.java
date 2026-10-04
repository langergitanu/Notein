package oO0OOo0o;

import oO0OOo0o.C33065OooOOOo;

/* JADX INFO: renamed from: oO0OOo0o.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33107Ooooo00<K, V> implements InterfaceC33108Ooooo0o<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33065OooOOOo.C33066OooO0Oo f119691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00Ooo.OooOOOO f119692OooO0O0;

    public C33107Ooooo00(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, oO00Ooo.OooOOOO oooOOOO) {
        this.f119691OooO00o = c33066OooO0Oo;
        this.f119692OooO0O0 = oooOOOO;
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final InterfaceC33108Ooooo0o OooO00o(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, oO00Ooo.OooOOOO oooOOOO, int i, int i2) {
        C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo2 = this.f119691OooO00o;
        int iHashCode = c33066OooO0Oo2.hashCode();
        return iHashCode != i ? C33106OoooOoo.OooO0OO(new C33107Ooooo00(c33066OooO0Oo, oooOOOO), i, this, iHashCode, i2) : c33066OooO0Oo2 == c33066OooO0Oo ? new C33107Ooooo00(c33066OooO0Oo, oooOOOO) : new C33105OoooOoO(new Object[]{c33066OooO0Oo2, c33066OooO0Oo}, new Object[]{this.f119692OooO0O0, oooOOOO});
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final Object OooO0O0(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, int i, int i2) {
        if (this.f119691OooO00o == c33066OooO0Oo) {
            return this.f119692OooO0O0;
        }
        return null;
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final int size() {
        return 1;
    }

    public final String toString() {
        return String.format("Leaf(key=%s value=%s)", this.f119691OooO00o, this.f119692OooO0O0);
    }
}
