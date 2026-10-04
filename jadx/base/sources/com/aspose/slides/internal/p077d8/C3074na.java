package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.na */
/* JADX INFO: loaded from: classes3.dex */
public class C3074na<Type1, Type2> {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Type1, Type2> f9131k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Type2, Type1> f9132x1 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public void m13009k4(Type1 type1, Type2 type2) {
        boolean zContainsKey = this.f9131k4.containsKey(type1);
        boolean zContainsKey2 = this.f9132x1.containsKey(type2);
        if (!zContainsKey) {
            this.f9131k4.set_Item(type1, type2);
        }
        if (zContainsKey2) {
            return;
        }
        this.f9132x1.set_Item(type2, type1);
    }

    /* JADX INFO: renamed from: kk */
    public Type1 m13011kk(Type2 type2) {
        Object[] objArr = {null};
        boolean zTryGetValue = this.f9132x1.tryGetValue(type2, objArr);
        Type1 type1 = (Type1) objArr[0];
        if (zTryGetValue) {
            return type1;
        }
        throw new IndexOutOfRangeException();
    }

    /* JADX INFO: renamed from: x1 */
    public Type2 m13012x1(Type1 type1) {
        Object[] objArr = {null};
        boolean zTryGetValue = this.f9131k4.tryGetValue(type1, objArr);
        Type2 type2 = (Type2) objArr[0];
        if (zTryGetValue) {
            return type2;
        }
        throw new IndexOutOfRangeException();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m13010k4(Type1 type1) {
        return this.f9131k4.containsKey(type1);
    }

    /* JADX INFO: renamed from: x1 */
    public Type2 m13013x1(Type1 type1, Type2 type2) {
        Object[] objArr = {null};
        return !this.f9131k4.tryGetValue(type1, objArr) ? type2 : (Type2) objArr[0];
    }
}
