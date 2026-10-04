package oO0Oo0o0;

import OooO0o.C20424OooO0Oo;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0Oo0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33216OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f120190OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f120191OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f120192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int f120193OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f120194OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int f120195OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final int f120196OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int f120197OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int f120198OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int f120199OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final C33216OooO0Oo f120200OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final C33216OooO0Oo f120201OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final C33216OooO0Oo f120202OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final C33216OooO0Oo f120203OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final ArrayList f120204OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final C33216OooO0Oo f120205OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final ArrayList f120206OooOOoo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO0OO> f120207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f120208OooO0O0;

    /* JADX INFO: renamed from: oO0Oo0o0.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: oO0Oo0o0.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20304OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f120209OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f120210OooO0O0;

            public C20304OooO00o(int i, String str) {
                this.f120209OooO00o = i;
                this.f120210OooO0O0 = str;
            }
        }
    }

    static {
        OooO00o.C20304OooO00o c20304OooO00o;
        int i = f120192OooO0Oo;
        int i2 = i << 1;
        f120194OooO0o0 = i;
        int i3 = i << 2;
        f120193OooO0o = i2;
        int i4 = i << 3;
        f120195OooO0oO = i3;
        int i5 = i << 4;
        f120196OooO0oo = i4;
        int i6 = i << 5;
        f120190OooO = i5;
        f120197OooOO0 = i6;
        f120192OooO0Oo = i << 7;
        int i7 = (i << 6) - 1;
        f120198OooOO0O = i7;
        int i8 = i | i2 | i3;
        f120199OooOO0o = i8;
        f120201OooOOO0 = new C33216OooO0Oo(i7);
        f120200OooOOO = new C33216OooO0Oo(i5 | i6);
        new C33216OooO0Oo(i);
        new C33216OooO0Oo(i2);
        new C33216OooO0Oo(i3);
        f120202OooOOOO = new C33216OooO0Oo(i8);
        new C33216OooO0Oo(i4);
        f120203OooOOOo = new C33216OooO0Oo(i5);
        f120205OooOOo0 = new C33216OooO0Oo(i6);
        new C33216OooO0Oo(i2 | i5 | i6);
        Field[] fields = C33216OooO0Oo.class.getFields();
        kotlin.jvm.internal.OooOOO0.OooO0o(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            OooO00o.C20304OooO00o c20304OooO00o2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C33216OooO0Oo c33216OooO0Oo = obj instanceof C33216OooO0Oo ? (C33216OooO0Oo) obj : null;
            if (c33216OooO0Oo != null) {
                String name = field2.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "field.name");
                c20304OooO00o2 = new OooO00o.C20304OooO00o(c33216OooO0Oo.f120208OooO0O0, name);
            }
            if (c20304OooO00o2 != null) {
                arrayList2.add(c20304OooO00o2);
            }
        }
        f120204OooOOo = arrayList2;
        Field[] fields2 = C33216OooO0Oo.class.getFields();
        kotlin.jvm.internal.OooOOO0.OooO0o(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name2, "field.name");
                c20304OooO00o = new OooO00o.C20304OooO00o(iIntValue, name2);
            } else {
                c20304OooO00o = null;
            }
            if (c20304OooO00o != null) {
                arrayList5.add(c20304OooO00o);
            }
        }
        f120206OooOOoo = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33216OooO0Oo(int i, List<? extends OooO0OO> excludes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(excludes, "excludes");
        this.f120207OooO00o = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i &= ~((OooO0OO) it.next()).OooO00o();
        }
        this.f120208OooO0O0 = i;
    }

    public final boolean OooO00o(int i) {
        return (i & this.f120208OooO0O0) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C33216OooO0Oo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C33216OooO0Oo c33216OooO0Oo = (C33216OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120207OooO00o, c33216OooO0Oo.f120207OooO00o) && this.f120208OooO0O0 == c33216OooO0Oo.f120208OooO0O0;
    }

    public final int hashCode() {
        return (this.f120207OooO00o.hashCode() * 31) + this.f120208OooO0O0;
    }

    public final String toString() {
        Object next;
        Iterator it = f120204OooOOo.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((OooO00o.C20304OooO00o) next).f120209OooO00o == this.f120208OooO0O0) {
                break;
            }
        }
        OooO00o.C20304OooO00o c20304OooO00o = (OooO00o.C20304OooO00o) next;
        String strO000oOoO = c20304OooO00o != null ? c20304OooO00o.f120210OooO0O0 : null;
        if (strO000oOoO == null) {
            ArrayList<OooO00o.C20304OooO00o> arrayList = f120206OooOOoo;
            ArrayList arrayList2 = new ArrayList();
            for (OooO00o.C20304OooO00o c20304OooO00o2 : arrayList) {
                String str = OooO00o(c20304OooO00o2.f120209OooO00o) ? c20304OooO00o2.f120210OooO0O0 : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strO000oOoO = OooOo.o000oOoO(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("DescriptorKindFilter(", strO000oOoO, ", ");
        sbOooO0o0.append(this.f120207OooO00o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public /* synthetic */ C33216OooO0Oo(int i) {
        this(i, C34434OooOoO.f123453OooOo0o);
    }
}
