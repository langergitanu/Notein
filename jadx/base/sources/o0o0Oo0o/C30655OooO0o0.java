package o0o0Oo0o;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0OO00o0.C26570o000o0oO;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0Oo0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.GlobalSettingsDateFormatViewModel$setDateFormatSync$2", m80623f = "GlobalSettingsDateFormatViewModel.kt", m80624l = {49}, m80625m = "invokeSuspend")
public final class C30655OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30656OooO0oO f109693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109694OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f109695OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30655OooO0o0(C30656OooO0oO c30656OooO0oO, String str, Continuation<? super C30655OooO0o0> continuation) {
        super(2, continuation);
        this.f109693OooOo = c30656OooO0oO;
        this.f109695OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30655OooO0o0(this.f109693OooOo, this.f109695OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30655OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109694OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30656OooO0oO c30656OooO0oO = this.f109693OooOo;
            AbstractC24338OooO0o0.OooO00o<String> oooO00o = App.f69576o00000;
            this.f109694OooOo0o = 1;
            C26577o000oo0O c26577o000oo0O = c30656OooO0oO.f109696OooO0Oo;
            c26577o000oo0O.getClass();
            Object objOooO00o = C24332OooO.OooO00o(c26577o000oo0O.f91598OooO00o, new C26570o000o0oO(oooO00o, this.f109695OooOoO0, null), this);
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
