package o0OOOO0o;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOOO0o.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.NoteinFirebaseUserRepoImpl$signUp$2", m80623f = "NoteinFirebaseUserRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27112OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f94519OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f94520OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94521OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27112OooOoo0(String str, String str2, Continuation<? super C27112OooOoo0> continuation) {
        super(2, continuation);
        this.f94519OooOo = str;
        this.f94521OooOoO0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27112OooOoo0 c27112OooOoo0 = new C27112OooOoo0(this.f94519OooOo, this.f94521OooOoO0, continuation);
        c27112OooOoo0.f94520OooOo0o = obj;
        return c27112OooOoo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27112OooOoo0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f94520OooOo0o;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
        c24334OooO0O0.OooO0oO(App.f69542OooOoo, this.f94519OooOo);
        c24334OooO0O0.OooO0oO(App.f69544OooOooO, this.f94521OooOoO0);
        return C32460OooOooO.f116667OooO00o;
    }
}
