package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27325OoooO00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$flatMapLatest$6", m80623f = "UserViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C26344o000OoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Integer>, NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f90408OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90409OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90410OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f90411OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26344o000OoO(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(3, continuation);
        this.f90410OooOoO = c26320o0000OoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
        C26344o000OoO c26344o000OoO = new C26344o000OoO(continuation, this.f90410OooOoO);
        c26344o000OoO.f90408OooOo = interfaceC33723OooO0oO;
        c26344o000OoO.f90411OooOoO0 = noteinFirebaseUser;
        return c26344o000OoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r6, r5) == r0) goto L20;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90409OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f90408OooOo;
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f90411OooOoO0;
            InterfaceC27325OoooO00 interfaceC27325OoooO00 = this.f90410OooOoO.f90218OooOOo0;
            if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
                id = "";
            }
            this.f90408OooOo = interfaceC33723OooO0oO;
            this.f90409OooOo0o = 1;
            obj = interfaceC27325OoooO00.OooO0o0(id);
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
        interfaceC33723OooO0oO = this.f90408OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f90408OooOo = null;
        this.f90409OooOo0o = 2;
    }
}
