package com.aspose.slides.internal.p383rp;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p185il.C5103kk;
import com.aspose.slides.internal.p195iy.C5138x1;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p448ur.C11545c5;
import com.aspose.slides.internal.p448ur.C11552to;
import com.aspose.slides.internal.p483ws.C12294yj;
import com.aspose.slides.internal.p515xz.C12756to;
import com.aspose.slides.internal.p550zi.C13608ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.du */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10031du implements Comparable {

    /* JADX INFO: renamed from: k4 */
    private int f36079k4;

    public AbstractC10031du(int i) {
        this.f36079k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10031du m49291k4(C6304x1 c6304x1) {
        C6304x1 c6304x12;
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        int iM25858yj = c6304x1.m25858yj();
        int iM25858yj2 = c6304x1.m25858yj();
        long jM25854up = c6304x1.m25854up();
        AbstractC10031du abstractC10031duM22005k4 = C5138x1.m22005k4(iM25858yj2, iM25858yj);
        if (abstractC10031duM22005k4 == null) {
            c6304x12 = c6304x1;
            abstractC10031duM22005k4 = new C12294yj(c6304x12, iM25858yj2, iM25858yj, jM25854up, c6304x1.m25854up());
        } else {
            c6304x12 = c6304x1;
        }
        abstractC10031duM22005k4.f36079k4 = iM25858yj;
        if (!C7019kk.m27469x1(abstractC10031duM22005k4, C12294yj.class)) {
            abstractC10031duM22005k4.mo49290x1(c6304x12, jM25854up);
        }
        return abstractC10031duM22005k4;
    }

    /* JADX INFO: renamed from: c5 */
    public AbstractC10031du m49292c5() {
        AbstractC10031du abstractC10031duMo49283jd = mo49283jd();
        mo49296k4(abstractC10031duMo49283jd);
        return abstractC10031duMo49283jd;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC10031du.class)) {
            return C7019kk.m27462to(Integer.valueOf(this.f36079k4), 8) - C7019kk.m27462to(Integer.valueOf(((AbstractC10031du) obj).f36079k4), 8);
        }
        throw new C5103kk("Expected TiffDataType type.");
    }

    /* JADX INFO: renamed from: du */
    public long m49293du() {
        return C13608ne.m62779k4(mo49282h4());
    }

    /* JADX INFO: renamed from: dy */
    public boolean m49294dy() {
        return C7019kk.m27435du(Long.valueOf(mo49284k4()), 10) > 0;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract long mo49282h4();

    /* JADX INFO: renamed from: jd */
    public abstract AbstractC10031du mo49283jd();

    /* JADX INFO: renamed from: k4 */
    public abstract long mo49284k4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo49285k4(Object obj);

    /* JADX INFO: renamed from: kk */
    public int m49297kk() {
        return C7019kk.m27462to(Integer.valueOf(this.f36079k4), 8);
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo49286kk(C6304x1 c6304x1, long j);

    /* JADX INFO: renamed from: m9 */
    public abstract Object mo49287m9();

    /* JADX INFO: renamed from: to */
    public abstract int mo49288to();

    public String toString() {
        String string;
        Object objMo49287m9 = mo49287m9();
        if (C7019kk.m27469x1(objMo49287m9, AbstractC14092to.class)) {
            C6765kp c6765kp = new C6765kp();
            c6765kp.m26780k4('{');
            AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27452k4(objMo49287m9, AbstractC14092to.class);
            for (int i = 0; i < abstractC14092to.m67265du(); i++) {
                if (i < abstractC14092to.m67265du() - 1) {
                    c6765kp.m26796k4("{0}, ", abstractC14092to.m67275kk(i));
                } else {
                    c6765kp.m26791k4(abstractC14092to.m67275kk(i));
                    c6765kp.m26780k4('}');
                }
            }
            string = c6765kp.toString();
        } else {
            string = mo49287m9() != null ? mo49287m9().toString() : null;
        }
        return C14113y2.m67408k4("Tag: ", AbstractC14106wy.getName((Class<?>) C11545c5.class, m49297kk()), " Type: ", AbstractC14106wy.getName((Class<?>) C11552to.class, mo49288to()), " Count: ", C14114y9.m67465x1(mo49284k4()), " Value: ", string);
    }

    /* JADX INFO: renamed from: x1 */
    public int m49298x1() {
        return this.f36079k4;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract long mo49289x1(C6304x1 c6304x1);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo49290x1(C6304x1 c6304x1, long j);

    /* JADX INFO: renamed from: k4 */
    public void m49295k4(C6304x1 c6304x1, long j) {
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        try {
            c6304x1.m25836h4(this.f36079k4);
            c6304x1.m25836h4(mo49288to());
            c6304x1.m25855up(mo49284k4());
            mo49286kk(c6304x1, j);
        } catch (RuntimeException e) {
            throw new C12756to(C14113y2.m67408k4("Unable to Write values for ", AbstractC14106wy.getName((Class<?>) C11552to.class, mo49288to()), " Message : ", e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo49296k4(AbstractC10031du abstractC10031du) {
        abstractC10031du.f36079k4 = this.f36079k4;
    }
}
