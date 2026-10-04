package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.ref.Ref;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.miui.penengine.p596e.C18773h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzLS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "right", "both", "div", "li", ContextChain.TAG_PRODUCT, "h1", "h2", "h3", "h4", "h5", "h6", "center", "pre", "blockquote", "a", "b", "big", "em", ContextChain.TAG_INFRA, "s", "small", "strike", "strong", "sub", "sup", "tt", "u", "span", "font");
    private boolean zzZo9;
    private zzQ3 zzZoS;
    private zzK5 zzZoX;
    private boolean zzZob;
    private int zzZoc;
    private zzZAS zzZod;
    private boolean zzZoe;
    private zzZK7 zzZon;
    private zzZIJ zzZoo;
    private zzMJ zzZop;
    private String zzZoq;
    private String zzZor;
    private zzQN zzZos;
    private ArrayList<zzN0> zzZp4;
    private ArrayList<zzLT> zzZp5;
    private com.aspose.words.internal.zzD3<zzPS> zzZof = new com.aspose.words.internal.zzD3<>();
    private HashMap<String, zzPS> zzZoa = new HashMap<>();
    private ArrayList<zzZIH> zzZom = new ArrayList<>();
    private com.aspose.words.internal.zzZQC<zzLN> zzZol = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzRL> zzZok = new com.aspose.words.internal.zzZQC<>();
    private zzYU zzZoj = new zzYU();
    private com.aspose.words.internal.zzDB zzZoi = new com.aspose.words.internal.zzDB();
    private zzY83 zzZoh = new zzY83();
    private zzPV zzZog = new zzPV();

    public zzLS(ArrayList<zzLT> arrayList, ArrayList<zzN0> arrayList2, String str, String str2, zzMJ zzmj, zzZIJ zzzij, zzZK7 zzzk7, zzK5 zzk5, zzQ3 zzq3, zzQN zzqn, boolean z, boolean z2) {
        this.zzZp5 = arrayList;
        this.zzZp4 = arrayList2;
        this.zzZor = str;
        this.zzZoq = str2;
        this.zzZop = zzmj;
        this.zzZoo = zzzij;
        this.zzZon = zzzk7;
        this.zzZoX = zzk5;
        this.zzZoS = zzq3;
        this.zzZos = zzqn;
        this.zzZob = z;
        this.zzZo9 = z2;
        zzZUf();
        zzZUo();
    }

    private zzZIH zzMf(int i) {
        int size = (this.zzZom.size() - i) - 1;
        if (size < 0 || size >= this.zzZom.size()) {
            return null;
        }
        return this.zzZom.get(size);
    }

    private zzPS zzP(zzPS zzps) {
        zzPT zzptZzZUe;
        if (zzps.zzSx("float") != null || (zzptZzZUe = zzZUe()) == null) {
            return zzps;
        }
        zzPR zzpr = new zzPR(zzps);
        zzpr.zzY(zzptZzZUe);
        return zzpr.zzZWe();
    }

    private void zzQ(zzPS zzps) {
        zzPY.zzU(zzps).zzZ(this.zzZog);
    }

    private zzPS zzR(zzPS zzps) {
        zzPT zzptZzSx;
        zzZIH zzzihZzMf = zzMf(0);
        if (zzzihZzMf != null && "a".equals(zzzihZzMf.zzYra.zzZTQ()) && zzzihZzMf.zzYra.zzZ2L()) {
            zzzihZzMf = zzMf(1);
        }
        if (zzzihZzMf == null || !"span".equals(zzzihZzMf.zzYra.zzZTQ()) || !zzzihZzMf.zzYra.zzZ2L() || (zzptZzSx = zzzihZzMf.zzMj(0).zzSx(RequestParameters.POSITION)) == null || !zzptZzSx.zzZWj().zzP(zzL4.zzZkR)) {
            return zzps;
        }
        zzPR zzpr = new zzPR(zzps);
        zzpr.zzW(zzptZzSx);
        zzpr.zzW(zzzihZzMf.zzMj(0).zzSx("z-index"));
        zzpr.zzW(zzzihZzMf.zzMj(0).zzSx("margin-left"));
        zzpr.zzW(zzzihZzMf.zzMj(0).zzSx("margin-right"));
        zzpr.zzW(zzzihZzMf.zzMj(0).zzSx("margin-top"));
        zzpr.zzW(zzzihZzMf.zzMj(0).zzSx("left"));
        return zzpr.zzZWe();
    }

    private zzPS zzSb(String str) {
        return this.zzZoS.zzW(this.zzZoX.zzP(new zzYXJ(str)));
    }

    private static boolean zzV(zzZAS zzzas) {
        switch (zzUR.zzTP(zzzas.zzZTQ())) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return true;
            default:
                return false;
        }
    }

    private static void zzW(zzZIH zzzih) {
        double dZzSH = zzzih.zzMj(0).zzSH("width");
        double dZzSH2 = zzzih.zzMj(0).zzSH("min-width");
        double dZzSH3 = zzzih.zzMj(0).zzSH("height");
        double dZzSH4 = zzzih.zzMj(0).zzSH("min-height");
        double dMax = Math.max(dZzSH2, dZzSH);
        double dMax2 = Math.max(dZzSH4, dZzSH3);
        if (com.aspose.words.internal.zzAN.zzZC(dMax) || com.aspose.words.internal.zzAN.zzZC(dMax2)) {
            return;
        }
        zzzih.zzYr2 = new zzYB5(dMax, dMax2);
    }

    private void zzX(zzZIH zzzih) {
        zzPT zzptZzSx;
        zzZAS zzzas = zzzih.zzYra;
        if (this.zzZom.size() > 0) {
            zzZUw();
        }
        zzzih.zzYr3 = zzzas.zzZ2P() != null || zzzas.zzZ2F().length() > 0;
        zzzih.zzYr8 = zzZIJ.zzT(zzzas, zzzih.zzMj(0)) || "body".equals(zzzas.zzZTQ());
        zzzih.zzYr4 = zzZIJ.zzI(zzzih.zzMj(0));
        zzZIH zzzihZzZUk = zzZUk();
        zzzih.zzYr9 = zzzihZzZUk;
        if (zzzih.zzYr8) {
            zzzih.zzYr7 = zzL5.zzM(zzzih.zzMj(0));
        } else if (zzzihZzZUk != null) {
            zzzih.zzYr7 = zzL5.zzM(zzzihZzZUk.zzMj(0));
        }
        zzzih.zzYr6 = zzL5.zzM(zzzih.zzMj(0));
        boolean z = this.zzZo9 && zzL5.zzZ(zzzih.zzYra.zzZTQ(), zzzih.zzMj(0), this.zzZob);
        if (!zzzas.isImplicit()) {
            this.zzZos.zzZ(zzzih.zzYra, zzzih.zzMj(0), zzzih.zzYr4, isEmpty() ? 15 : zzMf(0).zzYr4, z);
        }
        int iZzZUy = this.zzZom.size() != 0 ? zzZUy() : 0;
        if (iZzZUy != 2 && zzzih.zzYr4 == 15) {
            iZzZUy = 2;
        }
        if (iZzZUy != 2 && (zzptZzSx = zzzih.zzMj(0).zzSx("visibility")) != null) {
            if (zzptZzSx.zzZWj().zzP(zzL4.zzZly) || zzptZzSx.zzZWj().zzP(zzL4.zzZm1)) {
                iZzZUy = 1;
            } else if (zzptZzSx.zzZWj().zzP(zzL4.zzZmg)) {
                iZzZUy = 0;
            }
        }
        zzzih.zzYr5 = iZzZUy;
        zzW(zzzih);
        this.zzZon.zzV(zzzas, zzzih.zzMj(0));
        com.aspose.words.internal.zzZQG.zzZ(this.zzZom, zzzih);
        zzZ(zzMf(0), true);
        zzZUj();
        zzYb(z);
        this.zzZoj.zzZ(zzMf(0));
        this.zzZoh.zzV(zzzih);
        this.zzZog.zzZWn();
    }

    private void zzYb(boolean z) {
        if (zzMf(0).zzYr8 || z) {
            this.zzZok.push(zzRL.zzZXm());
            return;
        }
        zzRL zzrlZzY = zzRL.zzY(zzMf(0).zzMj(0));
        if (zzrlZzY.zzZXh() && this.zzZok.size() > 0) {
            zzrlZzY = this.zzZok.peek();
        }
        this.zzZok.push(zzrlZzY);
    }

    private zzPT zzZUe() {
        for (int size = this.zzZom.size() - 1; size >= 2; size--) {
            zzZIH zzzih = this.zzZom.get(size);
            if (zzzih.zzYra.zzZ2M().length > 1) {
                return null;
            }
            zzPT zzptZzSx = zzzih.zzMj(0).zzSx("float");
            if (zzptZzSx != null) {
                return zzptZzSx;
            }
        }
        return null;
    }

    private void zzZUf() {
        HashMap map = new HashMap();
        for (zzLT zzlt : this.zzZp5) {
            for (zzMD zzmd : zzlt.zzZUV()) {
                String strZzZXu = zzmd.zzZXu();
                Ref ref = new Ref(null);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(map, strZzZXu, ref);
                zzPR zzpr = (zzPR) ref.get();
                if (!zZzZ) {
                    zzpr = new zzPR();
                    com.aspose.words.internal.zzZQF.zzY(map, strZzZXu, zzpr);
                }
                zzpr.zzN(zzlt.zzZWe());
            }
        }
        this.zzZoa.clear();
        for (Map.Entry entry : map.entrySet()) {
            com.aspose.words.internal.zzZQF.zzY(this.zzZoa, (String) entry.getKey(), this.zzZoS.zzW(((zzPR) entry.getValue()).zzZWe()));
        }
    }

    private int zzZUi() {
        zzZIH zzzihZzMf = zzMf(0);
        if (zzzihZzMf != null) {
            return zzzihZzMf.zzZ2T();
        }
        return 0;
    }

    private void zzZUj() {
        this.zzZol.push(((this.zzZol.size() <= 0 || zzMf(0).zzMj(0).zzSx("float") != null) ? new zzLN() : this.zzZol.peek()).zzX(zzMf(0).zzMj(0), this.zzZob));
    }

    private zzZIH zzZUk() {
        if (this.zzZom.size() <= 0) {
            return null;
        }
        zzZIH zzzih = (zzZIH) C21505OooO0Oo.OooO00o(1, this.zzZom);
        return zzzih.zzYr8 ? zzzih : zzzih.zzYr9;
    }

    private boolean zzZUl() {
        return zzV(zzZUw()) && zzZUL();
    }

    private boolean zzZUm() {
        return zzV(zzZUw()) && !zzZUL();
    }

    private void zzZUn() {
        this.zzZom.size();
        if (!zzZUw().isImplicit()) {
            this.zzZos.zzZP();
        }
        zzZ(zzMf(0), false);
        if (zzZUi() == 0) {
            this.zzZop.zzZVt();
        }
        ArrayList<zzZIH> arrayList = this.zzZom;
        Class.getSimpleName();
        this.zzZon.zzZVt();
        this.zzZol.pop();
        this.zzZok.pop();
        this.zzZoj.zzae();
        this.zzZoh.zzZP();
        this.zzZog.zzZWm();
    }

    private void zzZUo() {
        int iZzU;
        for (zzLT zzlt : this.zzZp5) {
            zzPT zzptZzSx = zzlt.zzZWe().zzSx("-aw-style-name");
            if (zzptZzSx != null && (iZzU = zzL5.zzU(zzptZzSx.zzZWj())) != 12287) {
                this.zzZof.set(iZzU, this.zzZoS.zzW(zzlt.zzZWe()));
            }
        }
        for (int i = 1; i <= 6; i++) {
            if (!this.zzZof.zzVE(i)) {
                zzPR zzpr = new zzPR();
                zzpr.zzO(zzSb(com.aspose.words.internal.zzZKN.format("h{0}", Integer.valueOf(i))));
                zzPS zzpsZzZ = zzZ(zzMD.zzSi(C18773h.f57233c + com.aspose.words.internal.zzJB.zzWD(i)));
                if (zzpsZzZ != null) {
                    zzpr.zzO(zzpsZzZ);
                }
                this.zzZof.set(i, zzpr.zzZWe());
            }
        }
        if (this.zzZof.zzVE(0)) {
            return;
        }
        zzYXJ zzyxjZzHI = zzYXJ.zzHI("html");
        zzyxjZzHI.zzYE("style", this.zzZor);
        this.zzZop.zzR(zzyxjZzHI);
        zzYXJ zzyxjZzZ = zzYXJ.zzZ("body", zzyxjZzHI);
        zzyxjZzZ.zzYE("style", this.zzZoq);
        this.zzZop.zzR(zzyxjZzZ);
        zzPR zzpr2 = new zzPR(this.zzZop.zzZWe());
        zzpr2.remove("background-color");
        this.zzZof.set(0, zzpr2.zzZWe());
        this.zzZop.zzZVt();
        this.zzZop.zzZVt();
    }

    public final int getLocaleId() {
        return this.zzZon.getLocaleId();
    }

    public final int getLocaleIdBi() {
        return this.zzZon.getLocaleIdBi();
    }

    public final int getLocaleIdFarEast() {
        return this.zzZon.getLocaleIdFarEast();
    }

    public final boolean isEmpty() {
        return this.zzZom.size() == 0;
    }

    public final zzPS zzMg(int i) {
        return this.zzZof.get(i);
    }

    public final zzZLL zzYd(int i, int i2) {
        zzYKK zzykkZzZ2S = zzMf(0).zzZ2S();
        if (zzykkZzZ2S == null) {
            return null;
        }
        return zzZLK.zzZ(zzykkZzZ2S, this.zzZog, zzMf(1).zzYra, i, i2);
    }

    public final void zzZ(zzZAS zzzas, boolean z) {
        this.zzZop.zzR(zzzas);
        zzPS zzpsZzZWe = this.zzZop.zzZWe();
        if ("img".equals(zzzas.zzZTQ())) {
            zzpsZzZWe = zzP(zzR(zzpsZzZWe));
        }
        zzX(new zzYK3(zzzas, zzpsZzZWe, this.zzZop.zzMj(1), this.zzZop.zzMj(2)));
        if (z) {
            zzQ(zzpsZzZWe);
        }
        zzZUi();
    }

    public final zzZV8 zzZUA() {
        return this.zzZon.zzZ4q();
    }

    public final zzPS zzZUB() {
        return zzMf(0).zzMj(1);
    }

    public final zzPS zzZUC() {
        return zzMf(0).zzMj(0);
    }

    public final ArrayList<zzMD> zzZUD() {
        return this.zzZop.zzZVs();
    }

    public final Iterable<zzLT> zzZUE() {
        return this.zzZp5;
    }

    public final int zzZUF() {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzZUC().zzSF("clear")));
        if (iZzTP == 0) {
            return 1;
        }
        if (iZzTP != 1) {
            return iZzTP != 2 ? 0 : 3;
        }
        return 2;
    }

    public final zzYB5 zzZUG() {
        for (int size = this.zzZom.size() - 2; size >= 0; size--) {
            zzYB5 zzyb5 = this.zzZom.get(size).zzYr2;
            if (zzyb5 != null) {
                return zzyb5;
            }
        }
        return null;
    }

    public final int zzZUH() {
        zzYKK zzykkZzZ2S = zzMf(0).zzZ2S();
        if (zzykkZzZ2S == null) {
            return 0;
        }
        return zzZLJ.zzZ(zzykkZzZ2S, this.zzZog, zzMf(1).zzYra);
    }

    public final String zzZUI() {
        zzYKK zzykkZzZ2S = zzMf(0).zzZ2S();
        if (zzykkZzZ2S == null) {
            return "";
        }
        return zzZLI.zzY(zzykkZzZ2S, this.zzZog, zzMf(1).zzYra);
    }

    public final int zzZUJ() {
        zzZIH zzzihZzMf = zzMf(1);
        if (zzzihZzMf != null) {
            return zzzihZzMf.zzYr4;
        }
        return 15;
    }

    public final boolean zzZUK() {
        zzZIH zzzihZzMf = zzMf(1);
        return zzzihZzMf != null && zzzihZzMf.zzYr8;
    }

    public final boolean zzZUL() {
        return zzMf(0).zzYr8;
    }

    public final boolean zzZUM() {
        zzPT zzptZzSx = zzZUC().zzSx("white-space");
        return zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZlY);
    }

    public final boolean zzZUN() {
        zzPT zzptZzSx = zzZUC().zzSx("white-space");
        return zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZlX);
    }

    public final boolean zzZUO() {
        zzPT zzptZzSx = zzZUC().zzSx("white-space");
        return zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZlN);
    }

    public final com.aspose.words.internal.zzY5 zzZUP() {
        return new com.aspose.words.internal.zzY5(this.zzZoi.toArray());
    }

    public final boolean zzZUQ() {
        return zzMf(0).zzYr7 == 2;
    }

    public final int zzZUR() {
        String strZzSF = zzZUC().zzSF("writing-mode");
        if (com.aspose.words.internal.zzZKN.equals(strZzSF, "")) {
            return 0;
        }
        return zzL5.zzS7(strZzSF);
    }

    public final void zzZUS() {
        if (this.zzZoe) {
            zzMf(0);
            zzZVt();
            zzZAS zzzas = this.zzZod;
            if (zzzas != null) {
                zzZ(zzzas, false);
            } else {
                int i = this.zzZoc;
                if (i != 0) {
                    zzh(i, false);
                }
            }
            this.zzZoe = false;
            this.zzZod = null;
            this.zzZoc = 0;
        }
    }

    public final void zzZUT() {
        if (this.zzZoe || zzMf(0).zzYra.isImplicit() || zzZUm()) {
            return;
        }
        zzZ((zzZAS) new zzZIG("span", true), false);
        this.zzZoe = true;
        this.zzZod = null;
        this.zzZoc = 0;
    }

    public final void zzZUU() {
        if (this.zzZoe || zzMf(0).zzYra.isImplicit() || zzZUl()) {
            return;
        }
        this.zzZod = null;
        this.zzZoc = 0;
        if (zzZUm()) {
            if (zzZUi() == 0) {
                this.zzZod = zzMf(0).zzYra;
                zzZVt();
            } else {
                this.zzZoc = zzZUi();
                zzh(0, false);
            }
        }
        zzZ((zzZAS) new zzZIG(ContextChain.TAG_PRODUCT, true), false);
        this.zzZoe = true;
    }

    public final zzPT zzZUg() {
        if (this.zzZom.size() > 1) {
            return ((zzZIH) C21505OooO0Oo.OooO00o(2, this.zzZom)).zzMj(0).zzSx("text-align");
        }
        return null;
    }

    public final zzPS zzZUh() {
        if (isEmpty()) {
            return zzPS.zzZqo;
        }
        String strZzSF = zzZUC().zzSF("page");
        ArrayList<zzN0> arrayList = new ArrayList();
        for (zzN0 zzn0 : this.zzZp4) {
            if (zzn0.zzZVL().matches(strZzSF)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzN0>) arrayList, zzn0);
            }
        }
        if (arrayList.size() == 0) {
            return zzPS.zzZqo;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzSF) || arrayList.size() == 1) {
            return this.zzZoS.zzW(((zzN0) arrayList.get(0)).zzZWe());
        }
        zzPR zzpr = new zzPR();
        zzPR zzpr2 = new zzPR();
        for (zzN0 zzn02 : arrayList) {
            if (zzn02.zzZVL().zzZVK()) {
                zzpr2.zzO(zzn02.zzZWe());
            } else {
                zzpr.zzO(zzn02.zzZWe());
            }
        }
        zzpr.zzO(zzpr2.zzZWe());
        return this.zzZoS.zzW(zzpr.zzZWe());
    }

    public final zzL1 zzZUp() {
        return this.zzZoh.zzY1E();
    }

    public final zzZUZ zzZUq() {
        return this.zzZoj.zzad();
    }

    public final zzRL zzZUr() {
        return this.zzZok.peek();
    }

    public final zzLN zzZUs() {
        return this.zzZol.peek();
    }

    public final int zzZUt() {
        return zzMf(0).zzYr4;
    }

    public final zzZIH zzZUu() {
        return zzMf(0);
    }

    public final boolean zzZUv() {
        return zzMf(0).zzYr3;
    }

    public final zzZAS zzZUw() {
        return zzMf(0).zzYra;
    }

    public final zzQN zzZUx() {
        return this.zzZos;
    }

    public final int zzZUy() {
        return zzMf(0).zzYr5;
    }

    public final zzZV8 zzZUz() {
        return this.zzZon.zzZ4p();
    }

    public final void zzZVt() {
        zzZUi();
        zzh(0, false);
        zzZUn();
    }

    public final boolean zzh(int i, boolean z) {
        if (zzZUi() != 0) {
            zzZUn();
        }
        zzZIH zzzihZzMf = zzMf(0);
        if (i != 0) {
            zzPS zzpsZzMj = zzMf(0).zzMj(i);
            zzPT zzptZzSx = zzpsZzMj.zzSx(FirebaseAnalytics.Param.CONTENT);
            zzYKK zzykkZzQ = zzptZzSx != null ? zzYKK.zzQ(zzptZzSx.zzZWj()) : null;
            if (zzykkZzQ != null) {
                zzX(new zzYKD(new zzZIG("span", true), zzpsZzMj, i, zzykkZzQ));
                if (zzMf(0).zzYr5 == 2) {
                    zzZUn();
                } else if (z) {
                    zzQ(zzpsZzMj);
                    zzzihZzMf.zzYr3 = true;
                }
            }
        }
        return zzZUi() == i;
    }

    public final zzPS zzZ(zzMD zzmd) {
        String strZzZXu = zzmd.zzZXu();
        if (this.zzZoa.containsKey(strZzZXu)) {
            return this.zzZoa.get(strZzZXu);
        }
        return null;
    }

    private void zzZ(zzZIH zzzih, boolean z) {
        if (zzL5.zzW(zzzih.zzMj(0), zzzih.zzYr8) == 1) {
            if (z) {
                if (zzzih.zzYr6 == 2) {
                    this.zzZoi.add(1);
                    return;
                } else {
                    this.zzZoi.add(0);
                    return;
                }
            }
            com.aspose.words.internal.zzDB zzdb = this.zzZoi;
            zzdb.removeAt(zzdb.getCount() - 1);
        }
    }
}
