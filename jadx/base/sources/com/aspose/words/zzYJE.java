package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJE {
    public static void zzZ(zzZ6P zzz6p, zzZ71 zzz71, zzZ72 zzz72) throws Exception {
        if (zzz6p.zzYfy.hasRevisions() && ((zzYN8) zzz6p.zzYgm).zza8().zzYSR().zzYkQ()) {
            zzZ(((zzYN8) zzz6p.zzYgm).zzYqq(), zzz71, zzz72);
            zzZ(((zzYN8) zzz6p.zzYgm).zzYqp(), zzz71, zzz72);
            for (zzUZ zzuzZz06 = (zzUZ) ((zzYN8) zzz6p.zzYgm).zz6x(); zzuzZz06 != null && ((zzYN8) zzuzZz06.zzZZJ()) == ((zzYN8) zzz6p.zzYgm); zzuzZz06 = zzuzZz06.zz06()) {
                zzZ(zzuzZz06, zzz71, zzz72);
                zzZ(zzuzZz06.zz09(), zzz71, zzz72);
                zzZ(zzuzZz06.zz08(), zzz71, zzz72);
            }
        }
    }

    private static zzZ4N zzZW(zzZ55 zzz55) {
        zzZ4N zzz4nZzYPe = zzz55.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX((zzYAU) zzz55.zz6x());
        while (true) {
            if (!zzz4nZzYPe.movePrevious()) {
                break;
            }
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            if (((zzZ55) zzyau.zzZZJ()) != zzz55 && !zzyau.zzY6Z()) {
                zzz4nZzYPe.moveNext();
                break;
            }
        }
        if (zzz4nZzYPe.zz13()) {
            zzz4nZzYPe.zz0Z();
        }
        return zzz4nZzYPe;
    }

    private static boolean zzZX(zzZ55 zzz55) {
        if (zzz55.zzYTm() && ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLF()) {
            return true;
        }
        zzZ4N zzz4nZzZW = zzZW(zzz55);
        while (true) {
            zzYAU zzyau = (zzYAU) zzz4nZzZW.zzYPi();
            if (zzyau.zzY6N().zzYKU()) {
                return true;
            }
            if (zzyau == ((zzYAU) zzz55.zz6w())) {
                return false;
            }
            if (zzyau.zzZZJ() != zzz55) {
                zzyau.zzZZJ();
            }
            zzz4nZzZW.moveNext();
        }
    }

    private static float zzZY(zzZ55 zzz55) throws Exception {
        zzYN8 zzyn8ZzZ8m = zzz55.zzZ8m();
        int iZzYkR = zzz55.zza8().zzYSR().zzYkR();
        if (iZzYkR == 5 && zzz55.zza7().getMultiplePages() == 1) {
            iZzYkR = zzyn8ZzZ8m.zzYqk() ? 3 : 1;
        }
        if (iZzYkR == 3) {
            float width = (zzyn8ZzZ8m.getWidth() - zzyn8ZzZ8m.zzZXT()) / 1000.0f;
            if (width <= 0.0f) {
                return -3.4028235E38f;
            }
            return (zzyn8ZzZ8m.zzZXT() / 1000.0f) + (width > 24.0f ? width <= 72.0f ? width / 2.0f : width - 36.0f : 12.0f);
        }
        float fZz5X = zzyn8ZzZ8m.zz5X() / 1000.0f;
        if (fZz5X <= 0.0f) {
            return -3.4028235E38f;
        }
        if (fZz5X <= 24.0f) {
            return 12.0f;
        }
        return fZz5X <= 72.0f ? fZz5X / 2.0f : fZz5X - 36.0f;
    }

    private static void zzZ(zzZ55 zzz55, zzZ71 zzz71, zzZ72 zzz72) throws Exception {
        zzYBY zzybyZzQJ;
        if (zzZX(zzz55)) {
            zzz55 = zzZ55.zzb(zzz55);
            if (zzz55 == null) {
                return;
            }
            float fZzZY = zzZY(zzz55);
            if (fZzZY >= 0.0f) {
                com.aspose.words.internal.zzPV.zzZ(zzz71.zzYTR().zzYSR().zzYkV(), com.aspose.words.internal.zzPV.zzHZ);
                com.aspose.words.internal.zzPV zzpvZzYkV = zzz71.zzYTR().zzYSR().zzYkV();
                com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
                zzzg.zzY(new com.aspose.words.internal.zzOI(zzpvZzYkV));
                com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
                com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
                zzp5.zze(true);
                com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(fZzZY, ((int) (zzYMD.zzZ(zzz55, 1, true, false) >> 32)) / 1000.0f, zzz71.zzYTR().zzYSR().zzYkS(), zzz55.getHeight() / 1000.0f);
                com.aspose.words.internal.zz7 zz7VarZzZ2h = zzz72.zzYTU().zzZ2h();
                zzp5.zzJ(zzzq4);
                zz7VarZzZ2h.zzX(zzzg);
                zzz71.zzS(zz7VarZzZ2h);
            }
        }
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            if (zzyau.zzY74() && (zzybyZzQJ = zzyau.zzQJ(false)) != null) {
                zzZ((zzYC4) zzybyZzQJ.zz6x(), zzz71, zzz72);
            }
        }
    }

    private static void zzZ(zzYBL zzybl, zzZ71 zzz71, zzZ72 zzz72) throws Exception {
        if (zzybl == null) {
            return;
        }
        for (zzTC zztc = (zzTC) zzybl.zz6x(); zztc != null; zztc = (zzTC) zztc.zz5Z()) {
            if (zztc.zz60() == 32) {
                zzZ((zzZ55) zztc, zzz71, zzz72);
            } else {
                for (zzWT zzwt = (zzWT) ((zzYIA) zztc).zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
                    zzZ(zzwt, zzz71, zzz72);
                }
            }
        }
    }

    private static void zzZ(zzYVR zzyvr, zzZ71 zzz71, zzZ72 zzz72) throws Exception {
        if (zzyvr == null) {
            return;
        }
        for (zzYVQ zzyvq = (zzYVQ) zzyvr.zz6x(); zzyvq != null; zzyvq = (zzYVQ) zzyvq.zz5Z()) {
            zzZ(zzyvq, zzz71, zzz72);
        }
    }
}
