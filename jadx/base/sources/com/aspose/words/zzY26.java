package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY26 {
    private boolean zzWW4;
    private boolean zzWW5;
    private String zzWW6;
    private String zzWW7;
    private String zzWW8;
    private String zzWW9;
    private String zzWWa;
    private String zzWWb;
    private int zzWZQ = 0;
    private zzYU6 zzXSu;
    private boolean zzXed;
    private boolean zzXee;
    private String zzXef;
    private String zzZh;

    public zzY26(zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
    }

    public final void zzIg() {
        if (this.zzWZQ == 0) {
            return;
        }
        this.zzXSu.zzY("o:signatureline");
        this.zzXSu.zz0("o:addlxml", this.zzWWb);
        this.zzXSu.zzx("allowcomments", this.zzXee);
        this.zzXSu.zz0("id", this.zzZh);
        this.zzXSu.zzx("issignatureline", this.zzWW5);
        this.zzXSu.zz0("provid", this.zzWWa);
        this.zzXSu.zzx("showsigndate", this.zzXed);
        this.zzXSu.zz0("o:signinginstructions", this.zzXef);
        this.zzXSu.zzx("signinginstructionsset", this.zzWW4);
        this.zzXSu.zz0("o:sigprovurl", this.zzWW9);
        this.zzXSu.zz0("o:suggestedsigner", this.zzWW8);
        this.zzXSu.zz0("o:suggestedsigner2", this.zzWW7);
        this.zzXSu.zz0("o:suggestedsigneremail", this.zzWW6);
        this.zzXSu.zzp();
    }

    public final void zzZP(int i, Object obj) {
        this.zzWZQ++;
        switch (i) {
            case 1921:
                this.zzZh = (String) obj;
                break;
            case 1922:
                this.zzWWa = (String) obj;
                break;
            case 1923:
                this.zzWW8 = (String) obj;
                break;
            case 1924:
                this.zzWW7 = (String) obj;
                break;
            case 1925:
                this.zzWW6 = (String) obj;
                break;
            case 1926:
                this.zzXef = (String) obj;
                break;
            case 1927:
                this.zzWWb = (String) obj;
                break;
            case 1928:
                this.zzWW9 = (String) obj;
                break;
            default:
                switch (i) {
                    case FieldType.FIELD_CITATION /* 1980 */:
                        this.zzXed = ((Boolean) obj).booleanValue();
                        break;
                    case 1981:
                        this.zzXee = ((Boolean) obj).booleanValue();
                        break;
                    case 1982:
                        this.zzWW4 = ((Boolean) obj).booleanValue();
                        break;
                    case 1983:
                        this.zzWW5 = ((Boolean) obj).booleanValue();
                        break;
                }
                break;
        }
    }
}
