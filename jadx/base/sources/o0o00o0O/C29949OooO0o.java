package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.LaserSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29932OooO0OO;
import o0o00oO0.Oooo0;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31045OooOOo;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o00o0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29949OooO0o extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Oooo0 f106350OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<C31045OooOOo> f106351OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public LaserSettingsBottomSheetDialog f106352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PenBox.OooOOO f106353OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PenBox.InterfaceC23605OooO0Oo f106354OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public InterfaceC29898OooO0o f106355OooO0oO;

    static {
        o000000O.OooO0o(225);
        o000000O.OooO0o(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2);
        o000000O.OooO0o0(12.0f);
    }

    public C29949OooO0o(Context context) {
        super(context, R.layout.popup_toolbox_laser_settings, o000000O.OooO0o(225), o000000O.OooO0o(StyleIdentifier.LIST_TABLE_2_ACCENT_1));
        this.f106351OooO0OO = C34434OooOoO.f123453OooOo0o;
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        LaserSettingsBottomSheetDialog laserSettingsBottomSheetDialog = this.f106352OooO0Oo;
        return laserSettingsBottomSheetDialog != null ? laserSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    public final InterfaceC29932OooO0OO OooO0Oo() {
        LaserSettingsBottomSheetDialog laserSettingsBottomSheetDialog = this.f106352OooO0Oo;
        if (laserSettingsBottomSheetDialog == null) {
            laserSettingsBottomSheetDialog = null;
        }
        return laserSettingsBottomSheetDialog != null ? laserSettingsBottomSheetDialog : this.f106350OooO0O0;
    }

    public final void OooO0o(List<C31045OooOOo> list) {
        OooOOO0.OooO0oO(list, "list");
        this.f106351OooO0OO = list;
        InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo = OooO0Oo();
        if (interfaceC29932OooO0OOOooO0Oo != null) {
            interfaceC29932OooO0OOOooO0Oo.OooOO0o(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(View view, int i, List colorList, PenWidthVO penWidthVO) {
        OooOOO0.OooO0oO(colorList, "colorList");
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
        PenVO penVO = (PenVO) tag;
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, (List<PenVO>) OooOo.OooO0oO(penVO), (List<PenColorVO>) colorList, penWidthVO, this.f106351OooO0OO);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106281OooO = this.f106354OooO0o0;
        c29936OooO0oO.f106290OooOO0 = this.f106353OooO0o;
        c29936OooO0oO.f106291OooOO0O = this.f106355OooO0oO;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            LaserSettingsBottomSheetDialog laserSettingsBottomSheetDialog = new LaserSettingsBottomSheetDialog();
            laserSettingsBottomSheetDialog.f76818OooOoO = c29936OooO0oO;
            Oooo0 oooo0 = laserSettingsBottomSheetDialog.f76820OooOoOO;
            if (oooo0 != null) {
                oooo0.f106644Oooo00O = c29936OooO0oO;
            }
            laserSettingsBottomSheetDialog.f76819OooOoO0 = c31056OooOoo;
            this.f106352OooO0Oo = laserSettingsBottomSheetDialog;
            laserSettingsBottomSheetDialog.show(childFragmentManager, "LaserSettingsBottomSheetDialog");
            return;
        }
        this.f106352OooO0Oo = null;
        if (this.f106350OooO0O0 == null) {
            View contentView = OooO0OO().getContentView();
            OooOOO0.OooO0o(contentView, "getContentView(...)");
            this.f106350OooO0O0 = new Oooo0(contentView);
        }
        Oooo0 oooo02 = this.f106350OooO0O0;
        if (oooo02 != null) {
            oooo02.f106644Oooo00O = c29936OooO0oO;
        }
        if (oooo02 != null) {
            oooo02.OooO0Oo(c31056OooOoo);
        }
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        LaserSettingsBottomSheetDialog laserSettingsBottomSheetDialog = this.f106352OooO0Oo;
        if (laserSettingsBottomSheetDialog != null) {
            laserSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106352OooO0Oo = null;
    }
}
