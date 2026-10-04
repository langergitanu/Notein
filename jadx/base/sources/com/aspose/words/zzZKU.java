package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKU {
    private HashMap<Section, zzZ> zzYtL = new HashMap<>();

    public static class zzZ {
        private boolean[] zzYtK = new boolean[6];

        public final void zzAf(int i) {
            this.zzYtK[i - 6] = true;
        }

        public final boolean zzAg(int i) {
            return this.zzYtK[i - 6];
        }
    }

    public zzZKU(zzZYW zzzyw) {
        HashMap map = new HashMap();
        for (zzYN8 zzyn8 = (zzYN8) zzzyw.zzZp0().zz6x(); zzyn8 != null; zzyn8 = (zzYN8) zzyn8.zzYo1()) {
            zzZ2D zzz2d = (zzZ2D) zzyn8.zza9();
            Section parentSection = (Section) com.aspose.words.internal.zzQW.zzZ(map, zzz2d);
            if (parentSection == null) {
                Paragraph paragraphZzY67 = ((zzYAS) com.aspose.words.internal.zzZKW.zzZ((zzYAU) ((zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzz2d.zzZXY().zz6w(), zzZ55.class)).zz6w(), zzYAS.class)).zzY67();
                if (paragraphZzY67 != null) {
                    paragraphZzY67.isEndOfSection();
                }
                parentSection = paragraphZzY67.getParentSection();
                com.aspose.words.internal.zzZQF.zzY(map, zzz2d, parentSection);
            }
            zzZ zzz = (zzZ) com.aspose.words.internal.zzQW.zzZ(this.zzYtL, parentSection);
            if (zzz == null) {
                zzz = new zzZ();
                com.aspose.words.internal.zzZQF.zzY(this.zzYtL, parentSection, zzz);
            }
            if (zzyn8.zzYqq() != null) {
                zzz.zzAf(((zzZKV) zzyn8.zzYqq().zzaa()).getStoryType());
            }
            if (zzyn8.zzYqp() != null) {
                zzz.zzAf(((zzZKV) zzyn8.zzYqp().zzaa()).getStoryType());
            }
        }
    }

    public final boolean zzZ(Section section, int i) {
        zzZ zzz = (zzZ) com.aspose.words.internal.zzQW.zzZ(this.zzYtL, section);
        if (zzz == null) {
            return false;
        }
        return zzz.zzAg(zzY0C.zzhC(i));
    }
}
