package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz5 {
    private static com.aspose.words.internal.zzPV zzZFp = new com.aspose.words.internal.zzPV(160, 160, 160);
    private static com.aspose.words.internal.zzPV zzZFo = new com.aspose.words.internal.zzPV(240, 240, 240);

    private static com.aspose.words.internal.zzPV zzY(zzZ3D zzz3d) {
        return (zzz3d.zzYN5() && zzz3d.zzZy().zzPz()) ? zzZFp : zzp(zzz3d.zzZy());
    }

    public static void zzZ(com.aspose.words.internal.zzG zzg, int i, int i2) {
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzY(i / 1000.0f, i2 / 1000.0f, 0);
    }

    private static com.aspose.words.internal.zzPV zzo(com.aspose.words.internal.zzPV zzpv) {
        return zzpv.isEmpty() ? zzZFo : zzpv;
    }

    private static com.aspose.words.internal.zzPV zzp(com.aspose.words.internal.zzPV zzpv) {
        return new com.aspose.words.internal.zzPV(255, zzpv.zzPC() / 2, zzpv.zzPB() / 2, zzpv.zzPA() / 2);
    }

    private static zzYMD zzY(zzYMD zzymd, ArrayList<com.aspose.words.internal.zzZL> arrayList, ArrayList<com.aspose.words.internal.zzZL> arrayList2) throws Exception {
        boolean z;
        boolean z2;
        zzXX zzxx = new zzXX(2);
        for (boolean z3 = false; !z3; z3 = z) {
            zzZ6N zzz6n = new zzZ6N(zzymd);
            z = true;
            if (zzz6n.getShading().isVisible() && zzz6n.zzYSm().getCount() > 0) {
                zzYAU zzyauZzYQc = ((zzZ55) zzymd).zzYQc();
                int iZzZo6 = zzyauZzYQc.zzZo6();
                boolean z4 = (!zzyauZzYQc.zza8().zzYTa() && zzyauZzYQc.zzY6N().isHidden() && zzY9R.zzmO(zzyauZzYQc.zzZo6()) && ((zzZ37) zzyauZzYQc.zzY6S().zzYTt()).zzYLC() == 2) ? false : true;
                boolean z5 = (zzY9R.zzmS(iZzZo6) && zzY9R.zzmM(iZzZo6)) ? false : true;
                if (zzymd.zzZZJ() instanceof zzWT) {
                    ((zzWT) com.aspose.words.internal.zzZKW.zzZ(zzymd.zzZZJ(), zzWT.class)).isVirtual();
                }
                if (z5 && z4) {
                    for (int i = 0; i < zzz6n.zzYSm().getCount(); i++) {
                        com.aspose.words.internal.zzZG zzzgZzZ = zzYCM.zzZ(zzz6n.zzYSm().zzT7(i), zzz6n.getShading());
                        if (zzzgZzZ != null) {
                            arrayList2.add(zzzgZzZ);
                        }
                    }
                }
            }
            for (zzY3C zzy3c : zzz6n.zzYSk()) {
                arrayList.add(zzZ72.zzu(zzy3c.zz1y(), zzy3c.zzZS6()));
            }
            if (zzz6n.zzYSu()) {
                zzxx.zz8z();
                zzxx.zzZ(zzz6n.zzYSl(), zzz6n.zz8p(), zzz6n.zz8o(), zzz6n.zz8n(), zzz6n.zz8m());
                z2 = !zzz6n.zzYSt();
            } else {
                z2 = true;
            }
            zzymd = ((zzZ55) zzymd).zzYPZ().zz5Z();
            if (zzymd != null && zzymd.zz60() == 32) {
                z = false;
            }
            if (zzxx.zz8u() && (z2 || z)) {
                arrayList.add(zzxx.zz8y());
            }
        }
        return zzymd;
    }

    public static ArrayList<com.aspose.words.internal.zzZL> zzZ(zzTF zztf) throws Exception {
        ArrayList<com.aspose.words.internal.zzZL> arrayList = new ArrayList<>();
        zzZ(arrayList, zztf);
        return arrayList;
    }

    public static void zzZ(ArrayList<com.aspose.words.internal.zzZL> arrayList, zzTF zztf) throws Exception {
        for (zzYMD zzymdZz6x = zztf.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
            com.aspose.words.internal.zzZL zzzlZzbF = zzymdZz6x.zzbF();
            if (zzzlZzbF != null) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzlZzbF);
            }
        }
    }

    public static void zzZ(zzTF zztf, Ref<ArrayList<com.aspose.words.internal.zzZL>> ref, Ref<ArrayList<com.aspose.words.internal.zzZL>> ref2) throws Exception {
        ref.set(new ArrayList<>());
        ref2.set(new ArrayList<>());
        int iZz60 = zztf.zz60();
        if (iZz60 == 2 || iZz60 == 16 || iZz60 == 1024 || iZz60 == 2048) {
            zzYMD zzymdZz6x = zztf.zz6x();
            while (zzymdZz6x != null) {
                zzymdZz6x = zzZ(zzymdZz6x, ref.get(), ref2.get());
            }
        }
    }

    private static zzYMD zzZ(zzYIA zzyia, ArrayList<com.aspose.words.internal.zzZL> arrayList, ArrayList<com.aspose.words.internal.zzZL> arrayList2) throws Exception {
        int i = 0;
        zzXX zzxx = new zzXX(0);
        zzYMD zzymdZz5Z = zzyia;
        while (true) {
            zzYIA zzyia2 = (zzYIA) zzymdZz5Z;
            float x = zzyia2.getX() / 1000.0f;
            float y = (zzyia2.getY() + zzyia2.zzZXQ()) / 1000.0f;
            boolean zZzYk4 = ((zzYIC) zzyia2.zza9()).zzYk4();
            if (zZzYk4) {
                zzXX zzxx2 = new zzXX(i);
                zzZ(zzyia2, 0.0f, 0.0f, zzxx2);
                zzZ(arrayList, zzxx2, x, y);
                zzZ(arrayList2, zzyia2, x, y);
            }
            zzYMC zzymcZzV = zzYMC.zzV(zzyia2);
            while (zzymcZzV.moveNext()) {
                zzWT zzwt = (zzWT) zzymcZzV.zzYnU();
                if (zZzYk4) {
                    zzXX zzxx3 = new zzXX(i);
                    int iZz6m = ((zzWV) zzwt.zza9()).zz6m();
                    if (iZz6m != 0 && ((iZz6m != 1 || !((zzYIA) zzwt.zzZZJ()).zzYnY()) && (iZz6m != 3 || !((zzYIA) zzwt.zzZZJ()).zzYnZ()))) {
                        if (((zzYIA) zzwt.zzZZJ()).zzYnZ() || iZz6m == 1) {
                            zzZ(zzwt, zzxx3, 0.0f);
                        }
                    } else {
                        zzZ72.zzZ(zzxx3, zzwt, zzWU.zzW(zzwt));
                    }
                    zzZ(arrayList, zzxx3, x, y);
                } else {
                    zzZ72.zzZ(zzxx, zzwt);
                }
                i = 0;
            }
            zzymdZz5Z = zzymdZz5Z.zz5Z();
            if (zzymdZz5Z == null || zzymdZz5Z.zz60() != 8 || ((zzY6N) ((zzYIC) ((zzYIA) zzymdZz5Z).zza9()).zza9()) != ((zzY6N) ((zzYIC) zzyia2.zza9()).zza9())) {
                break;
            }
            zzxx.zz8z();
            i = 0;
        }
        zzZ(arrayList, zzxx, zzyia.getX() / 1000.0f, zzyia.getY() / 1000.0f);
        return zzymdZz5Z;
    }

    private static void zzZ(ArrayList<com.aspose.words.internal.zzZL> arrayList, zzXX zzxx, float f, float f2) {
        com.aspose.words.internal.zzG zzgZz8y = zzxx.zz8y();
        if (zzgZz8y != null) {
            if (zzgZz8y.zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(zzgZz8y);
            }
            zzgZz8y.zzZO().zzY(f, f2, 0);
            arrayList.add(zzgZz8y);
        }
    }

    public static void zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ5 zzzq5) {
        zzg.zzZ(com.aspose.words.internal.zzP8.zzM(com.aspose.words.internal.zzSA.zzY(zzzq5)));
    }

    public static com.aspose.words.internal.zzZQ5 zzZ(zzYMD zzymd, int i) throws Exception {
        zzYMD zzymdZzqh = zzymd.zzqh(EditingLanguage.ARABIC_IRAQ);
        if (zzymdZzqh.zz60() != 2048) {
            return new com.aspose.words.internal.zzZQ5(-((int) zzYMD.zzZ(zzymd, 1, false, false)), 0, ((zzZ35) ((zzZ2D) ((zzYN8) zzymdZzqh).zza9()).zzYTt()).getPageWidth(), i);
        }
        return new com.aspose.words.internal.zzZQ5(-((int) zzYMD.zzZ(zzymd, 2048, false, false)), 0, Math.max(zzymd.getWidth(), ((zzYC4) zzymdZzqh).getWidth()), i);
    }

    public static com.aspose.words.internal.zzG zzZ(zzZ6O zzz6o) throws Exception {
        zzXX zzxx = new zzXX(3);
        zzxx.zz8z();
        zzxx.zzZ(zzz6o.zzYSx(), zzz6o.zz8p(), zzz6o.zz8o(), zzz6o.zz8n(), zzz6o.zz8m());
        return zzxx.zz8y();
    }

    public static com.aspose.words.internal.zzG zzZ(zzTF zztf, boolean z) throws Exception {
        com.aspose.words.internal.zzG zzgZzZ = zzZ((zzYMD) zztf, z);
        ArrayList<com.aspose.words.internal.zzZL> arrayListZzZ = zzZ(zztf);
        Ref ref = new Ref(null);
        Ref ref2 = new Ref(null);
        zzZ(zztf, (Ref<ArrayList<com.aspose.words.internal.zzZL>>) ref, (Ref<ArrayList<com.aspose.words.internal.zzZL>>) ref2);
        ArrayList arrayList = (ArrayList) ref.get();
        ArrayList arrayList2 = (ArrayList) ref2.get();
        com.aspose.words.internal.zzZQG.zzZ(arrayList2, (Iterable) arrayListZzZ);
        com.aspose.words.internal.zzZQG.zzZ(arrayList2, (Iterable) arrayList);
        zzgZzZ.zzZ(arrayList2);
        return zzgZzZ;
    }

    public static Shading zzZ(zzZ34 zzz34) {
        Shading shading = new Shading();
        if (zzz34 != null) {
            shading.zzZJ(zzz34.zzOL());
            shading.zzZK(zzz34.zzOK());
            shading.setTexture(zzz34.getTexture());
        }
        return shading;
    }

    public static Border zzZ(zzZ3D zzz3d) {
        return zzZ(zzz3d, -1, 32);
    }

    private static Border zzZ(zzZ3C zzz3c, int i) {
        return zzZ(zzz3c.zzwz(i), i, 8);
    }

    public static Border zzZ(zzZ3D zzz3d, int i, int i2) {
        Border border = new Border();
        if (zzz3d != null) {
            border.zzm(zzz3d.zzZy());
            border.setDistanceFromText(zzz3d.zzZSd());
            border.zzYO(zzz3d.isFrame());
            border.setShadow(zzz3d.zzYN4());
            border.zzOV(zzz3d.getLineStyle());
            if (zzz3d.getLineStyle() != 0) {
                border.setLineWidth(zzz3d.zzu4());
            }
            if (i2 != 16 && i2 != 8) {
                return border;
            }
            int lineStyle = zzz3d.getLineStyle();
            if (lineStyle == 26 || lineStyle == 27) {
                border.setLineStyle(1);
                com.aspose.words.internal.zzPV zzpvZzY = zzY(zzz3d);
                com.aspose.words.internal.zzPV zzpvZzo = zzo(zzz3d.zzZy());
                if ((i2 == 16) == (zzz3d.getLineStyle() == 26)) {
                    zzpvZzo = zzpvZzY;
                    zzpvZzY = zzpvZzo;
                }
                if (i != 2 && i != 0) {
                    zzpvZzY = (i == 1 || i == 3) ? zzpvZzo : border.zz8Q();
                }
                border.zzm(zzpvZzY);
            }
        }
        return border;
    }

    public static com.aspose.words.internal.zzG zzZ(zzYMD zzymd, boolean z) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ(zzg, zzymd.getX(), zzymd.getY());
        if (z) {
            zzZ(zzg, new com.aspose.words.internal.zzZQ5(0, 0, zzymd.getWidth(), zzymd.getHeight()));
        }
        return zzg;
    }

    public static zzZ71 zzZ(zzYMD zzymd, com.aspose.words.internal.zz7 zz7Var) {
        zzZ71 zzz71 = new zzZ71(zz7Var, zzymd.zzab().zza8());
        zzZ(zzymd, zzz71);
        return zzz71;
    }

    private static zzYMD zzZ(zzYMD zzymd, ArrayList<com.aspose.words.internal.zzZL> arrayList, ArrayList<com.aspose.words.internal.zzZL> arrayList2) throws Exception {
        int iZz60 = zzymd.zz60();
        if (iZz60 == 8) {
            return zzZ((zzYIA) zzymd, arrayList, arrayList2);
        }
        if (iZz60 == 32) {
            return zzY(zzymd, arrayList, arrayList2);
        }
        throw new IllegalStateException("Invalid part '" + zzymd.getClass().getName() + "' in container '" + zzymd.zzZZJ().getClass().getName() + "'.");
    }

    private static void zzZ(zzYMD zzymd, zzZ71 zzz71) {
        if (zzymd.zzZZJ() instanceof zzYC4) {
            zzYC4 zzyc4 = (zzYC4) zzymd.zzZZJ();
            if (zzyc4.getShading() != null) {
                zzz71.zzU(zzyc4.getShading());
            }
        }
        if (zzymd.zz60() == 64) {
            zzYAU zzyau = (zzYAU) zzymd;
            if (!zzyau.zzY6N().zzYMW().isEmpty()) {
                zzz71.zzU(zzZ(zzyau.zzY6N().zzYMW()));
                return;
            }
        }
        for (zzZ6T zzz6tZza9 = zzymd.zza9(); zzz6tZza9 != null; zzz6tZza9 = zzz6tZza9.zza9()) {
            int iZz6y = zzz6tZza9.zz6y();
            if (iZz6y == 16) {
                zzWV zzwv = (zzWV) zzz6tZza9;
                if (((zzZ3B) zzwv.zzYTt()) != null && !((zzZ3B) zzwv.zzYTt()).zzYMW().isEmpty()) {
                    zzz71.zzU(zzZ(((zzZ3B) zzwv.zzYTt()).zzYMW()));
                }
            } else if (iZz6y == 32) {
                zzYMM zzymm = (zzYMM) zzz6tZza9;
                if (!((zzZ37) zzymm.zzYTt()).zzYMW().isEmpty()) {
                    zzz71.zzU(zzZ(((zzZ37) zzymm.zzYTt()).zzYMW()));
                }
            }
        }
    }

    public static void zzZ(zzYIA zzyia, float f, float f2, zzXX zzxx) throws Exception {
        if (((zzYIC) zzyia.zza9()).zzYk4()) {
            zzZ3C zzz3cZzYMV = ((zzYIC) zzyia.zza9()).zzYk1().zzYMV();
            float height = zzyia.getHeight() / 1000.0f;
            Border borderZzZ = Border.zzZCe;
            if (zzyia.zzYjG()) {
                borderZzZ = zzZ(zzz3cZzYMV, 0);
                height -= borderZzZ.zz8S();
            }
            Border border = borderZzZ;
            Border borderZzZ2 = Border.zzZCe;
            if (zzyia.zzYjH() && !zzyia.zzYjB()) {
                borderZzZ2 = zzZ(zzz3cZzYMV, 3);
            }
            zzYCO zzycoZzK = zzYIB.zzK(zzyia);
            zzxx.zzZ(new com.aspose.words.internal.zzZQ4(f + zzycoZzK.zzYbM(), f2, zzycoZzK.getLength(), height), zzZ(zzz3cZzYMV, 1), zzZ(zzz3cZzYMV, 2), borderZzZ2, border);
        }
    }

    public static void zzZ(zzWT zzwt, zzXX zzxx, float f) throws Exception {
        ((zzYIC) ((zzYIA) zzwt.zzZZJ()).zza9()).zzYk5();
        while (zzwt != null) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzW = zzWU.zzW(zzwt);
            com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(zzzq4ZzW.getX(), zzzq4ZzW.getY() + f, zzzq4ZzW.getWidth(), zzzq4ZzW.getHeight());
            f = zzzq4.zzZn();
            zzZ72.zzZ(zzxx, zzwt, zzzq4);
            zzxx.zz8z();
            if (zzwt.isSink()) {
                return;
            } else {
                zzwt = zzWK.zzM(zzwt);
            }
        }
    }

    private static void zzZ(ArrayList<com.aspose.words.internal.zzZL> arrayList, zzYIA zzyia, float f, float f2) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = zzYCM.zzZ(zzYIB.zzL(zzyia), ((zzYIC) zzyia.zza9()).zzYk1().zzYMW().getShading());
        if (zzzgZzZ != null) {
            if (zzzgZzZ.zzZO() == null) {
                zzzgZzZ.zzW(new com.aspose.words.internal.zzP9());
            }
            zzzgZzZ.zzZO().zzY(f, f2, 0);
            arrayList.add(zzzgZzZ);
        }
    }

    public static zzZ6O zzZ(zzYN8 zzyn8) throws Exception {
        int iMin;
        zzZ2D zzz2d = (zzZ2D) zzyn8.zza9();
        zzZ35 zzz35 = (zzZ35) zzz2d.zzYTt();
        boolean z = zzz35.getBorderAppliesTo() == 0 || (zzz35.getBorderAppliesTo() == 1 && zzz2d.zzYJb() == zzyn8) || (zzz35.getBorderAppliesTo() == 2 && zzz2d.zzYJb() != zzyn8);
        zzZ6O zzz6o = new zzZ6O(zzXZ.zzZ(zzz35, 1, 3, 2, 0));
        if (!z || !zzz6o.isVisible()) {
            return null;
        }
        zzz6o.zzUV(zzz35.zzYLr());
        if (zzz35.getBorderDistanceFrom() != 0) {
            float fZzZSd = zzz35.zzYMV().zzwz(1).zzZSd();
            float pageWidth = (zzz35.getPageWidth() / 1000.0f) - zzz35.zzYMV().zzwz(2).zzZSd();
            float fZzZSd2 = zzz35.zzYMV().zzwz(3).zzZSd();
            zzz6o.zzZ8(new com.aspose.words.internal.zzZQ4(fZzZSd, fZzZSd2, pageWidth - fZzZSd, ((zzz35.getPageHeight() / 1000.0f) - zzz35.zzYMV().zzwz(0).zzZSd()) - fZzZSd2));
            return zzz6o;
        }
        float fZz5X = (zzyn8.zz5X() - zzz35.zzYMV().zzwz(1).zzYN3()) / 1000.0f;
        float fZzZXT = (zzyn8.zzZXT() + zzz35.zzYMV().zzwz(2).zzYN3()) / 1000.0f;
        int iZzYqo = zzyn8.zzYqo();
        if (zzYN8.zzT(zzyn8.zzYqq())) {
            if (zzz2d.zza7().zzYMT()) {
                iZzYqo = zzyn8.zzYqq().getY();
            } else if (zzyn8.zzYqq().zzZ4W() && zzyn8.zza7().zzZYM()) {
                iZzYqo = zzyn8.zzYqq().getBottom();
            } else {
                iZzYqo = Math.max(zzyn8.zzYqo(), zzyn8.zzYqq().getBottom());
            }
        }
        float fZzYN3 = (iZzYqo - zzz35.zzYMV().zzwz(3).zzYN3()) / 1000.0f;
        int iZzYqn = zzyn8.zzYqn();
        if (zzyn8.zzYqp() != null) {
            if (zzz2d.zza7().zzYMS()) {
                iMin = Math.max(zzyn8.zzYqn(), zzyn8.zzYqp().getBottom());
            } else if (zzyn8.zzYqp().zzZ4W() && zzyn8.zza7().zzZYM()) {
                iMin = zzyn8.zzYqp().getY();
            } else if (zzyn8.zzYqp().zzZ4X()) {
                iMin = zzyn8.zzYqn();
            } else {
                iMin = Math.min(zzyn8.zzYqn(), zzyn8.zzYqp().getY());
            }
            iZzYqn = iMin;
        }
        zzz6o.zzZ8(new com.aspose.words.internal.zzZQ4(fZz5X, fZzYN3, fZzZXT - fZz5X, ((iZzYqn + zzz35.zzYMV().zzwz(0).zzYN3()) / 1000.0f) - fZzYN3));
        return zzz6o;
    }

    public static zzYCO zzZ(zzYAU zzyau, float f, float f2) throws Exception {
        zzZ55 zzz55 = (zzZ55) zzyau.zzZZJ();
        float fZzYPS = zzz55.zzYPS() / 1000.0f;
        if (fZzYPS > 0.0f) {
            if (zzyau != zzz55.zzI(true, true)) {
                fZzYPS = 0.001f;
            }
            if (zzz55.zz5T()) {
                f += f2 - fZzYPS;
            }
            return new zzYCO(f, fZzYPS);
        }
        return zzYCO.zzXnE;
    }
}
