package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEP extends zzYHQ {
    private int zzXqS;
    private String zzXsb;
    private String zzXsc;
    private String zzYQY;

    public zzYEP(zzYFT zzyft) {
        super(zzyft);
    }

    private void zzYey() {
        DocumentProperty documentPropertyZzT;
        String str;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXsc)) {
            CustomDocumentProperties customDocumentProperties = this.zzXw4.getDocument().getCustomDocumentProperties();
            int i = this.zzXqS;
            if (i == 0) {
                customDocumentProperties.zzT(this.zzXsc, Boolean.valueOf(true ^ "0".equals(this.zzXsb)));
            } else {
                if (i != 1) {
                    Object objValueOf = "";
                    if (i == 2) {
                        double dZzZs = com.aspose.words.internal.zzJB.zzZs(this.zzXsb);
                        if (Double.isNaN(dZzZs)) {
                            char cZzH5 = com.aspose.words.internal.zzJB.zzH5();
                            if (cZzH5 == '.') {
                                dZzZs = com.aspose.words.internal.zzJB.zzZo(this.zzXsb.replace(",", ""));
                            }
                            if (cZzH5 == ',') {
                                dZzZs = com.aspose.words.internal.zzJB.zzZk(this.zzXsb);
                            }
                        }
                        if (!Double.isNaN(dZzZs)) {
                            String str2 = this.zzXsc;
                            objValueOf = Double.valueOf(dZzZs);
                            str = str2;
                            documentPropertyZzT = customDocumentProperties.zzT(str, objValueOf);
                        }
                    } else if (i == 3) {
                        int iZzZk = com.aspose.words.internal.zzJB.zzZk(this.zzXsb);
                        if (iZzZk != Integer.MIN_VALUE) {
                            String str3 = this.zzXsc;
                            objValueOf = Integer.valueOf(iZzZk);
                            str = str3;
                            documentPropertyZzT = customDocumentProperties.zzT(str, objValueOf);
                        }
                    } else if (i == 4) {
                        str = this.zzXsc;
                        String str4 = this.zzXsb;
                        if (str4 != null) {
                            objValueOf = str4;
                        }
                        documentPropertyZzT = customDocumentProperties.zzT(str, objValueOf);
                    }
                    if (com.aspose.words.internal.zzZYD.zzXk(this.zzYQY) && documentPropertyZzT != null) {
                        documentPropertyZzT.zzO2(this.zzYQY);
                    }
                    this.zzXsc = null;
                    this.zzXsb = null;
                    this.zzYQY = null;
                    this.zzXqS = 8;
                }
                com.aspose.words.internal.zzZQ9 zzzq9ZzZg = com.aspose.words.internal.zzJB.zzZg(this.zzXsb);
                if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZg, com.aspose.words.internal.zzZQ9.zz35)) {
                    customDocumentProperties.zzT(this.zzXsc, com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZg, com.aspose.words.internal.zzZNF.zzZd(12.0d)));
                }
            }
            documentPropertyZzT = null;
            if (com.aspose.words.internal.zzZYD.zzXk(this.zzYQY)) {
                documentPropertyZzT.zzO2(this.zzYQY);
            }
            this.zzXsc = null;
            this.zzXsb = null;
            this.zzYQY = null;
            this.zzXqS = 8;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzCf;
        if (!"\\proptype".equals(zzyet.getName()) || (iZzCf = zzYGD.zzCf(Integer.toString(zzyet.zzYeT()))) == Integer.MIN_VALUE) {
            return;
        }
        this.zzXqS = iZzCf;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        switch (zzYiN().getType()) {
            case 22:
                zzYey();
                this.zzXsc = zzyet.zzYR();
                break;
            case 23:
                this.zzXsb = zzyet.zzYR();
                break;
            case 24:
                this.zzYQY = zzyet.zzYR();
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYiO() {
        if (zzYiN().getType() == 21) {
            zzYey();
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() == 23) {
            zzYey();
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        switch (zzyhp.getType()) {
            case 22:
            case 23:
            case 24:
                return this;
            default:
                return null;
        }
    }
}
