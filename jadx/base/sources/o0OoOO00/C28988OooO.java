package o0OoOO00;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoOO00.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28988OooO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102729OooO00o;

    public C28988OooO(String key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        this.f102729OooO00o = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28988OooO) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102729OooO00o, ((C28988OooO) obj).f102729OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_addPageDialogFragment_to_importBatchPdfDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f102729OooO00o);
        bundle.putString(Folder.PROPERTY_FOLDER_ID, null);
        bundle.putInt("multi_select", 1);
        bundle.putInt("extensions", 0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + C20785Oooo00o.OooO00o(1, this.f102729OooO00o.hashCode() * 961, 31);
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionAddPageDialogFragmentToImportBatchPdfDialogFragment(key="), this.f102729OooO00o, ", folderId=null, multiSelect=1, extensions=0)");
    }
}
