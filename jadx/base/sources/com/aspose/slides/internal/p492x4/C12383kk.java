package com.aspose.slides.internal.p492x4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.aspose.slides.internal.x4.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12383kk implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private List<String> f41374k4;

    /* JADX INFO: renamed from: kk */
    private Matcher f41375kk;

    /* JADX INFO: renamed from: to */
    private List<C12386x1> f41376to;

    /* JADX INFO: renamed from: x1 */
    private C12385to f41377x1;

    public C12383kk(C12385to c12385to, List<String> list) {
        this.f41377x1 = c12385to;
        this.f41374k4 = list;
        this.f41375kk = C12385to.m58001k4(c12385to);
    }

    /* JADX INFO: renamed from: kk */
    private List<C12386x1> m57997kk() {
        if (this.f41376to == null) {
            m57998x1();
        }
        return this.f41376to;
    }

    /* JADX INFO: renamed from: x1 */
    private void m57998x1() {
        int iM57999k4 = m57999k4();
        this.f41376to = new List<>(iM57999k4);
        for (int i = 0; i < iM57999k4; i++) {
            String strGroup = this.f41377x1.mo58006to() ? this.f41375kk.group(i) : null;
            if (strGroup == null) {
                this.f41376to.add(C12386x1.f41384kk);
            } else if (i >= this.f41374k4.size()) {
                this.f41376to.add(new C12386x1(strGroup, "", true));
            } else {
                this.f41376to.add(new C12386x1(strGroup, this.f41375kk.group(0), this.f41374k4.get(i), true, i));
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        m57997kk().copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return m57997kk();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return m57997kk().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public int m57999k4() {
        return this.f41375kk.groupCount() + 1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return m57999k4();
    }

    /* JADX INFO: renamed from: k4 */
    public C12386x1 m58000k4(int i) {
        return (i >= m57999k4() || i < 0) ? C12386x1.f41384kk : m57997kk().get(i);
    }
}
