package o0O0oooO;

import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$hasVipEntitlements$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o0000O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, FirebaseUserMembership, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ FirebaseUserMembership f90180OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Boolean f90181OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Boolean bool, FirebaseUserMembership firebaseUserMembership, Continuation<? super Boolean> continuation) {
        o0000O0 o0000o0 = new o0000O0(3, continuation);
        o0000o0.f90181OooOo0o = bool;
        o0000o0.f90180OooOo = firebaseUserMembership;
        return o0000o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Boolean bool = this.f90181OooOo0o;
        FirebaseUserMembership firebaseUserMembership = this.f90180OooOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("UserViewModel");
        boolean z = false;
        c20358OooO00o.OooO0o0("privacy agreed: " + bool + ", membership: " + firebaseUserMembership, new Object[0]);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(bool, Boolean.TRUE)) {
            if ((firebaseUserMembership != null ? firebaseUserMembership.getMembershipType() : null) != FirebaseUserMembership.MembershipType.FREE) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
