package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p302nm.C6926m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
class ssy {
    /* JADX INFO: renamed from: k4 */
    private static byte m70763k4(int i) {
        switch (i) {
            case 0:
                return (byte) -1;
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            default:
                throw new ArgumentOutOfRangeException("fillImageRefPoint");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70764k4(IPictureFillFormatEffectiveData iPictureFillFormatEffectiveData, Shape shape, jlf jlfVar, OdpSerializationContext odpSerializationContext) {
        if (iPictureFillFormatEffectiveData == null) {
            throw new ArgumentNullException("pictureFillFormat");
        }
        if (jlfVar == null) {
            throw new ArgumentNullException("fillFormatContext");
        }
        int pictureFillMode = iPictureFillFormatEffectiveData.getPictureFillMode();
        if (pictureFillMode == 0) {
            m70765k4(iPictureFillFormatEffectiveData, jlfVar);
        } else if (pictureFillMode != 1) {
            jlfVar.m63422k4(1);
        } else {
            jlfVar.m63422k4(3);
        }
        ku2 ku2Var = (ku2) iPictureFillFormatEffectiveData.getPicture();
        PPImage pPImage = (PPImage) ku2Var.getImage();
        if (pPImage != null) {
            bia biaVarM69800to = ((qxi) iPictureFillFormatEffectiveData).m69800to();
            boolean z = shape != null && bia.m4216x1(biaVarM69800to.m4218k4().Clone());
            if (!z && ku2.m64174k4((ImageTransformOCollectionEffectiveData) ku2Var.getImageTransform())) {
                odpSerializationContext.m2060k4(jlfVar, pPImage);
                return;
            }
            C7131h4 c7131h4M64176k4 = ku2Var.m64176k4((kg7) null, new C7134m9[]{null});
            byte[] bArrM70768k4 = z ? m70768k4(c7131h4M64176k4.m27674du(), biaVarM69800to, shape) : c7131h4M64176k4.m27674du();
            odpSerializationContext.m2061k4(jlfVar, odpSerializationContext.m2052k4(PPImage.m2114k4(bArrM70768k4), PPImage.m2121x1(bArrM70768k4).mo55273k4(), bArrM70768k4, null));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70765k4(IPictureFillFormatEffectiveData iPictureFillFormatEffectiveData, jlf jlfVar) {
        qxi qxiVar = (qxi) iPictureFillFormatEffectiveData;
        jlfVar.m63422k4(2);
        jlfVar.m63428x1(q9u.f48268h4.get_Item(Byte.valueOf(qxiVar.m69791dy())).intValue());
        PPImage pPImage = (PPImage) iPictureFillFormatEffectiveData.getPicture().getImage();
        if (pPImage != null) {
            C12025x6 c12025x6Clone = pPImage.m2123c5().Clone();
            oju ojuVarClone = qxiVar.m69792h4().Clone();
            double width = ((pPImage.getWidth() * 96) / c12025x6Clone.m56897x1()) * ojuVarClone.f47836k4;
            double height = ((pPImage.getHeight() * 96) / c12025x6Clone.m56895kk()) * ojuVarClone.f47837x1;
            jlfVar.m63429x1(wgi.m72717k4(C12566m9.m58637du(width)));
            jlfVar.m63425kk(wgi.m72717k4(C12566m9.m58637du(height)));
            tbp tbpVarClone = qxiVar.m69790du().Clone();
            if (tbp.m71057to(tbpVarClone, tbp.f49088kk)) {
                int iOooO00o = OooO00o.OooO00o(tbpVarClone.f49090k4 / width, 100.0d, 14);
                int iOooO00o2 = OooO00o.OooO00o(tbpVarClone.f49091x1 / height, 100.0d, 14);
                jlfVar.m63427to(wgi.m72718k4(iOooO00o));
                jlfVar.m63419du(wgi.m72718k4(iOooO00o2));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70766k4(PictureFillFormat pictureFillFormat, com.aspose.slides.internal.p332p7.fq4 fq4Var, wxb wxbVar) {
        if (pictureFillFormat == null) {
            throw new ArgumentNullException("pictureFillFormat");
        }
        if (fq4Var == null) {
            throw new ArgumentNullException("backgroundImageElementData");
        }
        IPPImage iPPImageM69949k4 = wxbVar.m72957k4().m69949k4(fq4Var.m32005x1());
        if (iPPImageM69949k4 != null) {
            pictureFillFormat.getPicture().setImage(iPPImageM69949k4);
        }
        if (fq4Var.m32004k4() == 3) {
            pictureFillFormat.setPictureFillMode(1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70767k4(PictureFillFormat pictureFillFormat, kia kiaVar, wxb wxbVar) {
        if (pictureFillFormat == null) {
            throw new ArgumentNullException("pictureFillFormat");
        }
        if (kiaVar == null) {
            throw new ArgumentNullException("pictureFillFormatDeserializationContext");
        }
        if (wxbVar.m72960x1().m69237du().containsKey(kiaVar.m63892k4())) {
            pictureFillFormat.getPicture().setImage(wxbVar.m72957k4().m69949k4(wxbVar.m72960x1().m69237du().get_Item(kiaVar.m63892k4()).m35716x1()));
        }
        if (kiaVar.m63896x1() == 3) {
            pictureFillFormat.setPictureFillMode(1);
            return;
        }
        pictureFillFormat.setPictureFillMode(0);
        pictureFillFormat.m2255m9().m74643k4(m70763k4(kiaVar.m63894m9()));
        if (pictureFillFormat.getPicture().getImage() != null) {
            double dM58644k4 = C12566m9.m58644k4(wgi.m72703h4(kiaVar.m63893kk()));
            double dM58644k42 = C12566m9.m58644k4(wgi.m72703h4(kiaVar.m63895to()));
            PPImage pPImage = (PPImage) pictureFillFormat.getPicture().getImage();
            C12025x6 c12025x6Clone = pPImage.m2123c5().Clone();
            C12023wl c12023wlClone = pPImage.m2133kk().m56680m9().Clone();
            oju ojuVarClone = oju.f47835to.Clone();
            if (!C14044b3.m66437kk(dM58644k4) && dM58644k4 != 0.0d) {
                ojuVarClone.f47836k4 = (float) (((dM58644k4 * ((double) c12025x6Clone.m56897x1())) / 96.0d) / ((double) c12023wlClone.m56865x1()));
            }
            if (!C14044b3.m66437kk(dM58644k42) && dM58644k42 != 0.0d) {
                ojuVarClone.f47837x1 = (float) (((dM58644k42 * ((double) c12025x6Clone.m56895kk())) / 96.0d) / ((double) c12023wlClone.m56862kk()));
            }
            pictureFillFormat.m2255m9().m74646k4(ojuVarClone.Clone());
            double dM72737to = wgi.m72737to(kiaVar.m63890du());
            double dM72737to2 = wgi.m72737to(kiaVar.m63891h4());
            if (dM72737to == 100.0d && dM72737to2 == 100.0d) {
                return;
            }
            pictureFillFormat.m2255m9().m74647k4(new tbp((dM72737to / 100.0d) * ((double) (((c12023wlClone.m56865x1() * 96) / c12025x6Clone.m56897x1()) * ojuVarClone.f47836k4)), (dM72737to2 / 100.0d) * ((double) (((c12023wlClone.m56862kk() * 96) / c12025x6Clone.m56895kk()) * ojuVarClone.f47837x1))));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m70768k4(byte[] bArr, bia biaVar, Shape shape) {
        byte[] bArrM13188k4;
        try {
            AbstractC12002ck abstractC12002ckM13169ck = C3099wl.m13169ck(bArr);
            try {
                C12007ix c12007ixClone = ((ShapeFrame) shape.getFrame()).m2660k4().Clone();
                c12007ixClone.m56564k4(C12016rv.m56703k4(new C12016rv(0, 0)).Clone());
                C12007ix c12007ixClone2 = biaVar.m4217k4(c12007ixClone.Clone()).Clone();
                bia biaVar2 = new bia();
                biaVar2.m4220k4(new ohe((-(c12007ixClone2.m56571to() - c12007ixClone.m56571to())) / c12007ixClone2.m56550c5(), (-(c12007ixClone2.m56554dy() - c12007ixClone.m56554dy())) / c12007ixClone2.m56575x1(), c12007ixClone.m56550c5() / c12007ixClone2.m56550c5(), c12007ixClone.m56575x1() / c12007ixClone2.m56575x1()));
                C12007ix c12007ixClone3 = biaVar2.m4217k4(new C12007ix(0.0f, 0.0f, abstractC12002ckM13169ck.mo15760yj(), abstractC12002ckM13169ck.mo15757m9()).Clone()).Clone();
                C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ixClone3.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ixClone3.m56575x1()), 13));
                try {
                    AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                    try {
                        abstractC12008jdM56582k4.mo17478dy(3);
                        abstractC12008jdM56582k4.mo17476du(2);
                        abstractC12008jdM56582k4.mo17507k4(abstractC12002ckM13169ck, new C12007ix(0.0f, 0.0f, c12007ixClone3.m56550c5(), c12007ixClone3.m56575x1()), c12007ixClone3.Clone(), 2);
                        abstractC12008jdM56582k4.dispose();
                        C3982jd c3982jdM27185k4 = C6926m9.m27185k4(C3977ck.m15678dy());
                        if (!C14047bz.m66535k4(abstractC12002ckM13169ck.mo15750ck().m15685k4(), C3977ck.m15678dy().m15685k4()) || c3982jdM27185k4 == null) {
                            bArrM13188k4 = C3099wl.m13188k4((AbstractC12002ck) c12009k4);
                        } else {
                            C3152yj c3152yj = new C3152yj();
                            try {
                                C3986m9 c3986m9 = new C3986m9();
                                c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, 99L);
                                c12009k4.m56334k4(c3152yj, c3982jdM27185k4, c3986m9);
                                bArrM13188k4 = c3152yj.toArray();
                            } finally {
                                c3152yj.dispose();
                            }
                        }
                        abstractC12002ckM13169ck.dispose();
                        return bArrM13188k4;
                    } catch (Throwable th) {
                        if (abstractC12008jdM56582k4 != null) {
                            abstractC12008jdM56582k4.dispose();
                        }
                        throw th;
                    }
                } finally {
                    c12009k4.dispose();
                }
            } catch (Throwable th2) {
                if (abstractC12002ckM13169ck != null) {
                    abstractC12002ckM13169ck.dispose();
                }
                throw th2;
            }
        } catch (RuntimeException unused) {
            return bArr;
        }
    }
}
