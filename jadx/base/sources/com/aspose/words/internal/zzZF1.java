package com.aspose.words.internal;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZF1 {
    protected int zzWLL;
    protected int zzWLM = 0;
    protected final String zzWLN;
    protected final zzZF1 zzWLO;

    public zzZF1(zzZF1 zzzf1, String str) {
        this.zzWLO = zzzf1;
        this.zzWLN = str;
    }

    public abstract void close() throws IOException;

    public final int getScopeId() {
        return this.zzWLM;
    }

    public abstract String getSystemId();

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("<WstxInputSource [class ");
        sb.append(getClass().toString());
        sb.append("]; systemId: ");
        sb.append(getSystemId());
        sb.append(", source: ");
        try {
            sb.append(zzXNH().toString());
        } catch (IOException e) {
            sb.append("[ERROR: " + e.getMessage() + "]");
        }
        sb.append('>');
        return sb.toString();
    }

    public abstract zzZF2 zzV(long j, int i, int i2);

    public abstract int zzW(zzZF3 zzzf3) throws IOException, zzZQS;

    public abstract void zzX(zzZF3 zzzf3);

    public final int zzXN5() {
        return this.zzWLL;
    }

    public final String zzXN6() {
        return this.zzWLN;
    }

    public final zzZF1 zzXN7() {
        return this.zzWLO;
    }

    public abstract boolean zzXNB();

    public abstract zzZF2 zzXNG();

    public abstract URL zzXNH() throws IOException;

    public abstract void zzY(zzZF3 zzzf3);

    public abstract void zzZ(zzZF3 zzzf3);

    public final void zzZ(zzZF3 zzzf3, int i, int i2) {
        this.zzWLM = i;
        this.zzWLL = i2;
        zzZ(zzzf3);
    }

    public abstract boolean zzZ(zzZF3 zzzf3, int i) throws IOException, zzZQS;

    public final boolean zzxM(String str) {
        if (str == null) {
            return false;
        }
        for (zzZF1 zzzf1 = this; zzzf1 != null; zzzf1 = zzzf1.zzWLO) {
            if (str == zzzf1.zzWLN) {
                return true;
            }
        }
        return false;
    }
}
