package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ63 extends zzZ6S {
    public zzZ63(zzYMD zzymd) throws Exception {
        zzZNO zzznoZzZu;
        super(zzymd);
        zzYIA zzyia = (zzYIA) zzymd;
        if (zzYJP.zzl(zzyia)) {
            zzZNL zzznlZzYF = zzymd.zzZZJ().zz60() == 16 ? ((zzWT) zzymd.zzZZJ()).zzYF(false) : zzymd.zzZ8m().zzYF(false);
            if (zzznlZzYF == null || (zzznoZzZu = zzznlZzYF.zzZu((zzY6N) ((zzYIC) zzyia.zza9()).zza9())) == null) {
                return;
            }
            zzXR zzxrZzZ8V = zzznoZzZu.zzZ8V();
            zzZ0(zzxrZzZ8V.getX());
            zzZ1(zzxrZzZ8V.getY());
        }
    }

    public static long zzW(zzYIA zzyia) throws Exception {
        zzYIA zzyiaZzYjT = zzyia.zzYjT();
        return com.aspose.words.internal.zzZPZ.zzZm(zzyiaZzYjT.getX(), zzyiaZzYjT.getY());
    }

    private boolean zzX(zzZ61 zzz61) throws Exception {
        zzYAU zzyau;
        ArrayList<zzYIA> arrayList = new ArrayList();
        int i = 0;
        for (zzYIA zzyia = (zzYIA) this.zzYgm; zzyia != null; zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzyia.zz5Z(), zzYIA.class)) {
            i++;
            if (!zzZ6M.zzX(zzyia)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYIA>) arrayList, zzyia);
            }
            if (zzyia.zza9().zzYTn()) {
                break;
            }
        }
        boolean z = i == arrayList.size();
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            zzZ55 zzz55 = null;
            for (zzYIA zzyia2 : arrayList) {
                zzYMD zzymdZz5Y = zzyia2.zz5Y();
                zzYIA zzyia3 = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzymdZz5Y, zzYIA.class);
                if (zzyia3 != null) {
                    zzymdZz5Y = (zzYMD) com.aspose.words.internal.zzZKW.zzZ(((zzWT) zzyia3.zz6w()).zz6w(), zzZ55.class);
                }
                zzZ55 zzz552 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymdZz5Y, zzZ55.class);
                zzYAU zzyau2 = zzz552 != null ? (zzYAU) zzz552.zz6w() : null;
                zzZ55 zzz553 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(((zzWT) com.aspose.words.internal.zzZKW.zzZ(zzyia2.zz6w(), zzWT.class)).zz6w(), zzZ55.class);
                if (zzz553 != null) {
                    if (zzz55 == null) {
                        zzz55 = zzz553;
                    }
                    zzZ4N zzz4nZzY4s = zzyia2.zzaa().zzY4s();
                    zzz4nZzY4s.zzX((zzYAU) zzz553.zz6w());
                    while (zzz4nZzY4s.movePrevious() && (zzyau = (zzYAU) com.aspose.words.internal.zzZKW.zzZ(zzz4nZzY4s.zzYPi(), zzYAU.class)) != zzyau2) {
                        if (zzyau.zzY6Z() || zzyau.zzYol()) {
                            zzYAT zzyat = (zzYAT) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAT.class);
                            if (zzyat != null) {
                                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAT>) arrayList2, zzyat);
                            }
                        }
                    }
                }
            }
            if (arrayList2.size() > 0) {
                arrayList2.size();
                zzZ6T zzz6tZza9 = zzz55.zza9();
                zzTF zztfZzZZJ = zzz55.zzZZJ();
                zzZ55 zzz554 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzz55.zz5R(), zzZ55.class);
                zzz554.zzZ(zzz6tZza9);
                zzz554.zzY(zztfZzZZJ);
                zzz554.setLineNumber(-1);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    zzZ6T zzz6tZza92 = ((zzYAT) arrayList2.get(i2)).zza9();
                    arrayList2.set(i2, (zzYAT) com.aspose.words.internal.zzZKW.zzZ(((zzYAT) arrayList2.get(i2)).zz5R(), zzYAT.class));
                    ((zzYAT) arrayList2.get(i2)).zzZ(zzz6tZza92);
                }
                Collections.reverse(arrayList2);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        ((zzYAT) arrayList2.get(i4)).zzu((zzYMD) arrayList2.get(i3));
                        ((zzYAT) arrayList2.get(i3)).zzt((zzYMD) arrayList2.get(i4));
                    }
                    if (i3 < arrayList2.size() - 1) {
                        int i5 = i3 + 1;
                        ((zzYAT) arrayList2.get(i5)).zzt((zzYMD) arrayList2.get(i3));
                        ((zzYAT) arrayList2.get(i3)).zzu((zzYMD) arrayList2.get(i5));
                    }
                    ((zzYAT) arrayList2.get(i3)).zzY(zzz554);
                }
                zzz554.zzZ((zzYMD) arrayList2.get(0));
                zzz554.zzY((zzYMD) C21505OooO0Oo.OooO00o(1, arrayList2));
                zzZ6N zzz6n = new zzZ6N(zzz554);
                zzz61.zzX(zzz6n);
                new zzZ6U(zzz554, 0L).zzZ(zzz61);
                zzz61.zzV(zzz6n);
                return z;
            }
        }
        return z;
    }

    public final String zzBC() {
        return ((zzY6N) ((zzYIC) ((zzYIA) this.zzYgm).zza9()).zza9()).zzY6a().getDescription();
    }

    public final int zzYRu() {
        return ((zzY6N) ((zzYIC) ((zzYIA) this.zzYgm).zza9()).zza9()).hashCode();
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzX(zzz61);
        zzz61.zzX(this);
        zzY6N zzy6n = (zzY6N) ((zzYIC) ((zzYIA) this.zzYgm).zza9()).zza9();
        zzYMD zzymdZz5Z = (zzYIA) this.zzYgm;
        while (zzymdZz5Z != null && zzymdZz5Z.zza9().zza9() == zzy6n) {
            new zzZ6M(zzymdZz5Z).zzZ(zzz61);
            zzymdZz5Z = zzymdZz5Z.zz5Z();
        }
        this.zzYgb = zzymdZz5Z;
        zzz61.zzW(this);
    }
}
