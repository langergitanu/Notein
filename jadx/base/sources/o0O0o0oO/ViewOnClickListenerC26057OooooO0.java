package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.export.ExportDialogFragment.C23095OooO0oo;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o000O0oo.RunnableC24428OooOOo;
import o000o0O0.C24564OooO00o;
import o0O0oooo.C26395Oooo0o0;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oO.C28674OooO0OO;
import o0o00OOo.C29891OooO0o0;
import o0oOoOo.C31041OooOOO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0O0o0oO.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26057OooooO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88950OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88951OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26057OooooO0(Object obj, int i) {
        this.f88951OooOo0o = i;
        this.f88950OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        switch (this.f88951OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88950OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    PDFView pDFView = c26061Oooooo0.f88961OooO0OO.f88962OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoo();
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooO00o(selectRecords);
                }
                break;
            case 1:
                ExportDialogFragment exportDialogFragment = (ExportDialogFragment) this.f88950OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = exportDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, exportDialogFragment.new C23095OooO0oo(null), 3);
                break;
            case 2:
                ((C23383OooO0Oo) this.f88950OooOo).f74115OooO00o.dismiss();
                break;
            case 3:
                ActivityC21897OooOo0 activity = ((EditorOutlineFragment) this.f88950OooOo).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.showGuideVideo(1);
                }
                break;
            case 4:
                C29891OooO0o0 c29891OooO0o0 = (C29891OooO0o0) this.f88950OooOo;
                int i = 1;
                c29891OooO0o0.f106039OooO0Oo.animate().translationX(c29891OooO0o0.f106038OooO0OO.getWidth()).withStartAction(new RunnableC24428OooOOo(c29891OooO0o0, i)).withEndAction(new com.airbnb.lottie.OooOO0O(c29891OooO0o0, i));
                break;
            case 5:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((NoteListContainerFragment) this.f88950OooOo), new C24564OooO00o(R.id.action_noteListContainerFragment_to_userMessageFragment));
                break;
            case 6:
                final StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) this.f88950OooOo;
                standardTemplateFragment.OooOoO0(23, new oO0O000o.OooO00o() { // from class: o0o0OOO.o0000O0
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        StandardTemplateFragment standardTemplateFragment2 = standardTemplateFragment;
                        View view2 = view;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(view2);
                        C31041OooOOO c31041OooOOO = (C31041OooOOO) standardTemplateFragment2.OooOooo().f109020OooOoO0.getValue();
                        C28674OooO0OO c28674OooO0OO = standardTemplateFragment2.f78688Oooo0o;
                        if (c28674OooO0OO == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("gridAdjustPopupWindow");
                            throw null;
                        }
                        int i2 = c31041OooOOO.f110824OooO0O0;
                        int i3 = c31041OooOOO.f110823OooO00o;
                        c28674OooO0OO.f101607OooO0O0.setProgress(i3);
                        c28674OooO0OO.f101609OooO0Oo.setProgress(i2);
                        c28674OooO0OO.f101608OooO0OO.setText(String.valueOf(i3));
                        c28674OooO0OO.f101611OooO0o0.setText(i2 + "%");
                        boolean zBooleanValue = ((Boolean) standardTemplateFragment2.OooOooo().f109017OooOo0O.getValue()).booleanValue();
                        C28674OooO0OO c28674OooO0OO2 = standardTemplateFragment2.f78688Oooo0o;
                        if (c28674OooO0OO2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("gridAdjustPopupWindow");
                            throw null;
                        }
                        c28674OooO0OO2.f101610OooO0o.setVisibility(!zBooleanValue ? 0 : 8);
                        C28674OooO0OO c28674OooO0OO3 = standardTemplateFragment2.f78688Oooo0o;
                        if (c28674OooO0OO3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("gridAdjustPopupWindow");
                            throw null;
                        }
                        synchronized (c28674OooO0OO3) {
                            Rect rect = new Rect();
                            view2.getGlobalVisibleRect(rect);
                            c28674OooO0OO3.f101606OooO00o.showAtLocation(view2, 0, rect.centerX(), rect.centerY());
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                break;
            case 7:
                TipsDialogFragment tipsDialogFragment = (TipsDialogFragment) this.f88950OooOo;
                View.OnClickListener onClickListener = tipsDialogFragment.f70461Oooo00o;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                Dialog dialog = tipsDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                ((ScannedPageSelectDialogFragment) this.f88950OooOo).Oooo0(true);
                break;
        }
    }
}
