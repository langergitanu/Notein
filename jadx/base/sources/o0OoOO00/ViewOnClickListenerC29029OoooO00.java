package o0OoOO00;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.core.os.BundleKt;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.p607ui.noteeditor.addpage.C23365OooO0Oo;
import com.orion.notein.p607ui.noteeditor.addpage.PDFPageSelectorDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import o0OoO0oo.C28755o00000o0;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOO00.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29029OoooO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102841OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102842OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29029OoooO00(Object obj, int i) {
        this.f102842OooOo0o = i;
        this.f102841OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102842OooOo0o) {
            case 0:
                PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = (PDFPageSelectorDialogFragment) this.f102841OooOo;
                String str = ((C29028OoooO0) pDFPageSelectorDialogFragment.f73917Oooo000.getValue()).f102837OooO00o;
                C32443OooOOO c32443OooOOO = new C32443OooOOO("page_num", pDFPageSelectorDialogFragment.Oooo00o().f73889OooOO0.getValue());
                C23365OooO0Oo.OooO00o oooO00o = (C23365OooO0Oo.OooO00o) pDFPageSelectorDialogFragment.Oooo00o().f73888OooO0oo.getValue();
                C32443OooOOO c32443OooOOO2 = new C32443OooOOO("pdf_uri", oooO00o != null ? oooO00o.f73896OooO00o : null);
                C23365OooO0Oo.OooO00o oooO00o2 = (C23365OooO0Oo.OooO00o) pDFPageSelectorDialogFragment.Oooo00o().f73888OooO0oo.getValue();
                pDFPageSelectorDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(c32443OooOOO, c32443OooOOO2, new C32443OooOOO("pdf_password", oooO00o2 != null ? oooO00o2.f73897OooO0O0 : null)), str);
                C21030OooOO0o.OooO0OO(pDFPageSelectorDialogFragment).OooOOOo();
                break;
            case 1:
                C28755o00000o0 c28755o00000o0 = ((BaseToolbarChildFragment) this.f102841OooOo).f76506o000oOoO;
                if (c28755o00000o0 != null) {
                    c28755o00000o0.OooO0Oo();
                }
                break;
            case 2:
                NoteEditorContainer.OooO00o oooO00o3 = ((NoteEditorContainer) this.f102841OooOo).f76983Oooo0OO;
                if (oooO00o3 != null) {
                    oooO00o3.OooO0Oo();
                }
                break;
            case 3:
                View.OnClickListener onClickListener = ((o0o0O000.OooO0OO) this.f102841OooOo).f107632OooO0OO;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            default:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f102841OooOo;
                if (myTemplateFragment.f78636OoooOOO == MyTemplateFragment.OooO00o.f78641OooOo) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    c20358OooO00o.OooO00o("variant orientation click: PORTRAIT, selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue() + ", tempColor=" + myTemplateFragment.OooOooo().f109026Oooo.getValue(), new Object[0]);
                    myTemplateFragment.OooOooo().OooOoO0(Orientation.PORTRAIT);
                }
                break;
        }
    }
}
