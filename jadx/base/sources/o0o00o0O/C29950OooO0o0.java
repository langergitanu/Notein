package o0o00o0O;

import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.InkPenGroupSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0o00oO0.C30006OooOooo;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00o0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29950OooO0o0 extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public PenBox.OooOOO0 f106356OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C30006OooOooo f106357OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public InkPenGroupSettingsBottomSheetDialog f106358OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f106359OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f106360OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f106361OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PenBox.OooO0OO f106362OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PenBox.OooOOO f106363OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public PenBox.OooOOOO f106364OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public InterfaceC29898OooO0o f106365OooOO0O;

    public C29950OooO0o0(Context context) {
        super(context, R.layout.popup_toolbox_inkpen_setting, o000000O.OooO0o(220), o000000O.OooO0o(StyleIdentifier.UNRESOLVED_MENTION));
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        InkPenGroupSettingsBottomSheetDialog inkPenGroupSettingsBottomSheetDialog = this.f106358OooO0OO;
        return inkPenGroupSettingsBottomSheetDialog != null ? inkPenGroupSettingsBottomSheetDialog.isVisible() : OooO0OO().isShowing();
    }

    public final InterfaceC29934OooO0o OooO0Oo() {
        InkPenGroupSettingsBottomSheetDialog inkPenGroupSettingsBottomSheetDialog = this.f106358OooO0OO;
        if (inkPenGroupSettingsBottomSheetDialog == null) {
            inkPenGroupSettingsBottomSheetDialog = null;
        }
        return inkPenGroupSettingsBottomSheetDialog == null ? this.f106357OooO0O0 : inkPenGroupSettingsBottomSheetDialog;
    }

    public final void OooO0o(int i, boolean z) {
        this.f106361OooO0o0 = z;
        this.f106360OooO0o = i;
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
        this.f106359OooO0Oo = z;
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
        c29936OooO0oO.f106282OooO00o = this.f106362OooO0oO;
        c29936OooO0oO.f106290OooOO0 = this.f106363OooO0oo;
        c29936OooO0oO.f106291OooOO0O = this.f106365OooOO0O;
        c29936OooO0oO.f106292OooOO0o = this.f106356OooO;
        c29936OooO0oO.f106293OooOOO0 = this.f106364OooOO0;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            InkPenGroupSettingsBottomSheetDialog inkPenGroupSettingsBottomSheetDialog = new InkPenGroupSettingsBottomSheetDialog();
            inkPenGroupSettingsBottomSheetDialog.f76812OooOoO = c29936OooO0oO;
            C30006OooOooo c30006OooOooo = inkPenGroupSettingsBottomSheetDialog.f76814OooOoOO;
            if (c30006OooOooo != null) {
                c30006OooOooo.OooO0oO(c29936OooO0oO);
            }
            inkPenGroupSettingsBottomSheetDialog.f76813OooOoO0 = c31056OooOoo;
            inkPenGroupSettingsBottomSheetDialog.OooOo00(this.f106359OooO0Oo);
            inkPenGroupSettingsBottomSheetDialog.OooOOOo(this.f106361OooO0o0);
            inkPenGroupSettingsBottomSheetDialog.OooOo0o(this.f106360OooO0o);
            this.f106358OooO0OO = inkPenGroupSettingsBottomSheetDialog;
            inkPenGroupSettingsBottomSheetDialog.show(C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager(), "InkPenGroupSettingsBottomSheetDialog");
            return;
        }
        this.f106358OooO0OO = null;
        View contentView = OooO0OO().getContentView();
        OooOOO0.OooO0o(contentView, "getContentView(...)");
        C30006OooOooo c30006OooOooo2 = new C30006OooOooo(contentView);
        c30006OooOooo2.OooO0oO(c29936OooO0oO);
        c30006OooOooo2.OooO0o(c31056OooOoo);
        c30006OooOooo2.OooOo00(this.f106359OooO0Oo);
        c30006OooOooo2.OooOOOo(this.f106361OooO0o0);
        c30006OooOooo2.OooOo0o(this.f106360OooO0o);
        this.f106357OooO0O0 = c30006OooOooo2;
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        int iIntValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue();
        C34406OooO00o.f123390OooO00o.OooO00o(C20855OooooOO.OooO0OO(iIntValue, iIntValue2, "show: offsetX=", ", offsetY="), new Object[0]);
        OooO0OO().showAtLocation(view, 0, iIntValue, iIntValue2);
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
        InkPenGroupSettingsBottomSheetDialog inkPenGroupSettingsBottomSheetDialog = this.f106358OooO0OO;
        if (inkPenGroupSettingsBottomSheetDialog != null) {
            inkPenGroupSettingsBottomSheetDialog.dismissAllowingStateLoss();
        }
        this.f106358OooO0OO = null;
    }
}
