package o0ooOOO0;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27600o0ooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0ooOOO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$adoptOrphanNotesAndFolders$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {232, 233}, m80625m = "invokeSuspend")
public final class C31625OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f113056OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f113057OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.login.verificationcode.OooO0OO f113058OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31625OooO0o(com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO, Continuation<? super C31625OooO0o> continuation) {
        super(2, continuation);
        this.f113058OooOoO0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31625OooO0o(this.f113058OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31625OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r6.OooO00o(r1, r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f113056OooOo;
        com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO = this.f113058OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            strOooO0Oo = oooO0OO.f72631OooO0Oo.OooO0Oo();
            this.f113057OooOo0o = strOooO0Oo;
            this.f113056OooOo = 1;
            if (oooO0OO.f72633OooO0o0.OooO0o0(strOooO0Oo, this) != enumC32485OooO00o) {
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
        strOooO0Oo = this.f113057OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f72632OooO0o;
        this.f113057OooOo0o = null;
        this.f113056OooOo = 2;
    }
}
