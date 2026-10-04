package o0000;

import java.util.ArrayList;
import java.util.Arrays;
import o0000.C24043OooO0oO.OooO0O0;
import o0000.C24044OooO0oo;
import o0000oo.C24346OooO0Oo;

/* JADX INFO: renamed from: o0000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24041OooO0Oo {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static boolean f80982OooOOo0 = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24043OooO0oO f80987OooO0Oo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO0OO f80996OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0O0 f80998OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f80984OooO00o = 1000;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f80985OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f80986OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f80989OooO0o0 = 32;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f80988OooO0o = 32;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f80991OooO0oo = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean[] f80983OooO = new boolean[32];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f80992OooOO0 = 1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f80993OooOO0O = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f80994OooOO0o = 32;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public C24044OooO0oo[] f80995OooOOO = new C24044OooO0oo[1000];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f80997OooOOOO = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0O0[] f80990OooO0oO = new OooO0O0[32];

    /* JADX INFO: renamed from: o0000.OooO0Oo$OooO00o */
    public interface OooO00o {
        C24044OooO0oo OooO00o(boolean[] zArr);
    }

    public C24041OooO0Oo() {
        OooOOoo();
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f80979OooO00o = new OooO0o();
        oooO0OO.f80980OooO0O0 = new OooO0o();
        oooO0OO.f80981OooO0OO = new C24044OooO0oo[32];
        this.f80996OooOOO0 = oooO0OO;
        C24043OooO0oO c24043OooO0oO = new C24043OooO0oO(oooO0OO);
        c24043OooO0oO.f81002OooO0o = new C24044OooO0oo[128];
        c24043OooO0oO.f81003OooO0oO = new C24044OooO0oo[128];
        c24043OooO0oO.f81004OooO0oo = 0;
        c24043OooO0oO.f81001OooO = c24043OooO0oO.new OooO0O0();
        this.f80987OooO0Oo = c24043OooO0oO;
        this.f80998OooOOOo = new OooO0O0(oooO0OO);
    }

    public static int OooOOO(Object obj) {
        C24044OooO0oo c24044OooO0oo = ((C24346OooO0Oo) obj).f81954OooO;
        if (c24044OooO0oo != null) {
            return (int) (c24044OooO0oo.f81011OooOoOO + 0.5f);
        }
        return 0;
    }

    public final void OooO() {
        for (int i = 0; i < this.f80993OooOO0O; i++) {
            OooO0O0 oooO0O0 = this.f80990OooO0oO[i];
            oooO0O0.f80974OooO00o.f81011OooOoOO = oooO0O0.f80975OooO0O0;
        }
    }

    public final C24044OooO0oo OooO00o(C24044OooO0oo.OooO00o oooO00o) {
        OooO0o oooO0o = this.f80996OooOOO0.f80980OooO0O0;
        int i = oooO0o.f81000OooO0O0;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = oooO0o.f80999OooO00o;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            oooO0o.f81000OooO0O0 = i2;
            obj = obj2;
        }
        C24044OooO0oo c24044OooO0oo = (C24044OooO0oo) obj;
        if (c24044OooO0oo == null) {
            c24044OooO0oo = new C24044OooO0oo(oooO00o);
            c24044OooO0oo.f81015OooOooo = oooO00o;
        } else {
            c24044OooO0oo.OooO0OO();
            c24044OooO0oo.f81015OooOooo = oooO00o;
        }
        int i3 = this.f80997OooOOOO;
        int i4 = this.f80984OooO00o;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f80984OooO00o = i5;
            this.f80995OooOOO = (C24044OooO0oo[]) Arrays.copyOf(this.f80995OooOOO, i5);
        }
        C24044OooO0oo[] c24044OooO0ooArr = this.f80995OooOOO;
        int i6 = this.f80997OooOOOO;
        this.f80997OooOOOO = i6 + 1;
        c24044OooO0ooArr[i6] = c24044OooO0oo;
        return c24044OooO0oo;
    }

    public final void OooO0O0(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2, int i, float f, C24044OooO0oo c24044OooO0oo3, C24044OooO0oo c24044OooO0oo4, int i2, int i3) {
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        if (c24044OooO0oo2 == c24044OooO0oo3) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo, 1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo4, 1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, -2.0f);
        } else if (f == 0.5f) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo, 1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, -1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, -1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo4, 1.0f);
            if (i > 0 || i2 > 0) {
                oooO0O0OooOO0o.f80975OooO0O0 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo, -1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, 1.0f);
            oooO0O0OooOO0o.f80975OooO0O0 = i;
        } else if (f >= 1.0f) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo4, -1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, 1.0f);
            oooO0O0OooOO0o.f80975OooO0O0 = -i2;
        } else {
            float f2 = 1.0f - f;
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo, f2 * 1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, f2 * (-1.0f));
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, (-1.0f) * f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                oooO0O0OooOO0o.f80975OooO0O0 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            oooO0O0OooOO0o.OooO0O0(this, i3);
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(OooO0O0 oooO0O0) {
        boolean z;
        C24044OooO0oo.OooO00o oooO00o;
        boolean z2;
        C24044OooO0oo c24044OooO0oo;
        C24044OooO0oo c24044OooO0ooOooO0o;
        ArrayList<C24044OooO0oo> arrayList;
        boolean z3 = true;
        if (this.f80993OooOO0O + 1 >= this.f80994OooOO0o || this.f80992OooOO0 + 1 >= this.f80988OooO0o) {
            OooOOOO();
        }
        if (oooO0O0.f80978OooO0o0) {
            z = false;
        } else {
            if (this.f80990OooO0oO.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iOooO = oooO0O0.f80977OooO0Oo.OooO();
                    int i = 0;
                    while (true) {
                        arrayList = oooO0O0.f80976OooO0OO;
                        if (i >= iOooO) {
                            break;
                        }
                        C24044OooO0oo c24044OooO0ooOooO00o = oooO0O0.f80977OooO0Oo.OooO00o(i);
                        if (c24044OooO0ooOooO00o.f81010OooOoO0 != -1 || c24044OooO0ooOooO00o.f81013OooOoo0) {
                            arrayList.add(c24044OooO0ooOooO00o);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C24044OooO0oo c24044OooO0oo2 = arrayList.get(i2);
                            if (c24044OooO0oo2.f81013OooOoo0) {
                                oooO0O0.OooO0oo(this, c24044OooO0oo2, true);
                            } else {
                                oooO0O0.OooO(this, this.f80990OooO0oO[c24044OooO0oo2.f81010OooOoO0], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (oooO0O0.f80974OooO00o != null && oooO0O0.f80977OooO0Oo.OooO() == 0) {
                    oooO0O0.f80978OooO0o0 = true;
                    this.f80985OooO0O0 = true;
                }
            }
            if (oooO0O0.OooO0o0()) {
                return;
            }
            float f = oooO0O0.f80975OooO0O0;
            float f2 = 0.0f;
            if (f < 0.0f) {
                oooO0O0.f80975OooO0O0 = f * (-1.0f);
                oooO0O0.f80977OooO0Oo.OooO0oO();
            }
            int iOooO2 = oooO0O0.f80977OooO0Oo.OooO();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C24044OooO0oo c24044OooO0oo3 = null;
            C24044OooO0oo c24044OooO0oo4 = null;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                oooO00o = C24044OooO0oo.OooO00o.f81020OooOo0o;
                if (i3 >= iOooO2) {
                    break;
                }
                float fOooOO0 = oooO0O0.f80977OooO0Oo.OooOO0(i3);
                float f5 = f2;
                C24044OooO0oo c24044OooO0ooOooO00o2 = oooO0O0.f80977OooO0Oo.OooO00o(i3);
                if (c24044OooO0ooOooO00o2.f81015OooOooo == oooO00o) {
                    if (c24044OooO0oo3 == null) {
                        z5 = c24044OooO0ooOooO00o2.f81018Oooo00o <= 1;
                    } else if (f3 > fOooOO0) {
                        if (c24044OooO0ooOooO00o2.f81018Oooo00o <= 1) {
                        }
                    } else if (z5 || c24044OooO0ooOooO00o2.f81018Oooo00o > 1) {
                    }
                    f3 = fOooOO0;
                    c24044OooO0oo3 = c24044OooO0ooOooO00o2;
                } else if (c24044OooO0oo3 == null && fOooOO0 < f5) {
                    if (c24044OooO0oo4 == null) {
                        z6 = c24044OooO0ooOooO00o2.f81018Oooo00o <= 1;
                    } else if (f4 > fOooOO0) {
                        if (c24044OooO0ooOooO00o2.f81018Oooo00o <= 1) {
                        }
                    } else if (z6 || c24044OooO0ooOooO00o2.f81018Oooo00o > 1) {
                    }
                    f4 = fOooOO0;
                    c24044OooO0oo4 = c24044OooO0ooOooO00o2;
                }
                i3++;
                f2 = f5;
            }
            float f6 = f2;
            if (c24044OooO0oo3 == null) {
                c24044OooO0oo3 = c24044OooO0oo4;
            }
            if (c24044OooO0oo3 == null) {
                z2 = true;
            } else {
                oooO0O0.OooO0oO(c24044OooO0oo3);
                z2 = false;
            }
            if (oooO0O0.f80977OooO0Oo.OooO() == 0) {
                oooO0O0.f80978OooO0o0 = true;
            }
            if (z2) {
                if (this.f80992OooOO0 + 1 >= this.f80988OooO0o) {
                    OooOOOO();
                }
                C24044OooO0oo c24044OooO0ooOooO00o3 = OooO00o(C24044OooO0oo.OooO00o.f81019OooOo);
                int i4 = this.f80986OooO0OO + 1;
                this.f80986OooO0OO = i4;
                this.f80992OooOO0++;
                c24044OooO0ooOooO00o3.f81007OooOo = i4;
                OooO0OO oooO0OO = this.f80996OooOOO0;
                oooO0OO.f80981OooO0OO[i4] = c24044OooO0ooOooO00o3;
                oooO0O0.f80974OooO00o = c24044OooO0ooOooO00o3;
                int i5 = this.f80993OooOO0O;
                OooO0oo(oooO0O0);
                if (this.f80993OooOO0O == i5 + 1) {
                    OooO0O0 oooO0O02 = this.f80998OooOOOo;
                    oooO0O02.getClass();
                    oooO0O02.f80974OooO00o = null;
                    oooO0O02.f80977OooO0Oo.clear();
                    for (int i6 = 0; i6 < oooO0O0.f80977OooO0Oo.OooO(); i6++) {
                        oooO0O02.f80977OooO0Oo.OooO0O0(oooO0O0.f80977OooO0Oo.OooO00o(i6), oooO0O0.f80977OooO0Oo.OooOO0(i6), true);
                    }
                    OooOOo(this.f80998OooOOOo);
                    if (c24044OooO0ooOooO00o3.f81010OooOoO0 == -1) {
                        if (oooO0O0.f80974OooO00o == c24044OooO0ooOooO00o3 && (c24044OooO0ooOooO0o = oooO0O0.OooO0o(null, c24044OooO0ooOooO00o3)) != null) {
                            oooO0O0.OooO0oO(c24044OooO0ooOooO0o);
                        }
                        if (!oooO0O0.f80978OooO0o0) {
                            oooO0O0.f80974OooO00o.OooO0o0(this, oooO0O0);
                        }
                        oooO0OO.f80979OooO00o.OooO00o(oooO0O0);
                        this.f80993OooOO0O--;
                    }
                }
                c24044OooO0oo = oooO0O0.f80974OooO00o;
                if (c24044OooO0oo != null) {
                }
            } else {
                z3 = false;
                c24044OooO0oo = oooO0O0.f80974OooO00o;
                if (c24044OooO0oo != null) {
                    return;
                }
                if (c24044OooO0oo.f81015OooOooo != oooO00o && oooO0O0.f80975OooO0O0 < f6) {
                    return;
                } else {
                    z = z3;
                }
            }
        }
        if (z) {
            return;
        }
        OooO0oo(oooO0O0);
    }

    public final void OooO0Oo(C24044OooO0oo c24044OooO0oo, int i) {
        int i2 = c24044OooO0oo.f81010OooOoO0;
        if (i2 == -1) {
            c24044OooO0oo.OooO0Oo(this, i);
            for (int i3 = 0; i3 < this.f80986OooO0OO + 1; i3++) {
                C24044OooO0oo c24044OooO0oo2 = this.f80996OooOOO0.f80981OooO0OO[i3];
            }
            return;
        }
        if (i2 == -1) {
            OooO0O0 oooO0O0OooOO0o = OooOO0o();
            oooO0O0OooOO0o.f80974OooO00o = c24044OooO0oo;
            float f = i;
            c24044OooO0oo.f81011OooOoOO = f;
            oooO0O0OooOO0o.f80975OooO0O0 = f;
            oooO0O0OooOO0o.f80978OooO0o0 = true;
            OooO0OO(oooO0O0OooOO0o);
            return;
        }
        OooO0O0 oooO0O0 = this.f80990OooO0oO[i2];
        if (oooO0O0.f80978OooO0o0) {
            oooO0O0.f80975OooO0O0 = i;
            return;
        }
        if (oooO0O0.f80977OooO0Oo.OooO() == 0) {
            oooO0O0.f80978OooO0o0 = true;
            oooO0O0.f80975OooO0O0 = i;
            return;
        }
        OooO0O0 oooO0O0OooOO0o2 = OooOO0o();
        if (i < 0) {
            oooO0O0OooOO0o2.f80975OooO0O0 = i * (-1);
            oooO0O0OooOO0o2.f80977OooO0Oo.OooOO0O(c24044OooO0oo, 1.0f);
        } else {
            oooO0O0OooOO0o2.f80975OooO0O0 = i;
            oooO0O0OooOO0o2.f80977OooO0Oo.OooOO0O(c24044OooO0oo, -1.0f);
        }
        OooO0OO(oooO0O0OooOO0o2);
    }

    public final void OooO0o(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2, int i, int i2) {
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        C24044OooO0oo c24044OooO0ooOooOOO0 = OooOOO0();
        c24044OooO0ooOooOOO0.f81009OooOoO = 0;
        oooO0O0OooOO0o.OooO0OO(c24044OooO0oo, c24044OooO0oo2, c24044OooO0ooOooOOO0, i);
        if (i2 != 8) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(OooOO0(i2), (int) (oooO0O0OooOO0o.f80977OooO0Oo.OooO0oo(c24044OooO0ooOooOOO0) * (-1.0f)));
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    public final void OooO0o0(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2, int i, int i2) {
        if (i2 == 8 && c24044OooO0oo2.f81013OooOoo0 && c24044OooO0oo.f81010OooOoO0 == -1) {
            c24044OooO0oo.OooO0Oo(this, c24044OooO0oo2.f81011OooOoOO + i);
            return;
        }
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            oooO0O0OooOO0o.f80975OooO0O0 = i;
        }
        if (z) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo, 1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, -1.0f);
        } else {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo, -1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, 1.0f);
        }
        if (i2 != 8) {
            oooO0O0OooOO0o.OooO0O0(this, i2);
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    public final void OooO0oO(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2, int i, int i2) {
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        C24044OooO0oo c24044OooO0ooOooOOO0 = OooOOO0();
        c24044OooO0ooOooOOO0.f81009OooOoO = 0;
        oooO0O0OooOO0o.OooO0Oo(c24044OooO0oo, c24044OooO0oo2, c24044OooO0ooOooOOO0, i);
        if (i2 != 8) {
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(OooOO0(i2), (int) (oooO0O0OooOO0o.f80977OooO0Oo.OooO0oo(c24044OooO0ooOooOOO0) * (-1.0f)));
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    public final void OooO0oo(OooO0O0 oooO0O0) {
        int i;
        if (oooO0O0.f80978OooO0o0) {
            oooO0O0.f80974OooO00o.OooO0Oo(this, oooO0O0.f80975OooO0O0);
        } else {
            OooO0O0[] oooO0O0Arr = this.f80990OooO0oO;
            int i2 = this.f80993OooOO0O;
            oooO0O0Arr[i2] = oooO0O0;
            C24044OooO0oo c24044OooO0oo = oooO0O0.f80974OooO00o;
            c24044OooO0oo.f81010OooOoO0 = i2;
            this.f80993OooOO0O = i2 + 1;
            c24044OooO0oo.OooO0o0(this, oooO0O0);
        }
        if (this.f80985OooO0O0) {
            int i3 = 0;
            while (i3 < this.f80993OooOO0O) {
                if (this.f80990OooO0oO[i3] == null) {
                    System.out.println("WTF");
                }
                OooO0O0 oooO0O02 = this.f80990OooO0oO[i3];
                if (oooO0O02 != null && oooO0O02.f80978OooO0o0) {
                    oooO0O02.f80974OooO00o.OooO0Oo(this, oooO0O02.f80975OooO0O0);
                    this.f80996OooOOO0.f80979OooO00o.OooO00o(oooO0O02);
                    this.f80990OooO0oO[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f80993OooOO0O;
                        if (i4 >= i) {
                            break;
                        }
                        OooO0O0[] oooO0O0Arr2 = this.f80990OooO0oO;
                        int i6 = i4 - 1;
                        OooO0O0 oooO0O03 = oooO0O0Arr2[i4];
                        oooO0O0Arr2[i6] = oooO0O03;
                        C24044OooO0oo c24044OooO0oo2 = oooO0O03.f80974OooO00o;
                        if (c24044OooO0oo2.f81010OooOoO0 == i4) {
                            c24044OooO0oo2.f81010OooOoO0 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f80990OooO0oO[i5] = null;
                    }
                    this.f80993OooOO0O = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f80985OooO0O0 = false;
        }
    }

    public final C24044OooO0oo OooOO0(int i) {
        if (this.f80992OooOO0 + 1 >= this.f80988OooO0o) {
            OooOOOO();
        }
        C24044OooO0oo c24044OooO0ooOooO00o = OooO00o(C24044OooO0oo.OooO00o.f81022OooOoO0);
        int i2 = this.f80986OooO0OO + 1;
        this.f80986OooO0OO = i2;
        this.f80992OooOO0++;
        c24044OooO0ooOooO00o.f81007OooOo = i2;
        c24044OooO0ooOooO00o.f81009OooOoO = i;
        this.f80996OooOOO0.f80981OooO0OO[i2] = c24044OooO0ooOooO00o;
        C24043OooO0oO c24043OooO0oO = this.f80987OooO0Oo;
        c24043OooO0oO.f81001OooO.f81005OooO00o = c24044OooO0ooOooO00o;
        float[] fArr = c24044OooO0ooOooO00o.f81014OooOooO;
        Arrays.fill(fArr, 0.0f);
        fArr[c24044OooO0ooOooO00o.f81009OooOoO] = 1.0f;
        c24043OooO0oO.OooOO0(c24044OooO0ooOooO00o);
        return c24044OooO0ooOooO00o;
    }

    public final C24044OooO0oo OooOO0O(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f80992OooOO0 + 1 >= this.f80988OooO0o) {
            OooOOOO();
        }
        if (!(obj instanceof C24346OooO0Oo)) {
            return null;
        }
        C24346OooO0Oo c24346OooO0Oo = (C24346OooO0Oo) obj;
        C24044OooO0oo c24044OooO0oo = c24346OooO0Oo.f81954OooO;
        if (c24044OooO0oo == null) {
            c24346OooO0Oo.OooOO0O();
            c24044OooO0oo = c24346OooO0Oo.f81954OooO;
        }
        int i = c24044OooO0oo.f81007OooOo;
        OooO0OO oooO0OO = this.f80996OooOOO0;
        if (i != -1 && i <= this.f80986OooO0OO && oooO0OO.f80981OooO0OO[i] != null) {
            return c24044OooO0oo;
        }
        if (i != -1) {
            c24044OooO0oo.OooO0OO();
        }
        int i2 = this.f80986OooO0OO + 1;
        this.f80986OooO0OO = i2;
        this.f80992OooOO0++;
        c24044OooO0oo.f81007OooOo = i2;
        c24044OooO0oo.f81015OooOooo = C24044OooO0oo.OooO00o.f81020OooOo0o;
        oooO0OO.f80981OooO0OO[i2] = c24044OooO0oo;
        return c24044OooO0oo;
    }

    public final OooO0O0 OooOO0o() {
        Object obj;
        OooO0OO oooO0OO = this.f80996OooOOO0;
        OooO0o oooO0o = oooO0OO.f80979OooO00o;
        int i = oooO0o.f81000OooO0O0;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = oooO0o.f80999OooO00o;
            obj = objArr[i2];
            objArr[i2] = null;
            oooO0o.f81000OooO0O0 = i2;
        } else {
            obj = null;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        if (oooO0O0 == null) {
            return new OooO0O0(oooO0OO);
        }
        oooO0O0.f80974OooO00o = null;
        oooO0O0.f80977OooO0Oo.clear();
        oooO0O0.f80975OooO0O0 = 0.0f;
        oooO0O0.f80978OooO0o0 = false;
        return oooO0O0;
    }

    public final C24044OooO0oo OooOOO0() {
        if (this.f80992OooOO0 + 1 >= this.f80988OooO0o) {
            OooOOOO();
        }
        C24044OooO0oo c24044OooO0ooOooO00o = OooO00o(C24044OooO0oo.OooO00o.f81019OooOo);
        int i = this.f80986OooO0OO + 1;
        this.f80986OooO0OO = i;
        this.f80992OooOO0++;
        c24044OooO0ooOooO00o.f81007OooOo = i;
        this.f80996OooOOO0.f80981OooO0OO[i] = c24044OooO0ooOooO00o;
        return c24044OooO0ooOooO00o;
    }

    public final void OooOOOO() {
        int i = this.f80989OooO0o0 * 2;
        this.f80989OooO0o0 = i;
        this.f80990OooO0oO = (OooO0O0[]) Arrays.copyOf(this.f80990OooO0oO, i);
        OooO0OO oooO0OO = this.f80996OooOOO0;
        oooO0OO.f80981OooO0OO = (C24044OooO0oo[]) Arrays.copyOf(oooO0OO.f80981OooO0OO, this.f80989OooO0o0);
        int i2 = this.f80989OooO0o0;
        this.f80983OooO = new boolean[i2];
        this.f80988OooO0o = i2;
        this.f80994OooOO0o = i2;
    }

    public final void OooOOOo() throws Exception {
        C24043OooO0oO c24043OooO0oO = this.f80987OooO0Oo;
        if (c24043OooO0oO.OooO0o0()) {
            OooO();
            return;
        }
        if (!this.f80991OooO0oo) {
            OooOOo0(c24043OooO0oO);
            return;
        }
        for (int i = 0; i < this.f80993OooOO0O; i++) {
            if (!this.f80990OooO0oO[i].f80978OooO0o0) {
                OooOOo0(c24043OooO0oO);
                return;
            }
        }
        OooO();
    }

    public final void OooOOo(OooO0O0 oooO0O0) {
        for (int i = 0; i < this.f80992OooOO0; i++) {
            this.f80983OooO[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f80992OooOO0 * 2) {
                return;
            }
            C24044OooO0oo c24044OooO0oo = oooO0O0.f80974OooO00o;
            if (c24044OooO0oo != null) {
                this.f80983OooO[c24044OooO0oo.f81007OooOo] = true;
            }
            C24044OooO0oo c24044OooO0ooOooO00o = oooO0O0.OooO00o(this.f80983OooO);
            if (c24044OooO0ooOooO00o != null) {
                boolean[] zArr = this.f80983OooO;
                int i3 = c24044OooO0ooOooO00o.f81007OooOo;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c24044OooO0ooOooO00o != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f80993OooOO0O; i5++) {
                    OooO0O0 oooO0O02 = this.f80990OooO0oO[i5];
                    if (oooO0O02.f80974OooO00o.f81015OooOooo != C24044OooO0oo.OooO00o.f81020OooOo0o && !oooO0O02.f80978OooO0o0 && oooO0O02.f80977OooO0Oo.OooO0o(c24044OooO0ooOooO00o)) {
                        float fOooO0oo = oooO0O02.f80977OooO0Oo.OooO0oo(c24044OooO0ooOooO00o);
                        if (fOooO0oo < 0.0f) {
                            float f2 = (-oooO0O02.f80975OooO0O0) / fOooO0oo;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    OooO0O0 oooO0O03 = this.f80990OooO0oO[i4];
                    oooO0O03.f80974OooO00o.f81010OooOoO0 = -1;
                    oooO0O03.OooO0oO(c24044OooO0ooOooO00o);
                    C24044OooO0oo c24044OooO0oo2 = oooO0O03.f80974OooO00o;
                    c24044OooO0oo2.f81010OooOoO0 = i4;
                    c24044OooO0oo2.OooO0o0(this, oooO0O03);
                }
            } else {
                z = true;
            }
        }
    }

    public final void OooOOo0(C24043OooO0oO c24043OooO0oO) throws Exception {
        int i = 0;
        while (true) {
            if (i >= this.f80993OooOO0O) {
                break;
            }
            OooO0O0 oooO0O0 = this.f80990OooO0oO[i];
            C24044OooO0oo.OooO00o oooO00o = oooO0O0.f80974OooO00o.f81015OooOooo;
            C24044OooO0oo.OooO00o oooO00o2 = C24044OooO0oo.OooO00o.f81020OooOo0o;
            if (oooO00o != oooO00o2) {
                float f = 0.0f;
                if (oooO0O0.f80975OooO0O0 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f80993OooOO0O) {
                            OooO0O0 oooO0O02 = this.f80990OooO0oO[i3];
                            if (oooO0O02.f80974OooO00o.f81015OooOooo != oooO00o2 && !oooO0O02.f80978OooO0o0 && oooO0O02.f80975OooO0O0 < f) {
                                int iOooO = oooO0O02.f80977OooO0Oo.OooO();
                                int i7 = 0;
                                while (i7 < iOooO) {
                                    C24044OooO0oo c24044OooO0ooOooO00o = oooO0O02.f80977OooO0Oo.OooO00o(i7);
                                    float f3 = f;
                                    float fOooO0oo = oooO0O02.f80977OooO0Oo.OooO0oo(c24044OooO0ooOooO00o);
                                    if (fOooO0oo > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = c24044OooO0ooOooO00o.f81012OooOoo[i8] / fOooO0oo;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = c24044OooO0ooOooO00o.f81007OooOo;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            OooO0O0 oooO0O03 = this.f80990OooO0oO[i4];
                            oooO0O03.f80974OooO00o.f81010OooOoO0 = -1;
                            oooO0O03.OooO0oO(this.f80996OooOOO0.f80981OooO0OO[i5]);
                            C24044OooO0oo c24044OooO0oo = oooO0O03.f80974OooO00o;
                            c24044OooO0oo.f81010OooOoO0 = i4;
                            c24044OooO0oo.OooO0o0(this, oooO0O03);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f80992OooOO0 / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                }
            }
            i++;
        }
        OooOOo(c24043OooO0oO);
        OooO();
    }

    public final void OooOOoo() {
        for (int i = 0; i < this.f80993OooOO0O; i++) {
            OooO0O0 oooO0O0 = this.f80990OooO0oO[i];
            if (oooO0O0 != null) {
                this.f80996OooOOO0.f80979OooO00o.OooO00o(oooO0O0);
            }
            this.f80990OooO0oO[i] = null;
        }
    }

    public final void OooOo00() {
        OooO0OO oooO0OO;
        int i = 0;
        while (true) {
            oooO0OO = this.f80996OooOOO0;
            C24044OooO0oo[] c24044OooO0ooArr = oooO0OO.f80981OooO0OO;
            if (i >= c24044OooO0ooArr.length) {
                break;
            }
            C24044OooO0oo c24044OooO0oo = c24044OooO0ooArr[i];
            if (c24044OooO0oo != null) {
                c24044OooO0oo.OooO0OO();
            }
            i++;
        }
        OooO0o oooO0o = oooO0OO.f80980OooO0O0;
        C24044OooO0oo[] c24044OooO0ooArr2 = this.f80995OooOOO;
        int length = this.f80997OooOOOO;
        oooO0o.getClass();
        if (length > c24044OooO0ooArr2.length) {
            length = c24044OooO0ooArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C24044OooO0oo c24044OooO0oo2 = c24044OooO0ooArr2[i2];
            int i3 = oooO0o.f81000OooO0O0;
            Object[] objArr = oooO0o.f80999OooO00o;
            if (i3 < objArr.length) {
                objArr[i3] = c24044OooO0oo2;
                oooO0o.f81000OooO0O0 = i3 + 1;
            }
        }
        this.f80997OooOOOO = 0;
        Arrays.fill(oooO0OO.f80981OooO0OO, (Object) null);
        this.f80986OooO0OO = 0;
        C24043OooO0oO c24043OooO0oO = this.f80987OooO0Oo;
        c24043OooO0oO.f81004OooO0oo = 0;
        c24043OooO0oO.f80975OooO0O0 = 0.0f;
        this.f80992OooOO0 = 1;
        for (int i4 = 0; i4 < this.f80993OooOO0O; i4++) {
            OooO0O0 oooO0O0 = this.f80990OooO0oO[i4];
        }
        OooOOoo();
        this.f80993OooOO0O = 0;
        this.f80998OooOOOo = new OooO0O0(oooO0OO);
    }
}
