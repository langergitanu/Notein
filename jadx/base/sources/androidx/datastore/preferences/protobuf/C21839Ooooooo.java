package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.OooOo00;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21839Ooooooo extends o0OoOo0<OooOo00.OooO00o<Object>, Object> {
    @Override // androidx.datastore.preferences.protobuf.o0OoOo0
    public final void OooO0oO() {
        if (!this.f64594OooOoO0) {
            for (int i = 0; i < this.f64592OooOo0o.size(); i++) {
                OooO0Oo(i).getKey().getClass();
            }
            Iterator it = OooO0o0().iterator();
            while (it.hasNext()) {
                ((OooOo00.OooO00o) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.OooO0oO();
    }

    @Override // androidx.datastore.preferences.protobuf.o0OoOo0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
