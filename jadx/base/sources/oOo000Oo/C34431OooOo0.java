package oOo000Oo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oOo000Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34431OooOo0 extends OooOo00 {
    public static void OooOo(Collection collection, Object[] elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        collection.addAll(Oooo.OooO0OO.OooO0Oo(elements));
    }

    public static final int OooOo0(C34446Oooo0o c34446Oooo0o, int i) {
        if (i >= 0 && i <= C34429OooOOo0.OooOO0O(c34446Oooo0o)) {
            return C34429OooOOo0.OooOO0O(c34446Oooo0o) - i;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Element index ", " must be in range [");
        sbOooO0OO.append(new oO0O00oo.OooO(0, C34429OooOOo0.OooOO0O(c34446Oooo0o), 1));
        sbOooO0OO.append("].");
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }

    public static final int OooOo0O(C34446Oooo0o c34446Oooo0o, int i) {
        if (i >= 0 && i <= c34446Oooo0o.size()) {
            return c34446Oooo0o.size() - i;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Position index ", " must be in range [");
        sbOooO0OO.append(new oO0O00oo.OooO(0, c34446Oooo0o.size(), 1));
        sbOooO0OO.append("].");
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }

    public static void OooOo0o(Collection collection, Iterable elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean OooOoO(Iterable iterable, InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC32507OooOO0o.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final Collection OooOoO0(Iterable iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : OooOo.o0ooOO0(iterable);
    }

    public static void OooOoOO(List list, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        int iOooOO0O;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof oO0O00.OooO00o) && !(list instanceof oO0O00.OooO0O0)) {
                C24039Oooo0o0.OooO0oo(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                OooOoO(list, interfaceC32507OooOO0o, true);
                return;
            } catch (ClassCastException e) {
                kotlin.jvm.internal.OooOOO0.OooOO0o(C24039Oooo0o0.class.getName(), e);
                throw e;
            }
        }
        int iOooOO0O2 = C34429OooOOo0.OooOO0O(list);
        int i = 0;
        if (iOooOO0O2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) interfaceC32507OooOO0o.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iOooOO0O2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iOooOO0O = C34429OooOOo0.OooOO0O(list))) {
            return;
        }
        while (true) {
            list.remove(iOooOO0O);
            if (iOooOO0O == i) {
                return;
            } else {
                iOooOO0O--;
            }
        }
    }

    public static void OooOoo(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static Object OooOoo0(List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C34429OooOOo0.OooOO0O(list));
    }

    public static void OooOooO(List list, Comparator comparator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
