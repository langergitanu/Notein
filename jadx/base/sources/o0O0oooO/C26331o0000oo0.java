package o0O0oooO;

import com.orion.notein.domain.models.User;
import com.orion.notein.domain.models.transactions.Coupon;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oo0o.C24718OooOO0o;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o0000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$flatMapLatest$2", m80623f = "UserViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C26331o0000oo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Coupon>>, User, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f90301OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90302OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90303OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f90304OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26331o0000oo0(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(3, continuation);
        this.f90303OooOoO = c26320o0000OoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Coupon>> interfaceC33723OooO0oO, User user, Continuation<? super C32460OooOooO> continuation) {
        C26331o0000oo0 c26331o0000oo0 = new C26331o0000oo0(continuation, this.f90303OooOoO);
        c26331o0000oo0.f90301OooOo = interfaceC33723OooO0oO;
        c26331o0000oo0.f90304OooOoO0 = user;
        return c26331o0000oo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90302OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f90301OooOo;
            User user = (User) this.f90304OooOoO0;
            o0OO0o.OooO0OO oooO0OO = this.f90303OooOoO.f90210OooOO0;
            if (user == null || (id = user.getId()) == null) {
                id = "";
            }
            oooO0OO.getClass();
            o0OO0o.OooO0O0 oooO0O0 = (o0OO0o.OooO0O0) oooO0OO.f92717OooO00o;
            C24718OooOO0o c24718OooOO0oOooO00o = oooO0O0.f92715OooO00o.OooO00o(id);
            this.f90302OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = c24718OooOO0oOooO00o.collect(new o0OO0o.OooO00o(interfaceC33723OooO0oO, oooO0O0), this);
            if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
