package oo0o0Oo;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21111o0ooOoO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import o000OoO.C24536OooO0Oo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oo0o0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34680OooO0O0 implements CharSequence {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final List<C20372OooO0O0<C34691OooOOO0>> f124886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f124887OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final List<C20372OooO0O0<? extends Object>> f124888OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final List<C20372OooO0O0<C34686OooO0oo>> f124889OooOoO0;

    /* JADX INFO: renamed from: oo0o0Oo.OooO0O0$OooO0OO */
    public static final class OooO0OO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(((C20372OooO0O0) t).f124899OooO0O0), Integer.valueOf(((C20372OooO0O0) t2).f124899OooO0O0));
        }
    }

    public C34680OooO0O0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34680OooO0O0(String text, List<C20372OooO0O0<C34691OooOOO0>> list, List<C20372OooO0O0<C34686OooO0oo>> list2, List<? extends C20372OooO0O0<? extends Object>> list3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        this.f124887OooOo0o = text;
        this.f124886OooOo = list;
        this.f124889OooOoO0 = list2;
        this.f124888OooOoO = list3;
        if (list2 != null) {
            List listO00O0O = OooOo.o00O0O(list2, new OooO0OO());
            int size = listO00O0O.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                C20372OooO0O0 c20372OooO0O0 = (C20372OooO0O0) listO00O0O.get(i2);
                if (c20372OooO0O0.f124899OooO0O0 < i) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f124887OooOo0o.length();
                int i3 = c20372OooO0O0.f124900OooO0OO;
                if (i3 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c20372OooO0O0.f124899OooO0O0 + ", " + i3 + ") is out of boundary").toString());
                }
                i2++;
                i = i3;
            }
        }
    }

    public final C34680OooO0O0 OooO00o(C34680OooO0O0 c34680OooO0O0) {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.OooO0O0(c34680OooO0O0);
        return oooO00o.OooO0OO();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final C34680OooO0O0 subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        }
        String str = this.f124887OooOo0o;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C34680OooO0O0(strSubstring, C34681OooO0OO.OooO00o(this.f124886OooOo, i, i2), C34681OooO0OO.OooO00o(this.f124889OooOoO0, i, i2), C34681OooO0OO.OooO00o(this.f124888OooOoO, i, i2));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f124887OooOo0o.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34680OooO0O0)) {
            return false;
        }
        C34680OooO0O0 c34680OooO0O0 = (C34680OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124887OooOo0o, c34680OooO0O0.f124887OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124886OooOo, c34680OooO0O0.f124886OooOo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124889OooOoO0, c34680OooO0O0.f124889OooOoO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124888OooOoO, c34680OooO0O0.f124888OooOoO);
    }

    public final int hashCode() {
        int iHashCode = this.f124887OooOo0o.hashCode() * 31;
        List<C20372OooO0O0<C34691OooOOO0>> list = this.f124886OooOo;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<C20372OooO0O0<C34686OooO0oo>> list2 = this.f124889OooOoO0;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C20372OooO0O0<? extends Object>> list3 = this.f124888OooOoO;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f124887OooOo0o.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f124887OooOo0o;
    }

    /* JADX INFO: renamed from: oo0o0Oo.OooO0O0$OooO00o */
    public static final class OooO00o implements Appendable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ArrayList f124890OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final StringBuilder f124891OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final ArrayList f124892OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final ArrayList f124893OooOoO0;

        public OooO00o(C34680OooO0O0 text) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
            this.f124891OooOo0o = new StringBuilder(16);
            this.f124890OooOo = new ArrayList();
            this.f124893OooOoO0 = new ArrayList();
            this.f124892OooOoO = new ArrayList();
            new ArrayList();
            OooO0O0(text);
        }

        public final void OooO00o(C34691OooOOO0 style, int i, int i2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(style, "style");
            this.f124890OooOo.add(new C20371OooO00o(style, i, i2));
        }

        public final void OooO0O0(C34680OooO0O0 text) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
            StringBuilder sb = this.f124891OooOo0o;
            int length = sb.length();
            sb.append(text.f124887OooOo0o);
            List<C20372OooO0O0<C34691OooOOO0>> list = text.f124886OooOo;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C20372OooO0O0<C34691OooOOO0> c20372OooO0O0 = list.get(i);
                    OooO00o(c20372OooO0O0.f124898OooO00o, c20372OooO0O0.f124899OooO0O0 + length, c20372OooO0O0.f124900OooO0OO + length);
                }
            }
            List<C20372OooO0O0<C34686OooO0oo>> list2 = text.f124889OooOoO0;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C20372OooO0O0<C34686OooO0oo> c20372OooO0O02 = list2.get(i2);
                    C34686OooO0oo style = c20372OooO0O02.f124898OooO00o;
                    int i3 = c20372OooO0O02.f124899OooO0O0 + length;
                    int i4 = c20372OooO0O02.f124900OooO0OO + length;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(style, "style");
                    this.f124893OooOoO0.add(new C20371OooO00o(style, i3, i4));
                }
            }
            List<C20372OooO0O0<? extends Object>> list3 = text.f124888OooOoO;
            if (list3 != null) {
                int size3 = list3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    C20372OooO0O0<? extends Object> c20372OooO0O03 = list3.get(i5);
                    this.f124892OooOoO.add(new C20371OooO00o(c20372OooO0O03.f124899OooO0O0 + length, c20372OooO0O03.f124900OooO0OO + length, c20372OooO0O03.f124901OooO0Oo, c20372OooO0O03.f124898OooO00o));
                }
            }
        }

        public final C34680OooO0O0 OooO0OO() {
            StringBuilder sb = this.f124891OooOo0o;
            String string = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "text.toString()");
            ArrayList arrayList = this.f124890OooOo;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((C20371OooO00o) arrayList.get(i)).OooO00o(sb.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList3 = this.f124893OooOoO0;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList4.add(((C20371OooO00o) arrayList3.get(i2)).OooO00o(sb.length()));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            ArrayList arrayList5 = this.f124892OooOoO;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList6.add(((C20371OooO00o) arrayList5.get(i3)).OooO00o(sb.length()));
            }
            return new C34680OooO0O0(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof C34680OooO0O0) {
                OooO0O0((C34680OooO0O0) charSequence);
                return this;
            }
            this.f124891OooOo0o.append(charSequence);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List, java.util.List<oo0o0Oo.OooO0O0$OooO0O0<? extends java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List, java.util.List<oo0o0Oo.OooO0O0$OooO0O0<oo0o0Oo.OooO0oo>>] */
        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            ?? arrayList;
            ?? arrayList2;
            boolean z = charSequence instanceof C34680OooO0O0;
            ?? r1 = this.f124891OooOo0o;
            if (z) {
                C34680OooO0O0 text = (C34680OooO0O0) charSequence;
                kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
                int length = r1.length();
                String str = text.f124887OooOo0o;
                r1.append(str, i, i2);
                List<C20372OooO0O0<C34691OooOOO0>> listOooO0O0 = C34681OooO0OO.OooO0O0(text, i, i2);
                if (listOooO0O0 != null) {
                    int size = listOooO0O0.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C20372OooO0O0<C34691OooOOO0> c20372OooO0O0 = listOooO0O0.get(i3);
                        OooO00o(c20372OooO0O0.f124898OooO00o, c20372OooO0O0.f124899OooO0O0 + length, c20372OooO0O0.f124900OooO0OO + length);
                    }
                }
                ?? r12 = 0;
                r12 = 0;
                if (i == i2 || (arrayList = text.f124889OooOoO0) == 0) {
                    arrayList = 0;
                } else if (i != 0 || i2 < str.length()) {
                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj = arrayList.get(i4);
                        C20372OooO0O0 c20372OooO0O02 = (C20372OooO0O0) obj;
                        if (C34681OooO0OO.OooO0OO(i, i2, c20372OooO0O02.f124899OooO0O0, c20372OooO0O02.f124900OooO0OO)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = new ArrayList(arrayList3.size());
                    int size3 = arrayList3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        C20372OooO0O0 c20372OooO0O03 = (C20372OooO0O0) arrayList3.get(i5);
                        arrayList.add(new C20372OooO0O0(c20372OooO0O03.f124898OooO00o, oO0O00oo.OooOO0.OooO0o(c20372OooO0O03.f124899OooO0O0, i, i2) - i, oO0O00oo.OooOO0.OooO0o(c20372OooO0O03.f124900OooO0OO, i, i2) - i));
                    }
                }
                if (arrayList != 0) {
                    int size4 = arrayList.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        C20372OooO0O0 c20372OooO0O04 = (C20372OooO0O0) arrayList.get(i6);
                        C34686OooO0oo style = (C34686OooO0oo) c20372OooO0O04.f124898OooO00o;
                        int i7 = c20372OooO0O04.f124899OooO0O0 + length;
                        int i8 = c20372OooO0O04.f124900OooO0OO + length;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(style, "style");
                        this.f124893OooOoO0.add(new C20371OooO00o(style, i7, i8));
                    }
                }
                if (i != i2 && (arrayList2 = text.f124888OooOoO) != 0) {
                    if (i != 0 || i2 < str.length()) {
                        ArrayList arrayList4 = new ArrayList(arrayList2.size());
                        int size5 = arrayList2.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            Object obj2 = arrayList2.get(i9);
                            C20372OooO0O0 c20372OooO0O05 = (C20372OooO0O0) obj2;
                            if (C34681OooO0OO.OooO0OO(i, i2, c20372OooO0O05.f124899OooO0O0, c20372OooO0O05.f124900OooO0OO)) {
                                arrayList4.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList(arrayList4.size());
                        int size6 = arrayList4.size();
                        for (int i10 = 0; i10 < size6; i10++) {
                            C20372OooO0O0 c20372OooO0O06 = (C20372OooO0O0) arrayList4.get(i10);
                            arrayList2.add(new C20372OooO0O0(oO0O00oo.OooOO0.OooO0o(c20372OooO0O06.f124899OooO0O0, i, i2) - i, oO0O00oo.OooOO0.OooO0o(c20372OooO0O06.f124900OooO0OO, i, i2) - i, c20372OooO0O06.f124901OooO0Oo, c20372OooO0O06.f124898OooO00o));
                        }
                    }
                    r12 = arrayList2;
                }
                if (r12 != 0) {
                    int size7 = r12.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        C20372OooO0O0 c20372OooO0O07 = (C20372OooO0O0) r12.get(i11);
                        this.f124892OooOoO.add(new C20371OooO00o(c20372OooO0O07.f124899OooO0O0 + length, c20372OooO0O07.f124900OooO0OO + length, c20372OooO0O07.f124901OooO0Oo, c20372OooO0O07.f124898OooO00o));
                    }
                }
                return this;
            }
            r1.append(charSequence, i, i2);
            return this;
        }

        /* JADX INFO: renamed from: oo0o0Oo.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20371OooO00o<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final T f124894OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f124895OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final int f124896OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final String f124897OooO0Oo;

            /* JADX WARN: Multi-variable type inference failed */
            public C20371OooO00o(int i, int i2, String tag, Object obj) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
                this.f124894OooO00o = obj;
                this.f124895OooO0O0 = i;
                this.f124896OooO0OO = i2;
                this.f124897OooO0Oo = tag;
            }

            public final C20372OooO0O0<T> OooO00o(int i) {
                int i2 = this.f124896OooO0OO;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new C20372OooO0O0<>(this.f124895OooO0O0, i, this.f124897OooO0Oo, this.f124894OooO00o);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20371OooO00o)) {
                    return false;
                }
                C20371OooO00o c20371OooO00o = (C20371OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124894OooO00o, c20371OooO00o.f124894OooO00o) && this.f124895OooO0O0 == c20371OooO00o.f124895OooO0O0 && this.f124896OooO0OO == c20371OooO00o.f124896OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124897OooO0Oo, c20371OooO00o.f124897OooO0Oo);
            }

            public final int hashCode() {
                T t = this.f124894OooO00o;
                return this.f124897OooO0Oo.hashCode() + C20785Oooo00o.OooO00o(this.f124896OooO0OO, C20785Oooo00o.OooO00o(this.f124895OooO0O0, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.f124894OooO00o);
                sb.append(", start=");
                sb.append(this.f124895OooO0O0);
                sb.append(", end=");
                sb.append(this.f124896OooO0OO);
                sb.append(", tag=");
                return C21111o0ooOoO.OooO0OO(this.f124897OooO0Oo, ')', sb);
            }

            public /* synthetic */ C20371OooO00o(Object obj, int i, int i2) {
                this(i, i2, "", obj);
            }
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.f124891OooOo0o.append(c);
            return this;
        }
    }

    /* JADX INFO: renamed from: oo0o0Oo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20372OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f124898OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f124899OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f124900OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f124901OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public C20372OooO0O0(int i, int i2, String tag, Object obj) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
            this.f124898OooO00o = obj;
            this.f124899OooO0O0 = i;
            this.f124900OooO0OO = i2;
            this.f124901OooO0Oo = tag;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20372OooO0O0)) {
                return false;
            }
            C20372OooO0O0 c20372OooO0O0 = (C20372OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124898OooO00o, c20372OooO0O0.f124898OooO00o) && this.f124899OooO0O0 == c20372OooO0O0.f124899OooO0O0 && this.f124900OooO0OO == c20372OooO0O0.f124900OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124901OooO0Oo, c20372OooO0O0.f124901OooO0Oo);
        }

        public final int hashCode() {
            T t = this.f124898OooO00o;
            return this.f124901OooO0Oo.hashCode() + C20785Oooo00o.OooO00o(this.f124900OooO0OO, C20785Oooo00o.OooO00o(this.f124899OooO0O0, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.f124898OooO00o);
            sb.append(", start=");
            sb.append(this.f124899OooO0O0);
            sb.append(", end=");
            sb.append(this.f124900OooO0OO);
            sb.append(", tag=");
            return C21111o0ooOoO.OooO0OO(this.f124901OooO0Oo, ')', sb);
        }

        public C20372OooO0O0(T t, int i, int i2) {
            this(i, i2, "", t);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34680OooO0O0(int i, String text, ArrayList arrayList) {
        Collection collection = (i & 2) != 0 ? C34434OooOoO.f123453OooOo0o : arrayList;
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        Collection collection2 = collection;
        this(text, (List) (collection2.isEmpty() ? null : collection2), null, null);
    }
}
