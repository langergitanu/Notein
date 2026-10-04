package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28777o0000oO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101902OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101903OooO0O0;

    public C28777o0000oO0(int i, String str) {
        this.f101902OooO00o = i;
        this.f101903OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28777o0000oO0)) {
            return false;
        }
        C28777o0000oO0 c28777o0000oO0 = (C28777o0000oO0) obj;
        return this.f101902OooO00o == c28777o0000oO0.f101902OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101903OooO0O0, c28777o0000oO0.f101903OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_newCommentDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("pageIndex", this.f101902OooO00o);
        bundle.putString("pageId", this.f101903OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101903OooO0O0.hashCode() + (Integer.hashCode(this.f101902OooO00o) * 31);
    }

    public final String toString() {
        return "ActionNoteEditorContainerFragmentToNewCommentDialogFragment(pageIndex=" + this.f101902OooO00o + ", pageId=" + this.f101903OooO0O0 + ")";
    }
}
