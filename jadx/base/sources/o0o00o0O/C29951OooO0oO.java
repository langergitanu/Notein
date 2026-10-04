package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.LassoSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30012Oooo0o;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o00o0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29951OooO0oO extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C30012Oooo0o f106366OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LassoSettingsBottomSheetDialog f106367OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PenBox.InterfaceC23606OooO0o0 f106368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InterfaceC29898OooO0o f106369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PenBox.OooOOO f106370OooO0o0;

    public C29951OooO0oO(Context context) {
        super(context, R.layout.popup_toolbox_lasso_settings, o000000O.OooO0o(220), o000000O.OooO0o(StyleIdentifier.COLORFUL_GRID_ACCENT_6));
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        LassoSettingsBottomSheetDialog lassoSettingsBottomSheetDialog = this.f106367OooO0OO;
        return lassoSettingsBottomSheetDialog != null ? lassoSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(View view, int i, String str, List colorList, List list, boolean z) {
        OooOOO0.OooO0oO(colorList, "colorList");
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
        PenVO penVO = (PenVO) tag;
        penVO.getExtra().putString("isDualLinkFeatureEnabled", String.valueOf(z));
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, OooOo.OooO0oO(penVO), colorList, (PenWidthVO) null, 16);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106288OooO0oO = this.f106368OooO0Oo;
        c29936OooO0oO.f106290OooOO0 = this.f106370OooO0o0;
        c29936OooO0oO.f106291OooOO0O = this.f106369OooO0o;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            LassoSettingsBottomSheetDialog lassoSettingsBottomSheetDialog = new LassoSettingsBottomSheetDialog();
            lassoSettingsBottomSheetDialog.f76822OooOoO0 = c31056OooOoo;
            lassoSettingsBottomSheetDialog.f76821OooOoO = c29936OooO0oO;
            C30012Oooo0o c30012Oooo0o = lassoSettingsBottomSheetDialog.f76823OooOoOO;
            if (c30012Oooo0o != null) {
                c30012Oooo0o.f106668Oooo0OO = c29936OooO0oO;
            }
            this.f106367OooO0OO = lassoSettingsBottomSheetDialog;
            lassoSettingsBottomSheetDialog.show(C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager(), "LassoSettingsBottomSheetDialog");
            return;
        }
        this.f106367OooO0OO = null;
        if (this.f106366OooO0O0 == null) {
            View contentView = OooO0OO().getContentView();
            OooOOO0.OooO0o(contentView, "getContentView(...)");
            this.f106366OooO0O0 = new C30012Oooo0o(contentView);
        }
        C30012Oooo0o c30012Oooo0o2 = this.f106366OooO0O0;
        if (c30012Oooo0o2 != null) {
            c30012Oooo0o2.f106668Oooo0OO = c29936OooO0oO;
        }
        if (c30012Oooo0o2 != null) {
            c30012Oooo0o2.OooO0OO(c31056OooOoo);
        }
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        LassoSettingsBottomSheetDialog lassoSettingsBottomSheetDialog = this.f106367OooO0OO;
        if (lassoSettingsBottomSheetDialog != null) {
            lassoSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
    }
}
