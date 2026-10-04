package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.VectorSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30025OoooOoo;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o00o0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29953OooOO0o extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final List<Integer> f106391OooOO0 = C34429OooOOo0.OooOO0o(7, 0, 19, 20, 21, 22, 24, 23, 1, 3, 9, 6, 8, 18, 10, 11, 13, 12, 14, 15, 16, 17);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public InterfaceC29898OooO0o f106392OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public VectorSettingsBottomSheetDialog f106393OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C30025OoooOoo f106394OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f106395OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PenBox.InterfaceC23609OooOO0o f106396OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f106397OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PenBox.OooOOO f106398OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PenBox.OooOOOO f106399OooO0oo;

    public C29953OooOO0o(Context context) {
        super(context, R.layout.popup_toolbox_vector_pen_settings, o000000O.OooO0o(220), o000000O.OooO0o(402));
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        VectorSettingsBottomSheetDialog vectorSettingsBottomSheetDialog = this.f106393OooO0O0;
        return vectorSettingsBottomSheetDialog != null ? vectorSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    public final o0o00o0.OooO OooO0Oo() {
        VectorSettingsBottomSheetDialog vectorSettingsBottomSheetDialog = this.f106393OooO0O0;
        if (vectorSettingsBottomSheetDialog == null) {
            vectorSettingsBottomSheetDialog = null;
        }
        return vectorSettingsBottomSheetDialog == null ? this.f106394OooO0OO : vectorSettingsBottomSheetDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(View view, int i, List colorList, PenWidthVO penWidthVO) {
        OooOOO0.OooO0oO(colorList, "colorList");
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
        PenVO penVO = (PenVO) tag;
        C31056OooOoo c31056OooOoo = new C31056OooOoo(penVO, OooOo.OooO0oO(penVO), colorList, penWidthVO, 16);
        C29936OooO0oO c29936OooO0oO = new C29936OooO0oO();
        c29936OooO0oO.f106291OooOO0O = this.f106392OooO;
        c29936OooO0oO.f106290OooOO0 = this.f106398OooO0oO;
        c29936OooO0oO.f106289OooO0oo = this.f106396OooO0o;
        c29936OooO0oO.f106293OooOOO0 = this.f106399OooO0oo;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            VectorSettingsBottomSheetDialog vectorSettingsBottomSheetDialog = new VectorSettingsBottomSheetDialog();
            vectorSettingsBottomSheetDialog.f76830OooOoO = c29936OooO0oO;
            C30025OoooOoo c30025OoooOoo = vectorSettingsBottomSheetDialog.f76832OooOoOO;
            if (c30025OoooOoo != null) {
                c30025OoooOoo.f106730Oooo00O = c29936OooO0oO;
            }
            vectorSettingsBottomSheetDialog.f76831OooOoO0 = c31056OooOoo;
            vectorSettingsBottomSheetDialog.OooOOOo(this.f106395OooO0Oo);
            vectorSettingsBottomSheetDialog.OooOo0o(this.f106397OooO0o0);
            this.f106393OooO0O0 = vectorSettingsBottomSheetDialog;
            vectorSettingsBottomSheetDialog.show(C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager(), "VectorSettingsBottomSheetDialog");
            return;
        }
        this.f106393OooO0O0 = null;
        if (this.f106394OooO0OO == null) {
            View contentView = OooO0OO().getContentView();
            OooOOO0.OooO0o(contentView, "getContentView(...)");
            this.f106394OooO0OO = new C30025OoooOoo(contentView);
        }
        C30025OoooOoo c30025OoooOoo2 = this.f106394OooO0OO;
        if (c30025OoooOoo2 != null) {
            c30025OoooOoo2.f106730Oooo00O = c29936OooO0oO;
        }
        if (c30025OoooOoo2 != null) {
            c30025OoooOoo2.OooO0OO(c31056OooOoo);
        }
        C30025OoooOoo c30025OoooOoo3 = this.f106394OooO0OO;
        if (c30025OoooOoo3 != null) {
            c30025OoooOoo3.OooOOOo(this.f106395OooO0Oo);
        }
        C30025OoooOoo c30025OoooOoo4 = this.f106394OooO0OO;
        if (c30025OoooOoo4 != null) {
            c30025OoooOoo4.OooOo0o(this.f106397OooO0o0);
        }
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    public final void OooO0o0(int i, boolean z) {
        this.f106395OooO0Oo = z;
        this.f106397OooO0o0 = i;
        o0o00o0.OooO oooOOooO0Oo = OooO0Oo();
        if (oooOOooO0Oo != null) {
            oooOOooO0Oo.OooOo0o(i);
        }
        o0o00o0.OooO oooOOooO0Oo2 = OooO0Oo();
        if (oooOOooO0Oo2 != null) {
            oooOOooO0Oo2.OooOOOo(z);
        }
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        VectorSettingsBottomSheetDialog vectorSettingsBottomSheetDialog = this.f106393OooO0O0;
        if (vectorSettingsBottomSheetDialog != null) {
            vectorSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106393OooO0O0 = null;
    }
}
