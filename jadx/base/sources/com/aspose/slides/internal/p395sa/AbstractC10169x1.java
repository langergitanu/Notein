package com.aspose.slides.internal.p395sa;

import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14115yd;

/* JADX INFO: renamed from: com.aspose.slides.internal.sa.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10169x1<T> {

    /* JADX INFO: renamed from: a */
    private final AbstractC14115yd f36594a;

    /* JADX INFO: renamed from: b */
    private final AbstractC14078m9 f36595b;

    /* JADX INFO: renamed from: c */
    private final Object f36596c;

    public AbstractC10169x1(AbstractC14115yd abstractC14115yd, AbstractC14078m9 abstractC14078m9, Object obj) {
        this.f36594a = abstractC14115yd;
        this.f36595b = abstractC14078m9;
        this.f36596c = obj;
    }

    public abstract void beginInvoke();

    public AbstractC14078m9 getCallback() {
        return this.f36595b;
    }

    public AbstractC14115yd getDelegate() {
        return this.f36594a;
    }

    public Object getState() {
        return this.f36596c;
    }
}
