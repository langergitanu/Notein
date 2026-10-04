package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1635kk<T> {

    /* JADX INFO: renamed from: k4 */
    private Class<T> f6314k4;

    /* JADX INFO: renamed from: x1 */
    private List<T> f6315x1;

    public C1635kk(Class<T> cls) {
        this.f6314k4 = cls;
        this.f6315x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8847k4() {
        return this.f6315x1.size();
    }

    /* JADX INFO: renamed from: kk */
    public final T m8849kk() {
        if (this.f6315x1.size() == 0) {
            return (T) C7019kk.m27467x1((Class) this.f6314k4);
        }
        T t = this.f6315x1.get_Item(0);
        this.f6315x1.removeAt(0);
        return t;
    }

    /* JADX INFO: renamed from: to */
    public final void m8850to() {
        this.f6315x1.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final T m8851x1() {
        if (this.f6315x1.size() == 0) {
            return (T) C7019kk.m27467x1((Class) this.f6314k4);
        }
        T t = (T) OooO0O0.OooO00o(this.f6315x1, 1);
        List<T> list = this.f6315x1;
        list.removeAt(list.size() - 1);
        return t;
    }

    public C1635kk(Class<T> cls, IGenericEnumerable<T> iGenericEnumerable) {
        this.f6314k4 = cls;
        this.f6315x1 = new List<>(iGenericEnumerable);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8848k4(T t) {
        this.f6315x1.addItem(t);
    }
}
