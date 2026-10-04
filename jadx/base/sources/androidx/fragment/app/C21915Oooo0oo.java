package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21915Oooo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<Fragment> f65050OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<String, C21914Oooo0oO> f65051OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, Bundle> f65052OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C21911Oooo0OO f65053OooO0Oo;

    public final Bundle OooO(Bundle bundle, String str) {
        HashMap<String, Bundle> map = this.f65052OooO0OO;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }

    public final void OooO00o(Fragment fragment) {
        if (this.f65050OooO00o.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f65050OooO00o) {
            this.f65050OooO00o.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment OooO0O0(String str) {
        C21914Oooo0oO c21914Oooo0oO = this.f65051OooO0O0.get(str);
        if (c21914Oooo0oO != null) {
            return c21914Oooo0oO.f65046OooO0OO;
        }
        return null;
    }

    public final Fragment OooO0OO(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C21914Oooo0oO c21914Oooo0oO : this.f65051OooO0O0.values()) {
            if (c21914Oooo0oO != null && (fragmentFindFragmentByWho = c21914Oooo0oO.f65046OooO0OO.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        for (C21914Oooo0oO c21914Oooo0oO : this.f65051OooO0O0.values()) {
            if (c21914Oooo0oO != null) {
                arrayList.add(c21914Oooo0oO);
            }
        }
        return arrayList;
    }

    public final List<Fragment> OooO0o() {
        ArrayList arrayList;
        if (this.f65050OooO00o.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f65050OooO00o) {
            arrayList = new ArrayList(this.f65050OooO00o);
        }
        return arrayList;
    }

    public final ArrayList OooO0o0() {
        ArrayList arrayList = new ArrayList();
        for (C21914Oooo0oO c21914Oooo0oO : this.f65051OooO0O0.values()) {
            if (c21914Oooo0oO != null) {
                arrayList.add(c21914Oooo0oO.f65046OooO0OO);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final void OooO0oO(C21914Oooo0oO c21914Oooo0oO) {
        Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
        String str = fragment.mWho;
        HashMap<String, C21914Oooo0oO> map = this.f65051OooO0O0;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, c21914Oooo0oO);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f65053OooO0Oo.OooO0o0(fragment);
            } else {
                this.f65053OooO0Oo.OooO(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void OooO0oo(C21914Oooo0oO c21914Oooo0oO) {
        Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
        if (fragment.mRetainInstance) {
            this.f65053OooO0Oo.OooO(fragment);
        }
        HashMap<String, C21914Oooo0oO> map = this.f65051OooO0O0;
        if (map.get(fragment.mWho) == c21914Oooo0oO && map.put(fragment.mWho, null) != null && FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }
}
