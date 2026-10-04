package o0OOo0o;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.o00ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.VipFeatureUseCase$hasVipEntitlement$$inlined$flatMapLatest$1", m80623f = "VipFeatureUseCase.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C27584o00ooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Boolean>, NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f96829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96830OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27597o00ooo00 f96831OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96832OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27584o00ooO(Continuation continuation, C27597o00ooo00 c27597o00ooo00) {
        super(3, continuation);
        this.f96831OooOoO = c27597o00ooo00;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
        C27584o00ooO c27584o00ooO = new C27584o00ooO(continuation, this.f96831OooOoO);
        c27584o00ooO.f96829OooOo = interfaceC33723OooO0oO;
        c27584o00ooO.f96832OooOoO0 = noteinFirebaseUser;
        return c27584o00ooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r7, r6) == r0) goto L23;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        Object oooOOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96830OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f96829OooOo;
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f96832OooOoO0;
            String id = noteinFirebaseUser != null ? noteinFirebaseUser.getId() : null;
            this.f96829OooOo = interfaceC33723OooO0oO;
            this.f96830OooOo0o = 1;
            C27597o00ooo00 c27597o00ooo00 = this.f96831OooOoO;
            if (id == null) {
                c27597o00ooo00.getClass();
                oooOOO = new C33716OooO(Boolean.FALSE);
            } else {
                oooOOO = new o0OOO00o.OooOOO(c27597o00ooo00.f96919OooO0OO.OooO0oO(id), 1);
            }
            obj = oooOOO;
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
        interfaceC33723OooO0oO = this.f96829OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f96829OooOo = null;
        this.f96830OooOo0o = 2;
    }
}
