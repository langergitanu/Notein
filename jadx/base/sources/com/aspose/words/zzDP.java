package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzDP {
    private HashMap<Long, zzZCP> zzZb1 = new HashMap<>();
    private com.aspose.words.internal.zzZQ4 zzZb2;
    private float zzZbA;
    private float zzZbx;
    private float zzZby;
    private float zzZbz;
    private com.aspose.words.internal.zzZQ4 zzZek;
    private zzEY zzZy4;
    private zzDI zzZyQ;
    private zzDT zzZyT;

    public zzDP(zzEY zzey, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZy4 = zzey;
        zzDT zzdtZz45 = zzey.zz45();
        this.zzZyT = zzdtZz45;
        this.zzZb2 = zzzq4;
        this.zzZek = zzDG.zzZ(zzzq4, zzdtZz45.zz3y(), zzdi);
        this.zzZyQ = zzdi;
    }

    private static boolean zzKC(int i) {
        if (i != 1 && i != 2 && i != 14 && i != 24) {
            switch (i) {
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            return false;
                    }
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
            }
        }
        return true;
    }

    private static boolean zzQ(zzGK zzgk) {
        return (zzgk.zzZP9() || zzgk.zzZPa() || zzgk.zzZP7() || zzgk.zzZP6()) ? false : true;
    }

    private void zzR(zzGK zzgk) throws Exception {
        zzZCP zzzcpZzT = zzT(zzgk);
        zzzcpZzT.zzZKQ();
        zzzcpZzT.zzZKL();
        if (this.zzZyQ.zzZIu().isEmpty()) {
            this.zzZyQ.zzZE(zzzcpZzT.zzZKD());
        }
        if (!zzgk.isEmpty()) {
            zzgk.zzW(zzzcpZzT, this.zzZyQ);
            zzgk.zzZPo();
        }
        zzzcpZzT.zzZKR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static long zzS(zzGK zzgk) {
        if (!zzgk.zzZPc()) {
            return 0L;
        }
        zzZCR zzzcr = (zzZCR) zzgk;
        return (((long) zzzcr.zzZPt().zz4n()) << 32) + ((long) zzzcr.zzZPs().zz4n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzZCP zzT(zzGK zzgk) throws Exception {
        zzZCP zzdu;
        zzZCP zzdx;
        long jZzS = zzS(zzgk);
        zzZCP zzzcp = (zzZCP) com.aspose.words.internal.zzQW.zzZ(this.zzZb1, Long.valueOf(jZzS));
        if (zzzcp != null) {
            return zzzcp;
        }
        if (zzgk.zzZP9()) {
            zzdx = new zzDW(this.zzZy4, this.zzZyQ, this.zzZek, this.zzZyT.zzZQD());
        } else if (zzgk.zzZPa()) {
            zzdx = new zzDV((zzZCR) zzgk, this.zzZyQ, this.zzZek, this.zzZyT.zzZQD());
        } else {
            if (zzgk.zzZP7() || zzgk.zzZP6()) {
                zzdu = new zzDU(this.zzZy4, zzgk, this.zzZyQ, this.zzZek, this.zzZyT.zzZQD());
            } else if (zzgk.zz3R()) {
                zzdx = new zzDX(this.zzZy4, zzgk, this.zzZyQ, this.zzZek, this.zzZyT.zzZQD());
            } else {
                zzdu = new zzDY(this.zzZy4, zzgk, this.zzZyQ, this.zzZek, this.zzZyT.zzZQD());
            }
            zzdx = zzdu;
        }
        zzdx.zzra();
        this.zzZb1.put(Long.valueOf(jZzS), zzdx);
        return zzdx;
    }

    private void zzZ(zzZCP zzzcp) {
        this.zzZbA = Math.max(this.zzZbA, zzzcp.zzZKA());
        this.zzZbz = Math.max(this.zzZbz, zzzcp.zzZKz());
        this.zzZby = Math.max(this.zzZby, zzzcp.zzZKy());
        this.zzZbx = Math.max(this.zzZbx, zzzcp.zzZKx());
    }

    private com.aspose.words.internal.zzZQ4 zzZIY() {
        return this.zzZy4.zzZLQ() != null ? new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, this.zzZek.getWidth(), this.zzZek.getHeight()) : new com.aspose.words.internal.zzZQ4(this.zzZbA, this.zzZby, zzZKC(), zzZKB());
    }

    private void zzZIZ() {
        this.zzZyQ.zzA(new com.aspose.words.internal.zzG());
        for (int i = 0; i < this.zzZyQ.zzZIv().length; i++) {
            com.aspose.words.internal.zzG zzg = this.zzZyQ.zzZIv()[i];
            if (zzg != null && zzg.getCount() > 0) {
                if (zzKC(i) && !this.zzZyQ.zzZIu().isEmpty()) {
                    zzg.zzZ(com.aspose.words.internal.zzP8.zzM(this.zzZyQ.zzZIu()));
                }
                this.zzZyQ.zzsD().zzX((com.aspose.words.internal.zzZL) zzg);
            }
        }
        this.zzZyQ.zzZI();
    }

    private void zzZJ0() throws Exception {
        if (this.zzZyT.zzZJe().size() > 0) {
            Iterator<zzGK> it = this.zzZyT.zzZJf().iterator();
            while (it.hasNext()) {
                zzR(it.next());
            }
        }
        zzZIZ();
    }

    private void zzZJ1() throws Exception {
        if (this.zzZyT.zzZQD()) {
            for (zzGK zzgk : this.zzZyT.zzZJf()) {
                if (!zzgk.zz3R() || zzgk.zzZPj().getCount() <= 1) {
                    if (zzQ(zzgk)) {
                        zzDY zzdy = new zzDY(this.zzZy4, zzgk, this.zzZyQ, this.zzZek, this.zzZyT.zzZQD());
                        zzdy.zzra();
                        com.aspose.words.internal.zzZQ4 zzzq4ZzZKe = zzdy.zzZKe();
                        if (!zzzq4ZzZKe.isEmpty()) {
                            this.zzZb1.clear();
                            this.zzZek = zzzq4ZzZKe;
                        } else {
                            if (zzgk.zz3R() && zzgk.zzZPj().getCount() == 1) {
                                return;
                            }
                            this.zzZb1.put(Long.valueOf(zzS(zzgk)), zzdy);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private void zzZJ2() throws Exception {
        Iterator<Map.Entry<Long, zzZCP>> it = this.zzZb1.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().zzU(this.zzZbA, this.zzZbz, this.zzZby, this.zzZbx);
        }
    }

    private void zzZJ3() throws Exception {
        new zzHE(this.zzZb2, this.zzZyQ).zzra();
        zzZJ1();
        Iterator<zzGK> it = this.zzZyT.zzZJe().iterator();
        while (it.hasNext()) {
            zzZ(zzT(it.next()));
        }
        zzZJ2();
    }

    private zzFI zzZJ4() {
        return (this.zzZyT.zzZJf().size() == 1 && this.zzZyT.zzZJd().zzZP9()) ? this.zzZyQ.zzZIC().zzZMz() : this.zzZy4.zzZLQ() != null ? this.zzZyQ.zzZIC().zzZMA() : this.zzZyQ.zzZIC().zzZMB();
    }

    private void zzZJ5() throws Exception {
        zzFI zzfiZzZJ4 = zzZJ4();
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzZIY());
        zzDG.zzZ(zzzgZzW, this.zzZyT.zzaQ(), (zzE3) null, zzfiZzZJ4, 1);
        this.zzZyQ.zzsD().zzX(zzzgZzW);
    }

    private float zzZKB() {
        return Math.max(this.zzZek.getHeight() - (this.zzZby + this.zzZbx), 0.0f);
    }

    private float zzZKC() {
        return Math.max(this.zzZek.getWidth() - (this.zzZbA + this.zzZbz), 0.0f);
    }

    public final com.aspose.words.internal.zzZQ4 zz44() {
        return this.zzZek;
    }

    public final com.aspose.words.internal.zzG zzYs() throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        this.zzZyQ.zzA(zzg);
        zzZJ3();
        zzZJ5();
        zzZJ0();
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzY(this.zzZek.getX(), this.zzZek.getY(), 0);
        this.zzZyQ.zzZI();
        return zzg;
    }

    public final com.aspose.words.internal.zzZQ4 zzZIX() {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(this.zzZek.getX(), this.zzZek.getY(), 0);
        return com.aspose.words.internal.zzJ6.zzZ(zzZIY(), zzp9);
    }
}
