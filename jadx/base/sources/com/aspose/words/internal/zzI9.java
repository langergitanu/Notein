package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzI9 {
    private String zzxt;
    private String zzxu;
    private String zzxv;

    public zzI9(String str, String str2, String str3) {
        zzZYD.zzXk(str);
        zzZYD.zzXk(str2);
        zzZYD.zzXk(str3);
        this.zzxv = str;
        this.zzxu = str2;
        this.zzxt = str3;
    }

    private boolean zzZ(zzI9 zzi9) {
        String str = this.zzxv;
        String str2 = zzi9.zzxv;
        int i = zzZOF.ORDINAL$4894b8c8;
        return zzZKN.zzX(str, str2, i) && zzZKN.zzX(this.zzxu, zzi9.zzxu, i) && zzZKN.zzX(this.zzxt, zzi9.zzxt, i);
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzI9.class) {
            return false;
        }
        return zzZ((zzI9) obj);
    }

    public final String getFamily() {
        return this.zzxv;
    }

    public final int hashCode() {
        return (((this.zzxv.hashCode() * 397) ^ this.zzxu.hashCode()) * 397) ^ this.zzxt.hashCode();
    }

    public final String zzG6() {
        return this.zzxt;
    }

    public final String zzG7() {
        return this.zzxu;
    }
}
