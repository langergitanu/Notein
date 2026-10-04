package com.aspose.words.internal;

import OoooooO.C21445Oooo;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22218Oooo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2W extends zz21 {
    public zz2W(zz4W zz4w) throws Exception {
        super(zz4w);
    }

    private static String zzR(String str, String str2, String str3) {
        if (!zzZYD.zzXk(str3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("<");
        sb.append(str);
        sb.append(zzZKN.equals(str2, "") ? "" : com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(" ", str2));
        sb.append(">");
        int i = zzZOF.ORDINAL$4894b8c8;
        sb.append(zzZKN.zzS(str3, "<", i) ? IOUtils.LINE_SEPARATOR_UNIX : "");
        sb.append(str3);
        return C21445Oooo.OooO0O0(sb, zzZKN.zzW(str3, ">", i) ? IOUtils.LINE_SEPARATOR_UNIX : "", "</", str, ">\n");
    }

    private static String zzX(String str, zzZQ9 zzzq9) {
        return !zzZQ9.zzZ(zzzq9, zzZQ9.zz35) ? zzR(str, "", zzzq9.zzkR() == 2 ? zzJB.zzS(zzzq9) : zzJB.zzR(zzzq9)) : "";
    }

    private static String zzXO(String str) {
        return !zzZYD.zzXk(str) ? str : str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    private String zzY(zzQR zzqr) {
        if (!zztI() || zzqr.zzQz().getCount() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<K, V>> it = zzqr.zzQz().iterator();
        int i = 1;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzZNH.zzU(sb, zzR(C21532OooOOo.OooO0OO(i, "custprops:Property"), "", zzR("rdf:Description", "", zzR("custprops:Name", "", zzXO((String) entry.getKey())) + zzR("custprops:Value", "", zzXO(entry.getValue().toString())))));
            i++;
        }
        return zzR("rdf:Description", "rdf:about=\"\" xmlns:custprops=\"http://aspose.com/\"", sb.toString());
    }

    private boolean zztI() {
        return zzuN().zzvc().getCustomPropertiesExport() == 2;
    }

    private String zztJ() {
        return zzZYD.zzXk(zzuN().zzv7().zzvn()) ? zzR("pdfaid:rev", "", zzuN().zzv7().zzvn()) : "";
    }

    private String zztK() {
        return zzZYD.zzXk(zzuN().zzv7().zzvo()) ? zzR("pdfaid:conformance", "", zzuN().zzv7().zzvo()) : "";
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/Metadata");
        zzfy.zzH("/Subtype", "/XML");
    }

    @Override // com.aspose.words.internal.zz21
    public final zz45 zzW() throws Exception {
        return (!zztI() || zzuN().zzv7().zzvx()) ? new zz3Y() : super.zzW();
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        String strZzR;
        String str = zzZKN.format("<?xpacket begin=\"{0}\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", zzZO0.zzhV().zzZn(new byte[]{-17, -69, -65}));
        zzQR zzqrZzv9 = zzuN().zzv9();
        String strZzR2 = zzR("rdf:Description", "rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"", zzX("xmp:CreateDate", zzqrZzv9.zzQB()) + zzX("xmp:ModifyDate", zzqrZzv9.zzQA()) + zzR("xmp:CreatorTool", "", zzXO(zzqrZzv9.zzQF())));
        String strZzR3 = zzR("rdf:Description", "rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"", zzR("dc:format", "", "application/pdf") + zzR("dc:title", "", zzR("rdf:Alt", "", zzR("rdf:li", "xml:lang=\"x-default\"", zzXO(zzqrZzv9.getTitle())))) + zzR("dc:creator", "", zzR("rdf:Seq", "", zzR("rdf:li", "", zzXO(zzqrZzv9.getAuthor())))) + zzR("dc:description", "", zzR("rdf:Alt", "", zzR("rdf:li", "xml:lang=\"x-default\"", zzXO(zzqrZzv9.getSubject())))));
        StringBuilder sb = new StringBuilder();
        sb.append(zzR("pdf:Keywords", "", zzXO(zzqrZzv9.getKeywords())));
        sb.append(zzR("pdf:Producer", "", zzXO(zzqrZzv9.zzQG())));
        String strZzR4 = zzR("rdf:Description", "rdf:about=\"\" xmlns:pdf=\"http://ns.adobe.com/pdf/1.3/\"", sb.toString());
        if (zzuN().zzv7().zzvz()) {
            strZzR = zzR("rdf:Description", "rdf:about=\"\" xmlns:pdfaid=\"http://www.aiim.org/pdfa/ns/id/\"", zzR("pdfaid:part", "", zzuN().zzv7().zzvp()) + zztK() + zztJ());
        } else {
            strZzR = "";
        }
        String strZzR5 = zzuN().zzv7().zzvy() ? zzR("rdf:Description", "rdf:about=\"\" xmlns:pdfuaid=\"http://www.aiim.org/pdfua/ns/id/\"", zzR("pdfuaid:part", "", zzuN().zzv7().zzvm())) : "";
        byte[] bytes = zzZO0.zzhV().getBytes(androidx.concurrent.futures.OooO00o.OooO0OO(C22218Oooo.OooO0OO(str), zzR("x:xmpmeta", "xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"PDFNet\"", zzR("rdf:RDF", "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"", strZzR2 + strZzR3 + strZzR4 + strZzR + strZzR5 + zzY(zzqrZzv9))), "<?xpacket end=\"w\"?>\n"));
        zzq().write(bytes, 0, bytes.length);
    }
}
