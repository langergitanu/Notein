package oO0Oo;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30397OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 implements AiOcrEditorListContainer.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120070OooO00o;

    public OooOo00(TextRecognizeFragment textRecognizeFragment) {
        this.f120070OooO00o = textRecognizeFragment;
    }

    @Override // com.orion.notein.ui.ocr.view.AiOcrEditorListContainer.OooO00o
    public final void OooO00o() {
        this.f120070OooO00o.f78196Ooooooo = true;
    }

    @Override // com.orion.notein.ui.ocr.view.AiOcrEditorListContainer.OooO00o
    public final void OooO0O0(String pageId, Spannable spannable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        if (spannable == null) {
            spannable = new SpannableStringBuilder();
        }
        this.f120070OooO00o.Oooo00O().OooOOO(pageId, spannable, 5000L);
    }

    @Override // com.orion.notein.ui.ocr.view.AiOcrEditorListContainer.OooO00o
    public final void OooO0OO(String pageId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        C30394OooOOOO c30394OooOOOOOooo00O = this.f120070OooO00o.Oooo00O();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30394OooOOOOOooo00O);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30397OooOOOo(c30394OooOOOOOooo00O, pageId, null), 2);
    }
}
