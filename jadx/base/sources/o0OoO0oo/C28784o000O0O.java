package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o000O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28784o000O0O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101922OooO00o;

    public C28784o000O0O(String str) {
        this.f101922OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28784o000O0O) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101922OooO00o, ((C28784o000O0O) obj).f101922OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_translateDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("text", this.f101922OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f101922OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionNoteEditorContainerFragmentToTranslateDialogFragment(text="), this.f101922OooO00o, ")");
    }
}
