package com.aspose.words;

import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class LayoutEnumerator {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Font.Name", "Font.Size", "Font.SizeBi", "Font.Color", "Font.Bold", "Font.Italic", "Font.StrikeThrough", "Font.DoubleStrikeThrough", "Font.Underline", "Font.UnderlineColor", "Font.Border", "Font.Emboss", "Font.Engrave", "Font.Outline", "Font.Shadow", "Font.Bidi");
    private zzYMD zzYgm;
    private Document zzZEY;

    public LayoutEnumerator(Document document) throws Exception {
        if (document == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: document");
        }
        this.zzZEY = document;
        reset();
    }

    private static String zzF(zzYMD zzymd) throws Exception {
        if (!(zzymd instanceof zzYAU)) {
            return ((zzymd instanceof zzZKY) || (zzymd instanceof zzYVM) || (zzymd instanceof zzYVR)) ? zzY98.zzAU(zzymd.zzaa().getStoryType()) : "";
        }
        if (zzymd instanceof zzY9S) {
            return "TEXT";
        }
        if (zzymd instanceof zzY9W) {
            return "SPACES";
        }
        if (zzymd instanceof zzYAS) {
            int iZzZo6 = ((zzYAU) zzymd).zzZo6();
            if (iZzZo6 == 10528) {
                return "PAGE";
            }
            if (iZzZo6 == 21577) {
                return "CELL";
            }
            if (iZzZo6 == 21586 || iZzZo6 == 21595) {
                return "ROW";
            }
            if (iZzZo6 == 21639) {
                return "PARAGRAPH";
            }
            if (iZzZo6 == 21779) {
                return "COLUMN";
            }
            if (iZzZo6 == 21788) {
                return "PAGE";
            }
            if (iZzZo6 == 21513) {
                return "WRAP";
            }
            if (iZzZo6 == 21514) {
                return "LINE";
            }
            if (iZzZo6 == 21536 || iZzZo6 == 21537) {
                return "PARAGRAPH";
            }
            switch (iZzZo6) {
                case 21857:
                case 21858:
                case 21859:
                case 21860:
                case 21861:
                    return "SECTION";
            }
        }
        if (zzymd instanceof zzY9X) {
            return "SHAPE";
        }
        if (zzymd instanceof zzY9T) {
            return "TABABSOLUTE";
        }
        if (zzymd instanceof zzY9U) {
            return "TAB";
        }
        if (zzymd instanceof zzY9V) {
            return "SYMBOL";
        }
        if (zzymd instanceof zzYAT) {
            return zzZ(zzymd, "BOOKMARK", "START", "END", "");
        }
        String str = "COMMENT";
        if (zzymd instanceof zzYAQ) {
            return zzZ(zzymd, "COMMENT", "START", "END", "REFERENCE");
        }
        if (zzymd instanceof zzYAH) {
            return zzZ(zzymd, "FIELD", "START", "END", "SEPARATOR");
        }
        if (zzymd instanceof zzYAD) {
            return com.aspose.words.internal.zzZKN.format("{0}REFERENCE", ((zzYAU) zzymd).zzY7n() == 2 ? "FOOTNOTE" : "ENDNOTE");
        }
        if (!(zzymd instanceof zzY9Z)) {
            if (zzymd instanceof zzYAC) {
                return com.aspose.words.internal.zzZKN.format("FORMFIELD{0}", zzZML.zzAU(((zzYAL) zzymd).zzYRH()));
            }
            if (!(zzymd instanceof zzY9Y)) {
                return zzymd instanceof zzYA1 ? "SEPARATOR" : zzymd instanceof zzYA2 ? "CONTINUATION" : "";
            }
            int iZzYRH = ((zzYAL) zzymd).zzYRH();
            return com.aspose.words.internal.zzZKN.format("SDT{0}", iZzYRH == 255 ? "OTHER" : zzZML.zzAU(iZzYRH));
        }
        int iZzY7n = ((zzYAU) zzymd).zzY7n();
        if (iZzY7n == 2) {
            str = "FOOTNOTE";
        } else if (iZzY7n == 3) {
            str = "ENDNOTE";
        } else if (iZzY7n != 4) {
            throw new IllegalArgumentException();
        }
        return com.aspose.words.internal.zzZKN.format("{0}BACKREFERENCE", str);
    }

    private ArrayList<zzUN> zzYTA() {
        zzYN8 zzyn8ZzZ8m = this.zzYgm.zzZ8m();
        if (zzyn8ZzZ8m == null || !zzyn8ZzZ8m.zzab().zzZoW().containsKey(zzyn8ZzZ8m)) {
            return null;
        }
        return zzyn8ZzZ8m.zzab().zzZoW().get(zzyn8ZzZ8m);
    }

    private com.aspose.words.internal.zzZQ4 zzYTB() throws Exception {
        zzYMD zzymd = this.zzYgm;
        long jZzF = com.aspose.words.internal.zzSA.zzF(zzymd instanceof zzY9X ? zzymd.zzYqr() : zzYMD.zzZ(zzymd, 1, true, true));
        zzYMD zzymd2 = this.zzYgm;
        if ((zzymd2 instanceof zzWT) && zzymd2.getHeight() == 1073741823) {
            this.zzYgm.setHeight(Integer.MIN_VALUE);
        }
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) jZzF), com.aspose.words.internal.zzZPY.zzYC(jZzF), this.zzYgm.getWidth() / 1000.0f, this.zzYgm.getHeight() / 1000.0f);
    }

    private zzYMD zzYTu() throws Exception {
        zzY9X zzy9x;
        zzYBY zzybyZzQJ;
        int iZz60 = this.zzYgm.zz60();
        if (iZz60 == 1) {
            zzYN8 zzyn8ZzZ8m = this.zzYgm.zzZ8m();
            zzYMD zzymdZzYTw = zzYTw();
            if (zzymdZzYTw != null) {
                return zzymdZzYTw;
            }
            if (zzyn8ZzZ8m.zzYqp() != null) {
                return zzyn8ZzZ8m.zzYqp();
            }
            if (zzyn8ZzZ8m.zzYqq() != null) {
                return zzyn8ZzZ8m.zzYqq();
            }
            return null;
        }
        if (iZz60 != 2) {
            if (iZz60 != 64 || (zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(this.zzYgm, zzY9X.class)) == null || (zzybyZzQJ = zzy9x.zzQJ(false)) == null || zzybyZzQJ.zz6x() == null) {
                return null;
            }
            return zzybyZzQJ.zz6x();
        }
        zzUZ zzuz = (zzUZ) this.zzYgm;
        if (zzuz.zz08() != null) {
            return (zzuz.zz08().zzYzs() == null || !zzuz.zz08().zzYzs().isVisible()) ? zzuz.zz08() : zzuz.zz08().zzYzs();
        }
        if (zzuz.zz09() != null) {
            return (zzuz.zz09().zzYzs() == null || !zzuz.zz09().zzYzs().isVisible()) ? zzuz.zz09() : zzuz.zz09().zzYzs();
        }
        return null;
    }

    private zzYMD zzYTv() throws Exception {
        zzY9X zzy9x;
        zzYBY zzybyZzQJ;
        int iZz60 = this.zzYgm.zz60();
        if (iZz60 == 1) {
            zzYN8 zzyn8ZzZ8m = this.zzYgm.zzZ8m();
            if (zzyn8ZzZ8m.zzYqq() != null) {
                return zzyn8ZzZ8m.zzYqq();
            }
            if (zzyn8ZzZ8m.zzYqp() != null) {
                return zzyn8ZzZ8m.zzYqp();
            }
            zzYMD zzymdZzYTx = zzYTx();
            if (zzymdZzYTx != null) {
                return zzymdZzYTx;
            }
            return null;
        }
        if (iZz60 != 2) {
            if (iZz60 != 64 || (zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(this.zzYgm, zzY9X.class)) == null || (zzybyZzQJ = zzy9x.zzQJ(false)) == null || zzybyZzQJ.zz6x() == null) {
                return null;
            }
            return zzybyZzQJ.zz6x();
        }
        zzUZ zzuz = (zzUZ) this.zzYgm;
        if (zzuz.zz09() != null) {
            return zzuz.zz09().zzYzt();
        }
        if (zzuz.zz08() != null) {
            return zzuz.zz08().zzYzt();
        }
        return null;
    }

    private zzYMD zzYTw() {
        ArrayList<zzUN> arrayListZzYTA = zzYTA();
        if (arrayListZzYTA == null) {
            return null;
        }
        int size = arrayListZzYTA.size() - 1;
        if (this.zzYgm.zz60() == 4096) {
            while (true) {
                if (size < 0) {
                    break;
                }
                int i = size - 1;
                if (arrayListZzYTA.get(size) == this.zzYgm) {
                    size = i;
                    break;
                }
                size = i;
            }
        }
        if (size < 0) {
            return null;
        }
        return arrayListZzYTA.get(size);
    }

    private zzYMD zzYTx() {
        ArrayList<zzUN> arrayListZzYTA = zzYTA();
        if (arrayListZzYTA == null) {
            return null;
        }
        int i = 0;
        if (this.zzYgm.zz60() == 4096) {
            while (true) {
                if (i >= arrayListZzYTA.size()) {
                    break;
                }
                int i2 = i + 1;
                if (arrayListZzYTA.get(i) == this.zzYgm) {
                    i = i2;
                    break;
                }
                i = i2;
            }
        }
        if (i >= arrayListZzYTA.size()) {
            return null;
        }
        return arrayListZzYTA.get(i);
    }

    private zzYMD zzYTy() throws Exception {
        int iZz60 = this.zzYgm.zz60();
        if (iZz60 == 1) {
            if (this.zzYgm.zzYo0() != null) {
                return this.zzYgm.zzYo0();
            }
            return null;
        }
        if (iZz60 == 256 || iZz60 == 512) {
            return ((zzYVR) this.zzYgm).zzYzt();
        }
        if (iZz60 == 1024) {
            zzYN8 zzyn8ZzZ8m = this.zzYgm.zzZ8m();
            if (this.zzYgm == zzyn8ZzZ8m.zzYqp() && zzyn8ZzZ8m.zzYqq() != null) {
                return zzyn8ZzZ8m.zzYqq();
            }
            if (((zzUZ) zzyn8ZzZ8m.zz6w()) != null) {
                return (zzUZ) zzyn8ZzZ8m.zz6w();
            }
            return null;
        }
        if (iZz60 == 4096) {
            zzYMD zzymdZzYTw = zzYTw();
            if (zzymdZzYTw != null) {
                return zzymdZzYTw;
            }
            zzYN8 zzyn8ZzZ8m2 = this.zzYgm.zzZ8m();
            if (zzyn8ZzZ8m2.zzYqp() != null) {
                return zzyn8ZzZ8m2.zzYqp();
            }
            if (zzyn8ZzZ8m2.zzYqq() != null) {
                return zzyn8ZzZ8m2.zzYqq();
            }
            if (((zzUZ) zzyn8ZzZ8m2.zz6w()) != null) {
                return (zzUZ) zzyn8ZzZ8m2.zz6w();
            }
            return null;
        }
        if (iZz60 != 8192) {
            return null;
        }
        zzUZ zzuz = (zzUZ) this.zzYgm.zzZZJ().zzZZJ();
        zzYVR zzyvr = (zzYVR) this.zzYgm.zzZZJ();
        if (zzyvr.zzYzs() != null && zzyvr.zzYzs() == this.zzYgm) {
            return zzyvr;
        }
        if ((zzyvr instanceof zzZUE) && zzuz.zz09() != null) {
            return (zzuz.zz09().zzYzs() == null || !zzuz.zz09().zzYzs().isVisible()) ? zzuz.zz09() : zzuz.zz09().zzYzs();
        }
        if (zzuz.zz6w() != null) {
            return zzuz.zz6w();
        }
        return null;
    }

    private zzYMD zzYTz() throws Exception {
        int iZz60 = this.zzYgm.zz60();
        if (iZz60 != 1) {
            if (iZz60 == 2) {
                zzYN8 zzyn8ZzZ8m = this.zzYgm.zzZ8m();
                if (zzyn8ZzZ8m.zzYqq() != null) {
                    return zzyn8ZzZ8m.zzYqq();
                }
                if (zzyn8ZzZ8m.zzYqp() != null) {
                    return zzyn8ZzZ8m.zzYqp();
                }
                zzYMD zzymdZzYTx = zzYTx();
                if (zzymdZzYTx != null) {
                    return zzymdZzYTx;
                }
            } else if (iZz60 == 256) {
                zzUZ zzuz = (zzUZ) this.zzYgm.zzZZJ();
                zzYVR zzyvr = (zzYVR) this.zzYgm;
                if (zzyvr.zzYzs() != null && zzyvr.zzYzs().isVisible()) {
                    return zzyvr.zzYzs();
                }
                if (zzuz.zz08() != null) {
                    return zzuz.zz08().zzYzt();
                }
            } else if (iZz60 == 512) {
                zzYVR zzyvr2 = (zzYVR) this.zzYgm;
                if (zzyvr2.zzYzs() != null && zzyvr2.zzYzs().isVisible()) {
                    return zzyvr2.zzYzs();
                }
            } else if (iZz60 == 1024) {
                zzYN8 zzyn8ZzZ8m2 = this.zzYgm.zzZ8m();
                if (zzyn8ZzZ8m2.zzYqq() == this.zzYgm && zzyn8ZzZ8m2.zzYqp() != null) {
                    return zzyn8ZzZ8m2.zzYqp();
                }
                zzYMD zzymdZzYTx2 = zzYTx();
                if (zzymdZzYTx2 != null) {
                    return zzymdZzYTx2;
                }
            } else if (iZz60 == 4096) {
                zzYMD zzymdZzYTx3 = zzYTx();
                if (zzymdZzYTx3 != null) {
                    return zzymdZzYTx3;
                }
            } else if (iZz60 == 8192) {
                zzYVR zzyvr3 = (zzYVR) this.zzYgm.zzZZJ();
                if (zzyvr3.zzYzs() == null || zzyvr3.zzYzs() != this.zzYgm) {
                    return this.zzYgm.zzZZJ();
                }
            }
        } else if (this.zzYgm.zzYo1() != null) {
            return this.zzYgm.zzYo1();
        }
        if (this.zzYgm.zzZZJ() == null || this.zzYgm.zzZZJ().zz60() != 2) {
            return null;
        }
        zzYMD zzymdZz6w = this.zzYgm.zzZZJ().zz6w();
        zzYMD zzymd = this.zzYgm;
        if (zzymdZz6w != zzymd) {
            return null;
        }
        zzUZ zzuz2 = (zzUZ) zzymd.zzZZJ();
        if (zzuz2.zz09() != null) {
            return zzuz2.zz09().zzYzt();
        }
        if (zzuz2.zz08() != null) {
            return zzuz2.zz08().zzYzt();
        }
        return null;
    }

    private static String zzZ(zzYMD zzymd, String str, String str2, String str3, String str4) {
        int iZzZ1s = ((zzYA3) zzymd).zzZ1s();
        if (iZzZ1s == 1) {
            str2 = str4;
        } else if (iZzZ1s != 2) {
            str2 = iZzZ1s != 3 ? "" : str3;
        }
        return com.aspose.words.internal.zzZKN.format("{0}{1}", str, str2).toUpperCase();
    }

    private zzZYW zzZoz() throws Exception {
        return this.zzZEY.zzWA(true).zzZoz();
    }

    public Object get(String str) {
        zzYMD zzymd = this.zzYgm;
        zzZ32 zzz32ZzY6N = zzymd instanceof zzYAU ? ((zzYAU) zzymd).zzY6N() : null;
        if (zzz32ZzY6N != null && str != null) {
            switch (zzUR.zzTP(str)) {
                case 0:
                    return zzz32ZzY6N.getName();
                case 1:
                    return Float.valueOf(zzz32ZzY6N.getSize() / 1000.0f);
                case 2:
                    return Float.valueOf(zzz32ZzY6N.zzYL6() / 1000.0f);
                case 3:
                    return Integer.valueOf(zzz32ZzY6N.zzZy().zzPG());
                case 4:
                    return Boolean.valueOf(zzz32ZzY6N.isBold());
                case 5:
                    return Boolean.valueOf(zzz32ZzY6N.isItalic());
                case 6:
                    return Boolean.valueOf(zzz32ZzY6N.zzYKW() == 1);
                case 7:
                    return Boolean.valueOf(zzz32ZzY6N.zzYKW() == 2);
                case 8:
                    return Integer.valueOf(zzz32ZzY6N.getUnderline());
                case 9:
                    return Integer.valueOf(zzz32ZzY6N.zzZUc().zzPG());
                case 10:
                    return new Border(zzz32ZzY6N.zzYKO().getLineStyle(), (int) (zzz32ZzY6N.zzYKO().zzu4() / 8.0f), zzz32ZzY6N.zzYKO().zzZy());
                case 11:
                    return Boolean.valueOf(zzz32ZzY6N.zzYKX() == 1);
                case 12:
                    return Boolean.valueOf(zzz32ZzY6N.zzYKX() == 2);
                case 13:
                    return Boolean.valueOf(zzz32ZzY6N.zzYKX() == 4 || zzz32ZzY6N.zzYKX() == 12);
                case 14:
                    return Boolean.valueOf(zzz32ZzY6N.zzYKX() == 8 || zzz32ZzY6N.zzYKX() == 12);
                case 15:
                    return Boolean.valueOf(zzz32ZzY6N.zzZz());
            }
        }
        return null;
    }

    public Object getCurrent() {
        return this.zzYgm;
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public String getKind() throws Exception {
        return zzF(this.zzYgm);
    }

    public int getPageIndex() {
        return this.zzYgm.zzZ8m().getIndex() + 1;
    }

    public RectF getRectangle() throws Exception {
        return com.aspose.words.internal.zzZQ4.zz8(zzYTB());
    }

    public String getText() throws Exception {
        zzYAU zzyau = (zzYAU) com.aspose.words.internal.zzZKW.zzZ(this.zzYgm, zzYAU.class);
        if (zzyau != null) {
            return zzyau.getText();
        }
        throw new IllegalStateException("This property is only available for LayoutEntityType.Span entities.");
    }

    public int getType() {
        return this.zzYgm.zz60();
    }

    public boolean moveFirstChild() throws Exception {
        zzYMD zzymd = this.zzYgm;
        zzYMD zzymdZz6x = zzymd instanceof zzTF ? ((zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzTF.class)).zz6x() : null;
        if (zzymdZz6x == null) {
            zzymdZz6x = zzYTv();
        }
        if (zzymdZz6x == null) {
            return false;
        }
        this.zzYgm = zzymdZz6x;
        return true;
    }

    public boolean moveLastChild() throws Exception {
        zzYMD zzymdZzYTu = zzYTu();
        if (zzymdZzYTu == null) {
            zzYMD zzymd = this.zzYgm;
            if (zzymd instanceof zzTF) {
                zzymdZzYTu = ((zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzTF.class)).zz6w();
            }
        }
        if (zzymdZzYTu == null) {
            return false;
        }
        this.zzYgm = zzymdZzYTu;
        return true;
    }

    public boolean moveNext() throws Exception {
        zzYMD zzymdZz5Z = this.zzYgm.zz5Z();
        if (zzymdZz5Z == null) {
            zzymdZz5Z = zzYTz();
        }
        if (zzymdZz5Z == null) {
            return false;
        }
        this.zzYgm = zzymdZz5Z;
        return true;
    }

    public boolean moveNextLogical() {
        if (this.zzYgm.zzYo1() == null) {
            return false;
        }
        this.zzYgm = this.zzYgm.zzYo1();
        return true;
    }

    public boolean moveParent() {
        return moveParent(0);
    }

    public boolean movePrevious() throws Exception {
        zzYMD zzymdZz5Y = this.zzYgm.zz5Y();
        if (zzymdZz5Y == null) {
            zzymdZz5Y = zzYTy();
        }
        if (zzymdZz5Y == null) {
            return false;
        }
        this.zzYgm = zzymdZz5Y;
        return true;
    }

    public boolean movePreviousLogical() {
        if (this.zzYgm.zzYo0() == null) {
            return false;
        }
        this.zzYgm = this.zzYgm.zzYo0();
        return true;
    }

    public void reset() throws Exception {
        zzYMD zzymdZz6x = zzZoz().zzZp0().zz6x();
        this.zzYgm = zzymdZz6x;
        if (zzymdZz6x == null) {
            throw new IllegalStateException("Page layout model of the document has no pages.");
        }
    }

    public void setCurrent(Object obj) throws Exception {
        if (obj == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (!(obj instanceof zzYMD)) {
            throw new IllegalArgumentException("Value is not a valid position in the page layout model.");
        }
        zzYMD zzymd = (zzYMD) obj;
        if (zzymd.zzab() != zzZoz()) {
            throw new IllegalArgumentException("Position doesn't belong to the document being enumerated.");
        }
        this.zzYgm = zzymd;
    }

    public boolean moveParent(int i) {
        zzYMD zzymdZzZZJ = this.zzYgm.zzZZJ();
        if (zzymdZzZZJ == null) {
            zzYC4 zzyc4 = (zzYC4) com.aspose.words.internal.zzZKW.zzZ(this.zzYgm, zzYC4.class);
            if (zzyc4 == null || zzyc4.zzY8N() == null) {
                return false;
            }
            zzymdZzZZJ = zzyc4.zzY8N();
        }
        if (i != 0 && (zzymdZzZZJ = zzymdZzZZJ.zzqh(i)) == null) {
            return false;
        }
        zzYMD zzymd = this.zzYgm;
        if (zzymd instanceof zzYVM) {
            this.zzYgm = zzymd.zzqh(2);
            return true;
        }
        this.zzYgm = zzymdZzZZJ;
        return true;
    }
}
