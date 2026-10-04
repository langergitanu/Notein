package com.aspose.slides.internal.p217k4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.jd */
/* JADX INFO: loaded from: classes.dex */
public class C5587jd implements InterfaceC5578b3 {

    /* JADX INFO: renamed from: du */
    protected int f15393du;

    /* JADX INFO: renamed from: dy */
    protected int f15394dy;

    /* JADX INFO: renamed from: h4 */
    protected boolean f15395h4;

    /* JADX INFO: renamed from: k4 */
    protected InterfaceC5606yd f15396k4;

    /* JADX INFO: renamed from: kk */
    protected Map f15397kk;

    /* JADX INFO: renamed from: m9 */
    protected int f15398m9;

    /* JADX INFO: renamed from: to */
    protected Set f15399to;

    /* JADX INFO: renamed from: x1 */
    protected List f15400x1;

    public C5587jd() {
        this.f15393du = 0;
        this.f15395h4 = false;
        this.f15394dy = -1;
        this.f15400x1 = new ArrayList(500);
    }

    /* JADX INFO: renamed from: du */
    public int m22948du(int i) {
        while (i >= 0 && ((InterfaceC5591lr) this.f15400x1.get(i)).mo22912du() != this.f15393du) {
            i--;
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5578b3
    /* JADX INFO: renamed from: dy */
    public InterfaceC5591lr mo22908dy(int i) {
        return (InterfaceC5591lr) this.f15400x1.get(i);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5578b3
    /* JADX INFO: renamed from: h4 */
    public InterfaceC5591lr mo22909h4(int i) {
        if (this.f15394dy == -1) {
            m22950h4();
        }
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m22955m9(-i);
        }
        if ((this.f15394dy + i) - 1 >= this.f15400x1.size()) {
            return InterfaceC5591lr.f15412jd;
        }
        int iM22954kk = this.f15394dy;
        for (int i2 = 1; i2 < i; i2++) {
            iM22954kk = m22954kk(iM22954kk + 1);
        }
        return iM22954kk >= this.f15400x1.size() ? InterfaceC5591lr.f15412jd : (InterfaceC5591lr) this.f15400x1.get(iM22954kk);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: k4 */
    public int mo22951k4(int i) {
        return mo22909h4(i).mo22915k4();
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: kk */
    public int mo22953kk() {
        return this.f15400x1.size();
    }

    /* JADX INFO: renamed from: m9 */
    public InterfaceC5591lr m22955m9(int i) {
        if (this.f15394dy == -1) {
            m22950h4();
        }
        if (i == 0) {
            return null;
        }
        int iM22948du = this.f15394dy;
        if (iM22948du - i < 0) {
            return null;
        }
        for (int i2 = 1; i2 <= i; i2++) {
            iM22948du = m22948du(iM22948du - 1);
        }
        if (iM22948du < 0) {
            return null;
        }
        return (InterfaceC5591lr) this.f15400x1.get(iM22948du);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: to */
    public int mo22956to() {
        if (this.f15394dy == -1) {
            m22950h4();
        }
        int iMo22958x1 = mo22958x1();
        this.f15398m9 = iMo22958x1;
        return iMo22958x1;
    }

    public String toString() {
        if (this.f15394dy == -1) {
            m22950h4();
        }
        return mo22910k4(0, this.f15400x1.size() - 1);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: x1 */
    public int mo22958x1() {
        return this.f15394dy;
    }

    public C5587jd(InterfaceC5606yd interfaceC5606yd) {
        this();
        this.f15396k4 = interfaceC5606yd;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: du */
    public void mo22949du() {
        mo22957to(this.f15398m9);
    }

    /* JADX INFO: renamed from: h4 */
    public void m22950h4() {
        Integer num;
        InterfaceC5591lr interfaceC5591lrMo22339m9 = this.f15396k4.mo22339m9();
        int i = 0;
        while (interfaceC5591lrMo22339m9 != null && interfaceC5591lrMo22339m9.mo22915k4() != -1) {
            Map map = this.f15397kk;
            if (map != null && (num = (Integer) map.get(new Integer(interfaceC5591lrMo22339m9.mo22915k4()))) != null) {
                interfaceC5591lrMo22339m9.mo22920kk(num.intValue());
            }
            Set set = this.f15399to;
            if ((set == null || !set.contains(new Integer(interfaceC5591lrMo22339m9.mo22915k4()))) && (!this.f15395h4 || interfaceC5591lrMo22339m9.mo22912du() == this.f15393du)) {
                interfaceC5591lrMo22339m9.mo22913du(i);
                this.f15400x1.add(interfaceC5591lrMo22339m9);
                i++;
            }
            interfaceC5591lrMo22339m9 = this.f15396k4.mo22339m9();
        }
        this.f15394dy = 0;
        this.f15394dy = m22954kk(0);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5578b3
    /* JADX INFO: renamed from: k4 */
    public String mo22910k4(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (this.f15394dy == -1) {
            m22950h4();
        }
        if (i2 >= this.f15400x1.size()) {
            i2 = this.f15400x1.size() - 1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (i <= i2) {
            stringBuffer.append(((InterfaceC5591lr) this.f15400x1.get(i)).mo22924x1());
            i++;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: kk */
    public int m22954kk(int i) {
        int size = this.f15400x1.size();
        while (i < size && ((InterfaceC5591lr) this.f15400x1.get(i)).mo22912du() != this.f15393du) {
            i++;
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: to */
    public void mo22957to(int i) {
        this.f15394dy = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: x1 */
    public void mo22959x1(int i) {
        mo22957to(i);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5578b3
    /* JADX INFO: renamed from: k4 */
    public String mo22911k4(InterfaceC5591lr interfaceC5591lr, InterfaceC5591lr interfaceC5591lr2) {
        if (interfaceC5591lr == null || interfaceC5591lr2 == null) {
            return null;
        }
        return mo22910k4(interfaceC5591lr.mo22914h4(), interfaceC5591lr2.mo22914h4());
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: k4 */
    public void mo22952k4() {
        if (this.f15394dy < this.f15400x1.size()) {
            int i = this.f15394dy + 1;
            this.f15394dy = i;
            this.f15394dy = m22954kk(i);
        }
    }
}
