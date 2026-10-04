package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTC {
    private zzYTD zzXRB;
    private zzYOR zzXRT;

    public zzYTC(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private void zzGx(String str) {
        int iZzDi = this.zzXRB.zzDi(str);
        if (iZzDi > 0) {
            this.zzXRT.zzYsG().zz0(com.aspose.words.internal.zzZKN.format("fo:padding-{0}", str), this.zzXRT.zzr2(iZzDi));
        }
    }

    private void zzGy(String str) {
        if (zzYTI.zzB(this.zzXRB.zzYsO().zzGC(str))) {
            zzYTI zzytiZzYsO = this.zzXRB.zzYsO();
            this.zzXRT.zzZ(zzytiZzYsO, str);
            this.zzXRT.zzY(zzytiZzYsO, str);
        }
    }

    private void zzYxY() {
        zzGx("top");
        zzGy("top");
        zzGx("bottom");
        zzGy("bottom");
        zzGx("left");
        zzGy("left");
        zzGx("right");
        zzGy("right");
    }

    private void zzZ(Cell cell, zzWP zzwp) {
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (int i = 0; i < zzwp.getCount(); i++) {
            int iZzT3 = zzwp.zzT3(i);
            Object objZzVY = zzwp.zzVY(i);
            if (!this.zzXRB.zzd(iZzT3, objZzVY)) {
                switch (iZzT3) {
                    case 3020:
                    case 3150:
                    case 3160:
                    case 3190:
                    case 3200:
                    case 3210:
                    case 3220:
                    case 3900:
                        this.zzXRT.zzZ(iZzT3, "cell", true, false);
                        break;
                    case 3050:
                        Integer num = (Integer) objZzVY;
                        iIntValue2 = num.intValue();
                        this.zzXRB.zzDP(zzYS3.zzsu(num.intValue()));
                        break;
                    case 3060:
                        iIntValue = ((Integer) objZzVY).intValue();
                        break;
                    case 3070:
                        this.zzXRB.zzrh(zzwp.getTopPadding());
                        break;
                    case 3080:
                        this.zzXRB.zzrf(zzwp.getBottomPadding());
                        break;
                    case 3090:
                        this.zzXRB.zzrg(zzwp.getLeftPadding());
                        break;
                    case 3100:
                        this.zzXRB.zzre(zzwp.getRightPadding());
                        break;
                    case 3170:
                        this.zzXRB.setBackgroundColor(zzYOU.zzP((Shading) objZzVY));
                        break;
                    case 10010:
                        this.zzXRB.zzZ((zzZMK) objZzVY);
                        break;
                }
            }
        }
        this.zzXRB.zzDh(zzYS3.zz4(iIntValue, iIntValue2, cell.getFirstParagraph().getParagraphFormat().getAlignment()));
        zzy(cell);
        zzx(cell);
    }

    private void zzx(Cell cell) {
        zzY6G zzy6gZzZYf = cell.getParentRow().zzZYf();
        if (this.zzXRB.getPaddingTop() == Integer.MIN_VALUE) {
            this.zzXRB.zzrh(zzy6gZzZYf.getTopPadding());
        }
        if (this.zzXRB.getPaddingBottom() == Integer.MIN_VALUE) {
            this.zzXRB.zzrf(zzy6gZzZYf.getBottomPadding());
        }
        if (this.zzXRB.getPaddingLeft() == Integer.MIN_VALUE) {
            this.zzXRB.zzrg(zzy6gZzZYf.getLeftPadding());
        }
        if (this.zzXRB.getPaddingRight() == Integer.MIN_VALUE) {
            this.zzXRB.zzre(zzy6gZzZYf.getRightPadding());
        }
    }

    private void zzy(Cell cell) {
        Row parentRow = cell.getParentRow();
        zzY6G zzy6gZzZYf = parentRow.zzZYf();
        zzWP zzwpZz6G = cell.zz6G();
        zzYTI zzytiZzYsO = this.zzXRB.zzYsO();
        if (zzYTI.zzA(zzwpZz6G.zz5A())) {
            zzytiZzYsO.zze(3110, parentRow.isFirstRow() ? zzy6gZzZYf.zz5A() : zzy6gZzZYf.zz5u());
        }
        if (zzYTI.zzA(zzwpZz6G.zz5z())) {
            zzytiZzYsO.zze(3130, parentRow.isLastRow() ? zzy6gZzZYf.zz5z() : zzy6gZzZYf.zz5u());
        }
        if (zzYTI.zzA(zzwpZz6G.zz5y())) {
            zzytiZzYsO.zze(3120, cell.isFirstCell() ? zzy6gZzZYf.zz5y() : zzy6gZzZYf.zz5t());
        }
        if (zzYTI.zzA(zzwpZz6G.zz5x())) {
            zzytiZzYsO.zze(3140, cell.isLastCell() ? zzy6gZzZYf.zz5x() : zzy6gZzZYf.zz5t());
        }
    }

    public final void zzz(Cell cell) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXRB = new zzYTD();
        zzZ(cell, cell.zz6G());
        if (this.zzXRB.zzYsN() != null) {
            zzZ(cell, (zzWP) this.zzXRB.zzYsN().zzZ6C());
        }
        zzytgZzYsG.zzY("style:table-cell-properties");
        zzytgZzYsG.zz0("fo:background-color", this.zzXRB.getBackgroundColor());
        zzytgZzYsG.zz0("style:vertical-align", this.zzXRB.zzYHK());
        zzYxY();
        if (!this.zzXRT.zzYsI().isStrictSchema11()) {
            if ("tb-lr-v".equals(this.zzXRB.zzYtp())) {
                zzytgZzYsG.zz0("style:glyph-orientation-vertical", "0");
            } else {
                zzytgZzYsG.zz0("style:writing-mode", this.zzXRB.zzYtp());
            }
        }
        zzytgZzYsG.zz0("fo:wrap-option", ((Boolean) cell.zz6G().zzPj(3180)).booleanValue() ? "wrap" : "no-wrap");
        zzytgZzYsG.zzo();
    }
}
