package com.aspose.slides.internal.p483ws;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.m9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12290m9 extends AbstractC12289kk {

    /* JADX INFO: renamed from: k4 */
    private C10029c5[] f41157k4;

    public C12290m9(int i) {
        super(i);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: ck */
    public AbstractC14092to mo57541ck() {
        return AbstractC14092to.m67208k4((Object) this.f41157k4);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: fa */
    public long mo57542fa() {
        return 8L;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: jd */
    public AbstractC10031du mo49283jd() {
        return new C12290m9(m49297kk());
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49296k4(AbstractC10031du abstractC10031du) {
        ((C12290m9) abstractC10031du).f41157k4 = m57552x1(this.f41157k4);
        super.mo49296k4(abstractC10031du);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: kk */
    public void mo57543kk(C6304x1 c6304x1) {
        throw new NotImplementedException("The tag value cannot fit 4 bytes.");
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: m9 */
    public Object mo49287m9() {
        return this.f41157k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: to */
    public int mo49288to() {
        return 5;
    }

    /* JADX INFO: renamed from: up */
    public C10029c5[] m57554up() {
        return this.f41157k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public long mo49289x1(C6304x1 c6304x1) {
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        C10029c5[] c10029c5Arr = this.f41157k4;
        if (c10029c5Arr == null || c10029c5Arr.length == 0) {
            c10029c5Arr = new C10029c5[]{new C10029c5()};
        }
        c6304x1.m25845k4(c10029c5Arr);
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(c10029c5Arr.length), 9)), 10) * 8), 10);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49285k4(Object obj) {
        if (obj != null && !C7019kk.m27469x1(obj, C10029c5[].class)) {
            throw new ArgumentException("Only TiffRational array is supported.");
        }
        this.f41157k4 = (C10029c5[]) C7019kk.m27452k4(obj, C10029c5[].class);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public void mo49290x1(C6304x1 c6304x1, long j) {
        c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(c6304x1.m25854up()), 10), 0);
        this.f41157k4 = c6304x1.m25837h4(j);
    }

    /* JADX INFO: renamed from: x1 */
    private static C10029c5[] m57552x1(C10029c5[] c10029c5Arr) {
        if (c10029c5Arr == null) {
            return null;
        }
        C10029c5[] c10029c5Arr2 = new C10029c5[c10029c5Arr.length];
        for (long j = 0; C7019kk.m27435du(Long.valueOf(j), 10) < c10029c5Arr.length; j++) {
            int i = (int) j;
            c10029c5Arr2[i] = c10029c5Arr[i];
        }
        return c10029c5Arr2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m57553k4(C10029c5[] c10029c5Arr) {
        this.f41157k4 = c10029c5Arr;
    }
}
