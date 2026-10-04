package o0000oO;

import o0000oo.C24346OooO0Oo;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24322OooOOOo implements InterfaceC24311OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f81875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C24348OooO0o0 f81876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C24320OooOOO0 f81877OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C24348OooO0o0.OooO00o f81878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C24314OooO0oO f81880OooO0o0 = new C24314OooO0oO(this);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f81879OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f81881OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C24312OooO0o f81882OooO0oo = new C24312OooO0o(this);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C24312OooO0o f81874OooO = new C24312OooO0o(this);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO00o f81883OooOO0 = OooO00o.f81885OooOo0o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0000oO.OooOOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f81884OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81885OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f81886OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("NONE", 0);
            f81885OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("START", 1);
            OooO00o oooO00o3 = new OooO00o("END", 2);
            OooO00o oooO00o4 = new OooO00o("CENTER", 3);
            f81884OooOo = oooO00o4;
            f81886OooOoO0 = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f81886OooOoO0.clone();
        }
    }

    public AbstractC24322OooOOOo(C24348OooO0o0 c24348OooO0o0) {
        this.f81876OooO0O0 = c24348OooO0o0;
    }

    public static C24312OooO0o OooO(C24346OooO0Oo c24346OooO0Oo, int i) {
        C24346OooO0Oo c24346OooO0Oo2 = c24346OooO0Oo.f81959OooO0o;
        if (c24346OooO0Oo2 == null) {
            return null;
        }
        C24348OooO0o0 c24348OooO0o0 = c24346OooO0Oo2.f81958OooO0Oo;
        AbstractC24322OooOOOo abstractC24322OooOOOo = i == 0 ? c24348OooO0o0.f81997OooO0Oo : c24348OooO0o0.f81999OooO0o0;
        int iOrdinal = c24346OooO0Oo2.f81960OooO0o0.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return abstractC24322OooOOOo.f81882OooO0oo;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return abstractC24322OooOOOo.f81874OooO;
        }
        return null;
    }

    public static void OooO0O0(C24312OooO0o c24312OooO0o, C24312OooO0o c24312OooO0o2, int i) {
        c24312OooO0o.f81843OooOO0o.add(c24312OooO0o2);
        c24312OooO0o.f81837OooO0o = i;
        c24312OooO0o2.f81842OooOO0O.add(c24312OooO0o);
    }

    public static C24312OooO0o OooO0oo(C24346OooO0Oo c24346OooO0Oo) {
        C24346OooO0Oo c24346OooO0Oo2 = c24346OooO0Oo.f81959OooO0o;
        if (c24346OooO0Oo2 == null) {
            return null;
        }
        C24348OooO0o0 c24348OooO0o0 = c24346OooO0Oo2.f81958OooO0Oo;
        int iOrdinal = c24346OooO0Oo2.f81960OooO0o0.ordinal();
        if (iOrdinal == 1) {
            return c24348OooO0o0.f81997OooO0Oo.f81882OooO0oo;
        }
        if (iOrdinal == 2) {
            return c24348OooO0o0.f81999OooO0o0.f81882OooO0oo;
        }
        if (iOrdinal == 3) {
            return c24348OooO0o0.f81997OooO0Oo.f81874OooO;
        }
        if (iOrdinal == 4) {
            return c24348OooO0o0.f81999OooO0o0.f81874OooO;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return c24348OooO0o0.f81999OooO0o0.f81864OooOO0O;
    }

    @Override // o0000oO.InterfaceC24311OooO0Oo
    public void OooO00o(InterfaceC24311OooO0Oo interfaceC24311OooO0Oo) {
    }

    public final void OooO0OO(C24312OooO0o c24312OooO0o, C24312OooO0o c24312OooO0o2, int i, C24314OooO0oO c24314OooO0oO) {
        c24312OooO0o.f81843OooOO0o.add(c24312OooO0o2);
        c24312OooO0o.f81843OooOO0o.add(this.f81880OooO0o0);
        c24312OooO0o.f81840OooO0oo = i;
        c24312OooO0o.f81832OooO = c24314OooO0oO;
        c24312OooO0o2.f81842OooOO0O.add(c24312OooO0o);
        c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o);
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final int OooO0oO(int i, int i2) {
        if (i2 == 0) {
            C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0;
            int i3 = c24348OooO0o0.f82015OooOo0O;
            int iMax = Math.max(c24348OooO0o0.f82013OooOo0, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C24348OooO0o0 c24348OooO0o02 = this.f81876OooO0O0;
            int i4 = c24348OooO0o02.f82018OooOoO0;
            int iMax2 = Math.max(c24348OooO0o02.f82012OooOo, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long OooOO0() {
        if (this.f81880OooO0o0.f81841OooOO0) {
            return r0.f81839OooO0oO;
        }
        return 0L;
    }

    public abstract boolean OooOO0O();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0o(C24346OooO0Oo c24346OooO0Oo, C24346OooO0Oo c24346OooO0Oo2, int i) {
        C24312OooO0o c24312OooO0oOooO0oo = OooO0oo(c24346OooO0Oo);
        C24312OooO0o c24312OooO0oOooO0oo2 = OooO0oo(c24346OooO0Oo2);
        if (c24312OooO0oOooO0oo.f81841OooOO0 && c24312OooO0oOooO0oo2.f81841OooOO0) {
            int iOooO0o0 = c24346OooO0Oo.OooO0o0() + c24312OooO0oOooO0oo.f81839OooO0oO;
            int iOooO0o02 = c24312OooO0oOooO0oo2.f81839OooO0oO - c24346OooO0Oo2.OooO0o0();
            int i2 = iOooO0o02 - iOooO0o0;
            C24314OooO0oO c24314OooO0oO = this.f81880OooO0o0;
            if (!c24314OooO0oO.f81841OooOO0) {
                C24348OooO0o0.OooO00o oooO00o = this.f81878OooO0Oo;
                C24348OooO0o0.OooO00o oooO00o2 = C24348OooO0o0.OooO00o.f82065OooOoO0;
                if (oooO00o == oooO00o2) {
                    int i3 = this.f81875OooO00o;
                    if (i3 == 0) {
                        c24314OooO0oO.OooO0Oo(OooO0oO(i2, i));
                    } else if (i3 == 1) {
                        c24314OooO0oO.OooO0Oo(Math.min(OooO0oO(c24314OooO0oO.f81861OooOOO0, i), i2));
                    } else if (i3 == 2) {
                        C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0;
                        C24348OooO0o0 c24348OooO0o02 = c24348OooO0o0.f82054o000oOoO;
                        if (c24348OooO0o02 != null) {
                            if ((i == 0 ? c24348OooO0o02.f81997OooO0Oo : c24348OooO0o02.f81999OooO0o0).f81880OooO0o0.f81841OooOO0) {
                                c24314OooO0oO.OooO0Oo(OooO0oO((int) ((r6.f81839OooO0oO * (i == 0 ? c24348OooO0o0.f82016OooOo0o : c24348OooO0o0.f82017OooOoO)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        C24348OooO0o0 c24348OooO0o03 = this.f81876OooO0O0;
                        AbstractC24322OooOOOo abstractC24322OooOOOo = c24348OooO0o03.f81997OooO0Oo;
                        if (abstractC24322OooOOOo.f81878OooO0Oo == oooO00o2 && abstractC24322OooOOOo.f81875OooO00o == 3) {
                            C24319OooOOO c24319OooOOO = c24348OooO0o03.f81999OooO0o0;
                            if (c24319OooOOO.f81878OooO0Oo != oooO00o2 || c24319OooOOO.f81875OooO00o != 3) {
                            }
                        } else {
                            if (i == 0) {
                                abstractC24322OooOOOo = c24348OooO0o03.f81999OooO0o0;
                            }
                            if (abstractC24322OooOOOo.f81880OooO0o0.f81841OooOO0) {
                                float f = c24348OooO0o03.f82042OoooOo0;
                                c24314OooO0oO.OooO0Oo(i == 1 ? (int) ((r6.f81839OooO0oO / f) + 0.5f) : (int) ((f * r6.f81839OooO0oO) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (c24314OooO0oO.f81841OooOO0) {
                int i4 = c24314OooO0oO.f81839OooO0oO;
                C24312OooO0o c24312OooO0o = this.f81874OooO;
                C24312OooO0o c24312OooO0o2 = this.f81882OooO0oo;
                if (i4 == i2) {
                    c24312OooO0o2.OooO0Oo(iOooO0o0);
                    c24312OooO0o.OooO0Oo(iOooO0o02);
                    return;
                }
                float f2 = i == 0 ? this.f81876OooO0O0.f82049OooooOo : this.f81876OooO0O0.f82051Oooooo0;
                if (c24312OooO0oOooO0oo == c24312OooO0oOooO0oo2) {
                    iOooO0o0 = c24312OooO0oOooO0oo.f81839OooO0oO;
                    iOooO0o02 = c24312OooO0oOooO0oo2.f81839OooO0oO;
                    f2 = 0.5f;
                }
                c24312OooO0o2.OooO0Oo((int) ((((iOooO0o02 - iOooO0o0) - i4) * f2) + iOooO0o0 + 0.5f));
                c24312OooO0o.OooO0Oo(c24312OooO0o2.f81839OooO0oO + c24314OooO0oO.f81839OooO0oO);
            }
        }
    }
}
