package o0000oO;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o0000oO.C24309OooO0O0;
import o0000oo.C24342OooO;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24347OooO0o;
import o0000oo.C24348OooO0o0;
import o0000oo.C24350OooO0oo;

/* JADX INFO: renamed from: o0000oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24313OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C24347OooO0o f81853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f81854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f81855OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C24347OooO0o f81856OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C24309OooO0O0.InterfaceC19609OooO0O0 f81857OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<AbstractC24322OooOOOo> f81858OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C24309OooO0O0.OooO00o f81859OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<C24320OooOOO0> f81860OooO0oo;

    public final void OooO00o(C24312OooO0o c24312OooO0o, int i, ArrayList arrayList, C24320OooOOO0 c24320OooOOO0) {
        AbstractC24322OooOOOo abstractC24322OooOOOo = c24312OooO0o.f81836OooO0Oo;
        if (abstractC24322OooOOOo.f81877OooO0OO == null) {
            C24347OooO0o c24347OooO0o = this.f81853OooO00o;
            if (abstractC24322OooOOOo == c24347OooO0o.f81997OooO0Oo || abstractC24322OooOOOo == c24347OooO0o.f81999OooO0o0) {
                return;
            }
            if (c24320OooOOO0 == null) {
                c24320OooOOO0 = new C24320OooOOO0();
                c24320OooOOO0.f81866OooO00o = null;
                c24320OooOOO0.f81867OooO0O0 = new ArrayList<>();
                c24320OooOOO0.f81866OooO00o = abstractC24322OooOOOo;
                arrayList.add(c24320OooOOO0);
            }
            abstractC24322OooOOOo.f81877OooO0OO = c24320OooOOO0;
            c24320OooOOO0.f81867OooO0O0.add(abstractC24322OooOOOo);
            C24312OooO0o c24312OooO0o2 = abstractC24322OooOOOo.f81882OooO0oo;
            for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo : c24312OooO0o2.f81842OooOO0O) {
                if (interfaceC24311OooO0Oo instanceof C24312OooO0o) {
                    OooO00o((C24312OooO0o) interfaceC24311OooO0Oo, i, arrayList, c24320OooOOO0);
                }
            }
            C24312OooO0o c24312OooO0o3 = abstractC24322OooOOOo.f81874OooO;
            for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo2 : c24312OooO0o3.f81842OooOO0O) {
                if (interfaceC24311OooO0Oo2 instanceof C24312OooO0o) {
                    OooO00o((C24312OooO0o) interfaceC24311OooO0Oo2, i, arrayList, c24320OooOOO0);
                }
            }
            if (i == 1 && (abstractC24322OooOOOo instanceof C24319OooOOO)) {
                for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo3 : ((C24319OooOOO) abstractC24322OooOOOo).f81864OooOO0O.f81842OooOO0O) {
                    if (interfaceC24311OooO0Oo3 instanceof C24312OooO0o) {
                        OooO00o((C24312OooO0o) interfaceC24311OooO0Oo3, i, arrayList, c24320OooOOO0);
                    }
                }
            }
            Iterator it = c24312OooO0o2.f81843OooOO0o.iterator();
            while (it.hasNext()) {
                OooO00o((C24312OooO0o) it.next(), i, arrayList, c24320OooOOO0);
            }
            Iterator it2 = c24312OooO0o3.f81843OooOO0o.iterator();
            while (it2.hasNext()) {
                OooO00o((C24312OooO0o) it2.next(), i, arrayList, c24320OooOOO0);
            }
            if (i == 1 && (abstractC24322OooOOOo instanceof C24319OooOOO)) {
                Iterator it3 = ((C24319OooOOO) abstractC24322OooOOOo).f81864OooOO0O.f81843OooOO0o.iterator();
                while (it3.hasNext()) {
                    OooO00o((C24312OooO0o) it3.next(), i, arrayList, c24320OooOOO0);
                }
            }
        }
    }

    public final void OooO0O0(C24347OooO0o c24347OooO0o) {
        C24348OooO0o0.OooO00o oooO00o;
        C24348OooO0o0.OooO00o oooO00o2;
        C24348OooO0o0.OooO00o oooO00o3;
        float f;
        C24348OooO0o0.OooO00o oooO00o4;
        C24348OooO0o0.OooO00o oooO00o5;
        C24348OooO0o0.OooO00o oooO00o6;
        Iterator<C24348OooO0o0> it = c24347OooO0o.f82127oo000o.iterator();
        while (it.hasNext()) {
            C24348OooO0o0 next = it.next();
            C24348OooO0o0.OooO00o[] oooO00oArr = next.f82039OoooOO0;
            C24348OooO0o0.OooO00o oooO00o7 = oooO00oArr[0];
            C24348OooO0o0.OooO00o oooO00o8 = oooO00oArr[1];
            if (next.f82052OoooooO == 8) {
                next.f81994OooO00o = true;
            } else {
                float f2 = next.f82016OooOo0o;
                C24348OooO0o0.OooO00o oooO00o9 = C24348OooO0o0.OooO00o.f82065OooOoO0;
                if (f2 < 1.0f && oooO00o7 == oooO00o9) {
                    next.f82009OooOOo = 2;
                }
                float f3 = next.f82017OooOoO;
                if (f3 < 1.0f && oooO00o8 == oooO00o9) {
                    next.f82011OooOOoo = 2;
                }
                float f4 = next.f82042OoooOo0;
                C24348OooO0o0.OooO00o oooO00o10 = C24348OooO0o0.OooO00o.f82062OooOo;
                C24348OooO0o0.OooO00o oooO00o11 = C24348OooO0o0.OooO00o.f82063OooOo0o;
                if (f4 > 0.0f) {
                    if (oooO00o7 == oooO00o9 && (oooO00o8 == oooO00o10 || oooO00o8 == oooO00o11)) {
                        next.f82009OooOOo = 3;
                    } else if (oooO00o8 == oooO00o9 && (oooO00o7 == oooO00o10 || oooO00o7 == oooO00o11)) {
                        next.f82011OooOOoo = 3;
                    } else if (oooO00o7 == oooO00o9 && oooO00o8 == oooO00o9) {
                        if (next.f82009OooOOo == 0) {
                            next.f82009OooOOo = 3;
                        }
                        if (next.f82011OooOOoo == 0) {
                            next.f82011OooOOoo = 3;
                        }
                    }
                }
                C24346OooO0Oo c24346OooO0Oo = next.f82032Oooo0o0;
                C24346OooO0Oo c24346OooO0Oo2 = next.f82029Oooo0O0;
                if (oooO00o7 == oooO00o9 && next.f82009OooOOo == 1 && (c24346OooO0Oo2.f81959OooO0o == null || c24346OooO0Oo.f81959OooO0o == null)) {
                    oooO00o7 = oooO00o10;
                }
                C24346OooO0Oo c24346OooO0Oo3 = next.f82031Oooo0o;
                C24346OooO0Oo c24346OooO0Oo4 = next.f82030Oooo0OO;
                if (oooO00o8 == oooO00o9 && next.f82011OooOOoo == 1 && (c24346OooO0Oo4.f81959OooO0o == null || c24346OooO0Oo3.f81959OooO0o == null)) {
                    oooO00o8 = oooO00o10;
                }
                C24318OooOO0o c24318OooOO0o = next.f81997OooO0Oo;
                c24318OooOO0o.f81878OooO0Oo = oooO00o7;
                int i = next.f82009OooOOo;
                c24318OooOO0o.f81875OooO00o = i;
                C24319OooOOO c24319OooOOO = next.f81999OooO0o0;
                c24319OooOOO.f81878OooO0Oo = oooO00o8;
                Iterator<C24348OooO0o0> it2 = it;
                int i2 = next.f82011OooOOoo;
                c24319OooOOO.f81875OooO00o = i2;
                C24348OooO0o0.OooO00o oooO00o12 = C24348OooO0o0.OooO00o.f82064OooOoO;
                if ((oooO00o7 == oooO00o12 || oooO00o7 == oooO00o11 || oooO00o7 == oooO00o10) && (oooO00o8 == oooO00o12 || oooO00o8 == oooO00o11 || oooO00o8 == oooO00o10)) {
                    C24348OooO0o0.OooO00o oooO00o13 = oooO00o8;
                    int iOooOOo0 = next.OooOOo0();
                    if (oooO00o7 == oooO00o12) {
                        iOooOOo0 = (c24347OooO0o.OooOOo0() - c24346OooO0Oo2.f81961OooO0oO) - c24346OooO0Oo.f81961OooO0oO;
                        oooO00o7 = oooO00o11;
                    }
                    int i3 = iOooOOo0;
                    int iOooOO0O = next.OooOO0O();
                    if (oooO00o13 == oooO00o12) {
                        iOooOO0O = (c24347OooO0o.OooOO0O() - c24346OooO0Oo4.f81961OooO0oO) - c24346OooO0Oo3.f81961OooO0oO;
                        oooO00o13 = oooO00o11;
                    }
                    OooO0o(next, oooO00o7, i3, oooO00o13, iOooOO0O);
                    next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                    next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                    next.f81994OooO00o = true;
                } else {
                    C24348OooO0o0.OooO00o[] oooO00oArr2 = c24347OooO0o.f82039OoooOO0;
                    C24346OooO0Oo[] c24346OooO0OoArr = next.f82036OoooO0;
                    if (oooO00o7 != oooO00o9 || (oooO00o8 != oooO00o10 && oooO00o8 != oooO00o11)) {
                        oooO00o = oooO00o7;
                        oooO00o2 = oooO00o10;
                        oooO00o3 = oooO00o11;
                        f = f3;
                        oooO00o4 = oooO00o8;
                    } else if (i == 3) {
                        if (oooO00o8 == oooO00o10) {
                            OooO0o(next, oooO00o10, 0, oooO00o10, 0);
                        }
                        int iOooOO0O2 = next.OooOO0O();
                        OooO0o(next, oooO00o11, (int) ((iOooOO0O2 * next.f82042OoooOo0) + 0.5f), oooO00o11, iOooOO0O2);
                        next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                        next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                        next.f81994OooO00o = true;
                    } else {
                        oooO00o = oooO00o7;
                        oooO00o2 = oooO00o10;
                        oooO00o3 = oooO00o11;
                        if (i == 1) {
                            OooO0o(next, oooO00o2, 0, oooO00o8, 0);
                            next.f81997OooO0Oo.f81880OooO0o0.f81861OooOOO0 = next.OooOOo0();
                        } else {
                            f = f3;
                            oooO00o4 = oooO00o8;
                            if (i == 2) {
                                C24348OooO0o0.OooO00o oooO00o14 = oooO00oArr2[0];
                                if (oooO00o14 == oooO00o3 || oooO00o14 == oooO00o12) {
                                    OooO0o(next, oooO00o3, (int) ((f2 * c24347OooO0o.OooOOo0()) + 0.5f), oooO00o4, next.OooOO0O());
                                    next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                                    next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                                    next.f81994OooO00o = true;
                                }
                            } else if (c24346OooO0OoArr[0].f81959OooO0o == null || c24346OooO0OoArr[1].f81959OooO0o == null) {
                                OooO0o(next, oooO00o2, 0, oooO00o4, 0);
                                next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                                next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                                next.f81994OooO00o = true;
                            }
                        }
                    }
                    if (oooO00o4 != oooO00o9 || (oooO00o != oooO00o2 && oooO00o != oooO00o3)) {
                        C24348OooO0o0.OooO00o oooO00o15 = oooO00o;
                        oooO00o5 = oooO00o2;
                        oooO00o6 = oooO00o15;
                    } else if (i2 == 3) {
                        if (oooO00o == oooO00o2) {
                            OooO0o(next, oooO00o2, 0, oooO00o2, 0);
                        }
                        int iOooOOo02 = next.OooOOo0();
                        float f5 = next.f82042OoooOo0;
                        if (next.f82043OoooOoO == -1) {
                            f5 = 1.0f / f5;
                        }
                        OooO0o(next, oooO00o3, iOooOOo02, oooO00o3, (int) ((iOooOOo02 * f5) + 0.5f));
                        next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                        next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                        next.f81994OooO00o = true;
                    } else if (i2 == 1) {
                        OooO0o(next, oooO00o, 0, oooO00o2, 0);
                        next.f81999OooO0o0.f81880OooO0o0.f81861OooOOO0 = next.OooOO0O();
                    } else {
                        C24348OooO0o0.OooO00o oooO00o16 = oooO00o;
                        oooO00o5 = oooO00o2;
                        if (i2 == 2) {
                            C24348OooO0o0.OooO00o oooO00o17 = oooO00oArr2[1];
                            if (oooO00o17 == oooO00o3 || oooO00o17 == oooO00o12) {
                                OooO0o(next, oooO00o16, next.OooOOo0(), oooO00o3, (int) ((f * c24347OooO0o.OooOO0O()) + 0.5f));
                                next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                                next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                                next.f81994OooO00o = true;
                            } else {
                                oooO00o6 = oooO00o16;
                            }
                        } else {
                            oooO00o6 = oooO00o16;
                            if (c24346OooO0OoArr[2].f81959OooO0o == null || c24346OooO0OoArr[3].f81959OooO0o == null) {
                                OooO0o(next, oooO00o5, 0, oooO00o4, 0);
                                next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                                next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                                next.f81994OooO00o = true;
                            }
                        }
                    }
                    if (oooO00o6 == oooO00o9 && oooO00o4 == oooO00o9) {
                        if (i == 1 || i2 == 1) {
                            OooO0o(next, oooO00o5, 0, oooO00o5, 0);
                            next.f81997OooO0Oo.f81880OooO0o0.f81861OooOOO0 = next.OooOOo0();
                            next.f81999OooO0o0.f81880OooO0o0.f81861OooOOO0 = next.OooOO0O();
                        } else if (i2 == 2 && i == 2 && oooO00oArr2[0] == oooO00o3 && oooO00oArr2[1] == oooO00o3) {
                            OooO0o(next, oooO00o3, (int) ((f2 * c24347OooO0o.OooOOo0()) + 0.5f), oooO00o3, (int) ((f * c24347OooO0o.OooOO0O()) + 0.5f));
                            next.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(next.OooOOo0());
                            next.f81999OooO0o0.f81880OooO0o0.OooO0Oo(next.OooOO0O());
                            next.f81994OooO00o = true;
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void OooO0OO() {
        ArrayList<AbstractC24322OooOOOo> arrayList = this.f81858OooO0o0;
        arrayList.clear();
        C24347OooO0o c24347OooO0o = this.f81856OooO0Oo;
        c24347OooO0o.f81997OooO0Oo.OooO0o();
        c24347OooO0o.f81999OooO0o0.OooO0o();
        arrayList.add(c24347OooO0o.f81997OooO0Oo);
        arrayList.add(c24347OooO0o.f81999OooO0o0);
        HashSet hashSet = null;
        for (C24348OooO0o0 c24348OooO0o0 : c24347OooO0o.f82127oo000o) {
            if (c24348OooO0o0 instanceof C24350OooO0oo) {
                C24316OooOO0 c24316OooOO0 = new C24316OooOO0(c24348OooO0o0);
                c24348OooO0o0.f81997OooO0Oo.OooO0o();
                c24348OooO0o0.f81999OooO0o0.OooO0o();
                c24316OooOO0.f81879OooO0o = ((C24350OooO0oo) c24348OooO0o0).f82112o0ooOOo;
                arrayList.add(c24316OooOO0);
            } else {
                if (c24348OooO0o0.OooOo()) {
                    if (c24348OooO0o0.f81995OooO0O0 == null) {
                        c24348OooO0o0.f81995OooO0O0 = new C24310OooO0OO(c24348OooO0o0, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c24348OooO0o0.f81995OooO0O0);
                } else {
                    arrayList.add(c24348OooO0o0.f81997OooO0Oo);
                }
                if (c24348OooO0o0.OooOoO0()) {
                    if (c24348OooO0o0.f81996OooO0OO == null) {
                        c24348OooO0o0.f81996OooO0OO = new C24310OooO0OO(c24348OooO0o0, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c24348OooO0o0.f81996OooO0OO);
                } else {
                    arrayList.add(c24348OooO0o0.f81999OooO0o0);
                }
                if (c24348OooO0o0 instanceof C24342OooO) {
                    arrayList.add(new C24317OooOO0O(c24348OooO0o0));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC24322OooOOOo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
        for (AbstractC24322OooOOOo abstractC24322OooOOOo : arrayList) {
            if (abstractC24322OooOOOo.f81876OooO0O0 != c24347OooO0o) {
                abstractC24322OooOOOo.OooO0Oo();
            }
        }
        ArrayList<C24320OooOOO0> arrayList2 = this.f81860OooO0oo;
        arrayList2.clear();
        C24347OooO0o c24347OooO0o2 = this.f81853OooO00o;
        OooO0o0(c24347OooO0o2.f81997OooO0Oo, 0, arrayList2);
        OooO0o0(c24347OooO0o2.f81999OooO0o0, 1, arrayList2);
        this.f81854OooO0O0 = false;
    }

    public final int OooO0Oo(C24347OooO0o c24347OooO0o, int i) {
        ArrayList<C24320OooOOO0> arrayList;
        int i2;
        int i3;
        long jMax;
        float f;
        C24347OooO0o c24347OooO0o2 = c24347OooO0o;
        ArrayList<C24320OooOOO0> arrayList2 = this.f81860OooO0oo;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            AbstractC24322OooOOOo abstractC24322OooOOOo = arrayList2.get(i4).f81866OooO00o;
            if (!(abstractC24322OooOOOo instanceof C24310OooO0OO) ? !(i != 0 ? (abstractC24322OooOOOo instanceof C24319OooOOO) : (abstractC24322OooOOOo instanceof C24318OooOO0o)) : ((C24310OooO0OO) abstractC24322OooOOOo).f81879OooO0o != i) {
                C24312OooO0o c24312OooO0o = (i == 0 ? c24347OooO0o2.f81997OooO0Oo : c24347OooO0o2.f81999OooO0o0).f81882OooO0oo;
                C24312OooO0o c24312OooO0o2 = (i == 0 ? c24347OooO0o2.f81997OooO0Oo : c24347OooO0o2.f81999OooO0o0).f81874OooO;
                boolean zContains = abstractC24322OooOOOo.f81882OooO0oo.f81843OooOO0o.contains(c24312OooO0o);
                C24312OooO0o c24312OooO0o3 = abstractC24322OooOOOo.f81874OooO;
                boolean zContains2 = c24312OooO0o3.f81843OooOO0o.contains(c24312OooO0o2);
                long jOooOO0 = abstractC24322OooOOOo.OooOO0();
                C24312OooO0o c24312OooO0o4 = abstractC24322OooOOOo.f81882OooO0oo;
                if (zContains && zContains2) {
                    long jOooO0O0 = C24320OooOOO0.OooO0O0(c24312OooO0o4, 0L);
                    ArrayList<C24320OooOOO0> arrayList3 = arrayList2;
                    i2 = size;
                    long jOooO00o = C24320OooOOO0.OooO00o(c24312OooO0o3, 0L);
                    long j = jOooO0O0 - jOooOO0;
                    int i5 = c24312OooO0o3.f81837OooO0o;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j >= (-i5)) {
                        j += (long) i5;
                    }
                    long j2 = (-jOooO00o) - jOooOO0;
                    long j3 = c24312OooO0o4.f81837OooO0o;
                    long j4 = j2 - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C24348OooO0o0 c24348OooO0o0 = abstractC24322OooOOOo.f81876OooO0O0;
                    if (i == 0) {
                        f = c24348OooO0o0.f82049OooooOo;
                    } else if (i == 1) {
                        f = c24348OooO0o0.f82051Oooooo0;
                    } else {
                        c24348OooO0o0.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c24312OooO0o4.f81837OooO0o) + ((((long) ((f2 * f) + 0.5f)) + jOooOO0) + ((long) OooOO0.OooO0OO.OooO0O0(1.0f, f, f2, 0.5f)))) - ((long) c24312OooO0o3.f81837OooO0o);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    jMax = zContains ? Math.max(C24320OooOOO0.OooO0O0(c24312OooO0o4, c24312OooO0o4.f81837OooO0o), ((long) c24312OooO0o4.f81837OooO0o) + jOooOO0) : zContains2 ? Math.max(-C24320OooOOO0.OooO00o(c24312OooO0o3, c24312OooO0o3.f81837OooO0o), ((long) (-c24312OooO0o3.f81837OooO0o)) + jOooOO0) : (abstractC24322OooOOOo.OooOO0() + ((long) c24312OooO0o4.f81837OooO0o)) - ((long) c24312OooO0o3.f81837OooO0o);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4 = i3 + 1;
            c24347OooO0o2 = c24347OooO0o;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public final void OooO0o(C24348OooO0o0 c24348OooO0o0, C24348OooO0o0.OooO00o oooO00o, int i, C24348OooO0o0.OooO00o oooO00o2, int i2) {
        C24309OooO0O0.OooO00o oooO00o3 = this.f81859OooO0oO;
        oooO00o3.f81821OooO00o = oooO00o;
        oooO00o3.f81822OooO0O0 = oooO00o2;
        oooO00o3.f81823OooO0OO = i;
        oooO00o3.f81824OooO0Oo = i2;
        ((ConstraintLayout.OooO0O0) this.f81857OooO0o).OooO0O0(c24348OooO0o0, oooO00o3);
        c24348OooO0o0.Oooo0oo(oooO00o3.f81826OooO0o0);
        c24348OooO0o0.Oooo0o0(oooO00o3.f81825OooO0o);
        c24348OooO0o0.f82023OooOooo = oooO00o3.f81828OooO0oo;
        c24348OooO0o0.Oooo0(oooO00o3.f81827OooO0oO);
    }

    public final void OooO0o0(AbstractC24322OooOOOo abstractC24322OooOOOo, int i, ArrayList<C24320OooOOO0> arrayList) {
        C24312OooO0o c24312OooO0o;
        Iterator it = abstractC24322OooOOOo.f81882OooO0oo.f81842OooOO0O.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c24312OooO0o = abstractC24322OooOOOo.f81874OooO;
            if (!zHasNext) {
                break;
            }
            InterfaceC24311OooO0Oo interfaceC24311OooO0Oo = (InterfaceC24311OooO0Oo) it.next();
            if (interfaceC24311OooO0Oo instanceof C24312OooO0o) {
                OooO00o((C24312OooO0o) interfaceC24311OooO0Oo, i, arrayList, null);
            } else if (interfaceC24311OooO0Oo instanceof AbstractC24322OooOOOo) {
                OooO00o(((AbstractC24322OooOOOo) interfaceC24311OooO0Oo).f81882OooO0oo, i, arrayList, null);
            }
        }
        for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo2 : c24312OooO0o.f81842OooOO0O) {
            if (interfaceC24311OooO0Oo2 instanceof C24312OooO0o) {
                OooO00o((C24312OooO0o) interfaceC24311OooO0Oo2, i, arrayList, null);
            } else if (interfaceC24311OooO0Oo2 instanceof AbstractC24322OooOOOo) {
                OooO00o(((AbstractC24322OooOOOo) interfaceC24311OooO0Oo2).f81874OooO, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo3 : ((C24319OooOOO) abstractC24322OooOOOo).f81864OooOO0O.f81842OooOO0O) {
                if (interfaceC24311OooO0Oo3 instanceof C24312OooO0o) {
                    OooO00o((C24312OooO0o) interfaceC24311OooO0Oo3, i, arrayList, null);
                }
            }
        }
    }

    public final void OooO0oO() {
        C24308OooO00o c24308OooO00o;
        for (C24348OooO0o0 c24348OooO0o0 : this.f81853OooO00o.f82127oo000o) {
            if (!c24348OooO0o0.f81994OooO00o) {
                C24348OooO0o0.OooO00o[] oooO00oArr = c24348OooO0o0.f82039OoooOO0;
                boolean z = false;
                C24348OooO0o0.OooO00o oooO00o = oooO00oArr[0];
                C24348OooO0o0.OooO00o oooO00o2 = oooO00oArr[1];
                int i = c24348OooO0o0.f82009OooOOo;
                int i2 = c24348OooO0o0.f82011OooOOoo;
                C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82062OooOo;
                C24348OooO0o0.OooO00o oooO00o4 = C24348OooO0o0.OooO00o.f82065OooOoO0;
                boolean z2 = oooO00o == oooO00o3 || (oooO00o == oooO00o4 && i == 1);
                if (oooO00o2 == oooO00o3 || (oooO00o2 == oooO00o4 && i2 == 1)) {
                    z = true;
                }
                C24314OooO0oO c24314OooO0oO = c24348OooO0o0.f81997OooO0Oo.f81880OooO0o0;
                boolean z3 = c24314OooO0oO.f81841OooOO0;
                C24314OooO0oO c24314OooO0oO2 = c24348OooO0o0.f81999OooO0o0.f81880OooO0o0;
                boolean z4 = c24314OooO0oO2.f81841OooOO0;
                boolean z5 = z2;
                C24348OooO0o0.OooO00o oooO00o5 = C24348OooO0o0.OooO00o.f82063OooOo0o;
                if (z3 && z4) {
                    OooO0o(c24348OooO0o0, oooO00o5, c24314OooO0oO.f81839OooO0oO, oooO00o5, c24314OooO0oO2.f81839OooO0oO);
                    c24348OooO0o0.f81994OooO00o = true;
                } else if (z3 && z) {
                    OooO0o(c24348OooO0o0, oooO00o5, c24314OooO0oO.f81839OooO0oO, oooO00o3, c24314OooO0oO2.f81839OooO0oO);
                    if (oooO00o2 == oooO00o4) {
                        c24348OooO0o0.f81999OooO0o0.f81880OooO0o0.f81861OooOOO0 = c24348OooO0o0.OooOO0O();
                    } else {
                        c24348OooO0o0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(c24348OooO0o0.OooOO0O());
                        c24348OooO0o0.f81994OooO00o = true;
                    }
                } else if (z4 && z5) {
                    OooO0o(c24348OooO0o0, oooO00o3, c24314OooO0oO.f81839OooO0oO, oooO00o5, c24314OooO0oO2.f81839OooO0oO);
                    if (oooO00o == oooO00o4) {
                        c24348OooO0o0.f81997OooO0Oo.f81880OooO0o0.f81861OooOOO0 = c24348OooO0o0.OooOOo0();
                    } else {
                        c24348OooO0o0.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(c24348OooO0o0.OooOOo0());
                        c24348OooO0o0.f81994OooO00o = true;
                    }
                }
                if (c24348OooO0o0.f81994OooO00o && (c24308OooO00o = c24348OooO0o0.f81999OooO0o0.f81865OooOO0o) != null) {
                    c24308OooO00o.OooO0Oo(c24348OooO0o0.f82046Ooooo0o);
                }
            }
        }
    }
}
