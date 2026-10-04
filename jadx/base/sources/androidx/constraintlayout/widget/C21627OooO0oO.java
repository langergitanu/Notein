package androidx.constraintlayout.widget;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21627OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<OooO00o>>> f64154OooO00o;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0oO$OooO00o */
    public interface OooO00o {
    }

    public final void OooO00o(int i, OooO00o oooO00o) {
        HashMap<Integer, HashSet<WeakReference<OooO00o>>> map = this.f64154OooO00o;
        HashSet<WeakReference<OooO00o>> hashSet = map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(oooO00o));
    }
}
