package ooo0o;

import oO0OO00.C32889OooOOOo;
import oO0OoO0.InterfaceC33241OooOOo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33322OooOooO;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;
import oOo00OOO.C34491OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements InterfaceC33241OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f126366OooO00o = new OooOO0O();

    @Override // oO0OoO0.InterfaceC33241OooOOo
    public final AbstractC33320OooOoo OooO00o(C32889OooOOOo proto, String flexibleId, AbstractC33328Oooo0O0 lowerBound, AbstractC33328Oooo0O0 upperBound) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(flexibleId, "flexibleId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lowerBound, "lowerBound");
        kotlin.jvm.internal.OooOOO0.OooO0oO(upperBound, "upperBound");
        return !flexibleId.equals("kotlin.jvm.PlatformType") ? C33509OooO.OooO0OO(EnumC33517OooO0oo.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.OooO0oO(oO0OOO0.OooO00o.f118835OooO0oO) ? new C34491OooO0oo(lowerBound, upperBound) : C33322OooOooO.OooO0OO(lowerBound, upperBound);
    }
}
