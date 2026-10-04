package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3094uz;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.os */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10579os extends AbstractC10657tu {

    /* JADX INFO: renamed from: k4 */
    private byte f37272k4;

    public AbstractC10579os(int i, short s) {
        super(i, (byte) 0);
        m51409um().m51917k4(i);
        m51409um().m51920k4(s);
        m51444k4((byte) -1);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10657tu, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return m51779m9().m66539k4().length + 1 + m51776dy().length;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10657tu
    /* JADX INFO: renamed from: kk */
    public byte[] mo50778kk() {
        return m51775c5() == 7 ? C10385c6.m50540k4(m51776dy()) : m51776dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m51445x1() {
        return this.f37272k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10579os m51441k4(C3152yj c3152yj) {
        return m51443k4(c3152yj, false, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10579os m51442k4(C3152yj c3152yj, int i) {
        return m51443k4(c3152yj, true, i);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC10579os m51443k4(C3152yj c3152yj, boolean z, int i) {
        boolean z2;
        AbstractC10579os c10746z9;
        int iM13160k4;
        C3094uz c3094uz = new C3094uz(c3152yj);
        AbstractC10579os c10544ml = null;
        if (c3094uz.m13161x1() && ((iM13160k4 = c3094uz.m13160k4()) == 0 || iM13160k4 == 1 || iM13160k4 == 2)) {
            if (iM13160k4 == 0) {
                c10544ml = new C10746z9();
            } else if (iM13160k4 == 2 || iM13160k4 == 1) {
                c10544ml = new C10544ml();
            }
            c10544ml.m51778k4(c3152yj.toArray());
            c10544ml.m51780x1(c10544ml.m51776dy());
            c10544ml.m51409um().m51925x1(c10544ml.m51779m9().m66539k4().length + 1);
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return c10544ml;
        }
        AbstractC10579os c10544ml2 = new C10544ml();
        try {
            c3152yj.setPosition(0L);
            C12009k4 c12009k4 = new C12009k4(c3152yj);
            if (C14047bz.m66535k4(c12009k4.mo15750ck().m15685k4(), C3977ck.m15676ck().m15685k4())) {
                c10544ml2 = new C10719xt();
                c10544ml2.m51778k4(c3152yj.toArray());
            } else {
                C3152yj c3152yj2 = new C3152yj();
                c12009k4.m56333k4(c3152yj2, C3977ck.m15681jd());
                c3152yj2.close();
                c10544ml2.m51778k4(c3152yj2.toArray());
            }
            c12009k4.dispose();
            c10544ml2.m51780x1(c10544ml2.m51776dy());
            c10544ml2.m51409um().m51925x1(c10544ml2.m51779m9().m66539k4().length + 1);
            return c10544ml2;
        } catch (ArgumentException e) {
            if (!z) {
                throw e;
            }
            C3085sv.m13082k4(e);
            if (i == 5) {
                c10746z9 = new C10746z9();
            } else if (i == 6) {
                c10746z9 = new C10544ml();
            } else if (i == 7) {
                c10746z9 = new C10352aa();
            } else {
                if (i != 17) {
                    throw new NotImplementedException();
                }
                c10746z9 = new C10719xt();
            }
            c10746z9.m51778k4(c3152yj.toArray());
            c10746z9.m51780x1(c10746z9.m51776dy());
            c10746z9.m51409um().m51925x1(c10746z9.m51779m9().m66539k4().length + 1);
            return c10746z9;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51444k4(byte b) {
        this.f37272k4 = b;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        m51777k4(AbstractC10657tu.m51774x1(c3134k4).Clone());
        m51444k4(c3134k4.m13387yj());
        int i = 1;
        if ((m51409um().m51922kk() & 1) > 0) {
            c3134k4.m13372dy(16);
            m51409um().m51920k4((short) (m51409um().m51922kk() & (-2)));
            i = 17;
        }
        m51778k4(c3134k4.m13372dy((m51409um().m51914du() - 16) - i));
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(m51779m9().m66539k4());
        c3149x1.m13443k4(m51445x1());
        c3149x1.m13450k4(m51776dy());
    }
}
