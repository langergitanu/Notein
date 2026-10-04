package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.ImagePreviewDialogFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.pageeditor.PageOperationTipsDialogFragment;
import o000o0O0.C24587OooOoo;
import o0Oo00o.C28026OooO0OO;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C29997OooOo0;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30399OooOOo0;
import o0o0OO0O.C30422OooO;
import o0o0OO0O.C30431OooOO0;
import o0oOoOo.C31088OoooooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o000OOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100570OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100571OooOo0o;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f100571OooOo0o = i;
        this.f100570OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100571OooOo0o) {
            case 0:
                ((ImagePreviewDialogFragment) this.f100570OooOo).dismiss();
                return;
            case 1:
                C29997OooOo0 c29997OooOo0 = (C29997OooOo0) this.f100570OooOo;
                String str = c29997OooOo0.f106582Oooo00o.isChecked() ? "yes" : TranslateLanguage.NORWEGIAN;
                C29936OooO0oO c29936OooO0oO = c29997OooOo0.f106584Oooo0OO;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0o0("straight_line", 0.0f, c29997OooOo0.f106587Oooo0oO, str);
                    return;
                }
                return;
            case 2:
                ((o0o0O.OooO0OO) this.f100570OooOo).f107410OooO0O0.onClick(view);
                return;
            case 3:
                PageOperationTipsDialogFragment pageOperationTipsDialogFragment = (PageOperationTipsDialogFragment) this.f100570OooOo;
                int i = pageOperationTipsDialogFragment.Oooo00O().f108687OooO00o;
                if (i == 0) {
                    C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(pageOperationTipsDialogFragment), new C30422OooO(pageOperationTipsDialogFragment.Oooo00O().f108687OooO00o), new C24587OooOoo(false, false, R.id.pageOperationTipsDialogFragment, true, false, -1, -1, -1, -1));
                    return;
                } else if (i == 1) {
                    C21030OooOO0o.OooO0OO(pageOperationTipsDialogFragment).OooOOo0();
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(pageOperationTipsDialogFragment), new C30431OooOO0(pageOperationTipsDialogFragment.Oooo00O().f108689OooO0OO), new C24587OooOoo(false, false, R.id.pageOperationTipsDialogFragment, true, false, -1, -1, -1, -1));
                    return;
                }
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextRecognizeSessionVO");
                C31088OoooooO c31088OoooooO = (C31088OoooooO) tag;
                int id = view.getId();
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f100570OooOo;
                String sessionId = c31088OoooooO.f110954OooO00o;
                if (id == R.id.item_delete) {
                    C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(sessionId, "sessionId");
                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c30394OooOOOOOooo00O), null, null, new C30399OooOOo0(c30394OooOOOOOooo00O, sessionId, null), 3);
                } else if (id == R.id.item_export) {
                    textRecognizeFragment.Oooo00O().OooOO0(sessionId);
                } else if (id == R.id.item_rename) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(sessionId, "sessionId");
                    String suggestedName = c31088OoooooO.f110955OooO0O0;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(suggestedName, "suggestedName");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textRecognizeFragment), new oO0Oo.Oooo0(sessionId, suggestedName));
                }
                o0o0O.OooO0OO oooO0OO = textRecognizeFragment.f78192OooooOo;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sessionItemMoreMenu");
                    throw null;
                }
        }
    }
}
