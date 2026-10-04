package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$flatMapLatest$4", m80623f = "UserViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class o000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteinMessage>>, NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f90146OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90147OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90148OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f90149OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(3, continuation);
        this.f90148OooOoO = c26320o0000OoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteinMessage>> interfaceC33723OooO0oO, NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
        o000 o000Var = new o000(continuation, this.f90148OooOoO);
        o000Var.f90146OooOo = interfaceC33723OooO0oO;
        o000Var.f90149OooOoO0 = noteinFirebaseUser;
        return o000Var.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90147OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f90146OooOo;
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f90149OooOoO0;
            if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
                id = "";
            }
            InterfaceC33721OooO0o interfaceC33721OooO0oOooO0O0 = this.f90148OooOoO.f90211OooOO0O.OooO0O0(id);
            this.f90147OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooO0O0, this) == enumC32485OooO00o) {
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
