package o0OoOO00;

import OooOoo0.o00000;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoOO00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28994OooO0o0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102741OooO0O0;

    public C28994OooO0o0(String str, String str2) {
        this.f102740OooO00o = str;
        this.f102741OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28994OooO0o0)) {
            return false;
        }
        C28994OooO0o0 c28994OooO0o0 = (C28994OooO0o0) obj;
        c28994OooO0o0.getClass();
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102740OooO00o, c28994OooO0o0.f102740OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102741OooO0O0, c28994OooO0o0.f102741OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57918x16354dbc;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("strategyType", "ADD_PAGE");
        bundle.putString(Folder.PROPERTY_FOLDER_ID, null);
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f102740OooO00o);
        bundle.putString("pageId", this.f102741OooO0O0);
        bundle.putBoolean("unbounded", false);
        bundle.putString("targetMaterialId", null);
        return bundle;
    }

    public final int hashCode() {
        int i = (-252038637) * 31;
        String str = this.f102740OooO00o;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f102741OooO0O0;
        return o00000.OooO0O0((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionAddPageBottomSheetDialogFragmentToPaperConfigDialogFragment(strategyType=ADD_PAGE, folderId=null, noteId=");
        sb.append(this.f102740OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f102741OooO0O0, ", unbounded=false, targetMaterialId=null)");
    }
}
