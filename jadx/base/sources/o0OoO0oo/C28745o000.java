package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28745o000 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101805OooO0O0;

    public C28745o000(String str, String str2) {
        this.f101804OooO00o = str;
        this.f101805OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28745o000)) {
            return false;
        }
        C28745o000 c28745o000 = (C28745o000) obj;
        c28745o000.getClass();
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101804OooO00o, c28745o000.f101804OooO00o) && this.f101805OooO0O0.equals(c28745o000.f101805OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_paperConfigDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("strategyType", "CHANGE_TEMPLATE");
        bundle.putString(Folder.PROPERTY_FOLDER_ID, null);
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f101804OooO00o);
        bundle.putString("pageId", this.f101805OooO0O0);
        bundle.putBoolean("unbounded", false);
        bundle.putString("targetMaterialId", null);
        return bundle;
    }

    public final int hashCode() {
        int i = 1535113463 * 31;
        String str = this.f101804OooO00o;
        return OooOoo0.o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.f101805OooO0O0), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToPaperConfigDialogFragment(strategyType=CHANGE_TEMPLATE, folderId=null, noteId=");
        sb.append(this.f101804OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101805OooO0O0, ", unbounded=false, targetMaterialId=null)");
    }
}
