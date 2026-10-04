package com.aspose.slides.internal.p489x1;

import com.aspose.slides.internal.p217k4.C5598um;
import com.aspose.slides.internal.p217k4.InterfaceC5578b3;
import com.aspose.slides.internal.p217k4.InterfaceC5591lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.x1.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12367x1 implements InterfaceC12366up {

    /* JADX INFO: renamed from: k4 */
    protected int f41346k4 = 1;

    /* JADX INFO: renamed from: du */
    public int mo57905du(Object obj) {
        return ((InterfaceC12359fa) obj).mo57925k4();
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: k4 */
    public Object mo57940k4() {
        return mo57908k4((InterfaceC5591lr) null);
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: kk */
    public int mo57911kk(Object obj) {
        return ((InterfaceC12359fa) obj).mo57924jd();
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: to */
    public String mo57913to(Object obj) {
        return ((InterfaceC12359fa) obj).mo57918ck();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract InterfaceC5591lr mo57915x1(int i, String str);

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: x1 */
    public Object mo57945x1(Object obj) {
        InterfaceC12359fa interfaceC12359fa = (InterfaceC12359fa) obj;
        if (interfaceC12359fa == null || !interfaceC12359fa.mo57928kk()) {
            return interfaceC12359fa;
        }
        if (interfaceC12359fa.mo57925k4() == 0) {
            return null;
        }
        if (interfaceC12359fa.mo57925k4() != 1) {
            return interfaceC12359fa;
        }
        InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(0);
        interfaceC12359faMo57926k4.mo57934x1((InterfaceC12359fa) null);
        interfaceC12359faMo57926k4.mo57931to(-1);
        return interfaceC12359faMo57926k4;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: k4 */
    public Object mo57941k4(int i, String str) {
        return (InterfaceC12359fa) mo57908k4(mo57915x1(i, str));
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: kk */
    public Object mo57944kk(Object obj, Object obj2) {
        InterfaceC12359fa interfaceC12359faMo57926k4 = (InterfaceC12359fa) obj;
        InterfaceC12359fa interfaceC12359fa = (InterfaceC12359fa) obj2;
        if (obj2 == null) {
            return obj;
        }
        if (interfaceC12359faMo57926k4.mo57928kk()) {
            int iMo57925k4 = interfaceC12359faMo57926k4.mo57925k4();
            if (iMo57925k4 == 1) {
                interfaceC12359faMo57926k4 = interfaceC12359faMo57926k4.mo57926k4(0);
            } else if (iMo57925k4 > 1) {
                throw new RuntimeException("more than one node as root (TODO: make exception hierarchy)");
            }
        }
        interfaceC12359faMo57926k4.mo57927k4(interfaceC12359fa);
        return interfaceC12359faMo57926k4;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: x1 */
    public void mo57946x1(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return;
        }
        ((InterfaceC12359fa) obj).mo57927k4((InterfaceC12359fa) obj2);
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: k4 */
    public Object mo57942k4(InterfaceC5578b3 interfaceC5578b3, InterfaceC5591lr interfaceC5591lr, InterfaceC5591lr interfaceC5591lr2, C5598um c5598um) {
        return new C12363kk(interfaceC5578b3, interfaceC5591lr, interfaceC5591lr2, c5598um);
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12366up
    /* JADX INFO: renamed from: k4 */
    public Object mo57943k4(Object obj) {
        return m57947k4(obj, (Object) null);
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo57909k4(Object obj, int i) {
        return ((InterfaceC12359fa) obj).mo57926k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public Object m57947k4(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        Object objMo57907h4 = mo57907h4(obj);
        mo57916x1(objMo57907h4, mo57906dy(obj));
        mo57914to(objMo57907h4, obj2);
        int iMo57905du = mo57905du(obj);
        for (int i = 0; i < iMo57905du; i++) {
            mo57946x1(objMo57907h4, m57947k4(mo57909k4(obj, i), obj));
        }
        return objMo57907h4;
    }
}
