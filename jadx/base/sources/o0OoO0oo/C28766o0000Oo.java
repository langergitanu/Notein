package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28766o0000Oo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101868OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101869OooO0O0;

    public C28766o0000Oo(String name, String id) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        this.f101868OooO00o = name;
        this.f101869OooO0O0 = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28766o0000Oo)) {
            return false;
        }
        C28766o0000Oo c28766o0000Oo = (C28766o0000Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101868OooO00o, c28766o0000Oo.f101868OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101869OooO0O0, c28766o0000Oo.f101869OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57951xba667f63;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f101868OooO00o);
        bundle.putString("id", this.f101869OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101869OooO0O0.hashCode() + (this.f101868OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToColorSetRenameDialogFragment(name=");
        sb.append(this.f101868OooO00o);
        sb.append(", id=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101869OooO0O0, ")");
    }
}
