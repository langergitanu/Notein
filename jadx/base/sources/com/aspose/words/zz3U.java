package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3U extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("blipFill", "spPr", "style", "nvPicPr", "extLst", "AlternateContent", "Choice", "Fallback");
    private Shape zzZ0a;
    private zzZXT zzZfi;

    private zz3U(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static Shape zzG(zzZXT zzzxt) {
        return new zz3U(zzzxt).zzZwx();
    }

    private void zzY(zz2J zz2j) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("Fallback")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 0) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                ((zz3V) zz2j).zzZ((zzH0) zz7V.zzc(this.zzZfi));
            }
        }
    }

    private void zzZ(zz2J zz2j) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 6) {
                zz39.zzL(this.zzZfi.zzZsD());
            } else if (iZzTP != 7) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzY(zz2j);
            }
        }
    }

    private void zzZww() throws Exception {
        Shape shape = new Shape(this.zzZfi.getDocument(), (byte) 0);
        this.zzZ0a = shape;
        this.zzZfi.zzT(shape);
        zz3V zz3v = new zz3V();
        this.zzZ0a.zzU(zz3v);
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 0) {
                zz3v.zzZ((zzH0) zz7V.zzc(this.zzZfi));
            } else if (iZzTP == 1) {
                zz51.zzZ(this.zzZfi, zz3v);
            } else if (iZzTP == 2) {
                zz3v.zzZ(zz1J.zzQ(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
            } else if (iZzTP == 3) {
                zz3v.zzZ(new zz4N());
                zz51.zzZ(zz3v.zzZyc(), this.zzZfi);
            } else if (iZzTP == 4) {
                zz3v.setExtensions(zz81.zzd(this.zzZfi));
            } else if (iZzTP != 5) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzZ(zz3v);
            }
        }
        this.zzZfi.zztj(18);
    }

    private Shape zzZwx() {
        try {
            if (!"pic".equals(this.zzZfi.zzZsD().getLocalName())) {
                return null;
            }
            zzZww();
            return this.zzZ0a;
        } catch (Exception unused) {
            return null;
        }
    }
}
