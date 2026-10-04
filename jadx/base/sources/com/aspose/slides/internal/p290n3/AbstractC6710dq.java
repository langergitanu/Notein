package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9613af;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p472w8.C11896dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.dq */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6710dq extends AbstractC1692du {
    public AbstractC6710dq(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9613af c9613af = (C9613af) c9723vw;
        C11896dy c11896dy = new C11896dy();
        int iM57816k4 = (int) c9613af.m46946x1().m57816k4();
        int iM57820x1 = (int) c9613af.m46946x1().m57820x1();
        if (iM57816k4 > c9613af.m46942k4().m57843h4()) {
            iM57816k4 = c9613af.m46942k4().m57843h4();
        }
        int i = iM57816k4;
        if (iM57820x1 > c9613af.m46942k4().m57849m9()) {
            iM57820x1 = c9613af.m46942k4().m57849m9();
        }
        int i2 = iM57820x1;
        c11896dy.m55539k4(c9613af.m46942k4().m57844k4(), c9613af.m46942k4().m57852x1(), i, i2, 180.0f, 90.0f);
        float f = i / 2.0f;
        c11896dy.m55574x1(c9613af.m46942k4().m57844k4() + f, c9613af.m46942k4().m57852x1(), c9613af.m46942k4().m57847kk() - f, c9613af.m46942k4().m57852x1());
        c11896dy.m55539k4(c9613af.m46942k4().m57847kk() - i, c9613af.m46942k4().m57852x1(), i, i2, -90.0f, 90.0f);
        int i3 = i2 / 2;
        c11896dy.m55576x1(c9613af.m46942k4().m57847kk(), c9613af.m46942k4().m57852x1() + i3, c9613af.m46942k4().m57847kk(), c9613af.m46942k4().m57850to() - i3);
        c11896dy.m55539k4(c9613af.m46942k4().m57847kk() - i, c9613af.m46942k4().m57850to() - i2, i, i2, 0.0f, 90.0f);
        c11896dy.m55574x1(c9613af.m46942k4().m57847kk() - f, c9613af.m46942k4().m57850to(), c9613af.m46942k4().m57844k4() + f, c9613af.m46942k4().m57850to());
        c11896dy.m55539k4(c9613af.m46942k4().m57844k4(), c9613af.m46942k4().m57850to() - i2, i, i2, 90.0f, 90.0f);
        c11896dy.m55576x1(c9613af.m46942k4().m57844k4(), c9613af.m46942k4().m57850to() - i3, c9613af.m46942k4().m57844k4(), c9613af.m46942k4().m57852x1() + i3);
        c11896dy.m55567m9();
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55540k4(c11896dy, false);
        } else {
            mo7771k4(c11896dy, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7771k4(C11896dy c11896dy, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
