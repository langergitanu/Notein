package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1S extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("sp", "wsp", "cxnSp", "spPr", "style", "txbx", "linkedTxbx", "txSp", "txBody", "bodyPr", "txXfrm", "nvSpPr", "nvCxnSpPr", "cNvPr", "cNvSpPr", "cNvCnPr", "txbxContent");
    private Shape zzZ2R;
    private zzZXT zzZfi;

    private zz1S(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static Shape zzG(zzZXT zzzxt) throws Exception {
        return new zz1S(zzzxt).zzZwx();
    }

    private void zzZuA() throws Exception {
        this.zzZ2R.zzma(this.zzZfi.zzZsD().zzX("id", 0));
        while (this.zzZfi.zzZsD().zzQ("txbx")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 16) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzZWW.zzZl2();
                zzZXT zzzxt = this.zzZfi;
                zzzxt.zzQ(zzzxt.zzYz7());
            }
        }
    }

    private void zzZuB() throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        Shape shape = new Shape(this.zzZfi.getDocument(), (byte) 0);
        this.zzZ2R = shape;
        this.zzZfi.zzT(shape);
        zz2O zz2o = new zz2O(zz39.zzOo(localName));
        this.zzZ2R.zzU(zz2o);
        if (zz2o.zzZHY() == 8) {
            this.zzZfi.zzZqn().zzYr8();
        }
        zz2o.zzWY(this.zzZfi.zzZsD().zzX("normalEastAsianFlow", false));
        zz2o.zzZ(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("modelId", "")));
        this.zzZfi.zzZsD().zzj();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 3:
                    zz51.zzZ(this.zzZfi, zz2o);
                    break;
                case 4:
                    zz2o.zzZ(zz1J.zzQ(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
                    break;
                case 5:
                    zzZuA();
                    break;
                case 6:
                    this.zzZ2R.zzm9(this.zzZfi.zzZsD().zzX("id", 0));
                    this.zzZ2R.zzm8(this.zzZfi.zzZsD().zzX("seq", 0));
                    break;
                case 7:
                    zz2o.zzY(zz0I.zz2(this.zzZfi));
                    break;
                case 8:
                    if (zz2o.zzZAk() == null) {
                        zz2o.zzY(new zz0J());
                    }
                    zz0I.zzZ(this.zzZfi, zz2o.zzZAk().zzZCZ(), "txBody");
                    break;
                case 9:
                    if (zz2o.zzZAk() == null) {
                        zz2o.zzY(new zz0J());
                    }
                    zz0I.zzZ(this.zzZfi, zz2o.zzZAk().zzZCZ().zzZtK(), this.zzZfi.zzZqn());
                    break;
                case 10:
                    if (zz2o.zzZAk() == null) {
                        zz2o.zzY(new zz0J());
                    }
                    zz2o.zzZAk().zzZ(zz06.zzK(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
                    break;
                case 11:
                    if (zz2o.zzZyc() == null) {
                        zz2o.zzZ(new zz4M());
                    }
                    zz51.zzZ(zz2o.zzZyc(), this.zzZfi);
                    break;
                case 12:
                    if (zz2o.zzZyc() == null) {
                        zz2o.zzZ(new zz4R());
                    }
                    zz51.zzZ(zz2o.zzZyc(), this.zzZfi);
                    break;
                case 13:
                    if (zz2o.zzZyc() == null) {
                        if (zz2o.zzZHY() == 1) {
                            zz2o.zzZ(new zz4R());
                        } else {
                            zz2o.zzZ(new zz4M());
                        }
                    }
                    zz2o.zzZyc().zzY(zz51.zz5(this.zzZfi));
                    break;
                case 14:
                    if (zz2o.zzZyc() == null) {
                        zz2o.zzZ(new zz4M());
                    }
                    zz2o.zzZyc().zzZ(zz51.zz6(this.zzZfi));
                    break;
                case 15:
                    if (zz2o.zzZyc() == null) {
                        zz2o.zzZ(new zz4R());
                    }
                    zz2o.zzZyc().zzZ(zz51.zz6(this.zzZfi));
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        this.zzZfi.zztj(18);
    }

    private Shape zzZwx() throws Exception {
        try {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 0 && iZzTP != 1 && iZzTP != 2) {
                return null;
            }
            zzZuB();
            return this.zzZ2R;
        } catch (Exception e) {
            zz39.zzZ(this.zzZfi.zzZsD(), e.getMessage());
            CompositeNode compositeNodeZzYz7 = this.zzZfi.zzYz7();
            this.zzZfi.zztj(18);
            compositeNodeZzYz7.remove();
            return null;
        }
    }
}
