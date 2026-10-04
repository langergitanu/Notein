package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQ8 {
    private zzYQ7 zzXQE;
    private zzYC3 zzXQQ;
    private ArrayList<zzYM5> zzXNe = new ArrayList<>();
    private ArrayList<zzYM6> zzXNd = new ArrayList<>();
    private int zzXNc = -1;
    private zzYM6 zzXNb = new zzYM6();
    private zzYM5 zzXNa = new zzYM5();
    private zzYM5 zzXN9 = new zzYM5();
    private zzYM5 zzXN8 = new zzYM5();
    private char zzXN7 = 'M';
    private int zzXN6 = 0;
    private StringBuilder zzxe = new StringBuilder();
    private ArrayList<Object> zzXQO = new ArrayList<>();

    public zzYQ8(zzYQ7 zzyq7) {
        this.zzXQE = zzyq7;
    }

    private void zzEb(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (zzYS3.zzY6(cCharAt) != -1) {
                zzYwN();
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Character>) this.zzXQO, Character.valueOf(cCharAt));
            } else if (Character.isDigit(cCharAt) || cCharAt == '-' || Character.isLetter(cCharAt)) {
                if (cCharAt == '-') {
                    zzYwN();
                }
                this.zzxe.append(cCharAt);
            } else {
                zzYwN();
            }
        }
        zzYwN();
    }

    private zzYM2 zzEc(String str) {
        int iZzR = zzYOU.zzR(com.aspose.words.internal.zzJB.zzZo(str), this.zzXQE.zzYuu());
        return iZzR != Integer.MIN_VALUE ? new zzYM2(iZzR, false) : new zzYM2();
    }

    private void zzWw(int i, int i2) {
        zzYM5 zzym5;
        zzYM5 zzym52;
        zzYM5 zzym53 = new zzYM5();
        char upperCase = Character.toUpperCase(this.zzXN7);
        if (upperCase == 'S' && i == 0) {
            zzym52 = zzZ(this.zzXNa, this.zzXN9);
        } else if (upperCase == 'T' && i == 0) {
            zzym52 = zzZ(this.zzXNa, this.zzXN8);
        } else {
            if (upperCase == 'V') {
                zzym5 = new zzYM5(this.zzXNa.zzYnG(), zzym53.zzYnF());
            } else {
                ArrayList<Object> arrayList = this.zzXQO;
                int i3 = this.zzXN6;
                this.zzXN6 = i3 + 1;
                zzym5 = new zzYM5(zzEc((String) arrayList.get(i3)), zzym53.zzYnF());
                if (Character.isLowerCase(this.zzXN7)) {
                    zzym5 = new zzYM5(zzym5.zzYnG().getValue() + this.zzXNa.zzYnG().getValue(), zzym5.zzYnF().getValue());
                }
            }
            if (upperCase == 'H') {
                zzym52 = new zzYM5(zzym5.zzYnG(), this.zzXNa.zzYnF());
            } else {
                zzYM2 zzym2ZzYnG = zzym5.zzYnG();
                ArrayList<Object> arrayList2 = this.zzXQO;
                int i4 = this.zzXN6;
                this.zzXN6 = i4 + 1;
                zzym52 = new zzYM5(zzym2ZzYnG, zzEc((String) arrayList2.get(i4)));
                if (Character.isLowerCase(this.zzXN7)) {
                    zzym52 = new zzYM5(zzym52.zzYnG().getValue(), zzym52.zzYnF().getValue() + this.zzXNa.zzYnF().getValue());
                }
            }
        }
        zzZ(i, i2, zzym52);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXNe, zzym52);
    }

    private void zzX(String str, Shape shape) throws Exception {
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            if (!zzYQ7.zzZ(this.zzXQE, shape) && !this.zzXQE.zzR(this.zzXQQ) && zzYQ7.zzE8(zzyq9ZzYuT.getLocalName())) {
                this.zzXQE.zzZ(1, true, str);
            }
        }
    }

    private void zzYuW() {
        int i = this.zzXNc;
        if (i == -1 || i == 163) {
            this.zzXN6++;
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXNd, this.zzXNb);
        int iZzYnJ = this.zzXNb.zzYnJ();
        for (int i2 = 0; i2 < iZzYnJ; i2++) {
            zzWw(i2, iZzYnJ);
        }
    }

    private void zzYuX() {
        char cCharValue = ((Character) this.zzXQO.get(this.zzXN6)).charValue();
        this.zzXN7 = cCharValue;
        int iZzY6 = zzYS3.zzY6(cCharValue);
        this.zzXNc = iZzY6;
        if (iZzY6 != 163) {
            zzYM6 zzym6 = new zzYM6(iZzY6, 1);
            this.zzXNb = zzym6;
            if (zzym6.zzYnJ() == 0) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXNd, this.zzXNb);
            }
        }
        this.zzXN6++;
    }

    private void zzYuY() {
        this.zzXQE.zzE5(null);
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        this.zzXQE.zzZ(zzyq9ZzYuT, this.zzXQQ, "path");
        boolean z = false;
        while (zzyq9ZzYuT.zzi()) {
            zzYQ7 zzyq7 = this.zzXQE;
            if (!zzyq7.zzV(zzyq7, this.zzXQQ, "path")) {
                if ("d".equals(zzyq9ZzYuT.getLocalName())) {
                    zzEb(zzyq9ZzYuT.getValue());
                    z = true;
                } else if ("viewBox".equals(zzyq9ZzYuT.getLocalName())) {
                    this.zzXQE.zzZ(zzyq9ZzYuT.getValue(), false, false, this.zzXQQ);
                }
            }
        }
        if (z) {
            zzYwK();
        }
    }

    private void zzYwK() {
        while (this.zzXN6 < this.zzXQO.size()) {
            if (zzZb(this.zzXQO.get(this.zzXN6))) {
                zzYuX();
            } else {
                zzYuW();
            }
        }
        if (this.zzXNb.zzYnL() != 3) {
            this.zzXNd.add(0, new zzYM6(170, 1));
        }
        zzYM5[] zzym5Arr = new zzYM5[this.zzXNe.size()];
        for (int i = 0; i < this.zzXNe.size(); i++) {
            zzym5Arr[i] = this.zzXNe.get(i);
        }
        zzYM6[] zzym6Arr = new zzYM6[this.zzXNd.size()];
        for (int i2 = 0; i2 < this.zzXNd.size(); i2++) {
            zzym6Arr[i2] = this.zzXNd.get(i2);
        }
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_4, zzym5Arr);
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_5_DARK, zzym6Arr);
    }

    private void zzYwN() {
        if (this.zzxe.toString().length() > 0) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) this.zzXQO, this.zzxe.toString());
        }
        this.zzxe.setLength(0);
    }

    private static boolean zzZb(Object obj) {
        return (obj instanceof Character) && "MmZzLlHhVvCcSsQqTtAa".indexOf(((Character) obj).charValue()) != -1;
    }

    public final void zzZ(CompositeNode compositeNode, zzYEF zzyef) throws Exception {
        this.zzXQE.zzS8(true);
        this.zzXQE.zzWz(1.0d);
        String localName = this.zzXQE.zzYuT().getLocalName();
        Shape shape = new Shape(this.zzXQE.getDocument());
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        this.zzXQQ = zzyc3;
        zzyc3.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 0);
        zzYuY();
        zzYRR.zzX(this.zzXQE, shape.zzYvW());
        zzX(localName, shape);
        this.zzXQQ.zzY(shape.zzYvW());
        zzYRR.zzZ(shape, (zzYRL) this.zzXQE.zzYuS().zzY(this.zzXQE.zzYuP(), "graphic", this.zzXQE.zzYuO(), true));
        compositeNode.appendChild(shape);
        this.zzXQE.zzS8(false);
    }

    private void zzZ(int i, int i2, zzYM5 zzym5) {
        if (i == i2 - 1) {
            this.zzXNa = zzym5;
        }
        int i3 = this.zzXNc;
        if (i3 != 1) {
            this.zzXN9 = this.zzXNa;
        } else if (i == 1) {
            this.zzXN9 = zzym5;
        }
        if (i3 != 169) {
            this.zzXN8 = this.zzXNa;
        } else if (i == 0) {
            this.zzXN8 = zzym5;
        }
    }

    private static zzYM5 zzZ(zzYM5 zzym5, zzYM5 zzym52) {
        return new zzYM5(com.aspose.words.internal.zzZPZ.zzZm((zzym5.zzYnG().getValue() * 2) - zzym52.zzYnG().getValue(), (zzym5.zzYnF().getValue() * 2) - zzym52.zzYnF().getValue()));
    }
}
