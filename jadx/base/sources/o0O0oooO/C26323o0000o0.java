package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27325OoooO00;
import o0OOo0o.C27597o00ooo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0oooO.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$onUserChanged$1", m80623f = "UserViewModel.kt", m80624l = {658, 659}, m80625m = "invokeSuspend")
public final class C26323o0000o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteinFirebaseUser f90272OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90273OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90274OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26323o0000o0(NoteinFirebaseUser noteinFirebaseUser, C26320o0000OoO c26320o0000OoO, Continuation<? super C26323o0000o0> continuation) {
        super(2, continuation);
        this.f90272OooOo = noteinFirebaseUser;
        this.f90274OooOoO0 = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26323o0000o0(this.f90272OooOo, this.f90274OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26323o0000o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r8.OooO0OO(r1, r7) != r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90273OooOo0o;
        C26320o0000OoO c26320o0000OoO = this.f90274OooOoO0;
        NoteinFirebaseUser noteinFirebaseUser = this.f90272OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (noteinFirebaseUser != null) {
                C27597o00ooo00 c27597o00ooo00 = c26320o0000OoO.f90207OooO0o0;
                String userId = noteinFirebaseUser.getId();
                c27597o00ooo00.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
                c27597o00ooo00.f96919OooO0OO.OooO0OO(userId, true);
                String id = noteinFirebaseUser.getId();
                this.f90273OooOo0o = 1;
                Object objOooO0o0 = c26320o0000OoO.f90207OooO0o0.f96919OooO0OO.OooO0o0(id, this);
                if (objOooO0o0 != obj2) {
                    objOooO0o0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o0 != obj2) {
                    InterfaceC27325OoooO00 interfaceC27325OoooO00 = c26320o0000OoO.f90218OooOOo0;
                    String id2 = noteinFirebaseUser.getId();
                    this.f90273OooOo0o = 2;
                }
                return obj2;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27325OoooO00 interfaceC27325OoooO002 = c26320o0000OoO.f90218OooOOo0;
        String id22 = noteinFirebaseUser.getId();
        this.f90273OooOo0o = 2;
    }
}
