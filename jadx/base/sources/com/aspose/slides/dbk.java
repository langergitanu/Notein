package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8881to;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p464vq.AbstractC11700af;
import com.aspose.slides.internal.p464vq.AbstractC11721ck;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11796qk;
import com.aspose.slides.internal.p464vq.AbstractC11812sq;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11805rq;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p482wr.C12250c6;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
class dbk {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4566k4 = new C7017h4("package", "acroexch.document.dc", "prism10.document", "word.document.12", "powerpoint.show.12", "excel.sheetbinarymacroenabled.12", "excel.sheet.12", "wordpad.document.1", "paint.picture", "msgraph.chart.8", "powerpoint.slide.8", "excel.sheet.8", "powerpoint.show.8", "word.document.8", "opendocument.mathdocument.1");

    /* JADX INFO: renamed from: k4 */
    private static C11791os m5026k4(final OleObjectFrame oleObjectFrame, final u8s u8sVar) {
        if (C14113y2.m67411k4(oleObjectFrame.getEmbeddedFileName()) || !C14113y2.m67448x1(oleObjectFrame.getEmbeddedFileName(), "/ppt/embeddings") || C3085sv.m13074k4((Object[]) u8sVar.mo4812qm().m55388c5(), (AbstractC14041ai) new AbstractC14041ai<C11791os>() { // from class: com.aspose.slides.dbk.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C11791os c11791os) {
                return C14113y2.m67363du(c11791os.m55427x1(), oleObjectFrame.getEmbeddedFileName());
            }
        }) != -1) {
            boolean zM5037x1 = m5037x1(oleObjectFrame);
            return u8sVar.mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/embeddings", "/oleObject{0}", zM5037x1 ? m5027k4(oleObjectFrame) : ".bin"), new AbstractC11760jd.k4() { // from class: com.aspose.slides.dbk.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextOleObjectFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71553ne();
                }
            }, zM5037x1 ? m5036kk(oleObjectFrame) : new C11805rq());
        }
        if (C14113y2.m67359c5(oleObjectFrame.getEmbeddedFileName(), "oleObject")) {
            int[] iArr = {0};
            boolean z = C14057f9.m66590k4(C14113y2.m67401k4(C14113y2.m67443x1(oleObjectFrame.getEmbeddedFileName(), 0, C14113y2.m67429to(oleObjectFrame.getEmbeddedFileName(), FilenameUtils.EXTENSION_SEPARATOR)), C14113y2.m67408k4("/ppt/embeddings", "/oleObject"), ""), iArr) && u8sVar.m71535ix() < iArr[0];
            int i = iArr[0];
            if (z) {
                u8sVar.m71569x1(i);
            }
        } else {
            u8sVar.m71553ne();
        }
        return u8sVar.mo4812qm().m55394k4(oleObjectFrame.getEmbeddedFileName(), (AbstractC11760jd.k4) null, C14113y2.m67424kk(oleObjectFrame.getEmbeddedFileName(), ".bin") ? new C11805rq() : m5036kk(oleObjectFrame));
    }

    /* JADX INFO: renamed from: kk */
    private static AbstractC11812sq m5036kk(IOleObjectFrame iOleObjectFrame) {
        qdi[] qdiVarArr = {null};
        return !gbd.m6466k4().tryGetValue(C14113y2.m67368h4(iOleObjectFrame.getObjectProgId()), qdiVarArr) ? new C11805rq() : qdiVarArr[0].m69544x1();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m5037x1(IOleObjectFrame iOleObjectFrame) {
        qdi[] qdiVarArr = {null};
        boolean zTryGetValue = gbd.m6466k4().tryGetValue(C14113y2.m67368h4(iOleObjectFrame.getObjectProgId()), qdiVarArr);
        qdi qdiVar = qdiVarArr[0];
        if (zTryGetValue) {
            return "1".equals(qdiVar.m69542kk());
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m5027k4(IOleObjectFrame iOleObjectFrame) {
        qdi[] qdiVarArr = {null};
        return !gbd.m6466k4().tryGetValue(C14113y2.m67368h4(iOleObjectFrame.getObjectProgId()), qdiVarArr) ? ".bin" : qdiVarArr[0].m69541k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5028k4(IOleObjectFrame iOleObjectFrame, com.aspose.slides.internal.p332p7.hzq hzqVar, C11709bg c11709bg) {
        C12015qq c12015qqClone = ((OleObjectFrame) iOleObjectFrame).m2075k4().Clone();
        if (c12015qqClone.m56696k4() || iOleObjectFrame.isObjectIcon()) {
            c12015qqClone = new C12015qq(iOleObjectFrame.getWidth(), iOleObjectFrame.getHeight());
        }
        hzqVar.m33774kk(iOleObjectFrame.getObjectName());
        hzqVar.m33765du(iOleObjectFrame.getObjectProgId());
        hzqVar.m33772k4(iOleObjectFrame.isObjectIcon());
        hzqVar.m33771k4(c12015qqClone.m56699x1());
        hzqVar.m33779x1(c12015qqClone.m56697kk());
        if (iOleObjectFrame.isObjectLink()) {
            ((com.aspose.slides.internal.p332p7.uj6) hzqVar.m33769k4("link").m29542x1()).m42437k4(iOleObjectFrame.getUpdateAutomatic());
        } else {
            hzqVar.m33769k4("embed");
        }
        if (c11709bg != null) {
            hzqVar.m33776to(c11709bg.m55289du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5029k4(final OleObjectFrame oleObjectFrame, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        if (pijVar == null) {
            return;
        }
        C14297pp.m69181k4(oleObjectFrame, pijVar, bjsVar);
        C8881to c8881toM43905rv = pijVar.mo31678kk().m33836k4().m43905rv();
        com.aspose.slides.internal.p332p7.hzq hzqVarM41817kk = (!C3083s7.f9152k4.m12773k4("urn:schemas-microsoft-com:vml") || c8881toM43905rv.m41818to() == null) ? c8881toM43905rv.m41817kk() : c8881toM43905rv.m41818to();
        String strM33778x1 = hzqVarM41817kk.m33778x1();
        String str = "";
        if (strM33778x1 != null && !"".equals(strM33778x1)) {
            bjsVar.m4234k4(strM33778x1, oleObjectFrame);
        }
        oleObjectFrame.setObjectIcon(hzqVarM41817kk.m33777to());
        if ("link".equals(hzqVarM41817kk.m33763c5().m29539k4())) {
            oleObjectFrame.m2089x1(true);
        } else {
            oleObjectFrame.m2089x1(false);
            oleObjectFrame.f2872h4 = false;
        }
        oleObjectFrame.m2077k4(new C12015qq((float) hzqVarM41817kk.m33767h4(), (float) hzqVarM41817kk.m33775m9()));
        oleObjectFrame.setObjectName(hzqVarM41817kk.m33773kk());
        String strM33764du = hzqVarM41817kk.m33764du();
        oleObjectFrame.setObjectProgId(hzqVarM41817kk.m33766dy());
        if (!C18358t1.g.f56183c.equals(strM33764du) && !C14113y2.m67411k4(strM33764du)) {
            C11709bg c11709bgM55303k4 = bjsVar.m4229k4().m55338u4().m55303k4(strM33764du);
            if (C14113y2.m67363du("NULL", c11709bgM55303k4.m55292k4())) {
                oleObjectFrame.mo268du().m71910k4(true);
            } else if (c11709bgM55303k4.m55294m9() == 1) {
                m5033k4(c11709bgM55303k4.m55292k4(), oleObjectFrame);
            } else {
                m5032k4(c11709bgM55303k4, oleObjectFrame, bjsVar);
            }
            if (hzqVarM41817kk.m33768jd() != null && hzqVarM41817kk.m33768jd().m30643x1() != null) {
                com.aspose.slides.internal.p332p7.ks0 ks0VarM30643x1 = hzqVarM41817kk.m33768jd().m30643x1();
                xps.m73532k4((PictureFillFormat) oleObjectFrame.getSubstitutePictureFormat(), ks0VarM30643x1.mo35659x1(), bjsVar.m4229k4());
                C8087kh c8087khMo35657kk = ks0VarM30643x1.mo35657kk();
                C1169h1.m6958k4(oleObjectFrame.getFillFormat(), c8087khMo35657kk.m35371dy(), bjsVar.m4229k4());
                if (c8087khMo35657kk.m35368c5() != null) {
                    euh.m5728k4(oleObjectFrame.getLineFormat(), c8087khMo35657kk.m35368c5());
                }
                C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.dbk.1
                    @Override // com.aspose.slides.C1158gq.k4
                    /* JADX INFO: renamed from: k4 */
                    public IEffectFormat mo3774k4() {
                        return oleObjectFrame.getEffectFormat();
                    }
                }, c8087khMo35657kk.m35374jd(), bjsVar.m4229k4());
                PPImage pPImage = (PPImage) oleObjectFrame.getSubstitutePictureFormat().getPicture().getImage();
                if (oleObjectFrame.isObjectIcon() && pPImage != null && pPImage.m2129jd()) {
                    if ("image/x-wmf".equals(pPImage.getContentType())) {
                        String[] strArr = {""};
                        C3099wl.m13192k4(pPImage.getBinaryData(), strArr);
                        str = strArr[0];
                    } else if ("image/x-emf".equals(pPImage.getContentType())) {
                        String[] strArr2 = {""};
                        C3099wl.m13200x1(pPImage.getBinaryData(), strArr2);
                        str = strArr2[0];
                    }
                    oleObjectFrame.f2871du = str;
                    oleObjectFrame.f2881to = pPImage.m2128h4();
                }
            }
        }
        if ("link".equals(hzqVarM41817kk.m33763c5().m29539k4())) {
            oleObjectFrame.f2872h4 = ((com.aspose.slides.internal.p332p7.uj6) hzqVarM41817kk.m33763c5().m29542x1()).m42438k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5030k4(OleObjectFrame oleObjectFrame, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        C11709bg c11709bgM55304k4;
        oleObjectFrame.mo268du();
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        C14297pp.m69182k4(oleObjectFrame, pijVar, u8sVarM70580k4);
        C8881to c8881toM43891du = pijVar.mo31678kk().m33836k4().m43891du();
        com.aspose.slides.internal.p332p7.hzq hzqVarM41819x1 = c8881toM43891du.m41819x1();
        com.aspose.slides.internal.p332p7.hzq hzqVarM41816k4 = c8881toM43891du.m41816k4();
        if (oleObjectFrame.isObjectLink()) {
            c11709bgM55304k4 = u8sVarM70580k4.m55433g8().m55305k4(AbstractC11796qk.f39831k4.m55382k4(), C3085sv.m13080k4(oleObjectFrame.getLinkPathLong()), (byte) 1);
        } else if (oleObjectFrame.m2090yj() != null) {
            C11791os c11791osM5026k4 = m5026k4(oleObjectFrame, u8sVarM70580k4);
            c11791osM5026k4.m55423k4((byte[]) oleObjectFrame.m2090yj().clone());
            c11709bgM55304k4 = u8sVarM70580k4.m55433g8().m55305k4(c11791osM5026k4.m55372fa().mo55275x1().m55382k4(), c11791osM5026k4.m55427x1(), (byte) 0);
        } else {
            c11709bgM55304k4 = oleObjectFrame.mo268du().m71911x1() ? u8sVarM70580k4.m55433g8().m55304k4(AbstractC11700af.f39664k4.m55382k4(), "NULL") : null;
        }
        IPictureFillFormat substitutePictureFormat = oleObjectFrame.getSubstitutePictureFormat();
        PPImage pPImage = (PPImage) substitutePictureFormat.getPicture().getImage();
        if (oleObjectFrame.isObjectIcon() && pPImage != null) {
            substitutePictureFormat = oleObjectFrame.m2083qq();
        }
        String strM67402k4 = C14113y2.m67402k4("_x0000_s{0:D4}", Integer.valueOf(sdpVar.m70579k4(oleObjectFrame)));
        m5028k4(oleObjectFrame, hzqVarM41819x1, c11709bgM55304k4);
        hzqVarM41819x1.m33780x1(strM67402k4);
        m5028k4(oleObjectFrame, hzqVarM41816k4, c11709bgM55304k4);
        com.aspose.slides.internal.p332p7.ks0 ks0VarM30642k4 = hzqVarM41816k4.m33770k4().m30642k4();
        ks0VarM30642k4.mo35656k4().mo42132k4().m31577k4("OLE substitute image");
        axn.m3767k4(oleObjectFrame, ks0VarM30642k4.mo35657kk(), u8sVarM70580k4);
        C9365zg c9365zg = (C9365zg) ks0VarM30642k4.mo35657kk().m35384kk("prstGeom").m29542x1();
        c9365zg.m45599k4(5);
        c9365zg.m45598k4();
        xps.m73533k4((PictureFillFormat) substitutePictureFormat, ks0VarM30642k4.mo35659x1(), u8sVarM70580k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5031k4(C11709bg c11709bg, OleObjectFrame oleObjectFrame) {
        try {
            oleObjectFrame.m2088x1(c11709bg.m55292k4());
            String strM67361du = C14113y2.m67361du(oleObjectFrame.getObjectProgId());
            if (gbd.m6466k4().containsKey(strM67361du)) {
                oleObjectFrame.m2078k4(gbd.m6466k4().get_Item(strM67361du).m69540du());
            }
            oleObjectFrame.m2084rv().m2069k4(C3141rv.m13397du(oleObjectFrame.getEmbeddedFileName()));
        } catch (ArgumentException e) {
            oleObjectFrame.m2084rv().m2069k4("bin");
            C3085sv.m13082k4(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5032k4(C11709bg c11709bg, OleObjectFrame oleObjectFrame, bjs bjsVar) {
        C11791os c11791osM55296x1 = c11709bg.m55296x1();
        if (c11791osM55296x1 == null) {
            oleObjectFrame.mo268du().m71910k4(true);
            return;
        }
        c11791osM55296x1.m55422k4(true);
        try {
            if (c11791osM55296x1.m55426to() == null) {
                bjsVar.m4229k4().m6785k4(C14113y2.m67402k4("Embedded OLE-object data not found: {0}", c11791osM55296x1), 1);
                return;
            }
            C3152yj c3152yj = new C3152yj(c11791osM55296x1.m55426to());
            try {
                oleObjectFrame.m2088x1(c11709bg.m55292k4());
                if (!m5034k4(c3152yj, oleObjectFrame, bjsVar.m4229k4())) {
                    m5031k4(c11709bg, oleObjectFrame);
                }
                c3152yj.dispose();
                oleObjectFrame.m2080k4(c11791osM55296x1.m55426to());
                if (oleObjectFrame.m2090yj() == null) {
                    oleObjectFrame.m2076k4(new OleEmbeddedDataInfo());
                    return;
                }
                if (oleObjectFrame.m2084rv().getEmbeddedFileData() == null) {
                    oleObjectFrame.m2084rv().m2070k4(oleObjectFrame.m2090yj());
                }
                if (C14113y2.m67411k4(oleObjectFrame.m2084rv().getEmbeddedFileExtension())) {
                    oleObjectFrame.m2084rv().m2069k4("bin");
                }
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } catch (C12250c6 unused) {
            bjsVar.m4229k4().m6785k4(C14113y2.m67402k4("Embedded OLE-object is corrupted: {0}", c11791osM55296x1), 1);
            oleObjectFrame.mo268du().m71910k4(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5033k4(String str, OleObjectFrame oleObjectFrame) {
        try {
            C14062gk c14062gk = new C14062gk(str);
            C3141rv.m13403k4(c14062gk.m66677ck());
            oleObjectFrame.setLinkPathLong(c14062gk.m66679dy() ? c14062gk.m66677ck() : c14062gk.m66697x1());
        } catch (RuntimeException e) {
            oleObjectFrame.setLinkPathLong(str);
            C3085sv.m13082k4(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public static boolean m5034k4(C3152yj c3152yj, OleObjectFrame oleObjectFrame, AbstractC11721ck abstractC11721ck) {
        int i = c3152yj.readByte();
        if (i > 0) {
            c3152yj.seek(-1L, 1);
            if (((byte) i) == 80) {
                oleObjectFrame.m2084rv().m2070k4(c3152yj.toArray());
                return false;
            }
        }
        if (c3152yj.getLength() >= 4) {
            int i2 = c3152yj.readByte();
            int i3 = c3152yj.readByte();
            int i4 = c3152yj.readByte();
            int i5 = c3152yj.readByte();
            c3152yj.seek(-4L, 1);
            if (i2 == 80 && i3 == 75 && i4 == 3 && i5 == 4) {
                return false;
            }
        }
        C9816ck[] c9816ckArr = {null};
        boolean zM5035k4 = m5035k4(c3152yj, c9816ckArr, oleObjectFrame.getEmbeddedFileName(), abstractC11721ck);
        C9816ck c9816ck = c9816ckArr[0];
        if (zM5035k4) {
            C14047bz c14047bz = new C14047bz(c9816ck.m48360k4().m48376h4());
            if (gbd.m6487x1().containsKey(c14047bz.Clone()) && c9816ck.m48360k4().m48342k4().size() > 0) {
                if (C14113y2.m67411k4(oleObjectFrame.getObjectProgId())) {
                    oleObjectFrame.setObjectProgId(gbd.m6487x1().get_Item(c14047bz.Clone()));
                }
                qdi qdiVar = gbd.m6466k4().get_Item(gbd.m6487x1().get_Item(c14047bz.Clone()));
                oleObjectFrame.m2084rv().m2069k4(qdiVar.m69541k4());
                oleObjectFrame.m2078k4(qdiVar.m69540du());
                switch (f4566k4.m27428k4(gbd.m6487x1().get_Item(c14047bz.Clone()))) {
                    case 1:
                    case 2:
                        if (c9816ck.m48360k4().m48345x1("CONTENTS")) {
                            oleObjectFrame.m2084rv().m2070k4(((C9820h4) c9816ck.m48360k4().m48344to("CONTENTS")).m48413x1());
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        try {
                            oleObjectFrame.m2084rv().m2070k4(((C9820h4) c9816ck.m48360k4().m48344to("Package")).m48413x1());
                        } catch (RuntimeException unused) {
                        }
                        break;
                    case 7:
                        oleObjectFrame.m2084rv().m2070k4(((C9820h4) c9816ck.m48360k4().m48344to("Contents")).m48413x1());
                        break;
                    case 8:
                        byte[] bArrM48413x1 = ((C9820h4) c9816ck.m48360k4().m48344to("\u0001Ole10Native")).m48413x1();
                        if (bArrM48413x1 != null && bArrM48413x1.length > 4) {
                            byte[] bArr = new byte[bArrM48413x1.length - 4];
                            System.arraycopy(bArrM48413x1, 4, bArr, 0, bArrM48413x1.length - 4);
                            oleObjectFrame.m2084rv().m2070k4(bArr);
                        }
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        C14047bz.f47172k4.CloneTo(c14047bz);
                        break;
                }
                return false;
            }
            if (C14047bz.m66535k4(c14047bz, C14047bz.f47172k4) && gbd.m6466k4().containsKey(C14113y2.m67361du(oleObjectFrame.getObjectProgId()))) {
                qdi qdiVar2 = gbd.m6466k4().get_Item(C14113y2.m67361du(oleObjectFrame.getObjectProgId()));
                oleObjectFrame.m2084rv().m2069k4(qdiVar2.m69541k4());
                oleObjectFrame.m2078k4(qdiVar2.m69540du());
                if ("1".equals(qdiVar2.m69542kk())) {
                    c9816ck.m48360k4().m48343kk("\u0001Ole");
                    c9816ck.m48360k4().m48343kk("\u0001CompObj");
                    c9816ck.m48360k4().m48343kk("\u0002OlePres000");
                    try {
                        C3152yj c3152yj2 = new C3152yj();
                        c9816ck.m48362x1(c3152yj2);
                        oleObjectFrame.m2084rv().m2070k4(c3152yj2.toArray());
                    } catch (RuntimeException unused2) {
                        oleObjectFrame.m2084rv().m2070k4(c3152yj.toArray());
                    }
                    return true;
                }
            }
        }
        oleObjectFrame.m2084rv().m2069k4(".bin");
        oleObjectFrame.m2084rv().m2070k4(c3152yj.toArray());
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5035k4(C3152yj c3152yj, C9816ck[] c9816ckArr, String str, AbstractC11721ck abstractC11721ck) {
        c9816ckArr[0] = null;
        try {
            C9816ck c9816ck = new C9816ck(c3152yj);
            c9816ckArr[0] = c9816ck;
            if (c9816ck.m48360k4() == null || !C7019kk.m27469x1(c9816ckArr[0].m48360k4().m48384m9(), C9820h4.class) || !((C9820h4) c9816ckArr[0].m48360k4().m48384m9()).m48411kk()) {
                return true;
            }
            ((gnb) abstractC11721ck).m6785k4(C14113y2.m67402k4("Embedded OLE-object has broken sectors: {0}", str), 0);
            return true;
        } catch (RuntimeException unused) {
            ((gnb) abstractC11721ck).m6785k4(C14113y2.m67402k4("Embedded OLE-object {0} corrupted", str), 0);
            return false;
        }
    }
}
