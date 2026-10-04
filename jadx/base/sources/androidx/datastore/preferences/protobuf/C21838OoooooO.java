package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import androidx.datastore.preferences.protobuf.OooOo00;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21838OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class<?> f64556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00Oo0<?, ?> f64557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C21840o00o0O f64558OooO0OO;

    static {
        Class<?> cls;
        Class<?> cls2;
        C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
        o00Oo0<?, ?> o00oo02 = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f64556OooO00o = cls;
        try {
            C21834OooooOO c21834OooooOO2 = C21834OooooOO.f64546OooO0OO;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                o00oo02 = (o00Oo0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f64557OooO0O0 = o00oo02;
        f64558OooO0OO = new C21840o00o0O();
    }

    public static int OooO(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Oooo0)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i).longValue());
                i++;
            }
            return iOooOO0;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(oooo0.getLong(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooO00o(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C21806OooOoO0)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i).intValue());
                i++;
            }
            return iOooOO0;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(c21806OooOoO0.getInt(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooO0O0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC21794OooOO0o.OooO0oo(i) + 4) * size;
    }

    public static int OooO0OO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC21794OooOO0o.OooO0oo(i) + 8) * size;
    }

    public static int OooO0Oo(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C21806OooOoO0)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i).intValue());
                i++;
            }
            return iOooOO0;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(c21806OooOoO0.getInt(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooO0o(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C21806OooOoO0)) {
            int iOooO0o0 = 0;
            while (i < size) {
                iOooO0o0 += AbstractC21794OooOO0o.OooO0o0(list.get(i).intValue());
                i++;
            }
            return iOooO0o0;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int iOooO0o02 = 0;
        while (i < size) {
            iOooO0o02 += AbstractC21794OooOO0o.OooO0o0(c21806OooOoO0.getInt(i));
            i++;
        }
        return iOooO0o02;
    }

    public static int OooO0o0(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Oooo0)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i).longValue());
                i++;
            }
            return iOooOO0;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(oooo0.getLong(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooO0oO(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Oooo0)) {
            int iOooO0o = 0;
            while (i < size) {
                iOooO0o += AbstractC21794OooOO0o.OooO0o(list.get(i).longValue());
                i++;
            }
            return iOooO0o;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int iOooO0o2 = 0;
        while (i < size) {
            iOooO0o2 += AbstractC21794OooOO0o.OooO0o(oooo0.getLong(i));
            i++;
        }
        return iOooO0o2;
    }

    public static int OooO0oo(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C21806OooOoO0)) {
            int iOooO = 0;
            while (i < size) {
                iOooO += AbstractC21794OooOO0o.OooO(list.get(i).intValue());
                i++;
            }
            return iOooO;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int iOooO2 = 0;
        while (i < size) {
            iOooO2 += AbstractC21794OooOO0o.OooO(c21806OooOoO0.getInt(i));
            i++;
        }
        return iOooO2;
    }

    public static <UT, UB> UB OooOO0(Object obj, int i, List<Integer> list, C21805OooOoO.OooO0O0 oooO0O0, UB ub, o00Oo0<UT, UB> o00oo02) {
        if (oooO0O0 == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!oooO0O0.OooO00o()) {
                    ub = (UB) OooOOO0(obj, i, iIntValue, ub, o00oo02);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (oooO0O0.OooO00o()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) OooOOO0(obj, i, iIntValue2, ub, o00oo02);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends OooOo00.OooO00o<FT>> void OooOO0O(AbstractC21798OooOOo0<FT> abstractC21798OooOOo0, T t, T t2) {
        OooOo00<T> oooOo00OooO0OO = abstractC21798OooOOo0.OooO0OO(t2);
        if (oooOo00OooO0OO.f64476OooO00o.isEmpty()) {
            return;
        }
        OooOo00<T> oooOo00OooO0Oo = abstractC21798OooOOo0.OooO0Oo(t);
        oooOo00OooO0Oo.getClass();
        C21839Ooooooo c21839Ooooooo = oooOo00OooO0OO.f64476OooO00o;
        if (c21839Ooooooo.f64592OooOo0o.size() > 0) {
            oooOo00OooO0Oo.OooO(c21839Ooooooo.OooO0Oo(0));
            throw null;
        }
        Iterator<T> it = c21839Ooooooo.OooO0o0().iterator();
        if (it.hasNext()) {
            oooOo00OooO0Oo.OooO((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean OooOO0o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void OooOOO(int i, List<Boolean> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof OooO0o;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOOO0(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3++;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOO0o(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        OooO0o oooO0o = (OooO0o) list;
        if (!z) {
            while (i2 < oooO0o.f64413OooOoO0) {
                oooO0o.OooO0OO(i2);
                abstractC21794OooOO0o.OooOOO0(i, oooO0o.f64412OooOo[i2]);
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oooO0o.f64413OooOoO0; i6++) {
            oooO0o.OooO0OO(i6);
            boolean z3 = oooO0o.f64412OooOo[i6];
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5++;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < oooO0o.f64413OooOoO0) {
            oooO0o.OooO0OO(i2);
            abstractC21794OooOO0o.OooOO0o(oooO0o.f64412OooOo[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static <UT, UB> UB OooOOO0(Object obj, int i, int i2, UB ub, o00Oo0<UT, UB> o00oo02) {
        if (ub == null) {
            ub = (UB) o00oo02.OooO0o(obj);
        }
        o00oo02.OooO0o0(ub, i, i2);
        return ub;
    }

    public static void OooOOOO(int i, List<Double> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof OooOOO;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = list.get(i2).doubleValue();
                    abstractC21794OooOO0o.getClass();
                    abstractC21794OooOO0o.OooOOoo(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3 += 8;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOo00(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        OooOOO oooOOO = (OooOOO) list;
        if (!z) {
            while (i2 < oooOOO.f64451OooOoO0) {
                oooOOO.OooO0OO(i2);
                double d = oooOOO.f64450OooOo[i2];
                abstractC21794OooOO0o.getClass();
                abstractC21794OooOO0o.OooOOoo(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oooOOO.f64451OooOoO0; i6++) {
            oooOOO.OooO0OO(i6);
            double d2 = oooOOO.f64450OooOo[i6];
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5 += 8;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < oooOOO.f64451OooOoO0) {
            oooOOO.OooO0OO(i2);
            abstractC21794OooOO0o.OooOo00(Double.doubleToRawLongBits(oooOOO.f64450OooOo[i2]));
            i2++;
        }
    }

    public static void OooOOOo(int i, List<Integer> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21806OooOoO0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOo0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i3).intValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooOO0);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOo0O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        if (!z) {
            while (i2 < c21806OooOoO0.f64485OooOoO0) {
                abstractC21794OooOO0o.OooOo0(i, c21806OooOoO0.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < c21806OooOoO0.f64485OooOoO0; i4++) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(c21806OooOoO0.getInt(i4));
        }
        abstractC21794OooOO0o.OooOooo(iOooOO02);
        while (i2 < c21806OooOoO0.f64485OooOoO0) {
            abstractC21794OooOO0o.OooOo0O(c21806OooOoO0.getInt(i2));
            i2++;
        }
    }

    public static void OooOOo(int i, List<Long> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof Oooo0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOOoo(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3 += 8;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOo00(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        if (!z) {
            while (i2 < oooo0.f64504OooOoO0) {
                abstractC21794OooOO0o.OooOOoo(i, oooo0.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oooo0.f64504OooOoO0; i6++) {
            oooo0.getLong(i6);
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5 += 8;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < oooo0.f64504OooOoO0) {
            abstractC21794OooOO0o.OooOo00(oooo0.getLong(i2));
            i2++;
        }
    }

    public static void OooOOo0(int i, List<Integer> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21806OooOoO0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOOo0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3 += 4;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOOo(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        if (!z) {
            while (i2 < c21806OooOoO0.f64485OooOoO0) {
                abstractC21794OooOO0o.OooOOo0(i, c21806OooOoO0.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c21806OooOoO0.f64485OooOoO0; i6++) {
            c21806OooOoO0.getInt(i6);
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5 += 4;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < c21806OooOoO0.f64485OooOoO0) {
            abstractC21794OooOO0o.OooOOo(c21806OooOoO0.getInt(i2));
            i2++;
        }
    }

    public static void OooOOoo(int i, List<Float> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21803OooOo0O;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = list.get(i2).floatValue();
                    abstractC21794OooOO0o.getClass();
                    abstractC21794OooOO0o.OooOOo0(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3 += 4;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOOo(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        C21803OooOo0O c21803OooOo0O = (C21803OooOo0O) list;
        if (!z) {
            while (i2 < c21803OooOo0O.f64480OooOoO0) {
                c21803OooOo0O.OooO0OO(i2);
                float f = c21803OooOo0O.f64479OooOo[i2];
                abstractC21794OooOO0o.getClass();
                abstractC21794OooOO0o.OooOOo0(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c21803OooOo0O.f64480OooOoO0; i6++) {
            c21803OooOo0O.OooO0OO(i6);
            float f2 = c21803OooOo0O.f64479OooOo[i6];
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5 += 4;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < c21803OooOo0O.f64480OooOoO0) {
            c21803OooOo0O.OooO0OO(i2);
            abstractC21794OooOO0o.OooOOo(Float.floatToRawIntBits(c21803OooOo0O.f64479OooOo[i2]));
            i2++;
        }
    }

    public static void OooOo(int i, List<Integer> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21806OooOoO0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = list.get(i2).intValue();
                    abstractC21794OooOO0o.OooOooO(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooO0o0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooO0o0 += AbstractC21794OooOO0o.OooO0o0(list.get(i3).intValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooO0o0);
            while (i2 < list.size()) {
                int iIntValue2 = list.get(i2).intValue();
                abstractC21794OooOO0o.OooOooo((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        if (!z) {
            while (i2 < c21806OooOoO0.f64485OooOoO0) {
                int i4 = c21806OooOoO0.getInt(i2);
                abstractC21794OooOO0o.OooOooO(i, (i4 >> 31) ^ (i4 << 1));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooO0o02 = 0;
        for (int i5 = 0; i5 < c21806OooOoO0.f64485OooOoO0; i5++) {
            iOooO0o02 += AbstractC21794OooOO0o.OooO0o0(c21806OooOoO0.getInt(i5));
        }
        abstractC21794OooOO0o.OooOooo(iOooO0o02);
        while (i2 < c21806OooOoO0.f64485OooOoO0) {
            int i6 = c21806OooOoO0.getInt(i2);
            abstractC21794OooOO0o.OooOooo((i6 >> 31) ^ (i6 << 1));
            i2++;
        }
    }

    public static void OooOo0(int i, List<Long> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof Oooo0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.Oooo000(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i3).longValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooOO0);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.Oooo00O(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        if (!z) {
            while (i2 < oooo0.f64504OooOoO0) {
                abstractC21794OooOO0o.Oooo000(i, oooo0.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oooo0.f64504OooOoO0; i4++) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(oooo0.getLong(i4));
        }
        abstractC21794OooOO0o.OooOooo(iOooOO02);
        while (i2 < oooo0.f64504OooOoO0) {
            abstractC21794OooOO0o.Oooo00O(oooo0.getLong(i2));
            i2++;
        }
    }

    public static void OooOo00(int i, List<Integer> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21806OooOoO0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOo0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i3).intValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooOO0);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOo0O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        if (!z) {
            while (i2 < c21806OooOoO0.f64485OooOoO0) {
                abstractC21794OooOO0o.OooOo0(i, c21806OooOoO0.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < c21806OooOoO0.f64485OooOoO0; i4++) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(c21806OooOoO0.getInt(i4));
        }
        abstractC21794OooOO0o.OooOooo(iOooOO02);
        while (i2 < c21806OooOoO0.f64485OooOoO0) {
            abstractC21794OooOO0o.OooOo0O(c21806OooOoO0.getInt(i2));
            i2++;
        }
    }

    public static void OooOo0O(int i, List<Integer> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21806OooOoO0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOOo0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3 += 4;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOOo(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        if (!z) {
            while (i2 < c21806OooOoO0.f64485OooOoO0) {
                abstractC21794OooOO0o.OooOOo0(i, c21806OooOoO0.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c21806OooOoO0.f64485OooOoO0; i6++) {
            c21806OooOoO0.getInt(i6);
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5 += 4;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < c21806OooOoO0.f64485OooOoO0) {
            abstractC21794OooOO0o.OooOOo(c21806OooOoO0.getInt(i2));
            i2++;
        }
    }

    public static void OooOo0o(int i, List<Long> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof Oooo0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOOoo(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                i3 += 8;
            }
            abstractC21794OooOO0o.OooOooo(i3);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOo00(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        if (!z) {
            while (i2 < oooo0.f64504OooOoO0) {
                abstractC21794OooOO0o.OooOOoo(i, oooo0.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oooo0.f64504OooOoO0; i6++) {
            oooo0.getLong(i6);
            Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
            i5 += 8;
        }
        abstractC21794OooOO0o.OooOooo(i5);
        while (i2 < oooo0.f64504OooOoO0) {
            abstractC21794OooOO0o.OooOo00(oooo0.getLong(i2));
            i2++;
        }
    }

    public static void OooOoO(int i, List<Integer> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof C21806OooOoO0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.OooOooO(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooO += AbstractC21794OooOO0o.OooO(list.get(i3).intValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooO);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.OooOooo(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        if (!z) {
            while (i2 < c21806OooOoO0.f64485OooOoO0) {
                abstractC21794OooOO0o.OooOooO(i, c21806OooOoO0.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooO2 = 0;
        for (int i4 = 0; i4 < c21806OooOoO0.f64485OooOoO0; i4++) {
            iOooO2 += AbstractC21794OooOO0o.OooO(c21806OooOoO0.getInt(i4));
        }
        abstractC21794OooOO0o.OooOooo(iOooO2);
        while (i2 < c21806OooOoO0.f64485OooOoO0) {
            abstractC21794OooOO0o.OooOooo(c21806OooOoO0.getInt(i2));
            i2++;
        }
    }

    public static void OooOoO0(int i, List<Long> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof Oooo0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = list.get(i2).longValue();
                    abstractC21794OooOO0o.Oooo000(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooO0o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooO0o += AbstractC21794OooOO0o.OooO0o(list.get(i3).longValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooO0o);
            while (i2 < list.size()) {
                long jLongValue2 = list.get(i2).longValue();
                abstractC21794OooOO0o.Oooo00O((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        if (!z) {
            while (i2 < oooo0.f64504OooOoO0) {
                long j = oooo0.getLong(i2);
                abstractC21794OooOO0o.Oooo000(i, (j >> 63) ^ (j << 1));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooO0o2 = 0;
        for (int i4 = 0; i4 < oooo0.f64504OooOoO0; i4++) {
            iOooO0o2 += AbstractC21794OooOO0o.OooO0o(oooo0.getLong(i4));
        }
        abstractC21794OooOO0o.OooOooo(iOooO0o2);
        while (i2 < oooo0.f64504OooOoO0) {
            long j2 = oooo0.getLong(i2);
            abstractC21794OooOO0o.Oooo00O((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
    }

    public static void OooOoOO(int i, List<Long> list, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
        oooOOO0.getClass();
        boolean z2 = list instanceof Oooo0;
        AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC21794OooOO0o.Oooo000(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            abstractC21794OooOO0o.OooOoo(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += AbstractC21794OooOO0o.OooOO0(list.get(i3).longValue());
            }
            abstractC21794OooOO0o.OooOooo(iOooOO0);
            while (i2 < list.size()) {
                abstractC21794OooOO0o.Oooo00O(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        if (!z) {
            while (i2 < oooo0.f64504OooOoO0) {
                abstractC21794OooOO0o.Oooo000(i, oooo0.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC21794OooOO0o.OooOoo(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oooo0.f64504OooOoO0; i4++) {
            iOooOO02 += AbstractC21794OooOO0o.OooOO0(oooo0.getLong(i4));
        }
        abstractC21794OooOO0o.OooOooo(iOooOO02);
        while (i2 < oooo0.f64504OooOoO0) {
            abstractC21794OooOO0o.Oooo00O(oooo0.getLong(i2));
            i2++;
        }
    }
}
