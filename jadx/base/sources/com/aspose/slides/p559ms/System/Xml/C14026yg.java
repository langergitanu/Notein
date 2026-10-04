package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.yg */
/* JADX INFO: loaded from: classes5.dex */
public class C14026yg extends AbstractC13911hq {

    /* JADX INFO: renamed from: to */
    private static final Object[] f47107to = new Object[0];

    /* JADX INFO: renamed from: k4 */
    private List<AbstractC13901ga> f47108k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private boolean f47109kk = false;

    /* JADX INFO: renamed from: x1 */
    private AbstractC10929m9 f47110x1;

    public C14026yg(AbstractC10929m9 abstractC10929m9) {
        this.f47110x1 = abstractC10929m9;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq, java.lang.Iterable
    public IEnumerator iterator() {
        return new C14034z7(this);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public int mo23932k4() {
        if (!this.f47109kk) {
            m66351x1(Integer.MAX_VALUE);
        }
        return this.f47108k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m66351x1(int i) {
        int size = this.f47108k4.size();
        while (true) {
            if (!this.f47109kk && size <= i) {
                if (!this.f47110x1.mo21770x1()) {
                    this.f47109kk = true;
                    break;
                }
                AbstractC13901ga abstractC13901gaM66350k4 = m66350k4(this.f47110x1.mo21834kk());
                if (abstractC13901gaM66350k4 != null) {
                    this.f47108k4.addItem(abstractC13901gaM66350k4);
                    size++;
                }
            } else {
                break;
            }
        }
        return size;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo23933k4(int i) {
        if (this.f47108k4.size() <= i) {
            m66351x1(i);
        }
        if (i < 0 || this.f47108k4.size() <= i) {
            return null;
        }
        return this.f47108k4.get_Item(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga m66350k4(AbstractC10925du abstractC10925du) {
        return ((InterfaceC13903gi) abstractC10925du).mo65354wl();
    }
}
