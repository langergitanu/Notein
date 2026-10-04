package com.aspose.slides.internal.p085dk;

import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3176kk {

    /* JADX INFO: renamed from: k4 */
    private final String f9445k4;

    /* JADX INFO: renamed from: x1 */
    private int f9446x1;

    public C3176kk(byte[] bArr, int i, int i2) {
        this.f9445k4 = C14080ne.m66953k4(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13595k4() {
        int iM67507x1 = C14116yg.m67507x1(76, this.f9445k4.length() - this.f9446x1);
        String strM67443x1 = C14113y2.m67443x1(this.f9445k4, this.f9446x1, iM67507x1);
        this.f9446x1 += iM67507x1;
        return strM67443x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m13596x1() {
        return this.f9446x1 >= this.f9445k4.length();
    }
}
