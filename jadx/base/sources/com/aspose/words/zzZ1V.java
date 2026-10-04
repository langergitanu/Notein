package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1V {
    private boolean zzY3A;
    private String zzY3B;
    private Style zzY3C;
    private Style zzY3D;
    private String zzY3E;
    private zzZ1V zzY3G;
    private String[] zzY3u;
    private ArrayList<String> zzY3v;
    private Footnote zzY3x;
    private int zzY3y;
    private boolean zzY3z;
    private zzZ25 zzY41;
    private zzZ1M zzY4a;
    private zzYH zzY4f;
    private int zzYXS;
    private Paragraph zzYtC;
    private zzY4T zzY45 = new zzY4T();
    private int zzY3F = -1;
    private int zzYcw = -1;
    private StringBuilder zzY3w = new StringBuilder();
    private int zzYog = -1;

    public zzZ1V(Paragraph paragraph, zzZ1M zzz1m) throws Exception {
        this.zzYtC = paragraph;
        this.zzY4a = zzz1m;
        this.zzY3G = zzz1m.zzYHE();
        zzY4T zzy4t = this.zzY45;
        zzZ1M zzz1m2 = this.zzY4a;
        this.zzY41 = new zzZ25(zzy4t, zzz1m2, zzz1m2.getDocument().getWarningCallback());
        zzra();
        if (zzYHW()) {
            zzi(ControlChar.LINE_BREAK, true);
        }
    }

    private String getParagraphBreak() {
        return this.zzY4a.zzYHF().getParagraphBreak();
    }

    private boolean isHeading() {
        return zzYI1() > 0;
    }

    private boolean isHorizontalRule() {
        zzZKI zzzkiZzZyf;
        Paragraph paragraph = this.zzYtC;
        if (paragraph == null || paragraph.getFirstChild() == null || this.zzYtC.getFirstChild().getNodeType() != 18 || (zzzkiZzZyf = ((Shape) this.zzYtC.getFirstChild()).zzY9h().zzZyf()) == null) {
            return false;
        }
        return zzzkiZzZyf.getOn();
    }

    private void updateListLabels() throws Exception {
        int iZzYId = zzYId();
        zzZ1V zzz1v = this.zzY3G;
        if (zzz1v != null && zzz1v.zzYIa()) {
            for (int i = 0; i < iZzYId; i++) {
                zzYI4()[i] = this.zzY3G.zzYI4()[i] == null ? "" : com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, this.zzY3G.zzYI4()[i].length());
            }
        }
        while (iZzYId < zzYHY().size()) {
            zzYI4()[iZzYId] = zzYHY().get(iZzYId);
            iZzYId++;
        }
        if (zzYI8()) {
            zzYI4()[zzZ0C()] = zzYI2();
        }
    }

    private void zzB(StringBuilder sb) {
        if (zzYI7() || isHorizontalRule() || this.zzYtC.isInCell()) {
            return;
        }
        com.aspose.words.internal.zzZYD.zzP(sb);
        if (sb.length() == 0 || zzIy(sb.toString()) == 14) {
            return;
        }
        this.zzY4a.zzZeE().append(IOUtils.DIR_SEPARATOR_WINDOWS);
    }

    private void zzC(StringBuilder sb) throws Exception {
        String string;
        if (!com.aspose.words.internal.zzZYD.zzS(sb)) {
            com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), this.zzY3w);
            return;
        }
        if (zzYHY().size() > 0) {
            string = this.zzY3w.substring(0, this.zzY3F);
        } else if (zzYI8()) {
            StringBuilder sb2 = this.zzY3w;
            string = sb2.substring(0, sb2.length() - zzYI2().length());
        } else {
            string = this.zzY3w.toString();
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), com.aspose.words.internal.zzZKN.zzTY(string));
    }

    private byte zzIy(String str) {
        return zzYHZ().zza(str, 0).zzkz();
    }

    private String zzR(zzYMX zzymx) throws Exception {
        return zzWJ(zzymx.getListId(), zzymx.zzZ0C());
    }

    private void zzTo(boolean z) {
        isHeading();
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), com.aspose.words.internal.zzZKN.format(z ? "<h{0}>" : "</h{0}>", Integer.valueOf(zzYI1())));
    }

    private boolean zzV(StringBuilder sb, int i) {
        if (zzYIv() && (i != 0 || !zzYI6())) {
            return true;
        }
        if (i <= zzYHX() || !this.zzYtC.isListItem()) {
            return false;
        }
        if (zzZ1N.zzz(sb)) {
            if (sb.charAt(0) != '1' || !zzZ1N.zzYB(sb.charAt(1))) {
                return false;
            }
        } else if (!zzZ1N.zzA(sb)) {
            return false;
        }
        return true;
    }

    private String zzWJ(int i, int i2) throws Exception {
        if (i == 0 || this.zzY4a.zzYHF().getListExportMode() == 1) {
            return "";
        }
        List listZzxu = this.zzY4a.getDocument().getLists().zzxu(i);
        boolean z = listZzxu.zzYPa().zzYOP().get(0).getNumberStyle() == 23;
        if (this.zzYtC.isInCell() && !z) {
            this.zzY4a.updateListLabels();
            return com.aspose.words.internal.zzZKN.format("{0} ", this.zzYtC.getListLabel().getLabelString());
        }
        ListLevelCollection listLevelCollectionZzYOP = listZzxu.zzYPa().zzYOP();
        ListLevel listLevel = z ? listLevelCollectionZzYOP.get(0) : listLevelCollectionZzYOP.get(i2);
        if (listLevel.getNumberFormat().length() <= 0) {
            return "";
        }
        char cCharAt = listLevel.getNumberFormat().charAt(listLevel.getNumberFormat().length() - 1);
        return com.aspose.words.internal.zzZKN.format("{0}{1} ", z ? "" : com.aspose.words.internal.zzJB.zzWD(listLevel.getStartAt()), Character.valueOf(zzZ1N.zzuX(z ? zzZ1N.zzYC(cCharAt) : zzZ1N.zzYD(cCharAt))));
    }

    private boolean zzYHV() {
        for (zzZ1V zzz1v = this; zzz1v.zzY3G != null && com.aspose.words.internal.zzAN.zzL(zzz1v.zzYtC.getParagraphFormat().getLeftIndent(), zzz1v.zzY3G.zzYtC.getParagraphFormat().getLeftIndent()); zzz1v = zzz1v.zzY3G) {
            if (zzz1v.zzY3G.zzYtC.isListItem()) {
                return true;
            }
        }
        return false;
    }

    private boolean zzYHW() throws Exception {
        if (this.zzY3G == null || zzYIv() || this.zzYtC.isInCell() || this.zzYtC.zzYoV() || this.zzY3G.zzYtC.zzYoV() || isHeading() || this.zzY3G.isHeading()) {
            return false;
        }
        int i = this.zzYcw;
        zzZ1V zzz1v = this.zzY3G;
        if (i > zzz1v.zzYcw || zzz1v.isHorizontalRule() || zzYI7()) {
            return false;
        }
        zzZ1V zzz1v2 = this.zzY3G;
        if (zzz1v2.zzY3A) {
            return false;
        }
        if (zzz1v2.zzYtC.isListItem()) {
            if (isHorizontalRule()) {
                return false;
            }
            if (!this.zzYtC.isListItem() || (zzYI9() && this.zzY3G.zzYI9() && zzYI5() > this.zzY3G.zzYI5() && this.zzYXS != 1)) {
                return true;
            }
            if (zzYI8() || zzYId() == 0) {
                return false;
            }
        }
        return true;
    }

    private int zzYHX() {
        return this.zzY45.getCount() <= 1 ? this.zzY45.getCount() - 1 : com.aspose.words.internal.zzZYD.zzS(this.zzY45.zzju(0)) ? 1 : 0;
    }

    private ArrayList<String> zzYHY() {
        if (this.zzY3v == null) {
            this.zzY3v = new ArrayList<>();
        }
        return this.zzY3v;
    }

    private zzYH zzYHZ() {
        if (this.zzY4f == null) {
            this.zzY4f = new zzYH();
        }
        return this.zzY4f;
    }

    private int zzYI0() {
        if (this.zzY3z) {
            return Math.min(Math.max(zzYI1(), 1), 2);
        }
        return 0;
    }

    private int zzYI1() {
        Style style = this.zzY3D;
        if (style != null) {
            return style.getStyleIdentifier();
        }
        return 0;
    }

    private String zzYI2() throws Exception {
        if (this.zzY3E == null) {
            if (this.zzYtC.zzZYj().contains(EditingLanguage.KASHMIRI_ARABIC)) {
                this.zzY3E = zzR(this.zzYtC.zzZYj());
            } else {
                int i = 0;
                for (Style styleZzqy = this.zzYtC.zzqy(0); styleZzqy != null; styleZzqy = styleZzqy.zzY3j()) {
                    if (styleZzqy.zzZYj().contains(EditingLanguage.KASHMIRI_ARABIC)) {
                        int listId = styleZzqy.zzZYj().getListId();
                        if (i == 0) {
                            i = listId;
                        }
                        if (listId == 0 || com.aspose.words.internal.zzZKN.zzS(styleZzqy.getName(), "List", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                            this.zzY3E = "";
                            break;
                        }
                    }
                }
                if (this.zzY3E == null) {
                    this.zzY3E = zzWJ(i, zzZ0C());
                }
            }
            if (this.zzY3E.length() > 0 && com.aspose.words.internal.zzZYD.zzXh(this.zzY3E)) {
                this.zzY3E = "";
            }
        }
        return this.zzY3E;
    }

    private String zzYI3() {
        if (!zzYI7()) {
            return "";
        }
        if (this.zzY3B == null) {
            String name = this.zzY3C.getName();
            int i = 10;
            if (10 < name.length() && name.charAt(10) == '.') {
                i = 11;
            }
            this.zzY3B = name.substring(i, (name.length() - i) + i);
        }
        return this.zzY3B;
    }

    private String[] zzYI4() {
        if (this.zzY3u == null) {
            this.zzY3u = new String[9];
        }
        return this.zzY3u;
    }

    private int zzYI5() {
        for (int i = 0; i < zzYI4().length; i++) {
            if (!com.aspose.words.internal.zzZYD.zzXh(zzYI4()[i])) {
                return i;
            }
        }
        return -1;
    }

    private boolean zzYI6() {
        if (!zzYIv()) {
            return false;
        }
        zzZ1V zzz1v = this.zzY3G;
        return zzz1v == null || this.zzY3x != zzz1v.zzY3x;
    }

    private boolean zzYI7() {
        return this.zzY3C != null;
    }

    private boolean zzYI8() throws Exception {
        return zzYI2().length() > 0 && !com.aspose.words.internal.zzZYD.zzXh(zzYI2());
    }

    private boolean zzYI9() {
        zzYIa();
        return this.zzY4a.getDocument().getLists().zzxu(this.zzYtC.zzZYj().getListId()).zzYPa().zzYOP().get(0).getNumberStyle() == 0;
    }

    private boolean zzYIa() {
        return this.zzYtC.isListItem() || zzYHV();
    }

    private void zzYIb() {
        if (zzYI7() || this.zzY3A) {
            return;
        }
        this.zzY45.zzXUQ().insert(0, '`');
        this.zzY45.zzXUQ().append('`');
    }

    private void zzYIc() {
        isHeading();
        String str = com.aspose.words.internal.zzZKN.format(" {0}", com.aspose.words.internal.zzZKN.zzS('#', zzYI1()));
        if (com.aspose.words.internal.zzZYD.zzX(this.zzY45.zzju(zzYHX()), str)) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), str);
        }
    }

    private int zzYId() throws Exception {
        int size = zzYHY().size();
        if (zzYI8()) {
            size++;
        }
        return Math.max(0, (zzZ0C() + 1) - size);
    }

    private void zzYIe() throws Exception {
        this.zzY3y = this.zzY3w.length();
        com.aspose.words.internal.zzZNH.zzU(this.zzY3w, zzYI2());
        if (this.zzY3F == -1) {
            this.zzY3F = this.zzY3y;
        }
    }

    private void zzYIf() {
        if (this.zzY3A) {
            zzYIg();
            return;
        }
        if (isHeading()) {
            if (this.zzYtC.isInCell()) {
                zzTo(true);
                return;
            }
            if (zzZ9z()) {
                this.zzY3z = true;
            }
            if (this.zzY3z) {
                return;
            }
            zzYIh();
        }
    }

    private void zzYIg() {
        com.aspose.words.internal.zzZNH.zzZ(this.zzY3w, ControlChar.SPACE_CHAR, 4);
    }

    private void zzYIh() {
        com.aspose.words.internal.zzZNH.zzZ(this.zzY3w, '#', zzYI1());
        this.zzY3w.append(ControlChar.SPACE_CHAR);
    }

    private void zzYIi() throws Exception {
        if (this.zzYtC.isInCell()) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        if (zzYI8()) {
            for (int i = 0; i < zzYI2().length() - 1; i++) {
                this.zzY3w.setCharAt(this.zzY3y + i, ControlChar.SPACE_CHAR);
            }
        }
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), this.zzY3w);
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), zzZ1N.zzuY(zzYI0()), this.zzY45.getMaxLength());
    }

    private void zzYIj() {
        if (this.zzYtC.isInCell()) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), this.zzY3w);
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "~~~");
    }

    private void zzYIk() {
        if (this.zzYtC.isInCell()) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), this.zzY3w);
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), "~~~");
        if (zzYI3().length() > 0) {
            this.zzY4a.zzZeE().append(ControlChar.SPACE_CHAR);
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), zzYI3());
        com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
    }

    private void zzYIl() throws Exception {
        if (zzYIa() && this.zzY4a.zzYHF().getListExportMode() == 0) {
            updateListLabels();
            zzZ1V zzz1v = this.zzY3G;
            if (zzz1v != null && zzz1v.zzYIa()) {
                zzv2(this.zzY3G.zzY3F);
            }
            zzYIe();
        }
        zzYIf();
    }

    private void zzYIm() throws Exception {
        for (int i = 0; i < this.zzY45.getCount(); i++) {
            StringBuilder sbZzju = this.zzY45.zzju(i);
            zzC(sbZzju);
            if (zzV(sbZzju, i)) {
                if (zzYIv()) {
                    com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), getParagraphBreak());
                }
                com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), ControlChar.SPACE_CHAR, 4);
            }
            if (this.zzY3w.length() == 0 && sbZzju.length() > 0) {
                zzB(sbZzju);
            }
            com.aspose.words.internal.zzZNH.zzZ(this.zzY4a.zzZeE(), sbZzju);
            if (isHeading()) {
                if (this.zzYtC.isInCell()) {
                    zzTo(false);
                } else if (!this.zzY3z) {
                    zzYIc();
                }
            }
            if (i < this.zzY45.getCount() - 1) {
                com.aspose.words.internal.zzZNH.zzU(this.zzY4a.zzZeE(), this.zzYtC.isInCell() ? "<br>" : getParagraphBreak());
            }
            if (zzYI8() && i == zzYHX()) {
                for (int i2 = 0; i2 < zzYI2().length() - 1; i2++) {
                    this.zzY3w.setCharAt(this.zzY3y + i2, ControlChar.SPACE_CHAR);
                }
            }
        }
    }

    private boolean zzYIn() {
        return zzYI7() || this.zzY3A;
    }

    private boolean zzYIv() {
        return this.zzY3x != null;
    }

    private int zzZ0C() {
        if (this.zzYog == -1) {
            if (this.zzYtC.isListItem()) {
                this.zzYog = ((Integer) this.zzYtC.zzWm(EditingLanguage.GALICIAN, 0)).intValue();
            } else if (zzYIa()) {
                this.zzYog = this.zzY3G.zzZ0C();
            }
        }
        return this.zzYog;
    }

    private boolean zzZ9z() {
        if (this.zzY45.getCount() <= 2) {
            return this.zzY45.getCount() == 2 && !com.aspose.words.internal.zzZYD.zzS(this.zzY45.zzju(0));
        }
        return true;
    }

    private void zzra() throws Exception {
        ListLevel listLevelZzRB;
        List listZzY39;
        for (Style styleZzqy = this.zzYtC.zzqy(0); styleZzqy != null; styleZzqy = styleZzqy.zzY3j()) {
            byte bZzN = zzZ1N.zzN(styleZzqy);
            switch (bZzN) {
                case 16:
                    if (this.zzY3D == null) {
                        this.zzY3D = styleZzqy;
                    }
                    break;
                case 17:
                    this.zzY3z = true;
                    break;
                case 18:
                    this.zzY3w.append('>');
                    if (zzZ1N.zzN(styleZzqy.zzY3j()) != 18) {
                        this.zzY3w.append(ControlChar.SPACE_CHAR);
                    }
                    this.zzYcw++;
                    break;
                default:
                    switch (bZzN) {
                        case 24:
                            this.zzY3A = true;
                            break;
                        case 25:
                            this.zzY3C = styleZzqy;
                            break;
                        case 26:
                        case 27:
                            if (this.zzY4a.zzYHF().getListExportMode() != 1) {
                                if (zzYHY().size() == 0) {
                                    this.zzY3F = this.zzY3w.length();
                                }
                                String strZzR = zzR(styleZzqy.zzZYj());
                                com.aspose.words.internal.zzZNH.zzU(this.zzY3w, strZzR);
                                if (strZzR.length() > 0) {
                                    com.aspose.words.internal.zzZQG.zzZ(zzYHY(), strZzR);
                                }
                                if (this.zzYXS == 0 && (listZzY39 = styleZzqy.zzY39()) != null) {
                                    this.zzYXS = listZzY39.getListLevels().get(((Integer) styleZzqy.fetchParaAttr(EditingLanguage.GALICIAN)).intValue()).getStartAt();
                                }
                            }
                            break;
                    }
                    break;
            }
        }
        if (this.zzYtC.zzYoS() > 0) {
            this.zzYcw = this.zzYtC.zzYoS() - 1;
            this.zzY3w.insert(0, com.aspose.words.internal.zzZKN.zzS('>', this.zzYtC.zzYoS()) + ControlChar.SPACE_CHAR);
        }
        if (this.zzY4a.zzYHF().getListExportMode() == 0) {
            if (this.zzYXS == 0 && (listLevelZzRB = this.zzYtC.zzRB(false)) != null) {
                this.zzYXS = listLevelZzRB.getStartAt();
            }
            updateListLabels();
        }
        this.zzY3x = this.zzY4a.zzYHD().zzZ1W();
    }

    private void zzv2(int i) throws Exception {
        zzYIa();
        int iZzYId = zzYId();
        if (iZzYId <= 0) {
            return;
        }
        this.zzY3F = i;
        for (int i2 = 0; i2 < iZzYId; i2++) {
            if (zzYI4()[i2] != null) {
                com.aspose.words.internal.zzZYD.zzXh(zzYI4()[i2]);
            }
            String str = this.zzYtC.isInCell() ? "&emsp;" : zzYI4()[i2];
            this.zzY3w.insert(this.zzY3F, str);
            this.zzY3y = str.length() + this.zzY3y;
        }
    }

    public final void zzIg() throws Exception {
        if (this.zzY45.getCount() == 0) {
            com.aspose.words.internal.zzZNH.zzU(this.zzY45.zzXUQ(), "");
        }
        zzYIl();
        if (zzYI7()) {
            zzYIk();
        }
        zzYIm();
        if (zzYI7()) {
            zzYIj();
        }
        if (this.zzY3z) {
            zzYIi();
        }
    }

    public final void zzQ(Run run) {
        zzR(run);
        if (run != null) {
            String strZzr = zzY4E.zzr(run);
            if (zzYI6() && run.zz9I() && com.aspose.words.internal.zzZKN.equals(strZzr, this.zzY4a.zzYHD().zzZ1W().getReferenceMark())) {
                return;
            }
            zzi(strZzr, true);
        }
    }

    public final boolean zzYIo() {
        for (Run run : this.zzYtC.getRuns()) {
            if (run.zzZYh().getVerticalAlignment() != 0 && (run.zzZYh().zzYe1().toBool() || run.zzZYh().zzYe0().toBool() || run.zzZYh().zzYdZ().toBool())) {
                return true;
            }
        }
        return false;
    }

    public final void zzi(String str, boolean z) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (str.charAt(0) == '`' && this.zzY41.zzYIE()) {
                this.zzY45.zzXUQ().append(ControlChar.SPACE_CHAR);
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == 11) {
                    this.zzY45.newLine();
                } else if (cCharAt != '\f') {
                    if (cCharAt != '.') {
                        if (!com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                            if (this.zzY45.zzXUQ().length() > 0 && com.aspose.words.internal.zzZYD.zzS(this.zzY45.zzXUQ()) && (!zzYIv() || this.zzY45.zzXUQ().length() > 1)) {
                                zzYIb();
                            }
                            this.zzY41.zzYIK();
                            if (z && !zzYIn() && !this.zzY41.zzYID() && !this.zzY4a.zzYHC() && zzZ1N.zzYy(cCharAt)) {
                                this.zzY45.zzXUQ().append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            }
                        }
                        this.zzY45.zzXUQ().append(com.aspose.words.internal.zzJF.zzF(cCharAt));
                    } else {
                        if (z) {
                            if (zzIy(((Object) this.zzY45.zzXUQ()) + ".") == 27 && !this.zzYtC.isListItem()) {
                                this.zzY45.zzXUQ().append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            }
                        }
                        this.zzY41.zzYIK();
                        this.zzY45.zzXUQ().append(FilenameUtils.EXTENSION_SEPARATOR);
                    }
                } else if (this.zzY4a.zzYHF().getForcePageBreaks()) {
                    com.aspose.words.internal.zzZNH.zzU(this.zzY45.zzXUQ(), ControlChar.PAGE_BREAK);
                }
            }
        }
    }

    public final void zzR(zzZAM zzzam) {
        if (this.zzY3A || zzYI7()) {
            return;
        }
        this.zzY41.zzR(zzzam);
    }
}
