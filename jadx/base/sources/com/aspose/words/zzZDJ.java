package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDJ implements zzZAP {
    private zzZDN zzYkd;
    private ArrayList<zzZDK> zzZm = new ArrayList<>();

    public zzZDJ(zzZDN zzzdn) {
        this.zzYkd = zzzdn;
    }

    @Override // com.aspose.words.zzZAP
    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZDK> iterator() {
        return this.zzZm.iterator();
    }

    @Override // com.aspose.words.zzZAP
    public final zzZDN zzF(String str, int i, int i2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZm.size();
        zzZDK[] zzzdkArr = new zzZDK[i2];
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, i, zzzdkArr, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            zzW(zzzdkArr[i3]);
        }
        zzZDN zzzdn = new zzZDN(str);
        for (int i4 = 0; i4 < i2; i4++) {
            zzzdn.zzYXk().zzX(zzzdkArr[i4]);
        }
        zzZ(i, zzzdn);
        return zzzdn;
    }

    @Override // com.aspose.words.zzZAP
    public final zzZDN zzJG(String str) {
        for (zzZDK zzzdk : this.zzZm) {
            if (zzzdk instanceof zzZDN) {
                zzZDN zzzdn = (zzZDN) zzzdk;
                if (com.aspose.words.internal.zzZKN.equals(zzzdn.getName(), str)) {
                    return zzzdn;
                }
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZAP
    public final int zzV(zzZDK zzzdk) {
        return this.zzZm.indexOf(zzzdk);
    }

    @Override // com.aspose.words.zzZAP
    public final void zzW(zzZDK zzzdk) {
        this.zzZm.indexOf(zzzdk);
        if (zzzdk.zzYXc() != null) {
            zzzdk.zzYXc().zzU(zzzdk.zzYXd());
        }
        if (zzzdk.zzYXd() != null) {
            zzzdk.zzYXd().zzT(zzzdk.zzYXc());
        }
        zzzdk.zzR(null);
        zzzdk.zzT(null);
        zzzdk.zzU(null);
        this.zzZm.remove(zzzdk);
    }

    @Override // com.aspose.words.zzZAP
    public final void zzX(zzZDK zzzdk) {
        zzZDK zzzdk2;
        zzzdk.zzR(this.zzYkd);
        if (this.zzZm.size() > 0) {
            zzzdk2 = (zzZDK) C21505OooO0Oo.OooO00o(1, this.zzZm);
            zzzdk2.zzU(zzzdk);
        } else {
            zzzdk2 = null;
        }
        zzzdk.zzT(zzzdk2);
        zzzdk.zzU(null);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzdk);
    }

    @Override // com.aspose.words.zzZAP
    public final void zzYXl() {
        this.zzZm.trimToSize();
    }

    @Override // com.aspose.words.zzZAP
    public final void zzZ(int i, zzZDK zzzdk) {
        if (i >= 0) {
            this.zzZm.size();
        }
        zzzdk.zzR(this.zzYkd);
        if (i > 0) {
            zzZDK zzzdk2 = this.zzZm.get(i - 1);
            zzzdk2.zzU(zzzdk);
            zzzdk.zzT(zzzdk2);
        }
        if (i < this.zzZm.size()) {
            zzZDK zzzdk3 = this.zzZm.get(i);
            zzzdk3.zzT(zzzdk);
            zzzdk.zzU(zzzdk3);
        }
        this.zzZm.add(i, zzzdk);
    }

    @Override // com.aspose.words.zzZAP
    public final zzZDK zzyy(int i) {
        return this.zzZm.get(i);
    }
}
