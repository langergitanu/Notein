package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.huawei.hms.network.embedded.C18438z3;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0P extends DocumentVisitor {
    private static int[] zzY1j = {40, 41, 91, 93, 123, 125, 43, 45, 42, 47, 94, 61, 62, 60, 59, 44, 46, 58, 39, 96, 95, 126, 37, 64, 63, 33, 124, 92, 8216, 8217, C18438z3.f56774j, 8221, 8214, 8214, 8968, 8969, 8970, 8971, 10098, 10099, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10624, 10624, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10748, 10749, 8291, 8756, 8757, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 8230, 8942, 8943, 8945, 8715, 8866, 8867, 8868, 8872, 8873, 8876, 8877, 8878, 8879, 8744, 8743, 8704, 8707, 8708, 8705, 8712, 8713, 8716, 8834, 8834, 8402, 8835, 8835, 8402, 8836, 8837, 8838, 8839, 8840, 8841, 8842, 8843, 8804, 8805, 8815, 8814, 8776, 8764, 8777, 8802, 8800, 8733, 8740, 8741, 8742, 8769, 8771, 8772, 8773, 8774, 8775, 8781, 8788, 8791, 8793, 8794, 8796, 8799, 8801, 8808, 8809, 8810, 8810, 824, 8811, 8811, 824, 8813, 8816, 8817, 8826, 8827, 8828, 8829, 8832, 8833, 8869, 8884, 8885, 8905, 8906, 8907, 8908, 8916, 8918, 8919, 8920, 8921, 8938, 8939, 8940, 8941, 9632, 9633, 9642, 9643, 9645, 9646, 9647, 9648, 9649, 9651, 9652, 9653, 9654, 9655, 9656, 9657, 9660, 9661, 9662, 9663, 9664, 9665, 9666, 9667, 9668, 9669, 9670, 9671, 9672, 9673, 9676, 9677, 9678, 9679, 9686, 9687, 9702, 10688, 10689, 10723, 10724, 10725, 10726, 10739, 10887, 10888, 10927, 10927, 824, 10928, 10928, 824, 8260, 8710, 8714, 8717, 8718, 8725, 8727, 8728, 8729, 8735, 8739, 8758, 8759, 8760, 8761, 8762, 8763, 8765, 8765, 817, 8766, 8767, 8770, 8770, 824, 8778, 8779, 8780, 8782, 8782, 824, 8783, 8783, 824, 8784, 8785, 8786, 8787, 8789, 8790, 8792, 8797, 8798, 8803, 8806, 8806, 824, 8807, 8812, 8818, 8819, 8820, 8821, 8822, 8823, 8824, 8825, 8830, 8831, 8831, 824, 8844, 8845, 8846, 8847, 8847, 824, 8848, 8848, 824, 8849, 8850, 8851, 8852, 8858, 8859, 8860, 8861, 8870, 8871, 8874, 8875, 8880, 8881, 8882, 8883, 8886, 8887, 8889, 8890, 8891, 8892, 8893, 8894, 8895, 8900, 8902, 8903, 8904, 8909, 8910, 8911, 8912, 8913, 8914, 8915, 8917, 8922, 8923, 8924, 8925, 8926, 8927, 8928, 8929, 8930, 8931, 8932, 8933, 8934, 8935, 8936, 8937, 8944, 8946, 8947, 8948, 8949, 8950, 8951, 8952, 8953, 8954, 8955, 8956, 8957, 8958, 8959, 9650, 10072, 10625, 10626, 10656, 10657, 10658, 10659, 10660, 10661, 10662, 10663, 10664, 10665, 10666, 10667, 10668, 10669, 10670, 10671, 10672, 10673, 10674, 10675, 10676, 10677, 10678, 10679, 10680, 10681, 10682, 10683, 10684, 10685, 10686, 10687, 10690, 10691, 10692, 10693, 10694, 10695, 10696, 10697, 10698, 10699, 10700, 10701, 10702, 10703, 10703, 824, 10704, 10704, 824, 10705, 10706, 10707, 10708, 10709, 10710, 10711, 10712, 10713, 10715, 10716, 10717, 10718, 10720, 10721, 10722, 10727, 10728, 10729, 10730, 10731, 10732, 10733, 10734, 10736, 10737, 10738, 10741, 10742, 10743, 10744, 10745, 10746, 10747, 10750, 10751, 10781, 10782, 10783, 10784, 10785, 10786, 10787, 10788, 10789, 10790, 10791, 10792, 10793, 10794, 10795, 10796, 10797, 10798, 10800, 10801, 10802, 10803, 10804, 10805, 10806, 10807, 10808, 10809, 10810, 10811, 10812, 10813, 10814, 10816, 10817, 10818, 10819, 10820, 10821, 10822, 10823, 10824, 10825, 10826, 10827, 10828, 10829, 10830, 10831, 10832, 10833, 10834, 10835, 10836, 10837, 10838, 10839, 10840, 10841, 10842, 10843, 10844, 10845, 10846, 10847, 10848, 10849, 10850, 10851, 10852, 10853, 10854, 10855, 10856, 10857, 10858, 10859, 10860, 10861, 10862, 10863, 10864, 10865, 10866, 10867, 10868, 10869, 10870, 10871, 10872, 10873, 10874, 10875, 10876, 10877, 10877, 824, 10878, 10878, 824, 10879, 10880, 10881, 10882, 10883, 10884, 10885, 10886, 10889, 10890, 10891, 10892, 10893, 10894, 10895, 10896, 10897, 10898, 10899, 10900, 10901, 10902, 10903, 10904, 10905, 10906, 10907, 10908, 10909, 10910, 10911, 10912, 10913, 10913, 824, 10914, 10914, 824, 10915, 10916, 10917, 10918, 10919, 10920, 10921, 10922, 10923, 10924, 10925, 10926, 10929, 10930, 10931, 10932, 10933, 10934, 10935, 10936, 10937, 10938, 10939, 10940, 10941, 10942, 10943, 10944, 10945, 10946, 10947, 10948, 10949, 10950, 10951, 10952, 10953, 10954, 10955, 10956, 10957, 10958, 10959, 10960, 10961, 10962, 10963, 10964, 10965, 10966, 10967, 10968, 10969, 10970, 10971, 10972, 10973, 10974, 10975, 10976, 10977, 10978, 10979, 10980, 10981, 10982, 10983, 10984, 10985, 10986, 10987, 10988, 10989, 10990, 10991, 10992, 10993, 10994, 10995, 10996, 10997, 10998, 10999, 11000, 11001, 11002, 11003, 11005, 11006, 8592, 8593, 8594, 8595, 8596, 8597, 8598, 8599, 8600, 8601, 8602, 8603, 8604, 8605, 8606, 8607, 8608, 8609, 8610, 8611, 8612, 8613, 8614, 8615, 8616, 8617, 8618, 8619, 8620, 8621, 8622, 8623, 8624, 8625, 8626, 8627, 8628, 8629, 8630, 8631, 8632, 8633, 8634, 8635, 8636, 8637, 8638, 8639, 8640, 8641, 8642, 8643, 8644, 8645, 8646, 8647, 8648, 8649, 8650, 8651, 8652, 8653, 8654, 8655, 8656, 8657, 8658, 8659, 8660, 8661, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 8673, 8674, 8675, 8676, 8677, 8678, 8679, 8680, 8681, 8682, 8683, 8684, 8685, 8686, 8687, 8688, 8689, 8690, 8691, 8692, 8693, 8694, 8695, 8696, 8697, 8698, 8699, 8700, 8701, 8702, 8703, 8888, 10224, 10225, 10229, 10230, 10231, 10232, 10233, 10234, 10235, 10236, 10237, 10238, 10239, 10496, 10497, 10498, 10499, 10500, 10501, 10502, 10503, 10504, 10505, 10506, 10507, 10508, 10509, 10510, 10511, 10512, 10513, 10514, 10515, 10516, 10517, 10518, 10519, 10520, 10521, 10522, 10523, 10524, 10525, 10526, 10527, 10528, 10529, 10530, 10531, 10532, 10533, 10534, 10535, 10536, 10537, 10538, 10539, 10540, 10541, 10542, 10543, 10544, 10545, 10546, 10547, 10548, 10549, 10550, 10551, 10552, 10553, 10554, 10555, 10556, 10557, 10558, 10559, 10560, 10561, 10562, 10563, 10564, 10565, 10566, 10567, 10568, 10569, 10570, 10571, 10572, 10573, 10574, 10575, 10576, 10577, 10578, 10579, 10580, 10581, 10582, 10583, 10584, 10585, 10586, 10587, 10588, 10589, 10590, 10591, 10592, 10593, 10594, 10595, 10596, 10597, 10598, 10599, 10600, 10601, 10602, 10603, 10604, 10605, 10606, 10607, 10608, 10609, 10610, 10611, 10612, 10613, 10614, 10615, 10616, 10617, 10618, 10619, 10620, 10621, 10622, 10623, 10649, 10650, 10651, 10652, 10653, 10654, 10655, 10719, 10735, 10740, 11077, 11078, 177, 177, 8722, 8722, 8723, 8723, 8724, 8862, 8863, 8721, 10762, 10763, 8748, 8749, 8853, 8854, 8856, 10753, 8747, 8750, 8751, 8752, 8753, 8754, 8755, 10764, 10765, 10766, 10767, 10768, 10769, 10770, 10771, 10772, 10773, 10774, 10775, 10776, 10777, 10778, 10779, 10780, 8899, 10755, 10756, 8896, 8897, 8898, 10752, 
    10754, 10757, 10758, 10759, 10760, 10761, 11004, 11007, 8768, 8719, 8720, 8745, 8746, 215, 8226, 8290, 8864, 8865, 8901, 10799, 10815, 183, 8855, 8726, StyleIdentifier.LIGHT_LIST_ACCENT_6, 8736, 8737, 8738, 172, 8857, 8706, 8711, 8242, 9837, 9838, 9839, 8517, 8518, 8730, 8731, 8732, 8289, 168, 175, 176, 180, 184, 710, 711, 713, 714, 715, 717, 728, 729, 730, 732, 733, 759, 770, 785, 8254, 8292, 8411, 8412, 9140, 9141, 9180, 9181, 9182, 9183, 9184, 9185};
    private boolean zzY1h;
    private zzZAC zzY1i;
    private OfficeMath zzY20;

    private zzZ0P(zzZAC zzzac, boolean z, OfficeMath officeMath) {
        this.zzY1i = zzzac;
        this.zzY1h = z;
        this.zzY20 = officeMath;
    }

    private String getName(String str) {
        return zzh(str, this.zzY1h);
    }

    private void zzA(OfficeMath officeMath) throws Exception {
        zzZ0J zzz0jZzZsL = officeMath.zzZsL();
        Object objZzPk = zzz0jZzZsL.zzPk(15180);
        Object objZzPk2 = zzz0jZzZsL.zzPk(15190);
        Object objZzPk3 = zzz0jZzZsL.zzPk(15200);
        this.zzY1i.zzY(getName("mfenced"));
        if (objZzPk != null) {
            this.zzY1i.zzX("open", Character.toString(((Character) objZzPk).charValue()));
        }
        if (objZzPk2 != null) {
            this.zzY1i.zzX("close", Character.toString(((Character) objZzPk2).charValue()));
        }
        this.zzY1i.zzX("separators", Character.toString(objZzPk3 == null ? '|' : ((Character) objZzPk3).charValue()));
        zzv(officeMath);
        this.zzY1i.endElement(getName("mfenced"));
    }

    private void zzB(OfficeMath officeMath) throws Exception {
        zzZ0J zzz0jZzZsL = officeMath.zzZsL();
        Object objZzPk = zzz0jZzZsL.zzPk(15300);
        boolean z = false;
        boolean z2 = objZzPk != null && ((Integer) objZzPk).intValue() == 1;
        String name = getName(z2 ? "mover" : "munder");
        String str = z2 ? "accent" : "accentunder";
        Object objZzPk2 = zzz0jZzZsL.zzPk(15290);
        if (objZzPk2 != null && ((Integer) objZzPk2).intValue() == 0) {
            z = true;
        }
        Object objZzPk3 = zzz0jZzZsL.zzPk(15280);
        if (objZzPk3 == null) {
            objZzPk3 = (char) 9182;
        }
        this.zzY1i.zzY(name);
        this.zzY1i.zzX(str, TelemetryEventStrings.Value.FALSE);
        zzZ(officeMath, objZzPk3, z, z2);
        this.zzY1i.endElement(name);
    }

    private void zzC(OfficeMath officeMath) throws Exception {
        OfficeMath officeMathZzU = zzU(officeMath, 8);
        if (officeMathZzU == null) {
            return;
        }
        Object objZzPk = officeMath.zzZsL().zzPk(15040);
        if (objZzPk == null) {
            objZzPk = (char) 770;
        }
        this.zzY1i.zzY(getName("mover"));
        this.zzY1i.zzX("accent", TelemetryEventStrings.Value.TRUE);
        zzx(officeMathZzU);
        zzZn((Character) objZzPk);
        this.zzY1i.endElement(getName("mover"));
    }

    private void zzD(OfficeMath officeMath) throws Exception {
        char c;
        String name = getName("munder");
        Object objZzPk = officeMath.zzZsL().zzPk(15030);
        if (objZzPk == null || ((Integer) objZzPk).intValue() != 0) {
            c = 818;
        } else {
            name = getName("mover");
            c = 175;
        }
        this.zzY1i.zzY(name);
        zzx(zzU(officeMath, 8));
        zzZn(Character.valueOf(c));
        this.zzY1i.endElement(name);
    }

    private void zzE(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("mtr"));
        zzZ0N zzz0nZzYEI = ((zzZ07) ((OfficeMath) officeMath.getParentNode()).zzZsL()).zzYEI();
        int i = 0;
        for (OfficeMath officeMath2 : officeMath.getChildNodes(35, false)) {
            if (officeMath2.zzZsL().getMathObjectType() == 8) {
                this.zzY1i.zzY(getName("mtd"));
                String strZzuK = zzuK(zzz0nZzYEI.zzuI(i).getHorizontalAlignment());
                if (strZzuK != null) {
                    this.zzY1i.zzX("columnalign", strZzuK);
                }
                officeMath2.accept(this);
                this.zzY1i.endElement(getName("mtd"));
                i++;
            }
        }
        this.zzY1i.endElement(getName("mtr"));
    }

    private void zzF(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("mtable"));
        zzW(officeMath, 20);
        this.zzY1i.endElement(getName("mtable"));
    }

    private static boolean zzG(boolean z, boolean z2) {
        if (z && z2) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void zzH(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("mpadded"));
        if (zzV(officeMath, 15450)) {
            this.zzY1i.zzX("width", "0cm");
        }
        if (zzV(officeMath, 15330)) {
            this.zzY1i.zzX("height", "0cm");
        }
        if (zzV(officeMath, 15340)) {
            this.zzY1i.zzX("depth", "0cm");
        }
        this.zzY1i.zzY(getName("mrow"));
        zzv(officeMath);
        this.zzY1i.endElement(getName("mrow"));
        this.zzY1i.endElement(getName("mpadded"));
    }

    private void zzI(OfficeMath officeMath) throws Exception {
        OfficeMath officeMathZzU = zzU(officeMath, 8);
        if (officeMathZzU == null) {
            return;
        }
        OfficeMath officeMathZzU2 = zzU(officeMath, 24);
        OfficeMath officeMathZzU3 = zzU(officeMath, 25);
        if (officeMathZzU2 == null && officeMathZzU3 == null) {
            return;
        }
        Object objZzPk = officeMath.zzZsL().zzPk(15045);
        if (objZzPk == null) {
            objZzPk = (char) 8747;
        }
        boolean zZzV = zzV(officeMath, 15520);
        boolean zZzV2 = zzV(officeMath, 15530);
        if (officeMathZzU2 == null) {
            zZzV = true;
        }
        if (officeMathZzU3 == null) {
            zZzV2 = true;
        }
        Character ch = (Character) objZzPk;
        String strZzZ = zzZ(officeMath, ch.charValue(), zZzV, zZzV2);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            this.zzY1i.zzY(strZzZ);
        }
        zzZn(ch);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            if (!zZzV) {
                zzx(officeMathZzU2);
            }
            if (!zZzV2) {
                zzx(officeMathZzU3);
            }
            this.zzY1i.endElement(strZzZ);
        }
        zzx(officeMathZzU);
    }

    private static ArrayList<String> zzIl(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (zzYn(cCharAt) && sb.length() > 0) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, sb.toString());
                sb.setLength(0);
            }
            sb.append(cCharAt);
        }
        if (sb.length() > 0) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, sb.toString());
        }
        return arrayList;
    }

    private void zzJ(OfficeMath officeMath) throws Exception {
        Iterator<T> it = officeMath.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            ((OfficeMath) it.next()).accept(this);
        }
    }

    private static String zzK(OfficeMath officeMath) {
        zzZ0E zzz0e = (zzZ0E) officeMath.zzZsL();
        StringBuilder sb = new StringBuilder();
        if (!zzz0e.zzYEY()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " top");
        }
        if (!zzz0e.zzYEW()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " right");
        }
        if (!zzz0e.zzYEZ()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " bottom");
        }
        if (!zzz0e.zzYEX()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " left");
        }
        if (zzz0e.zzYEU()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " horizontalstrike");
        }
        if (zzz0e.zzYET()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " verticalstrike");
        }
        if (zzz0e.zzYEV()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " updiagonalstrike");
        }
        if (zzz0e.zzYES()) {
            com.aspose.words.internal.zzZNH.zzU(sb, " downdiagonalstrike");
        }
        return com.aspose.words.internal.zzZKN.zzU(sb.toString(), ControlChar.SPACE_CHAR);
    }

    private void zzL(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("menclose"));
        this.zzY1i.zzX("notation", zzK(officeMath));
        zzW(officeMath, 8);
        this.zzY1i.endElement(getName("menclose"));
    }

    private static OfficeMath zzU(OfficeMath officeMath, int i) {
        for (OfficeMath officeMath2 : officeMath.getChildNodes(0, false)) {
            if (officeMath2.zzZsL().getMathObjectType() == i) {
                return officeMath2;
            }
        }
        return null;
    }

    private static boolean zzV(OfficeMath officeMath, int i) {
        Object objZzPk = officeMath.zzZsL().zzPk(i);
        return objZzPk != null && ((Boolean) objZzPk).booleanValue();
    }

    private void zzW(OfficeMath officeMath, int i) throws Exception {
        for (OfficeMath officeMath2 : officeMath.getChildNodes(0, false)) {
            if (officeMath2.zzZsL().getMathObjectType() == i) {
                officeMath2.accept(this);
            }
        }
    }

    private void zzX(zzYEF zzyef, String str) {
        String name = getName("mtext");
        this.zzY1i.zzY(name);
        zzZ(zzyef, str, false);
        this.zzY1i.endElement(name);
    }

    private void zzY(zzYEF zzyef, String str) {
        StringBuilder sb = new StringBuilder();
        String name = getName("mi");
        boolean zEquals = false;
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '&') {
                if (z) {
                    this.zzY1i.writeString(sb.toString());
                    this.zzY1i.zzp();
                    sb.setLength(0);
                    z = false;
                }
                this.zzY1i.zzW(getName("malignmark"));
            } else {
                String strZzZr = zzZr(str, i);
                if (strZzZr != null) {
                    zzZ(zzyef, sb.toString(), zEquals);
                    this.zzY1i.endElement(strZzZr);
                    sb.setLength(0);
                    z = false;
                }
                String strZzZs = zzZs(str, i);
                if (strZzZs != null) {
                    zEquals = com.aspose.words.internal.zzZKN.equals(strZzZs, name);
                    this.zzY1i.zzY(strZzZs);
                    z = true;
                }
                sb.append(str.charAt(i));
            }
        }
        if (sb.length() > 0) {
            zzZ(zzyef, sb.toString(), zEquals);
        }
        if (z) {
            this.zzY1i.zzp();
        }
    }

    private static boolean zzYn(char c) {
        return c >= 57344 && c < 63744;
    }

    private static boolean zzYo(char c) {
        return c == '&';
    }

    private static String zzZ(boolean z, boolean z2, String str, String str2, String str3) {
        if (z && !z2) {
            return str;
        }
        if (!z && z2) {
            return str2;
        }
        if (z) {
            return null;
        }
        return str3;
    }

    private void zzZn(Object obj) {
        this.zzY1i.zzY(getName("mo"));
        this.zzY1i.writeString(Character.toString(((Character) obj).charValue()));
        this.zzY1i.endElement(getName("mo"));
    }

    private static boolean zzZo(String str, int i) {
        for (int i2 : zzY1j) {
            if (str.charAt(i) == i2) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzZp(String str, int i) {
        return Character.isDigit(str.charAt(i));
    }

    private static boolean zzZq(String str, int i) {
        return (zzZp(str, i) || zzZo(str, i) || zzYo(str.charAt(i))) ? false : true;
    }

    private String zzZr(String str, int i) {
        if (!zzZq(str, i) && i != 0 && zzZq(str, i - 1)) {
            return getName("mi");
        }
        if (i != 0 && zzZo(str, i - 1)) {
            return getName("mo");
        }
        if (zzZp(str, i) || i == 0 || !zzZp(str, i - 1)) {
            return null;
        }
        return getName("mn");
    }

    private String zzZs(String str, int i) {
        if (zzZq(str, i) && (i == 0 || !zzZq(str, i - 1))) {
            return getName("mi");
        }
        if (zzZo(str, i)) {
            return getName("mo");
        }
        if (!zzZp(str, i)) {
            return null;
        }
        if (i == 0 || !zzZp(str, i - 1)) {
            return getName("mn");
        }
        return null;
    }

    private static String zzh(String str, boolean z) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}", z ? "mml:" : "", str);
    }

    private void zzu(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("msqrt"));
        zzx(officeMath);
        this.zzY1i.endElement(getName("msqrt"));
    }

    private static String zzuK(int i) {
        if (i == 1) {
            return "left";
        }
        if (i != 3) {
            return null;
        }
        return "right";
    }

    private void zzv(OfficeMath officeMath) throws Exception {
        for (OfficeMath officeMath2 : officeMath.getChildNodes(35, false)) {
            if (officeMath2.zzZsL().getMathObjectType() == 8) {
                zzx(officeMath2);
            }
        }
    }

    private void zzw(OfficeMath officeMath) throws Exception {
        OfficeMath officeMathZzU;
        OfficeMath officeMathZzU2 = zzU(officeMath, 7);
        if (officeMathZzU2 == null || (officeMathZzU = zzU(officeMath, 8)) == null) {
            return;
        }
        if (zzV(officeMath, 15540)) {
            zzu(officeMathZzU);
        } else {
            zzZ(officeMathZzU2, officeMathZzU);
        }
    }

    private void zzx(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("mrow"));
        if (officeMath != null) {
            officeMath.accept(this);
        }
        this.zzY1i.endElement(getName("mrow"));
    }

    private void zzy(OfficeMath officeMath) throws Exception {
        OfficeMath officeMathZzU = zzU(officeMath, 14);
        if (officeMathZzU == null) {
            return;
        }
        OfficeMath officeMathZzU2 = zzU(officeMath, 8);
        this.zzY1i.zzY(getName("mrow"));
        zzx(officeMathZzU);
        if (officeMathZzU2 != null) {
            zzZn((char) 8289);
            zzx(officeMathZzU2);
        }
        this.zzY1i.endElement(getName("mrow"));
    }

    private void zzz(OfficeMath officeMath) throws Exception {
        OfficeMath officeMathZzU;
        OfficeMath officeMathZzU2 = zzU(officeMath, 11);
        if (officeMathZzU2 == null || (officeMathZzU = zzU(officeMath, 12)) == null) {
            return;
        }
        Object objZzPk = officeMath.zzZsL().zzPk(15460);
        int iIntValue = objZzPk != null ? ((Integer) objZzPk).intValue() : 0;
        String name = getName(iIntValue == 1 ? "mrow" : "mfrac");
        this.zzY1i.zzY(name);
        if (iIntValue == 2) {
            this.zzY1i.zzX("linethickness", "0pt");
        }
        if (iIntValue == 3) {
            this.zzY1i.zzX("bevelled", TelemetryEventStrings.Value.TRUE);
        }
        zzx(officeMathZzU);
        if (iIntValue == 1) {
            zzZn(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        }
        zzx(officeMathZzU2);
        this.zzY1i.endElement(name);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathEnd(OfficeMath officeMath) {
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        switch (officeMath.zzZsL().getMathObjectType()) {
            case 2:
                zzC(officeMath);
                return 1;
            case 3:
                zzD(officeMath);
                return 1;
            case 4:
                zzL(officeMath);
                return 1;
            case 5:
                zzJ(officeMath);
                return 1;
            case 6:
                zzA(officeMath);
                return 1;
            case 7:
            case 8:
            case 11:
            case 12:
            case 14:
            case 16:
            case 24:
            case 25:
            default:
                return 0;
            case 9:
                zzG(officeMath);
                return 1;
            case 10:
                zzz(officeMath);
                return 1;
            case 13:
                zzy(officeMath);
                return 1;
            case 15:
                zzB(officeMath);
                return 1;
            case 17:
                zzZ(officeMath, getName("munder"));
                return 1;
            case 18:
                zzZ(officeMath, getName("mover"));
                return 1;
            case 19:
                zzF(officeMath);
                return 1;
            case 20:
                zzE(officeMath);
                return 1;
            case 21:
                zzI(officeMath);
                return 1;
            case 22:
                zzH(officeMath);
                return 1;
            case 23:
                zzw(officeMath);
                return 1;
            case 26:
                zzZ(officeMath, getName("mmultiscripts"), true);
                return 1;
            case 27:
                zzZ(officeMath, getName("msub"), 24);
                return 1;
            case 28:
                zzZ(officeMath, getName("msubsup"), false);
                return 1;
            case 29:
                zzZ(officeMath, getName("msup"), 25);
                return 1;
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        if (run.zztB(19) != null) {
            return 0;
        }
        zzL(run);
        return 0;
    }

    private void zzG(OfficeMath officeMath) throws Exception {
        this.zzY1i.zzY(getName("mtable"));
        for (OfficeMath officeMath2 : officeMath.getChildNodes(35, false)) {
            if (officeMath2.zzZsL().getMathObjectType() == 8) {
                this.zzY1i.zzY(getName("mtr"));
                this.zzY1i.zzY(getName("mtd"));
                this.zzY1i.zzY(getName("mrow"));
                this.zzY1i.zzW(getName("maligngroup"));
                officeMath2.accept(this);
                this.zzY1i.endElement(getName("mrow"));
                this.zzY1i.endElement(getName("mtd"));
                this.zzY1i.endElement(getName("mtr"));
            }
        }
        this.zzY1i.endElement(getName("mtable"));
    }

    public static void zzZ(OfficeMath officeMath, zzZAC zzzac, boolean z) throws Exception {
        zzZ0P zzz0p = new zzZ0P(zzzac, z, officeMath);
        zzzac.zzZ(zzz0p.getName("math"));
        zzzac.zzX(com.aspose.words.internal.zzZKN.format("xmlns{0}", z ? ":mml" : ""), "http://www.w3.org/1998/Math/MathML");
        if (z) {
            zzzac.zzX("xmlns:m", "http://schemas.openxmlformats.org/officeDocument/2006/math");
        }
        officeMath.accept(zzz0p);
        zzzac.endDocument();
    }

    private String zzJ(zzYEF zzyef) {
        return new zzZ13(new zzZ14(this.zzY20.getDocument()), this.zzY20, zzyef, false).getFontName();
    }

    private void zzL(Inline inline) {
        String text = inline.getText();
        if (text.length() != 1 && this.zzY1i.zzYXn()) {
            Iterator<String> it = zzIl(text).iterator();
            while (it.hasNext()) {
                zzZ(inline.zzZYh(), it.next());
            }
            return;
        }
        zzZ(inline.zzZYh(), text);
    }

    private String zzZ(OfficeMath officeMath, char c, boolean z, boolean z2) {
        Object objZzPk = officeMath.zzZsL().zzPk(15510);
        int iIntValue = objZzPk != null ? ((Integer) objZzPk).intValue() : -1;
        if (iIntValue == 0) {
            return zzZ(z, z2, getName("msup"), getName("msub"), getName("msubsup"));
        }
        if (iIntValue != 1 && c == 8747) {
            return zzZ(z, z2, getName("msup"), getName("msub"), getName("msubsup"));
        }
        return zzZ(z, z2, getName("mover"), getName("munder"), getName("munderover"));
    }

    private void zzZ(OfficeMath officeMath, String str) throws Exception {
        this.zzY1i.zzY(str);
        this.zzY1i.zzY(getName("mrow"));
        for (OfficeMath officeMath2 : officeMath.getChildNodes(0, false)) {
            if (officeMath2.zzZsL().getMathObjectType() != 16) {
                officeMath2.accept(this);
            }
        }
        this.zzY1i.endElement(getName("mrow"));
        this.zzY1i.zzY(getName("mrow"));
        zzW(officeMath, 16);
        this.zzY1i.endElement(getName("mrow"));
        this.zzY1i.endElement(str);
    }

    private void zzZ(OfficeMath officeMath, Object obj, boolean z, boolean z2) throws Exception {
        if (zzG(z, z2)) {
            zzv(officeMath);
            zzZn((Character) obj);
        } else {
            zzZn((Character) obj);
            zzv(officeMath);
        }
    }

    private void zzZ(OfficeMath officeMath, String str, int i) throws Exception {
        OfficeMath officeMathZzU;
        OfficeMath officeMathZzU2 = zzU(officeMath, 8);
        if (officeMathZzU2 == null || (officeMathZzU = zzU(officeMath, i)) == null) {
            return;
        }
        this.zzY1i.zzY(str);
        zzx(officeMathZzU2);
        zzx(officeMathZzU);
        this.zzY1i.endElement(str);
    }

    private void zzZ(OfficeMath officeMath, String str, boolean z) throws Exception {
        OfficeMath officeMathZzU;
        OfficeMath officeMathZzU2;
        OfficeMath officeMathZzU3 = zzU(officeMath, 8);
        if (officeMathZzU3 == null || (officeMathZzU = zzU(officeMath, 24)) == null || (officeMathZzU2 = zzU(officeMath, 25)) == null) {
            return;
        }
        this.zzY1i.zzY(str);
        zzx(officeMathZzU3);
        if (z) {
            this.zzY1i.zzW(getName("mprescripts"));
        }
        zzx(officeMathZzU);
        zzx(officeMathZzU2);
        this.zzY1i.endElement(str);
    }

    private void zzZ(OfficeMath officeMath, OfficeMath officeMath2) throws Exception {
        this.zzY1i.zzY(getName("mroot"));
        zzx(officeMath2);
        zzx(officeMath);
        this.zzY1i.endElement(getName("mroot"));
    }

    private void zzZ(zzYEF zzyef, String str) {
        if (zzyef.zzYdI()) {
            zzX(zzyef, str);
        } else {
            zzY(zzyef, str);
        }
    }

    private void zzZ(zzYEF zzyef, String str, boolean z) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        String strZzWG = zzZ0Q.zzWG(zzyef.zzYdG(), zzyef.zzYdH());
        if (!zzZ0Q.zzO(strZzWG, z, str.length() == 1)) {
            this.zzY1i.zzX("mathvariant", strZzWG);
        }
        com.aspose.words.internal.zzPV zzpvZzZy = zzyef.zzZy();
        if (!zzpvZzZy.isEmpty()) {
            this.zzY1i.zzX("mathcolor", zzYU3.zzZS(zzpvZzZy));
        }
        if (this.zzY1i.zzYXn() && zzYn(str.charAt(0))) {
            String strZzJ = zzJ(zzyef);
            if (!"Cambria Math".equals(strZzJ)) {
                this.zzY1i.zzH(new zzPS(new zzM3("font-family", new zzPA(zzL4.zzS4(strZzJ)))));
            }
        }
        zzZ0T zzz0t = new zzZ0T(str);
        while (zzz0t.moveNext()) {
            if (zzz0t.zzYFN()) {
                this.zzY1i.zzX(zzz0t.zzZ3P());
            } else {
                this.zzY1i.writeString(zzz0t.zzZ3P());
            }
        }
    }
}
