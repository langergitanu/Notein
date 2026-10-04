package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class tnt {

    /* JADX INFO: renamed from: k4 */
    private final List<d4u> f49167k4 = new List<>();

    /* JADX INFO: renamed from: k4 */
    private PortionFormat m71252k4(int i) {
        return (PortionFormat) C7019kk.m27452k4((Object) this.f49167k4.get_Item(i).m4948x1().getPortionFormat(), PortionFormat.class);
    }

    /* JADX INFO: renamed from: kk */
    private List<Portion> m71259kk() {
        List<Portion> list = new List<>();
        int i = 1;
        while (i < this.f49167k4.size()) {
            int i2 = i - 1;
            if (this.f49167k4.get_Item(i2).m4948x1() == this.f49167k4.get_Item(i).m4948x1()) {
                this.f49167k4.get_Item(i2).m4946k4(this.f49167k4.get_Item(i));
                this.f49167k4.removeAt(i);
                i--;
            }
            i++;
        }
        List.Enumerator<d4u> it = this.f49167k4.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().m4947kk());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private void m71260x1() {
        List.Enumerator<d4u> it = this.f49167k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m4948x1().setText("");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static tnt m71253k4(IParagraph iParagraph) {
        if (iParagraph == null) {
            throw new ArgumentNullException("paragraph");
        }
        tnt tntVar = new tnt();
        IGenericEnumerator<IPortion> it = iParagraph.getPortions().iterator();
        while (it.hasNext()) {
            try {
                tntVar.m71258k4(m71254k4(it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return tntVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71263x1(IParagraph iParagraph) {
        if (iParagraph == null) {
            throw new ArgumentNullException("paragraph");
        }
        List.Enumerator<Portion> it = m71259kk().iterator();
        while (it.hasNext()) {
            try {
                iParagraph.getPortions().add(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static tnt m71254k4(IPortion iPortion) {
        tnt tntVar = new tnt();
        for (int i = 0; i < iPortion.getText().length(); i++) {
            tntVar.m71257k4(new d4u(iPortion, iPortion.getText().charAt(i)));
        }
        tntVar.m71260x1();
        return tntVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m71261k4() {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<d4u> it = this.f49167k4.iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(it.next().m4945k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m71255k4(int i, int i2) {
        this.f49167k4.removeRange(i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71256k4(int i, tnt tntVar) {
        this.f49167k4.insertRange(i, tntVar.f49167k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71257k4(d4u d4uVar) {
        this.f49167k4.addItem(d4uVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71258k4(tnt tntVar) {
        this.f49167k4.addRange(tntVar.f49167k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m71262k4(String str, String str2, PortionFormat portionFormat) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("String to find can not be null or empty", "find");
        }
        if (str2 == null) {
            throw new ArgumentNullException("replace");
        }
        if (C14113y2.m67363du(str2, str)) {
            throw new ArgumentException("String to find can not be equal to string to replace");
        }
        int iM67364dy = C14113y2.m67364dy(m71261k4(), str);
        if (iM67364dy < 0) {
            return false;
        }
        if (portionFormat == null) {
            portionFormat = m71252k4(iM67364dy);
        }
        Portion portion = new Portion(str2);
        ((PortionFormat) portion.getPortionFormat()).m361k4((BasePortionFormat) C7019kk.m27452k4((Object) portionFormat, PortionFormat.class));
        m71255k4(iM67364dy, str.length());
        m71256k4(iM67364dy, m71254k4(portion));
        return true;
    }
}
