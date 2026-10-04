package com.aspose.slides.internal.p407st;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.kn */
/* JADX INFO: loaded from: classes4.dex */
public class C10511kn extends AbstractC10458gz {
    public C10511kn() {
        super(61443);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: c5 */
    public C10386c9 mo50858c5() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50858c5();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: du */
    public C10534m3 mo50859du() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50859du();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: dy */
    public C10715xl mo50860dy() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50860dy();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: h4 */
    public C10428ev mo50861h4() {
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: jd */
    public C10358am mo50862jd() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50862jd();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return m51119k4(mo50863m9() != null && mo50863m9().m51975to());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: m9 */
    public C10711xc mo50863m9() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50863m9();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: to */
    public C10724y1 mo50864to() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50864to();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10458gz
    /* JADX INFO: renamed from: x1 */
    public C10543mi mo50865x1() {
        return ((C10462h9) m50513yj().get_Item(0)).mo50865x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m51120k4(C3149x1 c3149x1, boolean z) {
        C10609qn c10609qn;
        long position = c3149x1.m13442k4().getPosition();
        List.Enumerator<AbstractC10571o4> it = m50513yj().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                C10358am c10358am = (C10358am) C7019kk.m27452k4((Object) next, C10358am.class);
                if (c10358am == null || (c10358am.m50513yj().size() != 0 && (c10358am.m50513yj().size() != 1 || !C7019kk.m27469x1(c10358am.m50513yj().get_Item(0), AbstractC10456gv.class) || ((AbstractC10456gv) c10358am.m50513yj().get_Item(0)).m50513yj().size() != 0))) {
                    C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) next, C10462h9.class);
                    if (!z || c10462h9 == null || c10462h9.mo50864to().m52025c5() != 20 || (c10462h9.mo50859du() != null && c10462h9.mo50859du().m51263x1() != null && (c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10462h9.mo50859du().m51263x1().m50923k4(FrameMetricsAggregator.EVERY_DURATION), C10609qn.class)) != null && (c10609qn.m51597ar() & 8) != 0)) {
                        next.m51412x1(c3149x1);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return (int) (c3149x1.m13442k4().getPosition() - position);
    }

    /* JADX INFO: renamed from: k4 */
    private int m51119k4(boolean z) {
        C10609qn c10609qn;
        List.Enumerator<AbstractC10571o4> it = m50513yj().iterator();
        int iMo50440k4 = 0;
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                if (C7019kk.m27469x1(next, C10358am.class)) {
                    C10358am c10358am = (C10358am) next;
                    if (c10358am.m50513yj().size() != 0 && (c10358am.m50513yj().size() != 1 || !C7019kk.m27469x1(c10358am.m50513yj().get_Item(0), AbstractC10456gv.class) || ((AbstractC10456gv) c10358am.m50513yj().get_Item(0)).m50513yj().size() != 0)) {
                    }
                }
                if (z && C7019kk.m27469x1(next, C10462h9.class)) {
                    C10462h9 c10462h9 = (C10462h9) next;
                    if (c10462h9.mo50864to().m52025c5() != 20 || (c10462h9.mo50859du() != null && c10462h9.mo50859du().m51263x1() != null && (c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10462h9.mo50859du().m51263x1().m50923k4(FrameMetricsAggregator.EVERY_DURATION), C10609qn.class)) != null && (c10609qn.m51597ar() & 8) != 0)) {
                    }
                }
                iMo50440k4 += next.mo50440k4() + 8;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return iMo50440k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        if (mo50863m9() != null) {
            m51120k4(c3149x1, mo50863m9().m51975to());
        } else {
            super.mo50442k4(c3149x1);
        }
    }
}
