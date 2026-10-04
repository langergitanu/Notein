package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

/* JADX INFO: loaded from: classes3.dex */
public class ControlPropertiesCollection implements IControlPropertiesCollection {

    /* JADX INFO: renamed from: k4 */
    Dictionary<String, String> f2065k4 = new Dictionary<>();

    @Override // com.aspose.slides.IControlPropertiesCollection
    public final void add(String str, String str2) {
        this.f2065k4.addItem(str, str2);
    }

    @Override // com.aspose.slides.IControlPropertiesCollection
    public final void clear() {
        this.f2065k4.clear();
    }

    @Override // com.aspose.slides.IControlPropertiesCollection
    public final int getCount() {
        return this.f2065k4.size();
    }

    @Override // com.aspose.slides.IControlPropertiesCollection
    public com.aspose.slides.Collections.Generic.IGenericCollection<String> getNamesOfProperties() {
        return this.f2065k4.getKeys();
    }

    @Override // com.aspose.slides.IControlPropertiesCollection
    public final String get_Item(String str) {
        String[] strArr = {null};
        this.f2065k4.tryGetValue(str, strArr);
        return strArr[0];
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, String>> iterator() {
        return this.f2065k4.iterator();
    }

    public final IGenericEnumerator<KeyValuePair<String, String>> iteratorJava() {
        return this.f2065k4.iteratorJava();
    }

    @Override // com.aspose.slides.IControlPropertiesCollection
    public final void remove(String str) {
        this.f2065k4.removeItemByKey(str);
    }

    @Override // com.aspose.slides.IControlPropertiesCollection
    public final void set_Item(String str, String str2) {
        this.f2065k4.set_Item(str, str2);
    }
}
