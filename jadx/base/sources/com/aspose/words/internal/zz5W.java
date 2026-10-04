package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz5W {
    private String mName;
    private boolean zzkW;
    private zzZOR zzkX;
    private zz69 zzls;

    public zz5W(String str) throws Exception {
        zzZOR zzzor = new zzZOR();
        this.zzkX = zzzor;
        this.zzls = new zz69(zzzor);
        this.mName = str;
    }

    public final String getName() {
        return this.mName;
    }

    public final void zzX(zz69 zz69Var) throws Exception {
        zz69Var.zzY3(this.mName);
        zz69Var.zzK((byte) -117);
        zz69Var.zzM((byte) 94);
    }

    public final void zzY(zz69 zz69Var) throws Exception {
        if (this.zzkW) {
            return;
        }
        zzZ(zz69Var);
        this.zzkW = true;
    }

    public void zzZ(zz69 zz69Var) throws Exception {
        zz69Var.zzY3(this.mName);
        zz69Var.zzK((byte) -117);
        zz69Var.zzM((byte) 91);
        zz69Var.zzUc((int) ((((long) ((int) this.zzkX.getLength())) & 4294967295L) + 16));
        zz69Var.zzK((byte) -116);
        zz69Var.zzM((byte) 92);
        zz69Var.zzW(this.zzkX);
        zz69Var.zzM((byte) 93);
    }

    public final zz69 zzwM() {
        return this.zzls;
    }
}
