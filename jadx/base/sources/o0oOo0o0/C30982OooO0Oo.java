package o0oOo0o0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO0o0Oo.C33773Oooooo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oOo0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30982OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f110680OooO00o = new LinkedHashMap();

    public C30982OooO0Oo(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        new ArrayList();
        C33773Oooooo.OooO0O0(0, 0, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public final void OooO00o(String noteId, boolean z, WeakReference<Object> weakReference) {
        ?? arrayList;
        OooOOO0.OooO0oO(noteId, "noteId");
        LinkedHashMap linkedHashMap = this.f110680OooO00o;
        List list = (List) linkedHashMap.get(noteId);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((WeakReference) obj).get() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        if (z) {
            ArrayList arrayListOooOOO = C34429OooOOo0.OooOOO(weakReference);
            arrayListOooOOO.addAll((Collection) arrayList);
            linkedHashMap.put(noteId, arrayListOooOOO);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) arrayList) {
            if (!OooOOO0.OooO0O0(((WeakReference) obj2).get(), weakReference.get())) {
                arrayList2.add(obj2);
            }
        }
        linkedHashMap.put(noteId, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final boolean OooO0O0(String noteId) {
        ?? arrayList;
        OooOOO0.OooO0oO(noteId, "noteId");
        List list = (List) this.f110680OooO00o.get(noteId);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((WeakReference) obj).get() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        return !((Collection) arrayList).isEmpty();
    }
}
