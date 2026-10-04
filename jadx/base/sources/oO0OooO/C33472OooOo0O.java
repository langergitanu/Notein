package oO0OooO;

import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Ooo.AbstractC33320OooOoo;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0OooO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33472OooOo0O extends kotlin.jvm.internal.OooOO0O implements InterfaceC32508OooOOOo<AbstractC33320OooOoo, AbstractC33320OooOoo, Boolean> {
    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public final String getName() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34596OooO0o getOwner() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(C33462OooOOO.class);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Boolean invoke(AbstractC33320OooOoo abstractC33320OooOoo, AbstractC33320OooOoo abstractC33320OooOoo2) {
        AbstractC33320OooOoo p0 = abstractC33320OooOoo;
        AbstractC33320OooOoo p1 = abstractC33320OooOoo2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        kotlin.jvm.internal.OooOOO0.OooO0oO(p1, "p1");
        return Boolean.valueOf(((C33462OooOOO) this.receiver).OooO0OO(p0, p1));
    }
}
