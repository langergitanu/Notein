package o0000oO;

import o0000oO.C24312OooO0o;

/* JADX INFO: renamed from: o0000oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24314OooO0oO extends C24312OooO0o {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f81861OooOOO0;

    public C24314OooO0oO(AbstractC24322OooOOOo abstractC24322OooOOOo) {
        super(abstractC24322OooOOOo);
        if (abstractC24322OooOOOo instanceof C24318OooOO0o) {
            this.f81838OooO0o0 = C24312OooO0o.OooO00o.f81844OooOo;
        } else {
            this.f81838OooO0o0 = C24312OooO0o.OooO00o.f81847OooOoO0;
        }
    }

    @Override // o0000oO.C24312OooO0o
    public final void OooO0Oo(int i) {
        if (this.f81841OooOO0) {
            return;
        }
        this.f81841OooOO0 = true;
        this.f81839OooO0oO = i;
        for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo : this.f81842OooOO0O) {
            interfaceC24311OooO0Oo.OooO00o(interfaceC24311OooO0Oo);
        }
    }
}
