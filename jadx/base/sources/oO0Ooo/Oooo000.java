package oO0Ooo;

import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 extends AbstractC33355o00ooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33361OooO0Oo f120581OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC33370OooOO0<AbstractC33320OooOoo> f120582OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f120583OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(C33361OooO0Oo storageManager, oO0O000o.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageManager, "storageManager");
        this.f120581OooOo = storageManager;
        this.f120583OooOoO0 = (kotlin.jvm.internal.OooOOOO) oooO00o;
        this.f120582OooOoO = storageManager.OooO00o(oooO00o);
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    /* JADX INFO: renamed from: o00000O */
    public final AbstractC33320OooOoo o00000o0(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new Oooo000(this.f120581OooOo, new C33324OooOooo(kotlinTypeRefiner, this));
    }

    @Override // oO0Ooo.AbstractC33355o00ooo
    public final AbstractC33320OooOoo o00000Oo() {
        return this.f120582OooOoO.invoke();
    }

    @Override // oO0Ooo.AbstractC33355o00ooo
    public final boolean o00000o0() {
        C33361OooO0Oo.OooO0o oooO0o = (C33361OooO0Oo.OooO0o) this.f120582OooOoO;
        return (oooO0o.f120649OooOoO0 == C33361OooO0Oo.EnumC33365OooOO0o.f120657OooOo0o || oooO0o.f120649OooOoO0 == C33361OooO0Oo.EnumC33365OooOO0o.f120656OooOo) ? false : true;
    }
}
