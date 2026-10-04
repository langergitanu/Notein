package o0o00oo;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.billingclient.api.C22172OooOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteVO f107254OooO00o;

    public Oooo0(NoteVO noteVO) {
        this.f107254OooO00o = noteVO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        oooo0.getClass();
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107254OooO00o, oooo0.f107254OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteListContainerFragment_to_searchListContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundleOooO00o = C22172OooOoO.OooO00o("topFolder", "desktop");
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(NoteVO.class);
        Parcelable parcelable = this.f107254OooO00o;
        if (zIsAssignableFrom) {
            bundleOooO00o.putParcelable("currFolder", parcelable);
            return bundleOooO00o;
        }
        if (Serializable.class.isAssignableFrom(NoteVO.class)) {
            bundleOooO00o.putSerializable("currFolder", (Serializable) parcelable);
        }
        return bundleOooO00o;
    }

    public final int hashCode() {
        NoteVO noteVO = this.f107254OooO00o;
        return 1025667940 + (noteVO == null ? 0 : noteVO.hashCode());
    }

    public final String toString() {
        return "ActionNoteListContainerFragmentToSearchListContainerFragment(topFolder=desktop, currFolder=" + this.f107254OooO00o + ")";
    }
}
