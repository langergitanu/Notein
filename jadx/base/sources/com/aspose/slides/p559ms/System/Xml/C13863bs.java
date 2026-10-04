package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p294n9.AbstractC6760h4;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.bs */
/* JADX INFO: loaded from: classes5.dex */
public class C13863bs extends AbstractC6760h4 {
    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26685k4(byte[] bArr, int i, int i2) {
        return i2;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26687k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        for (int i4 = i; i4 < i + i2; i4++) {
            cArr[i3] = (char) (bArr[i4] & 255);
            i3++;
        }
        return i2;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public void mo26739k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        if (i4 < i2) {
            zArr[0] = false;
            i2 = i4;
        } else {
            zArr[0] = true;
        }
        int i5 = i + i2;
        while (i < i5) {
            cArr[i3] = (char) (bArr[i] & 255);
            i3++;
            i++;
        }
        iArr2[0] = i2;
        iArr[0] = i2;
    }
}
