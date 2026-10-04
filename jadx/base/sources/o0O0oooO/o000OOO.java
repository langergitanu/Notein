package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27594o00ooOoO;
import o0OOo0o.C27597o00ooo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$whetherToAllowTheFeature$2", m80623f = "UserViewModel.kt", m80624l = {710, 712}, m80625m = "invokeSuspend")
public final class o000OOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90378OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90379OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f90380OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOO(C26320o0000OoO c26320o0000OoO, int i, Continuation<? super o000OOO> continuation) {
        super(2, continuation);
        this.f90378OooOo = c26320o0000OoO;
        this.f90380OooOoO0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000OOO(this.f90378OooOo, this.f90380OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((o000OOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        NoteinFirebaseUser noteinFirebaseUser;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90379OooOo0o;
        C26320o0000OoO c26320o0000OoO = this.f90378OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            noteinFirebaseUser = (NoteinFirebaseUser) c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.getValue();
            if (noteinFirebaseUser == null) {
                this.f90379OooOo0o = 1;
                obj = c26320o0000OoO.f90204OooO.OooO0OO(this);
            } else {
                C27597o00ooo00 c27597o00ooo00 = c26320o0000OoO.f90207OooO0o0;
                this.f90379OooOo0o = 2;
                c27597o00ooo00.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27594o00ooOoO(c27597o00ooo00, this.f90380OooOoO0, noteinFirebaseUser, null), this);
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return new Integer(((Number) obj).intValue());
        }
        C32446OooOOOo.OooO0O0(obj);
        noteinFirebaseUser = (NoteinFirebaseUser) obj;
        C27597o00ooo00 c27597o00ooo002 = c26320o0000OoO.f90207OooO0o0;
        this.f90379OooOo0o = 2;
        c27597o00ooo002.getClass();
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27594o00ooOoO(c27597o00ooo002, this.f90380OooOoO0, noteinFirebaseUser, null), this);
    }
}
