package o0O0o0oO;

import android.view.View;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.penkit.models.LassoParams;
import java.util.Collections;
import java.util.List;
import o0O0o00.EnumC25982o0000oO;
import o0O0oooo.C26395Oooo0o0;
import o0oOoOo.C31086Oooooo;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26053OoooOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88942OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88943OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26053OoooOoO(Object obj, int i) {
        this.f88943OooOo0o = i;
        this.f88942OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88943OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88942OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    C26062OoooooO c26062OoooooO = c26061Oooooo0.f88961OooO0OO;
                    PDFView pDFView = c26062OoooooO.f88962OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooOo0O(selectRecords);
                    InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
                    float zoomLevel = pDFView.getZoomLevel();
                    oooO00o.getClass();
                    if (InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems) != null) {
                        c26062OoooooO.f88962OooO00o.OooOO0O(lassoParams.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                        pDFView.getTool().OooOO0O();
                        pDFView.OooOoo0();
                        pDFView.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((ExportDialogFragment) this.f88942OooOo).Oooo0OO().OooO0oo(4);
                break;
            case 2:
                ((NoteEditorContainerFragment) this.f88942OooOo).Oooo00O().Oooo00O(false);
                break;
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextLineHeightVO");
                ((com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO) this.f88942OooOo).OooO0O0(((C31086Oooooo) tag).f110944OooO00o, true);
                break;
        }
    }
}
