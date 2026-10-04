package o0o0OOO;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOO.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$setupTitleInputContainer$1$1$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {226}, m80625m = "invokeSuspend")
public final class C30496Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f108902OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108903OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108904OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EditText f108905OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30496Oooo0OO(EditText editText, PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super C30496Oooo0OO> continuation) {
        super(2, continuation);
        this.f108905OooOoO0 = editText;
        this.f108904OooOoO = paperConfigDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30496Oooo0OO c30496Oooo0OO = new C30496Oooo0OO(this.f108905OooOoO0, this.f108904OooOoO, continuation);
        c30496Oooo0OO.f108902OooOo = obj;
        return c30496Oooo0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30496Oooo0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108903OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f108902OooOo;
            this.f108902OooOo = interfaceC33636Oooo00o2;
            this.f108903OooOo0o = 1;
            if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f108902OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
            EditText editText = this.f108905OooOoO0;
            if (editText.isAttachedToWindow()) {
                editText.requestFocus();
                Object systemService = this.f108904OooOoO.requireContext().getSystemService("input_method");
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(editText, 1);
                return C32460OooOooO.f116667OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
