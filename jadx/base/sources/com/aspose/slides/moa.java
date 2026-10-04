package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10424em;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes3.dex */
class moa {
    /* JADX INFO: renamed from: k4 */
    public static void m64927k4(PictureFillFormat pictureFillFormat, long j, ri7 ri7Var) {
        int i;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10480ii c10480iiM51263x1 = c10462h9M70140fa.mo50859du() != null ? c10462h9M70140fa.mo50859du().m51263x1() : new C10480ii();
        boolean zM27469x1 = C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), Control.class);
        int i2 = StyleIdentifier.SUBTLE_REFERENCE;
        int i3 = StyleIdentifier.INTENSE_EMPHASIS;
        int i4 = StyleIdentifier.SUBTLE_EMPHASIS;
        if (!zM27469x1 && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), OleObjectFrame.class) && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), PictureFrame.class)) {
            i4 = 390;
            i3 = 391;
            i2 = 392;
        }
        fam.m6071k4(pictureFillFormat.getPicture(), i4, i3, i2, ri7Var);
        if (C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), PictureFrame.class) || C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), Control.class) || C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), OleObjectFrame.class)) {
            pj5 pj5Var = new pj5(0.0f, 0.0f, 0.0f, 0.0f);
            C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(256), C10609qn.class);
            pj5Var.f48079kk = c10609qn != null ? ((float) C3110yd.m13237k4(c10609qn.m51597ar())) * 100.0f : 0.0f;
            C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(257), C10609qn.class);
            pj5Var.f48078du = c10609qn2 != null ? ((float) C3110yd.m13237k4(c10609qn2.m51597ar())) * 100.0f : 0.0f;
            C10609qn c10609qn3 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(StyleIdentifier.COLORFUL_LIST_ACCENT_6), C10609qn.class);
            pj5Var.f48081x1 = c10609qn3 != null ? ((float) C3110yd.m13237k4(c10609qn3.m51597ar())) * 100.0f : 0.0f;
            C10609qn c10609qn4 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(StyleIdentifier.COLORFUL_GRID_ACCENT_6), C10609qn.class);
            pj5Var.f48080to = c10609qn4 != null ? ((float) C3110yd.m13237k4(c10609qn4.m51597ar())) * 100.0f : 0.0f;
            pictureFillFormat.m2253k4(pj5Var.Clone());
        }
        long j2 = j & 4294967295L;
        if (j2 == 2) {
            i = 0;
        } else {
            if (j2 != 3) {
                if (j != 4294967295L) {
                    throw new Exception();
                }
                return;
            }
            i = 1;
        }
        pictureFillFormat.setPictureFillMode(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64928k4(PictureFillFormat pictureFillFormat, C10534m3 c10534m3, y2n y2nVar) {
        C10480ii c10480iiM51263x1;
        long j;
        if (pictureFillFormat == null) {
            throw new ArgumentNullException("pictureFillFormat");
        }
        c10534m3.m51263x1().m50928kk(384);
        if (!C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), Control.class) && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), OleObjectFrame.class) && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), PictureFrame.class)) {
            int pictureFillMode = pictureFillFormat.getPictureFillMode();
            if (pictureFillMode == 0) {
                c10480iiM51263x1 = c10534m3.m51263x1();
                j = 2;
            } else {
                if (pictureFillMode != 1) {
                    throw new Exception();
                }
                c10480iiM51263x1 = c10534m3.m51263x1();
                j = 3;
            }
            C22225Oooo0oO.OooO0O0(384, j, c10480iiM51263x1);
        }
        boolean zM27469x1 = C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), PictureFrame.class);
        int i = StyleIdentifier.SUBTLE_REFERENCE;
        int i2 = StyleIdentifier.INTENSE_EMPHASIS;
        int i3 = StyleIdentifier.SUBTLE_EMPHASIS;
        if (!zM27469x1 && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), OleObjectFrame.class) && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), Control.class)) {
            i3 = 390;
            i2 = 391;
            i = 392;
        }
        fam.m6072k4(pictureFillFormat.getPicture(), c10534m3, i3, i2, i, y2nVar);
        if (C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), Control.class)) {
            c10534m3.m51263x1().m50928kk(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6);
            C10424em c10424em = new C10424em();
            c10424em.m50763k4(true);
            c10424em.m50764kk(true);
            c10534m3.m51263x1().m50926k4(c10424em);
        } else if (C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), OleObjectFrame.class)) {
            OleObjectFrame oleObjectFrame = (OleObjectFrame) pictureFillFormat.getParent_Immediate();
            if (C14093tq.m67296x1(oleObjectFrame.mo1638uz().m5755jd(), null) && c10534m3.m51263x1().m50923k4(StyleIdentifier.PLAIN_TABLE_1) == null) {
                c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.PLAIN_TABLE_1, false, oleObjectFrame.mo1638uz().m5755jd().m67297k4().longValue()));
            }
        }
        c10534m3.m51263x1().m50928kk(StyleIdentifier.COLORFUL_LIST_ACCENT_6);
        c10534m3.m51263x1().m50928kk(256);
        c10534m3.m51263x1().m50928kk(StyleIdentifier.COLORFUL_GRID_ACCENT_6);
        c10534m3.m51263x1().m50928kk(257);
        if (bia.m4216x1(pictureFillFormat.m2255m9().m74652x1().m4218k4().Clone())) {
            if (!C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), PictureFrame.class) && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), Control.class) && !C7019kk.m27469x1(pictureFillFormat.getParent_Immediate(), OleObjectFrame.class)) {
                throw new NotImplementedException();
            }
            pj5 pj5VarClone = pictureFillFormat.m2256to().Clone();
            if (C14116yg.m67480k4(pj5VarClone.f48081x1) > 0.001d) {
                c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.COLORFUL_LIST_ACCENT_6, C3110yd.m13238k4(pj5VarClone.f48081x1 / 100.0f)));
            }
            if (C14116yg.m67480k4(pj5VarClone.f48079kk) > 0.001d) {
                c10534m3.m51263x1().m50926k4(new C10609qn(256, C3110yd.m13238k4(pj5VarClone.f48079kk / 100.0f)));
            }
            if (C14116yg.m67480k4(pj5VarClone.f48080to) > 0.001d) {
                c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.COLORFUL_GRID_ACCENT_6, C3110yd.m13238k4(pj5VarClone.f48080to / 100.0f)));
            }
            if (C14116yg.m67480k4(pj5VarClone.f48078du) > 0.001d) {
                c10534m3.m51263x1().m50926k4(new C10609qn(257, C3110yd.m13238k4(pj5VarClone.f48078du / 100.0f)));
            }
        }
    }
}
