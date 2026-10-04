package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4G {
    private Paragraph zzX1f;
    private StringBuilder zzX1g = new StringBuilder();
    private int zzX1h;
    private int zzX1i;
    private zzY4T zzX1j;
    private TxtSaveOptionsBase zzX1k;
    private zzY4G zzX1l;
    private int zzX1m;
    private double zzX1n;
    private int zzX1o;
    private int zzXrL;
    private Cell zzZAc;

    public zzY4G(Table table, zzY4G zzy4g, TxtSaveOptionsBase txtSaveOptionsBase) {
        this.zzX1n = zzX(zzZR(table));
        this.zzX1m = (int) (Math.max(table.getLeftIndent(), 0.0d) / this.zzX1n);
        this.zzX1l = zzy4g;
        this.zzX1k = txtSaveOptionsBase;
        if (zzy4g != null) {
            this.zzX1i = zzXUt().zzXUP();
            this.zzX1h = zzXUt().zzXUP();
        }
        this.zzX1o = 0;
    }

    private void zzA5(String str) {
        int i = 0;
        while (i < str.length()) {
            int iZzYV = zzYV(str, i) + i;
            zzA6(str.substring(i, iZzYV));
            if (iZzYV < str.length()) {
                zzXUt().newLine();
            }
            i = iZzYV;
        }
    }

    private void zzA6(String str) {
        if (str.length() == 0) {
            return;
        }
        if (zzXUs() < 0) {
            com.aspose.words.internal.zzZNH.zzZ(this.zzX1j.zzXUQ(), ControlChar.SPACE_CHAR, -zzXUs());
        }
        com.aspose.words.internal.zzZNH.zzU(zzXUt().zzXUQ(), zzYW(str, this.zzX1f.zzZYj().getAlignment()));
    }

    private static double zzX(HashMap<Double, Long> map) {
        if (map.size() == 0) {
            return 8.0d;
        }
        double dDoubleValue = 0.0d;
        long jLongValue = 0;
        for (Map.Entry<Double, Long> entry : map.entrySet()) {
            jLongValue += entry.getValue().longValue();
            dDoubleValue += entry.getKey().doubleValue() * entry.getValue().longValue();
        }
        return ((dDoubleValue * 0.6d) / jLongValue) / 3.5d;
    }

    private int zzXUo() {
        zzY4G zzy4g = this.zzX1l;
        if (zzy4g != null) {
            return zzy4g.zzXUp();
        }
        return 0;
    }

    private int zzXUp() {
        return zzXUo() + this.zzXrL;
    }

    private int zzXUq() {
        return zzXUv() - zzXUr();
    }

    private int zzXUr() {
        return Math.max(zzXUs(), 0);
    }

    private int zzXUs() {
        return zzXUt().zzXUQ().length() - zzXUp();
    }

    private int zzXUu() {
        zzWP zzwpZz6G = this.zzZAc.zz6G();
        if (zzwpZz6G.getHorizontalMerge() == 0) {
            return zzwpZz6G.getWidth();
        }
        int width = zzwpZz6G.getWidth();
        Cell nextCell = this.zzZAc;
        while (true) {
            nextCell = nextCell.getNextCell();
            if (nextCell == null || nextCell.zz6G().getHorizontalMerge() != 2) {
                break;
            }
            width += nextCell.zz6G().getWidth();
        }
        return width;
    }

    private int zzXUv() {
        if (this.zzZAc == null) {
            return 0;
        }
        return Math.max((int) ((((double) zzXUu()) / 20.0d) / this.zzX1n), 1);
    }

    private boolean zzXUw() {
        return this.zzZAc.zz6G().zz5B();
    }

    private void zzXUx() {
        this.zzX1h = Math.max(this.zzX1h, this.zzX1o);
        this.zzX1o = 0;
    }

    private int zzYV(String str, int i) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        while (zzXUq() <= 0) {
            zzXUt().zzjv(zzXUt().zzXUP() + 1);
        }
        int iMin = Math.min(str.length() - i, zzXUq());
        boolean z = !com.aspose.words.internal.zzZKU.zzG(str.charAt(i));
        int i2 = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            int i4 = i + i3;
            if (!com.aspose.words.internal.zzZKU.zzG(str.charAt(i4))) {
                z = true;
            } else if (z) {
                z = false;
                i2 = i4;
            }
        }
        return i2 == 0 ? iMin : i2 - i;
    }

    private String zzYW(String str, int i) {
        if (i != 1) {
            return i != 2 ? str : com.aspose.words.internal.zzZKN.zzm(str, zzXUq());
        }
        return com.aspose.words.internal.zzZKN.zzm(str, str.length() + ((zzXUq() - str.length()) / 2));
    }

    private void zzYZQ() {
        if (this.zzX1g.length() <= zzXUq()) {
            zzA6(this.zzX1g.toString());
        } else {
            zzA5(this.zzX1g.toString());
        }
        zzXUt().newLine();
        this.zzX1g.setLength(0);
    }

    private static HashMap<Double, Long> zzZR(Table table) {
        HashMap<Double, Long> map = new HashMap<>();
        for (Run run : table.getChildNodes(21, true)) {
            if (map.containsKey(Double.valueOf(run.zzZYh().getSize()))) {
                map.put(Double.valueOf(run.zzZYh().getSize()), Long.valueOf(map.get(Double.valueOf(run.zzZYh().getSize())).longValue() + ((long) run.getText().length())));
            } else {
                com.aspose.words.internal.zzZQF.zzY(map, Double.valueOf(run.zzZYh().getSize()), Long.valueOf(run.getText().length()));
            }
        }
        return map;
    }

    public final void zzID(String str) {
        if (com.aspose.words.internal.zzZKN.equals(str, this.zzX1k.getParagraphBreak())) {
            zzYZQ();
        } else {
            com.aspose.words.internal.zzZNH.zzU(this.zzX1g, str);
        }
    }

    public final zzY4T zzXUt() {
        if (this.zzX1j == null) {
            zzY4G zzy4g = this.zzX1l;
            this.zzX1j = zzy4g != null ? zzy4g.zzXUt() : new zzY4T();
        }
        return this.zzX1j;
    }

    public final void zzXV(Paragraph paragraph) {
        this.zzX1f = paragraph;
        this.zzX1g.setLength(0);
    }

    public final void zzXZT() {
        if (zzXUw()) {
            return;
        }
        this.zzXrL += zzXUv();
        this.zzX1h = Math.max(this.zzX1h, zzXUt().zzXUP());
        if (this.zzX1o > 0) {
            zzXUx();
        }
    }

    public final void zzY25() {
        this.zzZAc = null;
        this.zzXrL = this.zzX1m;
    }

    public final void zzYNh() {
        int i = this.zzX1h;
        this.zzX1i = i;
        zzY4G zzy4g = this.zzX1l;
        if (zzy4g != null) {
            zzy4g.zzX1o = i;
        }
    }

    public final boolean zzh(Cell cell) {
        this.zzZAc = cell;
        if (zzXUw()) {
            return false;
        }
        zzXUt().zzjv(this.zzX1i);
        return true;
    }
}
