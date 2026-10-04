package o0o0OOO;

import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0OOO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$setupCommonClickEvents$1$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {302}, m80625m = "invokeSuspend")
public final class C30494Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108900OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30494Oooo00o(PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super C30494Oooo00o> continuation) {
        super(2, continuation);
        this.f108899OooOo = paperConfigDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30494Oooo00o(this.f108899OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30494Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108900OooOo0o;
        PaperConfigDialogFragment paperConfigDialogFragment = this.f108899OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.paperconfig.OooO00o oooO00o = paperConfigDialogFragment.f78658Oooo000;
                if (oooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("strategy");
                    throw null;
                }
                C30520o000000o c30520o000000oOooOoo = paperConfigDialogFragment.OooOoo();
                this.f108900OooOo0o = 1;
                obj = oooO00o.OooO0oO(c30520o000000oOooOoo, paperConfigDialogFragment, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                paperConfigDialogFragment.dismiss();
            }
            C30520o000000o c30520o000000oOooOoo2 = paperConfigDialogFragment.OooOoo();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = c30520o000000oOooOoo2.f109024OooOooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            C30520o000000o c30520o000000oOooOoo3 = paperConfigDialogFragment.OooOoo();
            Boolean bool2 = Boolean.FALSE;
            C33781o00o0O c33781o00o0O2 = c30520o000000oOooOoo3.f109024OooOooO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, bool2);
            throw th;
        }
    }
}
