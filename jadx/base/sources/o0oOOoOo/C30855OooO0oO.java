package o0oOOoOo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0OO00o0.C26559o000Oooo;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOOoOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.stylus.GlobalStylusShortcutViewModel$updatePenShortcut$1", m80623f = "GlobalStylusShortcutViewModel.kt", m80624l = {234}, m80625m = "invokeSuspend")
public final class C30855OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30849OooO0O0 f110301OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110302OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f110303OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Integer> f110304OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30855OooO0oO(C30849OooO0O0 c30849OooO0O0, AbstractC24338OooO0o0.OooO00o<Integer> oooO00o, int i, Continuation<? super C30855OooO0oO> continuation) {
        super(2, continuation);
        this.f110301OooOo = c30849OooO0O0;
        this.f110304OooOoO0 = oooO00o;
        this.f110303OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30855OooO0oO(this.f110301OooOo, this.f110304OooOoO0, this.f110303OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30855OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110302OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30849OooO0O0 c30849OooO0O0 = this.f110301OooOo;
            this.f110302OooOo0o = 1;
            C26577o000oo0O c26577o000oo0O = c30849OooO0O0.f110259OooO0Oo;
            c26577o000oo0O.getClass();
            Object objOooO00o = C24332OooO.OooO00o(c26577o000oo0O.f91598OooO00o, new C26559o000Oooo(this.f110304OooOoO0, this.f110303OooOoO, null), this);
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
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
