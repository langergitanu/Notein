package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.PencilGroupSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30017OoooO0;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC29898OooO0o f106323OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PenBox.InterfaceC23608OooO0oo f106324OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PenBox.OooOOO f106325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C30017OoooO0 f106326OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PencilGroupSettingsBottomSheetDialog f106327OooO0o0;

    public OooO(Context context) {
        super(context, R.layout.popup_toolbox_rainbow_pen_setting, o000000O.OooO0o(220), o000000O.OooO0o(StyleIdentifier.INTENSE_REFERENCE));
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        PencilGroupSettingsBottomSheetDialog pencilGroupSettingsBottomSheetDialog = this.f106327OooO0o0;
        return pencilGroupSettingsBottomSheetDialog != null ? pencilGroupSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(View view, int i, PenVO penVO, List<PenVO> voList, List<PenColorVO> colorList, PenWidthVO penWidthVO) {
        OooOOO0.OooO0oO(voList, "voList");
        OooOOO0.OooO0oO(colorList, "colorList");
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, voList, colorList, penWidthVO, 16);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106283OooO0O0 = this.f106324OooO0OO;
        c29936OooO0oO.f106290OooOO0 = this.f106325OooO0Oo;
        c29936OooO0oO.f106291OooOO0O = this.f106323OooO0O0;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            PencilGroupSettingsBottomSheetDialog pencilGroupSettingsBottomSheetDialog = new PencilGroupSettingsBottomSheetDialog();
            pencilGroupSettingsBottomSheetDialog.f76824OooOoO = c29936OooO0oO;
            C30017OoooO0 c30017OoooO0 = pencilGroupSettingsBottomSheetDialog.f76826OooOoOO;
            if (c30017OoooO0 != null) {
                c30017OoooO0.f106696Oooo00O = c29936OooO0oO;
            }
            pencilGroupSettingsBottomSheetDialog.f76825OooOoO0 = c31056OooOoo;
            this.f106327OooO0o0 = pencilGroupSettingsBottomSheetDialog;
            pencilGroupSettingsBottomSheetDialog.show(C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager(), "PencilGroupSettingsBottomSheetDialog");
            return;
        }
        this.f106327OooO0o0 = null;
        View contentView = OooO0OO().getContentView();
        OooOOO0.OooO0o(contentView, "getContentView(...)");
        C30017OoooO0 c30017OoooO02 = new C30017OoooO0(contentView);
        c30017OoooO02.f106696Oooo00O = c29936OooO0oO;
        c30017OoooO02.OooO0o(c31056OooOoo);
        this.f106326OooO0o = c30017OoooO02;
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        PencilGroupSettingsBottomSheetDialog pencilGroupSettingsBottomSheetDialog = this.f106327OooO0o0;
        if (pencilGroupSettingsBottomSheetDialog != null) {
            pencilGroupSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106327OooO0o0 = null;
    }
}
