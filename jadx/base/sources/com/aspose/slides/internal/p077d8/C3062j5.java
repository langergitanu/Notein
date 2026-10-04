package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.j5 */
/* JADX INFO: loaded from: classes3.dex */
class C3062j5 {

    /* JADX INFO: renamed from: k4 */
    private C3070m2 f9094k4;

    public C3062j5(C3070m2 c3070m2) {
        this.f9094k4 = c3070m2;
    }

    /* JADX INFO: renamed from: k4 */
    public int[] m12957k4(int i, int i2) throws Exception {
        int[] iArr = new int[this.f9094k4.m12971k4().size()];
        iArr[0] = (int) ((((long) i) & 4294967295L) + (((long) i2) & 4294967295L));
        if (this.f9094k4.m12971k4().size() > 0) {
            int size = (this.f9094k4.m12971k4().size() / 2) + 1;
            byte[] byteArray = this.f9094k4.m12971k4().toByteArray();
            for (int i3 = 0; i3 < size; i3++) {
                if (byteArray[i3] != ((byte) this.f9094k4.m12976x1().m12982x1()[i3])) {
                    C3102wz.m13203k4(150);
                }
                iArr[i3] = byteArray[i3] & 255;
            }
            C3102wz.m13204k4(false);
        }
        return iArr;
    }
}
