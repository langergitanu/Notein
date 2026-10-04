package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWF extends com.aspose.words.internal.zzZYV<Node> {
    public final void zzWz(int i, int i2) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey != -1) {
            while (iIndexOfKey < getCount()) {
                int[] iArrZzrc = zzrc();
                iArrZzrc[iIndexOfKey] = iArrZzrc[iIndexOfKey] + i2;
                iIndexOfKey++;
            }
        }
    }

    public final void zzZ(int i, int i2, Node node) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey == -1) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: key");
        }
        if (iIndexOfKey > 0 && zzrc()[iIndexOfKey - 1] >= i2) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: newKey");
        }
        if (iIndexOfKey < getCount() - 1 && zzrc()[iIndexOfKey + 1] <= i2) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: newKey");
        }
        zzrc()[iIndexOfKey] = i2;
        zzr()[iIndexOfKey] = node;
    }
}
