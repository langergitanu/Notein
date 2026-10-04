package oOo000Oo;

import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: oOo000Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34429OooOOo0 extends com.facebook.soloader.OooOo {
    public static int OooO(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        OooOOOo(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iOooO0O0 = C24536OooO0Oo.OooO0O0((Comparable) arrayList.get(i3), comparable);
            if (iOooO0O0 < 0) {
                i2 = i3 + 1;
            } else {
                if (iOooO0O0 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static <T> ArrayList<T> OooO0oo(T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new OooOO0O(tArr, true));
    }

    public static oO0O00oo.OooO OooOO0(Collection<?> collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        return new oO0O00oo.OooO(0, collection.size() - 1, 1);
    }

    public static <T> int OooOO0O(List<? extends T> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> OooOO0o(T... elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return elements.length > 0 ? Oooo.OooO0OO.OooO0Oo(elements) : C34434OooOoO.f123453OooOo0o;
    }

    public static ArrayList OooOOO(Object... elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new OooOO0O(elements, true));
    }

    public static <T> List<T> OooOOO0(T t) {
        return t != null ? com.facebook.soloader.OooOo.OooO0oO(t) : C34434OooOoO.f123453OooOo0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> OooOOOO(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : com.facebook.soloader.OooOo.OooO0oO(list.get(0)) : C34434OooOoO.f123453OooOo0o;
    }

    public static final void OooOOOo(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(C20856OooooOo.OooO0O0("toIndex (", i2, ") is greater than size (", ").", i));
        }
    }

    public static void OooOOo() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void OooOOo0() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}
