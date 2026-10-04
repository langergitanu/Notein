package com.aspose.slides.internal.p087dm;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.dm.to */
/* JADX INFO: loaded from: classes3.dex */
public class C3189to implements IGenericEnumerable<KeyValuePair<Integer, C3181c5>> {

    /* JADX INFO: renamed from: k4 */
    private SortedDictionary<Integer, C3181c5> f9473k4 = new SortedDictionary<>(new C3190x1());

    /* JADX INFO: renamed from: x1 */
    private final C3181c5 f9474x1;

    public C3189to(C3181c5 c3181c5) {
        this.f9474x1 = c3181c5;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<Integer, C3181c5>> iterator() {
        return this.f9473k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m13697k4() {
        return this.f9473k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public final void m13701kk(int i, C3181c5 c3181c5) {
        this.f9473k4.set_Item(Integer.valueOf(i), c3181c5);
    }

    /* JADX INFO: renamed from: x1 */
    public final C3181c5 m13702x1(int i) {
        return this.f9473k4.get_Item(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13698k4(int i) {
        if (i < 0 || i > this.f9473k4.size() - 1) {
            throw new IndexOutOfRangeException();
        }
        SortedDictionary sortedDictionary = new SortedDictionary(this.f9473k4);
        this.f9473k4.clear();
        for (int i2 = 0; i2 < sortedDictionary.size(); i2++) {
            if (i2 != i) {
                m13700k4((C3181c5) sortedDictionary.get_Item(Integer.valueOf(i2)));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13703x1(int i, C3181c5 c3181c5) {
        if (i < 0 || i > this.f9473k4.size()) {
            throw new IndexOutOfRangeException();
        }
        SortedDictionary sortedDictionary = new SortedDictionary(this.f9473k4);
        this.f9473k4.clear();
        for (int i2 = 0; i2 < i; i2++) {
            m13700k4((C3181c5) sortedDictionary.get_Item(Integer.valueOf(i2)));
        }
        m13700k4(c3181c5);
        while (i < sortedDictionary.size()) {
            m13700k4((C3181c5) sortedDictionary.get_Item(Integer.valueOf(i)));
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13699k4(int i, C3181c5 c3181c5) {
        c3181c5.f9457k4 = this.f9474x1;
        this.f9473k4.addItem(Integer.valueOf(i), c3181c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13700k4(C3181c5 c3181c5) {
        c3181c5.f9457k4 = this.f9474x1;
        SortedDictionary<Integer, C3181c5> sortedDictionary = this.f9473k4;
        sortedDictionary.addItem(Integer.valueOf(sortedDictionary.size()), c3181c5);
    }
}
