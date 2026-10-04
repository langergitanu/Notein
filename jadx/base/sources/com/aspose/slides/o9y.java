package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3073my;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class o9y {
    /* JADX INFO: renamed from: k4 */
    private static IPPImage m68415k4(IBaseSlide iBaseSlide, AbstractC8917u4 abstractC8917u4, float f, float f2, boolean[] zArr) {
        zArr[0] = false;
        C11896dy[] c11896dyArrM71507k4 = C14618u7.m71507k4(abstractC8917u4, f, f2);
        if (c11896dyArrM71507k4.length <= 0) {
            return null;
        }
        String strMo29885fa = abstractC8917u4.mo29885fa();
        ColorFormat colorFormat = new ColorFormat((InterfaceC14397rj) null, C12003du.m56458up().Clone());
        if (strMo29885fa != null && strMo29885fa.length() > 0) {
            new C3073my(strMo29885fa).m12999k4(colorFormat);
        }
        float fM13006x1 = new C3073my(abstractC8917u4.mo29903up()).m13006x1(1.0f);
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(f), 13) + 2, C7019kk.m27462to(Float.valueOf(f2), 13) + 2);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            C11999ar c11999ar = new C11999ar(C12003du.m56458up().Clone());
            try {
                abstractC12008jdM56582k4.mo17524k4(c11999ar, 0.0f, 0.0f, f + 2.0f, f2 + 2.0f);
                c11999ar.dispose();
                abstractC12008jdM56582k4.mo17588x1(new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f));
                C12026yj c12026yj = new C12026yj(C12003du.m56400k4(255, colorFormat.m1084to().Clone()).Clone(), fM13006x1);
                for (C11896dy c11896dy : c11896dyArrM71507k4) {
                    try {
                        abstractC12008jdM56582k4.mo17540k4(c12026yj, c11896dy);
                    } finally {
                        c12026yj.dispose();
                    }
                }
                abstractC12008jdM56582k4.dispose();
                IPPImage iPPImageM1724k4 = ((ImageCollection) iBaseSlide.getPresentation().getImages()).m1724k4(c12009k4);
                zArr[0] = true;
                return iPPImageM1724k4;
            } catch (Throwable th) {
                c11999ar.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static IPPImage m68416k4(IBaseSlide iBaseSlide, AbstractC8917u4 abstractC8917u4, gnb gnbVar, boolean[] zArr) {
        com.aspose.slides.internal.p332p7.bdg bdgVarM68418k4 = m68418k4(abstractC8917u4);
        IPPImage iPPImageM68417k4 = bdgVarM68418k4 != null ? m68417k4(bdgVarM68418k4.m28856du(), gnbVar) : null;
        zArr[0] = false;
        if (iPPImageM68417k4 != null) {
            return iPPImageM68417k4;
        }
        ShapeFrame shapeFrameM74119k4 = yw9.m74119k4(abstractC8917u4.mo29904x1());
        return m68415k4(iBaseSlide, abstractC8917u4, shapeFrameM74119k4.getWidth(), shapeFrameM74119k4.getHeight(), zArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static IPPImage m68417k4(String str, gnb gnbVar) {
        C11723d3 c11723d3M55338u4 = gnbVar.m55338u4();
        if (str != null) {
            return gnbVar.m6781k4(c11723d3M55338u4.m55303k4(str).m55296x1());
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.bdg m68418k4(AbstractC8917u4 abstractC8917u4) {
        return (com.aspose.slides.internal.p332p7.bdg) abstractC8917u4.m42084k4("imagedata");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68419k4(PictureFillFormat pictureFillFormat, com.aspose.slides.internal.p332p7.bdg bdgVar) {
        pj5 pj5VarClone = pictureFillFormat.m2256to().Clone();
        if (!C14113y2.m67411k4(bdgVar.m28857k4())) {
            pj5VarClone.f48081x1 = (C14113y2.m67424kk(bdgVar.m28857k4(), "f") ? new C3073my(bdgVar.m28857k4()).m13004to() : new C3073my(bdgVar.m28857k4()).m13001kk(0.0f)) * 100.0f;
        }
        if (!C14113y2.m67411k4(bdgVar.m28861x1())) {
            pj5VarClone.f48079kk = (C14113y2.m67424kk(bdgVar.m28857k4(), "f") ? new C3073my(bdgVar.m28861x1()).m13004to() : new C3073my(bdgVar.m28861x1()).m13001kk(0.0f)) * 100.0f;
        }
        if (!C14113y2.m67411k4(bdgVar.m28859kk())) {
            pj5VarClone.f48080to = (C14113y2.m67424kk(bdgVar.m28857k4(), "f") ? new C3073my(bdgVar.m28859kk()).m13004to() : new C3073my(bdgVar.m28859kk()).m13001kk(0.0f)) * 100.0f;
        }
        if (!C14113y2.m67411k4(bdgVar.m28860to())) {
            pj5VarClone.f48078du = (C14113y2.m67424kk(bdgVar.m28857k4(), "f") ? new C3073my(bdgVar.m28860to()).m13004to() : new C3073my(bdgVar.m28860to()).m13001kk(0.0f)) * 100.0f;
        }
        pictureFillFormat.m2253k4(pj5VarClone.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68420k4(PictureFillFormat pictureFillFormat, AbstractC8917u4 abstractC8917u4) {
        m68419k4(pictureFillFormat, (com.aspose.slides.internal.p332p7.bdg) abstractC8917u4.m42084k4("imagedata"));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68421k4(PictureFillFormat pictureFillFormat, AbstractC8917u4 abstractC8917u4, gnb gnbVar) {
        com.aspose.slides.internal.p332p7.bdg bdgVarM68418k4;
        if (pictureFillFormat.getPicture().getImage() != null || (bdgVarM68418k4 = m68418k4(abstractC8917u4)) == null) {
            return;
        }
        pictureFillFormat.getPicture().setImage(m68417k4(bdgVarM68418k4.m28856du(), gnbVar));
        if (pictureFillFormat.getPicture().getImage() != null) {
            m68419k4(pictureFillFormat, bdgVarM68418k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68422k4(AbstractC8917u4 abstractC8917u4, IPPImage iPPImage, sdp sdpVar) {
        com.aspose.slides.internal.p332p7.bdg bdgVar = (com.aspose.slides.internal.p332p7.bdg) abstractC8917u4.mo29887h4("imagedata").m29542x1();
        if (iPPImage != null) {
            bdgVar.m28858k4(sdpVar.m70584m9().m55377up().m55311x1(sdpVar.m70580k4().m71567x1(iPPImage)).m55289du());
        }
    }
}
