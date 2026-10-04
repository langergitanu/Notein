package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.yn */
/* JADX INFO: loaded from: classes3.dex */
class C3113yn {

    /* JADX INFO: renamed from: du */
    private static int f9246du;

    /* JADX INFO: renamed from: kk */
    private static final String[] f9247kk = {"video/mpeg", "mpg", "video/avi", "avi", "video/x-ms-wmv", "wmv", "video/unknown", "3gp", "video/unknown", "3g2", "video/mp4", "mp4", "video/unknown", "mkv"};

    /* JADX INFO: renamed from: to */
    private static final int[][] f9248to;

    /* JADX INFO: renamed from: k4 */
    private final byte[] f9249k4;

    /* JADX INFO: renamed from: x1 */
    private final int f9250x1 = m13276to();

    static {
        int[][] iArr = {new int[]{0, 0, 1, 4016}, new int[]{82, 73, 70, 70, 65280, 65280, 65280, 65280, 65, 86, 73, 32, 76, 73, 83, 84}, new int[]{48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108}, new int[]{0, 0, 0, 20, 102, 116, 121, 112, 51, 103, 112}, new int[]{0, 0, 0, 32, 102, 116, 121, 112, 51, 103, 112}, new int[]{0, 0, 0, 65280, 102, 116, 121, 112}, new int[]{26, 69, 223, 163, 147, 66, 130, 136, 109, 97, 116, 114, 111, 115, 107, 97}};
        f9248to = iArr;
        f9246du = 0;
        for (int[] iArr2 : iArr) {
            if (iArr2.length > f9246du) {
                f9246du = iArr2.length;
            }
        }
    }

    public C3113yn(byte[] bArr) {
        this.f9249k4 = bArr;
    }

    /* JADX INFO: renamed from: to */
    private int m13276to() {
        if (this.f9249k4.length < f9246du) {
            return -1;
        }
        int i = 0;
        while (true) {
            int[][] iArr = f9248to;
            if (i >= iArr.length) {
                return -1;
            }
            int[] iArr2 = iArr[i];
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                int i3 = iArr2[i2] & 65535;
                int i4 = ((byte) (~(i3 >> 8))) & 255;
                if ((i3 & i4) != (i4 & this.f9249k4[i2] & 255)) {
                    break;
                }
            }
            return i;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13277k4() {
        return this.f9250x1 != -1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m13278kk() {
        if (m13277k4()) {
            return f9247kk[(this.f9250x1 * 2) + 1];
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m13279x1() {
        if (m13277k4()) {
            return f9247kk[this.f9250x1 * 2];
        }
        return null;
    }
}
