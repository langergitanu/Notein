package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p332p7.C8680ri;
import com.aspose.slides.internal.p332p7.C8889ts;
import com.aspose.slides.internal.p332p7.C9276yd;
import com.aspose.slides.internal.p332p7.C9352z9;
import com.aspose.slides.internal.p464vq.AbstractC11812sq;
import com.aspose.slides.internal.p464vq.C11727dq;
import com.aspose.slides.internal.p464vq.C11733e0;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11820ts;
import com.aspose.slides.internal.p464vq.C11853xk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class wum {
    /* JADX INFO: renamed from: k4 */
    private static C11791os m72926k4(C11785nh c11785nh, String str, String str2, AbstractC11812sq abstractC11812sq) {
        return c11785nh.m55395k4(C14113y2.m67408k4("/ppt/diagrams/", str, ".xml"), null, abstractC11812sq, AbstractC6747ar.m26635ix().mo26677to(str2));
    }

    /* JADX INFO: renamed from: kk */
    public static void m72928kk(ISmartArt iSmartArt, int i) {
        String strM64610k4 = lwx.m64610k4(i);
        if (strM64610k4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("SmartArt style for type {0} does not exist", C14042ak.m66410k4(SmartArtQuickStyleType.class, i)), "quickStyleType");
        }
        jrf jrfVarMo272to = ((SmartArt) iSmartArt).mo272to();
        jrfVarMo272to.m63509k4((C9352z9) null);
        new fbr(m72926k4(new C11785nh(), "tempQuickStylePart", strM64610k4, new C11733e0()), new gnb(iSmartArt.getPresentation(), InterruptionToken.getNone())).m6111k4(jrfVarMo272to);
    }

    /* JADX INFO: renamed from: to */
    public static void m72929to(ISmartArt iSmartArt, int i) {
        String strM72981k4 = wz8.m72981k4(i);
        if (strM72981k4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("SmartArt colors template for colorType '{0}' does not exist", C14042ak.m66410k4(SmartArtColorType.class, i)), "colorType");
        }
        jrf jrfVarMo272to = ((SmartArt) iSmartArt).mo272to();
        jrfVarMo272to.m63508k4((C9276yd) null);
        new wzx(m72926k4(new C11785nh(), "tempColorsPart", strM72981k4, new C11727dq()), new gnb(iSmartArt.getPresentation(), InterruptionToken.getNone())).m72991k4(jrfVarMo272to);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m72930x1(ISmartArt iSmartArt, int i) {
        String strM64502k4 = lpe.m64502k4(i);
        if (strM64502k4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("SmartArt layout template for layoutType {0} does not exist", C14042ak.m66410k4(SmartArtLayoutType.class, i)), "layoutType");
        }
        jrf jrfVarMo272to = ((SmartArt) iSmartArt).mo272to();
        jrfVarMo272to.m63506k4((C8680ri) null);
        new oed(m72926k4(new C11785nh(), "tempLayoutPart", strM64502k4, new C11820ts()), new gnb(iSmartArt.getPresentation(), InterruptionToken.getNone())).m68476k4(jrfVarMo272to);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72927k4(ISmartArt iSmartArt, int i) {
        String strM5787k4 = ez4.m5787k4(i);
        if (strM5787k4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("SmartArt data model for layoutType {0} does not exist", C14042ak.m66410k4(SmartArtLayoutType.class, i)), "layoutType");
        }
        jrf jrfVarMo272to = ((SmartArt) iSmartArt).mo272to();
        jrfVarMo272to.m63507k4((C8889ts) null);
        new zw1(m72926k4(new C11785nh(), "tempDataPart", strM5787k4, new C11853xk()), new gnb(iSmartArt.getPresentation(), InterruptionToken.getNone())).m74862k4(jrfVarMo272to);
    }
}
