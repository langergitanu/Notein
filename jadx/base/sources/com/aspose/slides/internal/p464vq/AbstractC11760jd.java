package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p085dk.C3171dy;
import com.aspose.slides.internal.p482wr.C12247b3;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.AbstractC14085qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.jd */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11760jd {

    /* JADX INFO: renamed from: k4 */
    public static final SortedDictionary<String, String> f39763k4;

    /* JADX INFO: renamed from: du */
    private AbstractC3174jd f39764du = C3171dy.f9427k4;

    /* JADX INFO: renamed from: kk */
    private C12275wy f39765kk;

    /* JADX INFO: renamed from: to */
    private boolean f39766to;

    /* JADX INFO: renamed from: x1 */
    private int f39767x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.vq.jd$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract int mo5039k4();
    }

    static {
        SortedDictionary<String, String> sortedDictionary = new SortedDictionary<>();
        f39763k4 = sortedDictionary;
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartColorStyle", "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartUserShapes", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartUserShapes");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chart", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/drawingml/chart", "http://schemas.openxmlformats.org/drawingml/2006/chart");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartStyle", "http://schemas.microsoft.com/office/2011/relationships/chartStyle");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartEx", "http://schemas.microsoft.com/office/2014/relationships/chartEx");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/diagramColors", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramColors");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/diagramData", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramData");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/diagramLayout", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramLayout");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/diagramQuickStyle", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramQuickStyle");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/tableStyles", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableStyles");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/themeOverride", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/themeOverride");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/theme", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/diagramDrawing", "http://schemas.microsoft.com/office/2007/relationships/diagramDrawing");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/legacyDiagramText", "http://schemas.microsoft.com/office/2006/relationships/legacyDiagramText");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/vmlDrawing", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/commentAuthors", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/commentAuthors");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/handoutMaste", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/handoutMaster");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/notesMaster", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesMaster");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/notesSlide", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesSlide");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/presProps", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/presProps");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/slideLayout", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideLayout");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/slideMaster", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideMaster");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/slide", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/tags", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tags");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/viewProps", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/viewProps");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/downRev", "http://schemas.microsoft.com/office/2006/relationships/downRev");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/graphicFrameDoc", "http://schemas.microsoft.com/office/2006/relationships/graphicFrameDoc");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/pictureXml", "http://schemas.microsoft.com/office/2006/relationships/pictureXml");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/shapeXml", "http://schemas.microsoft.com/office/2006/relationships/shapeXml");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/activeXControlBinary", "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/control", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/control");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/audio", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/audio");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/metadata/core-properties", "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/custom-properties", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/customXml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/customXmlProps", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXmlProps");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/origin", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/extended-properties", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/font", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/font");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/image", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/oleObject", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/package", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/package");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/metadata/thumbnail", "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/vbaProject", "http://schemas.microsoft.com/office/2006/relationships/vbaProject");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/vbaProjectSignature", "http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/video", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/video");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/calcChain", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/calcChain");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartsheet", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartsheet");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/connections", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/dialogsheet", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/dialogsheet");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/drawing", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/drawing");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/externalLink", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLink");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/sheetMetadata", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sheetMetadata");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/pivotCacheDefinition", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/pivotCacheRecords", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheRecords");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/pivotTable", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/queryTable", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/queryTable");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/sharedStrings", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/revisionHeaders", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionHeaders");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/revisionLog", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionLog");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/usernames", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/usernames");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/tableSingleCells", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableSingleCells");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/styles", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/table", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/table");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/volatileDependencies", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/volatileDependencies");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/comments", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/worksheet", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/extendedProperties", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extendedProperties");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/hyperlink", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/officeDocument/oleObject", "http://schemas.openxmlformats.org/presentationml/2006/ole");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/presentationml/main", "http://schemas.openxmlformats.org/presentationml/2006/main");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/drawingml/main", "http://schemas.openxmlformats.org/drawingml/2006/main");
        sortedDictionary.addItem("http://purl.oclc.org/ooxml/drawingml/table", "http://schemas.openxmlformats.org/drawingml/2006/table");
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 m55339k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = new byte[4096];
        long length = abstractC3150x6.canSeek() ? abstractC3150x6.getLength() - abstractC3150x6.getPosition() : 0L;
        if (length > 32767 || length < 0) {
            length = 0;
        }
        C3152yj c3152yj = new C3152yj((int) length);
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 4096);
            if (i == 0) {
                c3152yj.seek(0L, 0);
                return c3152yj;
            }
            c3152yj.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m55340du() {
        this.f39765kk = new C12275wy();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m55341h4() {
        this.f39764du.mo4791k4();
    }

    /* JADX INFO: renamed from: kk */
    public final C12275wy m55347kk() {
        return this.f39765kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m55348m9() {
        return this.f39767x1;
    }

    /* JADX INFO: renamed from: to */
    public abstract void mo55326to();

    /* JADX INFO: renamed from: x1 */
    public final boolean m55349x1() {
        return this.f39766to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m55342k4(String str) {
        String[] strArr = {null};
        boolean zTryGetValue = f39763k4.tryGetValue(str, strArr);
        String str2 = strArr[0];
        if (!zTryGetValue) {
            return str;
        }
        this.f39767x1 = 2;
        return str2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55343k4(int i) {
        this.f39767x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55344k4(AbstractC3150x6 abstractC3150x6, boolean z, AbstractC3174jd abstractC3174jd) {
        this.f39764du = abstractC3174jd;
        if (z) {
            abstractC3150x6 = m55339k4(abstractC3150x6);
        }
        try {
            this.f39765kk = C12275wy.m57434k4(abstractC3150x6, true);
            mo55326to();
        } catch (OperationCanceledException e) {
            throw e;
        } catch (C12247b3 e2) {
            throw new C11848x3("Unknown file format.", e2);
        } catch (RuntimeException e3) {
            throw new C11848x3("", e3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55345k4(boolean z) {
        this.f39766to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m55346k4() {
        return this.f39767x1 == 2;
    }
}
