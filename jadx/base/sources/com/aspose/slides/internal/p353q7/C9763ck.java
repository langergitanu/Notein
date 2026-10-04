package com.aspose.slides.internal.p353q7;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C9763ck extends AbstractC9804yj {

    /* JADX INFO: renamed from: k4 */
    private static final C9763ck f35275k4 = new C9763ck();

    private C9763ck() {
    }

    /* JADX INFO: renamed from: to */
    public static C9763ck m48030to() {
        return f35275k4;
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9804yj
    /* JADX INFO: renamed from: k4 */
    public C9790ts mo48031k4(String str, int i) {
        C9790ts c9790tsMo3692k4 = C9775k4.m48094x1().mo3692k4(str, i);
        return c9790tsMo3692k4 == null ? C9762c6.m48021k4().mo3692k4(str, i) : c9790tsMo3692k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C9790ts m48035kk() {
        return C9762c6.m48021k4().m48028x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48036x1() {
        C9775k4.m48094x1().m48095k4();
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9804yj
    /* JADX INFO: renamed from: k4 */
    public C9790ts mo48032k4(String str, int i, String str2) {
        C9790ts c9790tsMo3692k4 = C9775k4.m48094x1().mo3692k4(str, i);
        return c9790tsMo3692k4 == null ? C9762c6.m48021k4().m48025k4(str, i, str2) : c9790tsMo3692k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48033k4(String[] strArr, boolean z) {
        if (strArr == null) {
            throw new ArgumentNullException("fontsFolders");
        }
        C9775k4.m48094x1().m48063k4(z);
        for (String str : strArr) {
            C9775k4.m48094x1().m48096k4(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m48034k4() {
        String[] strArrM48058du = C9775k4.m48094x1().m48058du();
        String[] strArrM48058du2 = C9762c6.m48021k4().m48058du();
        String[] strArr = new String[strArrM48058du.length + strArrM48058du2.length];
        AbstractC14092to.m67208k4((Object) strArrM48058du).copyTo(AbstractC14092to.m67208k4((Object) strArr), 0);
        AbstractC14092to.m67208k4((Object) strArrM48058du2).copyTo(AbstractC14092to.m67208k4((Object) strArr), strArrM48058du.length);
        return strArr;
    }
}
