package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import androidx.datastore.preferences.protobuf.C21843o00ooo;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21813Oooo00O implements Oooo000 {
    @Override // androidx.datastore.preferences.protobuf.Oooo000
    public final C21805OooOoO.OooO0OO OooO00o(long j, Object obj) {
        C21805OooOoO.OooO0OO oooO0OO = (C21805OooOoO.OooO0OO) C21843o00ooo.f64584OooO0OO.OooO0oo(obj, j);
        if (oooO0OO.isModifiable()) {
            return oooO0OO;
        }
        int size = oooO0OO.size();
        C21805OooOoO.OooO0OO oooO0OOMutableCopyWithCapacity = oooO0OO.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        C21843o00ooo.OooOOOO(obj, j, oooO0OOMutableCopyWithCapacity);
        return oooO0OOMutableCopyWithCapacity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.datastore.preferences.protobuf.OooOoO$OooO0OO, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // androidx.datastore.preferences.protobuf.Oooo000
    public final <E> void OooO0O0(Object obj, Object obj2, long j) {
        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o0 = C21843o00ooo.f64584OooO0OO;
        C21805OooOoO.OooO0OO oooO0OO = (C21805OooOoO.OooO0OO) abstractC21845OooO0o0.OooO0oo(obj, j);
        ?? r6 = (C21805OooOoO.OooO0OO) abstractC21845OooO0o0.OooO0oo(obj2, j);
        int size = oooO0OO.size();
        int size2 = r6.size();
        ?? r1 = oooO0OO;
        r1 = oooO0OO;
        if (size > 0 && size2 > 0) {
            boolean zIsModifiable = oooO0OO.isModifiable();
            ?? MutableCopyWithCapacity = oooO0OO;
            if (!zIsModifiable) {
                MutableCopyWithCapacity = oooO0OO.mutableCopyWithCapacity(size2 + size);
            }
            MutableCopyWithCapacity.addAll(r6);
            r1 = MutableCopyWithCapacity;
        }
        if (size > 0) {
            r6 = r1;
        }
        C21843o00ooo.OooOOOO(obj, j, r6);
    }

    @Override // androidx.datastore.preferences.protobuf.Oooo000
    public final void OooO0OO(Object obj, long j) {
        ((C21805OooOoO.OooO0OO) C21843o00ooo.f64584OooO0OO.OooO0oo(obj, j)).makeImmutable();
    }
}
