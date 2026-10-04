package oO0o0000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends ArrayList<OooOO0> implements OooO {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof OooOO0) {
            return super.contains((OooOO0) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof OooOO0) {
            return super.indexOf((OooOO0) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof OooOO0) {
            return super.lastIndexOf((OooOO0) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof OooOO0) {
            return super.remove((OooOO0) obj);
        }
        return false;
    }
}
