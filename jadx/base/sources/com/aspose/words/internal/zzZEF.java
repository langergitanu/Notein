package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZEF implements zzZR2 {
    protected boolean zzWJQ;
    protected zzZE6 zzWJR;
    protected zzZR2 zzWKi;
    protected String zzWNf;

    public zzZEF() {
        this.zzWJR = null;
        this.zzWJQ = false;
        this.zzWNf = "";
        this.zzWKi = null;
    }

    private static void zzxn(String str) throws zzZQS {
        throw new zzZQS(str);
    }

    @Override // com.aspose.words.internal.zzZR2
    public final String getNamespaceURI(String str) {
        String strZzx4;
        if (str.length() == 0) {
            return this.zzWNf;
        }
        zzZE6 zzze6 = this.zzWJR;
        if (zzze6 != null && (strZzx4 = zzze6.zzx4(str)) != null) {
            return strZzx4;
        }
        zzZR2 zzzr2 = this.zzWKi;
        if (zzzr2 != null) {
            return zzzr2.getNamespaceURI(str);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZR2
    public final String getPrefix(String str) {
        String strZzx3;
        if (this.zzWNf.equals(str)) {
            return "";
        }
        zzZE6 zzze6 = this.zzWJR;
        if (zzze6 != null && (strZzx3 = zzze6.zzx3(str)) != null) {
            return strZzx3;
        }
        zzZR2 zzzr2 = this.zzWKi;
        if (zzzr2 != null) {
            return zzzr2.getPrefix(str);
        }
        return null;
    }

    public final int zzI(String str, String str2, boolean z) throws zzZQS {
        zzZR2 zzzr2;
        if (str2 == null) {
            str2 = "";
        }
        if (str == null || str.length() == 0) {
            if (z) {
                String str3 = this.zzWNf;
                if (str2 == str3 || str2.equals(str3)) {
                    return 1;
                }
            } else if (str2.length() == 0) {
                return 1;
            }
            return 2;
        }
        if (str.equals("xml")) {
            if (!str2.equals("http://www.w3.org/XML/1998/namespace")) {
                zzxn(C20593OooO0Oo.OooO0O0("Namespace prefix 'xml' can not be bound to non-default namespace ('", str2, "'); has to be the default 'http://www.w3.org/XML/1998/namespace'"));
            }
            return 1;
        }
        zzZE6 zzze6 = this.zzWJR;
        String strZzx4 = zzze6 != null ? zzze6.zzx4(str) : null;
        if (strZzx4 == null && (zzzr2 = this.zzWKi) != null) {
            strZzx4 = zzzr2.getNamespaceURI(str);
        }
        if (strZzx4 == null) {
            return 0;
        }
        return (strZzx4 == str2 || strZzx4.equals(str2)) ? 1 : 2;
    }

    public final String zzXLV() {
        return this.zzWNf;
    }

    public final void zzXz(String str, String str2) {
        zzZE6 zzze6 = this.zzWJR;
        if (zzze6 == null) {
            this.zzWJR = zzZE6.zzXLO();
        } else if (this.zzWJQ) {
            this.zzWJR = zzze6.zzXLN();
            this.zzWJQ = false;
        }
        this.zzWJR.zzXx(str, str2);
    }

    public final void zzZ(zzZEF zzzef) {
        zzZE6 zzze6 = zzzef.zzWJR;
        this.zzWJR = zzze6;
        this.zzWJQ = zzze6 != null;
        this.zzWNf = zzzef.zzWNf;
        this.zzWKi = zzzef.zzWKi;
    }

    public final String zzx7(String str) {
        String prefix;
        String strZzx3;
        zzZE6 zzze6 = this.zzWJR;
        if (zzze6 != null && (strZzx3 = zzze6.zzx3(str)) != null) {
            return strZzx3;
        }
        zzZR2 zzzr2 = this.zzWKi;
        if (zzzr2 == null || (prefix = zzzr2.getPrefix(str)) == null || prefix.length() <= 0) {
            return null;
        }
        return prefix;
    }

    public final String zzZ(String str, String str2, int[] iArr) {
        zzZE6 zzze6 = this.zzWJR;
        if (zzze6 == null) {
            this.zzWJR = zzZE6.zzXLO();
        } else if (this.zzWJQ) {
            this.zzWJR = zzze6.zzXLN();
            this.zzWJQ = false;
        }
        return this.zzWJR.zzZ(str, this.zzWKi, str2, iArr);
    }

    public zzZEF(zzZEF zzzef, zzZE6 zzze6) {
        this.zzWJR = zzze6;
        this.zzWJQ = zzze6 != null;
        this.zzWNf = zzzef.zzWNf;
        this.zzWKi = zzzef.zzWKi;
    }
}
