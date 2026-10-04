package com.aspose.slides.internal.p295na;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p199j5.InterfaceC5195kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.na.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6793kk implements InterfaceC5195kk {

    /* JADX INFO: renamed from: k4 */
    private IGenericList<String> f18810k4;

    /* JADX INFO: renamed from: kk */
    private boolean f18811kk;

    /* JADX INFO: renamed from: to */
    private boolean f18812to;

    /* JADX INFO: renamed from: x1 */
    private IGenericList<KeyValuePair<String, String>> f18813x1;

    /* JADX INFO: renamed from: k4 */
    public static C6793kk m26865k4(IGenericEnumerable<String> iGenericEnumerable, String str) {
        return m26866k4(new C6793kk(), iGenericEnumerable, str);
    }

    /* JADX INFO: renamed from: x1 */
    public static C6793kk m26869x1(IGenericEnumerable<KeyValuePair<String, String>> iGenericEnumerable, String str) {
        return m26870x1(new C6793kk(), iGenericEnumerable, str);
    }

    /* JADX INFO: renamed from: k4 */
    public static C6793kk m26866k4(C6793kk c6793kk, IGenericEnumerable<String> iGenericEnumerable, String str) {
        List list = new List(iGenericEnumerable);
        c6793kk.f18810k4 = list;
        c6793kk.f18813x1 = null;
        c6793kk.f18811kk = list.containsItem(str);
        return c6793kk;
    }

    /* JADX INFO: renamed from: x1 */
    public static C6793kk m26870x1(C6793kk c6793kk, IGenericEnumerable<KeyValuePair<String, String>> iGenericEnumerable, String str) {
        c6793kk.f18810k4 = null;
        List list = new List(iGenericEnumerable);
        c6793kk.f18813x1 = list;
        c6793kk.f18812to = list.containsItem(new KeyValuePair(str, str));
        return c6793kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6793kk m26867k4(String str, String str2) {
        List list = new List();
        list.addItem(str);
        return m26865k4(list, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C6793kk m26868k4(String str, String str2, String str3) {
        List list = new List();
        list.addItem(new KeyValuePair(str, str2));
        return m26869x1(list, str3);
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5195kk
    /* JADX INFO: renamed from: k4 */
    public short mo22191k4(InterfaceC12777qq interfaceC12777qq) {
        IGenericList<String> iGenericList = this.f18810k4;
        if (iGenericList != null) {
            return (this.f18811kk || iGenericList.containsItem(interfaceC12777qq.mo22612m9())) ? (short) 1 : (short) 3;
        }
        return (this.f18812to || this.f18813x1.containsItem(new KeyValuePair(interfaceC12777qq.mo22634jd(), interfaceC12777qq.mo22604c5()).Clone())) ? (short) 1 : (short) 3;
    }
}
