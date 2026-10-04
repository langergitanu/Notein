package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCE extends zz80 implements Cloneable, Iterable<zzCF> {
    private int zzZeB;
    private int zzZxi;
    private int zzZ9b = -1;
    private com.aspose.words.internal.zzD3<zzCF> zzZfA = new com.aspose.words.internal.zzD3<>();
    private ArrayList<zzFP> zzZbS = new ArrayList<>(3);

    public zzCE(int i) {
        this.zzZxi = i;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzKf(int i) {
        this.zzZ9b = i;
        int valueCount = zzZG7().getValueCount();
        int i2 = this.zzZ9b;
        if (valueCount <= i2) {
            zzNy(i2 + 1);
        }
    }

    private void zzO(zzCF zzcf) {
        zzE9 zze9 = (zzE9) com.aspose.words.internal.zzZKW.zzZ(zzcf, zzE9.class);
        if (zze9 == null) {
            return;
        }
        while (this.zzZbS.size() > zze9.zzZLd()) {
            zze9.zzZLe().add(0, null);
        }
        Iterator<zzCF> it = this.zzZfA.zzCJ().iterator();
        int iZzZLd = -1;
        while (it.hasNext()) {
            zzE9 zze92 = (zzE9) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzE9.class);
            if (zze92 != null) {
                if (iZzZLd < 0) {
                    iZzZLd = zze92.zzZLd();
                } else {
                    zze92.zzZLd();
                }
                while (zze92.zzZLd() < zze9.zzZLd()) {
                    zze92.zzZLe().add(0, null);
                }
            }
        }
        while (zze9.zzZLd() < iZzZLd) {
            zze9.zzZLe().add(0, null);
        }
        zzFP zzfpZzZG7 = zzZG7();
        while (this.zzZbS.size() < zze9.zzZLd()) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZbS, zzfpZzZG7.zzZNb());
        }
    }

    private zzFP zzZG7() {
        if (this.zzZbS.size() == 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZbS, new zzFP());
        }
        return (zzFP) C21505OooO0Oo.OooO00o(1, this.zzZbS);
    }

    private void zzZGa() {
        int index = -1;
        for (zzCF zzcf : this.zzZfA.zzCJ()) {
            if (index < zzcf.getIndex()) {
                index = zzcf.getIndex();
            }
        }
        zzKf(index);
    }

    public final void clear() {
        while (true) {
            ArrayList<zzFP> arrayList = this.zzZbS;
            if (arrayList == null || arrayList.size() <= 1) {
                break;
            } else {
                this.zzZbS.remove(0);
            }
        }
        this.zzZ9b = -1;
        zzNy(0);
        this.zzZfA.clear();
        zzZGb();
    }

    public final String getFormatCode() {
        return zzZG7().getFormatCode();
    }

    public final int getValueCount() {
        return zzZG7().getValueCount();
    }

    public final int getValueType() {
        return this.zzZxi;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzCF> iterator() {
        return this.zzZfA.zzCJ().iterator();
    }

    public final void remove(int i) {
        if (zzZG7().getValueCount() > i) {
            zzNy(zzZG7().getValueCount() - 1);
        }
        if (i > this.zzZ9b) {
            return;
        }
        com.aspose.words.internal.zzD3<zzCF> zzd3 = new com.aspose.words.internal.zzD3<>(this.zzZfA.getCount());
        int index = -1;
        for (zzCF zzcf : this.zzZfA.zzCJ()) {
            if (zzcf.getIndex() != i) {
                if (zzcf.getIndex() > i) {
                    zzcf.setIndex(zzcf.getIndex() - 1);
                }
                zzd3.set(zzcf.getIndex(), zzcf);
                if (index < zzcf.getIndex()) {
                    index = zzcf.getIndex();
                }
            }
        }
        this.zzZfA = zzd3;
        this.zzZ9b = index;
        zzZGb();
    }

    public final void setFormatCode(String str) {
        if (com.aspose.words.internal.zzZKN.equals(zzZG7().getFormatCode(), str)) {
            return;
        }
        zzZGb();
        Iterator<zzFP> it = this.zzZbS.iterator();
        while (it.hasNext()) {
            it.next().setFormatCode(str);
        }
    }

    public final int zz2w() {
        return this.zzZ9b;
    }

    public final void zzKe(int i) {
        if (this.zzZxi == i) {
            return;
        }
        this.zzZxi = i;
        zzZGb();
    }

    public final zzCF zzKg(int i) {
        return this.zzZfA.get(i);
    }

    public final void zzNy(int i) {
        if (zzZG7().getValueCount() == i) {
            return;
        }
        zzZGb();
        for (zzFP zzfp : this.zzZbS) {
            if (zzfp.getValueCount() >= zzZG7().getValueCount()) {
                zzfp.zzNy(i);
            }
        }
    }

    public final void zzP(zzCF zzcf) {
        if (zzcf == null) {
            return;
        }
        this.zzZfA.set(zzcf.getIndex(), zzcf);
        if (zzcf.getIndex() > this.zzZ9b) {
            zzKf(zzcf.getIndex());
        }
        zzZGb();
        zzcf.zzT(this);
    }

    public final void zzX(zzCF zzcf, int i) {
        if (zzcf != null) {
            zzO(zzcf);
            zzP(zzcf);
        } else {
            this.zzZfA.zzVG(i);
            if (this.zzZ9b == i) {
                zzZGa();
            }
            zzZGb();
        }
    }

    public final void zzZ(int i, zzCF zzcf) {
        com.aspose.words.internal.zzD3<zzCF> zzd3 = new com.aspose.words.internal.zzD3<>(this.zzZfA.getCount() + 1);
        for (zzCF zzcf2 : this.zzZfA.zzCJ()) {
            if (zzcf2.getIndex() >= i) {
                zzcf2.setIndex(zzcf2.getIndex() + 1);
            }
            zzd3.set(zzcf2.getIndex(), zzcf2);
        }
        this.zzZfA = zzd3;
        if (zzcf != null) {
            zzO(zzcf);
            zzd3.add(i, zzcf);
            zzcf.zzT(this);
            this.zzZ9b = Math.max(this.zzZ9b + 1, i);
        } else {
            int i2 = this.zzZ9b;
            if (i < i2) {
                this.zzZ9b = i2 + 1;
            }
        }
        zzNy(zzZG7().getValueCount() + 1);
        zzZGb();
    }

    public final ArrayList<zzFP> zzZG8() {
        return this.zzZbS;
    }

    public final int zzZG9() {
        return this.zzZeB;
    }

    public final void zzZGb() {
        this.zzZeB++;
    }

    public final zzCE zzZGc() {
        zzCE zzce = (zzCE) memberwiseClone();
        zzce.zzZfA = new com.aspose.words.internal.zzD3<>();
        if (this.zzZbS != null) {
            zzce.zzZbS = new ArrayList<>(this.zzZbS.size());
            Iterator<zzFP> it = this.zzZbS.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zzce.zzZbS, it.next().zzZNb());
            }
        }
        Iterator<zzCF> it2 = this.zzZfA.zzCJ().iterator();
        while (it2.hasNext()) {
            zzCF zzcfZzZLf = it2.next().zzZLf();
            zzcfZzZLf.zzT(zzce);
            zzEB zzeb = (zzEB) com.aspose.words.internal.zzZKW.zzZ(zzcfZzZLf, zzEB.class);
            if (zzeb != null) {
                zzeb.zzd(zzce.zzZbS);
            }
            zzce.zzP(zzcfZzZLf);
        }
        zzce.setExtensions(zzZBz());
        return zzce;
    }

    public final boolean zzZIg() {
        return this.zzZfA.getCount() > 0;
    }

    public final int zzZIh() {
        return this.zzZfA.getCount();
    }

    public final void zzZIm() {
        int i = 0;
        while (i < zzZG7().getValueCount()) {
            int i2 = i + 1;
            zzP(new zzFA(i, i2));
            i = i2;
        }
    }

    public final zzCF zzZIn() {
        for (int i = 0; i <= this.zzZ9b; i++) {
            if (!zzCF.zzR(zzKg(i))) {
                return zzKg(i);
            }
        }
        return null;
    }

    public final void zzZ(zzFP zzfp) {
        if (this.zzZbS == null) {
            this.zzZbS = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZbS, zzfp);
    }
}
