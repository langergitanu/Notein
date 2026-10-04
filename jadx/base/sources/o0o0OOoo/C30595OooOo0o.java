package o0o0OOoo;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOoo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$refreshPurchaseState$1", m80623f = "GooglePayViewModel.kt", m80624l = {905, 906}, m80625m = "invokeSuspend")
public final class C30595OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109476OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f109477OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30584OooOOOo f109478OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30595OooOo0o(C30584OooOOOo c30584OooOOOo, Continuation<? super C30595OooOo0o> continuation) {
        super(2, continuation);
        this.f109478OooOoO0 = c30584OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30595OooOo0o(this.f109478OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30595OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r4.OooO0O0(r1, true, r6) == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109476OooOo;
        C30584OooOOOo c30584OooOOOo = this.f109478OooOoO0;
        InterfaceC27300OooOOOo interfaceC27300OooOOOo = c30584OooOOOo.f109400OooO0Oo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = (String) c30584OooOOOo.f109399OooO.getValue();
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f109477OooOo0o = str;
            this.f109476OooOo = 1;
            if (interfaceC27300OooOOOo.OooO0oo(str, true, this) != enumC32485OooO00o) {
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
        str = this.f109477OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        this.f109477OooOo0o = null;
        this.f109476OooOo = 2;
    }
}
