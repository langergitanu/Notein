package Oooo0oo;

import OooOoo0.OooOO0;
import Oooo0oO.AbstractC21043OooOoO;
import Oooo0oO.C21025OooO0o0;
import Oooo0oO.C21034OooOOOo;
import Oooo0oO.C21035OooOOo;
import Oooo0oO.C21036OooOOo0;
import Oooo0oO.C21038OooOo;
import Oooo0oO.C21069OoooOoo;
import Oooo0oO.C21092o0000o0;
import Oooo0oO.o000O00O;
import Oooo0oO.o00O0O;
import Oooo0oO.o00Oo0;
import Oooo0oo.AbstractC21116OooO0Oo;
import Oooo0oo.C21137OooO0oO;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o000o0o.C24611OooO00o;
import o000oOoO.C24637OooO0OO;

/* JADX INFO: renamed from: Oooo0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21114OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21035OooOOo f61272OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C21113OooO00o f61273OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f61274OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f61276OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f61278OooO0oO;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f61282OooOO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C21069OoooOoo f61275OooO0Oo = new C21069OoooOoo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f61277OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O00O<Object> f61279OooO0oo = new o000O00O<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f61271OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f61280OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f61281OooOO0O = -1;

    public C21114OooO0O0(C21035OooOOo c21035OooOOo, C21113OooO00o c21113OooO00o) {
        this.f61272OooO00o = c21035OooOOo;
        this.f61273OooO0O0 = c21113OooO00o;
    }

    public final void OooO() {
        C21092o0000o0 c21092o0000o0 = this.f61272OooO00o.f60928Oooo000;
        if (c21092o0000o0.f61143OooO0OO > 0) {
            int i = c21092o0000o0.f61140OooO;
            C21069OoooOoo c21069OoooOoo = this.f61275OooO0Oo;
            int i2 = c21069OoooOoo.f61025OooO0O0;
            if ((i2 > 0 ? c21069OoooOoo.f61024OooO00o[i2 - 1] : -2) != i) {
                if (!this.f61274OooO0OO && this.f61277OooO0o0) {
                    OooO0oo(false);
                    C21113OooO00o c21113OooO00o = this.f61273OooO0O0;
                    c21113OooO00o.getClass();
                    c21113OooO00o.f61270OooO00o.o00Ooo(AbstractC21116OooO0Oo.C21120OooOO0o.f61298OooO0OO);
                    this.f61274OooO0OO = true;
                }
                if (i > 0) {
                    C21025OooO0o0 c21025OooO0o0OooO00o = c21092o0000o0.OooO00o(i);
                    c21069OoooOoo.OooO0O0(i);
                    OooO0oo(false);
                    C21113OooO00o c21113OooO00o2 = this.f61273OooO0O0;
                    c21113OooO00o2.getClass();
                    AbstractC21116OooO0Oo.OooOO0O oooOO0O = AbstractC21116OooO0Oo.OooOO0O.f61297OooO0OO;
                    C21137OooO0oO c21137OooO0oO = c21113OooO00o2.f61270OooO00o;
                    c21137OooO0oO.o00o0O(oooOO0O);
                    C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 0, c21025OooO0o0OooO00o);
                    int i3 = c21137OooO0oO.f61327OooO0oO;
                    int i4 = oooOO0O.f61285OooO00o;
                    int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i4);
                    int i5 = oooOO0O.f61286OooO0O0;
                    if (i3 == iOoooooO && c21137OooO0oO.f61328OooO0oo == C21137OooO0oO.OoooooO(c21137OooO0oO, i5)) {
                        this.f61274OooO0OO = true;
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    int i6 = 0;
                    for (int i7 = 0; i7 < i4; i7++) {
                        if (((1 << i7) & c21137OooO0oO.f61327OooO0oO) != 0) {
                            if (i6 > 0) {
                                sb.append(", ");
                            }
                            sb.append(oooOO0O.OooO0O0(i7));
                            i6++;
                        }
                    }
                    String string = sb.toString();
                    StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
                    int i8 = 0;
                    for (int i9 = 0; i9 < i5; i9++) {
                        if (((1 << i9) & c21137OooO0oO.f61328OooO0oo) != 0) {
                            if (i6 > 0) {
                                sbOooO0O0.append(", ");
                            }
                            sbOooO0O0.append(oooOO0O.OooO0OO(i9));
                            i8++;
                        }
                    }
                    String string2 = sbOooO0O0.toString();
                    OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(oooOO0O);
                    sb2.append(". Not all arguments were provided. Missing ");
                    C21036OooOOo0.OooO0Oo(i6, " int arguments (", string, ") and ", sb2);
                    C24611OooO00o.OooO0Oo(i8, " object arguments (", string2, ").", sb2);
                    throw null;
                }
            }
        }
    }

    public final void OooO00o(ArrayList arrayList, C24637OooO0OO c24637OooO0OO) {
        C21113OooO00o c21113OooO00o = this.f61273OooO0O0;
        c21113OooO00o.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC21116OooO0Oo.C18980OooO0Oo c18980OooO0Oo = AbstractC21116OooO0Oo.C18980OooO0Oo.f61291OooO0OO;
        C21137OooO0oO c21137OooO0oO = c21113OooO00o.f61270OooO00o;
        c21137OooO0oO.o00o0O(c18980OooO0Oo);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 1, arrayList);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 0, c24637OooO0OO);
        int i = c21137OooO0oO.f61327OooO0oO;
        int i2 = c18980OooO0Oo.f61285OooO00o;
        int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i2);
        int i3 = c18980OooO0Oo.f61286OooO0O0;
        if (i == iOoooooO && c21137OooO0oO.f61328OooO0oo == C21137OooO0oO.OoooooO(c21137OooO0oO, i3)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((1 << i5) & c21137OooO0oO.f61327OooO0oO) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(c18980OooO0Oo.OooO0O0(i5));
                i4++;
            }
        }
        String string = sb.toString();
        StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            if (((1 << i7) & c21137OooO0oO.f61328OooO0oo) != 0) {
                if (i4 > 0) {
                    sbOooO0O0.append(", ");
                }
                sbOooO0O0.append(c18980OooO0Oo.OooO0OO(i7));
                i6++;
            }
        }
        String string2 = sbOooO0O0.toString();
        OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(c18980OooO0Oo);
        sb2.append(". Not all arguments were provided. Missing ");
        C21036OooOOo0.OooO0Oo(i4, " int arguments (", string, ") and ", sb2);
        C24611OooO00o.OooO0Oo(i6, " object arguments (", string2, ").", sb2);
        throw null;
    }

    public final void OooO0O0(o00O0O o00o0o2, AbstractC21043OooOoO abstractC21043OooOoO, o00Oo0 o00oo02, o00Oo0 o00oo03) {
        C21113OooO00o c21113OooO00o = this.f61273OooO0O0;
        c21113OooO00o.getClass();
        AbstractC21116OooO0Oo.C21117OooO0o0 c21117OooO0o0 = AbstractC21116OooO0Oo.C21117OooO0o0.f61293OooO0OO;
        C21137OooO0oO c21137OooO0oO = c21113OooO00o.f61270OooO00o;
        c21137OooO0oO.o00o0O(c21117OooO0o0);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 0, o00o0o2);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 1, abstractC21043OooOoO);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 3, o00oo03);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 2, o00oo02);
        int i = c21137OooO0oO.f61327OooO0oO;
        int i2 = c21117OooO0o0.f61285OooO00o;
        int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i2);
        int i3 = c21117OooO0o0.f61286OooO0O0;
        if (i == iOoooooO && c21137OooO0oO.f61328OooO0oo == C21137OooO0oO.OoooooO(c21137OooO0oO, i3)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((1 << i5) & c21137OooO0oO.f61327OooO0oO) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(c21117OooO0o0.OooO0O0(i5));
                i4++;
            }
        }
        String string = sb.toString();
        StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            if (((1 << i7) & c21137OooO0oO.f61328OooO0oo) != 0) {
                if (i4 > 0) {
                    sbOooO0O0.append(", ");
                }
                sbOooO0O0.append(c21117OooO0o0.OooO0OO(i7));
                i6++;
            }
        }
        String string2 = sbOooO0O0.toString();
        OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(c21117OooO0o0);
        sb2.append(". Not all arguments were provided. Missing ");
        C21036OooOOo0.OooO0Oo(i4, " int arguments (", string, ") and ", sb2);
        C24611OooO00o.OooO0Oo(i6, " object arguments (", string2, ").", sb2);
        throw null;
    }

    public final void OooO0OO(C24637OooO0OO c24637OooO0OO, C21025OooO0o0 c21025OooO0o0) {
        OooO0o();
        C21113OooO00o c21113OooO00o = this.f61273OooO0O0;
        c21113OooO00o.getClass();
        AbstractC21116OooO0Oo.OooO0o oooO0o = AbstractC21116OooO0Oo.OooO0o.f61292OooO0OO;
        C21137OooO0oO c21137OooO0oO = c21113OooO00o.f61270OooO00o;
        c21137OooO0oO.o00o0O(oooO0o);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 0, c24637OooO0OO);
        C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 1, c21025OooO0o0);
        int i = c21137OooO0oO.f61327OooO0oO;
        int i2 = oooO0o.f61285OooO00o;
        int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i2);
        int i3 = oooO0o.f61286OooO0O0;
        if (i == iOoooooO && c21137OooO0oO.f61328OooO0oo == C21137OooO0oO.OoooooO(c21137OooO0oO, i3)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((1 << i5) & c21137OooO0oO.f61327OooO0oO) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(oooO0o.OooO0O0(i5));
                i4++;
            }
        }
        String string = sb.toString();
        StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            if (((1 << i7) & c21137OooO0oO.f61328OooO0oo) != 0) {
                if (i4 > 0) {
                    sbOooO0O0.append(", ");
                }
                sbOooO0O0.append(oooO0o.OooO0OO(i7));
                i6++;
            }
        }
        String string2 = sbOooO0O0.toString();
        OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(oooO0o);
        sb2.append(". Not all arguments were provided. Missing ");
        C21036OooOOo0.OooO0Oo(i4, " int arguments (", string, ") and ", sb2);
        C24611OooO00o.OooO0Oo(i6, " object arguments (", string2, ").", sb2);
        throw null;
    }

    public final void OooO0Oo(C21113OooO00o c21113OooO00o, C24637OooO0OO c24637OooO0OO) {
        C21113OooO00o c21113OooO00o2 = this.f61273OooO0O0;
        c21113OooO00o2.getClass();
        if (c21113OooO00o.f61270OooO00o.o00O0O()) {
            AbstractC21116OooO0Oo.OooO0OO oooO0OO = AbstractC21116OooO0Oo.OooO0OO.f61290OooO0OO;
            C21137OooO0oO c21137OooO0oO = c21113OooO00o2.f61270OooO00o;
            c21137OooO0oO.o00o0O(oooO0OO);
            C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 0, c21113OooO00o);
            C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO, 1, c24637OooO0OO);
            int i = c21137OooO0oO.f61327OooO0oO;
            int i2 = oooO0OO.f61285OooO00o;
            int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i2);
            int i3 = oooO0OO.f61286OooO0O0;
            if (i == iOoooooO && c21137OooO0oO.f61328OooO0oo == C21137OooO0oO.OoooooO(c21137OooO0oO, i3)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                if (((1 << i5) & c21137OooO0oO.f61327OooO0oO) != 0) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(oooO0OO.OooO0O0(i5));
                    i4++;
                }
            }
            String string = sb.toString();
            StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                if (((1 << i7) & c21137OooO0oO.f61328OooO0oo) != 0) {
                    if (i4 > 0) {
                        sbOooO0O0.append(", ");
                    }
                    sbOooO0O0.append(oooO0OO.OooO0OO(i7));
                    i6++;
                }
            }
            String string2 = sbOooO0O0.toString();
            OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(oooO0OO);
            sb2.append(". Not all arguments were provided. Missing ");
            C21036OooOOo0.OooO0Oo(i4, " int arguments (", string, ") and ", sb2);
            C24611OooO00o.OooO0Oo(i6, " object arguments (", string2, ").", sb2);
            throw null;
        }
    }

    public final void OooO0o() {
        Throwable th;
        int i;
        C21114OooO0O0 c21114OooO0O0 = this;
        int i2 = c21114OooO0O0.f61278OooO0oO;
        int i3 = 0;
        if (i2 > 0) {
            C21113OooO00o c21113OooO00o = c21114OooO0O0.f61273OooO0O0;
            c21113OooO00o.getClass();
            AbstractC21116OooO0Oo.C21134OooOooo c21134OooOooo = AbstractC21116OooO0Oo.C21134OooOooo.f61317OooO0OO;
            C21137OooO0oO c21137OooO0oO = c21113OooO00o.f61270OooO00o;
            c21137OooO0oO.o00o0O(c21134OooOooo);
            C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO, 0, i2);
            int i4 = c21137OooO0oO.f61327OooO0oO;
            int i5 = c21134OooOooo.f61285OooO00o;
            th = null;
            int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i5);
            i = 1;
            int i6 = c21134OooOooo.f61286OooO0O0;
            if (i4 != iOoooooO || c21137OooO0oO.f61328OooO0oo != C21137OooO0oO.OoooooO(c21137OooO0oO, i6)) {
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i5;
                    if (((1 << i7) & c21137OooO0oO.f61327OooO0oO) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(c21134OooOooo.OooO0O0(i7));
                        i3++;
                    }
                    i7++;
                    i5 = i8;
                }
                String string = sb.toString();
                StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
                int i9 = 0;
                int i10 = 0;
                while (i10 < i6) {
                    int i11 = i6;
                    if (((1 << i10) & c21137OooO0oO.f61328OooO0oo) != 0) {
                        if (i3 > 0) {
                            sbOooO0O0.append(", ");
                        }
                        sbOooO0O0.append(c21134OooOooo.OooO0OO(i10));
                        i9++;
                    }
                    i10++;
                    i6 = i11;
                }
                String string2 = sbOooO0O0.toString();
                OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(c21134OooOooo);
                sb2.append(". Not all arguments were provided. Missing ");
                C21036OooOOo0.OooO0Oo(i3, " int arguments (", string, ") and ", sb2);
                C24611OooO00o.OooO0Oo(i9, " object arguments (", string2, ").", sb2);
                throw null;
            }
            c21114OooO0O0.f61278OooO0oO = 0;
        } else {
            th = null;
            i = 1;
            c21114OooO0O0 = this;
        }
        o000O00O<Object> o000o00o2 = c21114OooO0O0.f61279OooO0oo;
        if (o000o00o2.f61214OooO00o.isEmpty()) {
            return;
        }
        C21113OooO00o c21113OooO00o2 = c21114OooO0O0.f61273OooO0O0;
        ArrayList<Object> arrayList = o000o00o2.f61214OooO00o;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = arrayList.get(i12);
        }
        c21113OooO00o2.getClass();
        if (size != 0) {
            AbstractC21116OooO0Oo.C21118OooO0oO c21118OooO0oO = AbstractC21116OooO0Oo.C21118OooO0oO.f61294OooO0OO;
            C21137OooO0oO c21137OooO0oO2 = c21113OooO00o2.f61270OooO00o;
            c21137OooO0oO2.o00o0O(c21118OooO0oO);
            C21137OooO0oO.OooO0O0.OooO0O0(c21137OooO0oO2, 0, objArr);
            int i13 = c21137OooO0oO2.f61327OooO0oO;
            int i14 = c21118OooO0oO.f61285OooO00o;
            int iOoooooO2 = C21137OooO0oO.OoooooO(c21137OooO0oO2, i14);
            int i15 = c21118OooO0oO.f61286OooO0O0;
            if (i13 != iOoooooO2 || c21137OooO0oO2.f61328OooO0oo != C21137OooO0oO.OoooooO(c21137OooO0oO2, i15)) {
                StringBuilder sb3 = new StringBuilder();
                int i16 = 0;
                for (int i17 = 0; i17 < i14; i17++) {
                    if (((i << i17) & c21137OooO0oO2.f61327OooO0oO) != 0) {
                        if (i16 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(c21118OooO0oO.OooO0O0(i17));
                        i16++;
                    }
                }
                String string3 = sb3.toString();
                StringBuilder sbOooO0O02 = OooOO0.OooO0O0(string3, "StringBuilder().apply(builderAction).toString()");
                int i18 = 0;
                int i19 = 0;
                while (i18 < i15) {
                    int i20 = i15;
                    if (((i << i18) & c21137OooO0oO2.f61328OooO0oo) != 0) {
                        if (i16 > 0) {
                            sbOooO0O02.append(", ");
                        }
                        sbOooO0O02.append(c21118OooO0oO.OooO0OO(i18));
                        i19++;
                    }
                    i18++;
                    i15 = i20;
                }
                String string4 = sbOooO0O02.toString();
                OooOOO0.OooO0o(string4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(c21118OooO0oO);
                sb4.append(". Not all arguments were provided. Missing ");
                C21036OooOOo0.OooO0Oo(i16, " int arguments (", string3, ") and ", sb4);
                C24611OooO00o.OooO0Oo(i19, " object arguments (", string4, ").", sb4);
                throw th;
            }
        }
        arrayList.clear();
    }

    public final void OooO0o0() {
        OooO0oO();
        o000O00O<Object> o000o00o2 = this.f61279OooO0oo;
        if (o000o00o2.f61214OooO00o.isEmpty()) {
            this.f61278OooO0oO++;
        } else {
            C21034OooOOOo.OooO0O0(1, o000o00o2.f61214OooO00o);
        }
    }

    public final void OooO0oO() {
        int i = this.f61282OooOO0o;
        if (i > 0) {
            int i2 = this.f61271OooO;
            if (i2 >= 0) {
                OooO0o();
                C21113OooO00o c21113OooO00o = this.f61273OooO0O0;
                c21113OooO00o.getClass();
                AbstractC21116OooO0Oo.C21126OooOo0O c21126OooOo0O = AbstractC21116OooO0Oo.C21126OooOo0O.f61309OooO0OO;
                C21137OooO0oO c21137OooO0oO = c21113OooO00o.f61270OooO00o;
                c21137OooO0oO.o00o0O(c21126OooOo0O);
                C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO, 0, i2);
                C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO, 1, i);
                int i3 = c21137OooO0oO.f61327OooO0oO;
                int i4 = c21126OooOo0O.f61285OooO00o;
                int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i4);
                int i5 = c21126OooOo0O.f61286OooO0O0;
                if (i3 != iOoooooO || c21137OooO0oO.f61328OooO0oo != C21137OooO0oO.OoooooO(c21137OooO0oO, i5)) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < i4) {
                        int i8 = i4;
                        if (((1 << i6) & c21137OooO0oO.f61327OooO0oO) != 0) {
                            if (i7 > 0) {
                                sb.append(", ");
                            }
                            sb.append(c21126OooOo0O.OooO0O0(i6));
                            i7++;
                        }
                        i6++;
                        i4 = i8;
                    }
                    String string = sb.toString();
                    StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < i5) {
                        int i11 = i5;
                        if (((1 << i10) & c21137OooO0oO.f61328OooO0oo) != 0) {
                            if (i7 > 0) {
                                sbOooO0O0.append(", ");
                            }
                            sbOooO0O0.append(c21126OooOo0O.OooO0OO(i10));
                            i9++;
                        }
                        i10++;
                        i5 = i11;
                    }
                    String string2 = sbOooO0O0.toString();
                    OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(c21126OooOo0O);
                    sb2.append(". Not all arguments were provided. Missing ");
                    C21036OooOOo0.OooO0Oo(i7, " int arguments (", string, ") and ", sb2);
                    C24611OooO00o.OooO0Oo(i9, " object arguments (", string2, ").", sb2);
                    throw null;
                }
                this.f61271OooO = -1;
            } else {
                int i12 = this.f61281OooOO0O;
                int i13 = this.f61280OooOO0;
                OooO0o();
                C21113OooO00o c21113OooO00o2 = this.f61273OooO0O0;
                c21113OooO00o2.getClass();
                AbstractC21116OooO0Oo.C21123OooOOo0 c21123OooOOo0 = AbstractC21116OooO0Oo.C21123OooOOo0.f61304OooO0OO;
                C21137OooO0oO c21137OooO0oO2 = c21113OooO00o2.f61270OooO00o;
                c21137OooO0oO2.o00o0O(c21123OooOOo0);
                C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO2, 1, i12);
                C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO2, 0, i13);
                C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO2, 2, i);
                int i14 = c21137OooO0oO2.f61327OooO0oO;
                int i15 = c21123OooOOo0.f61285OooO00o;
                int iOoooooO2 = C21137OooO0oO.OoooooO(c21137OooO0oO2, i15);
                int i16 = c21123OooOOo0.f61286OooO0O0;
                if (i14 != iOoooooO2 || c21137OooO0oO2.f61328OooO0oo != C21137OooO0oO.OoooooO(c21137OooO0oO2, i16)) {
                    int i17 = 0;
                    StringBuilder sb3 = new StringBuilder();
                    for (int i18 = 0; i18 < i15; i18++) {
                        if (((1 << i18) & c21137OooO0oO2.f61327OooO0oO) != 0) {
                            if (i17 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(c21123OooOOo0.OooO0O0(i18));
                            i17++;
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sbOooO0O02 = OooOO0.OooO0O0(string3, "StringBuilder().apply(builderAction).toString()");
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i16) {
                        int i21 = i16;
                        if (((1 << i19) & c21137OooO0oO2.f61328OooO0oo) != 0) {
                            if (i17 > 0) {
                                sbOooO0O02.append(", ");
                            }
                            sbOooO0O02.append(c21123OooOOo0.OooO0OO(i19));
                            i20++;
                        }
                        i19++;
                        i16 = i21;
                    }
                    String string4 = sbOooO0O02.toString();
                    OooOOO0.OooO0o(string4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(c21123OooOOo0);
                    sb4.append(". Not all arguments were provided. Missing ");
                    C21036OooOOo0.OooO0Oo(i17, " int arguments (", string3, ") and ", sb4);
                    C24611OooO00o.OooO0Oo(i20, " object arguments (", string4, ").", sb4);
                    throw null;
                }
                this.f61280OooOO0 = -1;
                this.f61281OooOO0O = -1;
            }
            this.f61282OooOO0o = 0;
        }
    }

    public final void OooO0oo(boolean z) {
        C21035OooOOo c21035OooOOo = this.f61272OooO00o;
        int i = z ? c21035OooOOo.f60928Oooo000.f61140OooO : c21035OooOOo.f60928Oooo000.f61147OooO0oO;
        int i2 = i - this.f61276OooO0o;
        if (!(i2 >= 0)) {
            C21038OooOo.OooO0OO("Tried to seek backward");
            throw null;
        }
        if (i2 > 0) {
            C21113OooO00o c21113OooO00o = this.f61273OooO0O0;
            c21113OooO00o.getClass();
            AbstractC21116OooO0Oo.OooO00o oooO00o = AbstractC21116OooO0Oo.OooO00o.f61288OooO0OO;
            C21137OooO0oO c21137OooO0oO = c21113OooO00o.f61270OooO00o;
            c21137OooO0oO.o00o0O(oooO00o);
            C21137OooO0oO.OooO0O0.OooO00o(c21137OooO0oO, 0, i2);
            int i3 = c21137OooO0oO.f61327OooO0oO;
            int i4 = oooO00o.f61285OooO00o;
            int iOoooooO = C21137OooO0oO.OoooooO(c21137OooO0oO, i4);
            int i5 = oooO00o.f61286OooO0O0;
            if (i3 == iOoooooO && c21137OooO0oO.f61328OooO0oo == C21137OooO0oO.OoooooO(c21137OooO0oO, i5)) {
                this.f61276OooO0o = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                if (((1 << i7) & c21137OooO0oO.f61327OooO0oO) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(oooO00o.OooO0O0(i7));
                    i6++;
                }
            }
            String string = sb.toString();
            StringBuilder sbOooO0O0 = OooOO0.OooO0O0(string, "StringBuilder().apply(builderAction).toString()");
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                if (((1 << i9) & c21137OooO0oO.f61328OooO0oo) != 0) {
                    if (i6 > 0) {
                        sbOooO0O0.append(", ");
                    }
                    sbOooO0O0.append(oooO00o.OooO0OO(i9));
                    i8++;
                }
            }
            String string2 = sbOooO0O0.toString();
            OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(oooO00o);
            sb2.append(". Not all arguments were provided. Missing ");
            C21036OooOOo0.OooO0Oo(i6, " int arguments (", string, ") and ", sb2);
            C24611OooO00o.OooO0Oo(i8, " object arguments (", string2, ").", sb2);
            throw null;
        }
    }

    public final void OooOO0(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                C21038OooOo.OooO0OO("Invalid remove index " + i);
                throw null;
            }
            if (this.f61271OooO == i) {
                this.f61282OooOO0o += i2;
                return;
            }
            OooO0oO();
            this.f61271OooO = i;
            this.f61282OooOO0o = i2;
        }
    }
}
