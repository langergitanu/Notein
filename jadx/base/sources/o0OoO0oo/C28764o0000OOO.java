package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000OOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28764o0000OOO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101864OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101865OooO0O0;

    public C28764o0000OOO(String str, String str2) {
        this.f101864OooO00o = str;
        this.f101865OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28764o0000OOO)) {
            return false;
        }
        C28764o0000OOO c28764o0000OOO = (C28764o0000OOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101864OooO00o, c28764o0000OOO.f101864OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101865OooO0O0, c28764o0000OOO.f101865OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57947x27869f0a;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f101864OooO00o);
        bundle.putString("pageId", this.f101865OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101865OooO0O0.hashCode() + (this.f101864OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToAddPageBottomSheetDialogFragment(noteId=");
        sb.append(this.f101864OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101865OooO0O0, ")");
    }
}
