package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zz77 implements Cloneable {
    private String mName;
    private zzZOP zzN5;
    private String zzZR;
    private zzZQ9 zzmR;
    private Object zzmS = new Object();
    private zz74 zzmX;

    public zz77(String str, String str2) throws Exception {
        zzZ4.zzU(str, "partName");
        this.mName = str;
        this.zzZR = str2;
        this.zzN5 = new zzZOR();
        this.zzmX = new zz74(str);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getContentType() {
        return this.zzZR;
    }

    public final String getName() {
        return this.mName;
    }

    public final void setContentType(String str) {
        this.zzZR = str;
    }

    public final void zz5(zzZOP zzzop) {
        this.zzN5 = zzzop;
    }

    public final void zzL(zzZQ9 zzzq9) {
        this.zzmR = zzzq9;
    }

    public final zzZOP zzR1() {
        return this.zzN5;
    }

    public final String zzY9(String str) {
        zz75 zz75VarZzY7;
        if (!zzZYD.zzXk(str) || (zz75VarZzY7 = this.zzmX.zzY7(str)) == null) {
            return "";
        }
        if (!zz75VarZzY7.isExternal()) {
            return zzZVR.zzWw(zz75VarZzY7.getTarget()) ? zz75VarZzY7.getTarget() : zzZ(zz75VarZzY7);
        }
        String target = zz75VarZzY7.getTarget();
        return zzZVR.zzWn(target) ? zzZVR.zzWt(zzZVR.zzWm(target)) : target;
    }

    public final String zzZ(zz75 zz75Var) {
        if (zz75Var.isExternal()) {
            throw new IllegalStateException("An internal target is expected here.");
        }
        return zz78.zzs(this.mName, zz75Var.getTarget());
    }

    public final zzZQ9 zzxj() {
        return this.zzmR;
    }

    public final zzZOR zzxk() throws Exception {
        this.zzN5.zzH(0L);
        return zzZYQ.zzZY(zzSJ.zzQ(this.zzN5));
    }

    public final String zzxl() throws Exception {
        return zzZKN.zzU(zzZOQ.zzVe(this.mName), FilenameUtils.EXTENSION_SEPARATOR);
    }

    public final zz77 zzxm() {
        try {
            zz77 zz77Var = (zz77) memberwiseClone();
            zz77Var.zzmX = this.zzmX.zzxh();
            synchronized (this.zzmS) {
                zz77Var.zzN5 = new zzZOR();
                this.zzN5.zzH(0L);
                zzZYQ.zzX(this.zzN5, zz77Var.zzN5);
                zz77Var.zzmS = new Object();
            }
            return zz77Var;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final zz74 zzxn() {
        return this.zzmX;
    }
}
