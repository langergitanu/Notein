package o0Oo0ooO;

import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.label.C23135OooO0o0;
import com.orion.notein.p607ui.label.LabelPickerDialogFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0ooO.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelPickerDialogFragment$attemptCreateLabel$1", m80623f = "LabelPickerDialogFragment.kt", m80624l = {143}, m80625m = "invokeSuspend")
public final class C28454OoooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelPickerDialogFragment f100829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100830OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f100831OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100832OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28454OoooOOo(LabelPickerDialogFragment labelPickerDialogFragment, String str, int i, Continuation<? super C28454OoooOOo> continuation) {
        super(2, continuation);
        this.f100829OooOo = labelPickerDialogFragment;
        this.f100832OooOoO0 = str;
        this.f100831OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28454OoooOOo(this.f100829OooOo, this.f100832OooOoO0, this.f100831OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28454OoooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100830OooOo0o;
        LabelPickerDialogFragment labelPickerDialogFragment = this.f100829OooOo;
        String name = this.f100832OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23135OooO0o0 c23135OooO0o0Oooo00o = labelPickerDialogFragment.Oooo00o();
            this.f100830OooOo0o = 1;
            obj = c23135OooO0o0Oooo00o.f72013OooO0o0.OooO0o0(name, null, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == -3) {
            Toast.makeText(labelPickerDialogFragment.requireContext(), "error: Label name already exists", 0).show();
        } else if (iIntValue == -2) {
            Toast.makeText(labelPickerDialogFragment.requireContext(), "error: Label name is too long", 0).show();
        } else if (iIntValue != -1) {
            C23135OooO0o0 c23135OooO0o0Oooo00o2 = labelPickerDialogFragment.Oooo00o();
            int i2 = this.f100831OooOoO;
            Integer num = new Integer(i2);
            C33781o00o0O c33781o00o0O = c23135OooO0o0Oooo00o2.f72019OooOOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, num);
            C23135OooO0o0 c23135OooO0o0Oooo00o3 = labelPickerDialogFragment.Oooo00o();
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23135OooO0o0Oooo00o3);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28419OooOOO0(c23135OooO0o0Oooo00o3, name, i2, null), 2);
            labelPickerDialogFragment.Oooo00o().OooO0oO();
            View viewRequireView = labelPickerDialogFragment.requireView();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView, "requireView(...)");
            labelPickerDialogFragment.Oooo0(viewRequireView);
        } else {
            Toast.makeText(labelPickerDialogFragment.requireContext(), "error: Label name is blank", 0).show();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
