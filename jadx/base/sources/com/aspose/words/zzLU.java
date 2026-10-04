package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzLU implements Iterable<zzPT> {
    private zzPR zzZou = new zzPR();

    public final int getCount() {
        return this.zzZou.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzPT> iterator() {
        return this.zzZou.iterator();
    }

    public final void remove(String str) {
        this.zzZou.remove(str);
    }

    public final void setString(String str, String str2) {
        zzZr(str, str2);
    }

    public final void zzJ(String... strArr) {
        if (strArr.length != 0) {
            zzL2 zzl2 = new zzL2();
            for (String str : strArr) {
                zzl2.zzI(zzL4.zzS4(str));
            }
            this.zzZou.zzV(new zzM3("font-family", new zzPA(zzl2)));
        }
    }

    public final void zzN(zzL4 zzl4) {
        this.zzZou.zzV(new zzM3("background", new zzRP(zzl4, null, null, null, null)));
    }

    public final zzMP zzSd(String str) {
        zzPT zzptZzSx = this.zzZou.zzSx(str);
        if (zzptZzSx == null) {
            return null;
        }
        return zzptZzSx.zzZWj();
    }

    public final void zzSe(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzZou.zzV(new zzM3("text-decoration", new zzLL(new zzOT(str))));
        }
    }

    public final void zzT(double d, double d2, double d3, double d4) {
        this.zzZou.zzV(new zzM3("padding-top", new zzOI(d, 4), (byte) 0));
        this.zzZou.zzV(new zzM3("padding-right", new zzOI(d2, 4), (byte) 0));
        this.zzZou.zzV(new zzM3("padding-bottom", new zzOI(d3, 4), (byte) 0));
        this.zzZou.zzV(new zzM3("padding-left", new zzOI(d4, 4), (byte) 0));
    }

    public final void zzU(String str, double d) {
        this.zzZou.zzV(new zzM3(str, new zzMU(d), (byte) 0));
    }

    public final void zzV(String str, double d) {
        this.zzZou.zzV(new zzM3(str, new zzNH(d), (byte) 0));
    }

    public final void zzW(zzL4 zzl4, zzL4 zzl42) {
        this.zzZou.zzV(new zzM3("font", new zzP8(zzl4, zzl42)));
    }

    public final void zzX(zzL4 zzl4, zzL4 zzl42, zzL4 zzl43) {
        zzZ(zzMR.zzSk("border"), zzl4, zzl42, zzl43);
    }

    public final void zzY(String str, com.aspose.words.internal.zzPV zzpv) {
        this.zzZou.zzV(new zzM3(str, new zzQC(zzpv), (byte) 0));
    }

    public final void zzZ(String str, double d, int i) {
        this.zzZou.zzV(new zzM3(str, new zzOI(d, i), (byte) 0));
    }

    public final zzPS zzZWe() {
        return this.zzZou.zzZWe();
    }

    public final void zzZq(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzZou.zzV(new zzM3(str, new zzL6(str2), (byte) 0));
    }

    public final void zzZr(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzZou.zzV(new zzM3(str, new zzM2(str2), (byte) 0));
    }

    public final void zzZs(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzZou.zzV(new zzM3(str, new zzOT(str2), (byte) 0));
    }

    public final void zzx(double d, double d2) {
        zzOI zzoi = new zzOI(d, 4);
        this.zzZou.zzV(new zzM3("size", com.aspose.words.internal.zzAN.zzL(d, d2) ? zzMX.zzZ(zzoi) : zzMX.zzZ(zzoi, new zzOI(d2, 4))));
    }

    public final void zzU(double d, double d2, double d3, double d4) {
        zzZ(new zzOI(d, 4), new zzOI(d2, 4), new zzOI(d3, 4), new zzOI(d4, 4));
    }

    public final void zzV(zzPT zzpt) {
        this.zzZou.zzV(zzpt);
    }

    public final void zzW(zzLU zzlu) {
        if (zzlu != null) {
            this.zzZou.zzO(zzlu.zzZou);
        }
    }

    public final void zzY(String str, zzL2 zzl2) {
        zzl2.getCount();
        this.zzZou.zzV(new zzM3(str, new zzMP(zzl2)));
    }

    public final void zzZ(String str, String str2, zzL2 zzl2) {
        com.aspose.words.internal.zzZYD.zzXk(str2);
        zzl2.getCount();
        this.zzZou.zzV(new zzM3(str, new zzP1(str2, zzl2), (byte) 0));
    }

    public final void zzX(zzL4 zzl4, zzL4 zzl42) {
        zzZ(zzMR.zzSk("border-bottom"), zzl4, zzl42, (zzL4) null);
    }

    public final void zzY(zzL4 zzl4, zzL4 zzl42) {
        zzZ(zzMR.zzSk("border-right"), zzl4, zzl42, (zzL4) null);
    }

    public final void zzX(zzL2 zzl2) {
        zzL2 zzl22 = new zzL2();
        for (zzL4 zzl4 : zzl2) {
            if (zzl22.getCount() > 0) {
                zzl22.zzI(new zzQ8());
            }
            zzl22.zzI(zzl4);
        }
        this.zzZou.zzV(new zzM3("background", new zzRP(zzl22)));
    }

    public final void zzZ(zzL4 zzl4, zzL4 zzl42, zzL4 zzl43, zzL4 zzl44) {
        this.zzZou.zzV(new zzM3("margin-top", zzl4, (byte) 0));
        this.zzZou.zzV(new zzM3("margin-right", zzl42, (byte) 0));
        this.zzZou.zzV(new zzM3("margin-bottom", zzl43, (byte) 0));
        this.zzZou.zzV(new zzM3("margin-left", zzl44, (byte) 0));
    }

    public final void zzY(zzL2 zzl2) {
        this.zzZou.zzV(new zzM3("text-decoration", new zzLL(zzl2)));
    }

    private void zzZ(zzMS zzms, zzL4 zzl4, zzL4 zzl42, zzL4 zzl43) {
        zzL2 zzl2 = new zzL2(zzl4);
        if (zzl42 != null) {
            zzl2.zzI(zzl42);
        }
        if (zzl43 != null) {
            zzl2.zzI(zzl43);
        }
        this.zzZou.zzO(zzms.zzY(zzl2, false, false));
    }

    public final void zzZ(String str, zzMP zzmp) {
        this.zzZou.zzV(new zzM3(str, zzmp));
    }
}
