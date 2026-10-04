package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.on */
/* JADX INFO: loaded from: classes3.dex */
class C14244on extends AbstractC0906dm {

    /* JADX INFO: renamed from: k4 */
    private final List<C14244on> f47879k4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14244on(C14244on c14244on, SmartArtNode smartArtNode) {
        super(c14244on, smartArtNode.m2796k4());
        this.f47879k4 = new List<>();
        IGenericEnumerator<ISmartArtNode> it = smartArtNode.getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                SmartArtNode smartArtNode2 = (SmartArtNode) it.next();
                this.f47879k4.addItem(new C14244on(this, smartArtNode2.m2804x1()));
                this.f47879k4.addItem(new C14244on(this, smartArtNode2));
                this.f47879k4.addItem(new C14244on(this, smartArtNode2.m2801kk()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m68708h4(List<C14244on> list, int i) {
        C14244on c14244onMo5141fa = this;
        while (c14244onMo5141fa.mo5141fa() != null) {
            c14244onMo5141fa = c14244onMo5141fa.mo5141fa();
        }
        if (m68728k4(c14244onMo5141fa.m5149yj(), i)) {
            list.addItem(c14244onMo5141fa);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private List<C14244on> m68710k4(int i, int i2, int i3, int i4, int i5, boolean z) {
        List<C14244on> list = new List<>();
        switch (i) {
            case 1:
                m68711k4(list, i2);
                break;
            case 2:
                m68718x1(list, i2);
                break;
            case 3:
                m68714kk(list, i2);
                break;
            case 4:
                m68712k4(list, i2, z);
                break;
            case 5:
                m68719x1(list, i2, z);
                break;
            case 6:
                m68715kk(list, i2, z);
                break;
            case 7:
                m68717to(list, i2, z);
                break;
            case 8:
                m68716to(list, i2);
                break;
            case 9:
                m68707du(list, i2, z);
                break;
            case 10:
                m68706du(list, i2);
                break;
            case 11:
                m68708h4(list, i2);
                break;
            case 12:
                m68709h4(list, i2, z);
                break;
        }
        if (i3 == 0 && i4 == 1 && i5 == 1) {
            return list;
        }
        List<C14244on> list2 = new List<>();
        if (i3 == Integer.MAX_VALUE) {
            i3 = list.size();
        }
        if (i5 == 0) {
            i5 = 1;
        }
        if (i == 9 || i == 10 || i5 < 0 || i4 < 0) {
            if (i5 < 0) {
                i5 = -i5;
            }
            if (i4 < 0) {
                i4 = -i4;
            }
            int i6 = 0;
            for (int size = (list.size() - 1) - (i4 - 1); size >= 0 && i6 < i3; size -= i5) {
                if (size < list.size()) {
                    list2.addItem(list.get_Item(size));
                    i6++;
                }
            }
        } else {
            if (i5 <= 0) {
                i5 = 1;
            }
            if (i4 <= 0) {
                i4 = 1;
            }
            int i7 = i4 - 1;
            int i8 = i3 + i7;
            while (i7 < list.size() && i7 < i8) {
                if (i7 < list.size()) {
                    list2.addItem(list.get_Item(i7));
                }
                i7 += i5;
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: c5 */
    public final C14244on m68720c5() {
        if (m5149yj() == 3) {
            return this;
        }
        if (m5149yj() == 5) {
            return mo5141fa();
        }
        if (m5149yj() == 6) {
            return m68730m9();
        }
        return null;
    }

    @Override // com.aspose.slides.AbstractC0906dm
    /* JADX INFO: renamed from: ck */
    public List<AbstractC0906dm> mo4070ck() {
        List<AbstractC0906dm> list = new List<>(this.f47879k4.size());
        List.Enumerator<C14244on> it = this.f47879k4.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: du */
    public final int m68721du() {
        if (mo5141fa() == null) {
            return 1;
        }
        int i = 0;
        for (int size = mo5141fa().m68732x1().size() - 1; size >= 0; size--) {
            C14244on c14244on = mo5141fa().m68732x1().get_Item(size);
            if (c14244on.m5149yj() == m5149yj()) {
                i++;
            }
            if (c14244on == this) {
                return i;
            }
        }
        throw new InvalidOperationException("Invalid state of node. Node are not attached to parent");
    }

    /* JADX INFO: renamed from: dy */
    public final C14244on m68722dy() {
        return (C14244on) m5142ix();
    }

    /* JADX INFO: renamed from: jd */
    public final C14244on m68724jd() {
        if (m5149yj() == 3) {
            return this;
        }
        if (m5149yj() == 5) {
            return m68722dy();
        }
        if (m5149yj() != 6 || mo5141fa() == null) {
            return null;
        }
        for (int i = 0; i < mo5141fa().m68732x1().size(); i++) {
            if (i != mo5141fa().m68732x1().size() - 1 && mo5141fa().m68732x1().get_Item(i) == this) {
                int i2 = i + 2;
                if (mo5141fa().m68732x1().size() > i2) {
                    return mo5141fa().m68732x1().get_Item(i2);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final String m68729kk() {
        return m5147up().m71867k4() != null ? m5147up().m71867k4().m2901c5() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14244on m68730m9() {
        return (C14244on) m5145ne();
    }

    /* JADX INFO: renamed from: to */
    public final int m68731to() {
        if (mo5141fa() == null) {
            return 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < mo5141fa().m68732x1().size(); i2++) {
            C14244on c14244on = mo5141fa().m68732x1().get_Item(i2);
            if (c14244on.m5149yj() == m5149yj()) {
                i++;
            }
            if (c14244on == this) {
                return i;
            }
        }
        throw new InvalidOperationException("Invalid state of node. Node are not attached to parent");
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C14244on> m68732x1() {
        return this.f47879k4;
    }

    private C14244on(C14244on c14244on, C14648us c14648us) {
        super(c14244on, c14648us);
        this.f47879k4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    private void m68706du(List<C14244on> list, int i) {
        C14244on next;
        if (mo5141fa() != null) {
            List.Enumerator<C14244on> it = mo5141fa().m68732x1().iterator();
            while (it.hasNext() && (next = it.next()) != this) {
                try {
                    if (m68728k4(next.m5149yj(), i)) {
                        list.addItem(next);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m68709h4(List<C14244on> list, int i, boolean z) {
        if (m68728k4(m5149yj(), i)) {
            list.addItem(this);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m68714kk(List<C14244on> list, int i) {
        List.Enumerator<C14244on> it = m68732x1().iterator();
        while (it.hasNext()) {
            try {
                C14244on next = it.next();
                if (m68728k4(next.m5149yj(), i)) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m68716to(List<C14244on> list, int i) {
        if (mo5141fa() == null || !m68728k4(mo5141fa().m5149yj(), i)) {
            return;
        }
        list.addItem(mo5141fa());
    }

    /* JADX INFO: renamed from: x1 */
    private void m68718x1(List<C14244on> list, int i) {
        if (m68728k4(m5149yj(), i)) {
            list.addItem(this);
            m68711k4(list, i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14244on> m68725k4(C13719ka c13719ka, boolean z) {
        return m68726k4(c13719ka, z, 0, true);
    }

    /* JADX INFO: renamed from: du */
    private void m68707du(List<C14244on> list, int i, boolean z) {
        C14244on next;
        if (mo5141fa() != null) {
            List.Enumerator<C14244on> it = mo5141fa().m68732x1().iterator();
            while (it.hasNext() && (next = it.next()) != this) {
                try {
                    next.m68719x1(list, i, z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m68715kk(List<C14244on> list, int i, boolean z) {
        if (mo5141fa() != null) {
            List.Enumerator<C14244on> it = mo5141fa().m68732x1().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                try {
                    C14244on next = it.next();
                    if (z2) {
                        next.m68719x1(list, i, z);
                    } else if (next == this) {
                        z2 = true;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m68717to(List<C14244on> list, int i, boolean z) {
        int i2;
        boolean z2;
        if (mo5141fa() != null) {
            boolean z3 = false;
            int i3 = 0;
            while (i3 < mo5141fa().m68732x1().size()) {
                C14244on c14244on = mo5141fa().m68732x1().get_Item(i3);
                if (z3) {
                    i2 = i;
                    z2 = z;
                    if (m68713k4(c14244on, i2, i3, mo5141fa().m68732x1().size(), z2)) {
                        list.addItem(c14244on);
                    }
                } else {
                    i2 = i;
                    z2 = z;
                    if (c14244on == this) {
                        z3 = true;
                    }
                }
                i3++;
                i = i2;
                z = z2;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m68719x1(List<C14244on> list, int i, boolean z) {
        if (m68728k4(m5149yj(), i)) {
            list.addItem(this);
        }
        m68712k4(list, i, z);
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m68723h4() {
        if (mo5141fa() == null) {
            return true;
        }
        return mo5141fa().m68732x1().size() != 0 && mo5141fa().m68732x1().get_Item(mo5141fa().m68732x1().size() - 1) == this;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14244on> m68726k4(C13719ka c13719ka, boolean z, int i, boolean z2) {
        if (c13719ka.m63730k4().size() == 0) {
            return new List<>();
        }
        int iIntValue = (c13719ka.m63731kk().size() <= 0 || i >= c13719ka.m63731kk().size()) ? 1 : c13719ka.m63731kk().get_Item(i).intValue();
        int i2 = iIntValue == 0 ? 1 : iIntValue;
        int iIntValue2 = c13719ka.m63733x1().size() > i ? c13719ka.m63733x1().get_Item(i).intValue() : Integer.MAX_VALUE;
        List<C14244on> listM68710k4 = m68710k4(c13719ka.m63730k4().get_Item(i).intValue(), i2, iIntValue2 == 0 ? Integer.MAX_VALUE : iIntValue2, c13719ka.m63732to().size() > i ? c13719ka.m63732to().get_Item(i).intValue() : 1, c13719ka.m63728du().size() > i ? c13719ka.m63728du().get_Item(i).intValue() : 1, c13719ka.m63729h4().size() > i ? c13719ka.m63729h4().get_Item(i).booleanValue() && z : z);
        int i3 = i + 1;
        if (i3 == c13719ka.m63730k4().size() || !z2) {
            return listM68710k4;
        }
        List<C14244on> list = new List<>();
        List.Enumerator<C14244on> it = listM68710k4.iterator();
        while (it.hasNext()) {
            try {
                list.addRange(it.next().m68726k4(c13719ka, z, i3, z2));
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return list;
    }

    @Override // com.aspose.slides.AbstractC0906dm
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C14244on mo5141fa() {
        return (C14244on) super.mo5141fa();
    }

    /* JADX INFO: renamed from: k4 */
    private void m68711k4(List<C14244on> list, int i) {
        while (true) {
            C14244on c14244onMo5141fa = mo5141fa();
            if (c14244onMo5141fa == null) {
                return;
            }
            if (m68728k4(c14244onMo5141fa.m5149yj(), i)) {
                list.addItem(c14244onMo5141fa);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68712k4(List<C14244on> list, int i, boolean z) {
        int i2 = 0;
        while (i2 < m68732x1().size()) {
            C14244on c14244on = m68732x1().get_Item(i2);
            int i3 = i;
            boolean z2 = z;
            if (m68713k4(c14244on, i3, i2, m68732x1().size(), z2)) {
                list.addItem(c14244on);
            }
            c14244on.m68712k4(list, i3, z2);
            i2++;
            i = i3;
            z = z2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68728k4(int i, int i2) {
        switch (i2) {
            case 1:
                return true;
            case 2:
                return i == 3;
            case 3:
                return i == 1 || i == 2;
            case 4:
            case 5:
            default:
                return false;
            case 6:
                return i == 2;
            case 7:
                return i == 1;
            case 8:
                return i == 5;
            case 9:
                return i == 4;
            case 10:
                return i == 6;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68713k4(C14244on c14244on, int i, int i2, int i3, boolean z) {
        return m68728k4(c14244on.m5149yj(), i) && !(z && (i2 == i3 - 1 && c14244on.m5149yj() == 6));
    }
}
