package com.aspose.words.internal;

import com.aspose.words.internal.zzZHD;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZEA {
    protected Writer zzWJA;
    protected Writer zzWJB;
    final boolean zzWJC;
    final boolean zzWJD;
    final boolean zzWJE;
    protected final boolean zzWJF;
    protected final boolean zzWJG;
    protected final boolean zzWJH;
    protected final boolean zzWKa;
    protected final boolean zzWM5;
    protected final zzZHB zzWM6;
    protected final boolean zzWOV;
    protected final String zzZPP;
    protected boolean zzWQ6 = false;
    protected zzZE9 zzWJz = null;
    protected zzZE9 zzWJy = null;
    protected int zzWJx = 0;
    protected int zzWJw = 1;
    protected int zzWJv = 0;

    public zzZEA(zzZHB zzzhb, String str, boolean z) throws IOException {
        this.zzWM6 = zzzhb;
        this.zzZPP = str;
        this.zzWM5 = z;
        int iZzXPQ = zzzhb.zzXPQ();
        this.zzWOV = (iZzXPQ & 1) != 0;
        this.zzWKa = (iZzXPQ & 256) != 0;
        this.zzWJH = (iZzXPQ & 512) != 0;
        this.zzWJG = (iZzXPQ & 1024) != 0;
        this.zzWJF = (iZzXPQ & 4096) != 0;
        this.zzWJE = (iZzXPQ & 32) != 0;
        this.zzWJD = (iZzXPQ & 64) != 0;
        this.zzWJC = (iZzXPQ & 16384) != 0;
        zzYFS zzyfsZzXPa = zzzhb.zzXPa();
        if (zzyfsZzXPa == null) {
            this.zzWJB = null;
        } else {
            this.zzWJB = zzyfsZzXPa.zzZ(zzXLP());
        }
        zzYFS zzyfsZzXP9 = zzzhb.zzXP9();
        if (zzyfsZzXP9 == null) {
            this.zzWJA = null;
        } else {
            this.zzWJA = zzyfsZzXP9.zzZ(zzXLP());
        }
    }

    private void zzH(String str, Object obj) throws zzZQS {
        zzxn(MessageFormat.format(str, obj));
    }

    private Writer zzXLP() {
        if (this.zzWJz == null) {
            this.zzWJz = zzZE9.zzZ(this);
        }
        return this.zzWJz;
    }

    private void zzxn(String str) throws zzZQS {
        try {
            flush();
            throw new zzZQS(str);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    public abstract void flush() throws IOException;

    public final int getColumn() {
        return (zzXM2() - this.zzWJv) + 1;
    }

    public abstract OutputStream getOutputStream();

    public final int getRow() {
        return this.zzWJw;
    }

    public abstract Writer getWriter();

    public abstract void zz0(String str, String str2) throws IOException, zzZQS;

    public abstract void zzOT(boolean z) throws IOException;

    public abstract void zzS(char[] cArr, int i, int i2) throws IOException;

    public abstract void zzVV(String str) throws IOException;

    public abstract void zzVX(String str) throws IOException, zzZQS;

    public abstract void zzW(String str, String str2, String str3, String str4) throws IOException, zzZQS;

    public void zzX(String str) throws IOException {
        zzr(str, 0, str.length());
    }

    public abstract void zzX(String str, char[] cArr, int i) throws IOException, zzZQS;

    public abstract void zzXA(String str, String str2) throws IOException;

    public abstract void zzXB(String str, String str2) throws IOException, zzZQS;

    public abstract int zzXC(String str, String str2) throws IOException, zzZQS;

    public final int zzXLQ() {
        return zzXM2() + this.zzWJx;
    }

    public abstract void zzXM0() throws IOException;

    public abstract void zzXM1() throws IOException;

    public abstract int zzXM2();

    public abstract void zzY(char[] cArr, int i, int i2) throws IOException;

    public abstract void zzZ(String str, String str2, char[] cArr, int i) throws IOException, zzZQS;

    public final void zzZU(String str, boolean z) throws zzZQS {
        if (str == null || str.length() == 0) {
            zzxn(zzZH9.zzWOZ);
        }
        int iZzJ = zzZF3.zzJ(str, z, this.zzWQ6);
        if (iZzJ >= 0) {
            if (iZzJ == 0) {
                zzH(zzZH9.zzWOY, zzZF3.zzXl(str.charAt(0)));
            }
            zzH(zzZH9.zzWOX, zzZF3.zzXl(str.charAt(iZzJ)));
        }
    }

    public final char zzgi(int i) throws IOException {
        flush();
        zzZHD zzzhdZzXP7 = this.zzWM6.zzXP7();
        if (zzzhdZzXP7 == null) {
            zzzhdZzXP7 = zzZHD.zzZ.zzXPU();
        }
        return zzzhdZzXP7.zzha(i);
    }

    public abstract void zzh(String str, String str2, String str3) throws IOException, zzZQS;

    public abstract void zzr(String str, int i, int i2) throws IOException;

    public abstract void zzxf(String str) throws IOException;

    public abstract void zzxg(String str) throws IOException, zzZQS;

    public abstract void zzxh(String str) throws IOException, zzZQS;

    public abstract int zzxi(String str) throws IOException, zzZQS;

    public abstract int zzxj(String str) throws IOException, zzZQS;
}
