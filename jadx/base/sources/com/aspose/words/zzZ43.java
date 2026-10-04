package com.aspose.words;

import com.aspose.words.internal.zzD4;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ43 {
    private ListCollection zzYSl;
    private boolean zzYbz = zzYNK();
    private zzYDZ zzZFZ;
    private IWarningCallback zzZG0;

    public zzZ43(ListCollection listCollection, zzYDZ zzydz, IWarningCallback iWarningCallback) {
        this.zzYSl = listCollection;
        this.zzZFZ = zzydz;
        this.zzZG0 = iWarningCallback;
    }

    private void zz2(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 65536, 17, str);
        }
    }

    private static boolean zzJ3(String str) {
        return str.length() > 0 && str.charAt(0) < '\n';
    }

    private void zzS(zzYMX zzymx) {
        if (zzymx.getListId() == 0) {
            return;
        }
        zzymx.zzxC(this.zzYSl.zzxl(zzymx.getListId()));
    }

    private boolean zzYNK() {
        if (this.zzYSl.getCount() == 0) {
            return false;
        }
        zzD4.zzZ zzzZzCP = this.zzYSl.zzYOY().zzCP();
        while (zzzZzCP.moveNext()) {
            if (zzzZzCP.zzCM() != zzzZzCP.zzCL()) {
                return true;
            }
        }
        int i = this.zzYSl.zzYOY().get(1);
        if (com.aspose.words.internal.zzD4.zzWm(i)) {
            throw new IllegalStateException();
        }
        return i != 1;
    }

    private boolean zzYNL() {
        if (this.zzYSl.zzYP1() == 0) {
            return true;
        }
        int iZzYP8 = Integer.MIN_VALUE;
        for (int i = 0; i < this.zzYSl.zzYOX().size(); i++) {
            zzZ4J zzz4j = this.zzYSl.zzYOX().get(i);
            if (zzz4j.zzYP8() <= iZzYP8) {
                return false;
            }
            iZzYP8 = zzz4j.zzYP8();
        }
        return true;
    }

    private boolean zzYNM() {
        int saveFormat = this.zzZFZ.zzXpa.getSaveFormat();
        return ((this.zzZFZ.zzYda() && zzZtY() == 0) || saveFormat == 10 || saveFormat == 11 || saveFormat == 31 || saveFormat == 30) ? false : true;
    }

    private void zzYNN() throws Exception {
        for (int i = 0; i < this.zzYSl.zzYP0(); i++) {
            this.zzYSl.zzxn(i).zzQW(false);
        }
    }

    private void zzYNO() {
        for (zzZ4J zzz4j : (zzZ4J[]) this.zzYSl.zzYOX().toArray(new zzZ4J[0])) {
            for (ListLevel listLevel : zzz4j.zzYOP()) {
                if (listLevel.getNumberStyle() == 23 && zzJ3(listLevel.getNumberFormat())) {
                    listLevel.setNumberFormat("");
                }
                if (listLevel.getNumberStyle() == 65280 && !zzYNM()) {
                    zz2(com.aspose.words.internal.zzZKN.format("The number style {0} is not supported by the {1} file format.", Integer.valueOf(listLevel.getNumberStyle()), Integer.valueOf(this.zzZFZ.zzXpa.getSaveFormat())));
                    listLevel.setNumberStyle(0);
                }
            }
            Style style = zzz4j.getStyle();
            if (style != null && style.getList() != null && style.getList().zzYPa() != null && style.getList().zzYPa().getStyle() == null) {
                zzz4j.zzxh(12);
            }
        }
    }

    private void zzYNP() {
        if (zzZn5() && zzZtY() == 0) {
            return;
        }
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        for (List list : this.zzYSl) {
            int iZzZZS = list.zzZZS();
            if (iZzZZS != 0) {
                zzYO3.zzY(this.zzZFZ.zzYfy, 16);
                if (zzim.contains(Integer.valueOf(iZzZZS))) {
                    list.zzNb(0);
                } else {
                    zzim.add(Integer.valueOf(iZzZZS));
                }
            }
        }
    }

    private boolean zzZn5() {
        OoxmlSaveOptions ooxmlSaveOptions = (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(this.zzZFZ.zzXpa, OoxmlSaveOptions.class);
        return ooxmlSaveOptions != null && ooxmlSaveOptions.zzYqW();
    }

    private int zzZtY() {
        return zzYO3.zzZ(this.zzZFZ.zzYfy.zzZqn(), (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(this.zzZFZ.zzXpa, OoxmlSaveOptions.class));
    }

    public final void zzZw(Paragraph paragraph) {
        if (!paragraph.zzYoU()) {
            paragraph.zzYoT();
        }
        if (this.zzYbz) {
            zzS(paragraph.zzZYj());
            if (paragraph.zzZYj().zz6D()) {
                zzS((zzYMX) paragraph.zzZYj().zzYsN().zzZ6C());
            }
        }
    }

    public final void zzbQ() throws Exception {
        if (this.zzYbz) {
            Iterator<Style> it = this.zzYSl.getDocument().getStyles().iterator();
            while (it.hasNext()) {
                zzS(it.next().zzZYj());
            }
            this.zzYSl.zzYOW();
        }
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        int i = 0;
        while (i < this.zzYSl.zzYOX().size()) {
            zzZ4J zzz4j = this.zzYSl.zzYOX().get(i);
            if (zzd3.get(zzz4j.zzYP8()) != null) {
                zz2("Non-unique list definition removed.");
                this.zzYSl.zzYOX().remove(i);
            } else {
                zzd3.add(zzz4j.zzYP8(), zzz4j);
                i++;
            }
        }
        zzYNO();
        if (!zzYNL()) {
            Collections.sort(this.zzYSl.zzYOX());
        }
        zzYNN();
        zzYNP();
    }
}
