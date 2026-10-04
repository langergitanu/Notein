package Oooo0oO;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo<N> implements InterfaceC21026OooO0oO<N> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC21026OooO0oO<N> f61265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f61266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f61267OooO0OO;

    public o0ooOOo(InterfaceC21026OooO0oO<N> interfaceC21026OooO0oO, int i) {
        this.f61265OooO00o = interfaceC21026OooO0oO;
        this.f61266OooO0O0 = i;
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO00o(int i, int i2) {
        this.f61265OooO00o.OooO00o(i + (this.f61267OooO0OO == 0 ? this.f61266OooO0O0 : 0), i2);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0OO(int i, int i2, int i3) {
        int i4 = this.f61267OooO0OO == 0 ? this.f61266OooO0O0 : 0;
        this.f61265OooO00o.OooO0OO(i + i4, i2 + i4, i3);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0Oo(int i, N n) {
        this.f61265OooO00o.OooO0Oo(i + (this.f61267OooO0OO == 0 ? this.f61266OooO0O0 : 0), n);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0o(int i, N n) {
        this.f61265OooO00o.OooO0o(i + (this.f61267OooO0OO == 0 ? this.f61266OooO0O0 : 0), n);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final N OooO0o0() {
        return this.f61265OooO00o.OooO0o0();
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0oO(N n) {
        this.f61267OooO0OO++;
        this.f61265OooO00o.OooO0oO(n);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    /* JADX INFO: renamed from: up */
    public final void mo0up() {
        int i = this.f61267OooO0OO;
        if (!(i > 0)) {
            C21038OooOo.OooO0OO("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.f61267OooO0OO = i - 1;
        this.f61265OooO00o.mo0up();
    }
}
