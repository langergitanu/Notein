package o0o00o;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import kotlin.coroutines.Continuation;
import o0Ooo0oo.C29546o000OO;
import o0o00Oo.InterfaceC29898OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements InterfaceC29898OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106239OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC21987OooOoo f106240OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0O000o.OooO00o<C32460OooOooO> f106241OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0O000o.OooO00o<o0o00Ooo.OooOO0> f106242OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Integer, C32460OooOooO> f106243OooO0o0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.PenSettingsColorItemClickListener$onClick$1", m80623f = "PenSettingsColorItemClickListener.kt", m80624l = {32}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106245OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PenColorVO f106246OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PenColorVO penColorVO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f106246OooOoO0 = penColorVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooOO0O.this.new OooO00o(this.f106246OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106245OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = OooOO0O.this.f106239OooO00o;
                this.f106245OooOo0o = 1;
                oooO0O0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29546o000OO(oooO0O0, this.f106246OooOoO0, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, InterfaceC21987OooOoo lifecycleOwner, oO0O000o.OooO00o<C32460OooOooO> oooO00o, oO0O000o.OooO00o<o0o00Ooo.OooOO0> oooO00o2, InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycleOwner, "lifecycleOwner");
        this.f106239OooO00o = viewModel;
        this.f106240OooO0O0 = lifecycleOwner;
        this.f106241OooO0OO = oooO00o;
        this.f106242OooO0Oo = oooO00o2;
        this.f106243OooO0o0 = interfaceC32507OooOO0o;
    }

    @Override // o0o00Oo.InterfaceC29898OooO0o
    public final void OooO00o(PenColorVO penColorVO, View clickedView, View anchorView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(clickedView, "clickedView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(anchorView, "anchorView");
        if (penColorVO.getSelected()) {
            this.f106241OooO0OO.invoke();
            o0o00Ooo.OooOO0 oooOO0Invoke = this.f106242OooO0Oo.invoke();
            if (oooOO0Invoke != null) {
                oooOO0Invoke.OooO0oO(anchorView, penColorVO);
                return;
            }
            return;
        }
        if (penColorVO.getType() == 4) {
            this.f106243OooO0o0.invoke(Integer.valueOf(penColorVO.getColor()));
        } else {
            OooOo oooOoOooO00o = C21989OooOooO.OooO00o(this.f106240OooO0O0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(penColorVO, null), 2);
        }
    }
}
