package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabDocumentsFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0OoOOoO.C29193OooO0oO;
import o0o0O00.C30207OooOo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0OoO000.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28565Ooooo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101245OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101246OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28565Ooooo00(Object obj, int i) {
        this.f101246OooOo0o = i;
        this.f101245OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101245OooOo;
        switch (this.f101246OooOo0o) {
            case 0:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((FirebaseUserAuthFragment) obj), new C24564OooO00o(R.id.action_firebaseUserAuthFragment_to_firebaseUserLoginFragment));
                break;
            case 1:
                ViewOnClickListenerC28305OooO viewOnClickListenerC28305OooO = ((C29193OooO0oO) obj).f103540OooO0O0;
                if (viewOnClickListenerC28305OooO != null) {
                    viewOnClickListenerC28305OooO.onClick(view);
                }
                break;
            case 2:
                int i = PenBarChildFragment.f75240o0000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                if (penColorVO.getEnable()) {
                    PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                    Integer num = (Integer) ((C32443OooOOO) penBarChildFragment.Oooo0oO().f75185OoooOOo.f121747OooOo0o.getValue()).f116637OooOo;
                    if (!(penColorVO.getType() == 4 ? num != null && num.intValue() == penColorVO.getColor() : penColorVO.getSelected())) {
                        penBarChildFragment.Oooo00o().OooO00o(penColorVO, view, view);
                    } else {
                        Integer num2 = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            penBarChildFragment.OoooOoO();
                            o0o00Ooo.OooOO0 oooOO02 = penBarChildFragment.f75298o0000oO;
                            if (oooOO02 != null) {
                                oooOO02.OooO(view, iIntValue, penColorVO);
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                StrokesResizeAndRotateEditor.OooO00o oooO00o = ((StrokesResizeAndRotateEditor) obj).eventListener;
                if (oooO00o != null) {
                    oooO00o.onCancel();
                }
                break;
            default:
                C30207OooOo.OooO00o oooO00o2 = ((FabDocumentsFragment) obj).f77466OooOo0o;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0o();
                }
                break;
        }
    }
}
