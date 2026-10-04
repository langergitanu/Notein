package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p125f9.C3892x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p393s7.C10152dy;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p393s7.InterfaceC10153fa;
import com.aspose.slides.internal.p393s7.InterfaceC10160rv;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.ne */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11090ne extends AbstractC11080du {

    /* JADX INFO: renamed from: ck */
    protected C10159m9 f38417ck;

    /* JADX INFO: renamed from: fa */
    protected InterfaceC10160rv f38418fa;

    /* JADX INFO: renamed from: up */
    protected List<Object> f38419up;

    public AbstractC11090ne(C12814to c12814to) {
        super(c12814to);
        this.f38418fa = null;
        this.f38419up = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10161to m53579k4(C1606x1 c1606x1) {
        C10155jd c10155jd = (C10155jd) c1606x1.m8655du(3);
        return this.f38417ck.m49955k4(c10155jd, ((Integer) C7019kk.m27464to(c1606x1.m8655du(4), Integer.TYPE)).intValue(), c10155jd.m49936du());
    }

    /* JADX INFO: renamed from: kk */
    public final void m53581kk(List<Object> list) {
        this.f38419up = list;
    }

    /* JADX INFO: renamed from: ks */
    public final C10159m9 m53582ks() {
        return this.f38417ck;
    }

    /* JADX INFO: renamed from: up */
    public final C11096uz m53583up() {
        return new C11096uz(this, mo22102dy());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53584x1(List<Object> list) {
        List<Object> list2 = this.f38419up;
        if (list2 == null) {
            m53581kk(list);
        } else {
            list2.addRange(list);
        }
    }

    /* JADX INFO: renamed from: yj */
    public final InterfaceC10160rv m53585yj() {
        if (this.f38418fa == null) {
            this.f38418fa = new C11081dy(this.f38413x1);
        }
        return this.f38418fa;
    }

    /* JADX INFO: renamed from: k4 */
    public C11096uz mo22106k4(int i, int i2, int i3, int i4, Dictionary<C9892x1, String> dictionary) {
        C11096uz c11096uzM53583up = m53583up();
        c11096uzM53583up.m53618k4(this.f38413x1);
        c11096uzM53583up.m53619k4("width", Integer.valueOf(i3));
        c11096uzM53583up.m53619k4("height", Integer.valueOf(i4));
        c11096uzM53583up.m53619k4("xpos", Integer.valueOf(i));
        c11096uzM53583up.m53619k4("ypos", Integer.valueOf(i2));
        c11096uzM53583up.m53619k4("pageViewport", m53544ck());
        if (dictionary != null) {
            c11096uzM53583up.m53619k4("foreign-attributes", dictionary);
        }
        return c11096uzM53583up;
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: k4 */
    public void mo22118k4(C10159m9 c10159m9) {
        this.f38417ck = c10159m9;
        C10152dy c10152dyM59531ix = this.f38413x1.m59556du().m59531ix();
        c10152dyM59531ix.m49931k4(m53582ks(), new InterfaceC10153fa[]{new C3892x1(c10152dyM59531ix.m49932k4())});
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53580k4(XmlDocument xmlDocument, String str, C12007ix c12007ix, Dictionary<C9892x1, String> dictionary) {
        m53558k4(mo22106k4(C7019kk.m27462to(Float.valueOf(c12007ix.m56557jd()), 13) + this.f38412to, C7019kk.m27462to(Float.valueOf(c12007ix.m56551ck()), 13) + this.f38410kk.m53612k4(), C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13), dictionary), xmlDocument, str);
    }
}
