package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28768o0000OoO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101870OooO00o;

    public C28768o0000OoO(String str) {
        this.f101870OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28768o0000OoO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101870OooO00o, ((C28768o0000OoO) obj).f101870OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57952x51cf6818;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("commentId", this.f101870OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f101870OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionNoteEditorContainerFragmentToCommentDeleteAlertDialogFragment(commentId="), this.f101870OooO00o, ")");
    }
}
