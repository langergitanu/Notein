package com.google.common.collect;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
final class Hashing {

    /* JADX INFO: renamed from: C1 */
    private static final long f51704C1 = -862048943;

    /* JADX INFO: renamed from: C2 */
    private static final long f51705C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
    }

    public static int closedTableSize(int i, double d) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    public static boolean needsResizing(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < 1073741824;
    }

    public static int smear(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * f51704C1), 15)) * f51705C2);
    }

    public static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
