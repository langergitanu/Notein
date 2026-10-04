package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.wt */
/* JADX INFO: loaded from: classes5.dex */
public class C13270wt extends C13950o3 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13018hl f44449k4;

    public C13270wt(AbstractC13018hl abstractC13018hl) {
        this.f44449k4 = abstractC13018hl;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13950o3, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        Object obj;
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        for (AbstractC13018hl abstractC13018hlM60677c6 = this.f44449k4; abstractC13018hlM60677c6 != null; abstractC13018hlM60677c6 = abstractC13018hlM60677c6.m60677c6()) {
            Hashtable hashtableM49777k4 = abstractC13018hlM60677c6.m60691ts().m49777k4();
            if (hashtableM49777k4 != null && hashtableM49777k4.size() > 0 && (obj = hashtableM49777k4.get_Item(str)) != null) {
                return (String) obj;
            }
        }
        if (str.length() == 0) {
            return C14113y2.f47374k4;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.p559ms.System.Xml.C13950o3, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: x1 */
    public String mo52700x1(String str) {
        DictionaryEntry dictionaryEntry;
        if ("http://www.w3.org/XML/1998/namespace".equals(str)) {
            return "xml";
        }
        for (AbstractC13018hl abstractC13018hlM60677c6 = this.f44449k4; abstractC13018hlM60677c6 != null; abstractC13018hlM60677c6 = abstractC13018hlM60677c6.m60677c6()) {
            Hashtable hashtableM49777k4 = abstractC13018hlM60677c6.m60691ts().m49777k4();
            if (hashtableM49777k4 != null && hashtableM49777k4.size() > 0) {
                IDictionaryEnumerator it = hashtableM49777k4.iterator();
                do {
                    try {
                        if (it.hasNext()) {
                            dictionaryEntry = (DictionaryEntry) it.next();
                        } else if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                } while (!dictionaryEntry.getValue().equals(str));
                return (String) dictionaryEntry.getKey();
            }
        }
        return null;
    }
}
