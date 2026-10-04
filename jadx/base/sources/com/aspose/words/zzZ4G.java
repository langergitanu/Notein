package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ4G extends zzTI {
    private int zzYXS;
    private int zzYcq;

    public final int getLevel() {
        int i = 0;
        for (zzTI zztiZzYE = zzYE(26, 27); zztiZzYE != null; zztiZzYE = zztiZzYE.zzYE(26, 27)) {
            i++;
        }
        return i;
    }

    public final int getStartAt() {
        return this.zzYXS;
    }

    public final void setStartAt(int i) {
        this.zzYXS = i;
    }

    public abstract int zz7c();

    @Override // com.aspose.words.zzYI
    public final String zzL(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return "";
    }

    public final boolean zzYOF() {
        zzYI next;
        Iterator<zzYI> it = zz9J().iterator();
        while (it.hasNext() && (next = it.next()) != this) {
            if (next.zzkz() == 27 || next.zzkz() == 26) {
                return false;
            }
        }
        return true;
    }

    public final int zzYOG() {
        return this.zzYcq;
    }

    public final zzTI zzYOH() {
        zzZ4G zzz4g;
        zzZ4G zzz4g2 = this;
        while (!zzz4g2.zz9I() && (zzz4g = (zzZ4G) zzz4g2.zzYE(26, 27)) != null) {
            zzz4g2 = zzz4g;
        }
        return zzz4g2.zz9J();
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzYMS zzyms;
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 12) {
            if (isEmpty() || zzMH(0).zzkz() == 13) {
                return false;
            }
            zzY(new zzZUF()).zz9O();
            return true;
        }
        if (bZzkz == 13) {
            if (!isEmpty() || (zzyms = (zzYMS) com.aspose.words.internal.zzZKW.zzZ(zz9H(), zzYMS.class)) == null) {
                zzY(zzyi);
                return true;
            }
            zzyms.open();
            com.aspose.words.internal.zzZQG.zzZ(zzyms.zzYUR(), zz9C());
            setAction(1);
            return true;
        }
        if (bZzkz == 17) {
            if (((zzYCN) zzyi).zzYUR().size() > 0) {
                zzY(zzyi);
            }
            return true;
        }
        if (bZzkz == 21 || getAction() != 3) {
            return false;
        }
        zz9O();
        zzY(zzyi);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final String zzb(String str, int i) {
        int length;
        String strZzb = super.zzb(str, i);
        if (strZzb.length() > 0 && (length = strZzb.length() + i) < str.length()) {
            char cCharAt = str.charAt(length);
            if (com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                return com.aspose.words.internal.zzZKN.format("{0}{1}", strZzb, Character.valueOf(cCharAt));
            }
        }
        return strZzb;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        return "";
    }

    public final void zzxg(int i) {
        this.zzYcq = i;
    }
}
