package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tod extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f30816jd = new C7017h4("w_Hint", "w_Ascii", "w_HAnsi", "w_EastAsia", "w_Cs", "w_AsciiTheme", "w_HAnsiTheme", "w_EastAsiaTheme", "w_Cstheme");

    /* JADX INFO: renamed from: c5 */
    private int f30817c5;

    /* JADX INFO: renamed from: du */
    private String f30818du;

    /* JADX INFO: renamed from: dy */
    private int f30819dy;

    /* JADX INFO: renamed from: h4 */
    private int f30820h4;

    /* JADX INFO: renamed from: k4 */
    private int f30821k4;

    /* JADX INFO: renamed from: kk */
    private String f30822kk;

    /* JADX INFO: renamed from: m9 */
    private int f30823m9;

    /* JADX INFO: renamed from: to */
    private String f30824to;

    /* JADX INFO: renamed from: x1 */
    private String f30825x1;

    public tod() {
        m41832x1();
    }

    public tod(AbstractC13912i5 abstractC13912i5) {
        m41832x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tod.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (tod.f30816jd.m27428k4(str)) {
                    case 0:
                        tod.this.f30821k4 = mhn.m36954k4(str2);
                        break;
                    case 1:
                        tod.this.f30825x1 = str2;
                        break;
                    case 2:
                        tod.this.f30822kk = str2;
                        break;
                    case 3:
                        tod.this.f30824to = str2;
                        break;
                    case 4:
                        tod.this.f30818du = str2;
                        break;
                    case 5:
                        tod.this.f30820h4 = uw3.m42586k4(str2);
                        break;
                    case 6:
                        tod.this.f30823m9 = uw3.m42586k4(str2);
                        break;
                    case 7:
                        tod.this.f30819dy = uw3.m42586k4(str2);
                        break;
                    case 8:
                        tod.this.f30817c5 = uw3.m42586k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41832x1() {
        this.f30821k4 = 0;
        this.f30820h4 = 0;
        this.f30823m9 = 0;
        this.f30819dy = 0;
        this.f30817c5 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f30821k4;
        if (i != 0) {
            c3059ii.m12955x1("w:hint", mhn.m36955k4(i));
        }
        String str3 = this.f30825x1;
        if (str3 != null) {
            c3059ii.m12955x1("w:ascii", str3);
        }
        String str4 = this.f30822kk;
        if (str4 != null) {
            c3059ii.m12955x1("w:hAnsi", str4);
        }
        String str5 = this.f30824to;
        if (str5 != null) {
            c3059ii.m12955x1("w:eastAsia", str5);
        }
        String str6 = this.f30818du;
        if (str6 != null) {
            c3059ii.m12955x1("w:cs", str6);
        }
        int i2 = this.f30820h4;
        if (i2 != 0) {
            c3059ii.m12955x1("w:asciiTheme", uw3.m42587k4(i2));
        }
        int i3 = this.f30823m9;
        if (i3 != 0) {
            c3059ii.m12955x1("w:hAnsiTheme", uw3.m42587k4(i3));
        }
        int i4 = this.f30819dy;
        if (i4 != 0) {
            c3059ii.m12955x1("w:eastAsiaTheme", uw3.m42587k4(i4));
        }
        int i5 = this.f30817c5;
        if (i5 != 0) {
            c3059ii.m12955x1("w:cstheme", uw3.m42587k4(i5));
        }
        c3059ii.mo21898jd();
    }
}
