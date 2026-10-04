package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xv */
/* JADX INFO: loaded from: classes4.dex */
public class C9235xv extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33078du = new C7017h4("typeface", "panose", "pitchFamily", "charset");

    /* JADX INFO: renamed from: k4 */
    private String f33079k4;

    /* JADX INFO: renamed from: kk */
    private byte f33080kk;

    /* JADX INFO: renamed from: to */
    private byte f33081to;

    /* JADX INFO: renamed from: x1 */
    private String f33082x1;

    public C9235xv() {
        m44655h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m44655h4() {
        this.f33080kk = (byte) 0;
        this.f33081to = (byte) 1;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m44663kk() {
        return this.f33080kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m44664to() {
        return this.f33081to;
    }

    public C9235xv(AbstractC13912i5 abstractC13912i5) {
        m44655h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9235xv.f33078du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9235xv.this.f33079k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9235xv.this.f33082x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C9235xv.this.f33080kk = C13850af.m65131up(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C9235xv.this.f33081to = C13850af.m65131up(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m44660k4() {
        return this.f33079k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m44665x1() {
        return this.f33082x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44661k4(byte b) {
        this.f33080kk = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44666x1(byte b) {
        this.f33081to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44662k4(String str) {
        this.f33079k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44667x1(String str) {
        this.f33082x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("typeface", this.f33079k4);
        String str3 = this.f33082x1;
        if (str3 != null) {
            c3059ii.m12955x1("panose", str3);
        }
        byte b = this.f33080kk;
        if (b != 0) {
            c3059ii.m12955x1("pitchFamily", C13850af.m65099k4(b));
        }
        byte b2 = this.f33081to;
        if (b2 != 1) {
            c3059ii.m12955x1("charset", C13850af.m65099k4(b2));
        }
        c3059ii.mo21898jd();
    }
}
