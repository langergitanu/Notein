package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28779o0000oOo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101906OooO00o;

    public C28779o0000oOo(String str) {
        this.f101906OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28779o0000oOo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101906OooO00o, ((C28779o0000oOo) obj).f101906OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_noteTreeSelectionFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("source_note_id", this.f101906OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f101906OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionNoteEditorContainerFragmentToNoteTreeSelectionFragment(sourceNoteId="), this.f101906OooO00o, ")");
    }
}
