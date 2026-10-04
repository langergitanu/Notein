package o0OOOO0o;

import com.orion.notein.App;
import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOOO0o.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$saveUserAndTokenToLocal$2", m80623f = "UserRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27138OooooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f94667OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f94668OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ User f94669OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27138OooooOo(String str, User user, Continuation<? super C27138OooooOo> continuation) {
        super(2, continuation);
        this.f94667OooOo = str;
        this.f94669OooOoO0 = user;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27138OooooOo c27138OooooOo = new C27138OooooOo(this.f94667OooOo, this.f94669OooOoO0, continuation);
        c27138OooooOo.f94668OooOo0o = obj;
        return c27138OooooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27138OooooOo) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f94668OooOo0o;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
        c24334OooO0O0.OooO0oO(App.f69542OooOoo, this.f94667OooOo);
        c24334OooO0O0.OooO0oO(App.f69544OooOooO, this.f94669OooOoO0.getId());
        return C32460OooOooO.f116667OooO00o;
    }
}
