package com.aspose.slides.internal.p126fa;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.C9930to;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3909u4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public <T> IGenericList<T> m15599k4(IGenericList<T> iGenericList, Class<T> cls) {
        Object[] objArr = (Object[]) C22200OooO0o0.OooO00o(cls, 4);
        iGenericList.copyToTArray(objArr, 0);
        int size = iGenericList.size();
        if (size == 1) {
            Object obj = iGenericList.get_Item(0);
            objArr[3] = obj;
            objArr[2] = obj;
            objArr[1] = obj;
        } else if (size == 2) {
            objArr[2] = iGenericList.get_Item(0);
            objArr[3] = iGenericList.get_Item(1);
        } else if (size == 3) {
            objArr[3] = iGenericList.get_Item(1);
        }
        return AbstractC14092to.m67204k4(objArr);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9);

    /* JADX INFO: renamed from: k4 */
    public abstract String mo15583k4();

    /* JADX INFO: renamed from: kk */
    public final C9930to m15604kk(String str) {
        return C9919h4.m48822du(str);
    }

    /* JADX INFO: renamed from: kk */
    public abstract boolean mo15584kk();

    /* JADX INFO: renamed from: to */
    public abstract AbstractC5788h4 mo15585to();

    /* JADX INFO: renamed from: x1 */
    public abstract int mo15586x1();

    /* JADX INFO: renamed from: x1 */
    public final C9930to m15605x1(String str) {
        return C9919h4.m48829kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        return abstractC5788h4 == null ? mo15585to() : abstractC5788h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9930to m15600k4(InterfaceC9933up interfaceC9933up) {
        return C9919h4.m48829kk(interfaceC9933up.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final C9930to m15601k4(String str) {
        return C9919h4.m48833x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9930to m15602k4(short s) {
        return C9919h4.m48827k4(s);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m15603k4(AbstractC5788h4 abstractC5788h4) {
        return abstractC5788h4.m23417m9() == 1 && ((AbstractC5803to) abstractC5788h4).m23700k4() == 21;
    }
}
