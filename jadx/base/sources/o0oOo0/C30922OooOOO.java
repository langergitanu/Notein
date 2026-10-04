package o0oOo0;

import com.orion.notein.p607ui.user.UserInfoFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0oOo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment", m80623f = "UserInfoFragment.kt", m80624l = {139}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30922OooOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserInfoFragment f110494OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f110495OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f110496OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30922OooOOO(UserInfoFragment userInfoFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f110494OooOo = userInfoFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f110495OooOo0o = obj;
        this.f110496OooOoO0 |= Integer.MIN_VALUE;
        return UserInfoFragment.OooOoOO(this.f110494OooOo, 0, this);
    }
}
