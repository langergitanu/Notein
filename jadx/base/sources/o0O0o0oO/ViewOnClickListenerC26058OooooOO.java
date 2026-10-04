package o0O0o0oO;

import android.app.Dialog;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.p607ui.TipsDialogFragment2;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment.C23530OooO0Oo;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o0O0oooo.C26395Oooo0o0;
import o0Ooooo0.C29705OooOO0;
import o0Ooooo0.C29712OooOOOO;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o00oOo.C30033OooO0o;
import o0o0O0o.C30294OooO0OO;
import o0o0OOO.C30520o000000o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26058OooooOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88952OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88953OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26058OooooOO(Object obj, int i) {
        this.f88953OooOo0o = i;
        this.f88952OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Object obj = this.f88952OooOo;
        switch (this.f88953OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) obj;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    PDFView pDFView = c26061Oooooo0.f88961OooO0OO.f88962OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoo();
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooO0o(selectRecords);
                    return;
                }
                return;
            case 1:
                ((ExportDialogFragment) obj).Oooo0OO().OooO0oo(16);
                return;
            case 2:
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
                Object tag = v.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                SortKeyVO sortKeyVO = (SortKeyVO) tag;
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) obj;
                C30294OooO0OO c30294OooO0OO = editorOutlineFragment.f75805Oooo0o0;
                if (c30294OooO0OO != null) {
                    c30294OooO0OO.OooO00o();
                }
                if (sortKeyVO.isVipBadgeVisible()) {
                    InterfaceC21987OooOoo viewLifecycleOwner = editorOutlineFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorOutlineFragment.new C23530OooO0Oo(null), 3);
                    return;
                } else {
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    com.orion.notein.p607ui.p609vo.OooO00o key = sortKeyVO.getKey();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29705OooOO0OooOooO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29712OooOOOO(c29705OooOO0OooOooO, key, null), 2);
                    return;
                }
            case 3:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) obj).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(v);
                    c29825OooOoO0.OooO00o(v);
                    return;
                }
                return;
            case 4:
                C30033OooO0o c30033OooO0o = ((NoteListContainerFragment) obj).f77376o0OoOo0;
                if (c30033OooO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(v);
                C30033OooO0o.OooO0OO(c30033OooO0o, v);
                return;
            case 5:
                Object tag2 = v.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.ThemeVO");
                C30520o000000o c30520o000000oOooOooo = ((StandardTemplateFragment) obj).OooOooo();
                PaperTheme theme = ((ThemeVO) tag2).getPaperTheme();
                c30520o000000oOooOooo.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(theme, "theme");
                C33781o00o0O c33781o00o0O = c30520o000000oOooOooo.f109028Oooo000;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, theme);
                return;
            default:
                Dialog dialog = ((TipsDialogFragment2) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
