package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10548mt;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: loaded from: classes3.dex */
class nee {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f47526k4 = new C7017h4("bottom", "middle");

    /* JADX INFO: renamed from: k4 */
    private static a3u m67998k4(Presentation presentation) {
        a3u a3uVar = new a3u(new C10591pk(), presentation, InterruptionToken.getNone());
        C10536m5 c10536m5 = new C10536m5();
        new jio(c10536m5, a3uVar).m63331k4((TextStyle) presentation.getDefaultTextStyle());
        return a3uVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67999k4(AutoShape autoShape, AbstractC8917u4 abstractC8917u4, gnb gnbVar) {
        C11709bg c11709bgM55303k4;
        com.aspose.slides.internal.p332p7.ai5 ai5Var = (com.aspose.slides.internal.p332p7.ai5) abstractC8917u4.m42084k4("textdata");
        if (ai5Var == null || (c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(ai5Var.m28265k4())) == null) {
            return;
        }
        C3152yj c3152yj = new C3152yj(c11709bgM55303k4.m55296x1().m55426to());
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            C10548mt c10548mt = new C10548mt();
            c10548mt.m51409um().m51917k4(4130);
            c10548mt.m51406kk(c3134k4);
            if (c10548mt.m51346x1().m50591h4()) {
                klp klpVar = new klp(new TextFrame(autoShape), c10548mt);
                klpVar.m63993k4(m67998k4((Presentation) autoShape.getPresentation()));
                ljv.m64419kk(klpVar);
                klpVar.m63992k4(autoShape);
                m68000k4(autoShape.m288x1(), abstractC8917u4);
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68000k4(TextFrame textFrame, AbstractC8917u4 abstractC8917u4) {
        byte b;
        Dictionary<String, String> dictionaryM74124x1 = yw9.m74124x1(abstractC8917u4.mo29904x1());
        ITextFrameFormat textFrameFormat = textFrame.getTextFrameFormat();
        if (dictionaryM74124x1.containsKey("mso-wrap-style")) {
            textFrameFormat.setWrapText(!"none".equals(dictionaryM74124x1.get_Item("mso-wrap-style")) ? (byte) 1 : (byte) 0);
        }
        if (dictionaryM74124x1.containsKey("mso-rotate")) {
            textFrameFormat.setRotationAngle(C14057f9.m66582k4(dictionaryM74124x1.get_Item("mso-rotate")));
        }
        if (dictionaryM74124x1.containsKey("v-text-anchor")) {
            int iM27428k4 = f47526k4.m27428k4(dictionaryM74124x1.get_Item("v-text-anchor"));
            if (iM27428k4 == 0) {
                b = 2;
            } else {
                if (iM27428k4 == 1) {
                    textFrameFormat.setAnchoringType((byte) 1);
                    return;
                }
                b = 0;
            }
            textFrameFormat.setAnchoringType(b);
        }
    }
}
