package com.aspose.slides;

import com.alipay.share.sdk.openapi.APApiImlV1;
import com.alipay.share.sdk.openapi.BaseReq;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kye {
    /* JADX WARN: Type inference failed for: r10v19, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v20, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v29, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v30, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v40, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v41, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v8, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r14v19, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r14v8, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r6v13, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r7v19, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r7v8, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX INFO: renamed from: k4 */
    public static void m64232k4(Presentation presentation) {
        presentation.getDocumentProperties().setPresentationFormat("On-screen Show (4:3)");
        presentation.getDocumentProperties().setSharedDoc(false);
        ((DocumentProperties) presentation.getDocumentProperties()).m1335k4(C14077m4.m66804kk(1.0d).Clone());
        presentation.getDocumentProperties().setTitle("");
        presentation.getDocumentProperties().setAuthor("");
        ((DocumentProperties) presentation.getDocumentProperties()).m1336k4(C14084qq.m67074c5().Clone());
        presentation.getDocumentProperties().setLastSavedBy("");
        ((DocumentProperties) presentation.getDocumentProperties()).m1346to(C14084qq.f47299x1.Clone());
        presentation.getDocumentProperties().setNameOfApplication(C14113y2.m67440x1(BuildVersionInfo.Product));
        presentation.getDocumentProperties().setRevisionNumber(1);
        String[] strArrM67414k4 = C14113y2.m67414k4("24.6", FilenameUtils.EXTENSION_SEPARATOR);
        ((DocumentProperties) presentation.getDocumentProperties()).m1337k4(C14113y2.m67402k4("{0:00}.{1:00}{2:00}", 24, 6, Integer.valueOf(strArrM67414k4.length > 2 ? C14057f9.m66582k4(strArrM67414k4[2]) : 0)));
        hy0.m7330k4(presentation.getMasterTheme());
        MasterSlide masterSlideM73631k4 = xxd.m73631k4(presentation);
        vtn.m72529k4(masterSlideM73631k4, (byte) 0);
        vtn.m72529k4(masterSlideM73631k4, (byte) 15);
        vtn.m72529k4(masterSlideM73631k4, (byte) 31);
        vtn.m72529k4(masterSlideM73631k4, (byte) 28);
        vtn.m72529k4(masterSlideM73631k4, (byte) 32);
        vtn.m72529k4(masterSlideM73631k4, (byte) 10);
        LayoutSlide layoutSlideM72529k4 = vtn.m72529k4(masterSlideM73631k4, (byte) 11);
        vtn.m72529k4(masterSlideM73631k4, (byte) 33);
        vtn.m72529k4(masterSlideM73631k4, (byte) 34);
        vtn.m72529k4(masterSlideM73631k4, (byte) 24);
        vtn.m72529k4(masterSlideM73631k4, (byte) 26);
        ((MasterSlideCollection) presentation.getMasters()).m1949k4(masterSlideM73631k4);
        masterSlideM73631k4.m382c5();
        Slide slideM72072k4 = v3t.m72072k4(presentation);
        ((SlideCollection) presentation.getSlides()).m2733k4(slideM72072k4);
        presentation.getSlideSize().setSize(0, 0);
        ((NotesSize) presentation.getNotesSize()).m2031k4(new C12015qq(540.0f, 720.0f));
        presentation.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().setLanguageId("en-US");
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(1);
        IParagraphFormat level = presentation.getDefaultTextStyle().getLevel(0);
        level.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level.getDefaultPortionFormat().setFontHeight(18.0f);
        level.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level.getDefaultPortionFormat()), level);
        BaseReq.toBundle("+mn-cs");
        level.setDefaultTabSize(72.0f);
        level.setRightToLeft((byte) 0);
        level.setEastAsianLineBreak((byte) 1);
        level.setLatinLineBreak((byte) 0);
        level.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(2);
        IParagraphFormat level2 = presentation.getDefaultTextStyle().getLevel(1);
        level2.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level2.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level2.getDefaultPortionFormat().setFontHeight(18.0f);
        level2.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level2.getDefaultPortionFormat()), level2);
        BaseReq.toBundle("+mn-cs");
        level2.setDefaultTabSize(72.0f);
        level2.setRightToLeft((byte) 0);
        level2.setEastAsianLineBreak((byte) 1);
        level2.setLatinLineBreak((byte) 0);
        level2.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(3);
        IParagraphFormat level3 = presentation.getDefaultTextStyle().getLevel(2);
        level3.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level3.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level3.getDefaultPortionFormat().setFontHeight(18.0f);
        level3.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level3.getDefaultPortionFormat()), level3);
        BaseReq.toBundle("+mn-cs");
        level3.setDefaultTabSize(72.0f);
        level3.setRightToLeft((byte) 0);
        level3.setEastAsianLineBreak((byte) 1);
        level3.setLatinLineBreak((byte) 0);
        level3.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(4);
        IParagraphFormat level4 = presentation.getDefaultTextStyle().getLevel(3);
        level4.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level4.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level4.getDefaultPortionFormat().setFontHeight(18.0f);
        level4.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level4.getDefaultPortionFormat()), level4);
        BaseReq.toBundle("+mn-cs");
        level4.setDefaultTabSize(72.0f);
        level4.setRightToLeft((byte) 0);
        level4.setEastAsianLineBreak((byte) 1);
        level4.setLatinLineBreak((byte) 0);
        level4.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(5);
        IParagraphFormat level5 = presentation.getDefaultTextStyle().getLevel(4);
        level5.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level5.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level5.getDefaultPortionFormat().setFontHeight(18.0f);
        level5.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level5.getDefaultPortionFormat()), level5);
        BaseReq.toBundle("+mn-cs");
        level5.setDefaultTabSize(72.0f);
        level5.setRightToLeft((byte) 0);
        level5.setEastAsianLineBreak((byte) 1);
        level5.setLatinLineBreak((byte) 0);
        level5.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(6);
        IParagraphFormat level6 = presentation.getDefaultTextStyle().getLevel(5);
        level6.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level6.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level6.getDefaultPortionFormat().setFontHeight(18.0f);
        level6.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level6.getDefaultPortionFormat()), level6);
        BaseReq.toBundle("+mn-cs");
        level6.setDefaultTabSize(72.0f);
        level6.setRightToLeft((byte) 0);
        level6.setEastAsianLineBreak((byte) 1);
        level6.setLatinLineBreak((byte) 0);
        level6.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(7);
        IParagraphFormat level7 = presentation.getDefaultTextStyle().getLevel(6);
        level7.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level7.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level7.getDefaultPortionFormat().setFontHeight(18.0f);
        level7.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level7.getDefaultPortionFormat()), level7);
        BaseReq.toBundle("+mn-cs");
        level7.setDefaultTabSize(72.0f);
        level7.setRightToLeft((byte) 0);
        level7.setEastAsianLineBreak((byte) 1);
        level7.setLatinLineBreak((byte) 0);
        level7.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(8);
        IParagraphFormat level8 = presentation.getDefaultTextStyle().getLevel(7);
        level8.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level8.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level8.getDefaultPortionFormat().setFontHeight(18.0f);
        level8.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level8.getDefaultPortionFormat()), level8);
        BaseReq.toBundle("+mn-cs");
        level8.setDefaultTabSize(72.0f);
        level8.setRightToLeft((byte) 0);
        level8.setEastAsianLineBreak((byte) 1);
        level8.setLatinLineBreak((byte) 0);
        level8.setHangingPunctuation((byte) 1);
        ((TextStyle) presentation.getDefaultTextStyle()).m2984k4(9);
        IParagraphFormat level9 = presentation.getDefaultTextStyle().getLevel(8);
        level9.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        level9.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        level9.getDefaultPortionFormat().setFontHeight(18.0f);
        level9.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", level9.getDefaultPortionFormat()), level9);
        BaseReq.toBundle("+mn-cs");
        level9.setDefaultTabSize(72.0f);
        level9.setRightToLeft((byte) 0);
        level9.setEastAsianLineBreak((byte) 1);
        level9.setLatinLineBreak((byte) 0);
        level9.setHangingPunctuation((byte) 1);
        presentation.m2351fa().m68361h4(true);
        IGenericEnumerator<ILayoutSlide> it = presentation.getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ((LayoutSlide) it.next()).m382c5();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        slideM72072k4.m382c5();
        slideM72072k4.setLayoutSlide(layoutSlideM72529k4);
    }
}
