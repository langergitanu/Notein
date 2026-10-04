package o0o00o;

import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import kotlin.coroutines.Continuation;
import o0Ooo0oo.C29516o0000OO;
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

/* JADX INFO: renamed from: o0o00o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29929OooOOOo implements PenBox.InterfaceC23609OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106271OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC21987OooOoo f106272OooO0O0;

    /* JADX INFO: renamed from: o0o00o.OooOOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.VectorPenSettingsListener$onPenWidthUpdate$1", m80623f = "VectorPenSettingsListener.kt", m80624l = {20}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106274OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f106275OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f106276OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ float f106277OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2, float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f106276OooOoO0 = i;
            this.f106275OooOoO = i2;
            this.f106277OooOoOO = f;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C29929OooOOOo.this.new OooO00o(this.f106276OooOoO0, this.f106275OooOoO, this.f106277OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106274OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = C29929OooOOOo.this.f106271OooO00o;
                this.f106274OooOo0o = 1;
                if (oooO0O0.OooOo0(this.f106276OooOoO0, this.f106275OooOoO, this.f106277OooOoOO, this) == enumC32485OooO00o) {
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

    public C29929OooOOOo(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, InterfaceC21987OooOoo lifecycleOwner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycleOwner, "lifecycleOwner");
        this.f106271OooO00o = viewModel;
        this.f106272OooO0O0 = lifecycleOwner;
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbox.PenBox.InterfaceC23609OooOO0o
    public final void OooO00o(float f, int i, int i2) {
        OooOo oooOoOooO00o = C21989OooOooO.OooO00o(this.f106272OooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(i, i2, f, null), 2);
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbox.PenBox.InterfaceC23609OooOO0o
    public final void OooO0O0(String type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106271OooO00o;
        oooO0O0.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29516o0000OO(oooO0O0, type, null), 2);
    }
}
