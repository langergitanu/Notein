package o0oOo0o;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.o000oOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOo0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.deleteaccount.DeleteAccountAgreementViewModel$1", m80623f = "DeleteAccountAgreementViewModel.kt", m80624l = {34}, m80625m = "invokeSuspend")
public final class C30976OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30977OooO0OO f110675OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110676OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30976OooO0O0(C30977OooO0OO c30977OooO0OO, Continuation<? super C30976OooO0O0> continuation) {
        super(2, continuation);
        this.f110675OooOo = c30977OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30976OooO0O0(this.f110675OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30976OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        User user;
        C33781o00o0O c33781o00o0O;
        Object value;
        C30975OooO00o c30975OooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110676OooOo0o;
        C30977OooO0OO c30977OooO0OO = this.f110675OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String strOooO0Oo = c30977OooO0OO.f110677OooO0Oo.OooO0Oo();
            user = null;
            if (!C33599OooOo0O.Oooo0o0(strOooO0Oo)) {
                this.f110676OooOo0o = 1;
                C27129OoooOOO c27129OoooOOO = c30977OooO0OO.f110677OooO0Oo;
                c27129OoooOOO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000oOoO(c27129OoooOOO, strOooO0Oo, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            c33781o00o0O = c30977OooO0OO.f110678OooO0o0;
            do {
                value = c33781o00o0O.getValue();
                c30975OooO00o = (C30975OooO00o) value;
            } while (!c33781o00o0O.OooO(value, new C30975OooO00o(user, c30975OooO00o.f110673OooO0O0, c30975OooO00o.f110674OooO0OO)));
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        user = (User) obj;
        c33781o00o0O = c30977OooO0OO.f110678OooO0o0;
        do {
            value = c33781o00o0O.getValue();
            c30975OooO00o = (C30975OooO00o) value;
        } while (!c33781o00o0O.OooO(value, new C30975OooO00o(user, c30975OooO00o.f110673OooO0O0, c30975OooO00o.f110674OooO0OO)));
        return C32460OooOooO.f116667OooO00o;
    }
}
