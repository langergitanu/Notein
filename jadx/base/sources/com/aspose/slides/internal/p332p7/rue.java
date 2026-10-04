package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: loaded from: classes4.dex */
public class rue extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f29751x1 = new C7017h4("variant", "vector", "array", "blob", "oblob", "empty", CloudMetaExtra.DEFINE_NON_PARENT_ID, "i1", "i2", "i4", "i8", "int", "ui1", "ui2", "ui4", "ui8", "uint", "r4", "r8", "decimal", "lpstr", "lpwstr", "bstr", "date", "filetime", "bool", TranslateLanguage.WELSH, "error", "stream", "ostream", "storage", "ostorage", "vstream", "clsid", "cf");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f29752k4;

    public rue() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m40566k4(String str) {
        C7394ca c7394ca;
        if (this.f29752k4 != null) {
            throw new Exception("Variant already is initialized.");
        }
        int iM27428k4 = f29751x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("variant", new rue());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("vector", new bf6());
        } else if (iM27428k4 == 9) {
            c7394ca = new C7394ca("i4", (Integer) C7019kk.m27467x1(Integer.TYPE));
        } else if (iM27428k4 == 24) {
            c7394ca = new C7394ca("filetime", new C14084qq());
        } else if (iM27428k4 == 17) {
            c7394ca = new C7394ca("r4", (Float) C7019kk.m27467x1(Float.TYPE));
        } else if (iM27428k4 == 18) {
            c7394ca = new C7394ca("r8", (Double) C7019kk.m27467x1(Double.TYPE));
        } else if (iM27428k4 == 20) {
            c7394ca = new C7394ca("lpstr", C14113y2.f47374k4);
        } else {
            if (iM27428k4 != 21) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("lpwstr", C14113y2.f47374k4);
        }
        this.f29752k4 = c7394ca;
        return this.f29752k4;
    }

    public rue(AbstractC13912i5 abstractC13912i5) {
        C7394ca c7394ca;
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f29751x1.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 0:
                            c7394ca = new C7394ca("variant", new rue(abstractC13912i5));
                            this.f29752k4 = c7394ca;
                            break;
                        case 1:
                            c7394ca = new C7394ca("vector", new bf6(abstractC13912i5));
                            this.f29752k4 = c7394ca;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 19:
                        case 22:
                        case 23:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        default:
                            abstractC13912i5.mo65208bv();
                            break;
                        case 9:
                            abstractC13912i5.mo65026h4();
                            c7394ca = new C7394ca("i4", Integer.valueOf(C13850af.m65151yj(abstractC13912i5.mo65042rv())));
                            this.f29752k4 = c7394ca;
                            break;
                        case 17:
                            abstractC13912i5.mo65026h4();
                            c7394ca = new C7394ca("r4", Float.valueOf((float) AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv())));
                            this.f29752k4 = c7394ca;
                            break;
                        case 18:
                            abstractC13912i5.mo65026h4();
                            c7394ca = new C7394ca("r8", Double.valueOf(AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv())));
                            this.f29752k4 = c7394ca;
                            break;
                        case 20:
                            abstractC13912i5.mo65026h4();
                            c7394ca = new C7394ca("lpstr", abstractC13912i5.mo65042rv());
                            this.f29752k4 = c7394ca;
                            break;
                        case 21:
                            abstractC13912i5.mo65026h4();
                            c7394ca = new C7394ca("lpwstr", abstractC13912i5.mo65042rv());
                            this.f29752k4 = c7394ca;
                            break;
                        case 24:
                            abstractC13912i5.mo65026h4();
                            c7394ca = new C7394ca("filetime", C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16).Clone());
                            this.f29752k4 = c7394ca;
                            break;
                    }
                    return;
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        rue rueVar;
        String strM65103k4;
        boolean z;
        String str3;
        String str4;
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f29752k4;
        if (c7394ca == null) {
            c3059ii2 = c3059ii;
        } else {
            int iM27428k4 = f29751x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                c3059ii2 = c3059ii;
                ((rue) this.f29752k4.m29541kk()).mo6846k4("vt", c3059ii2, this.f29752k4.m29539k4());
            } else if (iM27428k4 != 1) {
                if (iM27428k4 == 9) {
                    rueVar = this;
                    c3059ii2 = c3059ii;
                    strM65103k4 = C13850af.m65103k4(((Integer) C7019kk.m27464to(rueVar.f29752k4.m29541kk(), Integer.TYPE)).intValue());
                    z = false;
                    str3 = "vt";
                    str4 = "i4";
                } else if (iM27428k4 == 24) {
                    rueVar = this;
                    c3059ii2 = c3059ii;
                    strM65103k4 = C13850af.m65108k4(((C14084qq) C7019kk.m27464to(rueVar.f29752k4.m29541kk(), C14084qq.class)).Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffK");
                    z = false;
                    str3 = "vt";
                    str4 = "filetime";
                } else if (iM27428k4 == 17) {
                    rueVar = this;
                    c3059ii2 = c3059ii;
                    strM65103k4 = C13850af.m65102k4(((Float) C7019kk.m27464to(rueVar.f29752k4.m29541kk(), Float.TYPE)).floatValue());
                    z = false;
                    str3 = "vt";
                    str4 = "r4";
                } else if (iM27428k4 == 18) {
                    rueVar = this;
                    c3059ii2 = c3059ii;
                    strM65103k4 = C13850af.m65101k4(((Double) C7019kk.m27464to(rueVar.f29752k4.m29541kk(), Double.TYPE)).doubleValue());
                    z = false;
                    str3 = "vt";
                    str4 = "r8";
                } else if (iM27428k4 == 20) {
                    rueVar = this;
                    c3059ii2 = c3059ii;
                    strM65103k4 = (String) rueVar.f29752k4.m29541kk();
                    z = false;
                    str3 = "vt";
                    str4 = "lpstr";
                } else if (iM27428k4 == 21) {
                    m29301k4("vt", c3059ii, "lpwstr", (String) this.f29752k4.m29541kk(), false);
                    c3059ii2 = c3059ii;
                }
                rueVar.m29301k4(str3, c3059ii2, str4, strM65103k4, z);
            } else {
                c3059ii2 = c3059ii;
                ((bf6) this.f29752k4.m29541kk()).mo6846k4("vt", c3059ii2, this.f29752k4.m29539k4());
            }
        }
        c3059ii2.mo21898jd();
    }
}
