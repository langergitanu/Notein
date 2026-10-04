package com.aspose.slides.internal.p407st;

import com.aspose.slides.PptReadException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.m4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10535m4 {

    /* JADX INFO: renamed from: du */
    private int f37208du;

    /* JADX INFO: renamed from: h4 */
    private int f37209h4;

    /* JADX INFO: renamed from: k4 */
    private int f37210k4;

    /* JADX INFO: renamed from: kk */
    private boolean f37211kk;

    /* JADX INFO: renamed from: m9 */
    private int f37212m9;

    /* JADX INFO: renamed from: to */
    private boolean f37213to;

    /* JADX INFO: renamed from: x1 */
    private boolean f37214x1;

    public C10535m4(byte[] bArr) {
        int[] iArr = {this.f37210k4};
        boolean[] zArr = {this.f37214x1};
        boolean[] zArr2 = {this.f37211kk};
        boolean[] zArr3 = {this.f37213to};
        int[] iArr2 = {this.f37208du};
        int[] iArr3 = {this.f37209h4};
        int[] iArr4 = {this.f37212m9};
        m51264k4(bArr, iArr, zArr, zArr2, zArr3, iArr2, iArr3, iArr4);
        this.f37210k4 = iArr[0];
        this.f37214x1 = zArr[0];
        this.f37211kk = zArr2[0];
        this.f37213to = zArr3[0];
        this.f37208du = iArr2[0];
        this.f37209h4 = iArr3[0];
        this.f37212m9 = iArr4[0];
    }

    /* JADX INFO: renamed from: du */
    public int m51265du() {
        return this.f37208du;
    }

    /* JADX INFO: renamed from: h4 */
    public int m51266h4() {
        return this.f37209h4;
    }

    /* JADX INFO: renamed from: k4 */
    public int m51267k4() {
        return this.f37210k4;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m51268kk() {
        return this.f37211kk;
    }

    /* JADX INFO: renamed from: m9 */
    public int m51269m9() {
        return this.f37212m9;
    }

    /* JADX INFO: renamed from: to */
    public boolean m51270to() {
        return this.f37213to;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m51271x1() {
        return this.f37214x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m51264k4(byte[] bArr, int[] iArr, boolean[] zArr, boolean[] zArr2, boolean[] zArr3, int[] iArr2, int[] iArr3, int[] iArr4) {
        if (bArr == null || bArr.length != 8) {
            throw new ArgumentException("The 'data' parameter should be byte[8] array.", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        int iM13257x1 = C3110yd.m13257x1(bArr, 0);
        zArr[0] = (iM13257x1 & 8192) != 0;
        zArr2[0] = (iM13257x1 & 16384) != 0;
        zArr3[0] = (32768 & iM13257x1) != 0;
        int i = iM13257x1 & 255;
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C10725y2.class), i)) {
            throw new PptReadException("Wrong sgf value in [ms-odraw] 2.2.58 SG structure.");
        }
        iArr[0] = i;
        iArr2[0] = C3110yd.m13257x1(bArr, 2);
        iArr3[0] = C3110yd.m13257x1(bArr, 4);
        iArr4[0] = C3110yd.m13257x1(bArr, 6);
    }
}
