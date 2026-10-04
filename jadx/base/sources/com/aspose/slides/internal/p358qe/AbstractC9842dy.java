package com.aspose.slides.internal.p358qe;

import com.aspose.slides.internal.p463vm.C11697x1;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.dy */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9842dy extends AbstractC9849m9 {
    /* JADX INFO: renamed from: c5 */
    public abstract Type mo48524c5();

    /* JADX INFO: renamed from: ck */
    public int mo48525ck() {
        return 1;
    }

    /* JADX INFO: renamed from: dy */
    public abstract Type[] mo48526dy();

    /* JADX INFO: renamed from: fa */
    public boolean m48527fa() {
        return (mo48529jd() & 7) == 6;
    }

    /* JADX INFO: renamed from: h4 */
    public C9845jd[] mo48528h4() {
        return mo48533m9();
    }

    /* JADX INFO: renamed from: jd */
    public abstract int mo48529jd();

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo48530k4(Object obj, int i, AbstractC9853x1 abstractC9853x1, Object[] objArr, C11697x1 c11697x1);

    /* JADX INFO: renamed from: k4 */
    public Object m48531k4(Object obj, Object[] objArr) {
        return mo48530k4(obj, 0, null, objArr, null);
    }

    /* JADX INFO: renamed from: ks */
    public boolean m48532ks() {
        return (mo48529jd() & 1024) != 0;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract C9845jd[] mo48533m9();

    /* JADX INFO: renamed from: rv */
    public boolean m48534rv() {
        return (mo48529jd() & 2048) != 0;
    }

    /* JADX INFO: renamed from: up */
    public boolean m48535up() {
        return (mo48529jd() & 16) != 0;
    }

    /* JADX INFO: renamed from: yj */
    public boolean m48536yj() {
        return (mo48529jd() & 64) != 0;
    }
}
