package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$saveMultiFingerScroll$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000OOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Boolean> f91497OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91498OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f91499OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOoO(AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o, boolean z, Continuation<? super o000OOoO> continuation) {
        super(2, continuation);
        this.f91497OooOo = oooO00o;
        this.f91499OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o000OOoO o000oooo2 = new o000OOoO(this.f91497OooOo, this.f91499OooOoO0, continuation);
        o000oooo2.f91498OooOo0o = obj;
        return o000oooo2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((o000OOoO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f91498OooOo0o).OooO0oO(this.f91497OooOo, Boolean.valueOf(this.f91499OooOoO0));
        return C32460OooOooO.f116667OooO00o;
    }
}
