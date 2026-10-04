package o0ooOOO0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0ooOOO0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$onLoginClicked$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {84, 86}, m80625m = "invokeSuspend")
public final class C31630OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.login.verificationcode.OooO0OO f113077OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f113078OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31630OooOO0O(com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO, Continuation<? super C31630OooOO0O> continuation) {
        super(2, continuation);
        this.f113077OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31630OooOO0O(this.f113077OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31630OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (com.orion.notein.p607ui.login.verificationcode.OooO0OO.OooO0o0(r14, r13) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (com.orion.notein.p607ui.login.verificationcode.OooO0OO.OooO0o(r14, r13) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f113078OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO = this.f113077OooOo;
            do {
                c33781o00o0O = oooO0OO.f72635OooO0oo;
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C31626OooO0o0.OooO00o((C31626OooO0o0) value, null, true, false, null, 0, false, 199)));
            String str = oooO0OO.f72634OooO0oO.f113053OooO0OO;
            if (str == null || str.length() == 0) {
                this.f113078OooOo0o = 2;
            } else {
                this.f113078OooOo0o = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
