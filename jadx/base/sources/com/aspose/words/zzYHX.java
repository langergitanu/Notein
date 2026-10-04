package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHX extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\tcelld", "\\clmgf", "\\clmrg", "\\clvmgf", "\\clvmrg", "\\clFitText", "\\clNoWrap", "\\clhidemark", "\\clbrdrl", "\\tsbrdrl", "\\clbrdrr", "\\tsbrdrr", "\\clbrdrt", "\\tsbrdrt", "\\clbrdrb", "\\tsbrdrb", "\\cldgll", "\\tsbrdrdgr", "\\cldglu", "\\tsbrdrdgl", "\\tsbrdrh", "\\tsbrdrv", "\\clpadt", "\\clpadft", "\\clpadr", "\\clpadfr", "\\clpadl", "\\clpadfl", "\\clpadb", "\\clpadfb", "\\clwWidth", "\\clftsWidth", "\\cellx", "\\clshdng", "\\tscellpct", "\\clcbpat", "\\tscellcbpat", "\\clcfpat", "\\tscellcfpat", "\\clshdrawnil", "\\clbghoriz", "\\clbgvert", "\\clbgfdiag", "\\clbgbdiag", "\\clbgcross", "\\clbgdcross", "\\clbgdkhor", "\\clbgdkvert", "\\clbgdkfdiag", "\\clbgdkbdiag", "\\clbgdkcross", "\\clbgdkdcross", "\\clspl", "\\clspt", "\\clspb", "\\clspr", "\\clspfl", "\\clspft", "\\clspfb", "\\clspfr");
    private boolean zzXwm;
    private int zzXwn;
    private int zzXwo;
    private zzWP zzZAg;

    public zzYHX(zzYFT zzyft) {
        super(zzyft);
        zzYiZ();
    }

    private Shading getShading() {
        return zzYFI.zzQ(zz6G(), 3170);
    }

    private zzWP zz6G() {
        if (zzYja().zzYgj()) {
            return ((zzYF4) zzYja().zzYgo().zzYiL().zzYim()).zz6G();
        }
        if (this.zzZAg == null) {
            this.zzZAg = new zzWP();
        }
        return this.zzZAg;
    }

    private void zzU(zzYET zzyet) throws Exception {
        int iZzYfo;
        zzWO zzwoZzYiY = zzYiY();
        zzY6G zzy6gZzZYf = zzZYf();
        if (zzwoZzYiY.getCount() == 0) {
            int iIntValue = ((Integer) zzy6gZzZYf.zzPj(5101)).intValue();
            if (zzy6gZzZYf.zzVE(4010)) {
                iIntValue = zzy6gZzZYf.getAlignment();
            }
            boolean bidi = zzy6gZzZYf.getBidi();
            if (!zzy6gZzZYf.zzVE(4340)) {
                if (iIntValue != 1 && ((bidi && iIntValue == 2) || (!bidi && iIntValue == 0))) {
                    zzy6gZzZYf.zzwa((zzYja().zzYhj().zzYfo() - zzy6gZzZYf.zzYk9()) + zzy6gZzZYf.zzW(zz6G(), zzYja().zzYhj().zzYf9() > 1));
                }
            }
        }
        Object obj = zzy6gZzZYf.get(5102);
        if (obj == null || ((Integer) obj).intValue() == 0) {
            Iterator<zzZS> it = zzwoZzYiY.iterator();
            int width = 0;
            while (it.hasNext()) {
                width += ((zzWP) it.next()).getWidth();
            }
            iZzYfo = width;
        } else {
            iZzYfo = zzYja().zzYhj().zzYfo();
        }
        int iZzYeT = zzyet.zzYeT() - iZzYfo;
        int i = iZzYeT <= 31680 ? iZzYeT : 0;
        if (!this.zzXwm) {
            this.zzXwn = 3;
            this.zzXwo = i;
        }
        zz6G().zzQ(3020, PreferredWidth.zzW6(this.zzXwn, this.zzXwo));
        zz6G().zzQ(3010, Integer.valueOf(i));
        zzYja().zzYhj().zznS(zzYja().zzYhj().zzYfo() + i);
        zzwoZzYiY.zzU(zz6G());
        zzYiZ();
    }

    private zzWO zzYiY() {
        zzY6G zzy6gZznT = (zzZYf() == null || zzZYf().zz5l() == null) ? zzYja().zzYhj().zznT(zzYja().zzYgo().getCount()) : zzZYf();
        if (zzy6gZznT.zz5l() == null) {
            zzy6gZznT.zzQ(5100, new zzWO());
        }
        return zzy6gZznT.zz5l();
    }

    private void zzYiZ() {
        this.zzZAg = null;
        this.zzXwo = 0;
        this.zzXwn = 1;
        this.zzXwm = false;
    }

    private zzY6G zzZYf() {
        return zzYja().zzYhj().zzZYf();
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) throws Exception {
        int iZz4 = zzYHY.zz4(zzyet.getName(), false);
        if (iZz4 != Integer.MIN_VALUE) {
            zz6G().zzQ(3060, Integer.valueOf(iZz4));
            return true;
        }
        int iZzCz = zzYHY.zzCz(zzyet.getName());
        if (iZzCz != Integer.MIN_VALUE) {
            zz6G().zzQ(3050, Integer.valueOf(iZzCz));
            return true;
        }
        int iZz42 = zzYHY.zz4(zzyet.getName(), true);
        if (iZz42 == Integer.MIN_VALUE) {
            return false;
        }
        zz6G().zzQ(3060, Integer.valueOf(iZz42));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        if (zzZrB()) {
            return false;
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                zzYja().zzYhj().zznS(zzZYf().zzYM7());
                zzYiZ();
                return true;
            case 1:
                zz6G().zzQ(3040, 1);
                return true;
            case 2:
                zz6G().zzQ(3040, 2);
                return true;
            case 3:
                zz6G().zzQ(3030, 1);
                return true;
            case 4:
                zz6G().zzQ(3030, 2);
                return true;
            case 5:
                zz6G().zzQ(3190, Boolean.TRUE);
                return true;
            case 6:
                zz6G().zzQ(3180, Boolean.FALSE);
                return true;
            case 7:
                zz6G().zzQ(3220, Boolean.TRUE);
                return true;
            case 8:
            case 9:
                zzYja().zzR(zz6G(), 3120);
                return true;
            case 10:
            case 11:
                zzYja().zzR(zz6G(), 3140);
                return true;
            case 12:
            case 13:
                zzYja().zzR(zz6G(), 3110);
                return true;
            case 14:
            case 15:
                zzYja().zzR(zz6G(), 3130);
                return true;
            case 16:
            case 17:
                zzYja().zzR(zz6G(), 3160);
                return true;
            case 18:
            case 19:
                zzYja().zzR(zz6G(), 3150);
                return true;
            case 20:
                zzYja().zzR(zz6G(), 3200);
                return true;
            case 21:
                zzYja().zzR(zz6G(), 3210);
                return true;
            case 22:
                zz6G().zzQ(3090, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 23:
            case 25:
            case 27:
            case 29:
                return true;
            case 24:
                zz6G().zzQ(3100, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 26:
                zz6G().zzQ(3070, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 28:
                zz6G().zzQ(3080, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 30:
                this.zzXwo = zzyet.zzYeT();
                return true;
            case 31:
                this.zzXwn = zzyet.zzYeT();
                this.zzXwm = true;
                return true;
            case 32:
                zzU(zzyet);
                return true;
            case 33:
            case 34:
                zzYFI.zzZ(getShading(), zzyet);
                return true;
            case 35:
            case 36:
                zzYFI.zzZ(zzYja(), getShading(), zzyet);
                return true;
            case 37:
            case 38:
                zzYFI.zzY(zzYja(), getShading(), zzyet);
                return true;
            case 39:
                zz6G().remove(3170);
                return true;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                zzYFI.zzY(getShading(), zzyet);
                return true;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                zzYja().zzC0(zzyet.getName());
                return true;
            default:
                return false;
        }
    }
}
