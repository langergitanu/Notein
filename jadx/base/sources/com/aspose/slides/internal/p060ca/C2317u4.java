package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.u4 */
/* JADX INFO: loaded from: classes3.dex */
class C2317u4 {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f8005k4 = new ArrayList();

    /* JADX INFO: renamed from: x1 */
    private int f8007x1 = -1;

    /* JADX INFO: renamed from: kk */
    private int f8006kk = -1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.u4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public byte[] f8008k4;

        /* JADX INFO: renamed from: kk */
        public int f8009kk;

        /* JADX INFO: renamed from: x1 */
        public int f8010x1;

        private k4() {
        }
    }

    public C2317u4() {
    }

    /* JADX INFO: renamed from: kk */
    private k4 m11472kk() {
        return (k4) this.f8005k4.get_Item(this.f8007x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m11473k4(int i) {
        if (i < m11472kk().f8009kk) {
            return m11472kk().f8008k4[m11472kk().f8010x1 + i];
        }
        throw new IndexOutOfRangeException();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m11477x1() {
        return ((k4) this.f8005k4.get_Item(this.f8007x1)).f8009kk;
    }

    public C2317u4(byte[] bArr) {
        m11475k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11474k4() {
        int i = this.f8007x1;
        if (i > 0) {
            this.f8007x1 = i - 1;
        }
    }

    public C2317u4(byte[] bArr, int i, int i2) {
        m11476k4(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11475k4(byte[] bArr) {
        m11476k4(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11476k4(byte[] bArr, int i, int i2) {
        int i3 = this.f8007x1;
        int i4 = this.f8006kk;
        if (i3 < i4) {
            this.f8007x1 = i3 + 1;
        } else {
            this.f8007x1 = i3 + 1;
            this.f8006kk = i4 + 1;
            this.f8005k4.addItem(new k4());
        }
        m11472kk().f8008k4 = bArr;
        m11472kk().f8010x1 = i;
        m11472kk().f8009kk = i2;
    }
}
