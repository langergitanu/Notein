package o0OoOO00;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoOO00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28991OooO0OO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102734OooO00o;

    public C28991OooO0OO(String key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        this.f102734OooO00o = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28991OooO0OO) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102734OooO00o, ((C28991OooO0OO) obj).f102734OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57917x961320ff;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f102734OooO00o);
        bundle.putString(Folder.PROPERTY_FOLDER_ID, null);
        bundle.putInt("multi_select", 1);
        bundle.putInt("extensions", 0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + C20785Oooo00o.OooO00o(1, this.f102734OooO00o.hashCode() * 961, 31);
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionAddPageBottomSheetDialogFragmentToImportBatchPdfDialogFragment(key="), this.f102734OooO00o, ", folderId=null, multiSelect=1, extensions=0)");
    }
}
