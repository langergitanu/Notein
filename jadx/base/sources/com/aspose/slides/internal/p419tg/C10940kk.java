package com.aspose.slides.internal.p419tg;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10940kk extends CollectionBase implements IEnumerable {
    public C10940kk() {
    }

    public boolean equals(Object obj) {
        return getInnerList().equals(obj);
    }

    public int hashCode() {
        return getInnerList().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.aspose.slides.Collections.ArrayList, org.json.JSONStringer] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.aspose.slides.Collections.IEnumerator, org.json.JSONStringer] */
    @Override // com.aspose.slides.Collections.CollectionBase, java.lang.Iterable
    public IEnumerator iterator() {
        return getInnerList().endObject();
    }

    /* JADX INFO: renamed from: k4 */
    public int m52783k4(C10945x1 c10945x1) {
        if (c10945x1 != null) {
            return getInnerList().addItem(c10945x1);
        }
        throw new ArgumentNullException("value");
    }

    /* JADX INFO: renamed from: kk */
    public int m52787kk(C10945x1 c10945x1) {
        if (c10945x1 == null) {
            throw new ArgumentNullException("value");
        }
        byte[] bArrM52837kk = c10945x1.m52837kk();
        for (int i = 0; i < getInnerList().size(); i++) {
            if (m52782k4(((C10945x1) getInnerList().get_Item(i)).m52837kk(), bArrM52837kk)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: to */
    public void m52788to(C10945x1 c10945x1) {
        getInnerList().removeItem(c10945x1);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m52789x1(C10945x1 c10945x1) {
        return m52787kk(c10945x1) != -1;
    }

    public C10940kk(C10940kk c10940kk) {
        m52785k4(c10940kk);
    }

    @Override // com.aspose.slides.Collections.CollectionBase, com.aspose.slides.Collections.IList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C10945x1 get_Item(int i) {
        return (C10945x1) getInnerList().get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m52785k4(C10940kk c10940kk) {
        if (c10940kk == null) {
            throw new ArgumentNullException("value");
        }
        for (int i = 0; i < c10940kk.getInnerList().size(); i++) {
            getInnerList().addItem(c10940kk.get_Item(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m52786k4(C10945x1[] c10945x1Arr, int i) {
        getInnerList().copyTo(AbstractC14092to.m67208k4((Object) c10945x1Arr), i);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52782k4(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
