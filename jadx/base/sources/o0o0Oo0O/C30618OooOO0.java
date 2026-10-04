package o0o0Oo0O;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0Oo0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30618OooOO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f109560OooO00o;

    public C30618OooOO0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30618OooOO0)) {
            return false;
        }
        ((C30618OooOO0) obj).getClass();
        return true;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f109560OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("sync_flavor", 0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "ActionGlobalSettingsFragmentToCloudSyncFragment(syncFlavor=0)";
    }

    public C30618OooOO0(int i) {
        this.f109560OooO00o = R.id.action_globalSettingsFragment_to_cloudSyncFragment;
    }
}
