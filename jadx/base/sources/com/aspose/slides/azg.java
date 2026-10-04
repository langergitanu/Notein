package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7220a8;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C7775gm;
import com.aspose.slides.internal.p332p7.C7919ib;
import com.aspose.slides.internal.p332p7.C8122kq;
import com.aspose.slides.internal.p332p7.C8181lg;
import com.aspose.slides.internal.p332p7.C8236m1;
import com.aspose.slides.internal.p332p7.C8533pm;
import com.aspose.slides.internal.p332p7.C8693rp;
import com.aspose.slides.internal.p332p7.C8972ur;
import com.aspose.slides.internal.p332p7.C9118wk;
import com.aspose.slides.internal.p332p7.C9135ws;
import com.aspose.slides.internal.p332p7.C9178x7;
import com.aspose.slides.internal.p332p7.C9235xv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class azg {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4035k4 = new C7017h4("buClrTx", "buClr", "buFontTx", "buFont", "buSzTx", "buSzPct", "buSzPts", "buNone", "buAutoNum", "buChar", "buBlip", "spcPct", "spcPts");

    /* JADX INFO: renamed from: k4 */
    private static float m3879k4(C9118wk c9118wk) {
        if (c9118wk == null || c9118wk.m43740k4() == null) {
            return Float.NaN;
        }
        C7394ca c7394caM43740k4 = c9118wk.m43740k4();
        int iM27428k4 = f4035k4.m27428k4(c7394caM43740k4.m29539k4());
        if (iM27428k4 == 11) {
            C9178x7 c9178x7 = (C9178x7) c7394caM43740k4.m29542x1();
            if (C14064he.m66715kk(c9178x7.m44231k4())) {
                return 100.0f;
            }
            return c9178x7.m44231k4();
        }
        if (iM27428k4 != 12) {
            throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM43740k4.m29539k4(), "\""));
        }
        C7220a8 c7220a8 = (C7220a8) c7394caM43740k4.m29542x1();
        if (C14064he.m66715kk(c7220a8.m27984k4())) {
            return -12.0f;
        }
        return -c7220a8.m27984k4();
    }

    /* JADX INFO: renamed from: kk */
    private static void m3886kk(BulletFormat bulletFormat, C8181lg c8181lg) {
        if (bulletFormat.isBulletHardFont() == 1) {
            C14215o5.m68337k4(bulletFormat.getFont(), (C9235xv) c8181lg.m36112to("buFont").m29542x1());
        } else if (bulletFormat.isBulletHardFont() == 0) {
            c8181lg.m36112to("buFontTx");
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m3887x1(BulletFormat bulletFormat, C8181lg c8181lg) {
        if (C14064he.m66715kk(bulletFormat.getHeight())) {
            return;
        }
        if (bulletFormat.getHeight() < 0.0f || bulletFormat.getHeight() == 100.0f) {
            if (bulletFormat.getHeight() < 0.0f) {
                ((C8236m1) c8181lg.m36102kk("buSzPts").m29542x1()).m36564k4(C3085sv.m13070k4(-bulletFormat.getHeight(), 1.0f, 1000.0f));
                return;
            } else {
                c8181lg.m36102kk("buSzTx");
                return;
            }
        }
        C8972ur c8972ur = (C8972ur) c8181lg.m36102kk("buSzPct").m29542x1();
        if (bulletFormat.getHeight() > 0.0f) {
            c8972ur.m42533k4(C3085sv.m13070k4(bulletFormat.getHeight(), 25.0f, 400.0f));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3880k4(BulletFormat bulletFormat, IParagraphFormat iParagraphFormat, C8181lg c8181lg, u8s u8sVar) {
        byte type = bulletFormat.getType();
        if (type != -1) {
            if (type == 0) {
                c8181lg.m36097k4("buNone");
                return;
            }
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        return;
                    }
                    C8122kq c8122kq = (C8122kq) c8181lg.m36097k4("buBlip").m29542x1();
                    if (((BulletFormat) iParagraphFormat.getBullet()).getPicture() != null) {
                        dr1.m5222k4(((BulletFormat) iParagraphFormat.getBullet()).getPicture(), c8122kq.m35641k4(), u8sVar);
                        return;
                    }
                    return;
                }
                C8693rp c8693rp = (C8693rp) c8181lg.m36097k4("buAutoNum").m29542x1();
                if (iParagraphFormat.getBullet().getNumberedBulletStyle() != -1) {
                    c8693rp.m40108k4(iParagraphFormat.getBullet().getNumberedBulletStyle());
                }
                if (iParagraphFormat.getBullet().getNumberedBulletStartWith() != -1) {
                    c8693rp.m40109k4(iParagraphFormat.getBullet().getNumberedBulletStartWith());
                    return;
                }
                return;
            }
        }
        if (!u8sVar.m71531dy() || bulletFormat.m434jd()) {
            if (u8sVar.m71531dy() || bulletFormat.getType() != -1) {
                ((C7775gm) c8181lg.m36097k4("buChar").m29542x1()).m32657k4(!bulletFormat.m434jd() ? "•" : bulletFormat.m441to());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3881k4(BulletFormat bulletFormat, C8181lg c8181lg) {
        if (bulletFormat.isBulletHardColor() != 1) {
            if (bulletFormat.isBulletHardColor() == 0) {
                c8181lg.m36121x1("buClrTx");
            }
        } else if (bulletFormat.getColor().getColorType() != -1) {
            C1246ib.m7612x1(bulletFormat.getColor(), (C7447cx) c8181lg.m36121x1("buClr").m29542x1());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0103 A[PHI: r2
      0x0103: PHI (r2v11 int) = (r2v10 int), (r2v12 int), (r2v13 int) binds: [B:25:0x00ed, B:29:0x00f3, B:33:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[PHI: r3
      0x0107: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:27:0x00f0, B:31:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3882k4(IParagraphFormat iParagraphFormat, AbstractC4685kk<C8181lg> abstractC4685kk, u8s u8sVar) {
        kml kmlVarM2187c5 = ((ParagraphFormat) iParagraphFormat).m2187c5();
        if (!m3885k4(iParagraphFormat)) {
            if (kmlVarM2187c5.m64013k4()) {
                abstractC4685kk.invoke().m36091du();
                return;
            }
            return;
        }
        final C8181lg c8181lgInvoke = abstractC4685kk.invoke();
        m3884k4(new AbstractC4685kk<C9118wk>() { // from class: com.aspose.slides.azg.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8181lgInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddLnSpc()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9118wk invoke() {
                return c8181lgInvoke.m36098k4();
            }
        }, iParagraphFormat.getSpaceWithin());
        m3884k4(new AbstractC4685kk<C9118wk>() { // from class: com.aspose.slides.azg.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8181lgInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddSpcBef()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9118wk invoke() {
                return c8181lgInvoke.m36122x1();
            }
        }, iParagraphFormat.getSpaceBefore());
        m3884k4(new AbstractC4685kk<C9118wk>() { // from class: com.aspose.slides.azg.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8181lgInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddSpcAft()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9118wk invoke() {
                return c8181lgInvoke.m36103kk();
            }
        }, iParagraphFormat.getSpaceAfter());
        BulletFormat bulletFormat = (BulletFormat) iParagraphFormat.getBullet();
        m3881k4(bulletFormat, c8181lgInvoke);
        m3887x1(bulletFormat, c8181lgInvoke);
        m3886kk(bulletFormat, c8181lgInvoke);
        m3880k4(bulletFormat, iParagraphFormat, c8181lgInvoke, u8sVar);
        ParagraphFormat paragraphFormat = (ParagraphFormat) iParagraphFormat;
        if (paragraphFormat.m2188ck() > 0) {
            C7919ib c7919ibM36113to = c8181lgInvoke.m36113to();
            IGenericEnumerator<ITab> it = iParagraphFormat.getTabs().iterator();
            while (it.hasNext()) {
                try {
                    ITab next = it.next();
                    C8533pm c8533pmM33995k4 = c7919ibM36113to.m33995k4();
                    c8533pmM33995k4.m38979k4(next.getPosition());
                    c8533pmM33995k4.m38980k4(next.getAlignment());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        h1b.m6959k4(iParagraphFormat.getDefaultPortionFormat(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.azg.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8181lgInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddDefRPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9135ws invoke() {
                return c8181lgInvoke.m36091du();
            }
        }, u8sVar);
        c8181lgInvoke.m36101k4(C3085sv.m13072k4((int) paragraphFormat.m2192h4(), -1, 8));
        c8181lgInvoke.m36100k4(C3085sv.m13070k4(iParagraphFormat.getMarginLeft(), 0.0f, 4032.0f));
        c8181lgInvoke.m36124x1(C3085sv.m13070k4(iParagraphFormat.getMarginRight(), 0.0f, 4032.0f));
        c8181lgInvoke.m36105kk(C3085sv.m13070k4(iParagraphFormat.getIndent(), -4032.0f, 4032.0f));
        int alignment = iParagraphFormat.getAlignment();
        int i = 1;
        if (alignment != 0) {
            int i2 = 2;
            if (alignment != 1) {
                i = 3;
                if (alignment != 2) {
                    i2 = 4;
                    if (alignment != 3) {
                        i = 5;
                        if (alignment == 4) {
                            c8181lgInvoke.m36125x1(i);
                        } else if (alignment == 5) {
                            c8181lgInvoke.m36125x1(6);
                        }
                    } else {
                        c8181lgInvoke.m36125x1(i2);
                    }
                }
            }
        }
        c8181lgInvoke.m36115to(C3085sv.m13070k4(iParagraphFormat.getDefaultTabSize(), 0.0f, 4032.0f));
        c8181lgInvoke.m36106kk(iParagraphFormat.getFontAlignment());
        c8181lgInvoke.m36099k4(iParagraphFormat.getRightToLeft());
        c8181lgInvoke.m36123x1(iParagraphFormat.getEastAsianLineBreak());
        c8181lgInvoke.m36104kk(iParagraphFormat.getLatinLineBreak());
        c8181lgInvoke.m36114to(iParagraphFormat.getHangingPunctuation());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3883k4(IParagraphFormat iParagraphFormat, C8181lg c8181lg, gnb gnbVar) {
        if (c8181lg == null) {
            return;
        }
        ParagraphFormat paragraphFormat = (ParagraphFormat) iParagraphFormat;
        paragraphFormat.m2187c5();
        paragraphFormat.m2198k4((short) c8181lg.m36092dy());
        iParagraphFormat.setSpaceWithin(m3879k4(c8181lg.m36126x6()));
        iParagraphFormat.setSpaceBefore(m3879k4(c8181lg.m36109ne()));
        iParagraphFormat.setSpaceAfter(m3879k4(c8181lg.m36095ix()));
        C7394ca c7394caM36116u4 = c8181lg.m36116u4();
        iParagraphFormat.getBullet().setBulletHardColor((byte) -1);
        if (c7394caM36116u4 != null) {
            int iM27428k4 = f4035k4.m27428k4(c7394caM36116u4.m29539k4());
            if (iM27428k4 == 0) {
                iParagraphFormat.getBullet().setBulletHardColor((byte) 0);
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM36116u4.m29539k4(), "\""));
                }
                C7447cx c7447cx = (C7447cx) c7394caM36116u4.m29542x1();
                iParagraphFormat.getBullet().setBulletHardColor((byte) 1);
                C1246ib.m7611k4(iParagraphFormat.getBullet().getColor(), c7447cx);
            }
        }
        C7394ca c7394caM36120wl = c8181lg.m36120wl();
        iParagraphFormat.getBullet().setBulletHardFont((byte) -1);
        if (c7394caM36120wl != null) {
            int iM27428k42 = f4035k4.m27428k4(c7394caM36120wl.m29539k4());
            if (iM27428k42 == 2) {
                iParagraphFormat.getBullet().setBulletHardFont((byte) 0);
            } else {
                if (iM27428k42 != 3) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM36120wl.m29539k4(), "\""));
                }
                C9235xv c9235xv = (C9235xv) c7394caM36120wl.m29542x1();
                iParagraphFormat.getBullet().setBulletHardFont((byte) 1);
                if (C14113y2.m67429to(c9235xv.m44660k4(), ',') != -1) {
                    String[] strArrM67414k4 = C14113y2.m67414k4(c9235xv.m44660k4(), ',');
                    int length = strArrM67414k4.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String strM67440x1 = C14113y2.m67440x1(strArrM67414k4[i]);
                        if (!C14113y2.m67411k4(strM67440x1)) {
                            c9235xv.m44662k4(strM67440x1);
                            break;
                        }
                        i++;
                    }
                }
                iParagraphFormat.getBullet().setFont(C14215o5.m68334k4(c9235xv));
            }
        }
        C7394ca c7394caM36119uz = c8181lg.m36119uz();
        if (c7394caM36119uz != null) {
            int iM27428k43 = f4035k4.m27428k4(c7394caM36119uz.m29539k4());
            if (iM27428k43 == 4) {
                iParagraphFormat.getBullet().setHeight(100.0f);
            } else if (iM27428k43 == 5) {
                C8972ur c8972ur = (C8972ur) c7394caM36119uz.m29542x1();
                iParagraphFormat.getBullet().setHeight(C14064he.m66715kk(c8972ur.m42532k4()) ? 100.0f : c8972ur.m42532k4());
            } else {
                if (iM27428k43 != 6) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM36119uz.m29539k4(), "\""));
                }
                C8236m1 c8236m1 = (C8236m1) c7394caM36119uz.m29542x1();
                iParagraphFormat.getBullet().setHeight(C14064he.m66715kk(c8236m1.m36563k4()) ? -10.0f : -c8236m1.m36563k4());
            }
        }
        C7394ca c7394caM36110qq = c8181lg.m36110qq();
        iParagraphFormat.getBullet().setType((byte) -1);
        if (c7394caM36110qq != null) {
            switch (f4035k4.m27428k4(c7394caM36110qq.m29539k4())) {
                case 7:
                    iParagraphFormat.getBullet().setType((byte) 0);
                    break;
                case 8:
                    C8693rp c8693rp = (C8693rp) c7394caM36110qq.m29542x1();
                    iParagraphFormat.getBullet().setType((byte) 2);
                    iParagraphFormat.getBullet().setNumberedBulletStyle(c8693rp.m40107k4());
                    iParagraphFormat.getBullet().setNumberedBulletStartWith((short) c8693rp.m40110x1());
                    break;
                case 9:
                    C7775gm c7775gm = (C7775gm) c7394caM36110qq.m29542x1();
                    iParagraphFormat.getBullet().setType((byte) 1);
                    if (!C14113y2.m67411k4(c7775gm.m32656k4())) {
                        iParagraphFormat.getBullet().setChar(c7775gm.m32656k4().charAt(0));
                        ((BulletFormat) iParagraphFormat.getBullet()).m437k4(c7775gm.m32656k4());
                    }
                    break;
                case 10:
                    C8122kq c8122kq = (C8122kq) c7394caM36110qq.m29542x1();
                    iParagraphFormat.getBullet().setType((byte) 3);
                    dr1.m5221k4(((BulletFormat) iParagraphFormat.getBullet()).getPicture(), c8122kq.m35641k4(), gnbVar);
                    break;
                default:
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM36110qq.m29539k4(), "\""));
            }
        }
        if (c8181lg.m36088ar() != null) {
            C8533pm[] c8533pmArrM33996x1 = c8181lg.m36088ar().m33996x1();
            int length2 = c8533pmArrM33996x1.length;
            int i2 = 0;
            while (i2 < length2) {
                C8533pm c8533pm = c8533pmArrM33996x1[i2];
                int i3 = i2;
                iParagraphFormat.getTabs().add(C14044b3.m66437kk(c8533pm.m38978k4()) ? 0.0d : c8533pm.m38978k4(), c8533pm.m38981x1());
                i2 = i3 + 1;
            }
        }
        h1b.m6960k4(iParagraphFormat.getDefaultPortionFormat(), c8181lg.m36117um(), gnbVar);
        int iM36096jd = c8181lg.m36096jd();
        if (iM36096jd == 0) {
            iParagraphFormat.setAlignment(-1);
        } else if (iM36096jd == 2) {
            iParagraphFormat.setAlignment(1);
        } else if (iM36096jd == 3) {
            iParagraphFormat.setAlignment(2);
        } else if (iM36096jd == 4) {
            iParagraphFormat.setAlignment(3);
        } else if (iM36096jd == 5) {
            iParagraphFormat.setAlignment(4);
        } else if (iM36096jd != 6) {
            iParagraphFormat.setAlignment(0);
        } else {
            iParagraphFormat.setAlignment(5);
        }
        iParagraphFormat.setMarginLeft((gnbVar.m6793rv().length < 19 || !((gnbVar.m6793rv()[19] & 255) == 46 || (gnbVar.m6793rv()[10] & 255) == 3)) ? 4.084561f : (float) c8181lg.m36094h4());
        iParagraphFormat.setMarginRight((float) c8181lg.m36108m9());
        iParagraphFormat.setIndent((float) c8181lg.m36089c5());
        iParagraphFormat.setDefaultTabSize((float) c8181lg.m36090ck());
        iParagraphFormat.setFontAlignment(c8181lg.m36127yj());
        iParagraphFormat.setRightToLeft(c8181lg.m36093fa());
        iParagraphFormat.setEastAsianLineBreak(c8181lg.m36118up());
        iParagraphFormat.setLatinLineBreak(c8181lg.m36107ks());
        iParagraphFormat.setHangingPunctuation(c8181lg.m36111rv());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3884k4(AbstractC4685kk<C9118wk> abstractC4685kk, float f) {
        if (C14064he.m66715kk(f)) {
            return;
        }
        C9118wk c9118wkInvoke = abstractC4685kk.invoke();
        if (f < 0.0f) {
            ((C7220a8) c9118wkInvoke.m43741k4("spcPts").m29542x1()).m27985k4(-f);
        } else {
            ((C9178x7) c9118wkInvoke.m43741k4("spcPct").m29542x1()).m44232k4(f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3885k4(IParagraphFormat iParagraphFormat) {
        IBulletFormat bullet = iParagraphFormat.getBullet();
        if (bullet.getType() != -1 || bullet.isBulletHardColor() != -1 || bullet.getColor().getColorType() != -1 || ((BulletFormat) bullet).m440m9().m3938k4() != -1 || bullet.isBulletHardFont() != -1 || bullet.getFont() != null || !C14064he.m66715kk(bullet.getHeight()) || bullet.getNumberedBulletStartWith() != -1 || iParagraphFormat.getFontAlignment() != -1 || iParagraphFormat.getAlignment() != -1) {
            return true;
        }
        ParagraphFormat paragraphFormat = (ParagraphFormat) iParagraphFormat;
        return (paragraphFormat.m2192h4() == -1 && C14044b3.m66437kk((double) iParagraphFormat.getMarginLeft()) && C14044b3.m66437kk((double) iParagraphFormat.getMarginRight()) && C14044b3.m66437kk((double) iParagraphFormat.getIndent()) && C14044b3.m66437kk((double) iParagraphFormat.getDefaultTabSize()) && C14064he.m66715kk(iParagraphFormat.getSpaceAfter()) && C14064he.m66715kk(iParagraphFormat.getSpaceBefore()) && C14064he.m66715kk(iParagraphFormat.getSpaceWithin()) && iParagraphFormat.getEastAsianLineBreak() == -1 && iParagraphFormat.getHangingPunctuation() == -1 && iParagraphFormat.getLatinLineBreak() == -1 && iParagraphFormat.getRightToLeft() == -1 && paragraphFormat.m2188ck() == 0 && ((PortionFormat) iParagraphFormat.getDefaultPortionFormat()).m2310lr()) ? false : true;
    }
}
