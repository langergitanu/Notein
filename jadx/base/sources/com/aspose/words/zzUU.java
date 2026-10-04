package com.aspose.words;

import com.aspose.words.ref.RefFloat;

/* JADX INFO: loaded from: classes6.dex */
final class zzUU implements zzZD0 {
    private com.aspose.words.internal.zzPV zzZve = new com.aspose.words.internal.zzPV(242, 242, 242);
    private zzZ72 zzZvg;

    public zzUU(zzZ72 zzz72) {
        this.zzZvg = zzz72;
    }

    private void zzG(com.aspose.words.internal.zzZL zzzl) {
        com.aspose.words.internal.zz7 zz7VarZzZ2h = this.zzZvg.zzYTU().zzZ2h();
        zz7VarZzZ2h.zzX(zzzl);
        this.zzZvg.zzYTV().zzS(zz7VarZzZ2h);
    }

    private static void zzX(zzZ6P zzz6p) throws Exception {
        float width = zzz6p.getWidth() / (zzz6p.getWidth() + zzz6p.zzYSz());
        float height = (zzz6p.getHeight() - (zzz6p.getHeight() * width)) / 2.0f;
        float width2 = zzz6p.zzYSB() ? zzz6p.getWidth() - (zzz6p.getWidth() * width) : 0.0f;
        if (zzz6p.zzNb() == null) {
            zzz6p.zzL(new com.aspose.words.internal.zzP9());
        }
        zzz6p.zzNb().zzZ(width, width, 1);
        zzz6p.zzNb().zzY(width2, height, 1);
    }

    private void zzY(zzZ6P zzz6p) throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(this.zzZve));
        zzzg.zzY(new com.aspose.words.internal.zzOI(this.zzZve));
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzp5.zze(true);
        zzp5.zzJ(zzz6p.zzYSC());
        zzG(zzzg);
    }

    @Override // com.aspose.words.zzZD0
    public final void zzZ(zzZ6P zzz6p, zzZ71 zzz71) throws Exception {
        if (zzz6p.zzYfy.zzZqg().getCommentDisplayMode() == 2) {
            return;
        }
        zzY(zzz6p);
        if (zzz6p.zzUW(false) || zzz6p.zzYSF()) {
            zzz6p.zzYSH();
            for (zzZ6X zzz6x : zzz6p.zzYSI()) {
                if (!zzz6x.zzYTC().zzY60()) {
                    zzZ(zzz6x, zzz6p, zzz71);
                }
            }
        }
    }

    private void zzZ(zzZ6X zzz6x, zzZ6P zzz6p, zzZ71 zzz71) throws Exception {
        com.aspose.words.internal.zzPV.zzZ(zzz71.zzYTR().zzYSR().zzYkU(), com.aspose.words.internal.zzPV.zzHZ);
        com.aspose.words.internal.zzPV zzpvZzYkU = zzz71.zzYTR().zzYSR().zzYkU();
        com.aspose.words.internal.zzZZQ zzzzqZzS = zzz6x.zzS(zzz6p);
        for (int i = 0; i < zzzzqZzS.getCount(); i++) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzT7 = zzzzqZzS.zzT7(i);
            com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpvZzYkU, 0.2f));
            zzzg.zzY(new com.aspose.words.internal.zzOI(zzpvZzYkU));
            com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
            zzp5.zze(true);
            zzp5.zzJ(zzzq4ZzT7);
            zzG(zzzg);
        }
    }

    @Override // com.aspose.words.zzZD0
    public final void zzY(zzZ6P zzz6p, zzZ71 zzz71) throws Exception {
        if (zzz6p.zzYfy.zzZqg().getCommentDisplayMode() == 2) {
            return;
        }
        zzX(zzz6p);
        if (zzz6p.zzUW(false) || zzz6p.zzYSF()) {
            for (zzZ6X zzz6x : zzz6p.zzYSI()) {
                if (zzz6x.zzYgm.zzZ8m() == ((zzYN8) zzz6p.zzYgm)) {
                    zzZ(zzz6x, zzz71);
                    zzz6x.zzZ(this.zzZvg);
                }
                zzY(zzz6x, zzz6p, zzz71);
            }
        }
    }

    private void zzY(zzZ6X zzz6x, zzZ6P zzz6p, zzZ71 zzz71) throws Exception {
        com.aspose.words.internal.zzPV.zzZ(zzz71.zzYTR().zzYSR().zzYkT(), com.aspose.words.internal.zzPV.zzHZ);
        com.aspose.words.internal.zzPV zzpvZzYkT = zzz71.zzYTR().zzYSR().zzYkT();
        com.aspose.words.internal.zzZZQ zzzzqZzS = zzz6x.zzS(zzz6p);
        com.aspose.words.internal.zzZQ4 zzzq4ZzT7 = zzzzqZzS.zzT7(0);
        com.aspose.words.internal.zzZQ4 zzzq4ZzT72 = zzzzqZzS.zzT7(zzzzqZzS.getCount() - 1);
        boolean zZzYSB = zzz6p.zzYSB();
        if (zzz6x.zzYTC().zzY60()) {
            com.aspose.words.internal.zzZG zzzgZzY = zzY(zzpvZzYkT, zzzq4ZzT72, zzz6x.zzJH(), zzz6x.zzYTC().zzY5Z(), zZzYSB);
            com.aspose.words.internal.zzZG zzzgZzZ = zzZ(zzpvZzYkT, zzzq4ZzT72, zzz6x.zzJH(), zzz6x.zzYTC().zzY5Z(), zZzYSB);
            zzG(zzzgZzY);
            zzG(zzzgZzZ);
            return;
        }
        if (zzz6x.zzQ(zzz6p)) {
            zzG(zzZ(zzpvZzYkT, zzzq4ZzT7));
        }
        if (zzz6x.zzR(zzz6p)) {
            zzG(zzY(zzpvZzYkT, zzzq4ZzT72));
            zzG(zzZ(zzpvZzYkT, zzzq4ZzT72, zzz6x.zzJH(), false, zZzYSB));
        }
    }

    private void zzZ(zzZ6X zzz6x, zzZ71 zzz71) throws Exception {
        com.aspose.words.internal.zzPV.zzZ(zzz71.zzYTR().zzYSR().zzYkU(), com.aspose.words.internal.zzPV.zzHZ);
        com.aspose.words.internal.zzPV.zzZ(zzz71.zzYTR().zzYSR().zzYkT(), com.aspose.words.internal.zzPV.zzHZ);
        com.aspose.words.internal.zzPV zzpvZzYkU = zzz6x.zzYTC().zzY60() ? com.aspose.words.internal.zzPV.zzI5 : zzz71.zzYTR().zzYSR().zzYkU();
        com.aspose.words.internal.zzPV zzpvZzYkT = zzz71.zzYTR().zzYSR().zzYkT();
        com.aspose.words.internal.zzZQ4 zzzq4ZzJH = zzz6x.zzJH();
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpvZzYkT, 0.5f));
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzpvZzYkU));
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzp5.zze(true);
        zzZ(zzp5, zzzq4ZzJH.zzZE(), 180.0f);
        zzZ(zzp5, com.aspose.words.internal.zzZPY.zzG(zzzq4ZzJH.zzkw() - 6.0f, zzzq4ZzJH.zzZo()), 270.0f);
        zzZ(zzp5, com.aspose.words.internal.zzZPY.zzG(zzzq4ZzJH.zzkw() - 6.0f, zzzq4ZzJH.zzZn() - 6.0f), 0.0f);
        zzZ(zzp5, com.aspose.words.internal.zzZPY.zzG(zzzq4ZzJH.zzZm(), zzzq4ZzJH.zzZn() - 6.0f), 90.0f);
        zzG(zzzg);
    }

    private static void zzZ(com.aspose.words.internal.zzP5 zzp5, long j, float f) {
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5();
        zzq5.setSize(com.aspose.words.internal.zzZPW.zzG(6.0f, 6.0f));
        zzq5.zz6(f);
        zzq5.zz5(90.0d);
        zzq5.zzA(j);
        zzp5.zzZ(zzq5);
    }

    private static com.aspose.words.internal.zzZG zzY(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, boolean z, boolean z2) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpv, 0.1f));
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzpv));
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        if (z) {
            RefFloat refFloat = new RefFloat(0.0f);
            RefFloat refFloat2 = new RefFloat(0.0f);
            zzZ(zzzq42, z2, refFloat, refFloat2);
            refFloat.get();
            float f = refFloat2.get();
            zzp5.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(f - 2.6f, zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(f, zzzq4.zzZo() - 1.3f), com.aspose.words.internal.zzZPY.zzG(f, zzzq4.zzZo() + 1.3f)}, false);
            return zzzg;
        }
        zzp5.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw() - 1.3f, zzzq4.zzZn() - 2.6f), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw() + 1.3f, zzzq4.zzZn() - 2.6f)}, false);
        return zzzg;
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, boolean z, boolean z2) {
        RefFloat refFloat = new RefFloat(0.0f);
        RefFloat refFloat2 = new RefFloat(0.0f);
        zzZ(zzzq42, z2, refFloat, refFloat2);
        float f = refFloat.get();
        float f2 = refFloat2.get();
        com.aspose.words.internal.zzOU zzou = new com.aspose.words.internal.zzOU(zzpv, 0.25f);
        zzou.setDashStyle(2);
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzou);
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        if (z) {
            zzp5.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(f2, zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(f, zzzq42.getY() + 3.0f)}, false);
            return zzzg;
        }
        zzp5.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(f2, zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(f, zzzq42.getY() + 3.0f)}, false);
        return zzzg;
    }

    private static com.aspose.words.internal.zzZG zzY(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzZQ4 zzzq4) {
        float height = zzzq4.getHeight() * 0.03f;
        return zzZ(zzpv, new long[]{com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw() - height, zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo() + height), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn() - height), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw() - height, zzzq4.zzZn())});
    }

    private static void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, boolean z, RefFloat refFloat, RefFloat refFloat2) {
        refFloat.set(z ? zzzq4.getWidth() + zzzq4.getX() : zzzq4.getX());
        refFloat2.set(z ? refFloat.get() + 30.0f : refFloat.get() - 30.0f);
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzZQ4 zzzq4) {
        float height = zzzq4.getHeight() * 0.03f;
        return zzZ(zzpv, new long[]{com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm() + height, zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo() + height), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn() - height), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm() + height, zzzq4.zzZn())});
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzPV zzpv, long[] jArr) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpv, 0.2f));
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzp5.zzZ(jArr, false);
        return zzzg;
    }
}
