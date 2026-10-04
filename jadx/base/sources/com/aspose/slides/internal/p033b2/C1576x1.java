package com.aspose.slides.internal.p033b2;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p200j6.AbstractC5200du;
import com.aspose.slides.internal.p200j6.C5210to;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.b2.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1576x1 extends AbstractC5200du {

    /* JADX INFO: renamed from: k4 */
    private final C7187kk f6091k4;

    /* JADX INFO: renamed from: kk */
    private C5210to f6092kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5200du f6093x1;

    public C1576x1(C7187kk c7187kk) {
        this.f6091k4 = c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1576x1 m8466k4(C7187kk c7187kk) {
        int iM27796k4 = c7187kk.m27796k4(C7182dy.f19680wh, 0);
        if (iM27796k4 == 1) {
            return new C1575to(c7187kk);
        }
        if (iM27796k4 == 2) {
            return new C1574kk(c7187kk);
        }
        throw new NotSupportedException(C14113y2.m67402k4("Unknown pattern type is encountered: {0}", Integer.valueOf(iM27796k4)));
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du, com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public C7185jd mo8461c5() {
        return this.f6091k4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f6092kk == null) {
            this.f6092kk = new C5210to(new float[0], null);
        }
        return this.f6092kk;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return C7182dy.f19507l6.m27766k4();
    }

    public C1576x1(C7187kk c7187kk, AbstractC5200du abstractC5200du) {
        this.f6091k4 = c7187kk;
        this.f6093x1 = abstractC5200du;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        return new float[]{1.0f, 1.0f, 1.0f};
    }
}
