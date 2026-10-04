package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJF {
    private int mVerticalAlignment;
    private int zzZim;

    private zzJF(int i, int i2) {
        this.zzZim = i;
        this.mVerticalAlignment = i2;
    }

    public static zzJF zzY(com.aspose.words.internal.zzZYT<String> zzzyt) {
        return new zzJF(zzzyt.containsKey("horzAlign") ? zz9Z.zzPY(zzzyt.get("horzAlign")) : 0, zzzyt.containsKey("vertAlign") ? zz9Z.zzPX(zzzyt.get("vertAlign")) : 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.aspose.words.internal.zzZQ4 zzZ(long j, com.aspose.words.internal.zzZQ4 zzzq4) {
        float x;
        float width;
        float x2;
        int i;
        float y;
        float height;
        float y2;
        int i2 = this.zzZim;
        if (i2 == 0) {
            x = zzzq4.getX();
            width = (zzzq4.getWidth() - Float.intBitsToFloat((int) j)) / 2.0f;
        } else {
            if (i2 == 1 || i2 == 2) {
                x2 = zzzq4.getX();
                i = this.mVerticalAlignment;
                if (i != 0) {
                    y = zzzq4.getY();
                    height = zzzq4.getHeight() - com.aspose.words.internal.zzZPW.zzYz(j);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new IllegalStateException("Unexpected alignment.");
                        }
                        y2 = zzzq4.getY();
                        return new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(x2, y2), j);
                    }
                    y = zzzq4.getY();
                    height = (zzzq4.getHeight() - com.aspose.words.internal.zzZPW.zzYz(j)) / 2.0f;
                }
                y2 = height + y;
                return new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(x2, y2), j);
            }
            if (i2 != 3) {
                throw new IllegalStateException("Unexpected alignment.");
            }
            x = zzzq4.getX();
            width = zzzq4.getWidth() - Float.intBitsToFloat((int) j);
        }
        x2 = width + x;
        i = this.mVerticalAlignment;
        if (i != 0) {
        }
        y2 = height + y;
        return new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(x2, y2), j);
    }
}
