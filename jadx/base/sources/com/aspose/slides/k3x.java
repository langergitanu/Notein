package com.aspose.slides;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.internal.p407st.C10354af;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10374bs;
import com.aspose.slides.internal.p407st.C10386c9;
import com.aspose.slides.internal.p407st.C10387ca;
import com.aspose.slides.internal.p407st.C10397d4;
import com.aspose.slides.internal.p407st.C10422ei;
import com.aspose.slides.internal.p407st.C10424em;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10450gf;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10467hj;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10489j5;
import com.aspose.slides.internal.p407st.C10516kt;
import com.aspose.slides.internal.p407st.C10531ly;
import com.aspose.slides.internal.p407st.C10533m2;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10622rq;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10707x5;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p407st.C10715xl;
import com.aspose.slides.internal.p407st.C10724y1;
import com.aspose.slides.internal.p407st.C10729y9;
import com.aspose.slides.internal.p407st.C10736yo;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.StyleIdentifier;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* JADX INFO: loaded from: classes3.dex */
class k3x {
    /* JADX INFO: renamed from: du */
    public static void m63615du(qah qahVar) {
        C10422ei c10422eiM52137x1;
        C10422ei c10422eiM52137x12;
        C10358am c10358amMo50862jd = qahVar.m69489kk().mo50862jd();
        if (c10358amMo50862jd == null) {
            return;
        }
        Shape shape = (Shape) qahVar.m69481du().m70148u4();
        if (c10358amMo50862jd.m50427dy() != null && (c10422eiM52137x12 = c10358amMo50862jd.m50427dy().m52137x1()) != null) {
            shape.setHyperlinkMouseOver(C14878za.m74359k4(c10422eiM52137x12, qahVar.m69481du()));
        }
        if (c10358amMo50862jd.m50431m9() != null && (c10422eiM52137x1 = c10358amMo50862jd.m50431m9().m52137x1()) != null) {
            shape.setHyperlinkClick(C14878za.m74359k4(c10422eiM52137x1, qahVar.m69481du()));
        }
        if (c10358amMo50862jd.m50428h4() != null && !shape.isGrouped() && (c10358amMo50862jd.m50428h4().m51965x1().m51064c5() & 255) != 0) {
            qahVar.m69493to().m64730qq().addItem(shape, c10358amMo50862jd.m50428h4());
        }
        C13658is.m63092k4(shape.getCustomData(), c10358amMo50862jd.m50425ck());
        if (shape.getCustomData().getTags().contains("AS_UNIQUEID")) {
            shape.m2578to(shape.getCustomData().getTags().get_Item("AS_UNIQUEID"));
            shape.getCustomData().getTags().remove("AS_UNIQUEID");
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static void m63617h4(uz3 uz3Var) {
        PictureFillFormat pictureFillFormatM2083qq;
        PictureFrame pictureFrame = (PictureFrame) C7019kk.m27452k4((Object) uz3Var.mo64936jd(), PictureFrame.class);
        if (pictureFrame == null) {
            OleObjectFrame oleObjectFrame = (OleObjectFrame) C7019kk.m27452k4((Object) uz3Var.mo64936jd(), OleObjectFrame.class);
            if (oleObjectFrame == null) {
                return;
            }
            pictureFillFormatM2083qq = oleObjectFrame.f2885x1;
            PPImage pPImage = (PPImage) pictureFillFormatM2083qq.getPicture().getImage();
            if (oleObjectFrame.isObjectIcon() && pPImage != null) {
                pictureFillFormatM2083qq = oleObjectFrame.m2083qq();
            }
        } else {
            pictureFillFormatM2083qq = (PictureFillFormat) pictureFrame.getPictureFormat();
        }
        if (pictureFillFormatM2083qq == null) {
            return;
        }
        C10534m3 c10534m3M72004qq = uz3Var.m72004qq();
        moa.m64928k4(pictureFillFormatM2083qq, c10534m3M72004qq, uz3Var.m3745to().m3738du().m70215k4());
        if (c10534m3M72004qq.m51263x1().m50923k4(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6) == null) {
            c10534m3M72004qq.m51263x1().m50930x1(new C10424em());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63618k4(Shape shape) {
        return m63619k4(shape, new C12007ix(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight()));
    }

    /* JADX INFO: renamed from: kk */
    public static void m63632kk(uz3 uz3Var) {
        FillFormat fillFormat;
        LineFormat lineFormat;
        y2n y2nVarM70215k4 = uz3Var.m3738du().m70215k4();
        Shape shapeMo64936jd = uz3Var.mo64936jd();
        C10462h9 c10462h9M72000ix = uz3Var.m72000ix();
        OleObjectFrame oleObjectFrame = (OleObjectFrame) C7019kk.m27452k4((Object) shapeMo64936jd, OleObjectFrame.class);
        m63623k4(c10462h9M72000ix, shapeMo64936jd.getFrame(), oleObjectFrame != null, C7019kk.m27469x1(shapeMo64936jd, IConnector.class), !uz3Var.m3739h4());
        C14856yp.m73973x1(uz3Var);
        C10534m3 c10534m3M72004qq = uz3Var.m72004qq();
        C22225Oooo0oO.OooO0O0(127, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, c10534m3M72004qq.m51263x1());
        C10711xc c10711xcM71997ar = uz3Var.m71997ar();
        if (C7019kk.m27469x1(shapeMo64936jd, SmartArt.class)) {
            C10397d4 c10397d4 = new C10397d4();
            c10397d4.m50638k4(true);
            c10711xcM71997ar.m51976x1().m50930x1(c10397d4);
        }
        C14281ph.m69050k4(uz3Var);
        C14856yp.m73971k4(uz3Var);
        if (shapeMo64936jd.getHidden()) {
            C10489j5 c10489j5 = new C10489j5();
            c10534m3M72004qq.m51263x1().m50930x1(c10489j5);
            c10489j5.m50985k4(true);
            c10489j5.m50987to(true);
        }
        if (C7019kk.m27469x1(shapeMo64936jd, SmartArt.class)) {
            C10609qn c10609qn = new C10609qn(StyleIdentifier.SUBTLE_EMPHASIS, true, 0L);
            c10534m3M72004qq.m51263x1().m50930x1(c10609qn);
            y2nVarM70215k4.m71949k4(c10609qn, shapeMo64936jd.getPresentation().getImages().addImage(new SvgImage(m63618k4(shapeMo64936jd))));
        } else {
            m63617h4(uz3Var);
        }
        boolean z = C7019kk.m27469x1(shapeMo64936jd, GeometryShape.class) && ((GeometryShape) shapeMo64936jd).getShapeStyle() != null;
        IFillFormatEffectiveData iFillFormatEffectiveDataMo1585ix = shapeMo64936jd.mo1585ix();
        if (iFillFormatEffectiveDataMo1585ix == null || !(z || shapeMo64936jd.getFillFormat().getFillType() == -1)) {
            fillFormat = (FillFormat) shapeMo64936jd.getFillFormat();
        } else {
            fillFormat = new FillFormat(shapeMo64936jd);
            fillFormat.m1457k4(iFillFormatEffectiveDataMo1585ix);
        }
        C14680vi.m72290k4(fillFormat, uz3Var);
        ILineFormatEffectiveData iLineFormatEffectiveDataMo1587ne = shapeMo64936jd.mo1587ne();
        if (iLineFormatEffectiveDataMo1587ne == null || !(z || shapeMo64936jd.getLineFormat().getFillFormat().getFillType() == -1)) {
            lineFormat = (LineFormat) shapeMo64936jd.getLineFormat();
        } else {
            lineFormat = new LineFormat(shapeMo64936jd);
            lineFormat.m1897k4(iLineFormatEffectiveDataMo1587ne);
        }
        GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shapeMo64936jd, GeometryShape.class);
        byte bM5993x1 = geometryShape != null ? f6b.m5993x1(geometryShape.getShapeType()) : (byte) -1;
        if (lineFormat != null) {
            tcp.m71098k4(lineFormat, c10462h9M72000ix, bM5993x1, y2nVarM70215k4);
        }
        C14200nt.m68201x1(uz3Var);
        C14200nt.m68200k4(uz3Var);
        qo7.m69720k4(shapeMo64936jd.getThreeDFormat(), c10534m3M72004qq, c10711xcM71997ar, y2nVarM70215k4);
        float fM67988kk = shapeMo64936jd.mo1214P_().m67988kk();
        if (C14116yg.m67480k4(shapeMo64936jd.mo1214P_().m67988kk()) > 1.0E-6d) {
            if (shapeMo64936jd.mo1214P_().m67989to() != shapeMo64936jd.mo1214P_().m67980du()) {
                fM67988kk = -fM67988kk;
            }
            if (fM67988kk < 0.0f) {
                fM67988kk += 360.0f;
            }
            c10534m3M72004qq.m51263x1().m50930x1(new C10609qn(4, false, ((((C7019kk.m27435du(Float.valueOf(fM67988kk), 13) & 4294967295L) % 360) & 4294967295L) << 16) & 4294967295L));
        }
        if (shapeMo64936jd.mo1638uz().m72308fa() != null) {
            m63625k4(c10534m3M72004qq, shapeMo64936jd.mo1638uz().m72308fa());
        }
        m63634to(uz3Var);
        m63616du(uz3Var);
        nd1 nd1VarMo1214P_ = shapeMo64936jd.mo1214P_();
        C1258im c1258im = new C1258im();
        c1258im.f5734x1 = fM67988kk;
        c1258im.f5733to = nd1VarMo1214P_.m67989to() == 1;
        c1258im.f5732kk = nd1VarMo1214P_.m67980du() == 1;
        if (uz3Var.m3739h4()) {
            m63622k4(c10462h9M72000ix, shapeMo64936jd.getFrame(), c1258im.Clone());
        } else {
            m63624k4(c10462h9M72000ix, nd1VarMo1214P_.m67982k4().Clone(), shapeMo64936jd.m2575sv().Clone(), c1258im.Clone());
        }
        C10358am c10358amM72007um = uz3Var.m72007um();
        if (oleObjectFrame != null) {
            C10531ly c10531ly = new C10531ly();
            c10358amM72007um.m50507k4(c10531ly);
            c10531ly.m51228k4(afp.m3546k4(oleObjectFrame, uz3Var));
        }
        if (C7019kk.m27469x1(shapeMo64936jd, VideoFrame.class)) {
            C10433f7 c10433f7M51710m9 = y2nVarM70215k4.m71954x1().m51483du().m50965m9().m51710m9();
            knz.m64052k4((VideoFrame) C7019kk.m27452k4((Object) shapeMo64936jd, VideoFrame.class), c10433f7M51710m9, uz3Var);
            C10531ly c10531ly2 = new C10531ly();
            c10531ly2.m51228k4(((c10433f7M51710m9.m50785x1().m50689x1() & 4294967295L) - 1) & 4294967295L);
            c10358amM72007um.m50507k4(c10531ly2);
        }
        if (C7019kk.m27469x1(shapeMo64936jd, AudioFrame.class)) {
            C14765x5.m73106k4((AudioFrame) C7019kk.m27452k4((Object) shapeMo64936jd, AudioFrame.class), y2nVarM70215k4.m71954x1().m51483du().m50965m9().m51710m9(), uz3Var);
        }
        blo.m4257k4(uz3Var);
        if (shapeMo64936jd.getHyperlinkClick() != null) {
            C14878za.m74362k4((Hyperlink) shapeMo64936jd.getHyperlinkClick(), true, uz3Var);
        }
        if (shapeMo64936jd.getHyperlinkMouseOver() != null) {
            C14878za.m74362k4((Hyperlink) shapeMo64936jd.getHyperlinkMouseOver(), false, uz3Var);
        }
        m63627k4(uz3Var);
    }

    /* JADX INFO: renamed from: to */
    public static void m63633to(qah qahVar) {
        Shape shape;
        ri7 ri7VarM69481du = qahVar.m69481du();
        if (ri7VarM69481du.m70148u4() != null) {
            shape = (Shape) ri7VarM69481du.m70148u4();
        } else {
            Shape shapeM2630k4 = ri7VarM69481du.m70144ks().m2630k4();
            ri7VarM69481du.m70143k4(shapeM2630k4);
            shape = shapeM2630k4;
        }
        shape.m2577to(qahVar.m69479c5());
        shape.setAlternativeText("");
        m63626k4(qahVar);
        m63615du(qahVar);
        m63629k4(shape.mo1638uz(), qahVar.m69489kk());
        m63636x1(qahVar);
        C14281ph.m69049k4(qahVar);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m63635x1(Shape shape, C10355ai c10355ai) {
        String strM63620k4 = m63620k4(c10355ai.mo50423x1());
        if (strM63620k4 != null) {
            shape.setName(strM63620k4);
        }
    }

    /* JADX INFO: renamed from: du */
    public static void m63616du(uz3 uz3Var) {
        Shape shapeM72003ne = uz3Var.m72003ne();
        if (shapeM72003ne == null) {
            shapeM72003ne = uz3Var.mo64936jd();
        }
        if (shapeM72003ne == null || C14113y2.m67411k4(shapeM72003ne.getAlternativeText())) {
            return;
        }
        uz3Var.m72004qq().m51263x1().m50930x1(new C10355ai(897, m63631k4(shapeM72003ne.getAlternativeText())));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63619k4(Shape shape, C12007ix c12007ix) {
        C3152yj c3152yj = new C3152yj();
        try {
            vhx vhxVar = new vhx(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13), 72.0f, 72.0f, 72.0f, new SVGOptions(), null);
            try {
                vhxVar.m74612k4(-c12007ix.m56557jd(), -c12007ix.m56551ck());
                shape.m2546bz().mo4131k4(vhxVar, new c9d(shape.getSlide(), new C12210k4(C7134m9.class, C7131h4.class), new C13700js(), null), InterruptionToken.getNone());
                vhxVar.m72276k4((AbstractC3150x6) c3152yj, true);
                vhxVar.dispose();
                c3152yj.setPosition(0L);
                C3148wl c3148wl = new C3148wl(c3152yj);
                try {
                    String strMo13427dy = c3148wl.mo13427dy();
                    c3148wl.dispose();
                    c3152yj.dispose();
                    return strMo13427dy;
                } catch (Throwable th) {
                    c3148wl.dispose();
                    throw th;
                }
            } catch (Throwable th2) {
                vhxVar.dispose();
                throw th2;
            }
        } catch (Throwable th3) {
            c3152yj.dispose();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: to */
    public static void m63634to(uz3 uz3Var) {
        Shape shapeM72003ne = uz3Var.m72003ne();
        if (shapeM72003ne == null) {
            shapeM72003ne = uz3Var.mo64936jd();
        }
        if (shapeM72003ne == null) {
            return;
        }
        C10534m3 c10534m3M72308fa = shapeM72003ne.mo1638uz().m72308fa();
        C10729y9 c10729y9 = !C14113y2.m67411k4(shapeM72003ne.getName()) ? new C10729y9(896, m63631k4(shapeM72003ne.getName())) : c10534m3M72308fa != null ? (C10729y9) C22223Oooo0o.OooO0O0(c10534m3M72308fa, 959, C10729y9.class) : null;
        if (c10729y9 != null) {
            C10534m3 c10534m3M72004qq = uz3Var.m72004qq();
            c10534m3M72004qq.m51263x1().m50930x1(c10729y9);
            C10489j5 c10489j5 = (C10489j5) C7019kk.m27452k4((Object) c10534m3M72004qq.m51263x1().m50923k4(959), C10489j5.class);
            if (c10489j5 == null) {
                c10489j5 = new C10489j5();
                c10534m3M72004qq.m51263x1().m50930x1(c10489j5);
            }
            c10489j5.m50985k4(true);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m63636x1(qah qahVar) {
        AbstractC10458gz abstractC10458gzM69489kk = qahVar.m69489kk();
        if (abstractC10458gzM69489kk == null) {
            return;
        }
        hi8.m7176k4(qahVar);
        Shape shape = (Shape) qahVar.m69481du().m70148u4();
        tbp tbpVar = new tbp();
        tbp tbpVar2 = new tbp();
        C1258im c1258im = new C1258im();
        tbp[] tbpVarArr = {tbpVar};
        tbp[] tbpVarArr2 = {tbpVar2};
        C1258im[] c1258imArr = {c1258im};
        xbk.m73301k4(abstractC10458gzM69489kk, tbpVarArr, tbpVarArr2, c1258imArr);
        tbpVarArr[0].CloneTo(tbpVar);
        tbpVarArr2[0].CloneTo(tbpVar2);
        c1258imArr[0].CloneTo(c1258im);
        shape.mo2564k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63620k4(byte[] bArr) {
        char[] cArrM26671k4;
        if (bArr == null || bArr.length == 0 || (cArrM26671k4 = new C6773ss().m26671k4(bArr)) == null || cArrM26671k4.length <= 0) {
            return null;
        }
        return cArrM26671k4[cArrM26671k4.length + (-1)] == 0 ? C14113y2.m67406k4(cArrM26671k4, 0, cArrM26671k4.length - 1) : C14113y2.m67405k4(cArrM26671k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63621k4(Shape shape, C10355ai c10355ai) {
        shape.setAlternativeText(C3085sv.m13107x1(m63620k4(c10355ai.mo50423x1())));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63622k4(C10462h9 c10462h9, IShapeFrame iShapeFrame, C1258im c1258im) {
        double d;
        double d2;
        double d3;
        double d4;
        float x = iShapeFrame.getX();
        float y = iShapeFrame.getY();
        float width = iShapeFrame.getWidth();
        float height = iShapeFrame.getHeight();
        float f = c1258im.f5734x1;
        if ((f < 45.0f || f >= 135.0f) && (f < 225.0f || f >= 315.0f)) {
            d = x * 8.0f;
            d2 = y * 8.0f;
            d3 = width * 8.0f;
            d4 = height * 8.0f;
        } else {
            d = (x - ((height - width) / 2.0f)) * 8.0f;
            d2 = (y - ((width - height) / 2.0f)) * 8.0f;
            d3 = height * 8.0f;
            d4 = width * 8.0f;
        }
        c10462h9.mo50864to().m52041m9(c1258im.f5733to);
        c10462h9.mo50864to().m52030dy(c1258im.f5732kk);
        C10386c9 c10386c9 = new C10386c9();
        c10386c9.m50546k4(new C12014ne(OooO.OooO00o(d, 14), OooO.OooO00o(d2, 14), OooO.OooO00o(d3, 14), OooO.OooO00o(d4, 14)));
        c10462h9.m50507k4(c10386c9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63623k4(C10462h9 c10462h9, IShapeFrame iShapeFrame, boolean z, boolean z2, boolean z3) {
        C10724y1 c10724y1Mo50864to = c10462h9.mo50864to();
        c10724y1Mo50864to.m52038k4(false);
        c10724y1Mo50864to.m52046x1(z3);
        c10724y1Mo50864to.m52039kk(false);
        c10724y1Mo50864to.m52043to(false);
        c10724y1Mo50864to.m52028du(z);
        c10724y1Mo50864to.m52041m9(iShapeFrame.getFlipH() == 1);
        c10724y1Mo50864to.m52030dy(iShapeFrame.getFlipV() == 1);
        c10724y1Mo50864to.m52026c5(z2);
        c10724y1Mo50864to.m52035jd(true);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63624k4(C10462h9 c10462h9, tbp tbpVar, tbp tbpVar2, C1258im c1258im) {
        double d;
        double d2;
        double d3;
        double d4;
        float f = c1258im.f5734x1;
        if ((f < 45.0f || f >= 135.0f) && (f < 225.0f || f >= 315.0f)) {
            d = tbpVar.f49090k4 * 12700.0d;
            double d5 = tbpVar.f49091x1 * 12700.0d;
            double d6 = tbpVar2.f49090k4 * 12700.0d;
            double d7 = tbpVar2.f49091x1 * 12700.0d;
            c10462h9.mo50864to().m52041m9(c1258im.f5733to);
            c10462h9.mo50864to().m52030dy(c1258im.f5732kk);
            d2 = d7;
            d3 = d5;
            d4 = d6;
        } else {
            double d8 = tbpVar.f49090k4;
            double d9 = tbpVar2.f49091x1;
            double d10 = tbpVar2.f49090k4;
            d = (d8 - ((d9 - d10) / 2.0d)) * 12700.0d;
            d3 = (tbpVar.f49091x1 - ((d10 - d9) / 2.0d)) * 12700.0d;
            d4 = d9 * 12700.0d;
            d2 = d10 * 12700.0d;
            c10462h9.mo50864to().m52041m9(c1258im.f5733to);
            c10462h9.mo50864to().m52030dy(c1258im.f5732kk);
        }
        C10715xl c10715xl = new C10715xl();
        c10715xl.m51980k4(new C12014ne(OooO.OooO00o(d, 14), OooO.OooO00o(d3, 14), OooO.OooO00o(d4, 14), OooO.OooO00o(d2, 14)));
        c10462h9.m50507k4(c10715xl);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63625k4(C10534m3 c10534m3, C10534m3 c10534m32) {
        if (c10534m32 == null) {
            throw new ArgumentNullException("source");
        }
        C10480ii c10480iiM51263x1 = c10534m32.m51263x1();
        C10533m2 c10533m2 = (C10533m2) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(255), C10533m2.class);
        if (c10533m2 != null) {
            c10534m3.m51263x1().m50930x1(c10533m2);
        }
        C10450gf c10450gf = (C10450gf) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(197), C10450gf.class);
        if (c10450gf != null) {
            c10534m3.m51263x1().m50930x1(c10450gf);
        }
        C10707x5 c10707x5 = (C10707x5) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(192), C10707x5.class);
        if (c10707x5 != null) {
            c10534m3.m51263x1().m50930x1(c10707x5);
        }
        C10374bs c10374bs = (C10374bs) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(447), C10374bs.class);
        if (!c10534m3.m51263x1().m50931x1(447) && c10374bs != null) {
            c10534m3.m51263x1().m50930x1(c10374bs);
        }
        C10387ca c10387ca = (C10387ca) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(385), C10387ca.class);
        if (!c10534m3.m51263x1().m50931x1(385) && c10387ca != null) {
            c10534m3.m51263x1().m50930x1(c10387ca);
        }
        C10736yo c10736yo = (C10736yo) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(FrameMetricsAggregator.EVERY_DURATION), C10736yo.class);
        if (!c10534m3.m51263x1().m50931x1(FrameMetricsAggregator.EVERY_DURATION) && c10736yo != null) {
            c10534m3.m51263x1().m50930x1(c10736yo);
            ((C10736yo) C7019kk.m27452k4((Object) c10534m3.m51263x1().m50923k4(FrameMetricsAggregator.EVERY_DURATION), C10736yo.class)).m52093kk(true);
        }
        C10622rq c10622rq = (C10622rq) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(191), C10622rq.class);
        if (c10622rq != null) {
            c10534m3.m51263x1().m50930x1(c10622rq);
        }
        C10354af c10354af = (C10354af) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(133), C10354af.class);
        if (c10354af != null) {
            c10534m3.m51263x1().m50930x1(c10354af);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63626k4(qah qahVar) {
        AbstractC10458gz abstractC10458gzM69489kk = qahVar.m69489kk();
        if (abstractC10458gzM69489kk.mo50859du() == null) {
            return;
        }
        Shape shape = (Shape) qahVar.m69481du().m70148u4();
        C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) abstractC10458gzM69489kk.mo50859du().m51263x1().m50923k4(897), C10355ai.class);
        if (c10355ai != null) {
            m63621k4(shape, c10355ai);
        }
        C10355ai c10355ai2 = (C10355ai) C7019kk.m27452k4((Object) abstractC10458gzM69489kk.mo50859du().m51263x1().m50923k4(896), C10355ai.class);
        if (c10355ai2 != null) {
            m63635x1(shape, c10355ai2);
        }
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) abstractC10458gzM69489kk.mo50859du().m51263x1().m50923k4(959), C10609qn.class);
        if (c10609qn != null) {
            shape.setHidden((c10609qn.m51597ar() & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63627k4(uz3 uz3Var) {
        y2n y2nVarM70215k4 = uz3Var.m3745to().m3738du().m70215k4();
        C10358am c10358amM72007um = uz3Var.m72007um();
        Shape shapeMo64936jd = uz3Var.mo64936jd();
        if (y2nVarM70215k4.m71946k4().m2384kk() || shapeMo64936jd.getCustomData().getTags().size() != 0) {
            C10516kt c10516kt = new C10516kt();
            if (y2nVarM70215k4.m71946k4().m2384kk()) {
                C10467hj c10467hj = new C10467hj();
                c10516kt.m50513yj().addItem(c10467hj);
                c10467hj.m50513yj().addItem(new C10626rv("AS_UNIQUEID", (short) 0));
                c10467hj.m50513yj().addItem(new C10626rv(C14114y9.m67459k4(shapeMo64936jd.getUniqueId(), (InterfaceC14073kp) C11697x1.m55250kk()), (short) 1));
            }
            String[] namesOfTags = shapeMo64936jd.getCustomData().getTags().getNamesOfTags();
            for (int i = 0; i < namesOfTags.length; i++) {
                C10467hj c10467hj2 = new C10467hj();
                c10516kt.m50513yj().addItem(c10467hj2);
                c10467hj2.m50513yj().addItem(new C10626rv(namesOfTags[i], (short) 0));
                c10467hj2.m50513yj().addItem(new C10626rv(shapeMo64936jd.getCustomData().getTags().get_Item(namesOfTags[i]), (short) 1));
            }
            if (c10516kt.m50513yj().size() > 0) {
                c10358amM72007um.m50507k4(c10516kt);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63628k4(viu viuVar, C10358am c10358am) {
        if (viuVar == null) {
            throw new ArgumentNullException("unsupportedProps");
        }
        if (c10358am == null) {
            throw new ArgumentNullException(SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA);
        }
        viuVar.m72313k4(c10358am.m50435x1());
        viuVar.m72319k4(c10358am.m50434to());
        viuVar.m72324k4(c10358am.m50427dy());
        viuVar.m72310k4(c10358am.m50430ks());
        viuVar.m72318k4(c10358am.m50433rv());
        viuVar.m72316k4(c10358am.m50436x6());
        viuVar.m72309k4(c10358am.m50432ne());
        if (c10358am.m50428h4() != null) {
            viuVar.m72321k4(c10358am.m50428h4().m51965x1().m51088x1());
            viuVar.m72327x1(c10358am.m50428h4().m51965x1().m51080kk());
            viuVar.m72325to(c10358am.m50428h4().m51965x1().m51087up());
        }
        if (c10358am.m50431m9() != null) {
            viuVar.m72320k4(c10358am.m50431m9().m52136to());
        }
        if (c10358am.m50425ck() != null) {
            if (c10358am.m50425ck().m51141to() != null) {
                viuVar.m72314k4(c10358am.m50425ck().m51141to().m50901x1());
            }
            if (c10358am.m50425ck().m51139du() != null) {
                viuVar.m72312k4(c10358am.m50425ck().m51139du().m50672x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63629k4(viu viuVar, AbstractC10458gz abstractC10458gz) {
        viuVar.m72323k4(abstractC10458gz.mo50864to());
        viuVar.m72315k4(abstractC10458gz.mo50859du());
        viuVar.m72311k4(abstractC10458gz.mo50861h4());
        viuVar.m72322k4(abstractC10458gz.mo50863m9());
        if (abstractC10458gz.mo50862jd() != null) {
            m63628k4(viuVar, abstractC10458gz.mo50862jd());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63630k4(vpe vpeVar) {
        Control controlM72481c5 = vpeVar.m72481c5();
        y2n y2nVarM70215k4 = vpeVar.m3738du().m70215k4();
        C10462h9 c10462h9M72000ix = vpeVar.m72000ix();
        m63623k4(c10462h9M72000ix, controlM72481c5.getFrame(), true, false, false);
        C10724y1 c10724y1Mo50864to = c10462h9M72000ix.mo50864to();
        c10724y1Mo50864to.m52036k4(201);
        c10724y1Mo50864to.m52032fa(true);
        C10534m3 c10534m3M72004qq = vpeVar.m72004qq();
        c10534m3M72004qq.m51263x1().m50930x1(new C10609qn(127, PlaybackStateCompat.ACTION_SET_REPEAT_MODE));
        if (controlM72481c5.getSubstitutePictureFormat() != null) {
            moa.m64928k4((PictureFillFormat) controlM72481c5.getSubstitutePictureFormat(), c10534m3M72004qq, y2nVarM70215k4);
            if (c10534m3M72004qq.m51263x1().m50923k4(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6) == null) {
                c10534m3M72004qq.m51263x1().m50930x1(new C10424em());
            }
        }
        if (controlM72481c5.m1254x1().m72308fa() != null) {
            m63625k4(c10534m3M72004qq, controlM72481c5.m1254x1().m72308fa());
        }
        IShapeFrame frame = controlM72481c5.getFrame();
        C1258im c1258im = new C1258im();
        c1258im.f5734x1 = 0.0f;
        c1258im.f5733to = frame.getFlipH() == 1;
        c1258im.f5732kk = frame.getFlipV() == 1;
        m63622k4(c10462h9M72000ix, frame, c1258im);
        C10531ly c10531ly = new C10531ly();
        c10462h9M72000ix.mo50862jd().m50507k4(c10531ly);
        c10531ly.m51228k4(afp.m3545k4(controlM72481c5, vpeVar));
        vpeVar.mo5827dy();
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m63631k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        byte[] bArrM26683x1 = AbstractC6747ar.m26643rv().m26683x1(C14113y2.m67365dy(str));
        byte[] bArr = new byte[bArrM26683x1.length + 2];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrM26683x1), 0, AbstractC14092to.m67208k4((Object) bArr), 0, bArrM26683x1.length);
        return bArr;
    }
}
