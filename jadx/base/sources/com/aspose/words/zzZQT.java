package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQT implements com.aspose.words.internal.zzZOY {
    private int zz9M;
    private boolean zzPx;
    private boolean zzYF9;
    private Inline zzYFP;
    private boolean zzYFQ;
    private int zzYFR;
    private zzZBA zzYFW;
    private int zzYFY;
    private boolean zzYFa;
    private boolean zzYFb;
    private zzZYT zzYFc;
    private boolean zzYFd;
    private zzZQQ zzYFe;
    private zzZQQ zzYFf;
    private zzZB9 zzYFg;
    private boolean zzYFh;
    private boolean zzYFi;
    private boolean zzYGq;
    private zzZOY zzYGt;

    public zzZQT(Field field, zzZBA zzzba) {
        this(new zzYW8(field, true), field.zzZgn(), zzzba);
    }

    private boolean zzO(boolean z, boolean z2) {
        zzZf4();
        char cZzIw = this.zzYFg.zzIw();
        if (com.aspose.words.internal.zzZKU.zzG(cZzIw)) {
            return zzZf3();
        }
        if (zzY(cZzIw, z2)) {
            return zzVW(z);
        }
        if (cZzIw != '\\') {
            return zzZf2();
        }
        zzVV(z);
        return false;
    }

    public static zzYIU zzT(zzZR8 zzzr8) {
        zzZQT zzzqt = new zzZQT(zzzr8);
        try {
            if (!zzzqt.zzX(zzW(zzzr8), false, zzV(zzzr8))) {
                return zzYIU.zzXxD;
            }
            zzYIU zzyiuZzZgd = zzzqt.zzZeN().zzZgd();
            if (zzzqt.zzX(false, false, false)) {
                throw new IllegalStateException();
            }
            return zzyiuZzZgd;
        } finally {
            zzzqt.dispose();
        }
    }

    public static String zzU(zzZR8 zzzr8) {
        zzZQT zzzqt = new zzZQT(zzzr8);
        try {
            if (!zzzqt.zzX(zzW(zzzr8), false, zzV(zzzr8))) {
                return "";
            }
            String text = zzzqt.zzZeN().getText();
            if (zzzqt.zzX(false, false, false)) {
                throw new IllegalStateException();
            }
            return text;
        } finally {
            zzzqt.dispose();
        }
    }

    private static boolean zzV(zzZR8 zzzr8) {
        int iIndexOf;
        Field field = zzzr8.getField();
        if (field.zzZgp() && (iIndexOf = field.zzZgq().zzZfD().indexOf(zzzr8)) != -1) {
            return zzZOO.zzXD(field.getType(), iIndexOf);
        }
        return false;
    }

    private void zzVV(boolean z) {
        zzZeW();
        if (z) {
            zzZf0();
            return;
        }
        if (zzZeP() || this.zzYFa) {
            zzZf0();
            return;
        }
        if (this.zzYFf.zzZeF()) {
            zzZeY();
        }
        zzZeX();
    }

    private boolean zzVW(boolean z) {
        if (zzZeT()) {
            return false;
        }
        zzZeW();
        if (!this.zzYFd) {
            zzZf0();
            zzZeV();
        } else {
            if (!z && !this.zzYFb) {
                if (!this.zzYGq) {
                    zzZeY();
                    return true;
                }
                zzZf0();
                zzZeU();
                zzZeZ();
                return true;
            }
            zzZf0();
        }
        return false;
    }

    private static boolean zzW(zzZR8 zzzr8) {
        int iIndexOf;
        Field field = zzzr8.getField();
        return field.zzZgp() && (iIndexOf = field.zzZgq().zzZfD().indexOf(zzzr8)) != -1 && iIndexOf == zzZOO.zzCA(field.getType());
    }

    private boolean zzX(boolean z, boolean z2, boolean z3) {
        this.zzYFh = false;
        this.zzYFa = z2;
        if (this.zzPx) {
            return false;
        }
        if (!this.zzYFi && this.zzYFe.zzZeF()) {
            this.zzYFi = true;
            return true;
        }
        this.zzYFf.clear();
        this.zzYFe.clear();
        this.zzYFd = false;
        this.zzYFi = false;
        if (this.zzYGq) {
            zzZf0();
        }
        if (z) {
            if (zzZf8()) {
                return true;
            }
            this.zzPx = true;
            return this.zzYFf.zzZeF();
        }
        boolean z4 = false;
        while (!this.zzYFg.zzYC()) {
            if (!zzZeQ()) {
                if (zzZf7()) {
                    zzZeW();
                    zzZeY();
                    this.zzYFg.zzSC();
                    return true;
                }
                if (this.zzYFg.zzYWs() != 0) {
                    zzZf6();
                } else {
                    if (zzO(z4, z3)) {
                        return true;
                    }
                    z4 = (this.zzYFb || z4 || this.zzYFg.zzIw() != '\\') ? false : true;
                }
            }
            this.zzYFg.zzSC();
        }
        zzZeY();
        this.zzPx = true;
        zzZeW();
        return this.zzYFf.zzZeF();
    }

    private boolean zzY(char c, boolean z) {
        if (com.aspose.words.internal.zzZYD.zzk(c)) {
            return (z && zzZf5()) ? false : true;
        }
        return false;
    }

    public static String zzZ(FieldStart fieldStart, FieldChar fieldChar) {
        zzZQT zzzqt = new zzZQT(fieldStart, fieldChar);
        try {
            String text = zzzqt.zzX(false, false, false) ? zzzqt.zzZeN().getText() : "";
            zzzqt.dispose();
            return text;
        } catch (Throwable th) {
            zzzqt.dispose();
            throw th;
        }
    }

    private static zzYEF zzZU(Node node) {
        Paragraph paragraph;
        if (node == null || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(node.getPreviousSibling(), Paragraph.class)) == null) {
            return null;
        }
        return paragraph.zzYp5();
    }

    private zzZQQ zzZeN() {
        return !this.zzYFi ? this.zzYFf : this.zzYFe;
    }

    private boolean zzZeO() {
        zzZBA zzzba = this.zzYFW;
        return (zzzba == null || zzzba.getSwitchType(this.zzYFe.getText().toLowerCase()) == 0) ? false : true;
    }

    private boolean zzZeP() {
        return this.zzYGq || this.zzYFb;
    }

    private boolean zzZeQ() {
        return this.zzYFg.zzYWs() == 0 && this.zzYFg.zzYWr();
    }

    private boolean zzZeT() {
        zzZYT zzzyt = this.zzYFc;
        return (zzzyt == null || zzYVU.zzXX(zzzyt.getNode()) == zzYVU.zzXX(this.zzYFg.zzYWt().getNode())) ? false : true;
    }

    private void zzZeU() {
        this.zzYGq = false;
        zzZOY zzzoy = this.zzYGt;
        if (zzzoy != null) {
            zzzoy.zzVR(false);
        }
        this.zzYFc = null;
    }

    private void zzZeV() {
        this.zzYFh = true;
        this.zzYGq = true;
        zzZOY zzzoy = this.zzYGt;
        if (zzzoy != null) {
            zzzoy.zzVR(true);
        }
        this.zzYFc = this.zzYFg.zzYWt();
    }

    private void zzZeW() {
        this.zzYFf.zzZ(this.zzYFe);
    }

    private void zzZeX() {
        this.zzYFe.clear();
        this.zzYFe.zzZ(this.zzYFg);
        this.zzYFd = true;
    }

    private void zzZeY() {
        (!this.zzYFe.zzZeF() ? this.zzYFf : this.zzYFe).zzX(this.zzYFg);
    }

    private void zzZeZ() {
        this.zzYFg.zzSC();
        zzZeY();
    }

    private void zzZf0() {
        (!this.zzYFe.zzZeF() ? this.zzYFf : this.zzYFe).zzZ(this.zzYFg);
        this.zzYFd = true;
    }

    private void zzZf1() {
        (!this.zzYFe.zzZeF() ? this.zzYFf : this.zzYFe).zzY(this.zzYFg);
    }

    private boolean zzZf2() {
        zzZf0();
        if (!this.zzYFe.zzZeF()) {
            return false;
        }
        if (this.zzYFe.getLength() > 3) {
            zzZeW();
        } else if (zzZeO()) {
            this.zzYFi = !this.zzYFf.zzZeF();
            zzZeZ();
            return true;
        }
        return false;
    }

    private boolean zzZf3() {
        if (zzZeP()) {
            zzZf0();
            return false;
        }
        if (!this.zzYFd) {
            return false;
        }
        zzZeW();
        zzZeY();
        return true;
    }

    private void zzZf4() {
        if (this.zzYF9) {
            return;
        }
        this.zz9M = this.zzYFg.zzYWq();
        this.zzYFY = this.zzYFg.zzYWp();
        this.zzYFR = this.zzYFg.zzYWo();
        this.zzYFQ = this.zzYFg.zzYWn();
        this.zzYFP = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYFg.getCurrentNode(), Inline.class);
        this.zzYF9 = true;
    }

    private boolean zzZf5() {
        String strZzYWm = this.zzYFg.zzYWm();
        return !com.aspose.words.internal.zzZKN.zzU3(strZzYWm) && com.aspose.words.internal.zzJF.zzZK(strZzYWm);
    }

    private void zzZf6() {
        zzZeW();
        int iZzYWs = this.zzYFg.zzYWs();
        if (iZzYWs == 4) {
            zzZf1();
        } else if (iZzYWs == 5 || iZzYWs == 6) {
            zzZf0();
        }
    }

    private boolean zzZf7() {
        switch (this.zzYFg.zzYWs()) {
            case 1:
                zzZf0();
            case 0:
                return false;
            case 2:
                return !this.zzYFg.zzYWr() && zzZ(ControlChar.PARAGRAPH_BREAK_CHAR, zzZU(this.zzYFg.getCurrentNode()));
            case 3:
                return !this.zzYFg.zzYWr() && zzZ('\f', (zzYEF) null);
            case 4:
                return this.zzYFd && !this.zzYGq;
            case 5:
                this.zzYFb = true;
                return false;
            case 6:
                this.zzYFb = false;
                return !this.zzYGq;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean zzZf8() {
        zzZQQ zzzqq = new zzZQQ();
        boolean z = true;
        boolean z2 = false;
        while (!this.zzYFg.zzYC()) {
            if (!zzZeQ()) {
                if (this.zzYFg.zzYWs() != 0 || !com.aspose.words.internal.zzZKU.zzG(this.zzYFg.zzIw())) {
                    if (z && this.zzYFg.zzYWs() == 0 && this.zzYFg.zzIw() == '\\') {
                        zzZeX();
                    } else {
                        if (zzzqq.zzZeF()) {
                            (this.zzYFe.zzZeF() ? this.zzYFe : this.zzYFf).zzZ(zzzqq);
                        }
                        if (zzZf2()) {
                            return true;
                        }
                    }
                    z2 = true;
                    z = false;
                } else if (z2) {
                    zzzqq.zzZ(this.zzYFg);
                }
            }
            this.zzYFg.zzSC();
        }
        zzZeY();
        return false;
    }

    public static boolean zzk(char c) {
        return com.aspose.words.internal.zzZYD.zzk(c);
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        try {
            com.aspose.words.internal.zzZOY zzzoy = (com.aspose.words.internal.zzZOY) com.aspose.words.internal.zzZKW.zzZ(this.zzYFg, com.aspose.words.internal.zzZOY.class);
            if (zzzoy != null) {
                zzzoy.dispose();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean getBidi() {
        return this.zzYFQ;
    }

    public final boolean zzP(boolean z, boolean z2) {
        return zzX(z, false, z2);
    }

    public final boolean zzVX(boolean z) {
        return zzX(false, z, false);
    }

    public final boolean zzZeI() {
        return this.zzYFh;
    }

    public final Inline zzZeJ() {
        return this.zzYFP;
    }

    public final boolean zzZeK() {
        return this.zzYFi;
    }

    public final zzYIU zzZeL() {
        return zzZeN().zzZgd();
    }

    public final String zzZeM() {
        return zzZeN().getText();
    }

    public final zzYWB zzZeR() {
        return zzZeN().zzZeR();
    }

    public final zzYWB zzZeS() {
        return zzZeN().zz9m();
    }

    public final int zzZfA() {
        return this.zzYFY;
    }

    public final int zzZfz() {
        return this.zzYFR;
    }

    public final int zzp6() {
        return this.zz9M;
    }

    public zzZQT(String str, zzZBA zzzba) {
        this(new zzY5U(str), null, zzzba);
    }

    private zzZQT(zzZR8 zzzr8) {
        this(new zzYW8(zzzr8));
        if (zzzr8.zzZgb()) {
            this.zzYFb = true;
            this.zzYFd = true;
        }
    }

    private boolean zzZ(char c, zzYEF zzyef) {
        if (zzZeP()) {
            this.zzYFf.zzY(c, zzyef);
            return false;
        }
        return this.zzYFd;
    }

    private zzZQT(FieldStart fieldStart, FieldChar fieldChar) {
        this(new zzYW8(fieldStart, fieldChar));
    }

    private zzZQT(zzZB9 zzzb9) {
        this(zzzb9, null, null);
        this.zz9M = 1024;
        this.zzYFY = 1024;
        this.zzYFR = 1024;
    }

    private zzZQT(zzZB9 zzzb9, zzZOY zzzoy, zzZBA zzzba) {
        this.zzYFf = new zzZQQ();
        this.zzYFe = new zzZQQ();
        this.zzYFR = -1;
        this.zzYFY = -1;
        this.zz9M = -1;
        this.zzYFg = zzzb9;
        this.zzYGt = zzzoy;
        this.zzYFW = zzzba;
    }
}
