package o0OooOoo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.CloudBackupFragment;
import com.orion.notein.p607ui.backup.ImportCloudDataDialogFragment;
import com.orion.notein.p607ui.login.entry.LoginContainerFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.pageeditor.PageSaveAsDialogFragment;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24586OooOoOO;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0OoOOOo.C29108OooOOo;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import o0oOoOo.C31089Ooooooo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0OooOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29578OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104903OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104904OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29578OooO00o(Object obj, int i) {
        this.f104904OooOo0o = i;
        this.f104903OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C30201OooOOO0 c30201OooOOO0;
        Object obj = this.f104903OooOo;
        switch (this.f104904OooOo0o) {
            case 0:
                LoginContainerFragment loginContainerFragment = (LoginContainerFragment) obj;
                C24586OooOoOO c24586OooOoOO = loginContainerFragment.f72179OooOoo;
                if (c24586OooOoOO == null || !c24586OooOoOO.OooOOo0()) {
                    loginContainerFragment.requireActivity().getOnBackPressedDispatcher().OooO0OO();
                    return;
                }
                return;
            case 1:
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextStyleVO");
                C31089Ooooooo c31089Ooooooo = (C31089Ooooooo) tag;
                boolean z = c31089Ooooooo.f110963OooO0O0;
                boolean z2 = !z;
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                List<C31089Ooooooo> list = (List) textStyleBarChildFragment.OooOoOO().f102908OooOOo0.f121747OooOo0o.getValue();
                int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (C31089Ooooooo c31089Ooooooo2 : list) {
                    linkedHashMap.put(Integer.valueOf(c31089Ooooooo2.f110962OooO00o), Boolean.valueOf(c31089Ooooooo2.f110963OooO0O0));
                }
                LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(linkedHashMap);
                Set<Integer> set = C29108OooOOo.f103140OooOOo0;
                int i = c31089Ooooooo.f110962OooO00o;
                if (!set.contains(Integer.valueOf(i))) {
                    Set<Integer> set2 = C29108OooOOo.f103139OooOOOo;
                    if (set2.contains(Integer.valueOf(i))) {
                        if (z) {
                            linkedHashMapOooOOOO.put(Integer.valueOf(i), Boolean.valueOf(z2));
                        } else {
                            Iterator<T> it = set2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                linkedHashMapOooOOOO.put(Integer.valueOf(iIntValue), Boolean.valueOf(iIntValue == i));
                            }
                        }
                    } else if (i != 6 && i != 5) {
                        linkedHashMapOooOOOO.put(Integer.valueOf(i), Boolean.valueOf(z2));
                    }
                } else {
                    if (z) {
                        return;
                    }
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = ((Number) it2.next()).intValue();
                        linkedHashMapOooOOOO.put(Integer.valueOf(iIntValue2), Boolean.valueOf(iIntValue2 == i));
                    }
                }
                textStyleBarChildFragment.OooOoOO().OooOOOO(linkedHashMapOooOOOO);
                textStyleBarChildFragment.OooOoOO().OooOO0o(i, z2);
                return;
            case 2:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO == null || (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) == null) {
                    return;
                }
                o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
                if (oooO != null) {
                    oooO.OooO00o();
                }
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30201OooOOO0.f107547OooO00o), R.id.renameDialogFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, noteVO.getId()), new C32443OooOOO(NoteMeta.PROPERTY_TITLE, noteVO.getName()), new C32443OooOOO(C18437z2.f56754h, Integer.valueOf(noteVO.getType()))));
                return;
            case 3:
                PageSaveAsDialogFragment pageSaveAsDialogFragment = (PageSaveAsDialogFragment) obj;
                EditText editText = pageSaveAsDialogFragment.f78515OooOooo;
                if (editText == null) {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = pageSaveAsDialogFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = pageSaveAsDialogFragment.getString(R.string.input_file_name_hint);
                    OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                pageSaveAsDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("note_title", text.toString())), "save_as");
                Dialog dialog = pageSaveAsDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 4:
                C21030OooOO0o.OooO0OO((DeleteAccountAgreementFragment) obj).OooOOo0();
                return;
            case 5:
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                CloudBackupFragment cloudBackupFragment = (CloudBackupFragment) obj;
                cloudBackupFragment.OooOoOO().OooOO0();
                if (cloudBackupFragment.getChildFragmentManager().OooOooo("ImportCloudDataDialogFragment") == null) {
                    new ImportCloudDataDialogFragment().show(cloudBackupFragment.getChildFragmentManager(), "ImportCloudDataDialogFragment");
                    return;
                }
                return;
            default:
                ((TextRecognizeFragment) obj).Oooo00O().OooOOO0(null);
                return;
        }
    }
}
