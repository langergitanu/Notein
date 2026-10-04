package o0OoO0OO;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportCloudDataDialogFragment;
import com.orion.notein.p607ui.login.thirdparty.LoginBindPhoneNumberFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageBottomSheetDialogFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import o0OoOOOo.C29108OooOOo;
import o0OoOOOo.InterfaceC29095OooO0OO;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30006OooOooo;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30203OooOOOo;
import o0o0OO0O.C30436OooOOOO;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28603OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101380OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101381OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28603OooO00o(Object obj, int i) {
        this.f101381OooOo0o = i;
        this.f101380OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C30201OooOOO0 c30201OooOOO0;
        boolean selected = false;
        Object obj = this.f101380OooOo;
        switch (this.f101381OooOo0o) {
            case 0:
                LoginBindPhoneNumberFragment loginBindPhoneNumberFragment = (LoginBindPhoneNumberFragment) obj;
                C28625OooOo0o c28625OooOo0o = (C28625OooOo0o) loginBindPhoneNumberFragment.f72569Oooo00o.getValue();
                int i = loginBindPhoneNumberFragment.Oooo00o().f101392OooO00o;
                String str = loginBindPhoneNumberFragment.Oooo00o().f101393OooO0O0;
                String str2 = loginBindPhoneNumberFragment.Oooo00o().f101394OooO0OO;
                if (((C28623OooOo00) c28625OooOo0o.f101468OooO0oO.getValue()).f101452OooO00o) {
                    return;
                }
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c28625OooOo0o), null, null, new C28624OooOo0O(c28625OooOo0o, i, str, str2, null), 3);
                return;
            case 1:
                ((com.orion.notein.p607ui.noteeditor.addpage.OooO0OO) ((AddPageBottomSheetDialogFragment) obj).f73778OooOooo.getValue()).OooO0oO();
                return;
            case 2:
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                if (penColorVO.getEnable()) {
                    PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj;
                    Integer num = (Integer) ((C32443OooOOO) penBoxChildFragment.Oooo0o().f75185OoooOOo.f121747OooOo0o.getValue()).f116637OooOo;
                    if (penColorVO.getType() == 4) {
                        int color = penColorVO.getColor();
                        if (num != null && num.intValue() == color) {
                            selected = true;
                        }
                    } else {
                        selected = penColorVO.getSelected();
                    }
                    if (!selected) {
                        penBoxChildFragment.Oooo0O0().OooO00o(penColorVO, view, view);
                        return;
                    }
                    Integer num2 = (Integer) penBoxChildFragment.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        penBoxChildFragment.OoooOOo();
                        o0o00Ooo.OooOO0 oooOO02 = penBoxChildFragment.f75395o000000o;
                        if (oooOO02 != null) {
                            oooOO02.OooO(view, iIntValue, penColorVO);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                textStyleBarChildFragment.OooOoo();
                C29108OooOOo c29108OooOOo = textStyleBarChildFragment.f76457OooooOO;
                if (c29108OooOOo != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29108OooOOo.f103141OooO.showAsDropDown(view);
                    InterfaceC29095OooO0OO interfaceC29095OooO0OO = c29108OooOOo.f103143OooO0O0;
                    if (interfaceC29095OooO0OO != null) {
                        interfaceC29095OooO0OO.OooO0Oo(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C30006OooOooo c30006OooOooo = (C30006OooOooo) obj;
                if (view.isActivated()) {
                    C29936OooO0oO c29936OooO0oO = c30006OooOooo.f106617Oooo;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0oo(c30006OooOooo.f106628OoooO0);
                        return;
                    }
                    return;
                }
                C29936OooO0oO c29936OooO0oO2 = c30006OooOooo.f106617Oooo;
                if (c29936OooO0oO2 != null) {
                    c29936OooO0oO2.OooO0OO(c30006OooOooo.f106628OoooO0);
                    return;
                }
                return;
            case 5:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO == null || (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) == null) {
                    return;
                }
                o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
                if (oooO != null) {
                    oooO.OooO00o();
                }
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(c30201OooOOO0.f107547OooO00o), null, null, new C30203OooOOOo(noteVO, null, c30201OooOOO0), 3);
                return;
            case 6:
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = tiledPageListContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30436OooOOOO(tiledPageListContainerFragment, null), 3);
                return;
            case 7:
                ImportCloudDataDialogFragment importCloudDataDialogFragment = (ImportCloudDataDialogFragment) obj;
                int iIntValue2 = ((Number) importCloudDataDialogFragment.OooOoo0().f70715Oooo00O.f121747OooOo0o.getValue()).intValue();
                if (iIntValue2 == 0) {
                    importCloudDataDialogFragment.dismiss();
                    return;
                } else if (iIntValue2 == 1) {
                    importCloudDataDialogFragment.OooOoo0().OooOO0O(true);
                    return;
                } else {
                    if (iIntValue2 != 2) {
                        return;
                    }
                    importCloudDataDialogFragment.OooOoo0().OooOO0O(false);
                    return;
                }
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                TextView textView = textRecognizeFragment.f78177Oooo0oo;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("tvLoading");
                    throw null;
                }
                textView.setText(textRecognizeFragment.getString(R.string.canceling_ocr));
                textRecognizeFragment.Oooo00O().f108498OooOO0.f120039OooO.set(true);
                return;
        }
    }
}
