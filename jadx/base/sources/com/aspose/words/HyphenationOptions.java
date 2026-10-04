package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class HyphenationOptions implements Cloneable {
    private boolean zzYk4;
    private int zzYk3 = 0;
    private int zzYk2 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
    private boolean zzYk1 = true;

    private static boolean zzyt(int i) {
        return i > 0 && i <= 31680;
    }

    private static boolean zzyu(int i) {
        return i >= 0 && i <= 32767;
    }

    public boolean getAutoHyphenation() {
        return this.zzYk4;
    }

    public int getConsecutiveHyphenLimit() {
        return this.zzYk3;
    }

    public boolean getHyphenateCaps() {
        return this.zzYk1;
    }

    public int getHyphenationZone() {
        return this.zzYk2;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setAutoHyphenation(boolean z) {
        this.zzYk4 = z;
    }

    public void setConsecutiveHyphenLimit(int i) {
        if (!zzyu(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYk3 = i;
    }

    public void setHyphenateCaps(boolean z) {
        this.zzYk1 = z;
    }

    public void setHyphenationZone(int i) {
        if (!zzyt(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYk2 = i;
    }

    public final HyphenationOptions zzYX6() {
        return (HyphenationOptions) memberwiseClone();
    }

    public final void zzyv(int i) {
        this.zzYk2 = i;
    }

    public final void zzyw(int i) {
        this.zzYk3 = i;
    }
}
