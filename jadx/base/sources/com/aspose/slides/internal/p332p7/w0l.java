package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class w0l extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32142h4 = new C7017h4("fmtid", "pid", "name", "linkTarget", "vector", "array", "blob", "oblob", "empty", CloudMetaExtra.DEFINE_NON_PARENT_ID, "i1", "i2", "i4", "i8", "int", "ui1", "ui2", "ui4", "ui8", "uint", "r4", "r8", "decimal", "lpstr", "lpwstr", "bstr", "date", "filetime", "bool", TranslateLanguage.WELSH, "error", "stream", "ostream", "storage", "ostorage", "vstream", "clsid", "cf");

    /* JADX INFO: renamed from: du */
    private C7394ca f32143du;

    /* JADX INFO: renamed from: k4 */
    private String f32144k4;

    /* JADX INFO: renamed from: kk */
    private String f32145kk;

    /* JADX INFO: renamed from: to */
    private String f32146to;

    /* JADX INFO: renamed from: x1 */
    private int f32147x1;

    public w0l() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m43448x1() {
        return this.f32143du;
    }

    public w0l(final AbstractC13912i5 abstractC13912i5) {
        String strMo65050up = abstractC13912i5.mo65050up();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj())) {
                int iM27428k4 = f32142h4.m27428k4(C14113y2.m67363du(abstractC13912i5.mo13292k4(abstractC13912i5.mo65060yj()), strMo65050up) ? abstractC13912i5.mo65023fa() : abstractC13912i5.mo65019ck());
                if (iM27428k4 == 0) {
                    this.f32144k4 = abstractC13912i5.mo65042rv();
                } else if (iM27428k4 == 1) {
                    this.f32147x1 = C13850af.m65151yj(abstractC13912i5.mo65042rv());
                } else if (iM27428k4 == 2) {
                    this.f32145kk = abstractC13912i5.mo65042rv();
                } else {
                    if (iM27428k4 != 3) {
                        throw new Exception(C14113y2.m67408k4("Unknown attribute \"", abstractC13912i5.mo65019ck(), "\""));
                    }
                    this.f32146to = abstractC13912i5.mo65042rv();
                }
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w0l.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                w0l w0lVar;
                C7394ca c7394ca;
                switch (w0l.f32142h4.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 22:
                    case 23:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        abstractC13912i5.mo65208bv();
                        return false;
                    case 12:
                        abstractC13912i5.mo65026h4();
                        w0lVar = w0l.this;
                        c7394ca = new C7394ca("i4", Integer.valueOf(C14057f9.m66582k4(abstractC13912i5.mo65042rv())));
                        break;
                    case 20:
                        abstractC13912i5.mo65026h4();
                        w0lVar = w0l.this;
                        c7394ca = new C7394ca("r4", Float.valueOf(C13850af.m65129u4(abstractC13912i5.mo65042rv())));
                        break;
                    case 21:
                        abstractC13912i5.mo65026h4();
                        w0lVar = w0l.this;
                        c7394ca = new C7394ca("r8", Double.valueOf(C13850af.m65132uz(abstractC13912i5.mo65042rv())));
                        break;
                    case 24:
                        String strMo65052v4 = abstractC13912i5.mo65052v4();
                        if (!abstractC13912i5.mo65048u4()) {
                            while (abstractC13912i5.mo65028jd() != 15) {
                                abstractC13912i5.mo65026h4();
                                strMo65052v4 = C14113y2.m67400k4(strMo65052v4, abstractC13912i5.mo65052v4());
                            }
                        }
                        w0l.this.f32143du = new C7394ca("lpwstr", strMo65052v4);
                        return true;
                    case 27:
                        abstractC13912i5.mo65026h4();
                        w0lVar = w0l.this;
                        c7394ca = new C7394ca("filetime", C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16).Clone());
                        break;
                    case 28:
                        abstractC13912i5.mo65026h4();
                        w0lVar = w0l.this;
                        c7394ca = new C7394ca("bool", Boolean.valueOf(C13850af.m65068c5(abstractC13912i5.mo65042rv())));
                        break;
                    default:
                        return false;
                }
                w0lVar.f32143du = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43444k4(Object obj) {
        if (this.f32143du != null) {
            throw new Exception("PropertyValue already is initialized.");
        }
        this.f32143du = C7019kk.m27469x1(obj, C14084qq.class) ? new C7394ca("filetime", obj) : C7019kk.m27469x1(obj, Date.class) ? new C7394ca("filetime", C14084qq.m67093k4((Date) obj)) : C7019kk.m27469x1(obj, Boolean.class) ? new C7394ca("bool", obj) : C7019kk.m27469x1(obj, Integer.class) ? new C7394ca("i4", obj) : C7019kk.m27469x1(obj, Float.class) ? new C7394ca("r4", obj) : C7019kk.m27469x1(obj, Double.class) ? new C7394ca("r8", obj) : new C7394ca("lpwstr", obj.toString());
        return this.f32143du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43449x1(String str) {
        this.f32145kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m43445k4() {
        return this.f32145kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43446k4(int i) {
        this.f32147x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43447k4(String str) {
        this.f32144k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String strM67408k4;
        String strM65103k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("fmtid", this.f32144k4);
        c3059ii.m12955x1("pid", C13850af.m65103k4(this.f32147x1));
        String str3 = this.f32145kk;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        String str4 = this.f32146to;
        if (str4 != null) {
            c3059ii.m12955x1("linkTarget", str4);
        }
        C7394ca c7394ca = this.f32143du;
        if (c7394ca != null) {
            int iM27428k4 = f32142h4.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 12) {
                strM67408k4 = C14113y2.m67408k4("vt:", "i4");
                strM65103k4 = C13850af.m65103k4(((Integer) C7019kk.m27464to(this.f32143du.m29541kk(), Integer.TYPE)).intValue());
            } else if (iM27428k4 == 24) {
                strM67408k4 = C14113y2.m67408k4("vt:", "lpwstr");
                strM65103k4 = (String) this.f32143du.m29541kk();
            } else if (iM27428k4 == 20) {
                strM67408k4 = C14113y2.m67408k4("vt:", "r4");
                strM65103k4 = C13850af.m65102k4(((Float) C7019kk.m27464to(this.f32143du.m29541kk(), Float.TYPE)).floatValue());
            } else if (iM27428k4 == 21) {
                strM67408k4 = C14113y2.m67408k4("vt:", "r8");
                strM65103k4 = C13850af.m65101k4(((Double) C7019kk.m27464to(this.f32143du.m29541kk(), Double.TYPE)).doubleValue());
            } else if (iM27428k4 == 27) {
                strM67408k4 = C14113y2.m67408k4("vt:", "filetime");
                strM65103k4 = C13850af.m65108k4(((C14084qq) C7019kk.m27464to(this.f32143du.m29541kk(), C14084qq.class)).Clone(), "yyyy-MM-ddTHH:mm:ssZ");
            } else if (iM27428k4 == 28) {
                strM67408k4 = C14113y2.m67408k4("vt:", "bool");
                strM65103k4 = C13850af.m65112k4(((Boolean) C7019kk.m27464to(this.f32143du.m29541kk(), Boolean.TYPE)).booleanValue());
            }
            c3059ii.m65800du(strM67408k4, strM65103k4);
        }
        c3059ii.mo21898jd();
    }
}
