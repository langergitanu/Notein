package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6991jd extends AbstractC7020m9<C6991jd> {

    /* JADX INFO: renamed from: c5 */
    public long f19010c5;

    /* JADX INFO: renamed from: ck */
    public long f19011ck;

    /* JADX INFO: renamed from: du */
    public int f19012du;

    /* JADX INFO: renamed from: dy */
    public long f19013dy;

    /* JADX INFO: renamed from: fa */
    public long f19014fa;

    /* JADX INFO: renamed from: h4 */
    public int f19015h4;

    /* JADX INFO: renamed from: jd */
    public long f19016jd;

    /* JADX INFO: renamed from: k4 */
    public long f19017k4;

    /* JADX INFO: renamed from: kk */
    public long f19018kk;

    /* JADX INFO: renamed from: ne */
    public byte[] f19021ne;

    /* JADX INFO: renamed from: rv */
    public long f19022rv;

    /* JADX INFO: renamed from: to */
    public int f19023to;

    /* JADX INFO: renamed from: up */
    public long f19024up;

    /* JADX INFO: renamed from: x1 */
    public long f19025x1;

    /* JADX INFO: renamed from: x6 */
    public byte[] f19026x6;

    /* JADX INFO: renamed from: yj */
    public int f19027yj;

    /* JADX INFO: renamed from: m9 */
    public C7009x1 f19020m9 = new C7009x1();

    /* JADX INFO: renamed from: ks */
    public C6987e0 f19019ks = new C6987e0();

    /* JADX INFO: renamed from: x1 */
    private boolean m27358x1(C6991jd c6991jd) {
        return c6991jd.f19017k4 == this.f19017k4 && c6991jd.f19025x1 == this.f19025x1 && c6991jd.f19018kk == this.f19018kk && c6991jd.f19023to == this.f19023to && c6991jd.f19012du == this.f19012du && c6991jd.f19015h4 == this.f19015h4 && C14067j2.m66728k4(c6991jd.f19020m9, this.f19020m9) && c6991jd.f19013dy == this.f19013dy && c6991jd.f19010c5 == this.f19010c5 && c6991jd.f19016jd == this.f19016jd && c6991jd.f19011ck == this.f19011ck && c6991jd.f19014fa == this.f19014fa && c6991jd.f19024up == this.f19024up && c6991jd.f19027yj == this.f19027yj && C14067j2.m66728k4(c6991jd.f19019ks, this.f19019ks) && c6991jd.f19022rv == this.f19022rv && C14067j2.m66728k4(c6991jd.f19026x6, this.f19026x6) && C14067j2.m66728k4(c6991jd.f19021ne, this.f19021ne);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C6991jd) {
            return m27358x1((C6991jd) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C6991jd Clone() {
        C6991jd c6991jd = new C6991jd();
        CloneTo(c6991jd);
        return c6991jd;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("[Size={0};", C7019kk.m27449k4(this.f19017k4));
        c6765kp.m26796k4(" CmmId={0};", C7019kk.m27449k4(this.f19025x1));
        byte[] bArrM66776k4 = C14069jd.m66776k4(this.f19018kk);
        c6765kp.m26796k4(" Version={0:x}.{1:x}.{2:x}.{3:x};", C7019kk.m27445k4(bArrM66776k4[3]), C7019kk.m27445k4(bArrM66776k4[2]), C7019kk.m27445k4(bArrM66776k4[1]), C7019kk.m27445k4(bArrM66776k4[0]));
        c6765kp.m26796k4(" DeviceClass={0};", C6979b3.m27303du(this.f19023to));
        c6765kp.m26796k4(" ColorSpace={0};", C7019kk.m27466x1(this.f19012du));
        c6765kp.m26796k4(" Pcs={0};", C7019kk.m27466x1(this.f19015h4));
        c6765kp.m26796k4(" Date={0};", C7019kk.m27451k4(this.f19020m9));
        byte[] bArrM66776k42 = C14069jd.m66776k4(this.f19013dy);
        c6765kp.m26796k4(" Magic={0}{1}{2}{3};", C7019kk.m27446k4((char) bArrM66776k42[3]), C7019kk.m27446k4((char) bArrM66776k42[2]), C7019kk.m27446k4((char) bArrM66776k42[1]), C7019kk.m27446k4((char) bArrM66776k42[0]));
        c6765kp.m26796k4(" Platform={0};", C7019kk.m27449k4(this.f19010c5));
        c6765kp.m26796k4(" Flags={0};", C7019kk.m27449k4(this.f19016jd));
        c6765kp.m26796k4(" Manufacturer={0};", C7019kk.m27449k4(this.f19011ck));
        c6765kp.m26796k4(" Model={0};", C7019kk.m27449k4(this.f19014fa));
        c6765kp.m26796k4(" Attributes={0};", C7019kk.m27449k4(this.f19024up));
        c6765kp.m26796k4(" RenderingIntent={0};", C7019kk.m27466x1(this.f19027yj));
        c6765kp.m26796k4(" Illuminant={0};", C7019kk.m27451k4(this.f19019ks));
        c6765kp.m26796k4(" Creator={0};", C7019kk.m27449k4(this.f19022rv));
        C6765kp c6765kp2 = new C6765kp();
        for (byte b : this.f19026x6) {
            c6765kp2.m26796k4("{0:x}", C7019kk.m27445k4(b));
        }
        c6765kp.m26796k4(" ProfileID={0};", c6765kp2);
        c6765kp.m26796k4(" Reserved={0}]", C7019kk.m27445k4(this.f19021ne[0]));
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C6991jd c6991jd) {
        c6991jd.f19017k4 = this.f19017k4;
        c6991jd.f19025x1 = this.f19025x1;
        c6991jd.f19018kk = this.f19018kk;
        c6991jd.f19023to = this.f19023to;
        c6991jd.f19012du = this.f19012du;
        c6991jd.f19015h4 = this.f19015h4;
        this.f19020m9.CloneTo(c6991jd.f19020m9);
        c6991jd.f19013dy = this.f19013dy;
        c6991jd.f19010c5 = this.f19010c5;
        c6991jd.f19016jd = this.f19016jd;
        c6991jd.f19011ck = this.f19011ck;
        c6991jd.f19014fa = this.f19014fa;
        c6991jd.f19024up = this.f19024up;
        c6991jd.f19027yj = this.f19027yj;
        this.f19019ks.CloneTo(c6991jd.f19019ks);
        c6991jd.f19022rv = this.f19022rv;
        c6991jd.f19026x6 = this.f19026x6;
        c6991jd.f19021ne = this.f19021ne;
    }
}
