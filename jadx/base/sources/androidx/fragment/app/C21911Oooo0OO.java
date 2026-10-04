package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.o00Oo0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21911Oooo0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f65037OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f65042OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap<String, Fragment> f65039OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, C21911Oooo0OO> f65041OooO0o0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap<String, C22021o00o0O> f65040OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f65043OooO0oo = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f65038OooO = false;

    /* JADX INFO: renamed from: androidx.fragment.app.Oooo0OO$OooO00o */
    public class OooO00o implements o00Oo0.OooO0O0 {
        @Override // androidx.lifecycle.o00Oo0.OooO0O0
        public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
            return new C21911Oooo0OO(true);
        }
    }

    public C21911Oooo0OO(boolean z) {
        this.f65042OooO0oO = z;
    }

    public final void OooO(Fragment fragment) {
        if (this.f65038OooO) {
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f65039OooO0Oo.remove(fragment.mWho) == null || !FragmentManager.Oooo0o(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f65043OooO0oo = true;
    }

    public final void OooO0o(Fragment fragment, boolean z) {
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        OooO0oo(fragment.mWho, z);
    }

    public final void OooO0o0(Fragment fragment) {
        if (this.f65038OooO) {
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, Fragment> map = this.f65039OooO0Oo;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void OooO0oO(String str, boolean z) {
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        OooO0oo(str, z);
    }

    public final void OooO0oo(String str, boolean z) {
        HashMap<String, C21911Oooo0OO> map = this.f65041OooO0o0;
        C21911Oooo0OO c21911Oooo0OO = map.get(str);
        if (c21911Oooo0OO != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c21911Oooo0OO.f65041OooO0o0.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c21911Oooo0OO.OooO0oO((String) it.next(), true);
                }
            }
            c21911Oooo0OO.OooO0OO();
            map.remove(str);
        }
        HashMap<String, C22021o00o0O> map2 = this.f65040OooO0o;
        C22021o00o0O c22021o00o0O = map2.get(str);
        if (c22021o00o0O != null) {
            c22021o00o0O.OooO00o();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21911Oooo0OO.class == obj.getClass()) {
            C21911Oooo0OO c21911Oooo0OO = (C21911Oooo0OO) obj;
            if (this.f65039OooO0Oo.equals(c21911Oooo0OO.f65039OooO0Oo) && this.f65041OooO0o0.equals(c21911Oooo0OO.f65041OooO0o0) && this.f65040OooO0o.equals(c21911Oooo0OO.f65040OooO0o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f65040OooO0o.hashCode() + ((this.f65041OooO0o0.hashCode() + (this.f65039OooO0Oo.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f65039OooO0Oo.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f65041OooO0o0.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f65040OooO0o.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
