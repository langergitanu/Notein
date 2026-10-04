package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOG extends zzYOF {
    private String zzXJl;
    private zzYL0 zzXJm;
    private String zzYcU;
    private String zzYcV;
    private boolean zzZam;

    public zzYOG(OleFormat oleFormat, byte[] bArr) throws Exception {
        this.zzZqL = oleFormat.getProgId();
        this.zzYcV = oleFormat.getSourceFullName();
        this.zzYcU = oleFormat.getSourceItem();
        this.zzZam = oleFormat.getAutoUpdate();
        this.zzXJm = bArr != null ? new zzYKY(bArr) : new zzYKZ();
    }

    public final String zzYPn() {
        return this.zzYcU;
    }

    public final String zzYPo() {
        return this.zzYcV;
    }

    @Override // com.aspose.words.zzYOF
    public final int zzYrF() {
        return 2;
    }

    @Override // com.aspose.words.zzYOF
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        new zzYTQ(2, this.zzZqL, this.zzYcV, this.zzYcU).zzZ(zzzow);
        zzYO6.zzV(zzzow, this.zzXJl);
        zzzow.zzl(0);
        zzzow.zzl(this.zzZam ? 0 : 2);
        this.zzXJm.zzZ(zzzow);
    }

    public zzYOG(zzYTQ zzytq, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZqL = zzytq.getClassName();
        this.zzYcV = zzytq.zzYPo();
        this.zzYcU = zzytq.zzYPn();
        this.zzXJl = zzYO6.zzf(zzzox);
        zzzox.zzXc();
        this.zzZam = zzzox.zzXc() == 0;
        this.zzXJm = zzYL0.zzc(zzzox);
    }
}
