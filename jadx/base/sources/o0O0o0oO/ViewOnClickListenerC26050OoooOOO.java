package o0O0o0oO;

import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.LayerRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.penkit.models.LassoParams;
import java.util.Collections;
import java.util.List;
import o00o00.C25206OooO0Oo;
import o0O0O0o.C25871OooO00o;
import o0O0o00.EnumC25982o0000oO;
import o0Ooo0O0.C29402OooOoo;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0oOOOoo.C30837OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0oO.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26050OoooOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88936OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88937OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26050OoooOOO(Object obj, int i) {
        this.f88937OooOo0o = i;
        this.f88936OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88937OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88936OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    C26062OoooooO c26062OoooooO = c26061Oooooo0.f88961OooO0OO;
                    c26062OoooooO.getClass();
                    Log.d("LassoEventImpl", "on Cut button clicked");
                    PDFView pDFView = c26062OoooooO.f88962OooO00o;
                    pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoO();
                    InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
                    float zoomLevel = pDFView.getZoomLevel();
                    oooO00o.getClass();
                    RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems);
                    if (rectFOooO00o == null) {
                        return;
                    }
                    pDFView.OooOO0O(lassoParams.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                    c26062OoooooO.OooO00o(lassoParams.getSelectedItems(), rectFOooO00o);
                    pDFView.getTool().OooOO0O();
                    pDFView.OooOoo0();
                    pDFView.invalidate();
                    return;
                }
                return;
            case 1:
                ((ExportDialogFragment) this.f88936OooOo).Oooo0OO().OooOO0(2);
                return;
            case 2:
                LayerRenameDialogFragment layerRenameDialogFragment = (LayerRenameDialogFragment) this.f88936OooOo;
                EditText editText = layerRenameDialogFragment.f74741Oooo0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = layerRenameDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = layerRenameDialogFragment.getString(R.string.hint_enter_title);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                C25871OooO00o c25871OooO00o = layerRenameDialogFragment.f74746Oooo0OO;
                if (c25871OooO00o != null) {
                    String name = text.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
                    com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = ((PageLayerEditor) c25871OooO00o.f88280OooO00o).f74867OooOo0o;
                    if (oooO0OO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    C30837OooO00o c30837OooO00o = (C30837OooO00o) c25871OooO00o.f88281OooO0O0;
                    C34406OooO00o.f123390OooO00o.OooO0o0("renameLayer start. vo=" + c30837OooO00o + ", newName=" + name, new Object[0]);
                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new C29402OooOoo(oooO0OO, c30837OooO00o, name, null), 2);
                }
                Dialog dialog = layerRenameDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f88936OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
        }
    }
}
