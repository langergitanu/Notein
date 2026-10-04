package androidx.coordinatorlayout.widget;

import OooOo.C20493Oooo00o;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Pools.SimplePool f64194OooO00o = new Pools.SimplePool(10);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C20493Oooo00o<T, ArrayList<T>> f64195OooO0O0 = new C20493Oooo00o<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<T> f64196OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet<T> f64197OooO0Oo = new HashSet<>();

    public final void OooO00o(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f64195OooO0O0.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                OooO00o(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
