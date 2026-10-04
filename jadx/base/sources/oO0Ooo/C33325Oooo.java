package oO0Ooo;

import OooOoOO.C20519OooO0Oo;
import o00OO0o0.C24998OooO0O0;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33325Oooo extends AbstractC33349OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32637OoooOoo f120578OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f120579OooO0O0;

    /* JADX INFO: renamed from: oO0Ooo.Oooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC33320OooOoo> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC33320OooOoo invoke() {
            return C24998OooO0O0.OooO0o(C33325Oooo.this.f120578OooO00o);
        }
    }

    public C33325Oooo(InterfaceC32637OoooOoo typeParameter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
        this.f120578OooO00o = typeParameter;
        this.f120579OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooO00o());
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final boolean OooO00o() {
        return true;
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final InterfaceC33348OooooOO OooO0O0(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final int OooO0OO() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final AbstractC33320OooOoo getType() {
        return (AbstractC33320OooOoo) this.f120579OooO0O0.getValue();
    }
}
