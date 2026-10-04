package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Frameset {
    private String mName;
    private int zzYvd;
    private int zzYvg;
    private int zzYvh;
    private boolean zzYvi;
    private boolean zzYvj;
    private byte[] zzYvn;
    private String zzYvo;
    private String zzZj;
    private int zzYvm = 0;
    private int zzZxz = 0;
    private int zzYvl = 3;
    private int zzYvk = 1;
    private FramesetCollection zzYvf = new FramesetCollection();
    private com.aspose.words.internal.zzPV zzYve = com.aspose.words.internal.zzPV.zzHZ;
    private int zzYvc = 1;

    public FramesetCollection getChildFramesets() {
        return this.zzYvf;
    }

    public String getFrameDefaultUrl() {
        if (zzZ5x()) {
            return null;
        }
        return this.zzYvo;
    }

    public final String getName() {
        if (zzZ5x()) {
            return null;
        }
        return this.mName;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    public boolean isFrameLinkToFile() {
        return !zzZ5x() && this.zzYvj;
    }

    public void setFrameDefaultUrl(String str) {
        if (zzZ5x()) {
            throw new IllegalStateException("The property cannot be set if the current instance is a frames page.");
        }
        this.zzYvo = str;
    }

    public final void setName(String str) {
        zzZ5x();
        if (com.aspose.words.internal.zzZYD.zzXk(str) && str.length() > 255) {
            str = str.substring(0, 255);
        }
        this.mName = str;
    }

    public final void setTitle(String str) {
        this.zzZj = str;
    }

    public final void zz3(com.aspose.words.internal.zzPV zzpv) {
        this.zzYve = zzpv;
    }

    public final int zz6y() {
        return this.zzZxz;
    }

    public final void zzAt(int i) {
        this.zzYvd = i;
    }

    public final void zzAu(int i) {
        this.zzYvc = i;
    }

    public final void zzAv(int i) {
        this.zzYvm = i;
    }

    public final void zzAw(int i) {
        this.zzYvg = i;
    }

    public final void zzAx(int i) {
        this.zzYvh = i;
    }

    public final void zzAy(int i) {
        this.zzYvk = i;
    }

    public final void zzAz(int i) {
        this.zzYvl = i;
    }

    public final void zzLf(String str) {
        this.zzYvo = str;
    }

    public final void zzNL(int i) {
        this.zzZxz = i;
    }

    public final void zzVx(boolean z) {
        this.zzYvi = z;
    }

    public final void zzVy(boolean z) {
        this.zzYvj = z;
    }

    public final void zzYc(byte[] bArr) {
        zzZ5x();
        this.zzYvn = bArr;
    }

    public final int zzZ5A() {
        return this.zzYvg;
    }

    public final int zzZ5B() {
        return this.zzYvh;
    }

    public final int zzZ5C() {
        return this.zzYvk;
    }

    public final int zzZ5D() {
        return this.zzYvl;
    }

    public final byte[] zzZ5E() {
        if (zzZ5x()) {
            return null;
        }
        return this.zzYvn;
    }

    public final boolean zzZ5t() {
        return this.zzYvc != 0 && this.zzYvd > 0;
    }

    public final int zzZ5u() {
        return this.zzYvd;
    }

    public final com.aspose.words.internal.zzPV zzZ5v() {
        return this.zzYve;
    }

    public final int zzZ5w() {
        return this.zzYvc;
    }

    public final boolean zzZ5x() {
        return getChildFramesets().getCount() > 0;
    }

    public final boolean zzZ5y() {
        return this.zzYvi;
    }

    public final int zzZ5z() {
        return this.zzYvm;
    }

    public void isFrameLinkToFile(boolean z) {
        if (zzZ5x()) {
            throw new IllegalStateException("The property cannot be set if the current instance is a frames page.");
        }
        this.zzYvj = z;
    }
}
