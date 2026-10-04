package o0OoO0oo;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o000O0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28785o000O0o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101926OooO00o;

    public C28785o000O0o(int i) {
        this.f101926OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28785o000O0o) {
            return this.f101926OooO00o == ((C28785o000O0o) obj).f101926OooO00o;
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57957x207cdf29;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("currentAngle", this.f101926OooO00o);
        bundle.putInt("minAngle", 0);
        bundle.putInt("maxAngle", 179);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(179) + C20785Oooo00o.OooO00o(0, Integer.hashCode(this.f101926OooO00o) * 31, 31);
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(", minAngle=0, maxAngle=179)", this.f101926OooO00o, new StringBuilder("ActionNoteEditorContainerFragmentToSetRulerAngleDialogFragment(currentAngle="));
    }
}
