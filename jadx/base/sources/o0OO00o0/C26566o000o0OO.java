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

/* JADX INFO: renamed from: o0OO00o0.o000o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$saveShowDualLinkIcon$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26566o000o0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Boolean> f91563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91564OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f91565OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26566o000o0OO(AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o, boolean z, Continuation<? super C26566o000o0OO> continuation) {
        super(2, continuation);
        this.f91563OooOo = oooO00o;
        this.f91565OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26566o000o0OO c26566o000o0OO = new C26566o000o0OO(this.f91563OooOo, this.f91565OooOoO0, continuation);
        c26566o000o0OO.f91564OooOo0o = obj;
        return c26566o000o0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26566o000o0OO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f91564OooOo0o).OooO0oO(this.f91563OooOo, Boolean.valueOf(this.f91565OooOoO0));
        return C32460OooOooO.f116667OooO00o;
    }
}
