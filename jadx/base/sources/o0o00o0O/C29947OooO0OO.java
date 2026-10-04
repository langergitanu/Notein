package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.EraserSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.OooOOO0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29931OooO0O0;
import o0o00oO0.C29993OooOOOo;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o00o0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29947OooO0OO extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C29993OooOOOo f106334OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public EraserSettingsBottomSheetDialog f106335OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f106336OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PenBox.OooOOO f106337OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PenBox.OooO00o f106338OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View.OnClickListener f106339OooO0oO;

    public C29947OooO0OO(Context context) {
        super(context, R.layout.popup_toolbox_eraser_settings, o000000O.OooO0o(220), o000000O.OooO0o(418));
        this.f106336OooO0Oo = DrawToolFactory.ERASER_TYPE_PIXEL;
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        EraserSettingsBottomSheetDialog eraserSettingsBottomSheetDialog = this.f106335OooO0OO;
        return eraserSettingsBottomSheetDialog != null ? eraserSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    public final void OooO0Oo(String str) {
        this.f106336OooO0Oo = str;
        InterfaceC29931OooO0O0 interfaceC29931OooO0O0 = this.f106335OooO0OO;
        if (interfaceC29931OooO0O0 == null) {
            interfaceC29931OooO0O0 = null;
        }
        if (interfaceC29931OooO0O0 == null) {
            interfaceC29931OooO0O0 = this.f106334OooO0O0;
        }
        if (interfaceC29931OooO0O0 != null) {
            interfaceC29931OooO0O0.OooO0oo(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(View view, int i, PenWidthVO penWidthVO) {
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
        PenVO penVO = (PenVO) tag;
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, OooOo.OooO0oO(penVO), C34434OooOoO.f123453OooOo0o, penWidthVO, 16);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106287OooO0o0 = this.f106338OooO0o0;
        c29936OooO0oO.f106290OooOO0 = this.f106337OooO0o;
        c29936OooO0oO.f106286OooO0o = this.f106339OooO0oO;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            EraserSettingsBottomSheetDialog eraserSettingsBottomSheetDialog = new EraserSettingsBottomSheetDialog();
            eraserSettingsBottomSheetDialog.f76803OooOoO0 = c31056OooOoo;
            eraserSettingsBottomSheetDialog.f76802OooOoO = c29936OooO0oO;
            C29993OooOOOo c29993OooOOOo = eraserSettingsBottomSheetDialog.f76804OooOoOO;
            if (c29993OooOOOo != null) {
                c29993OooOOOo.f106559Oooo0 = c29936OooO0oO;
            }
            eraserSettingsBottomSheetDialog.OooO0oo(this.f106336OooO0Oo);
            this.f106335OooO0OO = eraserSettingsBottomSheetDialog;
            eraserSettingsBottomSheetDialog.show(childFragmentManager, "EraserSettingsBottomSheetDialog");
            return;
        }
        this.f106335OooO0OO = null;
        if (this.f106334OooO0O0 == null) {
            View contentView = OooO0OO().getContentView();
            OooOOO0.OooO0o(contentView, "getContentView(...)");
            this.f106334OooO0O0 = new C29993OooOOOo(contentView);
        }
        C29993OooOOOo c29993OooOOOo2 = this.f106334OooO0O0;
        if (c29993OooOOOo2 != null) {
            c29993OooOOOo2.f106559Oooo0 = c29936OooO0oO;
        }
        if (c29993OooOOOo2 != null) {
            c29993OooOOOo2.OooO0O0(c31056OooOoo);
        }
        C29993OooOOOo c29993OooOOOo3 = this.f106334OooO0O0;
        if (c29993OooOOOo3 != null) {
            c29993OooOOOo3.OooO0oo(this.f106336OooO0Oo);
        }
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        EraserSettingsBottomSheetDialog eraserSettingsBottomSheetDialog = this.f106335OooO0OO;
        if (eraserSettingsBottomSheetDialog != null) {
            eraserSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106335OooO0OO = null;
    }
}
