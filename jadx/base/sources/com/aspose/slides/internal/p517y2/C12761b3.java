package com.aspose.slides.internal.p517y2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.y2.b3 */
/* JADX INFO: loaded from: classes5.dex */
public class C12761b3<T extends InterfaceC12777qq> implements InterfaceC12785wl {

    /* JADX INFO: renamed from: k4 */
    private List<T> f42540k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final short f42541x1;

    public C12761b3(short s) {
        this.f42541x1 = s;
    }

    /* JADX INFO: renamed from: du */
    public final T m59441du(T t) {
        this.f42540k4.addItem(t);
        mo22872x1(t);
        return t;
    }

    @Override // java.lang.Iterable
    public final IEnumerator iterator() {
        return this.f42540k4.iterator();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: k4 */
    public final int mo59443k4() {
        List<T> list = this.f42540k4;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: kk */
    public final InterfaceC12777qq mo59445kk(InterfaceC12777qq interfaceC12777qq) {
        if (interfaceC12777qq == null) {
            return null;
        }
        int iM59437k4 = m59437k4(interfaceC12777qq.mo22612m9());
        if (iM59437k4 != -1) {
            return m59439k4(iM59437k4, interfaceC12777qq);
        }
        m59441du(interfaceC12777qq);
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: to */
    public final InterfaceC12777qq mo59447to(InterfaceC12777qq interfaceC12777qq) {
        if (interfaceC12777qq == null) {
            return null;
        }
        int iM59438k4 = m59438k4(interfaceC12777qq.mo22604c5(), interfaceC12777qq.mo22634jd());
        if (iM59438k4 != -1) {
            return m59439k4(iM59438k4, interfaceC12777qq);
        }
        m59441du(interfaceC12777qq);
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final T m59450x1(int i) {
        T t = this.f42540k4.get_Item(i);
        this.f42540k4.removeAt(i);
        mo22870k4(t);
        return t;
    }

    /* JADX INFO: renamed from: k4 */
    private int m59437k4(String str) {
        int iMo59443k4 = mo59443k4();
        for (int i = 0; i < iMo59443k4; i++) {
            if (C14113y2.m67432to(this.f42540k4.get_Item(i).mo22612m9(), str, this.f42541x1)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    private T m59440x1(int i, T t) {
        this.f42540k4.insertItem(i, t);
        mo22872x1(t);
        return t;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: du */
    public final InterfaceC12777qq mo59442du(String str) {
        int iM59437k4 = m59437k4(str);
        if (iM59437k4 >= 0) {
            return m59450x1(iM59437k4);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: kk */
    public final InterfaceC12777qq mo59446kk(String str, String str2) {
        int iM59438k4 = m59438k4(str2, str);
        if (iM59438k4 >= 0) {
            return this.f42540k4.get_Item(iM59438k4);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: to */
    public final InterfaceC12777qq mo59448to(String str) {
        int iM59437k4 = m59437k4(str);
        if (iM59437k4 >= 0) {
            return this.f42540k4.get_Item(iM59437k4);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private int m59438k4(String str, String str2) {
        int iMo59443k4 = mo59443k4();
        for (int i = 0; i < iMo59443k4; i++) {
            T t = this.f42540k4.get_Item(i);
            if (C14113y2.m67432to(t.mo22604c5(), str, this.f42541x1) && (C18358t1.g.f56183c.equals(str2) || C14113y2.m67432to(t.mo22634jd(), str2, this.f42541x1))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: to */
    public final InterfaceC12777qq mo59449to(String str, String str2) {
        int iM59438k4 = m59438k4(str2, str);
        if (iM59438k4 >= 0) {
            return m59450x1(iM59438k4);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo22872x1(T t) {
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12785wl
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq mo59444k4(int i) {
        if (i < 0 || i >= this.f42540k4.size()) {
            return null;
        }
        return this.f42540k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    private T m59439k4(int i, T t) {
        T t2 = (T) m59450x1(i);
        m59440x1(i, t);
        mo22872x1(t);
        return t2;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22870k4(T t) {
    }
}
