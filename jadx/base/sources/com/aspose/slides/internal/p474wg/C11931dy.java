package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C11931dy implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    static k4 f40207k4 = new k4();

    /* JADX INFO: renamed from: x1 */
    private List<C11955m9> f40208x1 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.dy$k4 */
    public static final class k4 implements Comparator<C11955m9> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public int compare(C11955m9 c11955m9, C11955m9 c11955m92) {
            if (c11955m9 == null || c11955m92 == null) {
                return 0;
            }
            int length = (c11955m92.m56071to().length() - (c11955m92.m56071to().charAt(0) == '.' ? 1 : 0)) - (c11955m9.m56071to().length() - (c11955m9.m56071to().charAt(0) == '.' ? 1 : 0));
            return length == 0 ? c11955m92.m56057jd().length() - c11955m9.m56057jd().length() : length;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m55922x1(C11955m9 c11955m9) {
        String strM56049c5 = c11955m9.m56049c5();
        String strM56071to = c11955m9.m56071to();
        String strM56057jd = c11955m9.m56057jd();
        for (int size = this.f40208x1.size() - 1; size >= 0; size--) {
            C11955m9 c11955m92 = this.f40208x1.get_Item(size);
            if (c11955m92.m56070rv() == c11955m9.m56070rv() && C14113y2.m67383k4(strM56071to, c11955m92.m56071to(), true, C11697x1.m55250kk()) == 0 && C14113y2.m67383k4(strM56049c5, c11955m92.m56049c5(), true, C11697x1.m55250kk()) == 0 && C14113y2.m67383k4(strM56057jd, c11955m92.m56057jd(), true, C11697x1.m55250kk()) == 0) {
                return size;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        ((IList) C7019kk.m27452k4((Object) this.f40208x1, IList.class)).copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return this.f40208x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public IGenericList<C11955m9> m55923k4() {
        return this.f40208x1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f40208x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public C11955m9 m55924k4(int i) {
        if (i < 0 || i >= this.f40208x1.size()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        return this.f40208x1.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55926x1() {
        if (this.f40208x1.size() > 0) {
            this.f40208x1.sort(f40207k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55925k4(C11955m9 c11955m9) {
        if (c11955m9 == null) {
            throw new ArgumentNullException("cookie");
        }
        int iM55922x1 = m55922x1(c11955m9);
        if (iM55922x1 == -1) {
            this.f40208x1.addItem(c11955m9);
        } else {
            this.f40208x1.set_Item(iM55922x1, c11955m9);
        }
    }
}
