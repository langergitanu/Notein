package o0o0OO;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00OO;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$movePage$1", m80623f = "TiledPageViewModel.kt", m80624l = {434}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108391OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f108392OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108393OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C30367OooO0o0 c30367OooO0o0, String str, int i, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f108390OooOo = c30367OooO0o0;
        this.f108393OooOoO0 = str;
        this.f108392OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOOO(this.f108390OooOo, this.f108393OooOoO0, this.f108392OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108391OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30367OooO0o0 c30367OooO0o0 = this.f108390OooOo;
            String str = (String) c30367OooO0o0.f108336OooOOO.getValue();
            this.f108391OooOo0o = 1;
            String str2 = this.f108393OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = c30367OooO0o0.f108328OooO0Oo;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO(c27449o00O0OoO, str, str2, this.f108392OooOoO, null), this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
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
