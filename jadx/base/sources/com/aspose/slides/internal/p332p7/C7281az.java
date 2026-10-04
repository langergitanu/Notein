package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.az */
/* JADX INFO: loaded from: classes4.dex */
public class C7281az extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f20327up = new C7017h4("v:ext", RequestParameters.POSITION, "selection", "grouping", "ungrouping", "rotation", "cropping", "verticies", "adjusthandles", "text", "aspectratio", "shapetype");

    /* JADX INFO: renamed from: c5 */
    private int f20328c5;

    /* JADX INFO: renamed from: ck */
    private int f20329ck;

    /* JADX INFO: renamed from: du */
    private int f20330du;

    /* JADX INFO: renamed from: dy */
    private int f20331dy;

    /* JADX INFO: renamed from: fa */
    private int f20332fa;

    /* JADX INFO: renamed from: h4 */
    private int f20333h4;

    /* JADX INFO: renamed from: jd */
    private int f20334jd;

    /* JADX INFO: renamed from: k4 */
    private int f20335k4;

    /* JADX INFO: renamed from: kk */
    private int f20336kk;

    /* JADX INFO: renamed from: m9 */
    private int f20337m9;

    /* JADX INFO: renamed from: to */
    private int f20338to;

    /* JADX INFO: renamed from: x1 */
    private int f20339x1;

    public C7281az() {
        m28625x1();
    }

    public C7281az(AbstractC13912i5 abstractC13912i5) {
        m28625x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.az.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7281az.f20327up.m27428k4(str)) {
                    case 0:
                        C7281az.this.f20335k4 = dmv.m30455k4(str2);
                        break;
                    case 1:
                        C7281az.this.f20339x1 = C9369zh.m45616k4(str2);
                        break;
                    case 2:
                        C7281az.this.f20336kk = C9369zh.m45616k4(str2);
                        break;
                    case 3:
                        C7281az.this.f20338to = C9369zh.m45616k4(str2);
                        break;
                    case 4:
                        C7281az.this.f20330du = C9369zh.m45616k4(str2);
                        break;
                    case 5:
                        C7281az.this.f20333h4 = C9369zh.m45616k4(str2);
                        break;
                    case 6:
                        C7281az.this.f20337m9 = C9369zh.m45616k4(str2);
                        break;
                    case 7:
                        C7281az.this.f20331dy = C9369zh.m45616k4(str2);
                        break;
                    case 8:
                        C7281az.this.f20328c5 = C9369zh.m45616k4(str2);
                        break;
                    case 9:
                        C7281az.this.f20334jd = C9369zh.m45616k4(str2);
                        break;
                    case 10:
                        C7281az.this.f20329ck = C9369zh.m45616k4(str2);
                        break;
                    case 11:
                        C7281az.this.f20332fa = C9369zh.m45616k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m28625x1() {
        this.f20335k4 = 0;
        this.f20339x1 = 0;
        this.f20336kk = 0;
        this.f20338to = 0;
        this.f20330du = 0;
        this.f20333h4 = 0;
        this.f20337m9 = 0;
        this.f20331dy = 0;
        this.f20328c5 = 0;
        this.f20334jd = 0;
        this.f20329ck = 0;
        this.f20332fa = 0;
    }

    /* JADX INFO: renamed from: du */
    public final void m28626du(int i) {
        this.f20329ck = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m28627h4(int i) {
        this.f20332fa = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m28629kk(int i) {
        this.f20336kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m28630to(int i) {
        this.f20338to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28628k4(int i) {
        this.f20335k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28631x1(int i) {
        this.f20339x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f20335k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        int i2 = this.f20339x1;
        if (i2 != 0) {
            c3059ii.m12955x1(RequestParameters.POSITION, C9369zh.m45617k4(i2));
        }
        int i3 = this.f20336kk;
        if (i3 != 0) {
            c3059ii.m12955x1("selection", C9369zh.m45617k4(i3));
        }
        int i4 = this.f20338to;
        if (i4 != 0) {
            c3059ii.m12955x1("grouping", C9369zh.m45617k4(i4));
        }
        int i5 = this.f20330du;
        if (i5 != 0) {
            c3059ii.m12955x1("ungrouping", C9369zh.m45617k4(i5));
        }
        int i6 = this.f20333h4;
        if (i6 != 0) {
            c3059ii.m12955x1("rotation", C9369zh.m45617k4(i6));
        }
        int i7 = this.f20337m9;
        if (i7 != 0) {
            c3059ii.m12955x1("cropping", C9369zh.m45617k4(i7));
        }
        int i8 = this.f20331dy;
        if (i8 != 0) {
            c3059ii.m12955x1("verticies", C9369zh.m45617k4(i8));
        }
        int i9 = this.f20328c5;
        if (i9 != 0) {
            c3059ii.m12955x1("adjusthandles", C9369zh.m45617k4(i9));
        }
        int i10 = this.f20334jd;
        if (i10 != 0) {
            c3059ii.m12955x1("text", C9369zh.m45617k4(i10));
        }
        int i11 = this.f20329ck;
        if (i11 != 0) {
            c3059ii.m12955x1("aspectratio", C9369zh.m45617k4(i11));
        }
        int i12 = this.f20332fa;
        if (i12 != 0) {
            c3059ii.m12955x1("shapetype", C9369zh.m45617k4(i12));
        }
        c3059ii.mo21898jd();
    }
}
