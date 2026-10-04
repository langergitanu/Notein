package o0Oo0Ooo;

import OooO0oO.C20436OooO0o0;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import com.orion.notein.p607ui.creative_library.purchase.MaterialPurchaseDialogFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.noteeditor.addpage.OooO0OO;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.user.UserInfoFragment;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30012Oooo0o;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30187OooO0OO;
import o0o0O00.C30189OooO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28137OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99747OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99748OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28137OooO0OO(Object obj, int i) {
        this.f99748OooOo0o = i;
        this.f99747OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C30012Oooo0o c30012Oooo0o;
        C29936OooO0oO c29936OooO0oO;
        Object obj = this.f99747OooOo;
        switch (this.f99748OooOo0o) {
            case 0:
                ((MaterialPurchaseDialogFragment) obj).dismiss();
                break;
            case 1:
                ((AddPageFragment) obj).OooOoO().OooO0o(new OooO0OO.OooO00o.OooO0O0("get_pdf_path_and_add_entire_pdf_doc"));
                break;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                if (penColorVO.getEnable() && (c29936OooO0oO = (c30012Oooo0o = (C30012Oooo0o) obj).f106668Oooo0OO) != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, c30012Oooo0o.f106666Oooo00o);
                    break;
                }
                break;
            case 3:
                C30189OooO0o c30189OooO0o = ((C30185OooO00o) obj).f107468OooO0O0;
                InterfaceC21987OooOoo viewLifecycleOwner = c30189OooO0o.f107495OooO00o.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30187OooO0OO(c30189OooO0o, null), 2);
                break;
            case 4:
                OooO0o.OooO0O0<OooO0o.OooOO0> oooO0O0 = ((AiOcrEditorListContainer) obj).f78430Oooo;
                if (oooO0O0 != null) {
                    oooO0O0.OooO00o(OooO0o.OooOO0O.OooO00o(C20436OooO0o0.C20437OooO0Oo.f58277OooO00o));
                }
                break;
            default:
                ((UserInfoFragment) obj).OooOoo();
                break;
        }
    }
}
