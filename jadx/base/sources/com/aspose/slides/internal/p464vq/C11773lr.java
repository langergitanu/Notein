package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3044dc;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.lr */
/* JADX INFO: loaded from: classes4.dex */
class C11773lr {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f39787k4 = new C7017h4("PartName", "ContentType", "Extension");

    /* JADX INFO: renamed from: k4 */
    public static void m55350k4(SortedList<String, C11791os> sortedList) {
        C11791os[] c11791osArr = {null};
        sortedList.tryGetValue("/[Content_Types].xml", c11791osArr);
        C11791os c11791os = c11791osArr[0];
        if (c11791os == null) {
            throw new C11726dl("Can't find part \"/[Content_Types].xml\".");
        }
        C3152yj c3152yjM55417h4 = c11791os.m55417h4();
        if (c3152yjM55417h4 == null) {
            throw new C11726dl(C14113y2.m67408k4("contentTypesStream is null when reading \"", "/[Content_Types].xml", "\" relationships part"));
        }
        try {
            C11834v4 c11834v4 = new C11834v4();
            AbstractC13912i5 abstractC13912i5M12833k4 = C3044dc.m12833k4(new C3148wl((AbstractC3150x6) c3152yjM55417h4, true), c11834v4.mo55274to(), c11834v4.mo55298du(), c11834v4.mo55273k4(), c11834v4.mo55335h4());
            while (abstractC13912i5M12833k4.mo65026h4()) {
                if (abstractC13912i5M12833k4.mo65028jd() == 1 && "http://schemas.openxmlformats.org/package/2006/content-types".equals(abstractC13912i5M12833k4.mo65050up()) && "Types".equals(abstractC13912i5M12833k4.mo65023fa())) {
                    while (abstractC13912i5M12833k4.mo65026h4() && (abstractC13912i5M12833k4.mo65028jd() != 15 || !"Types".equals(abstractC13912i5M12833k4.mo65023fa()))) {
                        m55352k4(abstractC13912i5M12833k4, sortedList);
                        m55353x1(abstractC13912i5M12833k4, sortedList);
                    }
                }
            }
            c11791os.m55378x1(new C11834v4());
            c11791os.m55422k4(true);
        } catch (RuntimeException e) {
            throw new C11726dl(C14113y2.m67408k4("Error reading \"", "/[Content_Types].xml", "\" relationships part"), e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m55353x1(AbstractC13912i5 abstractC13912i5, SortedList<String, C11791os> sortedList) {
        if (abstractC13912i5.mo65028jd() == 1 && "Default".equals(abstractC13912i5.mo65023fa())) {
            String strM67368h4 = null;
            String strMo65042rv = null;
            while (abstractC13912i5.mo65047to()) {
                int iM27428k4 = f39787k4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    strMo65042rv = abstractC13912i5.mo65042rv();
                } else if (iM27428k4 == 2) {
                    strM67368h4 = C14113y2.m67368h4(abstractC13912i5.mo65042rv());
                }
            }
            if (strM67368h4 != null && strMo65042rv != null) {
                String strM67408k4 = C14113y2.m67408k4(".", strM67368h4);
                IGenericEnumerator<C11791os> it = sortedList.getValues().iterator();
                while (it.hasNext()) {
                    try {
                        C11791os next = it.next();
                        if (next.m55372fa() == null && C14113y2.m67424kk(C14113y2.m67368h4(next.m55427x1()), strM67408k4)) {
                            next.m55378x1(C11826u5.m55410k4(strMo65042rv));
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
            abstractC13912i5.mo65020du();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55351k4(AbstractC11819tq abstractC11819tq) {
        C3152yj c3152yj = new C3152yj();
        try {
            C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
            c13991ub.m66262x1(4);
            c13991ub.m66258k4(abstractC11819tq.m55349x1() ? 1 : 0);
            c13991ub.mo65747x1(true);
            c13991ub.m65807up("Types");
            c13991ub.m65806to("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");
            Dictionary dictionary = new Dictionary();
            for (C11791os c11791os : abstractC11819tq.m55388c5()) {
                String strM55427x1 = c11791os.m55427x1();
                int iM67418kk = C14113y2.m67418kk(strM55427x1, FilenameUtils.EXTENSION_SEPARATOR);
                if (iM67418kk >= 0) {
                    String strM67368h4 = C14113y2.m67368h4(C14113y2.m67422kk(strM55427x1, iM67418kk));
                    String[] strArr = {null};
                    boolean zTryGetValue = dictionary.tryGetValue(strM67368h4, strArr);
                    String str = strArr[0];
                    if (!zTryGetValue) {
                        dictionary.set_Item(strM67368h4, c11791os.m55372fa().mo55273k4());
                    } else if (!"".equals(str) && !C14113y2.m67363du(str, c11791os.m55372fa().mo55273k4())) {
                        dictionary.set_Item(strM67368h4, "");
                    }
                }
            }
            Dictionary.Enumerator it = dictionary.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    String str2 = (String) next.getValue();
                    String strM67368h42 = C14113y2.m67368h4((String) next.getKey());
                    if (!"".equals(str2)) {
                        c13991ub.m65807up("Default");
                        c13991ub.m65806to("Extension", C14113y2.m67422kk((String) next.getKey(), 1));
                        c13991ub.m65806to("ContentType", str2);
                    } else if (".xml".equals(strM67368h42)) {
                        c13991ub.m65807up("Default");
                        c13991ub.m65806to("Extension", C14113y2.m67422kk((String) next.getKey(), 1));
                        c13991ub.m65806to("ContentType", "application/xml");
                    }
                    c13991ub.mo21898jd();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            for (C11791os c11791os2 : abstractC11819tq.m55388c5()) {
                String strM55427x12 = c11791os2.m55427x1();
                int iM67418kk2 = C14113y2.m67418kk(strM55427x12, FilenameUtils.EXTENSION_SEPARATOR);
                if (!C14113y2.m67363du(iM67418kk2 < 0 ? "application/xml" : (String) dictionary.get_Item(C14113y2.m67368h4(C14113y2.m67422kk(strM55427x12, iM67418kk2))), c11791os2.m55372fa().mo55273k4())) {
                    c13991ub.m65807up("Override");
                    c13991ub.m65806to("PartName", strM55427x12);
                    c13991ub.m65806to("ContentType", c11791os2.m55372fa().mo55273k4());
                    c13991ub.mo21898jd();
                }
            }
            c13991ub.mo21898jd();
            c13991ub.m66257k4();
            c13991ub.mo21896h4();
            abstractC11819tq.m55394k4("/[Content_Types].xml", (AbstractC11760jd.k4) null, new C11834v4()).m55423k4(c3152yj.toArray());
            c3152yj.dispose();
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55352k4(AbstractC13912i5 abstractC13912i5, SortedList<String, C11791os> sortedList) {
        if (abstractC13912i5.mo65028jd() == 1 && "Override".equals(abstractC13912i5.mo65023fa())) {
            String strMo65042rv = null;
            String strMo65042rv2 = null;
            while (abstractC13912i5.mo65047to()) {
                int iM27428k4 = f39787k4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    strMo65042rv = abstractC13912i5.mo65042rv();
                } else if (iM27428k4 == 1) {
                    strMo65042rv2 = abstractC13912i5.mo65042rv();
                }
            }
            if (strMo65042rv != null && strMo65042rv2 != null && sortedList.containsKey(strMo65042rv)) {
                sortedList.get_Item(strMo65042rv).m55378x1(C11826u5.m55410k4(strMo65042rv2));
            }
            abstractC13912i5.mo65020du();
        }
    }
}
