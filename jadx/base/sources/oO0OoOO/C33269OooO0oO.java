package oO0OoOO;

import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OO00.C32889OooOOOo;
import oO0OoO0.C33255Oooo00o;
import oO0Ooo.AbstractC33328Oooo0O0;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0OoOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33269OooO0oO extends kotlin.jvm.internal.OooOO0O implements InterfaceC32507OooOO0o<C32889OooOOOo, AbstractC33328Oooo0O0> {
    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public final String getName() {
        return "simpleType";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34596OooO0o getOwner() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(OooOOO0.OooO00o.class);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final AbstractC33328Oooo0O0 invoke(C32889OooOOOo c32889OooOOOo) {
        C32889OooOOOo p0 = c32889OooOOOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        return ((C33255Oooo00o) this.receiver).OooO0Oo(p0, true);
    }
}
