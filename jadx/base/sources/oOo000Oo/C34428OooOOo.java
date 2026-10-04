package oOo000Oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: oOo000Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34428OooOOo extends C34429OooOOo0 {
    public static <T> int OooOOoo(Iterable<? extends T> iterable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList OooOo00(Iterable iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
