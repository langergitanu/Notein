package com.aspose.slides.internal.p030av;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p253lm.C6124ck;
import com.aspose.slides.internal.p253lm.C6209y4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p326ou.C7144k4;
import com.aspose.slides.internal.p326ou.C7145x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.av.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1563k4 {

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<AbstractC14068j5, AbstractC1563k4> f6070k4;

    /* JADX INFO: renamed from: x1 */
    private static Object f6071x1 = new Object();

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<AbstractC14068j5, AbstractC1563k4> m8352k4() {
        if (f6070k4 == null) {
            synchronized (f6071x1) {
                try {
                    if (f6070k4 == null) {
                        Dictionary<AbstractC14068j5, AbstractC1563k4> dictionary = new Dictionary<>();
                        dictionary.addItem(C7019kk.m27443k4((Class<?>) C6209y4.class), new C7145x1());
                        dictionary.addItem(C7019kk.m27443k4((Class<?>) C6124ck.class), new C7144k4());
                        f6070k4 = dictionary;
                    }
                } finally {
                }
            }
        }
        return f6070k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo8354k4(int i);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC1563k4 m8353k4(AbstractC14068j5 abstractC14068j5) {
        if (m8352k4().containsKey(abstractC14068j5)) {
            return m8352k4().get_Item(abstractC14068j5);
        }
        throw new InvalidOperationException();
    }
}
