package o0o0OOO;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OOO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30492Oooo implements o000o0O0.OooOo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30492Oooo)) {
            return false;
        }
        ((C30492Oooo) obj).getClass();
        return true;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_paperConfigDialogFragment_to_importBatchPdfDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", "get_pdf_path");
        bundle.putString(Folder.PROPERTY_FOLDER_ID, null);
        bundle.putInt("multi_select", 1);
        bundle.putInt("extensions", 0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + C20785Oooo00o.OooO00o(1, 1288047941 * 31, 31);
    }

    public final String toString() {
        return "ActionPaperConfigDialogFragmentToImportBatchPdfDialogFragment(key=get_pdf_path, folderId=null, multiSelect=1, extensions=0)";
    }
}
