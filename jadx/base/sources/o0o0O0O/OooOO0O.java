package o0o0O0O;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.billingclient.api.C22172OooOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import o000o0O0.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements OooOo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        ((OooOO0O) obj).getClass();
        return true;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_recentListFragment_to_searchListContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundleOooO00o = C22172OooOoO.OooO00o("topFolder", "recent");
        if (Parcelable.class.isAssignableFrom(NoteVO.class)) {
            bundleOooO00o.putParcelable("currFolder", null);
            return bundleOooO00o;
        }
        if (Serializable.class.isAssignableFrom(NoteVO.class)) {
            bundleOooO00o.putSerializable("currFolder", null);
        }
        return bundleOooO00o;
    }

    public final int hashCode() {
        return 1082295557;
    }

    public final String toString() {
        return "ActionRecentListFragmentToSearchListContainerFragment(topFolder=recent, currFolder=null)";
    }
}
