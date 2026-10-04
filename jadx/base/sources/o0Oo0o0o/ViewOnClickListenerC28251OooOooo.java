package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment2;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.notein.p607ui.user.message.UserMessagesDialogFragment;
import com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment.OooO0OO;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOOo.C29108OooOOo;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o00oo.C30103OooOO0O;
import o0o0O0O0.C30268OooO0Oo;
import o0oOoOo.C31089Ooooooo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0Oo0o0o.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28251OooOooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100106OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100107OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28251OooOooo(Object obj, int i) {
        this.f100107OooOo0o = i;
        this.f100106OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = true;
        Object obj = this.f100106OooOo;
        switch (this.f100107OooOo0o) {
            case 0:
                ((ExportDialogFragment) obj).dismissAllowingStateLoss();
                return;
            case 1:
                int i = TextStyleBox.f74132o000oOoO;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextStyleVO");
                C31089Ooooooo c31089Ooooooo = (C31089Ooooooo) tag;
                boolean z2 = c31089Ooooooo.f110963OooO0O0;
                boolean z3 = !z2;
                TextStyleBox textStyleBox = (TextStyleBox) obj;
                C29051OooOO0o c29051OooOO0o = textStyleBox.f74153OoooO;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                List<C31089Ooooooo> list = (List) c29051OooOO0o.f102908OooOOo0.f121747OooOo0o.getValue();
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (C31089Ooooooo c31089Ooooooo2 : list) {
                    linkedHashMap.put(Integer.valueOf(c31089Ooooooo2.f110962OooO00o), Boolean.valueOf(c31089Ooooooo2.f110963OooO0O0));
                }
                LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(linkedHashMap);
                Set<Integer> set = C29108OooOOo.f103140OooOOo0;
                int i2 = c31089Ooooooo.f110962OooO00o;
                if (!set.contains(Integer.valueOf(i2))) {
                    Set<Integer> set2 = C29108OooOOo.f103139OooOOOo;
                    if (set2.contains(Integer.valueOf(i2))) {
                        if (z2) {
                            linkedHashMapOooOOOO.put(Integer.valueOf(i2), Boolean.valueOf(z3));
                        } else {
                            Iterator<T> it = set2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                linkedHashMapOooOOOO.put(Integer.valueOf(iIntValue), Boolean.valueOf(iIntValue == i2));
                            }
                        }
                    } else if (i2 != 6 && i2 != 5) {
                        linkedHashMapOooOOOO.put(Integer.valueOf(i2), Boolean.valueOf(z3));
                    }
                } else if (z2) {
                    z = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = ((Number) it2.next()).intValue();
                        linkedHashMapOooOOOO.put(Integer.valueOf(iIntValue2), Boolean.valueOf(iIntValue2 == i2));
                    }
                }
                C29051OooOO0o c29051OooOO0o2 = textStyleBox.f74153OoooO;
                if (c29051OooOO0o2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                c29051OooOO0o2.OooOOOO(linkedHashMapOooOOOO);
                if (z) {
                    C29051OooOO0o c29051OooOO0o3 = textStyleBox.f74153OoooO;
                    if (c29051OooOO0o3 != null) {
                        c29051OooOO0o3.OooOO0o(i2, z3);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                }
                return;
            case 2:
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = editorOutlineFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorOutlineFragment.new OooO0OO(null), 3);
                return;
            case 3:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) obj).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 4:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj;
                Context contextRequireContext = noteListContainerFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (o0oo000O.OooOO0O.OooO00o(contextRequireContext)) {
                    new UserMessagesDialogFragment().show(noteListContainerFragment.getParentFragmentManager(), "UserMessagesDialogFragment");
                    return;
                } else {
                    C21030OooOO0o.OooO0OO(noteListContainerFragment).OooOOO0(R.id.userMessageFragment, null, null);
                    return;
                }
            case 5:
                ImportBatchPdfDialogFragment importBatchPdfDialogFragment = (ImportBatchPdfDialogFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner2 = importBatchPdfDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30268OooO0Oo(importBatchPdfDialogFragment, null), 2);
                return;
            case 6:
                ((StandardTemplateFragment) obj).OooOooo().OooOo0O(PaperOrientation.HORIZONTAL);
                return;
            default:
                TipsDialogFragment2 tipsDialogFragment2 = (TipsDialogFragment2) obj;
                C30103OooOO0O.OooO00o.OooO0OO oooO0OO = tipsDialogFragment2.f70472OooOooo;
                if (oooO0OO != null) {
                    oooO0OO.onClick(view);
                }
                Dialog dialog = tipsDialogFragment2.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
