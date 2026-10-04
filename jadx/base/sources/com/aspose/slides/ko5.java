package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10500jw;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10736yo;

/* JADX INFO: loaded from: classes3.dex */
class ko5 {
    /* JADX INFO: renamed from: k4 */
    public static void m64087k4(ILineFillFormat iLineFillFormat, C10462h9 c10462h9, y2n y2nVar) {
        C10480ii c10480iiM51263x1 = c10462h9.mo50859du().m51263x1();
        C10736yo c10736yo = (C10736yo) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(FrameMetricsAggregator.EVERY_DURATION), C10736yo.class);
        c10480iiM51263x1.m50928kk(InputDeviceCompat.SOURCE_DPAD);
        c10480iiM51263x1.m50928kk(448);
        c10480iiM51263x1.m50928kk(449);
        byte fillType = iLineFillFormat.getFillType();
        if (fillType == -1) {
            c10736yo.m52083ck(false);
            return;
        }
        if (fillType == 0) {
            c10736yo.m52083ck(false);
            return;
        }
        if (fillType == 1) {
            c10736yo.m52083ck(true);
            C14294pm.m69144k4(iLineFillFormat.getSolidFillColor(), c10480iiM51263x1, 448, 449, y2nVar);
        } else if (fillType == 2) {
            y2nVar.m73707k4("Line fill type FillType.Gradient PPT serialization is not implemented yet.", 3);
        } else {
            if (fillType != 3) {
                throw new NotImplementedException();
            }
            c10736yo.m52083ck(true);
            tbt.m71070k4((PatternFormat) iLineFillFormat.getPatternFormat(), c10462h9.mo50859du(), true, y2nVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64088k4(ILineFillFormat iLineFillFormat, ri7 ri7Var) {
        C10609qn c10609qn;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10480ii c10480iiM51263x1 = c10462h9M70140fa.mo50859du() != null ? c10462h9M70140fa.mo50859du().m51263x1() : null;
        if (c10480iiM51263x1 == null) {
            c10480iiM51263x1 = new C10480ii();
        }
        C10480ii c10480ii = c10480iiM51263x1;
        int iM52025c5 = c10462h9M70140fa.mo50864to().m52025c5();
        C10500jw c10500jw = (C10500jw) c10480ii.m50923k4(383);
        C10736yo c10736yo = (C10736yo) c10480ii.m50923k4(FrameMetricsAggregator.EVERY_DURATION);
        C10462h9 c10462h9 = ri7Var.m70147rv() != null ? (C10462h9) ri7Var.m70147rv().m69489kk() : null;
        if (c10736yo == null && c10462h9 != null) {
            c10736yo = (C10736yo) c10462h9.mo50859du().m51263x1().m50923k4(FrameMetricsAggregator.EVERY_DURATION);
        }
        if (c10736yo == null) {
            c10736yo = (c10500jw != null || iM52025c5 == 75) ? new C10736yo() : new C10736yo(1572872L);
        }
        C10736yo c10736yo2 = c10736yo;
        if (c10480ii.m50923k4(448) != null || c10480ii.m50923k4(449) != null) {
            C14294pm.m69141k4(iLineFillFormat.getSolidFillColor(), c10462h9M70140fa, c10462h9, 448, 449, 0L);
        }
        if (c10736yo2.m52098to()) {
            iLineFillFormat.setFillType(c10736yo2.m52096m9() ? (byte) 1 : (byte) 0);
            C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4((Object) c10480ii.m50923k4(452), C10609qn.class);
            if (c10609qn2 == null || (c10609qn2.m51597ar() & 4294967295L) != 1) {
                return;
            }
            iLineFillFormat.setFillType((byte) 3);
            tbt.m71071k4((PatternFormat) iLineFillFormat.getPatternFormat(), true, ri7Var);
            return;
        }
        if (c10480ii.m50923k4(FrameMetricsAggregator.EVERY_DURATION) != null) {
            if (c10500jw != null && c10500jw.m51047to()) {
                iLineFillFormat.setFillType((byte) 1);
            } else if (iM52025c5 == 1 && (c10609qn = (C10609qn) c10480ii.m50923k4(769)) != null && (c10609qn.m51597ar() & 4294967295L) == 0) {
                iLineFillFormat.setFillType((byte) 1);
            }
        }
    }
}
