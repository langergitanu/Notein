package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8G {
    private com.aspose.words.internal.zzZOW zzW5;
    private boolean zzXqp;
    private StyleCollection zzYSm;
    private FontInfoCollection zzYSn;
    private zzYEA zzYTE;
    private zzY6E zzYTF;
    private zzYMU zzYTG;
    private zzYJD zzYTI;
    private Theme zzYTf;
    private IWarningCallback zzZG0;
    private zzYMT zzX9c = new zzYMT();
    private zzYE5 zzX9b = new zzYE5();
    private zzYEF zzX91 = new zzYEF();

    public zzY8G(zzZZ2 zzzz2, StyleCollection styleCollection) throws Exception {
        this.zzYSn = zzzz2.zzYUq;
        this.zzYTf = zzzz2.zzYTm;
        this.zzYTI = zzzz2.zzYUs;
        this.zzYSm = styleCollection;
        this.zzYTG = new zzYMU(zzzz2);
        this.zzYTE = new zzYEA(zzzz2);
        this.zzYTF = new zzY6E(zzzz2);
        this.zzZG0 = zzzz2.zzYUo;
    }

    private void zzK(Style style) throws Exception {
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzJ((short) 0);
        int position2 = (int) this.zzW5.zzq().getPosition();
        int iZzc = zzc(style);
        zzQ(this.zzW5.zzq(), position2);
        zzZZQ.zzZ(this.zzYSm.zzW(style, true), Integer.MAX_VALUE, this.zzW5, true, true);
        zzV(style, position2);
        zzQ(this.zzW5.zzq(), position2);
        if (style.hasRevisions()) {
            zzW(style, position2);
        }
        int position3 = (int) this.zzW5.zzq().getPosition();
        int i = position3 - position2;
        if (com.aspose.words.internal.zzAN.zzZP(i)) {
            throw new IllegalStateException("Length of a style definition is expected to be even number of bytes.");
        }
        this.zzW5.zzq().zzU(position, 0);
        short s = (short) i;
        this.zzW5.zzJ(s);
        this.zzW5.zzq().zzU(iZzc, 0);
        this.zzW5.zzJ(s);
        this.zzW5.zzq().zzU(position3, 0);
    }

    private static void zzQ(com.aspose.words.internal.zzZOP zzzop, int i) throws Exception {
        if (com.aspose.words.internal.zzAN.zzZP(((int) zzzop.getPosition()) - i)) {
            long position = ((int) zzzop.getPosition()) + 1;
            if (zzzop.getLength() < position) {
                zzzop.setLength(position);
            }
            zzzop.zzH(position);
        }
    }

    private void zzW(Style style, int i) throws Exception {
        zzZMK zzzmkZzYsN = style.zzZYj().zzYsN() != null ? style.zzZYj().zzYsN() : style.zzZYh().zzYsN();
        long position = this.zzW5.zzq().getPosition();
        this.zzW5.zzJ((short) 0);
        this.zzW5.zzJ((short) 6);
        zzKE.zzZ(zzzmkZzYsN.zzZx(), this.zzW5);
        this.zzW5.zzJ((short) this.zzYTI.zzCK(zzzmkZzYsN.getAuthor()));
        zzZMK zzzmkZzYsN2 = style.zzZYj().zzYsN();
        zzZMK zzzmkZzYsN3 = style.zzZYh().zzYsN();
        style.zzZYj().remove(10010);
        style.zzZYh().remove(10010);
        if (style.getType() == 1) {
            zzY(style.zzZYj(), style.zzZYj().getBidi());
            zzQ(this.zzW5.zzq(), i);
        }
        zzp(style.zzZYh());
        zzQ(this.zzW5.zzq(), i);
        style.zzZYj().zzP(10010, zzzmkZzYsN2);
        style.zzZYh().zzP(10010, zzzmkZzYsN3);
        int position2 = ((int) (this.zzW5.zzq().getPosition() - position)) - 2;
        this.zzW5.zzq().zzH(position);
        this.zzW5.zzJ((short) position2);
        this.zzW5.zzq().zzH(this.zzW5.zzq().getPosition() + ((long) position2));
    }

    private void zzY(zzYMX zzymx, boolean z) throws Exception {
        this.zzYTG.zzZ(zzymx, this.zzX9c, z).zzZ(this.zzW5, false);
    }

    private void zzY27() throws Exception {
        zzXF zzxfZzZ = this.zzYTE.zzZ(this.zzYSm.zzY37(), this.zzX9b, false);
        this.zzW5.zzl(zzxfZzZ.getData().length);
        this.zzW5.writeBytes(zzxfZzZ.getData());
        zzYNJ zzynjZzZ = this.zzYTG.zzZ(this.zzYSm.zzY36(), this.zzX9c, this.zzYSm.zzY36().getBidi());
        this.zzW5.zzl(zzynjZzZ.getData().length);
        this.zzW5.writeBytes(zzynjZzZ.getData());
    }

    private void zzY28() throws Exception {
        int iZzYUi;
        this.zzW5.zzJ((short) 4);
        zzZ73 zzz73ZzYi5 = this.zzYSm.zzYi5();
        int iZzYUc = (zzz73ZzYi5.zzYUf() ? 1 : 0) | (zzz73ZzYi5.zzYUd() ? 2 : 0) | (zzz73ZzYi5.zzYUb() ? 4 : 0) | (zzz73ZzYi5.zzYUe() ? 8 : 0) | (zzz73ZzYi5.zzYUc() << 4);
        for (int i = 0; i < 267; i++) {
            zzZ74 zzz74Zzy4 = zzz73ZzYi5.zzy4(i);
            if (zzz74Zzy4 != null) {
                iZzYUi = (zzz74Zzy4.zzYUi() << 4) | zzz74Zzy4.getLocked() | (zzz74Zzy4.getSemiHidden() ? 2 : 0) | (zzz74Zzy4.getUnhideWhenUsed() ? 4 : 0) | (zzz74Zzy4.zzYUl() ? 8 : 0);
            } else {
                iZzYUi = iZzYUc;
            }
            this.zzW5.zzl(iZzYUi);
        }
    }

    private static int zzb(Style style) {
        int type = style.getType();
        if (type == 1) {
            return style.hasRevisions() ? 3 : 2;
        }
        if (type == 2) {
            return style.hasRevisions() ? 2 : 1;
        }
        if (type == 3) {
            return 3;
        }
        if (type == 4) {
            return 1;
        }
        throw new IllegalStateException("Unknown style type.");
    }

    private int zzc(Style style) throws Exception {
        int iZzhD = 0;
        this.zzW5.zzJ((short) (style.getStyleIdentifier() | (style.zzXab ? 8192 : 0) | (style.zzXaa ? 16384 : 0)));
        this.zzW5.zzJ((short) (style.getType() | (zzY0C.zzhF(style.zzY3v()) ? style.zzY3v() << 4 : 65520)));
        this.zzW5.zzJ((short) (zzb(style) | ((zzY0C.zzhF(style.zzY3u()) ? style.zzY3u() : style.zzZ7j()) << 4)));
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzJ((short) 0);
        this.zzW5.zzJ((short) ((style.getAutomaticallyUpdate() ? 1 : 0) | (style.getHidden() ? 2 : 0) | (style.zzY3o() ? 12 : 0) | (style.zzY3r() ? 16 : 0) | (style.zzY3q() ? 32 : 0) | (style.zzY3p() ? 64 : 0) | (style.getSemiHidden() ? 256 : 0) | (style.getLocked() ? 512 : 0) | (style.zzXa9 ? 1024 : 0) | (style.getUnhideWhenUsed() ? 2048 : 0) | (style.isQuickStyle() ? 4096 : 0)));
        if (style.zzY3t() != 12287 && zzY0C.zzhF(style.zzY3t())) {
            iZzhD = zzY0C.zzhD(style.zzY3t());
        }
        if (style.hasRevisions()) {
            iZzhD |= 4096;
        }
        this.zzW5.zzJ((short) iZzhD);
        this.zzW5.zzl(style.zzY3s());
        this.zzW5.zzJ((short) (style.getPriority() << 4));
        return position;
    }

    private void zzkA(int i) throws Exception {
        this.zzW5.zzJ((short) i);
        this.zzW5.zzJ((short) 18);
        this.zzW5.zzJ((short) 1);
        this.zzW5.zzJ((short) 267);
        this.zzW5.zzJ((short) 15);
        this.zzW5.zzJ((short) 0);
        zzYEF zzyefZzY37 = this.zzYSm.zzY37();
        this.zzW5.zzJ((short) this.zzYSn.zzLn(zzU1.zzZ(zzyefZzY37.zzYdS(), this.zzYTf)));
        this.zzW5.zzJ((short) this.zzYSn.zzLn(zzU1.zzZ(zzyefZzY37.zzYdR(), this.zzYTf)));
        this.zzW5.zzJ((short) this.zzYSn.zzLn(zzU1.zzZ(zzyefZzY37.zzYdQ(), this.zzYTf)));
        this.zzW5.zzJ((short) this.zzYSn.zzLn(zzU1.zzZ(zzyefZzY37.zzYdP(), this.zzYTf)));
    }

    private void zzkz(int i) throws Exception {
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzYSm.getCount(); i3++) {
            Style style = this.zzYSm.get(i3);
            if (zzY0C.zzZ(style, this.zzZG0, 10)) {
                while (i2 < style.zzZ7j()) {
                    this.zzW5.zzJ((short) 0);
                    i2++;
                }
                zzK(style);
                i2++;
            }
        }
        while (i2 < i) {
            this.zzW5.zzJ((short) 0);
            i2++;
        }
    }

    private static zzYEF zzo(zzYEF zzyef) {
        zzYEF zzyef2 = (zzYEF) zzyef.zzbn();
        zzyef2.remove(50);
        return zzyef2;
    }

    private void zzp(zzYEF zzyef) throws Exception {
        this.zzYTE.zzZ(zzo(zzyef), this.zzX9b, false).zzZ(this.zzW5, false);
    }

    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        this.zzW5 = zzzow;
        int iMin = Math.min(Math.max(this.zzYSm.zzY38(), 14) + 1, 4093);
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzJ((short) 0);
        int position2 = (int) this.zzW5.zzq().getPosition();
        zzkA(iMin);
        zzY28();
        zzY27();
        int position3 = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzq().zzH(position);
        this.zzW5.zzJ((short) (position3 - position2));
        this.zzW5.zzq().zzH(position3);
        if (this.zzYSm.zzYec()) {
            this.zzYSm.zzY37().zzZ(this.zzX91, zzYEF.zzXq6);
            this.zzYSm.zzY37().zzZ(this.zzX91, zzYEF.zzXq5);
            this.zzXqp = true;
        }
        zzkz(iMin);
        return ((int) this.zzW5.zzq().getPosition()) - position;
    }

    private void zzV(Style style, int i) throws Exception {
        zzYMX zzymxZzZYj = style.zzZYj();
        if (style.hasRevisions()) {
            zzymxZzZYj = (zzYMX) style.zzZYj().zzbn();
            zzymxZzZYj.zzYpN();
        }
        zzYEF zzyefZzZYh = style.zzZYh();
        if (style.hasRevisions()) {
            zzyefZzZYh = (zzYEF) style.zzZYh().zzbn();
            zzyefZzZYh.zzYpN();
        }
        int type = style.getType();
        if (type == 1) {
            zzQ(this.zzW5.zzq(), i);
            boolean zBooleanValue = ((Boolean) style.fetchParaAttr(1560)).booleanValue();
            if (this.zzXqp && style.zzY3n()) {
                zzymxZzZYj = style.zzqw(1);
                zzyefZzZYh = style.zzl1(1);
                zzyefZzZYh.zzX(this.zzX91);
            }
            zzY(zzymxZzZYj, zBooleanValue);
            zzQ(this.zzW5.zzq(), i);
            zzp(zzyefZzZYh);
            return;
        }
        if (type == 2) {
            zzQ(this.zzW5.zzq(), i);
            zzp(zzyefZzZYh);
            return;
        }
        if (type != 3) {
            if (type == 4) {
                zzQ(this.zzW5.zzq(), i);
                zzY(style.zzZYj(), style.zzZYj().getBidi());
                return;
            }
            throw new IllegalStateException("Unknown style type.");
        }
        TableStyle tableStyle = (TableStyle) style;
        zzQ(this.zzW5.zzq(), i);
        this.zzYTF.zzS(tableStyle).zzZ(this.zzW5, false);
        zzQ(this.zzW5.zzq(), i);
        new zzYNJ(style.zzZ7j(), this.zzYTG.zzY(tableStyle)).zzZ(this.zzW5, false);
        zzQ(this.zzW5.zzq(), i);
        new zzXF(this.zzYTE.zzY(tableStyle)).zzZ(this.zzW5, false);
    }
}
