package o0OOooo;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.user.ObservePremiumAccessUseCase$invoke$$inlined$flatMapLatest$1", m80623f = "ObservePremiumAccessUseCase.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C27977OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super User>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f99194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99195OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27979OooO0OO f99196OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f99197OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27977OooO00o(Continuation continuation, C27979OooO0OO c27979OooO0OO) {
        super(3, continuation);
        this.f99196OooOoO = c27979OooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super User> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C27977OooO00o c27977OooO00o = new C27977OooO00o(continuation, this.f99196OooOoO);
        c27977OooO00o.f99194OooOo = interfaceC33723OooO0oO;
        c27977OooO00o.f99197OooOoO0 = str;
        return c27977OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r6, r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99195OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f99194OooOo;
            String str = (String) this.f99197OooOoO0;
            C27129OoooOOO c27129OoooOOO = this.f99196OooOoO.f99203OooO00o;
            this.f99194OooOo = interfaceC33723OooO0oO;
            this.f99195OooOo0o = 1;
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
        interfaceC33723OooO0oO = this.f99194OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f99194OooOo = null;
        this.f99195OooOo0o = 2;
    }
}
