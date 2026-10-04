package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p046bs.C1848k4;
import com.aspose.slides.internal.p046bs.InterfaceC1849kk;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p261m0.C6295h4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p365qn.C9893c5;
import com.aspose.slides.internal.p365qn.C9894du;
import com.aspose.slides.internal.p365qn.C9896h4;
import com.aspose.slides.internal.p365qn.C9897k4;
import com.aspose.slides.internal.p365qn.C9901x1;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.google.firebase.messaging.Constants;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class SvgImage implements ISvgImage {

    /* JADX INFO: renamed from: k4 */
    private byte[] f3478k4;

    /* JADX INFO: renamed from: kk */
    private IExternalResourceResolver f3479kk;

    /* JADX INFO: renamed from: to */
    private String f3480to;

    /* JADX INFO: renamed from: x1 */
    private r7t f3481x1;

    public SvgImage(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, (IExternalResourceResolver) null, (String) null);
    }

    @Override // com.aspose.slides.ISvgImage
    public final String getBaseUri() {
        return this.f3480to;
    }

    @Override // com.aspose.slides.ISvgImage
    public final IExternalResourceResolver getExternalResourceResolver() {
        return this.f3479kk;
    }

    @Override // com.aspose.slides.ISvgImage
    public final String getSvgContent() {
        String strM26681x1 = AbstractC6747ar.m26635ix().m26681x1(this.f3478k4);
        return C14113y2.m67422kk(strM26681x1, C14113y2.m67429to(strM26681x1, '<'));
    }

    @Override // com.aspose.slides.ISvgImage
    public final byte[] getSvgData() {
        return this.f3478k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final ISvgImage m2854k4(IPictureFrame iPictureFrame) {
        return (!m2855k4() || iPictureFrame == null) ? this : new sd0(iPictureFrame, this).m70560kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final r7t m2856x1() {
        return this.f3481x1;
    }

    public SvgImage(AbstractC3150x6 abstractC3150x6, IExternalResourceResolver iExternalResourceResolver, String str) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        this.f3479kk = iExternalResourceResolver;
        this.f3481x1 = new r7t(iExternalResourceResolver, str);
        this.f3478k4 = C13447k4.m62559k4(abstractC3150x6);
        this.f3480to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m2853k4(String str) {
        InterfaceC1849kk interfaceC1849kk;
        XmlDocument xmlDocument = new XmlDocument();
        InterfaceC1849kk interfaceC1849kk2 = null;
        xmlDocument.setXmlResolver(null);
        xmlDocument.load(new C3144um(str));
        C13950o3 c13950o3 = new C13950o3(xmlDocument.getNameTable());
        c13950o3.mo65707k4("s", "http://www.w3.org/2000/svg");
        AbstractC13911hq abstractC13911hqSelectNodes = xmlDocument.selectNodes("/s:svg/s:foreignObject", c13950o3);
        if (abstractC13911hqSelectNodes == null) {
            return str;
        }
        int i = 1;
        if (abstractC13911hqSelectNodes.mo23932k4() < 1) {
            return str;
        }
        int i2 = 0;
        while (i2 < abstractC13911hqSelectNodes.mo23932k4()) {
            if ((abstractC13911hqSelectNodes.m65457kk(i2).getChildNodes().mo23932k4() == i || "body".equals(abstractC13911hqSelectNodes.m65457kk(i2).getChildNodes().m65457kk(0).getName())) && abstractC13911hqSelectNodes.m65457kk(i2).getChildNodes().m65457kk(0).getAttributes() != null && "http://www.w3.org/1999/xhtml".equals(abstractC13911hqSelectNodes.m65457kk(i2).getChildNodes().m65457kk(0).getAttributes().m65164k4(0).getInnerText())) {
                String innerXml = abstractC13911hqSelectNodes.m65457kk(i2).getChildNodes().m65457kk(0).getInnerXml();
                C9897k4 c9897k4 = new C9897k4(new C1848k4(), interfaceC1849kk2);
                C9901x1 c9901x1 = new C9901x1();
                if (abstractC13911hqSelectNodes.m65457kk(i2).getAttributes() != null) {
                    c9901x1.m48763m9().m48726k4(new C9896h4(new C9893c5(new C9894du(C14057f9.m66582k4(abstractC13911hqSelectNodes.m65457kk(i2).getAttributes().m65165k4("width").getValue()), 0), new C9894du(C14057f9.m66582k4(abstractC13911hqSelectNodes.m65457kk(i2).getAttributes().m65165k4("height").getValue()), 0))));
                }
                String strM25769k4 = C6295h4.m25769k4(new C10948ar[]{c9897k4.m48743k4(innerXml, c9901x1).m48744k4()[0]}, false);
                xmlDocument.getDocumentElement().removeChild(abstractC13911hqSelectNodes.m65457kk(i2));
                XmlDocument xmlDocument2 = new XmlDocument();
                interfaceC1849kk = null;
                xmlDocument2.setXmlResolver(null);
                xmlDocument2.load(new C3144um(strM25769k4));
                c13950o3.mo65707k4("s", "http://www.w3.org/2000/svg");
                C13981tl documentElement = xmlDocument2.getDocumentElement();
                i = 1;
                xmlDocument.getDocumentElement().appendChild(xmlDocument.importNode(documentElement, true));
            } else {
                interfaceC1849kk = interfaceC1849kk2;
            }
            i2++;
            interfaceC1849kk2 = interfaceC1849kk;
        }
        C3152yj c3152yj = new C3152yj();
        xmlDocument.save(c3152yj);
        c3152yj.setPosition(0L);
        return new C3148wl(c3152yj).mo13427dy();
    }

    public SvgImage(InputStream inputStream) {
        this(AbstractC3150x6.fromJava(inputStream));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2855k4() {
        return C14113y2.m67359c5(getSvgContent(), ".MsftOfcThm");
    }

    public SvgImage(InputStream inputStream, IExternalResourceResolver iExternalResourceResolver, String str) {
        this(AbstractC3150x6.fromJava(inputStream), iExternalResourceResolver, str);
    }

    public SvgImage(String str) {
        this(str, (IExternalResourceResolver) null, (String) null);
    }

    public SvgImage(String str, IExternalResourceResolver iExternalResourceResolver, String str2) {
        if (str == null) {
            throw new ArgumentNullException("svgContent");
        }
        this.f3479kk = iExternalResourceResolver;
        this.f3481x1 = new r7t(iExternalResourceResolver, str2);
        this.f3478k4 = AbstractC6747ar.m26635ix().mo26677to(str);
        this.f3480to = str2;
    }

    public SvgImage(byte[] bArr) {
        this(bArr, (IExternalResourceResolver) null, (String) null);
    }

    public SvgImage(byte[] bArr, IExternalResourceResolver iExternalResourceResolver, String str) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        this.f3479kk = iExternalResourceResolver;
        this.f3481x1 = new r7t(iExternalResourceResolver, str);
        this.f3478k4 = bArr;
        this.f3480to = str;
    }
}
