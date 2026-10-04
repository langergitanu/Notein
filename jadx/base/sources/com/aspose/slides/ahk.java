package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10502k2;
import com.aspose.slides.internal.p407st.C10627s0;

/* JADX INFO: loaded from: classes3.dex */
class ahk {
    /* JADX INFO: renamed from: k4 */
    public static void m3577k4(INormalViewProperties iNormalViewProperties, C10502k2 c10502k2) {
        c10502k2.m51061x1(!iNormalViewProperties.getShowOutlineIcons());
        c10502k2.m51056kk(iNormalViewProperties.getSnapVerticalSplitter());
        c10502k2.m51053k4(f6b.m5972up(iNormalViewProperties.getVerticalBarState()));
        c10502k2.m51060x1(f6b.m5972up(iNormalViewProperties.getHorizontalBarState()));
        c10502k2.m51054k4(iNormalViewProperties.getPreferSingleView());
        m3578k4(iNormalViewProperties.getRestoredLeft(), c10502k2.m51059x1());
        m3578k4(iNormalViewProperties.getRestoredTop(), c10502k2.m51055kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3578k4(INormalViewRestoredProperties iNormalViewRestoredProperties, C10627s0 c10627s0) {
        c10627s0.m51661k4(C7019kk.m27462to(Float.valueOf(iNormalViewRestoredProperties.getDimensionSize() * 1.0E7f), 13));
        if (iNormalViewRestoredProperties.getAutoAdjust()) {
            c10627s0.m51661k4(-c10627s0.m51660k4());
        }
        c10627s0.m51665x1(1000000000);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3579k4(C10502k2 c10502k2, INormalViewProperties iNormalViewProperties) {
        if (c10502k2 == null) {
            return;
        }
        iNormalViewProperties.setShowOutlineIcons(!c10502k2.m51057m9());
        iNormalViewProperties.setSnapVerticalSplitter(c10502k2.m51051dy());
        iNormalViewProperties.setVerticalBarState(f6b.m6012yj(c10502k2.m51058to()));
        iNormalViewProperties.setHorizontalBarState(f6b.m6012yj(c10502k2.m51050du()));
        iNormalViewProperties.setPreferSingleView(c10502k2.m51052h4());
        m3580k4(c10502k2.m51059x1(), iNormalViewProperties.getRestoredLeft());
        m3580k4(c10502k2.m51055kk(), iNormalViewProperties.getRestoredTop());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3580k4(C10627s0 c10627s0, INormalViewRestoredProperties iNormalViewRestoredProperties) {
        double dM51660k4 = (c10627s0.m51660k4() * 100.0f) / c10627s0.m51664x1();
        iNormalViewRestoredProperties.setAutoAdjust(dM51660k4 < 0.0d);
        if (iNormalViewRestoredProperties.getAutoAdjust()) {
            dM51660k4 = -dM51660k4;
        }
        iNormalViewRestoredProperties.setDimensionSize((float) dM51660k4);
    }
}
