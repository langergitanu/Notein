package com.aspose.slides.internal.p342pq;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.pq.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C9480kk {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f34534k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC9479k4 f34535kk;

    /* JADX INFO: renamed from: x1 */
    private ArrayList f34536x1;

    /* JADX INFO: renamed from: k4 */
    public int m46664k4(String str) {
        return this.f34535kk.m46661k4(m46666k4(str, C7019kk.m27443k4((Class<?>) Integer.TYPE)));
    }

    /* JADX INFO: renamed from: x1 */
    public float m46671x1(String str) {
        return this.f34535kk.m46663x1(m46666k4(str, C7019kk.m27443k4((Class<?>) Float.TYPE)));
    }

    /* JADX INFO: renamed from: k4 */
    public C9481to m46665k4() {
        return new C9481to(this.f34536x1);
    }

    /* JADX INFO: renamed from: k4 */
    public Object m46666k4(String str, AbstractC14068j5 abstractC14068j5) {
        if (str == null) {
            throw new ArgumentNullException("name is null.");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException(C18437z2.f56754h);
        }
        if (!this.f34534k4.containsKey(str)) {
            throw new SerializationException(C14113y2.m67408k4("No element named ", str, " could be found."));
        }
        C9482x1 c9482x1M46677kk = ((C9482x1) this.f34534k4.get_Item(str)).Clone();
        return (c9482x1M46677kk.m46678x1() == null || abstractC14068j5.m66750k4(c9482x1M46677kk.m46678x1())) ? c9482x1M46677kk.m46678x1() : this.f34535kk.m46662k4(c9482x1M46677kk.m46678x1(), abstractC14068j5);
    }

    /* JADX INFO: renamed from: k4 */
    public void m46667k4(String str, float f) {
        m46670k4(str, Float.valueOf(f), C7019kk.m27443k4((Class<?>) Float.TYPE));
    }

    /* JADX INFO: renamed from: k4 */
    public void m46668k4(String str, int i) {
        m46670k4(str, Integer.valueOf(i), C7019kk.m27443k4((Class<?>) Integer.TYPE));
    }

    /* JADX INFO: renamed from: k4 */
    public void m46669k4(String str, Object obj) {
        m46670k4(str, obj, obj == null ? C7019kk.m27443k4((Class<?>) Object.class) : C14067j2.m66727k4(obj));
    }

    /* JADX INFO: renamed from: k4 */
    public void m46670k4(String str, Object obj, AbstractC14068j5 abstractC14068j5) {
        if (str == null) {
            throw new ArgumentNullException("name is null");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("type is null");
        }
        if (this.f34534k4.containsKey(str)) {
            throw new SerializationException("Value has been serialized already.");
        }
        C9482x1 c9482x1 = new C9482x1(str, abstractC14068j5, obj);
        this.f34534k4.addItem(str, c9482x1.Clone());
        this.f34536x1.addItem(c9482x1.Clone());
    }
}
