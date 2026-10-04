package o0o0OOO;

import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOO00.C27086OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$deleteCustomPaperColor$2$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1698}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109226OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109227OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Continuation continuation, C30520o000000o c30520o000000o) {
        super(2, continuation);
        this.f109226OooOo = c30520o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OoOo0(continuation, this.f109226OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109227OooOo0o;
        C30520o000000o c30520o000000o = this.f109226OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27086OooO0o0 c27086OooO0o0OooO0oo = c30520o000000o.f109001OooO0o0.OooO0oo();
            this.f109227OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(c27086OooO0o0OooO0oo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((List) obj).isEmpty()) {
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = c30520o000000o.f109018OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
