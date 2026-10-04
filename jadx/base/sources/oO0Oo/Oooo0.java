package oO0Oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f120098OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f120099OooO0O0;

    public Oooo0(String sessionId, String suggestedName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionId, "sessionId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(suggestedName, "suggestedName");
        this.f120098OooO00o = sessionId;
        this.f120099OooO0O0 = suggestedName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120098OooO00o, oooo0.f120098OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120099OooO0O0, oooo0.f120099OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_textRecognizeFragment_to_sessionRenameDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f120098OooO00o);
        bundle.putString("suggested_name", this.f120099OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f120099OooO0O0.hashCode() + (this.f120098OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionTextRecognizeFragmentToSessionRenameDialogFragment(sessionId=");
        sb.append(this.f120098OooO00o);
        sb.append(", suggestedName=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f120099OooO0O0, ")");
    }
}
