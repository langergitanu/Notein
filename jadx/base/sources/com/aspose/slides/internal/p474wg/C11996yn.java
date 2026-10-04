package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.base.util.HttpUtils;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.yn */
/* JADX INFO: loaded from: classes5.dex */
public class C11996yn implements InterfaceC11968sv {

    /* JADX INFO: renamed from: k4 */
    private C14062gk f40482k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f40483kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC11926c6 f40484to;

    /* JADX INFO: renamed from: x1 */
    private boolean f40485x1;

    public C11996yn() {
        this(null, false, null, null);
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11968sv
    /* JADX INFO: renamed from: k4 */
    public InterfaceC11926c6 mo56111k4() {
        return this.f40484to;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56290x1() {
        if (this.f40483kk == null) {
            return;
        }
        for (int i = 0; i < this.f40483kk.size(); i++) {
            new C12380dy((String) this.f40483kk.get_Item(i));
        }
    }

    public C11996yn(C14062gk c14062gk) {
        this(c14062gk, false, null, null);
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11968sv
    /* JADX INFO: renamed from: k4 */
    public C14062gk mo56112k4(C14062gk c14062gk) {
        return mo56113x1(c14062gk) ? c14062gk : this.f40482k4;
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11968sv
    /* JADX INFO: renamed from: x1 */
    public boolean mo56113x1(C14062gk c14062gk) {
        if (c14062gk == null) {
            throw new ArgumentNullException("host");
        }
        if ((c14062gk.m66676c5() && this.f40485x1) || this.f40482k4 == null) {
            return true;
        }
        String strM66678du = c14062gk.m66678du();
        if (this.f40485x1 && strM66678du.indexOf(46) == -1) {
            return true;
        }
        if (!this.f40485x1) {
            if (C14113y2.m67383k4(strM66678du, "localhost", true, C11697x1.m55250kk()) == 0 || C14113y2.m67383k4(strM66678du, "loopback", true, C11697x1.m55250kk()) == 0) {
                return true;
            }
            C11972ts[] c11972tsArr = {null};
            if (C11972ts.m56134k4(strM66678du, c11972tsArr) && C11972ts.m56133k4(c11972tsArr[0])) {
                return true;
            }
        }
        ArrayList arrayList = this.f40483kk;
        if (arrayList != null && arrayList.size() != 0) {
            try {
                String str = c14062gk.m66689ks() + "://" + c14062gk.m66688kk();
                int i = 0;
                while (i < this.f40483kk.size() && !new C12380dy((String) this.f40483kk.get_Item(i), 66).m57988to(str)) {
                    i++;
                }
                if (i == this.f40483kk.size()) {
                    return false;
                }
                while (i < this.f40483kk.size()) {
                    new C12380dy((String) this.f40483kk.get_Item(i));
                    i++;
                }
                return true;
            } catch (ArgumentException unused) {
            }
        }
        return false;
    }

    public C11996yn(C14062gk c14062gk, boolean z, String[] strArr, InterfaceC11926c6 interfaceC11926c6) {
        this.f40482k4 = c14062gk;
        this.f40485x1 = z;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                arrayList.set_Item(i, strArr[i]);
            }
            this.f40483kk = arrayList;
        }
        this.f40484to = interfaceC11926c6;
        m56290x1();
    }

    public C11996yn(String str, int i) {
        this(new C14062gk(HttpUtils.HTTP_PREFIX + str + C18241k5.f55433h + i));
    }
}
