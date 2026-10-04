package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY67 {
    private com.aspose.words.internal.zzZOX zzW6;
    private Document zzYTQ;
    private ArrayList<zzZ79> zzX4k = new ArrayList<>();
    private ArrayList<zzYZL> zzX4j = new ArrayList<>();
    private ArrayList<zzW> zzX4i = new ArrayList<>();
    private zzY8U zzX4h = new zzY8U();
    private com.aspose.words.internal.zzD3<String> zzX4g = new com.aspose.words.internal.zzD3<>();
    private ArrayList<String> zzX4f = new ArrayList<>();

    private void zz79() throws Exception {
        this.zzW6.zzq().zzH(this.zzW6.zzq().getPosition() - 1);
        this.zzYTQ.zzYp(new zzXB().zzT(this.zzW6));
    }

    private void zzXWA() throws Exception {
        int iZzXc = this.zzW6.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzX4k, new zzZ79(this.zzW6));
        }
    }

    private void zzXWB() throws Exception {
        int iZzXc = this.zzW6.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzX4i, new zzW(this.zzW6));
        }
    }

    private void zzXWC() throws Exception {
        int iZzXc = this.zzW6.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzX4j, new zzYZL(this.zzW6));
        }
    }

    private void zzXWv() {
        if (this.zzX4k.size() == 0) {
            return;
        }
        this.zzYTQ.zzZW(new ArrayList<>());
        Iterator<zzZ79> it = this.zzX4k.iterator();
        while (it.hasNext()) {
            this.zzYTQ.zzZqC().add(it.next().zzS(this.zzX4g));
        }
    }

    private void zzXWw() {
        if (this.zzX4j.size() == 0) {
            return;
        }
        Iterator<zzYZL> it = this.zzX4j.iterator();
        while (it.hasNext()) {
            this.zzX4f.add(this.zzX4h.zzWU(it.next().zzY06));
        }
    }

    private void zzXWx() throws Exception {
        this.zzX4g.set(this.zzW6.zzX9() & 65535, zzZZR.zzZ(this.zzW6, true, true));
    }

    private void zzXWy() throws Exception {
        int iZzX9 = this.zzW6.zzX9() & 65535;
        for (int i = 0; i < iZzX9; i++) {
            zzXWx();
        }
    }

    private void zzXWz() throws Exception {
        zzY8U zzy8u = this.zzX4h;
        com.aspose.words.internal.zzZOX zzzox = this.zzW6;
        zzy8u.zzF(zzzox, (int) zzzox.zzq().getPosition());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZmy() {
        zzP zzp;
        if (this.zzX4i.size() == 0) {
            return;
        }
        this.zzYTQ.zzZX(new ArrayList<>());
        for (zzW zzw : this.zzX4i) {
            if (!zzw.zzZGB) {
                int count = this.zzX4h.getCount();
                int i = zzw.zzZGD;
                zzp = count > i ? new zzP(zzw.zzZGC, this.zzX4h.zzl7(i)) : new zzP();
            }
            this.zzYTQ.zzZqD().add(zzp);
        }
    }

    public final ArrayList<String> zzXWD() {
        return this.zzX4f;
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, Document document) throws Exception {
        if (i == 0) {
            return;
        }
        this.zzW6 = zzzox;
        this.zzYTQ = document;
        int position = (int) zzzox.zzq().getPosition();
        if ((zzzox.readByte() & 255) != 255) {
            return;
        }
        int i2 = position + i;
        while (zzzox.zzq().getPosition() < i2) {
            int i3 = zzzox.readByte() & 255;
            if (i3 == 1) {
                zzXWC();
            } else if (i3 == 2) {
                zzXWB();
            } else if (i3 != 3 && i3 != 4) {
                switch (i3) {
                    case 16:
                        zzXWz();
                        break;
                    case 17:
                        zzXWy();
                        break;
                    case 18:
                        zz79();
                        break;
                }
            } else {
                zzXWA();
            }
        }
        zzXWw();
        zzZmy();
        zzXWv();
    }
}
