package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZIG extends zzZG4 implements zzZAS {
    private String mName;
    private long zzYqP;
    private String[] zzYqQ;
    private long zzYqR;
    private zzZAS[] zzYqS;
    private boolean zzYqT;
    private boolean zzYqU;
    private boolean zzYqV;
    private boolean zzYqW;
    private boolean zzYqX;
    private zzZK8 zzYqY;
    private zzZG3 zzYqZ;
    private String zzYr0;
    private boolean zzZrr;
    private boolean zzZrs;
    private static String[] zzYr1 = new String[0];
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("script", "style", "img", "svg", "br", TranslateLanguage.CROATIAN);

    public zzZIG(String str) {
        this(str, "http://www.w3.org/1999/xhtml", new zzZK8());
    }

    private static String zzT(zzZIG zzzig) {
        while (true) {
            zzZK9 zzzk9ZzL6 = zzzig.zzYqY.zzL6(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
            if (zzzk9ZzL6 != null) {
                return zzzk9ZzL6.getValue();
            }
            if (zzzig.zzZ0e() == null) {
                return "";
            }
            zzzig = zzzig.zzZ0e();
        }
    }

    private void zzZ2w() {
        String attributeValue = this.zzYqY.getAttributeValue("class", "");
        this.zzYqQ = !com.aspose.words.internal.zzZKN.equals(attributeValue, "") ? zzL5.zzS8(attributeValue) : zzYr1;
        this.zzYqP = this.zzYqY.zzZ4r();
    }

    private void zzZ2x() {
        if (this.zzYqP != this.zzYqY.zzZ4r()) {
            zzZ2w();
        }
    }

    private boolean zzZ2y() {
        Iterator<zzZG4> it = this.zzYqZ.iterator();
        zzZIG zzzig = null;
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzZG4 next = it.next();
            if (next.zzZ2D()) {
                if (z) {
                    this.zzZrs = !next.zzZ2E();
                    z = false;
                }
                this.zzYqV = true;
                this.zzZrr = !next.zzZ2E();
            }
            if (next.zzZ2E()) {
                this.zzYqX = true;
                zzZIG zzzig2 = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(next, zzZIG.class);
                if (zzzig2 != null) {
                    zzzig = zzzig2;
                }
            }
        }
        this.zzYqU = (zzZIJ.zzKO(this.mName) && this.zzYqV) || this.zzYqX;
        if (zzzig != null) {
            zzzig.zzYqW = true;
        }
        if (zzZ0e() == null) {
            this.zzYqW = true;
        }
        return true;
    }

    private boolean zzZ2z() {
        this.zzZrs = false;
        this.zzZrr = false;
        this.zzYqX = false;
        this.zzYqV = false;
        this.zzYqU = false;
        this.zzYqW = false;
        int iZzTP = zzUR.zzTP(this.mName);
        if (iZzTP == 0 || iZzTP == 1) {
            return false;
        }
        if (iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5) {
            this.zzYqV = true;
        }
        return true;
    }

    @Override // com.aspose.words.zzZBM
    public final String getAttributeValue(String str, String str2) {
        return this.zzYqY.getAttributeValue(str, str2);
    }

    @Override // com.aspose.words.zzZBM
    public final String getLanguage() {
        return zzT(this);
    }

    public final String getName() {
        return this.mName;
    }

    public final String getNamespace() {
        return this.zzYr0;
    }

    @Override // com.aspose.words.zzZBM
    public final boolean isImplicit() {
        return this.zzYqT;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzKM(String str) {
        return this.zzYqY.getAttributeValue(str, null);
    }

    public final zzZIG zzKN(String str) {
        zzZIG zzzig;
        zzZE5 zzze5 = new zzZE5(this);
        while (zzze5.moveNext()) {
            if (zzze5.zzZou() && (zzzig = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(zzze5.zzYXo(), zzZIG.class)) != null && com.aspose.words.internal.zzZKN.equals(zzzig.mName, str)) {
                return zzzig;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzM(boolean z, boolean z2) {
        return z ? zzZ2z() : zzZ2y();
    }

    @Override // com.aspose.words.zzZG4
    public final void zzZ(StringBuilder sb, zzXYQ zzxyq) {
        zzxyq.zz6(this);
        sb.append('<');
        com.aspose.words.internal.zzZNH.zzU(sb, this.mName);
        String strZzZ = this.zzYqY.zzZ(zzxyq);
        if (!com.aspose.words.internal.zzZKN.equals(strZzZ, "")) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, strZzZ);
        }
        if (this.zzYqZ.getCount() == 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, " />");
        } else {
            sb.append('>');
            if ("http://www.w3.org/1999/xhtml".equals(this.zzYr0) && (("pre".equals(this.mName) || "textarea".equals(this.mName) || "listing".equals(this.mName)) && this.zzYqZ.getCount() > 0 && (this.zzYqZ.zzzd(0) instanceof zzZEC))) {
                String text = ((zzZEC) this.zzYqZ.zzzd(0)).getText();
                if (text.length() > 0 && text.charAt(0) == '\n') {
                    sb.append('\n');
                }
            }
            Iterator<zzZG4> it = this.zzYqZ.iterator();
            while (it.hasNext()) {
                it.next().zzZ(sb, zzxyq);
            }
            com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(sb, "</"), this.mName).append('>');
        }
        zzxyq.zzXQy();
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzZ2A() {
        return "pre".equals(this.mName) || "xmp".equals(this.mName) || "listing".equals(this.mName) || "plaintext".equals(this.mName);
    }

    public final zzZK8 zzZ2B() {
        return this.zzYqY;
    }

    public final zzZG3 zzZ2C() {
        return this.zzYqZ;
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzZ2D() {
        return this.zzYqV;
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzZ2E() {
        return this.zzYqU;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2F() {
        for (int i = 0; i < this.zzYqZ.getCount(); i++) {
            if (this.zzYqZ.zzzd(i) instanceof zzZEC) {
                return ((zzZEC) this.zzYqZ.zzzd(i)).getText();
            }
        }
        return "";
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2G() {
        return this.zzYr0;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2H() {
        return this.zzYqW;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2I() {
        return this.zzYqV;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2J() {
        return this.zzYqX;
    }

    @Override // com.aspose.words.zzZBM
    public final String[] zzZ2K() {
        zzZ2x();
        return this.zzYqQ;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2L() {
        boolean z = false;
        for (zzZG4 zzzg4 : this.zzYqZ) {
            if (zzzg4 instanceof zzZIG) {
                if (z) {
                    return false;
                }
                z = true;
            } else if (zzzg4.zzZ2D()) {
                return false;
            }
        }
        return z;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM[] zzZ2M() {
        if (this.zzYqR == this.zzYqZ.zzZ4r()) {
            return this.zzYqS;
        }
        Iterator<zzZG4> it = this.zzYqZ.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next() instanceof zzZAS) {
                i2++;
            }
        }
        this.zzYqS = new zzZAS[i2];
        for (Object obj : this.zzYqZ) {
            if (obj instanceof zzZAS) {
                this.zzYqS[i] = (zzZAS) obj;
                i++;
            }
        }
        this.zzYqR = this.zzYqZ.zzZ4r();
        return this.zzYqS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2N() {
        for (zzZG4 zzzg4ZzZ0d = zzZ0d(); zzzg4ZzZ0d != 0; zzzg4ZzZ0d = zzzg4ZzZ0d.zzZ0d()) {
            if (zzzg4ZzZ0d instanceof zzZAS) {
                return (zzZAS) zzzg4ZzZ0d;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2O() {
        for (zzZG4 zzzg4ZzZ0c = zzZ0c(); zzzg4ZzZ0c != 0; zzzg4ZzZ0c = zzzg4ZzZ0c.zzZ0c()) {
            if (zzzg4ZzZ0c instanceof zzZAS) {
                return (zzZAS) zzzg4ZzZ0c;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2P() {
        for (int i = 0; i < this.zzYqZ.getCount(); i++) {
            if (this.zzYqZ.zzzd(i) instanceof zzZAS) {
                return (zzZAS) this.zzYqZ.zzzd(i);
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2Q() {
        return zzZ0e();
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZTQ() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZXc() {
        return this.zzZrr;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZXd() {
        return this.zzZrs;
    }

    public zzZIG(String str, boolean z) {
        this(str, "http://www.w3.org/1999/xhtml", new zzZK8());
        this.zzYqT = z;
    }

    public zzZIG(String str, String str2, zzZK8 zzzk8) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = str;
        this.zzYr0 = str2;
        this.zzYqZ = new zzZG3(this);
        this.zzYqY = zzzk8;
    }
}
