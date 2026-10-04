package com.aspose.slides.internal.p416tb;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C10910rv extends C10894bv {
    public C10910rv(C10898dy c10898dy) {
        super(c10898dy);
    }

    /* JADX INFO: renamed from: du */
    private static String m52515du(String str) {
        return !C12565ks.m58630x1(str) ? str : C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
    }

    /* JADX INFO: renamed from: k4 */
    private static String m52516k4(int i) {
        switch (i) {
            case 3:
            case 5:
            case 7:
                return C18385v2.f56336h;
            case 4:
            case 6:
            case 8:
                return "B";
            case 9:
            default:
                throw new ArgumentOutOfRangeException("compliance");
            case 10:
                return "U";
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static String m52520x1(int i) {
        switch (i) {
            case 3:
            case 4:
                return "1";
            case 5:
            case 6:
            case 10:
                return "2";
            case 7:
            case 8:
                return "3";
            case 9:
            default:
                throw new ArgumentOutOfRangeException("compliance");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m52517k4(String str, C14084qq c14084qq) {
        return C14084qq.m67112m9(c14084qq, C14084qq.f47299x1) ? C14113y2.f47374k4 : m52519k4(str, C14113y2.f47374k4, C14113y2.m67408k4(c14084qq.m67140k4("s"), "Z"));
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        c10922yj.m52666kk("/Type", "/Metadata");
        c10922yj.m52666kk("/Subtype", "/XML");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m52518k4(String str, String str2) {
        return m52519k4(str, C14113y2.f47374k4, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m52519k4(String str, String str2, String str3) {
        if (!C12565ks.m58630x1(str3)) {
            return C14113y2.f47374k4;
        }
        String strM67408k4 = str2.length() == 0 ? C14113y2.f47374k4 : C14113y2.m67408k4(" ", str2);
        boolean zM67448x1 = C14113y2.m67448x1(str3, "<");
        String str4 = IOUtils.LINE_SEPARATOR_UNIX;
        String str5 = zM67448x1 ? IOUtils.LINE_SEPARATOR_UNIX : C14113y2.f47374k4;
        if (!C14113y2.m67424kk(str3, ">")) {
            str4 = C14113y2.f47374k4;
        }
        return C14113y2.m67408k4("<", str, strM67408k4, ">", str5, str3, str4, "</", str, ">\n");
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        String strM52518k4;
        String str;
        String strM67402k4 = C14113y2.m67402k4("<?xpacket begin=\"{0}\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", AbstractC6747ar.m26635ix().m26681x1(new byte[]{-17, -69, -65}));
        C3173h4 c3173h4M52461m9 = this.f37962x1.m52461m9();
        String strM52519k4 = m52519k4("rdf:Description", "rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"", C14113y2.m67408k4(m52517k4("xmp:CreateDate", c3173h4M52461m9.m13559fa().Clone()), m52517k4("xmp:ModifyDate", c3173h4M52461m9.m13574up().Clone()), m52518k4("xmp:CreatorTool", m52515du(c3173h4M52461m9.m13555du()))));
        String strM52519k42 = m52519k4("rdf:Description", "rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"", C14113y2.m67408k4(m52518k4("dc:format", "application/pdf"), m52518k4("dc:title", m52518k4("rdf:Alt", m52519k4("rdf:li", "xml:lang=\"x-default\"", m52515du(c3173h4M52461m9.m13575x1())))), m52518k4("dc:creator", m52518k4("rdf:Seq", m52518k4("rdf:li", m52515du(c3173h4M52461m9.m13567kk())))), m52518k4("dc:description", m52518k4("rdf:Alt", m52519k4("rdf:li", "xml:lang=\"x-default\"", m52515du(c3173h4M52461m9.m13572to()))))));
        String strM52519k43 = m52519k4("rdf:Description", "rdf:about=\"\" xmlns:pdf=\"http://ns.adobe.com/pdf/1.3/\"", C14113y2.m67408k4(m52518k4("pdf:Keywords", m52515du(c3173h4M52461m9.m13560h4())), m52518k4("pdf:Producer", m52515du(c3173h4M52461m9.m13564k4()))));
        String strM52519k44 = C14113y2.f47374k4;
        if (!this.f37962x1.m52454fa()) {
            if (this.f37962x1.m52464x1().m52604ck() == 9) {
                strM52518k4 = m52518k4("pdfuaid:part", "1");
                str = "rdf:about=\"\" xmlns:pdfuaid=\"http://www.aiim.org/pdfua/ns/id/\"";
            }
            byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to(C14113y2.m67408k4(strM67402k4, m52519k4("x:xmpmeta", "xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"PDFNet\"", m52519k4("rdf:RDF", "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"", C14113y2.m67408k4(strM52519k4, strM52519k42, strM52519k43, strM52519k44))), "<?xpacket end=\"w\"?>\n"));
            m52427k4(bArrMo26677to, 0, bArrMo26677to.length);
            super.mo9082k4(c10922yj);
        }
        strM52518k4 = C14113y2.m67408k4(m52518k4("pdfaid:part", m52520x1(this.f37962x1.m52464x1().m52604ck())), m52518k4("pdfaid:conformance", m52516k4(this.f37962x1.m52464x1().m52604ck())));
        str = "rdf:about=\"\" xmlns:pdfaid=\"http://www.aiim.org/pdfa/ns/id/\"";
        strM52519k44 = m52519k4("rdf:Description", str, strM52518k4);
        byte[] bArrMo26677to2 = AbstractC6747ar.m26635ix().mo26677to(C14113y2.m67408k4(strM67402k4, m52519k4("x:xmpmeta", "xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"PDFNet\"", m52519k4("rdf:RDF", "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"", C14113y2.m67408k4(strM52519k4, strM52519k42, strM52519k43, strM52519k44))), "<?xpacket end=\"w\"?>\n"));
        m52427k4(bArrMo26677to2, 0, bArrMo26677to2.length);
        super.mo9082k4(c10922yj);
    }
}
