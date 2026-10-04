package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOG {
    private zzY8Y zzYzV = new zzY8Y();
    private zzY8V zzYzU = new zzY8V();
    private zzZZG<EditableRangeStart> zzYA9 = new zzZZG<>(0);
    private zzZZG<EditableRangeEnd> zzYA8 = new zzZZG<>(0);
    private com.aspose.words.internal.zzD4 zzYzT = new com.aspose.words.internal.zzD4();

    public zzZOG() {
    }

    private EditableRangeEnd zzCc(int i) {
        return this.zzYA8.getItem(i);
    }

    private EditableRangeStart zzCd(int i) {
        return this.zzYA9.getItem(i);
    }

    private int zzCe(int i) {
        int i2 = this.zzYzT.get(i);
        if (com.aspose.words.internal.zzD4.zzWm(i2)) {
            return -1;
        }
        return i2;
    }

    private int zzCm(int i) {
        return this.zzYA8.zzTe(i);
    }

    private int zzCn(int i) {
        return this.zzYA9.zzTe(i);
    }

    private int zzY(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        if (this.zzYA8.getItemCount() == 0) {
            return 0;
        }
        long position = zzzow.zzq().getPosition();
        for (int i2 = 0; i2 < this.zzYA8.getItemCount(); i2++) {
            zzzow.zzl(zzCm(i2));
        }
        zzzow.zzl(i);
        return (int) (zzzow.zzq().getPosition() - position);
    }

    public final void zzCf(int i) {
        this.zzYA8.zzX(i, new EditableRangeEnd(null));
    }

    public final void zzL(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        String str;
        int itemCount = this.zzYA9.getItemCount();
        int iZzXc = zzzox.zzXc();
        int iZzX9 = zzzox.zzX9() & 65535;
        int i2 = this.zzYzV.get(itemCount);
        int iZzG9 = zzZZ5.zzG9(i2);
        if (iZzG9 == Integer.MIN_VALUE) {
            str = this.zzYzU.zzY3y().get(i2 - 1);
            iZzG9 = 0;
        } else {
            str = "";
        }
        this.zzYA9.zzX(i, new EditableRangeStart(null, itemCount, str, iZzG9, iZzX9));
        zzCc(iZzXc).setId(itemCount);
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        if (this.zzYzV.getCount() == 0) {
            return;
        }
        this.zzYA9.getItemCount();
        this.zzYA8.getItemCount();
        zzzra.zzYGB.zzXyn.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGB.zzXyn.zzYHJ = this.zzYzV.zzX(zzzow, true);
        zzzra.zzYGB.zzXym.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGB.zzXym.zzYHJ = zzZ(zzzow, i);
        zzzra.zzYGB.zzXyl.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGB.zzXyl.zzYHJ = zzY(zzzow, i);
        zzzra.zzYGB.zzXyk.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGB.zzXyk.zzYHJ = this.zzYzU.zzX(zzzow, false);
    }

    public final zzZZG<EditableRangeEnd> zzZao() {
        return this.zzYA8;
    }

    public final zzZZG<EditableRangeStart> zzZap() {
        return this.zzYA9;
    }

    public zzZOG(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYzV.zzZ(zzzox, zzzra.zzYGB.zzXyn);
        this.zzYzU.zzZ(zzzox, zzzra.zzYGB.zzXyk);
        zzzox.zzq().zzU(zzzra.zzYGB.zzXyl.zzYHK, 0);
        zzYLK.zzZ(zzzox, zzzra.zzYGB.zzXyl.zzYHJ, 0, new zzZV5(this), "Plcfbklprot");
        zzzox.zzq().zzU(zzzra.zzYGB.zzXym.zzYHK, 0);
        zzYLK.zzZ(zzzox, zzzra.zzYGB.zzXym.zzYHJ, 6, new zzZV2(this), "Plcfbkfprot");
        this.zzYA9.getItemCount();
        this.zzYA8.getItemCount();
        this.zzYA9.add(Integer.MAX_VALUE);
        this.zzYA8.add(Integer.MAX_VALUE);
    }

    private int zzZ(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        if (this.zzYA9.getItemCount() == 0) {
            return 0;
        }
        long position = zzzow.zzq().getPosition();
        for (int i2 = 0; i2 < this.zzYA9.getItemCount(); i2++) {
            zzzow.zzl(zzCn(i2));
        }
        zzzow.zzl(i);
        for (int i3 = 0; i3 < this.zzYA9.getItemCount(); i3++) {
            EditableRangeStart editableRangeStartZzCd = zzCd(i3);
            zzzow.zzl(zzCe(editableRangeStartZzCd.getId()));
            zzzow.zzJ((short) editableRangeStartZzCd.getFlags());
        }
        return (int) (zzzow.zzq().getPosition() - position);
    }

    public final void zzZ(int i, EditableRangeStart editableRangeStart) {
        int iZzG8;
        if (com.aspose.words.internal.zzZYD.zzXk(editableRangeStart.getSingleUser())) {
            iZzG8 = this.zzYzU.zzY3y().add(editableRangeStart.getSingleUser()) + 1;
        } else {
            iZzG8 = zzZZ5.zzG8(editableRangeStart.getEditorGroup());
        }
        this.zzYzV.add(iZzG8);
        this.zzYA9.zzX(i, editableRangeStart);
    }

    public final void zzZ(int i, EditableRangeEnd editableRangeEnd) {
        this.zzYzT.add(editableRangeEnd.getId(), this.zzYA8.zzX(i, editableRangeEnd));
    }

    public final int zzZ(zzZOG zzzog, int i, int i2) {
        int iMax = i2;
        for (int i3 = 0; i3 < zzzog.zzYA9.getItemCount(); i3++) {
            int iZzCn = zzzog.zzCn(i3);
            EditableRangeStart editableRangeStartZzCd = zzzog.zzCd(i3);
            editableRangeStartZzCd.setId(editableRangeStartZzCd.getId() + i2);
            iMax = Math.max(iMax, editableRangeStartZzCd.getId());
            zzZ(iZzCn + i, editableRangeStartZzCd);
        }
        for (int i4 = 0; i4 < zzzog.zzYA8.getItemCount(); i4++) {
            int iZzCm = zzzog.zzCm(i4);
            EditableRangeEnd editableRangeEndZzCc = zzzog.zzCc(i4);
            editableRangeEndZzCc.setId(editableRangeEndZzCc.getId() + i2);
            iMax = Math.max(iMax, editableRangeEndZzCc.getId());
            zzZ(iZzCm + i, editableRangeEndZzCc);
        }
        return iMax + 1;
    }
}
