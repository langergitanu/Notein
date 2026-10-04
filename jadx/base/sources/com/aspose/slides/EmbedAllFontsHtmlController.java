package com.aspose.slides;

import com.aspose.slides.C14852ym;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: loaded from: classes3.dex */
public class EmbedAllFontsHtmlController implements IHtmlFormattingController {
    private final C14852ym m_controllerInternal;

    public EmbedAllFontsHtmlController() {
        this.m_controllerInternal = new C14852ym(createFontDataProvider(0), C14852ym.f50370k4, new C14852ym.k4() { // from class: com.aspose.slides.EmbedAllFontsHtmlController.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.EmbedAllFontsHtmlController.WriteFont(Aspose.Slides.Export.IHtmlGenerator,Aspose.Slides.IFontData,Aspose.Slides.IFontData,System.String,System.String,System.Byte[])";
            }

            @Override // com.aspose.slides.C14852ym.k4
            /* JADX INFO: renamed from: k4 */
            public void mo1417k4(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr) {
                EmbedAllFontsHtmlController.this.writeFont(iHtmlGenerator, iFontData, iFontData2, str, str2, bArr);
            }
        });
    }

    private AbstractC14653ux createFontDataProvider(int i) {
        if (i == 0) {
            return new ih0();
        }
        if (i == 1) {
            return new C0845c8();
        }
        throw new ArgumentOutOfRangeException("format", C14042ak.m66410k4(C0970ez.class, i), null);
    }

    public final C14852ym getControllerInternal() {
        return this.m_controllerInternal;
    }

    public void writeAllFonts(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.m_controllerInternal.m73937kk(iHtmlGenerator, iPresentation);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public void writeDocumentEnd(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.m_controllerInternal.m73938to(iHtmlGenerator, iPresentation);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public void writeDocumentStart(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.m_controllerInternal.m73933k4(iHtmlGenerator, iPresentation);
        writeAllFonts(iHtmlGenerator, iPresentation);
    }

    public void writeFont(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr) {
        this.m_controllerInternal.m73932k4(iHtmlGenerator, iFontData, iFontData2, str, str2, bArr);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public void writeShapeEnd(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.m_controllerInternal.m73940x1(iHtmlGenerator, iShape);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public void writeShapeStart(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.m_controllerInternal.m73934k4(iHtmlGenerator, iShape);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public void writeSlideEnd(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.m_controllerInternal.m73941x1(iHtmlGenerator, iSlide);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public void writeSlideStart(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.m_controllerInternal.m73935k4(iHtmlGenerator, iSlide);
    }

    public EmbedAllFontsHtmlController(String[] strArr) {
        if (strArr == null) {
            throw new ArgumentNullException("fontNameExcludeList");
        }
        this.m_controllerInternal = new C14852ym(createFontDataProvider(0), strArr, new C14852ym.k4() { // from class: com.aspose.slides.EmbedAllFontsHtmlController.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.EmbedAllFontsHtmlController.WriteFont(Aspose.Slides.Export.IHtmlGenerator,Aspose.Slides.IFontData,Aspose.Slides.IFontData,System.String,System.String,System.Byte[])";
            }

            @Override // com.aspose.slides.C14852ym.k4
            /* JADX INFO: renamed from: k4 */
            public void mo1417k4(IHtmlGenerator iHtmlGenerator, IFontData iFontData, IFontData iFontData2, String str, String str2, byte[] bArr) {
                EmbedAllFontsHtmlController.this.writeFont(iHtmlGenerator, iFontData, iFontData2, str, str2, bArr);
            }
        });
    }
}
