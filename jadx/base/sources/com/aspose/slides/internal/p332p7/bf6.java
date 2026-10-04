package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class bf6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20539to = new C7017h4("baseType", "size", "variant", "i1", "i2", "i4", "i8", "ui1", "ui2", "ui4", "ui8", "r4", "r8", "lpstr", "lpwstr", "bstr", "date", "filetime", "bool", TranslateLanguage.WELSH, "error", "clsid", "cf");

    /* JADX INFO: renamed from: k4 */
    private int f20540k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f20541kk;

    /* JADX INFO: renamed from: x1 */
    private long f20542x1;

    public bf6() {
        m28871kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28871kk() {
        this.f20540k4 = 0;
        this.f20541kk = new List<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r2.addItem(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        com.aspose.slides.internal.p332p7.OooOO0O.OooO0O0(r3, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        r2.addItem(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:1: B:8:0x0020->B:50:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bf6(AbstractC13912i5 abstractC13912i5) {
        List<C7394ca> list;
        C7394ca c7394ca;
        String strMo65042rv;
        List<C7394ca> list2;
        String str;
        List<C7394ca> list3;
        C7394ca c7394ca2;
        m28871kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bf6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str2, String str3) {
                int iM27428k4 = bf6.f20539to.m27428k4(str2);
                if (iM27428k4 == 0) {
                    bf6.this.f20540k4 = yem.m44979k4(str3);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bf6.this.f20542x1 = AbstractC7361bz.m29295ne(str3);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f20539to.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 2:
                            rue rueVar = new rue(abstractC13912i5);
                            list = this.f20541kk;
                            c7394ca = new C7394ca("variant", rueVar);
                            break;
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            abstractC13912i5.mo65208bv();
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                        case 5:
                            abstractC13912i5.mo65026h4();
                            int iM65151yj = C13850af.m65151yj(abstractC13912i5.mo65042rv());
                            list = this.f20541kk;
                            c7394ca = new C7394ca("i4", Integer.valueOf(iM65151yj));
                            break;
                        case 11:
                            abstractC13912i5.mo65026h4();
                            float fM29300yj = (float) AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv());
                            list = this.f20541kk;
                            c7394ca = new C7394ca("r4", Float.valueOf(fM29300yj));
                            break;
                        case 12:
                            abstractC13912i5.mo65026h4();
                            this.f20541kk.addItem(new C7394ca("r8", Double.valueOf(AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv()))));
                            break;
                        case 13:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list2 = this.f20541kk;
                            str = "lpstr";
                            break;
                        case 14:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list2 = this.f20541kk;
                            str = "lpwstr";
                            break;
                        case 15:
                        case 16:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        default:
                            abstractC13912i5.mo65208bv();
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                        case 17:
                            abstractC13912i5.mo65026h4();
                            C14084qq c14084qqClone = C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16).Clone();
                            list3 = this.f20541kk;
                            c7394ca2 = new C7394ca("filetime", c14084qqClone.Clone());
                            break;
                        case 18:
                            abstractC13912i5.mo65026h4();
                            boolean zM65068c5 = C13850af.m65068c5(abstractC13912i5.mo65042rv());
                            list3 = this.f20541kk;
                            c7394ca2 = new C7394ca("bool", Boolean.valueOf(zM65068c5));
                            break;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final long m28873k4() {
        return this.f20542x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m28874k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f20539to.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("variant", new rue());
        } else if (iM27428k4 == 5) {
            c7394ca = new C7394ca("i4", (Integer) C7019kk.m27467x1(Integer.TYPE));
        } else if (iM27428k4 == 17) {
            c7394ca = new C7394ca("filetime", new C14084qq());
        } else if (iM27428k4 != 18) {
            switch (iM27428k4) {
                case 11:
                    c7394ca = new C7394ca("r4", (Float) C7019kk.m27467x1(Float.TYPE));
                    break;
                case 12:
                    c7394ca = new C7394ca("r8", (Double) C7019kk.m27467x1(Double.TYPE));
                    break;
                case 13:
                    c7394ca = new C7394ca("lpstr", C14113y2.f47374k4);
                    break;
                case 14:
                    c7394ca = new C7394ca("lpwstr", C14113y2.f47374k4);
                    break;
                default:
                    throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
        } else {
            c7394ca = new C7394ca("bool", (Boolean) C7019kk.m27467x1(Boolean.TYPE));
        }
        this.f20541kk.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28875k4(int i) {
        this.f20540k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28876k4(long j) {
        this.f20542x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28877k4(C7394ca c7394ca) {
        this.f20541kk.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String str3;
        String str4;
        String strM65103k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("baseType", yem.m44980k4(this.f20540k4));
        c3059ii.m12955x1("size", C13850af.m65147x1(this.f20542x1));
        List.Enumerator<C7394ca> it = this.f20541kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f20539to.m27428k4(next.m29539k4());
                if (iM27428k4 != 2) {
                    if (iM27428k4 == 5) {
                        str3 = "vt";
                        str4 = "i4";
                        strM65103k4 = C13850af.m65103k4(((Integer) C7019kk.m27464to(next.m29541kk(), Integer.TYPE)).intValue());
                    } else if (iM27428k4 == 17) {
                        str3 = "vt";
                        str4 = "filetime";
                        strM65103k4 = C13850af.m65108k4(((C14084qq) C7019kk.m27464to(next.m29541kk(), C14084qq.class)).Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffK");
                    } else if (iM27428k4 != 18) {
                        switch (iM27428k4) {
                            case 11:
                                str3 = "vt";
                                str4 = "r4";
                                strM65103k4 = C13850af.m65102k4(((Float) C7019kk.m27464to(next.m29541kk(), Float.TYPE)).floatValue());
                                break;
                            case 12:
                                str3 = "vt";
                                str4 = "r8";
                                strM65103k4 = C13850af.m65101k4(((Double) C7019kk.m27464to(next.m29541kk(), Double.TYPE)).doubleValue());
                                break;
                            case 13:
                                str3 = "vt";
                                str4 = "lpstr";
                                strM65103k4 = (String) next.m29541kk();
                                break;
                            case 14:
                                str3 = "vt";
                                str4 = "lpwstr";
                                strM65103k4 = (String) next.m29541kk();
                                break;
                            default:
                                continue;
                        }
                    } else {
                        str3 = "vt";
                        str4 = "bool";
                        strM65103k4 = C13850af.m65112k4(((Boolean) C7019kk.m27464to(next.m29541kk(), Boolean.TYPE)).booleanValue());
                    }
                    m29301k4(str3, c3059ii, str4, strM65103k4, false);
                } else {
                    ((rue) next.m29541kk()).mo6846k4("vt", c3059ii, next.m29539k4());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
