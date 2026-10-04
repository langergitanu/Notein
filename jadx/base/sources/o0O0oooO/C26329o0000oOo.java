package o0O0oooO;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOO0o.C27129OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o0000oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$flatMapLatest$1", m80623f = "UserViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C26329o0000oOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super User>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f90293OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90294OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90295OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f90296OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26329o0000oOo(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(3, continuation);
        this.f90295OooOoO = c26320o0000OoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super User> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C26329o0000oOo c26329o0000oOo = new C26329o0000oOo(continuation, this.f90295OooOoO);
        c26329o0000oOo.f90293OooOo = interfaceC33723OooO0oO;
        c26329o0000oOo.f90296OooOoO0 = str;
        return c26329o0000oOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90294OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f90293OooOo;
            String str = (String) this.f90296OooOoO0;
            C27129OoooOOO c27129OoooOOO = this.f90295OooOoO.f90209OooO0oo;
            this.f90293OooOo = interfaceC33723OooO0oO;
            this.f90294OooOo0o = 1;
            obj = c27129OoooOOO.OooO0o0(str);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = this.f90293OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f90293OooOo = null;
        this.f90294OooOo0o = 2;
        C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
        Object objCollect = ((InterfaceC33721OooO0o) obj).collect(new C26318o0000Oo(interfaceC33723OooO0oO), this);
        if (objCollect != enumC32485OooO00o) {
            objCollect = C32460OooOooO.f116667OooO00o;
        }
        if (objCollect != enumC32485OooO00o) {
            objCollect = C32460OooOooO.f116667OooO00o;
        }
    }
}
