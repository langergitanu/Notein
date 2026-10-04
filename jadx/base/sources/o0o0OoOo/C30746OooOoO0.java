package o0o0OoOo;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OoOo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$resetUserInfoOfStickers$2", m80623f = "DebugViewModel.kt", m80624l = {518, 519}, m80625m = "invokeSuspend")
public final class C30746OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109965OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109966OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30746OooOoO0(C30722OooO00o c30722OooO00o, Continuation<? super C30746OooOoO0> continuation) {
        super(2, continuation);
        this.f109965OooOo = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30746OooOoO0(this.f109965OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30746OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r2.f109872OooOOo0.OooO0oO(r6, r5) == r0) goto L20;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109966OooOo0o;
        C30722OooO00o c30722OooO00o = this.f109965OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109966OooOo0o = 1;
            obj = c30722OooO00o.f109870OooOOOo.OooO0OO(this);
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
        C32446OooOOOo.OooO0O0(obj);
        NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) obj;
        if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
            String id = "";
        }
        this.f109966OooOo0o = 2;
    }
}
