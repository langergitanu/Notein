package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.C22226Oooo0oo;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG6 {
    private IWarningCallback zzZG0;
    private zzZIJ zzZoo;
    private zzMJ zzZop;
    private com.aspose.words.internal.zzZQC<zzZ> zzeU = new com.aspose.words.internal.zzZQC<>();
    private ArrayList<zzZ> zzYnW = new ArrayList<>();

    public static class zzY {
        private zzY zzYnO;
        double zzYnP;
        double zzYnQ;
        double zzYnR;

        public zzY(zzY zzy) {
            this.zzYnO = zzy;
        }

        public final double zzZ0h() {
            double d = this.zzYnR;
            zzY zzy = this.zzYnO;
            return zzy != null ? d - zzy.zzYnR : d;
        }
    }

    public static class zzZ {
        private boolean zzYnS;
        private zzY zzYnT;
        private zzY zzYnU;
        private boolean zzYnV;
        private zzZDN zzYrF;

        public zzZ(zzZDN zzzdn, zzZ zzz, boolean z) {
            this.zzYrF = zzzdn;
            this.zzYnV = z;
            this.zzYnU = new zzY(zzz != null ? zzz.zzYnU : null);
            this.zzYnT = new zzY(zzz != null ? zzz.zzYnT : null);
            this.zzYnS = true;
        }

        public final void zzVr(boolean z) {
            this.zzYnS = false;
        }

        public final boolean zzZ0i() {
            return this.zzYnS;
        }

        public final zzY zzZ0j() {
            return this.zzYnT;
        }

        public final zzY zzZ0k() {
            return this.zzYnU;
        }

        public final boolean zzZ0l() {
            return this.zzYnV;
        }

        public final zzZDN zzZ38() {
            return this.zzYrF;
        }
    }

    private zzZG6(Collection<zzLT> collection, HtmlSaveOptions htmlSaveOptions, IWarningCallback iWarningCallback) {
        zzQH zzqh = new zzQH(htmlSaveOptions.zzYZ1() == 0 ? 2 : 0);
        this.zzZop = zzqh.zzX(collection);
        this.zzZoo = zzqh.zzZWC();
        this.zzZG0 = iWarningCallback;
    }

    private static boolean zzV(zzZDN zzzdn) {
        if (zzzdn.getRole() != 2) {
            return false;
        }
        Iterator<zzZDK> it = zzzdn.zzYXk().iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            zzZDN zzzdn2 = (zzZDN) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZDN.class);
            if (zzzdn2 != null) {
                if (zzzdn2.getRole() == 3) {
                    if (!z2) {
                        return false;
                    }
                    z2 = false;
                } else if (ContextChain.TAG_PRODUCT.equals(zzzdn2.getName()) && z) {
                    z2 = true;
                    z = false;
                }
            }
            return false;
        }
        return !z;
    }

    private void zzW(zzZDN zzzdn) {
        this.zzeU.size();
        this.zzYnW.size();
        zzZ(zzzdn, 0.0d, 0.0d, 0.0d, false);
        this.zzeU.size();
        for (zzZ zzz : this.zzYnW) {
            zzZ(zzz, true);
            zzZ(zzz, false);
        }
        this.zzYnW.clear();
    }

    public static void zzZ(zzZDN zzzdn, Collection<zzLT> collection, HtmlSaveOptions htmlSaveOptions, IWarningCallback iWarningCallback) {
        new zzZG6(collection, htmlSaveOptions, iWarningCallback).zzW(zzzdn);
    }

    private zzZ zzZ0m() {
        if (this.zzeU.size() > 0) {
            return this.zzeU.peek();
        }
        return null;
    }

    private void zzZ(zzZDN zzzdn, double d, double d2, double d3, boolean z) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        if ("head".equals(zzzdn.getName())) {
            return;
        }
        zzZ zzzZzZ0m = null;
        this.zzZop.zzZ(zzzdn, (zzPS) null);
        boolean z2 = true;
        boolean z3 = zzV(zzzdn) ? true : z;
        if ((zzZ0m() == null || zzZ0m().zzZ0l()) && (zzzdn.getRole() == 5 || zzzdn.getRole() == 4 || "table".equals(zzzdn.getName()) || ContextChain.TAG_PRODUCT.equals(zzzdn.getName()) || "h1".equals(zzzdn.getName()) || "h2".equals(zzzdn.getName()) || "h3".equals(zzzdn.getName()) || "h4".equals(zzzdn.getName()) || "h5".equals(zzzdn.getName()) || "h6".equals(zzzdn.getName()) || "li".equals(zzzdn.getName()))) {
            if (!"table".equals(zzzdn.getName()) && !"li".equals(zzzdn.getName())) {
                z2 = false;
            }
            if (zzZ0m() != null && zzZ0m().zzZ0i()) {
                zzzZzZ0m = zzZ0m();
            }
            this.zzeU.push(new zzZ(zzzdn, zzzZzZ0m, z2));
        }
        if ("td".equals(zzzdn.getName())) {
            if (zzZ0m() != null) {
                zzZ0m().zzVr(false);
            }
            d4 = 0.0d;
            d5 = 0.0d;
        } else {
            d4 = d;
            d5 = d2;
        }
        zzPS zzpsZzZWe = this.zzZop.zzZWe();
        boolean zEquals = "absolute".equals(zzpsZzZWe.zzSF(RequestParameters.POSITION));
        if (!z3 ? !(zzZ0m() == null || zzZ0m().zzZ38() != zzzdn) : zzZIJ.zzT(zzzdn, zzpsZzZWe) || zEquals) {
            d8 = d4;
            d9 = d5;
            d10 = 0.0d;
        } else {
            double dZzW = zzW(zzpsZzZWe, "margin-left");
            double dZzW2 = zzW(zzpsZzZWe, "margin-right");
            double dZzW3 = zzW(zzpsZzZWe, "padding-left");
            double dZzW4 = zzW(zzpsZzZWe, "padding-right");
            double dZzW5 = zzW(zzpsZzZWe, "text-indent");
            boolean zEquals2 = "rtl".equals(zzpsZzZWe.zzSF(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION));
            if (zzZ0m() != null) {
                double d11 = d4 + dZzW;
                if (zEquals) {
                    d11 += d3;
                }
                double d12 = d5 + dZzW2;
                d6 = d4;
                d7 = d5;
                double d13 = zEquals2 ? d12 + dZzW5 : d11 + dZzW5;
                double dMin = Math.min(0.0d, d11);
                if (!zEquals2) {
                    dMin = Math.min(dMin, d13);
                    if ("li".equals(zzzdn.getName())) {
                        dMin = Math.min(dMin, -zzzdn.zzYXg());
                    }
                }
                double dMin2 = Math.min(0.0d, d12);
                if (zEquals2) {
                    dMin2 = Math.min(dMin2, d13);
                    if ("li".equals(zzzdn.getName())) {
                        dMin2 = Math.min(dMin2, -zzzdn.zzYXg());
                    }
                }
                zzZ0m().zzZ0k().zzYnR = Math.min(zzZ0m().zzZ0k().zzYnR, dMin);
                zzZ0m().zzZ0j().zzYnR = Math.min(zzZ0m().zzZ0j().zzYnR, dMin2);
            } else {
                d6 = d4;
                d7 = d5;
            }
            d8 = dZzW + dZzW3 + d6;
            d9 = dZzW2 + dZzW4 + d7;
            d10 = dZzW5;
        }
        if (zzzdn.zzYXk().getCount() > 0) {
            Iterator<zzZDK> it = zzzdn.zzYXk().iterator();
            while (it.hasNext()) {
                zzZDN zzzdn2 = (zzZDN) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZDN.class);
                if (zzzdn2 != null) {
                    zzZ(zzzdn2, d8, d9, d10, z3);
                }
            }
        }
        this.zzZop.zzZVt();
        if (zzZ0m() == null || zzZ0m().zzZ38() != zzzdn) {
            return;
        }
        zzZ(zzzdn, zzpsZzZWe);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYnW, this.zzeU.pop());
    }

    private static double zzW(zzPS zzps, String str) {
        double dZzSH = zzps.zzSH(str);
        if (dZzSH == -1.7976931348623157E308d) {
            return 0.0d;
        }
        return dZzSH;
    }

    private void zzZ(zzZDN zzzdn, zzPS zzps) {
        zzPS zzpsZzZWe;
        zzZ zzzZzZ0m = zzZ0m();
        if (com.aspose.words.internal.zzAN.zzZD(zzzZzZ0m.zzZ0k().zzZ0h()) && com.aspose.words.internal.zzAN.zzZD(zzzZzZ0m.zzZ0j().zzZ0h())) {
            return;
        }
        zzZDS zzzdsZzJH = zzzdn.zzYXj().zzJH("style");
        if (zzzdsZzJH != null) {
            zzzdn.zzYXj().remove("style");
            this.zzZop.zzR(zzzdn);
            zzpsZzZWe = this.zzZop.zzZWe();
            this.zzZop.zzZVt();
            zzzdn.zzYXj().zzZ(zzzdsZzJH);
        } else {
            zzpsZzZWe = zzps;
        }
        zzzZzZ0m.zzZ0k().zzYnQ = zzW(zzps, "margin-left");
        zzzZzZ0m.zzZ0j().zzYnQ = zzW(zzps, "margin-right");
        zzzZzZ0m.zzZ0k().zzYnP = zzW(zzpsZzZWe, "margin-left");
        zzzZzZ0m.zzZ0j().zzYnP = zzW(zzpsZzZWe, "margin-right");
    }

    private void zzZ(zzZ zzz, boolean z) {
        zzY zzyZzZ0j;
        String str;
        if (z) {
            zzyZzZ0j = zzz.zzZ0k();
        } else {
            zzyZzZ0j = zzz.zzZ0j();
        }
        double dZzZ0h = zzyZzZ0j.zzZ0h();
        if (com.aspose.words.internal.zzAN.zzZD(dZzZ0h)) {
            return;
        }
        if (z) {
            str = "margin-left";
        } else {
            str = "margin-right";
        }
        zzPR zzpr = new zzPR(zzz.zzZ38().zzYXf());
        zzpr.remove(str);
        double d = zzyZzZ0j.zzYnQ - dZzZ0h;
        if (!com.aspose.words.internal.zzAN.zzL(d, zzyZzZ0j.zzYnP)) {
            zzpr.zzY(new zzM3(str, new zzMP(new zzOI(d, 4))));
        }
        zzz.zzZ38().zzYXj().remove("style");
        zzz.zzZ38().zzYXj().zzZ(new zzZDP(zzpr.zzZWe()));
        zzZ(z, zzyZzZ0j.zzYnQ);
    }

    private void zzZ(boolean z, double d) {
        String str;
        if (this.zzZG0 == null) {
            return;
        }
        if (z) {
            str = "Left";
        } else {
            str = "Right";
        }
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " margin of an element was trimmed. The original value was ");
        sbOooO0OO.append(com.aspose.words.internal.zzJB.zzZU(d));
        OooO00o.OooO0O0(this.zzZG0, 65536, 16, sbOooO0OO.toString());
    }
}
