package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.p559ms.System.AbstractC14070jw;

/* JADX INFO: loaded from: classes3.dex */
public class CollectionsUtil {
    public static Hashtable createCaseInsensitiveHashtable() {
        return new Hashtable(AbstractC14070jw.m66787k4());
    }

    public static SortedList createCaseInsensitiveSortedList() {
        return new SortedList(CaseInsensitiveComparer.getDefault());
    }

    public static Hashtable createCaseInsensitiveHashtable(int i) {
        return new Hashtable(i, AbstractC14070jw.m66787k4());
    }

    public static Hashtable createCaseInsensitiveHashtable(Hashtable hashtable) {
        return new Hashtable(hashtable, AbstractC14070jw.m66787k4());
    }
}
