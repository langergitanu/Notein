package oO0OooO;

import oO0OOOo.C32995OooOOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33299OooO0oO;
import oO0OooO.AbstractC33456OooO0o0;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0OooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33462OooOOO implements InterfaceC33463OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC33457OooO0oO.OooO00o f120928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC33456OooO0o0 f120929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32995OooOOO0 f120930OooO0o0;

    public C33462OooOOO(AbstractC33457OooO0oO.OooO00o kotlinTypeRefiner) {
        AbstractC33456OooO0o0.OooO00o kotlinTypePreparator = AbstractC33456OooO0o0.OooO00o.f120915OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypePreparator, "kotlinTypePreparator");
        this.f120928OooO0OO = kotlinTypeRefiner;
        this.f120929OooO0Oo = kotlinTypePreparator;
        this.f120930OooO0o0 = new C32995OooOOO0(C32995OooOOO0.f119371OooO0o, kotlinTypeRefiner, kotlinTypePreparator);
    }

    @Override // oO0OooO.InterfaceC33463OooOOO0
    public final C32995OooOOO0 OooO00o() {
        return this.f120930OooO0o0;
    }

    @Override // oO0OooO.InterfaceC33463OooOOO0
    public final AbstractC33457OooO0oO OooO0O0() {
        return this.f120928OooO0OO;
    }

    public final boolean OooO0OO(AbstractC33320OooOoo a, AbstractC33320OooOoo b) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        return C33299OooO0oO.OooO0o0(C33451OooO00o.OooO00o(false, this.f120929OooO0Oo, this.f120928OooO0OO, 6), a.o00000OO(), b.o00000OO());
    }

    public final boolean OooO0Oo(AbstractC33320OooOoo subtype, AbstractC33320OooOoo supertype) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(subtype, "subtype");
        kotlin.jvm.internal.OooOOO0.OooO0oO(supertype, "supertype");
        return C33299OooO0oO.OooO(C33299OooO0oO.f120531OooO00o, C33451OooO00o.OooO00o(true, this.f120929OooO0Oo, this.f120928OooO0OO, 6), subtype.o00000OO(), supertype.o00000OO());
    }
}
