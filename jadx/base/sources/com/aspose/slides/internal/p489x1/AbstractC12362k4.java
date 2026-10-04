package com.aspose.slides.internal.p489x1;

import com.aspose.words.ControlChar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.x1.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12362k4 implements InterfaceC12359fa {

    /* JADX INFO: renamed from: k4 */
    protected List f41336k4;

    public AbstractC12362k4() {
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: c5 */
    public int mo57917c5() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: du */
    public int mo57919du() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: dy */
    public int mo57921dy() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: h4 */
    public InterfaceC12359fa mo57922h4() {
        return null;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: k4 */
    public int mo57925k4() {
        List list = this.f41336k4;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: kk */
    public void m57936kk(int i) {
        int iMo57925k4 = mo57925k4();
        while (i < iMo57925k4) {
            InterfaceC12359fa interfaceC12359faMo57926k4 = mo57926k4(i);
            interfaceC12359faMo57926k4.mo57931to(i);
            interfaceC12359faMo57926k4.mo57934x1(this);
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: m9 */
    public String mo57930m9() {
        List list = this.f41336k4;
        if (list == null || list.size() == 0) {
            return toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (!mo57928kk()) {
            stringBuffer.append("(");
            stringBuffer.append(toString());
            stringBuffer.append(ControlChar.SPACE_CHAR);
        }
        int i = 0;
        while (true) {
            List list2 = this.f41336k4;
            if (list2 == null || i >= list2.size()) {
                break;
            }
            InterfaceC12359fa interfaceC12359fa = (InterfaceC12359fa) this.f41336k4.get(i);
            if (i > 0) {
                stringBuffer.append(ControlChar.SPACE_CHAR);
            }
            stringBuffer.append(interfaceC12359fa.mo57930m9());
            i++;
        }
        if (!mo57928kk()) {
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: to */
    public void m57937to() {
        m57936kk(0);
    }

    public abstract String toString();

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: x1 */
    public Object mo57933x1(int i) {
        List list = this.f41336k4;
        if (list == null) {
            return null;
        }
        InterfaceC12359fa interfaceC12359fa = (InterfaceC12359fa) list.remove(i);
        m57936kk(i);
        return interfaceC12359fa;
    }

    public AbstractC12362k4(InterfaceC12359fa interfaceC12359fa) {
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: k4 */
    public InterfaceC12359fa mo57926k4(int i) {
        List list = this.f41336k4;
        if (list == null || i >= list.size()) {
            return null;
        }
        return (InterfaceC12359fa) this.f41336k4.get(i);
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: kk */
    public boolean mo57928kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: to */
    public void mo57931to(int i) {
    }

    /* JADX INFO: renamed from: x1 */
    public List m57938x1() {
        return new ArrayList();
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: k4 */
    public void mo57927k4(InterfaceC12359fa interfaceC12359fa) {
        if (interfaceC12359fa == null) {
            return;
        }
        AbstractC12362k4 abstractC12362k4 = (AbstractC12362k4) interfaceC12359fa;
        if (!abstractC12362k4.mo57928kk()) {
            if (this.f41336k4 == null) {
                this.f41336k4 = m57938x1();
            }
            this.f41336k4.add(interfaceC12359fa);
            abstractC12362k4.mo57934x1(this);
            abstractC12362k4.mo57931to(this.f41336k4.size() - 1);
            return;
        }
        List list = this.f41336k4;
        if (list != null && list == abstractC12362k4.f41336k4) {
            throw new RuntimeException("attempt to add child list to itself");
        }
        List list2 = abstractC12362k4.f41336k4;
        if (list2 != null) {
            if (list == null) {
                this.f41336k4 = list2;
                m57937to();
                return;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                InterfaceC12359fa interfaceC12359fa2 = (InterfaceC12359fa) abstractC12362k4.f41336k4.get(i);
                this.f41336k4.add(interfaceC12359fa2);
                interfaceC12359fa2.mo57934x1(this);
                interfaceC12359fa2.mo57931to(this.f41336k4.size() - 1);
            }
        }
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: x1 */
    public void mo57934x1(InterfaceC12359fa interfaceC12359fa) {
    }
}
