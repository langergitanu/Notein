package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import o00Oo000.C25035OooO0O0;
import o0OOOooO.C27268OooO0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$logout$1", m80623f = "UserViewModel.kt", m80624l = {456, 458, 459, 463}, m80625m = "invokeSuspend")
public final class o0000OOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90195OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OOO(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90194OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0000OOO(continuation, this.f90194OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0000OOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r8.OooO0O0(null, r7) != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C33772OooooOo c33772OooooOo;
        C27268OooO0O0 c27268OooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90195OooOo0o;
        C26320o0000OoO c26320o0000OoO = this.f90194OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.getValue();
            if (noteinFirebaseUser == null) {
                C33772OooooOo c33772OooooOo2 = c26320o0000OoO.f90246OoooO0O;
                C27268OooO0O0 c27268OooO0O02 = new C27268OooO0O0(4, -1);
                this.f90195OooOo0o = 1;
                if (c33772OooooOo2.emit(c27268OooO0O02, this) != enumC32485OooO00o) {
                }
            } else {
                String id = noteinFirebaseUser.getId();
                this.f90195OooOo0o = 2;
                if (c26320o0000OoO.f90204OooO.OooO0oO(id, this) != enumC32485OooO00o) {
                    c33772OooooOo = c26320o0000OoO.f90246OoooO0O;
                    c27268OooO0O0 = new C27268OooO0O0(4, 0);
                    this.f90195OooOo0o = 3;
                    if (c33772OooooOo.emit(c27268OooO0O0, this) != enumC32485OooO00o) {
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                c33772OooooOo = c26320o0000OoO.f90246OoooO0O;
                c27268OooO0O0 = new C27268OooO0O0(4, 0);
                this.f90195OooOo0o = 3;
                if (c33772OooooOo.emit(c27268OooO0O0, this) != enumC32485OooO00o) {
                    C25035OooO0O0 c25035OooO0O0 = c26320o0000OoO.f90213OooOOO;
                    this.f90195OooOo0o = 4;
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                ((C32445OooOOOO) obj).getClass();
                return C32460OooOooO.f116667OooO00o;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        C25035OooO0O0 c25035OooO0O02 = c26320o0000OoO.f90213OooOOO;
        this.f90195OooOo0o = 4;
    }
}
