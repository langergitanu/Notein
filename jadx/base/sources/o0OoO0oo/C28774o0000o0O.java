package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28774o0000o0O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101898OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101899OooO0O0;

    public C28774o0000o0O(String str, String str2) {
        this.f101898OooO00o = str;
        this.f101899OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28774o0000o0O)) {
            return false;
        }
        C28774o0000o0O c28774o0000o0O = (C28774o0000o0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101898OooO00o, c28774o0000o0O.f101898OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101899OooO0O0, c28774o0000o0O.f101899OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57954xe36776;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("note_id", this.f101898OooO00o);
        bundle.putString("source_note_id", this.f101899OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101899OooO0O0.hashCode() + (this.f101898OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToHyperlinkTiledPagesFragment(noteId=");
        sb.append(this.f101898OooO00o);
        sb.append(", sourceNoteId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101899OooO0O0, ")");
    }
}
