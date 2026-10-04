package o0OoO0OO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportLocalDataDialogFragment;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import java.util.concurrent.CancellationException;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28766o0000Oo;
import o0o000oO.C29784OooO0oo;
import o0o00Ooo.C29920OooO0oo;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.Oooo0;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31127OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0OO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28610OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101403OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101404OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28610OooO0oo(Object obj, int i) {
        this.f101404OooOo0o = i;
        this.f101403OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101403OooOo;
        switch (this.f101404OooOo0o) {
            case 0:
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = (LoginByThirdPartyChildFragment) obj;
                if (loginByThirdPartyChildFragment.f72578OooOo0o.OooO0OO()) {
                    o00000OO o00000oo2 = loginByThirdPartyChildFragment.f72579OooOoO;
                    if (o00000oo2 != null) {
                        o00000oo2.cancel((CancellationException) null);
                    }
                    loginByThirdPartyChildFragment.f72579OooOoO = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28614OooOOO(loginByThirdPartyChildFragment, null), 3);
                    return;
                }
                return;
            case 1:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) obj).Oooo0o().OooOO0O(DrawToolFactory.ERASER_TYPE_STROKE);
                return;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                final TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                if (!penColorVO.getSelected()) {
                    textStyleBarChildFragment.OooOoOO().OooO(penColorVO.getColor());
                    return;
                }
                if (textStyleBarChildFragment.f76452OoooOoO == null) {
                    Context contextRequireContext = textStyleBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    final o0o00Ooo.OooOO0 oooOO02 = new o0o00Ooo.OooOO0(false, false, contextRequireContext);
                    oooOO02.OooO0o0(((Boolean) ((C26320o0000OoO) textStyleBarChildFragment.f76458o000oOoO.getValue()).f90249OoooOOo.f121747OooOo0o.getValue()).booleanValue());
                    oooOO02.f106174OooO0oo = new C29784OooO0oo(textStyleBarChildFragment);
                    oooOO02.f106173OooO0oO = new View.OnClickListener() { // from class: o0o000oO.OooO0Oo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object tag2 = view2.getTag();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetVO");
                            C29920OooO0oo c29920OooO0oo = (C29920OooO0oo) tag2;
                            int id = view2.getId();
                            TextStyleBarChildFragment textStyleBarChildFragment2 = textStyleBarChildFragment;
                            String id2 = c29920OooO0oo.f106158OooO00o;
                            if (id == R.id.btn_delete) {
                                textStyleBarChildFragment2.OooOoOO().OooO0o0(id2);
                                return;
                            }
                            if (id != R.id.btn_edit_name) {
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(textStyleBarChildFragment2), null, null, new C29776OooO(textStyleBarChildFragment2, c29920OooO0oo, null), 3);
                                return;
                            }
                            oooOO02.dismiss();
                            String name = c29920OooO0oo.f106159OooO0O0;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
                            kotlin.jvm.internal.OooOOO0.OooO0oO(id2, "id");
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textStyleBarChildFragment2), new C28766o0000Oo(name, id2));
                        }
                    };
                    oooOO02.OooOO0((List) textStyleBarChildFragment.OooOoOO().f102901OooOO0O.f121747OooOo0o.getValue());
                    textStyleBarChildFragment.f76452OoooOoO = oooOO02;
                }
                o0o00Ooo.OooOO0 oooOO03 = textStyleBarChildFragment.f76452OoooOoO;
                if (oooOO03 != null) {
                    oooOO03.OooO0oO(view, penColorVO);
                    return;
                }
                return;
            case 3:
                Oooo0 oooo0 = (Oooo0) obj;
                if (view.isActivated()) {
                    C29936OooO0oO c29936OooO0oO = oooo0.f106644Oooo00O;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0oo(7);
                        return;
                    }
                    return;
                }
                C29936OooO0oO c29936OooO0oO2 = oooo0.f106644Oooo00O;
                if (c29936OooO0oO2 != null) {
                    c29936OooO0oO2.OooO0OO(7);
                    return;
                }
                return;
            case 4:
                int i2 = AiOcrEditorListContainer.f78420OoooOOO;
                ((AiOcrEditorListContainer) obj).OooO0O0(0, Boolean.valueOf(!view.isActivated()));
                return;
            case 5:
                ((UserInfoFragment) obj).OooOoo();
                return;
            case 6:
                ImportLocalDataDialogFragment importLocalDataDialogFragment = (ImportLocalDataDialogFragment) obj;
                int iIntValue = ((Number) importLocalDataDialogFragment.OooOoo0().f111045OooOoO.f121747OooOo0o.getValue()).intValue();
                if (iIntValue == 0) {
                    importLocalDataDialogFragment.dismiss();
                    return;
                }
                if (iIntValue == 1) {
                    C31114OooO c31114OooOOooOoo0 = importLocalDataDialogFragment.OooOoo0();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c31114OooOOooOoo0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31127OooOOO(true, c31114OooOOooOoo0, null), 2);
                    return;
                }
                if (iIntValue != 2) {
                    return;
                }
                C31114OooO c31114OooOOooOoo02 = importLocalDataDialogFragment.OooOoo0();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c31114OooOOooOoo02);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31127OooOOO(false, c31114OooOOooOoo02, null), 2);
                return;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                View view2 = textRecognizeFragment.f78190OooooO0;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnRecords");
                    throw null;
                }
                if (view2.isActivated()) {
                    textRecognizeFragment.OooOooO();
                    return;
                }
                View view3 = textRecognizeFragment.getView();
                kotlin.jvm.internal.OooOOO0.OooO0o0(view3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ConstraintLayout constraintLayout = (ConstraintLayout) view3;
                androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
                oooO0OO.OooO0o0(constraintLayout);
                ViewGroup viewGroup = textRecognizeFragment.f78180OoooO00;
                if (viewGroup == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("recordsWrapper");
                    throw null;
                }
                oooO0OO.OooOO0(viewGroup.getId()).f64011OooO0OO.f64110OooO0O0 = 0;
                oooO0OO.OooO0O0(constraintLayout);
                TransitionManager.beginDelayedTransition(constraintLayout);
                View view4 = textRecognizeFragment.f78190OooooO0;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnRecords");
                    throw null;
                }
                view4.setActivated(true);
                View view5 = textRecognizeFragment.f78191OooooOO;
                if (view5 != null) {
                    view5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
