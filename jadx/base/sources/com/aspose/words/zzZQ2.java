package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ2 {
    private static Map<Integer, zzZ> zzYDy = zzZdn();

    public static class zzV implements zzX {
        private Style zzYDw;

        public zzV(Style style) {
            this.zzYDw = style;
        }

        @Override // com.aspose.words.zzZQ2.zzX
        public final Object zzPj(int i) {
            return this.zzYDw.zzZa(i, true);
        }
    }

    public static class zzW implements zzX {
        private Style zzYDw;

        public zzW(Style style) {
            this.zzYDw = style;
        }

        @Override // com.aspose.words.zzZQ2.zzX
        public final Object zzPj(int i) {
            return this.zzYDw.zzVv(i, 1) != null ? this.zzYDw.zzVv(i, 1) : this.zzYDw.getStyles().zzY36().zzPj(i);
        }
    }

    public interface zzX {
        Object zzPj(int i);
    }

    public static class zzY {
        private zzYEF zzZsP = new zzYEF();
        private zzYMX zzZsQ = new zzYMX();

        public final zzY zzDf(int i) {
            this.zzZsP.zzS(zzU1.zzMW(i));
            this.zzZsP.zzQ(zzU1.zzMW(i));
            this.zzZsP.zzP(zzU1.zzMW(i));
            return this;
        }

        public final zzY zzDg(int i) {
            this.zzZsP.setSize(i);
            this.zzZsP.zzvA(i);
            return this;
        }

        public final zzYEF zzZYh() {
            return this.zzZsP;
        }

        public final zzYMX zzZYj() {
            return this.zzZsQ;
        }

        public final zzY zzZdk() {
            this.zzZsP.zzQ(70, zzZU.zzZF6);
            this.zzZsP.zzX(zzZU.zzZF6);
            return this;
        }

        public final zzY zzZdl() {
            this.zzZsP.zzQ(60, zzZU.zzZF6);
            this.zzZsP.zzY(zzZU.zzZF6);
            return this;
        }
    }

    public static class zzZ {
        private Map<Integer, zzY> zzYDx;

        public zzZ() {
            HashMap map = new HashMap();
            this.zzYDx = map;
            map.put(33, new zzY());
            for (int i = 10; i <= 18; i++) {
                this.zzYDx.put(Integer.valueOf(i), new zzY());
            }
        }

        public final Map<Integer, zzY> zzZdm() {
            return this.zzYDx;
        }

        public final void zzh(int i, Object obj) {
            for (Map.Entry<Integer, zzY> entry : this.zzYDx.entrySet()) {
                if (entry.getKey().intValue() != 33) {
                    entry.getValue().zzZYj().set(i, obj);
                }
            }
        }

        public final void zzi(int i, Object obj) {
            for (Map.Entry<Integer, zzY> entry : this.zzYDx.entrySet()) {
                if (entry.getKey().intValue() != 33) {
                    entry.getValue().zzZYh().set(i, obj);
                }
            }
        }
    }

    private static void zzY(zzZ zzz, int i) {
        zzz.zzi(190, Integer.valueOf(i));
        zzz.zzi(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, Integer.valueOf(i));
        zzz.zzi(230, zzU1.zzMW(131076));
        zzz.zzi(240, zzU1.zzMW(131076));
        zzz.zzi(270, zzU1.zzMW(131076));
    }

    private static void zzZ(zzZ zzz, int i) {
        zzY(zzz, i);
        zzZ(zzz);
    }

    private static Map<Integer, zzZ> zzZdn() {
        HashMap map = new HashMap();
        map.put(1, zzZdu());
        map.put(2, zzZdt());
        map.put(3, zzZds());
        map.put(4, zzZdr());
        map.put(5, zzZdq());
        map.put(6, zzZdp());
        map.put(0, zzZdo());
        return map;
    }

    private static zzZ zzZdo() {
        zzZ zzz = new zzZ();
        zzZ(zzz);
        zzz.zzh(1650, new zzZ52(240, 2));
        zzY zzyZzZdl = zzz.zzZdm().get(33).zzZdl();
        zzyZzZdl.zzZYh().zzS(zzU1.zzMW(InputDeviceCompat.SOURCE_TRACKBALL));
        zzyZzZdl.zzZYh().zzR(zzU1.zzMW(65539));
        zzyZzZdl.zzZYh().zzQ(zzU1.zzMW(InputDeviceCompat.SOURCE_TRACKBALL));
        zzyZzZdl.zzZYh().zzP(zzU1.zzMW(65538));
        return zzz;
    }

    private static zzZ zzZdp() {
        zzZ zzz = new zzZ();
        zzZ(zzz, 20);
        zzz.zzZdm().get(33).zzDg(20).zzDf(131076).zzZYj().zzw3(0);
        return zzz;
    }

    private static zzZ zzZdq() {
        zzZ zzz = new zzZ();
        zzZ(zzz, 20);
        zzY zzyZzDf = zzz.zzZdm().get(33).zzZdl().zzZdk().zzDg(20).zzDf(131076);
        zzyZzDf.zzZYj().zzw5(120);
        zzyZzDf.zzZYj().zzw3(120);
        return zzz;
    }

    private static zzZ zzZdr() {
        zzZ zzz = new zzZ();
        zzZ(zzz, 18);
        zzY zzyZzDf = zzz.zzZdm().get(33).zzZdl().zzDg(28).zzDf(InputDeviceCompat.SOURCE_TRACKBALL);
        zzyZzDf.zzZYj().zzwa(140);
        zzyZzDf.zzZYj().zzw5(240);
        zzyZzDf.zzZYj().zzw3(120);
        return zzz;
    }

    private static zzZ zzZds() {
        zzZ zzz = new zzZ();
        zzZ(zzz, 18);
        zzY zzyZzDf = zzz.zzZdm().get(33).zzZdl().zzZdk().zzDg(26).zzDf(131076);
        zzyZzDf.zzZYj().zzw5(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        zzyZzDf.zzZYj().zzw3(240);
        Border border = new Border();
        border.setLineStyle(1);
        border.setLineWidth(1.5d);
        zzyZzDf.zzZYj().zzO(border);
        return zzz;
    }

    private static zzZ zzZdt() {
        zzZ zzz = new zzZ();
        zzZ(zzz, 18);
        zzY zzyZzDf = zzz.zzZdm().get(33).zzZdl().zzDf(InputDeviceCompat.SOURCE_TRACKBALL);
        zzyZzDf.zzZYj().setAlignment(1);
        zzyZzDf.zzZYj().zzw5(240);
        zzyZzDf.zzZYj().zzw3(120);
        Border border = new Border();
        border.setLineStyle(3);
        border.setLineWidth(0.75d);
        border.setShadow(true);
        zzyZzDf.zzZYj().zzO(border);
        zzyZzDf.zzZYj().zzL(border);
        zzyZzDf.zzZYj().zzN(border);
        zzyZzDf.zzZYj().zzM(border);
        return zzz;
    }

    private static zzZ zzZdu() {
        zzZ zzz = new zzZ();
        zzZ(zzz, 18);
        zzY zzyZzDf = zzz.zzZdm().get(33).zzZdl().zzDg(26).zzDf(131076);
        zzyZzDf.zzZYj().setAlignment(1);
        zzyZzDf.zzZYj().zzw5(240);
        zzyZzDf.zzZYj().zzw3(120);
        return zzz;
    }

    public static int zzu(Document document) {
        for (Map.Entry<Integer, zzZ> entry : zzYDy.entrySet()) {
            if (entry.getKey().intValue() != 0 && zzZ(document, entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    private static void zzZ(zzZ zzz) {
        zzz.zzh(EditingLanguage.CENTRAL_KURDISH_IRAQ, -220);
        zzz.zzh(1220, 0);
        zzz.zzZdm().get(10).zzZYj().zzwa(220);
        zzz.zzZdm().get(11).zzZYj().zzwa(440);
        zzz.zzZdm().get(12).zzZYj().zzwa(660);
        zzz.zzZdm().get(13).zzZYj().zzwa(880);
        zzz.zzZdm().get(14).zzZYj().zzwa(EditingLanguage.MALAYALAM);
        zzz.zzZdm().get(15).zzZYj().zzwa(1320);
        zzz.zzZdm().get(16).zzZYj().zzwa(1540);
        zzz.zzZdm().get(17).zzZYj().zzwa(1760);
        zzz.zzZdm().get(18).zzZYj().zzwa(FieldType.FIELD_CITATION);
    }

    public static void zzZ(Document document, int i) {
        for (Map.Entry<Integer, zzY> entry : zzYDy.get(Integer.valueOf(i)).zzZdm().entrySet()) {
            Style byStyleIdentifier = document.getStyles().getByStyleIdentifier(entry.getKey().intValue());
            byStyleIdentifier.zzZ((zzYEF) entry.getValue().zzZYh().zzbn());
            byStyleIdentifier.zzZ((zzYMX) entry.getValue().zzZYj().zzbn());
        }
    }

    private static boolean zzZ(DocumentBase documentBase, zzZ zzz) {
        for (Map.Entry<Integer, zzY> entry : zzz.zzZdm().entrySet()) {
            Style byStyleIdentifier = documentBase.getStyles().getByStyleIdentifier(entry.getKey().intValue());
            if (!zzZ(new zzV(byStyleIdentifier), entry.getValue().zzZYh(), 230, 240, 270, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, 250, StyleIdentifier.SUBTLE_EMPHASIS) || !zzZ(new zzW(byStyleIdentifier), entry.getValue().zzZYj(), 1160, EditingLanguage.CENTRAL_KURDISH_IRAQ)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZ(zzX zzx, zzZS zzzs, int... iArr) {
        for (int i = 0; i < zzzs.getCount(); i++) {
            int iZzT3 = zzzs.zzT3(i);
            if (com.aspose.words.internal.zzZKV.zzZ(iArr, iZzT3, 0, iArr.length) == -1 && !zzzs.get(iZzT3).equals(zzx.zzPj(iZzT3))) {
                return false;
            }
        }
        return true;
    }
}
