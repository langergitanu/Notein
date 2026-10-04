package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE2 {
    private String zzXpo;
    private String zzXpp;
    private String zzXpq;
    private String zzXpr;
    private int zzXps;
    private CompatibilityOptions zzXpt;
    private int zzXpu;
    private String zzXpw;
    private Font zzXpx;
    private zzZ9F zzXpz;
    private StringBuilder zzXpy = new StringBuilder(2048);
    private int zzXpv = 3;
    private com.aspose.words.internal.zzZYE zz4 = new com.aspose.words.internal.zzZYE("");
    private int zzXpn = -1;
    private int zzXpm = -1;
    private int zzXpl = -1;
    private int zzXpk = -1;

    public zzYE2(zzZ9F zzz9f, CompatibilityOptions compatibilityOptions, int i) {
        if (zzz9f == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: handler");
        }
        this.zzXpz = zzz9f;
        this.zzXpt = compatibilityOptions;
        this.zzXps = i;
    }

    private void clearCache() {
        this.zzXpr = null;
        this.zzXpp = null;
        this.zzXpq = null;
        this.zzXpo = null;
        this.zzXpn = -1;
        this.zzXpm = -1;
        this.zzXpl = -1;
        this.zzXpk = -1;
    }

    private String getFontName(int i) {
        if (i == 1) {
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXpp)) {
                this.zzXpp = this.zzXpx.getFontName(i);
            }
            return this.zzXpp;
        }
        if (i == 2) {
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXpo)) {
                this.zzXpo = this.zzXpx.getFontName(i);
            }
            return this.zzXpo;
        }
        if (i != 3) {
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXpq)) {
                this.zzXpq = this.zzXpx.getFontName(i);
            }
            return this.zzXpq;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXpr)) {
            this.zzXpr = this.zzXpx.getFontName(i);
        }
        return this.zzXpr;
    }

    private int zzBk(int i) {
        if (i == 1) {
            if (this.zzXpl == -1) {
                this.zzXpl = this.zzXpx.zzBk(i);
            }
            return this.zzXpl;
        }
        if (i == 2) {
            if (this.zzXpk == -1) {
                this.zzXpk = this.zzXpx.zzBk(i);
            }
            return this.zzXpk;
        }
        if (i != 3) {
            if (this.zzXpm == -1) {
                this.zzXpm = this.zzXpx.zzBk(i);
            }
            return this.zzXpm;
        }
        if (this.zzXpn == -1) {
            this.zzXpn = this.zzXpx.zzBk(i);
        }
        return this.zzXpn;
    }

    private void zzYdj() {
        this.zzXpy.setLength(0);
    }

    private void zzYdk() throws Exception {
        if (this.zzXpy.length() > 0) {
            this.zzXpz.zzZ(this.zzXpx, this.zzXpy.toString(), this.zzXpv);
            zzYdj();
        }
    }

    private boolean zzYdl() {
        return this.zzXpt.getDoNotLeaveBackslashAlone() && com.aspose.words.internal.zzBZ.zzZY(this.zzXpx.getLocaleIdFarEast(), 17);
    }

    private void zzZX(Field field) throws Exception {
        zzYWB zzywbZzZgI = field.zzZgI();
        if (zzywbZzZgI == null) {
            return;
        }
        zzYWI zzywi = new zzYWI(zzywbZzZgI);
        int i = 0;
        while (zzywi.zzSG(true)) {
            Node next = zzywi.next();
            switch (next.getNodeType()) {
                case 22:
                    i++;
                    continue;
                case 23:
                    break;
                case 24:
                    if (!((FieldEnd) next).hasSeparator()) {
                    }
                    break;
                default:
                    if (i == 0) {
                        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(next, Inline.class);
                        if (inline != null) {
                            zzy(inline);
                        }
                    } else {
                        continue;
                    }
                    break;
            }
            i--;
        }
    }

    private void zzmI(int i) {
        com.aspose.words.internal.zzZVS.zzZ(this.zzXpy, i);
    }

    private void zzmJ(int i) throws Exception {
        boolean z;
        int iZzzG = zzzG(i);
        String fontName = this.zzXpw;
        boolean z2 = false;
        if ((this.zzXps & 1) != 0) {
            fontName = getFontName(iZzzG);
            z = !com.aspose.words.internal.zzZKN.equals(fontName, this.zzXpw);
        } else {
            z = false;
        }
        int iZzBk = this.zzXpu;
        if ((this.zzXps & 2) != 0) {
            iZzBk = zzBk(iZzzG);
            z2 = iZzBk != this.zzXpu;
        }
        if (z || z2) {
            zzYdk();
        }
        this.zzXpv = iZzzG;
        this.zzXpw = fontName;
        this.zzXpu = iZzBk;
        zzmI(i);
    }

    private int zzzG(int i) {
        return zzY0C.zzW(i, this.zzXpx);
    }

    public final void zzZ(String str, Font font) throws Exception {
        clearCache();
        zzYdj();
        this.zzXpx = font;
        this.zzXpw = (this.zzXps & 1) != 0 ? getFontName(this.zzXpv) : "";
        this.zzXpu = (this.zzXps & 2) != 0 ? zzBk(this.zzXpv) : -1;
        this.zz4.setText(str);
        Iterator<Integer> it = this.zz4.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue != 2) {
                if (iIntValue == 9) {
                    zzYdk();
                    this.zzXpz.zzX(this.zzXpx);
                } else if (iIntValue == 92) {
                    if (zzYdl()) {
                        iIntValue = 165;
                    }
                    zzmJ(iIntValue);
                } else if (iIntValue == 160) {
                    zzYdk();
                    this.zzXpz.zzW(this.zzXpx);
                } else if (iIntValue == 173) {
                    zzYdk();
                    this.zzXpz.zzT(this.zzXpx);
                } else if (iIntValue == 8194) {
                    zzYdk();
                    this.zzXpz.zzW(this.zzXpx);
                } else if (iIntValue == 8206) {
                    zzYdk();
                    this.zzXpz.zzZ(this.zzXpx, false);
                } else if (iIntValue != 8207) {
                    switch (iIntValue) {
                        case 11:
                            zzYdk();
                            this.zzXpz.zzZo1();
                            break;
                        case 12:
                            zzYdk();
                            this.zzXpz.zzZo0();
                            break;
                        case 13:
                            zzYdk();
                            this.zzXpz.zzY(this.zzXpx);
                            break;
                        case 14:
                            zzYdk();
                            this.zzXpz.zzZnZ();
                            break;
                        default:
                            switch (iIntValue) {
                                case 30:
                                    zzYdk();
                                    this.zzXpz.zzV(this.zzXpx);
                                    break;
                                case 31:
                                    zzYdk();
                                    this.zzXpz.zzU(this.zzXpx);
                                    break;
                                case 32:
                                    zzmI(iIntValue);
                                    break;
                                default:
                                    zzmJ(iIntValue);
                                    break;
                            }
                            break;
                    }
                } else {
                    zzYdk();
                    this.zzXpz.zzZ(this.zzXpx, true);
                }
            }
        }
        zzYdk();
    }

    public final void zzZV(Field field) throws Exception {
        field.getType();
        for (Run run : zzZPU.zzK(field)) {
            zzZ(run.getText(), Font.zzZ(run.zzZYh(), run.getDocument()));
        }
    }

    public final void zzZW(Field field) throws Exception {
        field.getType();
        zzZX(field);
    }

    public final void zzZY(Field field) throws Exception {
        if (field.getType() != 51) {
            field.getType();
        }
        zzZX(field);
    }

    public final void zzy(Inline inline) throws Exception {
        zzZ(inline.getText(), inline.getFont());
    }
}
