package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6P extends zzZ6S {
    private zzZ6O zzYfw;
    private boolean zzYfx;
    Document zzYfy;

    public zzZ6P(Document document, zzYMD zzymd) {
        super(zzymd);
        this.zzYfy = document;
        this.zzYfx = zzZ3X.zzYNB();
    }

    private void zzH(ArrayList<zzZNO> arrayList, ArrayList<zzZNO> arrayList2) {
        zzZ(arrayList, arrayList2, ((zzYN8) this.zzYgm).zzYF(false));
        zzZ(arrayList, arrayList2, ((zzYN8) this.zzYgm).zzYE(false));
        zzZNB.zzS(arrayList);
        zzZNB.zzS(arrayList2);
    }

    private static int zzS(ArrayList<zzUN> arrayList, int i, int i2) throws Exception {
        if (arrayList != null) {
            arrayList.size();
        }
        int size = i2 / arrayList.size();
        for (int size2 = arrayList.size() - 1; size2 >= 0 && i > i2; size2--) {
            zzUN zzun = arrayList.get(size2);
            int height = zzun.getHeight();
            if (height > size) {
                zzZ(zzun, Math.max(size - height, i2 - i) + height);
            }
            i += zzun.getHeight() - height;
        }
        return i;
    }

    private static void zzX(ArrayList<zzUN> arrayList, int i, int i2, int i3) throws Exception {
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            zzUN zzun = arrayList.get(i5);
            int iMax = Math.max(zzun.zzZZH(), i4);
            int i6 = iMax + i2;
            if (i6 > i3) {
                iMax = Math.max(iMax - (i6 - i3), i4);
            }
            int height = zzun.getHeight() + zzUN.zzZv1;
            i2 -= height;
            i4 = height + iMax;
            zzun.setY(iMax);
            zzun.setX(i);
        }
    }

    private int zzYSA() throws Exception {
        return this.zzYfx ? (((zzYN8) this.zzYgm).zz5X() - zzUN.zzZuZ) - zzUN.MARGIN : ((zzYN8) this.zzYgm).zzZXT() + zzUN.zzZuZ;
    }

    private boolean zzYSE() {
        zzZ6R zzz6rZza8 = this.zzYgm.zzab().zza8();
        boolean z = zzz6rZza8.zzYSR().getShowInBalloons() != 0;
        if (this.zzYgm.zzab().zzZoG() && z) {
            return true;
        }
        return this.zzYgm.zzab().zzZoF() && zzz6rZza8.getCommentDisplayMode() == 1;
    }

    private ArrayList<zzUN> zzYSJ() {
        return (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYgm.zzab().zzZoV(), this.zzYgm, new ArrayList());
    }

    private int zzYSy() throws Exception {
        return zzYSA() + (this.zzYfx ? zzUN.zzZuX : zzUN.zzZuY);
    }

    private ArrayList<zzUN> zzYTA() {
        return (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYgm.zzab().zzZoW(), this.zzYgm, new ArrayList());
    }

    private static int zzZt(ArrayList<zzUN> arrayList) throws Exception {
        int height = 0;
        for (zzUN zzun : arrayList) {
            zzUO zzuo = new zzUO(zzun);
            zzuo.zzZZO();
            zzun.setHeight(zzuo.zzZZL() + zzun.zz5U());
            height += zzun.getHeight();
        }
        return height;
    }

    private static void zzZu(ArrayList<zzUN> arrayList) throws Exception {
        zzYBK zzybk = new zzYBK();
        for (zzUN zzun : arrayList) {
            zzybk.zzZ((zzYBL) zzun, 1073741823, true, false);
            zzun.setHeight(zzybk.zz0t() + zzun.zz5U());
        }
    }

    public final boolean zzUW(boolean z) {
        this.zzYgm.zzab();
        if (this.zzYgm.zzab().zza8().getCommentDisplayMode() == 0) {
            return false;
        }
        if (zzYTA().size() > 0) {
            return true;
        }
        return !z && zzYSJ().size() > 0;
    }

    public final boolean zzYSB() {
        return this.zzYfx;
    }

    public final com.aspose.words.internal.zzZQ4 zzYSC() throws Exception {
        return com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(zzYSA(), 0, zzUN.MARGIN, this.zzYgm.getHeight()));
    }

    public final boolean zzYSD() {
        return this.zzYfy.getBackgroundShape() != null;
    }

    public final boolean zzYSF() {
        return (this.zzYgm.zzab().zza8().zzYSR().getShowInBalloons() == 0 || zzYTA() == null || zzYTA().size() <= 0) ? false : true;
    }

    public final boolean zzYSG() {
        return zzUW(false) || zzYSF() || zzYSE();
    }

    public final void zzYSH() throws Exception {
        if (zzUW(true) || zzYSF()) {
            ArrayList<zzUN> arrayListZzYTA = zzYTA();
            Collections.sort(arrayListZzYTA, new zzUM());
            zzZu(arrayListZzYTA);
            int iZzZt = zzZt(arrayListZzYTA);
            int size = (arrayListZzYTA.size() - 1) * zzUN.zzZv1;
            zzX(arrayListZzYTA, zzYSy(), zzS(arrayListZzYTA, iZzZt, (((zzYN8) this.zzYgm).zzYqn() - ((zzYN8) this.zzYgm).zzYqo()) - size) + size, ((zzYN8) this.zzYgm).zzYqn());
        }
    }

    public final Iterable<zzZ6X> zzYSI() {
        ArrayList arrayList = new ArrayList();
        if (zzUW(false) || zzYSF()) {
            Iterator<zzUN> it = zzYTA().iterator();
            while (it.hasNext()) {
                zzZ6X zzz6x = new zzZ6X(it.next());
                if (zzz6x.zzYTC().zzY60() && zzYSF()) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ6X>) arrayList, zzz6x);
                }
                if (!zzz6x.zzYTC().zzY60() && zzUW(false)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ6X>) arrayList, zzz6x);
                }
            }
            Iterator<zzUN> it2 = zzYSJ().iterator();
            while (it2.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ6X>) arrayList, new zzZ6X(it2.next()));
            }
        }
        return arrayList;
    }

    public final zzZ6O zzYSK() throws Exception {
        if (this.zzYfw == null) {
            this.zzYfw = zz5.zzZ((zzYN8) this.zzYgm);
        }
        return this.zzYfw;
    }

    public final float zzYSz() throws Exception {
        return ((zzUN.zzZuZ + zzUN.MARGIN) - (this.zzYfx ? ((zzYN8) this.zzYgm).zz5X() : ((zzYN8) this.zzYgm).zz5V())) / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzV(this);
        ((zzYN8) this.zzYgm).zzYqg();
        zzZ(zzz61, 524288);
        if (((zzYN8) this.zzYgm).zzYqq() != null) {
            new zzZ6V(((zzYN8) this.zzYgm).zzYqq(), (zzYN8) this.zzYgm).zzZ(zzz61);
        }
        if (((zzYN8) this.zzYgm).zzYqp() != null) {
            new zzZ6V(((zzYN8) this.zzYgm).zzYqp(), (zzYN8) this.zzYgm).zzZ(zzz61);
        }
        zzZ(zzz61, 1048576);
        ArrayList<zzZNO> arrayList = new ArrayList<>();
        ArrayList<zzZNO> arrayList2 = new ArrayList<>();
        zzH(arrayList, arrayList2);
        zzZ6S.zzZ(zzz61, arrayList2);
        zzZ(zzz61, 2097152);
        ((zzYN8) this.zzYgm).zzYqf();
        zzZ(zzz61, 4194304);
        Iterator<zzUZ> it = ((zzYN8) this.zzYgm).zzT(null, null).iterator();
        while (it.hasNext()) {
            new zzZ6Y(it.next()).zzZ(zzz61);
        }
        zzZ(zzz61, 8388608);
        zzZ6S.zzZ(zzz61, arrayList);
        zzZ(zzz61, 16777216);
        zzz61.zzU(this);
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZm() {
        return 0.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZo() {
        return 0.0f;
    }

    private static void zzZ(zzZ61 zzz61, int i) throws Exception {
        zzz61.zzy2(i);
        zzz61.zzYTX();
    }

    private static void zzZ(ArrayList<zzZNO> arrayList, ArrayList<zzZNO> arrayList2, zzZNL zzznl) {
        if (zzznl != null) {
            for (zzZNO zzzno : zzznl) {
                if (zzzno.zzZ99() != 25604) {
                    if (zzzno.zzZ93().zzaa().zzbD()) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzno);
                    } else {
                        zzzno.zzZ93().zzaa();
                        if (!zzZKY.zzT((zzTC) zzzno.zzZ93())) {
                            com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzzno);
                        }
                    }
                }
            }
        }
    }

    private static void zzZ(zzUN zzun, int i) throws Exception {
        if (zzun.getHeight() <= i) {
            return;
        }
        zzUO zzuo = new zzUO(zzun);
        int iZzZZM = -1;
        while (zzuo.moveNext()) {
            zzZ55 zzz55ZzZZN = zzuo.zzZZN();
            int iZzZZM2 = zzuo.zzZZM() + zzz55ZzZZN.getHeight() + zzun.zz5U();
            if (iZzZZM2 > i) {
                if (iZzZZM == -1) {
                    zzun.zzV(zzuo.moveNext() ? zzuo.zzZZN() : null);
                    zzun.setHeight(iZzZZM2);
                    return;
                } else {
                    zzun.zzV(zzz55ZzZZN);
                    zzun.setHeight(iZzZZM + zzun.zz5U());
                    return;
                }
            }
            iZzZZM = zzuo.zzZZM() + zzz55ZzZZN.getHeight();
        }
    }
}
