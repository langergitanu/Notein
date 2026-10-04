package oO0OooO;

import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO.InterfaceC33463OooOOO0;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0OooO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33470OooOo0 extends kotlin.jvm.internal.OooOO0O implements InterfaceC32508OooOOOo<AbstractC33320OooOoo, AbstractC33320OooOoo, Boolean> {
    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public final String getName() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34596OooO0o getOwner() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(C33468OooOOoo.class);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Boolean invoke(AbstractC33320OooOoo abstractC33320OooOoo, AbstractC33320OooOoo abstractC33320OooOoo2) {
        AbstractC33320OooOoo p0 = abstractC33320OooOoo;
        AbstractC33320OooOoo p1 = abstractC33320OooOoo2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        kotlin.jvm.internal.OooOOO0.OooO0oO(p1, "p1");
        ((C33468OooOOoo) this.receiver).getClass();
        InterfaceC33463OooOOO0.f120931OooO0O0.getClass();
        C33462OooOOO c33462OooOOO = InterfaceC33463OooOOO0.OooO00o.f120933OooO0O0;
        return Boolean.valueOf(c33462OooOOO.OooO0Oo(p0, p1) && !c33462OooOOO.OooO0Oo(p1, p0));
    }
}
