package o0OoO0oo;

import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28799o000OoO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101978OooO0O0;

    public C28799o000OoO(String str, String str2) {
        this.f101977OooO00o = str;
        this.f101978OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28799o000OoO)) {
            return false;
        }
        C28799o000OoO c28799o000OoO = (C28799o000OoO) obj;
        return this.f101977OooO00o.equals(c28799o000OoO.f101977OooO00o) && this.f101978OooO0O0.equals(c28799o000OoO.f101978OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_renameDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f101977OooO00o);
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f101978OooO0O0);
        bundle.putInt(C18437z2.f56754h, 0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f101977OooO00o.hashCode() * 31, 31, this.f101978OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToRenameDialogFragment(noteId=");
        sb.append(this.f101977OooO00o);
        sb.append(", title=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101978OooO0O0, ", type=0)");
    }
}
