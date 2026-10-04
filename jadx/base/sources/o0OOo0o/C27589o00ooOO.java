package o0OOo0o;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.o00ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.VipFeatureUseCase$whetherToAllowTheFeatureByGoogleBilling$$inlined$flatMapLatest$1", m80623f = "VipFeatureUseCase.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C27589o00ooOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super C32443OooOOO<? extends NoteinFirebaseUser, ? extends Object>>, NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f96873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27597o00ooo00 f96875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96876OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27589o00ooOO(Continuation continuation, C27597o00ooo00 c27597o00ooo00) {
        super(3, continuation);
        this.f96875OooOoO = c27597o00ooo00;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super C32443OooOOO<? extends NoteinFirebaseUser, ? extends Object>> interfaceC33723OooO0oO, NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
        C27589o00ooOO c27589o00ooOO = new C27589o00ooOO(continuation, this.f96875OooOoO);
        c27589o00ooOO.f96873OooOo = interfaceC33723OooO0oO;
        c27589o00ooOO.f96876OooOoO0 = noteinFirebaseUser;
        return c27589o00ooOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96874OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f96873OooOo;
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f96876OooOoO0;
            InterfaceC33721OooO0o c33716OooO = noteinFirebaseUser == null ? new C33716OooO(new C32443OooOOO(noteinFirebaseUser, Boolean.FALSE)) : new C27593o00ooOo0(this.f96875OooOoO.f96919OooO0OO.OooO0oO(noteinFirebaseUser.getId()), noteinFirebaseUser);
            this.f96874OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33716OooO, this) == enumC32485OooO00o) {
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
