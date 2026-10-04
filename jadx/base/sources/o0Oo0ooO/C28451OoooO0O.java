package o0Oo0ooO;

import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.label.C23135OooO0o0;
import com.orion.notein.p607ui.label.LabelPickerBottomSheetFragment;
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

/* JADX INFO: renamed from: o0Oo0ooO.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelPickerBottomSheetFragment$attemptCreateLabel$1", m80623f = "LabelPickerBottomSheetFragment.kt", m80624l = {145}, m80625m = "invokeSuspend")
public final class C28451OoooO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelPickerBottomSheetFragment f100823OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100824OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f100825OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100826OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28451OoooO0O(LabelPickerBottomSheetFragment labelPickerBottomSheetFragment, String str, int i, Continuation<? super C28451OoooO0O> continuation) {
        super(2, continuation);
        this.f100823OooOo = labelPickerBottomSheetFragment;
        this.f100826OooOoO0 = str;
        this.f100825OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28451OoooO0O(this.f100823OooOo, this.f100826OooOoO0, this.f100825OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28451OoooO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100824OooOo0o;
        LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = this.f100823OooOo;
        String name = this.f100826OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23135OooO0o0 c23135OooO0o0OooOoo0 = labelPickerBottomSheetFragment.OooOoo0();
            this.f100824OooOo0o = 1;
            obj = c23135OooO0o0OooOoo0.f72013OooO0o0.OooO0o0(name, null, this);
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
            Toast.makeText(labelPickerBottomSheetFragment.requireContext(), "error: Label name already exists", 0).show();
        } else if (iIntValue == -2) {
            Toast.makeText(labelPickerBottomSheetFragment.requireContext(), "error: Label name is too long", 0).show();
        } else if (iIntValue != -1) {
            C23135OooO0o0 c23135OooO0o0OooOoo02 = labelPickerBottomSheetFragment.OooOoo0();
            int i2 = this.f100825OooOoO;
            Integer num = new Integer(i2);
            C33781o00o0O c33781o00o0O = c23135OooO0o0OooOoo02.f72019OooOOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, num);
            C23135OooO0o0 c23135OooO0o0OooOoo03 = labelPickerBottomSheetFragment.OooOoo0();
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23135OooO0o0OooOoo03);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28419OooOOO0(c23135OooO0o0OooOoo03, name, i2, null), 2);
            labelPickerBottomSheetFragment.OooOoo0().OooO0oO();
            View viewRequireView = labelPickerBottomSheetFragment.requireView();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView, "requireView(...)");
            labelPickerBottomSheetFragment.OooOoo(viewRequireView);
        } else {
            Toast.makeText(labelPickerBottomSheetFragment.requireContext(), "error: Label name is blank", 0).show();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
