package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TextColumnCollection {
    private PageSetup zzXnQ;

    public TextColumnCollection(PageSetup pageSetup) {
        this.zzXnQ = pageSetup;
    }

    private int getColumnsCount() {
        return ((Integer) zzPj(2350)).intValue();
    }

    private Object zzPj(int i) {
        return this.zzXnQ.zzYpQ().fetchSectionAttr(i);
    }

    private void zzQ(int i, Object obj) {
        if (i != 2350) {
            this.zzXnQ.zzYpQ().setSectionAttr(i, obj);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        zzmy(iIntValue);
        zzYcn().setCount(iIntValue);
    }

    private zzY5Y zzYcn() {
        zzY5Y zzy5y = (zzY5Y) this.zzXnQ.zzYpQ().getDirectSectionAttr(2380);
        if (zzy5y != null) {
            return zzy5y;
        }
        zzY5Y zzy5y2 = new zzY5Y();
        zzy5y2.setCount(getColumnsCount());
        this.zzXnQ.zzYpQ().setSectionAttr(2380, zzy5y2);
        return zzy5y2;
    }

    private void zzmy(int i) {
        this.zzXnQ.zzYpQ().setSectionAttr(2350, Integer.valueOf(i));
    }

    public TextColumn get(int i) {
        return zzYcn().get(i);
    }

    public int getCount() {
        return getColumnsCount();
    }

    public boolean getEvenlySpaced() {
        return ((Boolean) zzPj(2360)).booleanValue();
    }

    public boolean getLineBetween() {
        return ((Boolean) zzPj(EditingLanguage.FRENCH_BELGIUM)).booleanValue();
    }

    public double getSpacing() {
        return ((double) ((Integer) zzPj(2370)).intValue()) / 20.0d;
    }

    public double getWidth() {
        return (this.zzXnQ.zzYpU() - (getSpacing() * ((double) (getCount() - 1)))) / ((double) getCount());
    }

    public void setCount(int i) {
        if (i <= 0 || i > 45) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: newCount");
        }
        zzQ(2350, Integer.valueOf(i));
    }

    public void setEvenlySpaced(boolean z) {
        zzQ(2360, Boolean.valueOf(z));
    }

    public void setLineBetween(boolean z) {
        this.zzXnQ.zzYpQ().setSectionAttr(EditingLanguage.FRENCH_BELGIUM, Boolean.valueOf(z));
    }

    public void setSpacing(double d) {
        zzQ(2370, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }
}
