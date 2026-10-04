package oOo00OO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oOo00OO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34479OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0<T> f123543OooO00o;

    /* JADX INFO: renamed from: oOo00OO0.OooO0OO$OooO00o */
    public static final class OooO00o {
        public static C34479OooO0OO OooO00o(List from, InterfaceC32507OooOO0o length, InterfaceC32508OooOOOo charAt) {
            T t;
            OooOOO0.OooO0oO(from, "from");
            OooOOO0.OooO0oO(length, "length");
            OooOOO0.OooO0oO(charAt, "charAt");
            List list = from;
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) length.invoke(next);
                    do {
                        T next2 = it.next();
                        Comparable comparable2 = (Comparable) length.invoke(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                t = next;
            } else {
                t = null;
            }
            if (t == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            ((Number) length.invoke(t)).intValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Number) length.invoke(it2.next())).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            OooO0O0(arrayList, from, 0, length, charAt);
            arrayList.trimToSize();
            return new C34479OooO0OO(new OooO0O0((char) 0, C34434OooOoO.f123453OooOo0o, arrayList));
        }

        public static void OooO0O0(ArrayList arrayList, List list, int i, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list) {
                Character ch = (Character) interfaceC32508OooOOOo.invoke(t, Integer.valueOf(i));
                ch.getClass();
                Object arrayList2 = linkedHashMap.get(ch);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(ch, arrayList2);
                }
                ((List) arrayList2).add(t);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list2 = (List) entry.getValue();
                int i2 = i + 1;
                ArrayList arrayList3 = new ArrayList();
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList();
                for (T t2 : list3) {
                    if (((Number) interfaceC32507OooOO0o.invoke(t2)).intValue() > i2) {
                        arrayList4.add(t2);
                    }
                }
                OooO0O0(arrayList3, arrayList4, i2, interfaceC32507OooOO0o, interfaceC32508OooOOOo);
                arrayList3.trimToSize();
                ArrayList arrayList5 = new ArrayList();
                for (T t3 : list3) {
                    if (((Number) interfaceC32507OooOO0o.invoke(t3)).intValue() == i2) {
                        arrayList5.add(t3);
                    }
                }
                arrayList.add(new OooO0O0(cCharValue, arrayList5, arrayList3));
            }
        }
    }

    /* JADX INFO: renamed from: oOo00OO0.OooO0OO$OooO0O0 */
    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final char f123544OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f123545OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f123546OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0<T>[] f123547OooO0Oo;

        public OooO0O0(char c, List list, ArrayList arrayList) {
            this.f123544OooO00o = c;
            this.f123545OooO0O0 = list;
            this.f123546OooO0OO = arrayList;
            OooO0O0<T>[] oooO0O0Arr = new OooO0O0[256];
            for (int i = 0; i < 256; i++) {
                Iterator<T> it = this.f123546OooO0OO.iterator();
                OooO0O0<T> oooO0O0 = null;
                boolean z = false;
                OooO0O0<T> oooO0O02 = null;
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (((OooO0O0) next).f123544OooO00o == i) {
                            if (z) {
                                break;
                            }
                            z = true;
                            oooO0O02 = next;
                        }
                    } else if (z) {
                        oooO0O0 = oooO0O02;
                    }
                }
                oooO0O0Arr[i] = oooO0O0;
            }
            this.f123547OooO0Oo = oooO0O0Arr;
        }
    }

    public C34479OooO0OO(OooO0O0<T> oooO0O0) {
        this.f123543OooO00o = oooO0O0;
    }

    public static /* synthetic */ List OooO0O0(C34479OooO0OO c34479OooO0OO, CharSequence charSequence, int i, int i2, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return c34479OooO0OO.OooO00o(charSequence, i, i2, (i3 & 8) == 0, interfaceC32508OooOOOo);
    }

    public final List<T> OooO00o(CharSequence sequence, int i, int i2, boolean z, InterfaceC32508OooOOOo<? super Character, ? super Integer, Boolean> stopPredicate) {
        OooOOO0.OooO0oO(sequence, "sequence");
        OooOOO0.OooO0oO(stopPredicate, "stopPredicate");
        if (sequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        OooO0O0<T> oooO0O0 = this.f123543OooO00o;
        while (i < i2) {
            char cCharAt = sequence.charAt(i);
            if (stopPredicate.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt)).booleanValue()) {
                break;
            }
            OooO0O0<T>[] oooO0O0Arr = oooO0O0.f123547OooO0Oo;
            OooO0O0<T> oooO0O02 = oooO0O0Arr[cCharAt];
            if (oooO0O02 == null) {
                oooO0O0 = z ? oooO0O0Arr[Character.toLowerCase(cCharAt)] : null;
                if (oooO0O0 == null) {
                    return C34434OooOoO.f123453OooOo0o;
                }
            } else {
                oooO0O0 = oooO0O02;
            }
            i++;
        }
        return (List<T>) oooO0O0.f123545OooO0O0;
    }
}
