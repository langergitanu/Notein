package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNO extends zzYQ {
    private com.aspose.words.internal.zzZYG<String> zzXId;
    private Iterable<zzY87> zzXIe;
    private Iterable<zzY87> zzXIf;
    private String zzYKG;
    private boolean zzYKJ;

    public zzYNO(String str, zzYDZ zzydz, Iterable<zzY87> iterable, Iterable<zzY87> iterable2, boolean z, String str2) throws Exception {
        super(zzYQ.zzTq(str), str, zzydz);
        this.zzXIf = iterable;
        this.zzXIe = iterable2;
        this.zzYKJ = z;
        this.zzYKG = str2;
    }

    private String zzD0(String str) {
        String str2;
        com.aspose.words.internal.zzZYG<String> zzzyg = this.zzXId;
        return (zzzyg == null || (str2 = zzzyg.get(str)) == null) ? str : str2;
    }

    private void zzD1(String str) {
        zzY("itemref");
        zzX("idref", zzD0(str));
        zzp();
    }

    private void zzY(zzY87 zzy87) {
        zzs(zzy87.getUri(), zzy87.getUri(), zzy87.getContentType());
    }

    private void zzYqG() {
        for (String str : com.aspose.words.internal.zzZKN.zzR(zz9Z().getBuiltInDocumentProperties().getAuthor(), ';')) {
            zzV("dc:creator", "opf:role", "aut", com.aspose.words.internal.zzZKN.zzTX(str));
        }
    }

    private void zzYqH() {
        com.aspose.words.internal.zzX6 zzx6 = new com.aspose.words.internal.zzX6();
        zzx6.add("ncx");
        Iterator<zzY87> it = this.zzXIf.iterator();
        while (it.hasNext()) {
            zzx6.add(it.next().getUri());
        }
        Iterator<zzY87> it2 = this.zzXIe.iterator();
        while (it2.hasNext()) {
            zzx6.add(it2.next().getUri());
        }
        this.zzXId = com.aspose.words.internal.zzP.zzZ(zzx6);
    }

    private void zzYqI() {
        Iterator<zzY87> it = this.zzXIf.iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
        Iterator<zzY87> it2 = this.zzXIe.iterator();
        while (it2.hasNext()) {
            zzY(it2.next());
        }
    }

    private void zzYqJ() {
        if (this.zzYKJ) {
            zzY("guide");
            zzX("reference", "href", "cover/cover-page.html", C18437z2.f56754h, "cover", NoteMeta.PROPERTY_TITLE, "Cover");
            zzn();
        }
    }

    private void zzYqK() {
        zzY("spine");
        zzX("toc", zzD0("ncx"));
        Iterator<zzY87> it = this.zzXIf.iterator();
        while (it.hasNext()) {
            zzD1(it.next().getUri());
        }
        zzn();
    }

    private void zzYqL() {
        zzY("manifest");
        zzs("ncx", zzYQ.zzH(zza1(), true), "application/x-dtbncx+xml");
        zzYqI();
        zzn();
    }

    private void zzYqM() {
        zzY("metadata");
        zzX("xmlns:opf", "http://www.idpf.org/2007/opf");
        zzX("xmlns:dc", "http://purl.org/dc/elements/1.1/");
        zzY("dc:title", zzYQ.zzTr(zz9Z().getBuiltInDocumentProperties().getTitle()));
        zzYqG();
        zzY("dc:publisher", zz9Z().getBuiltInDocumentProperties().getCompany());
        zzV("dc:date", "opf:event", "creation", zz9Z().getBuiltInDocumentProperties().zz7h().toString("yyyy-MM-dd"));
        zzV("dc:date", "opf:event", "modification", zz9Z().getBuiltInDocumentProperties().zz7f().toString("yyyy-MM-dd"));
        if (zza0().zzYZ7()) {
            zzV("dc:date", "opf:event", "publication", com.aspose.words.internal.zzR1.zzQO().zzkF().toString("yyyy-MM-dd"));
        }
        zzY("dc:subject", zz9Z().getBuiltInDocumentProperties().getSubject());
        zzY("dc:description", zz9Z().getBuiltInDocumentProperties().getComments());
        zzV("dc:identifier", "id", CommonConstant.KEY_UID, this.zzYKG);
        zzY("dc:language", zza3());
        if (zza0().getExportGeneratorName()) {
            zzV("dc:contributor", "opf:role", "bkp", "Aspose.Words for Android via Java 24.3.0");
            zzZC("generator", "Aspose.Words for Android via Java 24.3.0");
        }
        zzn();
    }

    private void zzs(String str, String str2, String str3) {
        zzY("item");
        zzX("id", zzD0(str));
        zzX("href", str2);
        zzX(HTMLWriter.MEDIA_TYPE, str3);
        zzp();
    }

    public final void zzZY1() {
        startDocument();
        zzY("package");
        zzX("xmlns", "http://www.idpf.org/2007/opf");
        zzX("version", "2.0");
        zzX("unique-identifier", CommonConstant.KEY_UID);
        zzYqM();
        zzYqH();
        zzYqL();
        zzYqK();
        zzYqJ();
        endDocument();
    }
}
