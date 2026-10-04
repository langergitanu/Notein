package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3044dc;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.b1 */
/* JADX INFO: loaded from: classes4.dex */
class C11706b1 {

    /* JADX INFO: renamed from: k4 */
    private static final C13129ny f39670k4 = null;

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f39671x1 = new C7017h4(HTMLWriter.MEDIA_TYPE, "full-path", "size");

    /* JADX INFO: renamed from: k4 */
    public static void m55276k4(SortedList<String, C11839vw> sortedList) {
        C11839vw next;
        String str = null;
        C11839vw[] c11839vwArr = {null};
        sortedList.tryGetValue("/META-INF/manifest.xml", c11839vwArr);
        C11839vw c11839vw = c11839vwArr[0];
        if (c11839vw == null) {
            throw new C11856y4(C14113y2.m67408k4("Can't find part \"", "/META-INF/manifest.xml", "\"."));
        }
        c11839vw.m55430k4("text/xml");
        C3152yj c3152yjM55417h4 = c11839vw.m55417h4();
        if (c3152yjM55417h4 == null) {
            throw new C11856y4(C14113y2.m67408k4("manifestStream is null when reading \"", "/META-INF/manifest.xml", "\" relationships part"));
        }
        try {
            AbstractC13912i5 abstractC13912i5M12833k4 = C3044dc.m12833k4(new C3148wl((AbstractC3150x6) c3152yjM55417h4, true), f39670k4, null, null, false);
            while (abstractC13912i5M12833k4.mo65026h4()) {
                if (abstractC13912i5M12833k4.mo65028jd() == 1 && "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0".equals(abstractC13912i5M12833k4.mo65050up()) && "manifest".equals(abstractC13912i5M12833k4.mo65023fa())) {
                    while (abstractC13912i5M12833k4.mo65026h4() && (abstractC13912i5M12833k4.mo65028jd() != 15 || !"manifest".equals(abstractC13912i5M12833k4.mo65023fa()))) {
                        if (abstractC13912i5M12833k4.mo65028jd() == 1 && "file-entry".equals(abstractC13912i5M12833k4.mo65023fa())) {
                            String strM67407k4 = str;
                            String strMo65042rv = strM67407k4;
                            boolean z = false;
                            while (abstractC13912i5M12833k4.mo65047to()) {
                                int iM27428k4 = f39671x1.m27428k4(abstractC13912i5M12833k4.mo65023fa());
                                if (iM27428k4 == 0) {
                                    strMo65042rv = abstractC13912i5M12833k4.mo65042rv();
                                } else if (iM27428k4 == 1) {
                                    strM67407k4 = C14113y2.m67407k4(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), abstractC13912i5M12833k4.mo65042rv());
                                } else if (iM27428k4 == 2) {
                                    z = true;
                                }
                            }
                            abstractC13912i5M12833k4.mo65020du();
                            boolean zM65484k4 = abstractC13912i5M12833k4.m65484k4("encryption-data", abstractC13912i5M12833k4.mo65050up());
                            IGenericEnumerator<C11839vw> it = sortedList.getValues().iterator();
                            while (true) {
                                try {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    } else {
                                        next = it.next();
                                        if (C14113y2.m67363du(next.m55427x1(), strM67407k4)) {
                                            break;
                                        }
                                    }
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                }
                            }
                            if (next != null) {
                                if (!"".equals(strMo65042rv)) {
                                    next.m55430k4(strMo65042rv);
                                } else if (C14113y2.m67363du(C14113y2.m67368h4(C3141rv.m13397du(strM67407k4)), ".wmf")) {
                                    next.m55430k4("image/x-wmf");
                                }
                                next.m55432x1(z & zM65484k4);
                            }
                            str = null;
                        }
                    }
                }
            }
            c11839vw.m55422k4(true);
        } catch (RuntimeException e) {
            throw new C11856y4(C14113y2.m67408k4("Error reading \"", "/META-INF/manifest.xml", "\" relationships part"), e);
        }
    }
}
