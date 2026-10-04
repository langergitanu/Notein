package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3046du {

    /* JADX INFO: renamed from: du */
    private static final String[] f8953du = {"audio/wav", "wav", "audio/x-ms-wma", "wma", "audio/unknown", "mp3", "audio/unknown", "mp3", "audio/unknown", "m4a"};

    /* JADX INFO: renamed from: h4 */
    private static final int[][] f8954h4;

    /* JADX INFO: renamed from: m9 */
    private static int f8955m9;

    /* JADX INFO: renamed from: k4 */
    private final byte[] f8956k4;

    /* JADX INFO: renamed from: kk */
    private final String f8957kk;

    /* JADX INFO: renamed from: to */
    private final boolean f8958to;

    /* JADX INFO: renamed from: x1 */
    private final String f8959x1;

    static {
        int[][] iArr = {new int[]{82, 73, 70, 70, 65280, 65280, 65280, 65280, 87, 65, 86, 69, 102, 109, 116, 32}, new int[]{48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108}, new int[]{73, 68, 51}, new int[]{255, 8176}, new int[]{0, 0, 0, 65280, 102, 116, 121, 112, 77, 52, 65, 32}};
        f8954h4 = iArr;
        f8955m9 = 0;
        for (int[] iArr2 : iArr) {
            if (iArr2.length > f8955m9) {
                f8955m9 = iArr2.length;
            }
        }
    }

    public C3046du(byte[] bArr) {
        String str;
        int iM12840to;
        this.f8956k4 = bArr;
        if (bArr == null || bArr.length <= f8955m9 || (iM12840to = m12840to()) < 0) {
            this.f8958to = false;
            str = null;
            this.f8959x1 = null;
        } else {
            this.f8958to = true;
            String[] strArr = f8953du;
            int i = iM12840to * 2;
            this.f8959x1 = strArr[i];
            str = strArr[i + 1];
        }
        this.f8957kk = str;
    }

    /* JADX INFO: renamed from: to */
    private int m12840to() {
        int i = 0;
        while (true) {
            int[][] iArr = f8954h4;
            if (i >= iArr.length) {
                return -1;
            }
            int[] iArr2 = iArr[i];
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                int i3 = iArr2[i2] & 65535;
                int i4 = ((byte) (~(i3 >> 8))) & 255;
                if ((i3 & i4) != (i4 & this.f8956k4[i2] & 255)) {
                    break;
                }
            }
            return i;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m12841k4() {
        return this.f8959x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m12842kk() {
        return this.f8958to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m12843x1() {
        return this.f8957kk;
    }
}
