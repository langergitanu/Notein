package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZDN extends zzZDK implements zzZAL, zzZAS {
    private static String[] zzYr1 = new String[0];
    private String mName;
    private double zzYke;
    private int zzYkf;
    private zzZDR zzYkg;
    private zzZAP zzYkh;
    private int zzYqE;

    public zzZDN(String str) {
        this(str, 0);
    }

    @Override // com.aspose.words.zzZBM
    public final String getAttributeValue(String str, String str2) {
        zzZDS zzzdsZzJH = this.zzYkg.zzJH(str);
        return zzzdsZzJH != null ? zzzdsZzJH.getValue() : str2;
    }

    @Override // com.aspose.words.zzZBM
    public final String getLanguage() {
        return null;
    }

    public final String getName() {
        return this.mName;
    }

    public final int getRole() {
        return this.zzYkf;
    }

    @Override // com.aspose.words.zzZBM
    public final boolean isImplicit() {
        return false;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzKM(String str) {
        return getAttributeValue(str, null);
    }

    public final void zzWS(double d) {
        this.zzYke = d;
    }

    @Override // com.aspose.words.zzZAL
    public final zzPS zzYXf() {
        zzZDP zzzdp = (zzZDP) this.zzYkg.zzJH("style");
        return zzzdp != null ? zzzdp.zzZWe() : zzPS.zzZqo;
    }

    public final double zzYXg() {
        return this.zzYke;
    }

    public final zzZDN[] zzYXh() {
        ArrayList arrayList = new ArrayList();
        for (zzZDN zzzdnZzYXe = zzYXe(); zzzdnZzYXe != null; zzzdnZzYXe = zzzdnZzYXe.zzYXe()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZDN>) arrayList, zzzdnZzYXe);
        }
        zzZDN[] zzzdnArr = new zzZDN[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            zzzdnArr[(r1 - i) - 1] = (zzZDN) arrayList.get(i);
        }
        return zzzdnArr;
    }

    @Override // com.aspose.words.zzZDK
    public final zzZDK zzYXi() {
        zzZDN zzzdn = new zzZDN(this.mName, this.zzYqE);
        zzzdn.zzYkf = this.zzYkf;
        Iterator<zzZDS> it = this.zzYkg.iterator();
        while (it.hasNext()) {
            zzzdn.zzYkg.zzZ(it.next());
        }
        return zzzdn;
    }

    public final zzZDR zzYXj() {
        return this.zzYkg;
    }

    public final zzZAP zzYXk() {
        return this.zzYkh;
    }

    public final void zzYXl() {
        this.zzYkg.zzYXl();
        this.zzYkh.zzYXl();
    }

    @Override // com.aspose.words.zzZDK
    public void zzZ(zzZI0 zzzi0) throws Exception {
        zzzi0.zzZN(this.mName, this.zzYqE);
        this.zzYkg.zzZ(zzzi0);
        Iterator<zzZDK> it = this.zzYkh.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzi0);
        }
        zzzi0.zzp();
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2F() {
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2G() {
        return null;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2H() {
        return false;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2I() {
        return false;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2J() {
        return false;
    }

    @Override // com.aspose.words.zzZBM
    public final String[] zzZ2K() {
        String attributeValue = getAttributeValue("class", "");
        return com.aspose.words.internal.zzZKN.equals(attributeValue, "") ? zzYr1 : new String[]{attributeValue};
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2L() {
        return false;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM[] zzZ2M() {
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2N() {
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2O() {
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2P() {
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2Q() {
        return zzYXe();
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZTQ() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZXc() {
        return false;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZXd() {
        return false;
    }

    public final void zzyz(int i) {
        this.zzYkf = i;
    }

    public zzZDN(String str, int i) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = str;
        this.zzYqE = i;
        if (i == 1) {
            this.zzYkh = new zzZDM();
        } else {
            this.zzYkh = new zzZDJ(this);
        }
        this.zzYkg = new zzZDR();
    }
}
