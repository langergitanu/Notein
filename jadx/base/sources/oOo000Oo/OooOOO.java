package oOo000Oo;

import io.ktor.utils.p616io.C23988OooooOO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33565OooO0Oo;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public class OooOOO extends Oooo.OooO0OO {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class OooO00o<T> implements Iterable<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object[] f123448OooOo0o;

        public OooO00o(Object[] objArr) {
            this.f123448OooOo0o = objArr;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return kotlin.jvm.internal.OooO0OO.OooO0O0(this.f123448OooOo0o);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class OooO0O0<T> implements InterfaceC33569OooO0oo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Object[] f123449OooO00o;

        public OooO0O0(Object[] objArr) {
            this.f123449OooO00o = objArr;
        }

        @Override // oO0o0O0O.InterfaceC33569OooO0oo
        public final Iterator<T> iterator() {
            return kotlin.jvm.internal.OooO0OO.OooO0O0(this.f123449OooO00o);
        }
    }

    public static <T> InterfaceC33569OooO0oo<T> OooOo(T[] tArr) {
        return tArr.length == 0 ? C33565OooO0Oo.f121193OooO00o : new OooO0O0(tArr);
    }

    public static <T> Iterable<T> OooOo0o(T[] tArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        return tArr.length == 0 ? C34434OooOoO.f123453OooOo0o : new OooO00o(tArr);
    }

    public static ArrayList OooOoO(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> boolean OooOoO0(T[] tArr, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        return Oooo000(tArr, t) >= 0;
    }

    public static float OooOoOO(float[] fArr) {
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T OooOoo(T[] tArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static <T> T OooOoo0(T[] tArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Integer OooOooO(int[] iArr, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object OooOooo(int i, Object[] objArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static final void Oooo(Object[] objArr, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static String Oooo0(float[] fArr, com.orion.notein.data.repo.transactions.OooO00o oooO00o, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            oooO00o = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ",");
            }
            if (oooO00o != null) {
                sb.append((CharSequence) oooO00o.invoke(Float.valueOf(f)));
            } else {
                sb.append((CharSequence) String.valueOf(f));
            }
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static <T> int Oooo000(T[] tArr, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (t.equals(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void Oooo00O(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            C23988OooooOO.OooO00o(sb, obj, interfaceC32507OooOO0o);
        }
        sb.append(charSequence3);
    }

    public static String Oooo00o(byte[] bArr, String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            interfaceC32507OooOO0o = null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(bArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (interfaceC32507OooOO0o != null) {
                sb.append((CharSequence) interfaceC32507OooOO0o.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String Oooo0O0(Object[] objArr, String str, String str2, String str3, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC32507OooOO0o = null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        Oooo00O(objArr, sb, str4, str5, str6, "...", interfaceC32507OooOO0o);
        return sb.toString();
    }

    public static <T> T Oooo0OO(T[] tArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static float[] Oooo0o(float[] fArr, oO0O00oo.OooO indices) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(indices, "indices");
        if (indices.isEmpty()) {
            return new float[0];
        }
        return Oooo.OooO0OO.OooOO0o(fArr, indices.f116812OooOo0o, indices.f116811OooOo + 1);
    }

    public static <T> T Oooo0o0(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> List<T> Oooo0oO(T[] tArr, Comparator<? super T> comparator) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            kotlin.jvm.internal.OooOOO0.OooO0o(tArr, "copyOf(...)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return Oooo.OooO0OO.OooO0Oo(tArr);
    }

    public static List Oooo0oo(Object[] objArr) {
        if (5 >= objArr.length) {
            return OoooOO0(objArr);
        }
        ArrayList arrayList = new ArrayList(5);
        int i = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i++;
            if (i == 5) {
                break;
            }
        }
        return arrayList;
    }

    public static List<Long> OoooO(long[] jArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List<Double> OoooO0(double[] dArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List<Byte> OoooO00(byte[] bArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List<Float> OoooO0O(float[] fArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static <T> List<T> OoooOO0(T[] tArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? OoooOOo(tArr) : com.facebook.soloader.OooOo.OooO0oO(tArr[0]) : C34434OooOoO.f123453OooOo0o;
    }

    public static ArrayList OoooOOO(int[] iArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static ArrayList OoooOOo(Object[] objArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        return new ArrayList(new OooOO0O(objArr, false));
    }

    public static <T> Set<T> OoooOo0(T[] tArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C34438OooOoo0.f123458OooOo0o;
        }
        if (length == 1) {
            return C34449Oooo0oo.OooOO0(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(Oooo0.OooO0Oo(tArr.length));
        Oooo(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List<Short> o000oOoO(short[] sArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }
}
