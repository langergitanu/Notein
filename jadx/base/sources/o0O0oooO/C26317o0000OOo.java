package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0oooO.o0000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$logoutSync$2", m80623f = "UserViewModel.kt", m80624l = {474, 478}, m80625m = "invokeSuspend")
public final class C26317o0000OOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90196OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90197OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26317o0000OOo(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90196OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26317o0000OOo(continuation, this.f90196OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C26317o0000OOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String id;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90197OooOo0o;
        C26320o0000OoO c26320o0000OoO = this.f90196OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.getValue();
            if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
                id = "";
            }
            this.f90197OooOo0o = 1;
            if (c26320o0000OoO.f90204OooO.OooO0oO(id, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            return new C32445OooOOOO(objOooO0O0);
        }
        C32446OooOOOo.OooO0O0(obj);
        c26320o0000OoO.f90224OooOo0o.signOut();
        this.f90197OooOo0o = 2;
        objOooO0O0 = c26320o0000OoO.f90213OooOOO.OooO0O0(null, this);
    }
}
