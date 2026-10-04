package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: loaded from: classes4.dex */
public class in8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f24827jd = new C7017h4("horizontal", "vertical", "textRotation", "wrapText", HTMLWriter.INDENT, "relativeIndent", "justifyLastLine", "shrinkToFit", "readingOrder");

    /* JADX INFO: renamed from: c5 */
    private long f24828c5;

    /* JADX INFO: renamed from: du */
    private long f24829du;

    /* JADX INFO: renamed from: dy */
    private byte f24830dy;

    /* JADX INFO: renamed from: h4 */
    private int f24831h4;

    /* JADX INFO: renamed from: k4 */
    private int f24832k4;

    /* JADX INFO: renamed from: kk */
    private long f24833kk;

    /* JADX INFO: renamed from: m9 */
    private byte f24834m9;

    /* JADX INFO: renamed from: to */
    private byte f24835to;

    /* JADX INFO: renamed from: x1 */
    private int f24836x1;

    public in8() {
        m34327x1();
    }

    public in8(AbstractC13912i5 abstractC13912i5) {
        m34327x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.in8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (in8.f24827jd.m27428k4(str)) {
                    case 0:
                        in8.this.f24832k4 = twm.m41959k4(str2);
                        break;
                    case 1:
                        in8.this.f24836x1 = adx.m28146k4(str2);
                        break;
                    case 2:
                        in8.this.f24833kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        in8.this.f24835to = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 4:
                        in8.this.f24829du = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        in8.this.f24831h4 = C13850af.m65151yj(str2);
                        break;
                    case 6:
                        in8.this.f24834m9 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 7:
                        in8.this.f24830dy = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 8:
                        in8.this.f24828c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m34327x1() {
        this.f24832k4 = 0;
        this.f24836x1 = 0;
        this.f24833kk = 4294967295L;
        this.f24835to = (byte) -1;
        this.f24829du = 4294967295L;
        this.f24831h4 = 0;
        this.f24834m9 = (byte) -1;
        this.f24830dy = (byte) -1;
        this.f24828c5 = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24832k4;
        if (i != 0) {
            c3059ii.m12955x1("horizontal", twm.m41960k4(i));
        }
        int i2 = this.f24836x1;
        if (i2 != 0) {
            c3059ii.m12955x1("vertical", adx.m28147k4(i2));
        }
        long j = this.f24833kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("textRotation", C13850af.m65147x1(j));
        }
        byte b = this.f24835to;
        if (b != -1) {
            c3059ii.m12955x1("wrapText", b == 1 ? "1" : "0");
        }
        long j2 = this.f24829du;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(HTMLWriter.INDENT, C13850af.m65147x1(j2));
        }
        int i3 = this.f24831h4;
        if (i3 != 0) {
            c3059ii.m12955x1("relativeIndent", C13850af.m65103k4(i3));
        }
        byte b2 = this.f24834m9;
        if (b2 != -1) {
            c3059ii.m12955x1("justifyLastLine", b2 == 1 ? "1" : "0");
        }
        byte b3 = this.f24830dy;
        if (b3 != -1) {
            c3059ii.m12955x1("shrinkToFit", b3 == 1 ? "1" : "0");
        }
        long j3 = this.f24828c5;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("readingOrder", C13850af.m65147x1(j3));
        }
        c3059ii.mo21898jd();
    }
}
