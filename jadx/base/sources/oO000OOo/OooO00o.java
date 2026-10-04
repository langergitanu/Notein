package oO000OOo;

import OooO0O0.C20394OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: oO000OOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C20188OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f113913OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final double f113914OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double f113915OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public C20188OooO00o f113917OooO0o = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public C20188OooO00o f113919OooO0oO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f113916OooO0Oo = Double.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C20188OooO00o f113920OooO0oo = null;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public C20188OooO00o f113912OooO = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f113918OooO0o0 = false;

        public C20188OooO00o(int i, double d, double d2) {
            this.f113913OooO00o = i;
            this.f113914OooO0O0 = d;
            this.f113915OooO0OO = d2;
        }

        public final String toString() {
            return "{i: " + this.f113913OooO00o + ", x: " + this.f113914OooO0O0 + ", y: " + this.f113915OooO0OO + ", prev: " + this.f113917OooO0o + ", next: " + this.f113919OooO0oO;
        }
    }

    public static void OooO(C20188OooO00o c20188OooO00o) {
        C20188OooO00o c20188OooO00o2 = c20188OooO00o.f113919OooO0oO;
        c20188OooO00o2.f113917OooO0o = c20188OooO00o.f113917OooO0o;
        c20188OooO00o.f113917OooO0o.f113919OooO0oO = c20188OooO00o2;
        C20188OooO00o c20188OooO00o3 = c20188OooO00o.f113920OooO0oo;
        if (c20188OooO00o3 != null) {
            c20188OooO00o3.f113912OooO = c20188OooO00o.f113912OooO;
        }
        C20188OooO00o c20188OooO00o4 = c20188OooO00o.f113912OooO;
        if (c20188OooO00o4 != null) {
            c20188OooO00o4.f113920OooO0oo = c20188OooO00o3;
        }
    }

    public static double OooO00o(C20188OooO00o c20188OooO00o, C20188OooO00o c20188OooO00o2, C20188OooO00o c20188OooO00o3) {
        double d = c20188OooO00o2.f113915OooO0OO;
        double d2 = d - c20188OooO00o.f113915OooO0OO;
        double d3 = c20188OooO00o3.f113914OooO0O0;
        double d4 = c20188OooO00o2.f113914OooO0O0;
        return ((d3 - d4) * d2) - ((c20188OooO00o3.f113915OooO0OO - d) * (d4 - c20188OooO00o.f113914OooO0O0));
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x013d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:96:0x015e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0O0(oO000OOo.OooO00o.C20188OooO00o r44, java.util.ArrayList r45, double r46, double r48, double r50, int r52) {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oO000OOo.OooO00o.OooO0O0(oO000OOo.OooO00o$OooO00o, java.util.ArrayList, double, double, double, int):void");
    }

    public static boolean OooO0OO(C20188OooO00o c20188OooO00o, C20188OooO00o c20188OooO00o2) {
        return c20188OooO00o.f113914OooO0O0 == c20188OooO00o2.f113914OooO0O0 && c20188OooO00o.f113915OooO0OO == c20188OooO00o2.f113915OooO0OO;
    }

    public static C20188OooO00o OooO0Oo(C20188OooO00o c20188OooO00o, C20188OooO00o c20188OooO00o2) {
        C20188OooO00o c20188OooO00o3;
        boolean z;
        if (c20188OooO00o == null) {
            return c20188OooO00o;
        }
        if (c20188OooO00o2 == null) {
            c20188OooO00o2 = c20188OooO00o;
        }
        while (true) {
            if ((c20188OooO00o.f113918OooO0o0 || !OooO0OO(c20188OooO00o, c20188OooO00o.f113919OooO0oO)) && OooO00o(c20188OooO00o.f113917OooO0o, c20188OooO00o, c20188OooO00o.f113919OooO0oO) != 0.0d) {
                c20188OooO00o = c20188OooO00o.f113919OooO0oO;
                c20188OooO00o3 = c20188OooO00o2;
                z = false;
            } else {
                OooO(c20188OooO00o);
                c20188OooO00o = c20188OooO00o.f113917OooO0o;
                if (c20188OooO00o == c20188OooO00o.f113919OooO0oO) {
                    return c20188OooO00o;
                }
                z = true;
                c20188OooO00o3 = c20188OooO00o;
            }
            if (!z && c20188OooO00o == c20188OooO00o3) {
                return c20188OooO00o3;
            }
            c20188OooO00o2 = c20188OooO00o3;
        }
    }

    public static boolean OooO0o(C20188OooO00o c20188OooO00o, C20188OooO00o c20188OooO00o2) {
        return OooO00o(c20188OooO00o.f113917OooO0o, c20188OooO00o, c20188OooO00o.f113919OooO0oO) < 0.0d ? OooO00o(c20188OooO00o, c20188OooO00o2, c20188OooO00o.f113919OooO0oO) >= 0.0d && OooO00o(c20188OooO00o, c20188OooO00o.f113917OooO0o, c20188OooO00o2) >= 0.0d : OooO00o(c20188OooO00o, c20188OooO00o2, c20188OooO00o.f113917OooO0o) < 0.0d || OooO00o(c20188OooO00o, c20188OooO00o.f113919OooO0oO, c20188OooO00o2) < 0.0d;
    }

    public static boolean OooO0o0(C20188OooO00o c20188OooO00o, C20188OooO00o c20188OooO00o2, C20188OooO00o c20188OooO00o3, C20188OooO00o c20188OooO00o4) {
        if (OooO0OO(c20188OooO00o, c20188OooO00o3) && OooO0OO(c20188OooO00o2, c20188OooO00o4)) {
            return true;
        }
        if (OooO0OO(c20188OooO00o, c20188OooO00o4) && OooO0OO(c20188OooO00o3, c20188OooO00o2)) {
            return true;
        }
        double dOooOO0 = OooOO0(OooO00o(c20188OooO00o, c20188OooO00o2, c20188OooO00o3));
        double dOooOO02 = OooOO0(OooO00o(c20188OooO00o, c20188OooO00o2, c20188OooO00o4));
        double dOooOO03 = OooOO0(OooO00o(c20188OooO00o3, c20188OooO00o4, c20188OooO00o));
        double dOooOO04 = OooOO0(OooO00o(c20188OooO00o3, c20188OooO00o4, c20188OooO00o2));
        if (dOooOO0 != dOooOO02 && dOooOO03 != dOooOO04) {
            return true;
        }
        if (dOooOO0 == 0.0d && OooO0oO(c20188OooO00o, c20188OooO00o3, c20188OooO00o2)) {
            return true;
        }
        if (dOooOO02 == 0.0d && OooO0oO(c20188OooO00o, c20188OooO00o4, c20188OooO00o2)) {
            return true;
        }
        if (dOooOO03 == 0.0d && OooO0oO(c20188OooO00o3, c20188OooO00o, c20188OooO00o4)) {
            return true;
        }
        return dOooOO04 == 0.0d && OooO0oO(c20188OooO00o3, c20188OooO00o2, c20188OooO00o4);
    }

    public static boolean OooO0oO(C20188OooO00o c20188OooO00o, C20188OooO00o c20188OooO00o2, C20188OooO00o c20188OooO00o3) {
        if (c20188OooO00o2.f113914OooO0O0 > Math.max(c20188OooO00o.f113914OooO0O0, c20188OooO00o3.f113914OooO0O0)) {
            return false;
        }
        if (c20188OooO00o2.f113914OooO0O0 < Math.min(c20188OooO00o.f113914OooO0O0, c20188OooO00o3.f113914OooO0O0)) {
            return false;
        }
        double d = c20188OooO00o.f113915OooO0OO;
        double d2 = c20188OooO00o3.f113915OooO0OO;
        double dMax = Math.max(d, d2);
        double d3 = c20188OooO00o2.f113915OooO0OO;
        return d3 <= dMax && d3 >= Math.min(d, d2);
    }

    public static boolean OooO0oo(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d5 - d7;
        double d10 = d2 - d8;
        double d11 = d - d7;
        double d12 = d6 - d8;
        if ((d9 * d10) - (d11 * d12) < 0.0d) {
            return false;
        }
        double d13 = d4 - d8;
        double d14 = d3 - d7;
        return (d11 * d13) - (d10 * d14) >= 0.0d && (d14 * d12) - (d9 * d13) >= 0.0d;
    }

    public static double OooOO0(double d) {
        if (d > 0.0d) {
            return 1.0d;
        }
        return d < 0.0d ? -1.0d : 0.0d;
    }

    public static double OooOO0O(double d, double d2, double d3, double d4, double d5) {
        int iIntValue = Double.valueOf(C20394OooO0Oo.OooO0O0(d, d3, 32767.0d, d5)).intValue();
        int iIntValue2 = Double.valueOf(C20394OooO0Oo.OooO0O0(d2, d4, 32767.0d, d5)).intValue();
        int i = (iIntValue | (iIntValue << 8)) & 16711935;
        int i2 = (i | (i << 4)) & 252645135;
        int i3 = (i2 | (i2 << 2)) & 858993459;
        int i4 = (iIntValue2 | (iIntValue2 << 8)) & 16711935;
        int i5 = (i4 | (i4 << 4)) & 252645135;
        int i6 = (i5 | (i5 << 2)) & 858993459;
        return ((i3 | (i3 << 1)) & 1431655765) | (((i6 | (i6 << 1)) & 1431655765) << 1);
    }
}
