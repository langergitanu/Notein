package o0o0OoO;

import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment;
import kotlin.coroutines.Continuation;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30626OooOOo0;
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

/* JADX INFO: renamed from: o0o0OoO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$initRows$6$1", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {111}, m80625m = "invokeSuspend")
public final class C30668OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolAssistLineAndShapesFragment f109726OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109727OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f109728OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30668OooOO0O(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, boolean z, Continuation<? super C30668OooOO0O> continuation) {
        super(2, continuation);
        this.f109726OooOo = toolAssistLineAndShapesFragment;
        this.f109728OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30668OooOO0O(this.f109726OooOo, this.f109728OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30668OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109727OooOo0o;
        ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109726OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109727OooOo0o = 1;
            obj = ToolAssistLineAndShapesFragment.OooOoO(toolAssistLineAndShapesFragment, 26, this);
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
            SwitchListItemView switchListItemView = toolAssistLineAndShapesFragment.f79000Oooo0;
            if (switchListItemView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("fillShapeToggle");
                throw null;
            }
            switchListItemView.setChecked(((Boolean) toolAssistLineAndShapesFragment.OooOoOO().f109598OooOooo.f121747OooOo0o.getValue()).booleanValue());
        } else {
            C30623OooOOOO c30623OooOOOOOooOoOO = toolAssistLineAndShapesFragment.OooOoOO();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoOO);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30626OooOOo0(c30623OooOOOOOooOoOO, this.f109728OooOoO0, null), 2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
