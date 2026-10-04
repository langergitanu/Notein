package com.aspose.slides.Collections;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DictionaryEntry extends AbstractC7020m9<DictionaryEntry> implements Map.Entry {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f1586k4 = true;

    /* JADX INFO: renamed from: kk */
    private Object f1587kk;

    /* JADX INFO: renamed from: x1 */
    private Object f1588x1;

    public DictionaryEntry() {
    }

    public static boolean equals(DictionaryEntry dictionaryEntry, DictionaryEntry dictionaryEntry2) {
        return dictionaryEntry.equals(dictionaryEntry2);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m795k4(DictionaryEntry dictionaryEntry) {
        return C14067j2.m66728k4(dictionaryEntry.f1588x1, this.f1588x1) && C14067j2.m66728k4(dictionaryEntry.f1587kk, this.f1587kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public DictionaryEntry Clone() {
        DictionaryEntry dictionaryEntry = new DictionaryEntry();
        CloneTo(dictionaryEntry);
        return dictionaryEntry;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public void CloneTo(DictionaryEntry dictionaryEntry) {
        dictionaryEntry.f1588x1 = this.f1588x1;
        dictionaryEntry.f1587kk = this.f1587kk;
    }

    public Object clone() {
        return Clone();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f1588x1;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f1587kk;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object obj = this.f1588x1;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f1587kk;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public void setKey(Object obj) {
        this.f1588x1 = obj;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object obj2 = this.f1587kk;
        this.f1587kk = obj;
        return obj2;
    }

    public DictionaryEntry(Object obj, Object obj2) {
        this.f1588x1 = obj;
        this.f1587kk = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!f1586k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof DictionaryEntry) {
            return m795k4((DictionaryEntry) obj);
        }
        return false;
    }
}
