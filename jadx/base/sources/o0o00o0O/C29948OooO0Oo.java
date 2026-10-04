package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.HLGroupSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0o00oO0.C29997OooOo0;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o00o0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29948OooO0Oo extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f106340OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC29898OooO0o f106341OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PenBox.OooO0O0 f106342OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PenBox.OooOOO0 f106343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PenBox.OooOOOO f106344OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PenBox.OooOOO f106345OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public HLGroupSettingsBottomSheetDialog f106346OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C29997OooOo0 f106347OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f106348OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f106349OooOO0O;

    public C29948OooO0Oo(Context context) {
        super(context, R.layout.popup_toolbox_hl_settings, o000000O.OooO0o(220), o000000O.OooO0o(StyleIdentifier.LIST_TABLE_2_ACCENT_1));
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        HLGroupSettingsBottomSheetDialog hLGroupSettingsBottomSheetDialog = this.f106346OooO0oO;
        return hLGroupSettingsBottomSheetDialog != null ? hLGroupSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    public final InterfaceC29934OooO0o OooO0Oo() {
        HLGroupSettingsBottomSheetDialog hLGroupSettingsBottomSheetDialog = this.f106346OooO0oO;
        if (hLGroupSettingsBottomSheetDialog == null) {
            hLGroupSettingsBottomSheetDialog = null;
        }
        return hLGroupSettingsBottomSheetDialog == null ? this.f106347OooO0oo : hLGroupSettingsBottomSheetDialog;
    }

    public final void OooO0o(int i, boolean z) {
        this.f106348OooOO0 = z;
        this.f106349OooOO0O = i;
        InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo = OooO0Oo();
        if (interfaceC29934OooO0oOooO0Oo != null) {
            interfaceC29934OooO0oOooO0Oo.OooOOOo(z);
        }
        InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo2 = OooO0Oo();
        if (interfaceC29934OooO0oOooO0Oo2 != null) {
            interfaceC29934OooO0oOooO0Oo2.OooOo0o(i);
        }
    }

    public final void OooO0o0(boolean z) {
        this.f106340OooO = z;
        InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo = OooO0Oo();
        if (interfaceC29934OooO0oOooO0Oo != null) {
            interfaceC29934OooO0oOooO0Oo.OooOo00(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0oO(View view, int i, PenVO penVO, List<PenVO> voList, List<PenColorVO> colorList, PenWidthVO penWidthVO) {
        OooOOO0.OooO0oO(voList, "voList");
        OooOOO0.OooO0oO(colorList, "colorList");
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, voList, colorList, penWidthVO, 16);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106284OooO0OO = this.f106342OooO0OO;
        c29936OooO0oO.f106290OooOO0 = this.f106345OooO0o0;
        c29936OooO0oO.f106291OooOO0O = this.f106341OooO0O0;
        c29936OooO0oO.f106292OooOO0o = this.f106343OooO0Oo;
        c29936OooO0oO.f106293OooOOO0 = this.f106344OooO0o;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            HLGroupSettingsBottomSheetDialog hLGroupSettingsBottomSheetDialog = new HLGroupSettingsBottomSheetDialog();
            hLGroupSettingsBottomSheetDialog.f76806OooOoO = c29936OooO0oO;
            C29997OooOo0 c29997OooOo0 = hLGroupSettingsBottomSheetDialog.f76808OooOoOO;
            if (c29997OooOo0 != null) {
                c29997OooOo0.OooO0o(c29936OooO0oO);
            }
            hLGroupSettingsBottomSheetDialog.f76807OooOoO0 = c31056OooOoo;
            hLGroupSettingsBottomSheetDialog.OooOo00(this.f106340OooO);
            hLGroupSettingsBottomSheetDialog.OooOOOo(this.f106348OooOO0);
            hLGroupSettingsBottomSheetDialog.OooOo0o(this.f106349OooOO0O);
            this.f106346OooO0oO = hLGroupSettingsBottomSheetDialog;
            hLGroupSettingsBottomSheetDialog.show(C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager(), "HLGroupSettingsBottomSheetDialog");
            return;
        }
        this.f106346OooO0oO = null;
        View contentView = OooO0OO().getContentView();
        OooOOO0.OooO0o(contentView, "getContentView(...)");
        C29997OooOo0 c29997OooOo02 = new C29997OooOo0(contentView);
        c29997OooOo02.OooO0o(c29936OooO0oO);
        c29997OooOo02.OooO0o0(c31056OooOoo);
        c29997OooOo02.OooOo00(this.f106340OooO);
        c29997OooOo02.OooOOOo(this.f106348OooOO0);
        c29997OooOo02.OooOo0o(this.f106349OooOO0O);
        this.f106347OooO0oo = c29997OooOo02;
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        HLGroupSettingsBottomSheetDialog hLGroupSettingsBottomSheetDialog = this.f106346OooO0oO;
        if (hLGroupSettingsBottomSheetDialog != null) {
            hLGroupSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106346OooO0oO = null;
    }
}
