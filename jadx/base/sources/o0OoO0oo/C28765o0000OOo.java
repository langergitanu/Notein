package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28765o0000OOo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101866OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101867OooO0O0;

    public C28765o0000OOo(String str, String str2) {
        this.f101866OooO00o = str;
        this.f101867OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28765o0000OOo)) {
            return false;
        }
        C28765o0000OOo c28765o0000OOo = (C28765o0000OOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101866OooO00o, c28765o0000OOo.f101866OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101867OooO0O0, c28765o0000OOo.f101867OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_addPageDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f101866OooO00o);
        bundle.putString("pageId", this.f101867OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101867OooO0O0.hashCode() + (this.f101866OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToAddPageDialogFragment(noteId=");
        sb.append(this.f101866OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101867OooO0O0, ")");
    }
}
