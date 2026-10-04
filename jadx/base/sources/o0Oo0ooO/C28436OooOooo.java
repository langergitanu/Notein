package o0Oo0ooO;

import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.label.C23139OooOO0o;
import com.orion.notein.p607ui.label.LabelManagementBottomSheet;
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

/* JADX INFO: renamed from: o0Oo0ooO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelManagementBottomSheet$attemptCreateLabel$1", m80623f = "LabelManagementBottomSheet.kt", m80624l = {167}, m80625m = "invokeSuspend")
public final class C28436OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelManagementBottomSheet f100797OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100798OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f100799OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100800OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28436OooOooo(LabelManagementBottomSheet labelManagementBottomSheet, String str, int i, Continuation<? super C28436OooOooo> continuation) {
        super(2, continuation);
        this.f100797OooOo = labelManagementBottomSheet;
        this.f100800OooOoO0 = str;
        this.f100799OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28436OooOooo(this.f100797OooOo, this.f100800OooOoO0, this.f100799OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28436OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100798OooOo0o;
        LabelManagementBottomSheet labelManagementBottomSheet = this.f100797OooOo;
        String name = this.f100800OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23139OooOO0o c23139OooOO0oOooOoo = labelManagementBottomSheet.OooOoo();
            this.f100798OooOo0o = 1;
            obj = c23139OooOO0oOooOoo.f72072OooO0o0.OooO0o0(name, null, this);
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
            Toast.makeText(labelManagementBottomSheet.requireContext(), "error: Label name already exists", 0).show();
        } else if (iIntValue == -2) {
            Toast.makeText(labelManagementBottomSheet.requireContext(), "error: Label name is too long", 0).show();
        } else if (iIntValue != -1) {
            C23139OooOO0o c23139OooOO0oOooOoo2 = labelManagementBottomSheet.OooOoo();
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23139OooOO0oOooOoo2);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28457OoooOoo(c23139OooOO0oOooOoo2, name, this.f100799OooOoO, null), 2);
            C33781o00o0O c33781o00o0O = labelManagementBottomSheet.OooOoo().f72069OooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, "");
            C23139OooOO0o c23139OooOO0oOooOoo3 = labelManagementBottomSheet.OooOoo();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O2 = c23139OooOO0oOooOoo3.f72075OooOO0;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, bool);
            View viewRequireView = labelManagementBottomSheet.requireView();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView, "requireView(...)");
            LabelManagementBottomSheet.OooOoo0(labelManagementBottomSheet, viewRequireView);
        } else {
            Toast.makeText(labelManagementBottomSheet.requireContext(), "error: Label name is blank", 0).show();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
