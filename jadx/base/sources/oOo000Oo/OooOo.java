package oOo000Oo;

import Oooo0oO.o0Oo0oo;
import OoooOOo.C21197OooOO0O;
import io.ktor.utils.p616io.C23988OooooOO;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public class OooOo extends C34431OooOo0 {
    public static C34433OooOo0o OooOooo(Iterable iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return new C34433OooOo0o(iterable);
    }

    public static <T> T Oooo(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> List<T> Oooo0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return o0ooOO0(o0Oo0oo(iterable));
    }

    public static double Oooo000(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                C34429OooOOo0.OooOOo0();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static ArrayList Oooo00O(Iterable iterable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return oo0o0Oo(i, i, iterable);
    }

    public static <T> boolean Oooo00o(Iterable<? extends T> iterable, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : OoooO0(iterable, t) >= 0;
    }

    public static List Oooo0O0(Iterable iterable) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return C34434OooOoO.f123453OooOo0o;
            }
            if (size == 1) {
                return com.facebook.soloader.OooOo.OooO0oO(OoooOOO(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(list.get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= 1) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return C34429OooOOo0.OooOOOO(arrayList);
    }

    public static List Oooo0OO(List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return o00Oo0(list2, size);
    }

    public static <T> T Oooo0o(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) Oooo0oO((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> List<T> Oooo0o0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> T Oooo0oO(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T Oooo0oo(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final void OoooO(Iterable iterable, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, CharSequence charSequence, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(separator, "separator");
        kotlin.jvm.internal.OooOOO0.OooO0oO(prefix, "prefix");
        kotlin.jvm.internal.OooOOO0.OooO0oO(postfix, "postfix");
        buffer.append(prefix);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                buffer.append(separator);
            }
            C23988OooooOO.OooO00o(buffer, obj, interfaceC32507OooOO0o);
        }
        buffer.append(postfix);
    }

    public static <T> int OoooO0(Iterable<? extends T> iterable, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Object OoooO00(int i, List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> Set<T> OoooO0O(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        Set<T> setO0Oo0oo = o0Oo0oo(iterable);
        setO0Oo0oo.retainAll(C34431OooOo0.OooOoO0(other));
        return setO0Oo0oo;
    }

    public static /* synthetic */ void OoooOO0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            interfaceC32507OooOO0o = null;
        }
        OoooO(iterable, sb, str4, str5, str6, "...", interfaceC32507OooOO0o);
    }

    public static <T> T OoooOOO(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) OoooOOo((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T OoooOOo(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C34429OooOOo0.OooOO0O(list));
    }

    public static <T> T OoooOo0(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) OooO0O0.OooO00o.OooO00o(1, list);
    }

    public static Comparable OoooOoO(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList OoooOoo(Iterable iterable, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.OooOOO0.OooO0O0(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> Ooooo00(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Collection collectionOooOoO0 = C34431OooOo0.OooOoO0(elements);
        if (collectionOooOoO0.isEmpty()) {
            return o0ooOO0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collectionOooOoO0.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static ArrayList Ooooo0o(Iterable iterable, Iterable iterable2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof Collection) {
            return OooooOO((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C34431OooOo0.OooOo0o(arrayList, iterable);
        C34431OooOo0.OooOo0o(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList OooooO0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return OooooOo((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        C34431OooOo0.OooOo0o(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList OooooOO(Collection collection, Iterable elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C34431OooOo0.OooOo0o(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList OooooOo(Collection collection, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static <T> T Oooooo(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) OoooooO((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> List<T> Oooooo0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return o0ooOO0(iterable);
        }
        List<T> listO0OOO0o = o0OOO0o(iterable);
        Collections.reverse(listO0OOO0o);
        return listO0OOO0o;
    }

    public static <T> T OoooooO(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T Ooooooo(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> List<C32443OooOOO<T, T>> o000000(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(new C32443OooOOO(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static ArrayList o000OOo(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C34428OooOOo.OooOOoo(iterable, 10), C34428OooOOo.OooOOoo(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C32443OooOOO(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static String o000oOoO(Iterable iterable, String str, String str2, String str3, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC32507OooOO0o = null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        OoooO(iterable, sb, str4, prefix, str5, "...", interfaceC32507OooOO0o);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> o00O0O(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listO0OOO0o = o0OOO0o(iterable);
            C34431OooOo0.OooOooO(listO0OOO0o, comparator);
            return listO0OOO0o;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return o0ooOO0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Oooo.OooO0OO.OooO0Oo(array);
    }

    public static <T> List<T> o00Oo0(Iterable<? extends T> iterable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return o0ooOO0(iterable);
            }
            if (i == 1) {
                return com.facebook.soloader.OooOo.OooO0oO(Oooo0o(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return C34429OooOOo0.OooOOOO(arrayList);
    }

    public static List o00Ooo(int i, List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        int size = list.size();
        if (i >= size) {
            return o0ooOO0(list);
        }
        if (i == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(OoooOOo(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] o00o0O(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static int[] o00oO0O(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static <T> HashSet<T> o00oO0o(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        HashSet<T> hashSet = new HashSet<>(Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 12)));
        o00ooo(iterable, hashSet);
        return hashSet;
    }

    public static final void o00ooo(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static C34439OooOooO o0O0O00(final Iterable iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        return new C34439OooOooO(new oO0O000o.OooO00o() { // from class: oOo000Oo.OooOo0O
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    public static <T> Set<T> o0OO00O(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return C34449Oooo0oo.OooOO0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(Oooo0.OooO0Oo(collection.size()));
                o00ooo(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            o00ooo(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : C34449Oooo0oo.OooOO0(linkedHashSet2.iterator().next());
            }
        }
        return c34438OooOoo0;
    }

    public static final <T> List<T> o0OOO0o(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof Collection) {
            return o0ooOoO((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        o00ooo(iterable, arrayList);
        return arrayList;
    }

    public static <T> Set<T> o0Oo0oo(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o00ooo(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> T o0OoOo0(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> o0ooOO0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C34429OooOOo0.OooOOOO(o0OOO0o(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (size != 1) {
            return o0ooOoO(collection);
        }
        return com.facebook.soloader.OooOo.OooO0oO(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] o0ooOOo(Collection<Long> collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList o0ooOoO(Collection collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        return new ArrayList(collection);
    }

    public static float[] oo000o(Collection<Float> collection) {
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static ArrayList oo0o0Oo(int i, int i2, Iterable iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        C21197OooOO0O.OooO0O0(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.OooOOO0.OooO0oO(iterator, "iterator");
            Iterator itOooO0o0 = !iterator.hasNext() ? C34435OooOoO0.f123454OooOo0o : OooO0O0.OooO0O0.OooO0o0(new C34441Oooo(i, i2, iterator, null));
            while (itOooO0o0.hasNext()) {
                arrayList.add((List) itOooO0o0.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static <T extends Comparable<? super T>> List<T> ooOO(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listO0OOO0o = o0OOO0o(iterable);
            C34431OooOo0.OooOoo(listO0OOO0o);
            return listO0OOO0o;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return o0ooOO0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.OooOOO0.OooO0oO(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Oooo.OooO0OO.OooO0Oo(array);
    }
}
