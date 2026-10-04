package com.aspose.slides.internal.p087dm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.AbstractC14070jw;

/* JADX INFO: renamed from: com.aspose.slides.internal.dm.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3187kk implements IGenericDictionary<String, String> {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, String> f9469k4;

    public C3187kk() {
        this.f9469k4 = new Dictionary<>(AbstractC14070jw.m66789to());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f9469k4.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public final boolean removeItemByKey(String str) {
        return this.f9469k4.removeItemByKey(str);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericCollection<String> getKeys() {
        return this.f9469k4.getKeys();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericCollection<String> getValues() {
        return this.f9469k4.getValues();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        throw new NotImplementedException();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, String>> iterator() {
        return this.f9469k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13681k4(String[] strArr) {
        for (String str : strArr) {
            if (containsKey(str)) {
                return this.f9469k4.get_Item(str);
            }
        }
        return null;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final String get_Item(String str) {
        if (this.f9469k4.containsKey(str)) {
            return this.f9469k4.get_Item(str);
        }
        return null;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f9469k4.size();
    }

    /* JADX INFO: renamed from: to */
    public final String m13692to(String str) {
        return m13681k4(new String[]{str});
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void set_Item(String str, String str2) {
        if (str2 == null && containsKey(str)) {
            m13696x1(str);
        } else if (str2 != null) {
            if (this.f9469k4.containsKey(str)) {
                this.f9469k4.set_Item(str, str2);
            } else {
                m13684k4(str, str2);
            }
        }
    }

    public C3187kk(Dictionary<String, String> dictionary) {
        this.f9469k4 = new Dictionary<>(dictionary, AbstractC14070jw.m66789to());
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13682k4(String[] strArr, String str) {
        String strM13681k4 = m13681k4(strArr);
        return strM13681k4 == null ? str : strM13681k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m13690kk(String str, String str2) {
        return m13682k4(new String[]{str}, str2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final void addItem(String str, String str2) {
        this.f9469k4.addItem(str, str2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(KeyValuePair<String, String> keyValuePair) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void addItem(KeyValuePair<String, String> keyValuePair) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(KeyValuePair<String, String> keyValuePair) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m13696x1(String str) {
        return this.f9469k4.removeItemByKey(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13684k4(String str, String str2) {
        this.f9469k4.addItem(str, str2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(KeyValuePair<String, String>[] keyValuePairArr, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(String str) {
        return this.f9469k4.containsKey(str);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final boolean tryGetValue(String str, Object[] objArr) {
        return m13688k4(str, (String[]) objArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13688k4(String str, String[] strArr) {
        return this.f9469k4.tryGetValue(str, strArr);
    }
}
