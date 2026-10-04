package o0o00o0O;

import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.TapeSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0o00oO0.C30022OoooOOo;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C30022OoooOOo f106386OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TapeSettingsBottomSheetDialog f106387OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PenBox.OooO f106388OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PenBox.OooOOO f106389OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC29898OooO0o f106390OooO0o0;

    public OooOO0O(Context context) {
        super(context, R.layout.popup_toolbox_tapepen_setting, o000000O.OooO0o(220), o000000O.OooO0o(StyleIdentifier.INTENSE_REFERENCE));
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        TapeSettingsBottomSheetDialog tapeSettingsBottomSheetDialog = this.f106387OooO0OO;
        return tapeSettingsBottomSheetDialog != null ? tapeSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    public final void OooO0Oo(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        InterfaceC29934OooO0o interfaceC29934OooO0o = this.f106387OooO0OO;
        if (interfaceC29934OooO0o == null) {
            interfaceC29934OooO0o = null;
        }
        if (interfaceC29934OooO0o == null) {
            interfaceC29934OooO0o = this.f106386OooO0O0;
        }
        if (interfaceC29934OooO0o != null) {
            interfaceC29934OooO0o.OooO0O0(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(View view, int i, List<PenColorVO> colorList, PenWidthVO penWidthVO) {
        OooOOO0.OooO0oO(colorList, "colorList");
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
        PenVO penVO = (PenVO) tag;
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, OooOo.OooO0oO(penVO), colorList, penWidthVO, 16);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106285OooO0Oo = this.f106388OooO0Oo;
        c29936OooO0oO.f106290OooOO0 = this.f106389OooO0o;
        c29936OooO0oO.f106291OooOO0O = this.f106390OooO0o0;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            TapeSettingsBottomSheetDialog tapeSettingsBottomSheetDialog = new TapeSettingsBottomSheetDialog();
            tapeSettingsBottomSheetDialog.f76828OooOoO0 = c31056OooOoo;
            tapeSettingsBottomSheetDialog.f76827OooOoO = c29936OooO0oO;
            C30022OoooOOo c30022OoooOOo = tapeSettingsBottomSheetDialog.f76829OooOoOO;
            if (c30022OoooOOo != null) {
                c30022OoooOOo.f106713OooOooO = c29936OooO0oO;
            }
            this.f106387OooO0OO = tapeSettingsBottomSheetDialog;
            tapeSettingsBottomSheetDialog.show(C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager(), "PenSettingsBottomSheetDialog");
            return;
        }
        this.f106387OooO0OO = null;
        View contentView = OooO0OO().getContentView();
        OooOOO0.OooO0o(contentView, "getContentView(...)");
        C30022OoooOOo c30022OoooOOo2 = new C30022OoooOOo(contentView);
        c30022OoooOOo2.f106713OooOooO = c29936OooO0oO;
        c30022OoooOOo2.OooO0OO(c31056OooOoo);
        this.f106386OooO0O0 = c30022OoooOOo2;
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        int iIntValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue();
        C34406OooO00o.f123390OooO00o.OooO00o(C20855OooooOO.OooO0OO(iIntValue, iIntValue2, "show: offsetX=", ", offsetY="), new Object[0]);
        OooO0OO().showAtLocation(view, 0, iIntValue, iIntValue2);
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        TapeSettingsBottomSheetDialog tapeSettingsBottomSheetDialog = this.f106387OooO0OO;
        if (tapeSettingsBottomSheetDialog != null) {
            tapeSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106387OooO0OO = null;
    }
}
