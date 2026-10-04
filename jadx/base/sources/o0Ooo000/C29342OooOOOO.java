package o0Ooo000;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Ooo000.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29342OooOOOO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f104067OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f104068OooO0O0;

    public C29342OooOOOO(String str, String str2) {
        this.f104067OooO00o = str;
        this.f104068OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29342OooOOOO)) {
            return false;
        }
        C29342OooOOOO c29342OooOOOO = (C29342OooOOOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104067OooO00o, c29342OooOOOO.f104067OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104068OooO0O0, c29342OooOOOO.f104068OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteTreeSelectionFragment_to_hyperlinkTiledPagesFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("note_id", this.f104067OooO00o);
        bundle.putString("source_note_id", this.f104068OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f104068OooO0O0.hashCode() + (this.f104067OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteTreeSelectionFragmentToHyperlinkTiledPagesFragment(noteId=");
        sb.append(this.f104067OooO00o);
        sb.append(", sourceNoteId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f104068OooO0O0, ")");
    }
}
