package oO0o0O00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.OooOOO0;
import oO0Oo0o0.OooOO0;
import oO0o0O0.C33557OooO0OO;

/* JADX INFO: renamed from: oO0o0O00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33560OooO00o {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> OooO00o(Collection<? extends T> collection, Collection<? extends T> collection2) {
        OooOOO0.OooO0oO(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final C33557OooO0OO OooO0O0(ArrayList arrayList) {
        C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
        for (Object obj : arrayList) {
            OooOO0 oooOO02 = (OooOO0) obj;
            if (oooOO02 != null && oooOO02 != OooOO0.OooO0O0.f120222OooO0O0) {
                c33557OooO0OO.add(obj);
            }
        }
        return c33557OooO0OO;
    }
}
