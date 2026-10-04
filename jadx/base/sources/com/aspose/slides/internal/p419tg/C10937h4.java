package com.aspose.slides.internal.p419tg;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.h4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10937h4 extends CollectionBase implements IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private boolean f38047k4;

    public C10937h4() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.aspose.slides.Collections.ArrayList, org.json.JSONStringer] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.aspose.slides.Collections.IEnumerator, org.json.JSONStringer] */
    @Override // com.aspose.slides.Collections.CollectionBase, java.lang.Iterable
    public IEnumerator iterator() {
        return getInnerList().endObject();
    }

    /* JADX INFO: renamed from: k4 */
    public int m52728k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("oid");
        }
        for (int i = 0; i < getInnerList().size(); i++) {
            if (C14113y2.m67363du(((C10934du) getInnerList().get_Item(i)).m52722kk(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public C10934du m52730x1(String str) {
        int iM52728k4 = m52728k4(str);
        if (iM52728k4 == -1) {
            return null;
        }
        return (C10934du) getInnerList().get_Item(iM52728k4);
    }

    public C10937h4(C12842x1 c12842x1) {
        this();
        this.f38047k4 = true;
        if (c12842x1 == null) {
            return;
        }
        if (c12842x1.m59718x1() != 48) {
            throw new Exception("Invalid extensions format");
        }
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            getInnerList().addItem(new C10934du(c12842x1.m59710k4(i)));
        }
    }

    @Override // com.aspose.slides.Collections.CollectionBase, com.aspose.slides.Collections.IList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C10934du get_Item(int i) {
        return (C10934du) getInnerList().get_Item(i);
    }
}
