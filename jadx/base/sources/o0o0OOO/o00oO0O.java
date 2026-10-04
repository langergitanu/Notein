package o0o0OOO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$isMyTemplateTabEnabled$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00oO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109190OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f109191OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0O(Continuation continuation, C30520o000000o c30520o000000o) {
        super(2, continuation);
        this.f109190OooOo = c30520o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00oO0O o00oo0o = new o00oO0O(continuation, this.f109190OooOo);
        o00oo0o.f109191OooOo0o = ((Boolean) obj).booleanValue();
        return o00oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((o00oO0O) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        if (!this.f109191OooOo0o) {
            C30520o000000o c30520o000000o = this.f109190OooOo;
            if (((Number) c30520o000000o.f109041OoooOO0.getValue()).intValue() != 0) {
                Integer num = new Integer(0);
                C33781o00o0O c33781o00o0O = c30520o000000o.f109041OoooOO0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, num);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
