package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class fsr extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f23028c5;

    /* JADX INFO: renamed from: ck */
    private String f23029ck;

    /* JADX INFO: renamed from: du */
    private String f23030du;

    /* JADX INFO: renamed from: dy */
    private String f23031dy;

    /* JADX INFO: renamed from: fa */
    private String f23032fa;

    /* JADX INFO: renamed from: h4 */
    private int f23033h4;

    /* JADX INFO: renamed from: jd */
    private String f23034jd;

    /* JADX INFO: renamed from: kk */
    private int f23035kk;

    /* JADX INFO: renamed from: ks */
    private List<b8i> f23036ks;

    /* JADX INFO: renamed from: m9 */
    private String f23037m9;

    /* JADX INFO: renamed from: to */
    private String f23038to;

    /* JADX INFO: renamed from: up */
    private String f23039up;

    /* JADX INFO: renamed from: yj */
    private String f23040yj;

    /* JADX INFO: renamed from: k4 */
    public static final int f23025k4 = syu.m41448k4("default");

    /* JADX INFO: renamed from: x1 */
    public static final int f23027x1 = pyy.m39203k4("custom");

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f23026rv = new C7017h4("presentation:node-type", "presentation:preset-id", "presentation:preset-sub-type", "presentation:preset-class", "presentation:master-element", "presentation:group-id", "anim:id", "anim:command", "smil:begin", "smil:end", "smil:targetElement", "anim:sub-item", "param");

    public fsr() {
        m32067x1();
    }

    public fsr(final AbstractC13912i5 abstractC13912i5) {
        m32067x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fsr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (fsr.f23026rv.m27428k4(str)) {
                    case 0:
                        fsr.this.f23035kk = syu.m41448k4(str2);
                        break;
                    case 1:
                        fsr.this.f23038to = str2;
                        break;
                    case 2:
                        fsr.this.f23030du = str2;
                        break;
                    case 3:
                        fsr.this.f23033h4 = pyy.m39203k4(str2);
                        break;
                    case 4:
                        fsr.this.f23037m9 = str2;
                        break;
                    case 5:
                        fsr.this.f23031dy = str2;
                        break;
                    case 6:
                        fsr.this.f23028c5 = str2;
                        break;
                    case 7:
                        fsr.this.f23034jd = str2;
                        break;
                    case 8:
                        fsr.this.f23029ck = str2;
                        break;
                    case 9:
                        fsr.this.f23032fa = str2;
                        break;
                    case 10:
                        fsr.this.f23039up = str2;
                        break;
                    case 11:
                        fsr.this.f23040yj = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fsr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (fsr.f23026rv.m27428k4(abstractC13912i5.mo65023fa()) != 12) {
                    return false;
                }
                fsr.this.f23036ks.addItem(new b8i(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32067x1() {
        this.f23035kk = f23025k4;
        this.f23033h4 = f23027x1;
        this.f23036ks = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23035kk;
        if (i != f23025k4) {
            c3059ii.m12955x1("presentation:node-type", syu.m41449k4(i));
        }
        String str3 = this.f23038to;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:preset-id", str3);
        }
        String str4 = this.f23030du;
        if (str4 != null) {
            c3059ii.m12955x1("presentation:preset-sub-type", str4);
        }
        int i2 = this.f23033h4;
        if (i2 != f23027x1) {
            c3059ii.m12955x1("presentation:preset-class", pyy.m39204k4(i2));
        }
        String str5 = this.f23037m9;
        if (str5 != null) {
            c3059ii.m12955x1("presentation:master-element", str5);
        }
        String str6 = this.f23031dy;
        if (str6 != null) {
            c3059ii.m12955x1("presentation:group-id", str6);
        }
        String str7 = this.f23028c5;
        if (str7 != null) {
            c3059ii.m12955x1("anim:id", str7);
        }
        c3059ii.m12955x1("anim:command", this.f23034jd);
        String str8 = this.f23029ck;
        if (str8 != null) {
            c3059ii.m12955x1("smil:begin", str8);
        }
        String str9 = this.f23032fa;
        if (str9 != null) {
            c3059ii.m12955x1("smil:end", str9);
        }
        String str10 = this.f23039up;
        if (str10 != null) {
            c3059ii.m12955x1("smil:targetElement", str10);
        }
        String str11 = this.f23040yj;
        if (str11 != null) {
            c3059ii.m12955x1("anim:sub-item", str11);
        }
        List.Enumerator<b8i> it = this.f23036ks.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("anim", c3059ii, "param");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
