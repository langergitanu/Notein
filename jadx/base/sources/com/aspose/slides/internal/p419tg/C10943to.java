package com.aspose.slides.internal.p419tg;

import com.aspose.slides.internal.p257ls.C6225du;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10943to {

    /* JADX INFO: renamed from: du */
    private int f38098du;

    /* JADX INFO: renamed from: k4 */
    private C10940kk f38099k4;

    /* JADX INFO: renamed from: kk */
    private C10945x1 f38100kk;

    /* JADX INFO: renamed from: to */
    private C10940kk f38101to;

    /* JADX INFO: renamed from: x1 */
    private C10940kk f38102x1;

    public C10943to() {
        this.f38102x1 = new C10940kk();
    }

    /* JADX INFO: renamed from: du */
    private boolean m52797du(C10945x1 c10945x1) {
        return m52804x1().m52789x1(c10945x1);
    }

    /* JADX INFO: renamed from: kk */
    private C10945x1 m52799kk(C10945x1 c10945x1) {
        for (C10945x1 c10945x12 : this.f38102x1) {
            if (m52798k4(c10945x1, c10945x12)) {
                return c10945x12;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    private C10945x1 m52800to(C10945x1 c10945x1) {
        if (c10945x1 == null) {
            this.f38098du = 65536;
            return null;
        }
        if (m52797du(c10945x1)) {
            return c10945x1;
        }
        for (C10945x1 c10945x12 : m52804x1()) {
            if (m52798k4(c10945x1, c10945x12)) {
                return c10945x12;
            }
        }
        if (c10945x1.m52840ne()) {
            this.f38098du = 32;
            return c10945x1;
        }
        this.f38098du = 65536;
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public int m52802k4() {
        return this.f38098du;
    }

    /* JADX INFO: renamed from: x1 */
    public C10940kk m52804x1() {
        C10940kk c10940kk = this.f38099k4;
        if (c10940kk != null) {
            return c10940kk;
        }
        C10940kk c10940kk2 = new C10940kk();
        this.f38099k4 = c10940kk2;
        c10940kk2.m52785k4(C10942m9.m52792du());
        return this.f38099k4;
    }

    public C10943to(C10940kk c10940kk) {
        this();
        C10940kk c10940kk2 = new C10940kk();
        this.f38101to = c10940kk2;
        c10940kk2.m52785k4(c10940kk);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m52801x1(C10945x1 c10945x1) {
        if (c10945x1.m52848x6()) {
            return true;
        }
        this.f38098du = 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[RETURN] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m52803k4(C10945x1 c10945x1) {
        C10945x1 c10945x1M52800to;
        C10940kk c10940kk;
        Iterator<T> it;
        this.f38098du = 0;
        C10940kk c10940kk2 = this.f38101to;
        if (c10940kk2 == null) {
            this.f38101to = new C10940kk();
            C10945x1 c10945x1M52799kk = c10945x1;
            C10945x1 c10945x12 = c10945x1M52799kk;
            while (c10945x1M52799kk != null && !c10945x1M52799kk.m52840ne()) {
                this.f38101to.m52783k4(c10945x1M52799kk);
                c10945x12 = c10945x1M52799kk;
                c10945x1M52799kk = m52799kk(c10945x1M52799kk);
            }
            c10945x1M52800to = m52800to(c10945x12);
        } else {
            int size = c10940kk2.size();
            if (size > 0) {
                if (m52798k4(c10945x1, this.f38101to.get_Item(0))) {
                    int i = 1;
                    while (i < size && m52798k4(this.f38101to.get_Item(i - 1), this.f38101to.get_Item(i))) {
                        i++;
                    }
                    if (i == size) {
                        c10945x1M52800to = m52800to(this.f38101to.get_Item(size - 1));
                    }
                }
                c10940kk = this.f38101to;
                if (c10940kk != null && this.f38098du == 0) {
                    it = c10940kk.iterator();
                    while (it.hasNext()) {
                        if (!m52801x1((C10945x1) it.next())) {
                            return false;
                        }
                    }
                    if (m52801x1(c10945x1)) {
                        if (this.f38098du == 2) {
                            this.f38098du = 1;
                        }
                        return false;
                    }
                    C10945x1 c10945x13 = this.f38100kk;
                    if (c10945x13 != null && !m52801x1(c10945x13)) {
                        return false;
                    }
                }
                return this.f38098du != 0;
            }
            c10945x1M52800to = m52800to(c10945x1);
        }
        this.f38100kk = c10945x1M52800to;
        c10940kk = this.f38101to;
        if (c10940kk != null) {
            it = c10940kk.iterator();
            while (it.hasNext()) {
            }
            if (m52801x1(c10945x1)) {
            }
        }
        if (this.f38098du != 0) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52798k4(C10945x1 c10945x1, C10945x1 c10945x12) {
        C10934du c10934duM52730x1;
        if (!C14113y2.m67447x1(c10945x1.m52842to(), c10945x12.m52843u4())) {
            return false;
        }
        if (c10945x12.m52841rv() > 2 && !m52797du(c10945x12) && ((c10934duM52730x1 = c10945x12.m52845x1().m52730x1("2.5.29.19")) == null || !new C6225du(c10934duM52730x1).m25216h4())) {
            this.f38098du = 1024;
        }
        if (c10945x1.m52847x1(c10945x12.m52826dy())) {
            return true;
        }
        this.f38098du = 8;
        return false;
    }
}
