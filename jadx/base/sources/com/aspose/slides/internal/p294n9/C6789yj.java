package com.aspose.slides.internal.p294n9;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6789yj extends C6755du {
    public C6789yj() {
        super(51932, 932);
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du
    /* JADX INFO: renamed from: k4 */
    public void mo26742k4(char[] cArr) {
        for (int i = 161; i <= 254; i++) {
            cArr[i] = 65534;
        }
        cArr[142] = 65534;
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du
    /* JADX INFO: renamed from: k4 */
    public boolean mo26625k4(int[] iArr) {
        byte b;
        int i = iArr[0];
        if (i >= 256) {
            if (i >= 64064 && i <= 64587) {
                if (i < 64064 || i > 64091) {
                    if (i >= 64092 && i <= 64587) {
                        int i2 = ((byte) i) & 255;
                        if (i2 < 92) {
                            iArr[0] = i - 3423;
                        } else if (i2 < 128 || i2 > 155) {
                            iArr[0] = i - 3356;
                        } else {
                            iArr[0] = i - 3357;
                        }
                    }
                } else if (i <= 64073) {
                    iArr[0] = i - 2897;
                } else if (i >= 64074 && i <= 64083) {
                    iArr[0] = i - 29430;
                } else if (i >= 64084 && i <= 64087) {
                    iArr[0] = i - 2907;
                } else if (i == 64088) {
                    iArr[0] = 34698;
                } else if (i == 64089) {
                    iArr[0] = 34690;
                } else if (i == 64090) {
                    iArr[0] = 34692;
                } else if (i == 64091) {
                    iArr[0] = 34714;
                }
            }
            int i3 = iArr[0];
            byte b2 = (byte) (i3 >> 8);
            byte b3 = (byte) i3;
            int i4 = b2 & 255;
            byte b4 = (byte) (((((byte) (i4 - ((i4 > 159 ? -79 : 113) & 255))) & 255) << 1) + 1);
            int i5 = b3 & 255;
            if (i5 > 158) {
                b = (byte) (i5 - 126);
                b4 = (byte) (b4 + 1);
            } else {
                if (i5 > 126) {
                    b3 = (byte) (b3 - 1);
                }
                b = (byte) ((b3 & 255) - 31);
            }
            int i6 = (b & 255) | ((b4 & 255) << 8) | 32896;
            iArr[0] = i6;
            if ((i6 & 65280) < 41216 || (65280 & i6) > 65024 || (i6 & 255) < 161 || (i6 & 255) > 254) {
                return false;
            }
        } else {
            if (i >= 161 && i <= 223) {
                iArr[0] = i | 36352;
                return true;
            }
            if (i >= 129 && i != 160 && i != 255) {
                return false;
            }
        }
        return true;
    }
}
