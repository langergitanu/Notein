package o0o00o;

import Oooo0.C20860Ooooooo;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import kotlin.coroutines.Continuation;
import o0Ooo0oo.C29500o0000;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29922OooO0O0 implements PenBox.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106191OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC21987OooOoo f106192OooO0O0;

    /* JADX INFO: renamed from: o0o00o.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.HLSettingsChangedListener$onPenWidthUpdate$1", m80623f = "HLSettingsChangedListener.kt", m80624l = {21}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106194OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f106195OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f106196OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ float f106197OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2, float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f106196OooOoO0 = i;
            this.f106195OooOoO = i2;
            this.f106197OooOoOO = f;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C29922OooO0O0.this.new OooO00o(this.f106196OooOoO0, this.f106195OooOoO, this.f106197OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106194OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = C29922OooO0O0.this.f106191OooO00o;
                this.f106194OooOo0o = 1;
                if (oooO0O0.OooOo0(this.f106196OooOoO0, this.f106195OooOoO, this.f106197OooOoOO, this) == enumC32485OooO00o) {
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

    public C29922OooO0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, InterfaceC21987OooOoo lifecycleOwner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycleOwner, "lifecycleOwner");
        this.f106191OooO00o = viewModel;
        this.f106192OooO0O0 = lifecycleOwner;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooO0O0
    public final void OooO00o(float f, int i, int i2) {
        OooOo oooOoOooO00o = C21989OooOooO.OooO00o(this.f106192OooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(i, i2, f, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooO0O0
    public final void OooO0O0(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "HLRect", "onSelectedPenChanged penType: ", i), new Object[0]);
        this.f106191OooO00o.OooOOOO(i);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooO0O0
    public final void OooO0OO(int i, String str, String str2) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106191OooO00o;
        oooO0O0.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29500o0000(oooO0O0, str, str2, i, null), 2);
    }
}
