package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZ18 extends zzZ0M {
    private float[] zzY2p;
    private float zzY2q;

    public zzZ18(zzZ14 zzz14, OfficeMath officeMath) {
        this(zzz14, officeMath, 1);
    }

    private void zzYH9() {
        if (zzYH5() || this.zzY2q < zzYH6()) {
            return;
        }
        float fZzuH = zzuH(0);
        float fZzuH2 = zzuH(1);
        float f = ((this.zzY2q - fZzuH) - fZzuH2) / 2.0f;
        if (f > 0.0f) {
            zzX(fZzuH + f, Float.NaN, 0);
            zzX(fZzuH2 + f, Float.NaN, 1);
        }
    }

    private void zzYHa() {
        if (zzYGk().zzZsL().getMathObjectType() != 9) {
            return;
        }
        Object[] objArr = new Object[zzQw().size()];
        int iMax = 1;
        for (int i = 0; i < zzQw().size(); i++) {
            ArrayList<zzZ13> arrayListZzZ = zzZ((zzZ0L) zzQw().get(i));
            objArr[i] = arrayListZzZ;
            iMax = Math.max(arrayListZzZ.size(), iMax);
        }
        if (iMax != 1) {
            zzZ(iMax, objArr);
            return;
        }
        for (zzZ13 zzz13 : zzQw()) {
            Iterator<zzZ13> it = zzz13.zzQw().get(0).zzQw().iterator();
            while (it.hasNext()) {
                it.next().zzU(zzz13.zzQw().get(0));
            }
        }
    }

    public final boolean zzYH5() {
        return getColumnsCount() == 1;
    }

    public final float zzYH6() {
        float[] fArr = this.zzY2p;
        return fArr[0] + fArr[1];
    }

    public final float[] zzYH7() {
        return this.zzY2p;
    }

    public final float zzYH8() {
        return this.zzY2q;
    }

    public final zzZ13 zzYHb() {
        return zzuV(zzQw().size() - 1);
    }

    @Override // com.aspose.words.zzZ0M
    public final void zzYHc() throws Exception {
        super.zzYHc();
        zzYH9();
    }

    @Override // com.aspose.words.zzZ0M, com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        if (zzYH5()) {
            zzYHa();
        }
        super.zzYHg();
    }

    public final void zzYr(float f) {
        this.zzY2q = f;
    }

    @Override // com.aspose.words.zzZ13
    public void zzZ(zzZ13 zzz13) {
        zzZ(zzz13, 0);
    }

    public final zzZ13 zzuV(int i) {
        return ((zzZ0L) zzQw().get(i)).zzQw().get(0);
    }

    private zzZ18(zzZ14 zzz14, OfficeMath officeMath, int i) {
        super(zzz14, officeMath, i);
        this.zzY2q = 0.0f;
        this.zzY2p = new float[]{0.0f, 0.0f};
    }

    public final void zzZ(zzZ13 zzz13, int i) {
        zzZ0L zzz0l = (zzZ0L) com.aspose.words.internal.zzZKW.zzZ(zzz13, zzZ0L.class);
        if (zzz0l == null) {
            zzz0l = new zzZ0L(zzYGj(), this, zzz13.zzYGk());
            zzz0l.zzZ(zzz13);
        }
        zzz0l.zzuF(i);
        super.zzZ((zzZ13) zzz0l);
    }

    private ArrayList<zzZ13> zzZ(zzZ0L zzz0l) {
        zzZ13 zzz13 = zzz0l.zzQw().get(0);
        ArrayList<zzZ13> arrayList = new ArrayList<>();
        zzZ13 zzz132 = new zzZ13(zzYGj(), zzz13.zzYGk());
        for (zzZ13 zzz133 : zzz13.zzQw()) {
            zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz133, zzYZP.class);
            if (zzyzp != null && ("&".equals(zzyzp.getText()) || zzyzp.getText().contains(Character.toString('#')))) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz132);
                zzz132 = new zzZ13(zzYGj(), zzz13.zzYGk());
            } else {
                zzz132.zzZ(zzz133);
            }
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz132);
        return arrayList;
    }

    private void zzZ(int i, Object[] objArr) {
        zzZ18 zzz18 = new zzZ18(zzYGj(), zzYGk(), i);
        zzz18.zzYj(0.0f);
        for (int i2 = 0; i2 < zzQw().size(); i2++) {
            zzZ0L zzz0l = (zzZ0L) zzQw().get(i2);
            zzZ17 zzz17 = new zzZ17(zzYGj(), zzz18, zzz0l.zzYGk());
            int iZzYFk = zzz0l.zzYFk() == 0 ? 3 : zzz0l.zzYFk();
            Iterator it = ((ArrayList) objArr[i2]).iterator();
            while (it.hasNext()) {
                zzz17.zzZ((zzZ13) it.next());
            }
            zzz18.zzZ(zzz17, iZzYFk);
        }
        zzQw().clear();
        zzZ13 zzz0l2 = new zzZ0L(zzYGj(), this, zzYGk());
        zzz0l2.zzZ(zzz18);
        super.zzZ(zzz0l2);
    }
}
