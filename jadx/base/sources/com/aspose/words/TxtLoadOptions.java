package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TxtLoadOptions extends LoadOptions {
    private int zzX1I;
    private int zzX1J;
    private boolean zzX1K;
    private int zzX1L;
    private int zzX1M;
    private int zzX1N;
    private boolean zzX1O;
    private boolean zzX1P;

    public TxtLoadOptions() {
        this.zzX1O = true;
        this.zzX1N = 0;
        this.zzX1M = 0;
        this.zzX1L = 0;
        this.zzX1K = true;
        this.zzX1J = -16776961;
        this.zzX1I = 1;
    }

    public boolean getAutoNumberingDetection() {
        return this.zzX1K;
    }

    public boolean getDetectHyperlinks() {
        return this.zzX1P;
    }

    public boolean getDetectNumberingWithWhitespaces() {
        return this.zzX1O;
    }

    public int getDocumentDirection() {
        return this.zzX1L;
    }

    public int getLeadingSpacesOptions() {
        return this.zzX1N;
    }

    public int getTrailingSpacesOptions() {
        return this.zzX1M;
    }

    public void setAutoNumberingDetection(boolean z) {
        this.zzX1K = z;
    }

    public void setDetectHyperlinks(boolean z) {
        this.zzX1P = z;
    }

    public void setDetectNumberingWithWhitespaces(boolean z) {
        this.zzX1O = z;
    }

    public void setDocumentDirection(int i) {
        this.zzX1L = i;
    }

    public void setLeadingSpacesOptions(int i) {
        this.zzX1N = i;
    }

    public void setTrailingSpacesOptions(int i) {
        this.zzX1M = i;
    }

    public final int zzXUI() {
        return this.zzX1I;
    }

    public final int zzXUJ() {
        return this.zzX1J;
    }

    public TxtLoadOptions(LoadOptions loadOptions) {
        super(loadOptions);
        this.zzX1O = true;
        this.zzX1N = 0;
        this.zzX1M = 0;
        this.zzX1L = 0;
        this.zzX1K = true;
        this.zzX1J = -16776961;
        this.zzX1I = 1;
    }
}
