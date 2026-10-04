package o0OoO0oo;

import android.os.Bundle;
import com.aspose.slides.C22205OooOOo;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28762o0000OO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101858OooO00o;

    public C28762o0000OO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28762o0000OO)) {
            return false;
        }
        ((C28762o0000OO) obj).getClass();
        return true;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f101858OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        return C22205OooOOo.OooO0O0("create_blank_note", false);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    public final String toString() {
        return "ActionEditorToHome(createBlankNote=false)";
    }

    public C28762o0000OO(int i) {
        this.f101858OooO00o = R.id.action_editor_to_home;
    }
}
