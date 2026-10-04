package com.aspose.slides.internal.p368qq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p065ck.AbstractC2566ca;
import com.aspose.slides.internal.p065ck.InterfaceC2563bz;
import com.aspose.slides.internal.p096dy.InterfaceC3506x1;
import com.aspose.slides.internal.p126fa.AbstractC3909u4;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5777bv;
import com.aspose.slides.internal.p231kk.InterfaceC5781ck;
import com.aspose.slides.internal.p231kk.InterfaceC5789ix;
import com.aspose.slides.internal.p231kk.InterfaceC5795lr;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5814x6;
import com.aspose.slides.internal.p270m9.AbstractC6355x1;
import com.aspose.slides.internal.p270m9.C6332c5;
import com.aspose.slides.internal.p270m9.C6333ck;
import com.aspose.slides.internal.p270m9.C6336fa;
import com.aspose.slides.internal.p270m9.C6337h4;
import com.aspose.slides.internal.p270m9.C6339jd;
import com.aspose.slides.internal.p270m9.C6342ks;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p270m9.C6345ne;
import com.aspose.slides.internal.p270m9.C6350um;
import com.aspose.slides.internal.p270m9.C6356x6;
import com.aspose.slides.internal.p270m9.C6358yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9937x1 implements InterfaceC9924ks {

    /* JADX INFO: renamed from: du */
    private InterfaceC9940yj f35820du;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC12777qq f35821h4;

    /* JADX INFO: renamed from: k4 */
    private Stack<InterfaceC5797ne> f35822k4 = new Stack<>();

    /* JADX INFO: renamed from: kk */
    private AbstractC6355x1 f35823kk;

    /* JADX INFO: renamed from: to */
    private C6344m9 f35824to;

    /* JADX INFO: renamed from: x1 */
    private C6345ne f35825x1;

    public C9937x1(InterfaceC9940yj interfaceC9940yj, C6344m9 c6344m9, InterfaceC12777qq interfaceC12777qq) {
        this.f35820du = interfaceC9940yj;
        this.f35824to = c6344m9;
        this.f35821h4 = interfaceC12777qq;
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: du */
    public final void mo48855du() {
        m48879k4(this.f35820du.mo48817k4().m26033k4((short) 1, this.f35825x1, m48880x1()));
        this.f35823kk = (AbstractC6355x1) ((C6356x6) m48880x1()).mo23686h4();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: dy */
    public final void mo48856dy() {
        InterfaceC5814x6 interfaceC5814x6 = (InterfaceC5814x6) this.f35820du.mo48817k4().m26033k4((short) 6, this.f35825x1, m48880x1());
        this.f35823kk = (AbstractC6355x1) interfaceC5814x6.mo23711h4();
        m48879k4(interfaceC5814x6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo48857h4() {
        InterfaceC5789ix interfaceC5789ixMo23688h4;
        InterfaceC5797ne interfaceC5797nePop = this.f35822k4.pop();
        if (this.f35822k4.size() != 0) {
            InterfaceC5797ne interfaceC5797neM48880x1 = m48880x1();
            if (interfaceC5797neM48880x1.mo23403k4() == 4) {
                interfaceC5789ixMo23688h4 = ((C6333ck) interfaceC5797neM48880x1).mo23688h4();
            }
            if (interfaceC5797nePop.mo23403k4() != 1) {
                this.f35823kk = null;
                return;
            }
            return;
        }
        interfaceC5789ixMo23688h4 = this.f35825x1.mo23390x1();
        ((C6358yj) interfaceC5789ixMo23688h4).m26049k4(interfaceC5797nePop);
        if (interfaceC5797nePop.mo23403k4() != 1) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5775ar m48878k4() {
        return this.f35825x1;
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: kk */
    public final void mo48864kk() {
        InterfaceC12777qq interfaceC12777qq = this.f35821h4;
        this.f35825x1 = interfaceC12777qq != null ? (C6345ne) ((InterfaceC5795lr) interfaceC12777qq.mo22660v4().mo22779h4()).mo22727k4(C14113y2.f47374k4, "all") : new C6345ne();
        this.f35825x1.m26020k4(this.f35824to, this.f35821h4);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: m9 */
    public final void mo48866m9() {
        InterfaceC5797ne interfaceC5797neM26033k4 = this.f35820du.mo48817k4().m26033k4((short) 5, this.f35825x1, m48880x1());
        this.f35823kk = (AbstractC6355x1) ((C6332c5) interfaceC5797neM26033k4).mo23713kk();
        m48879k4(interfaceC5797neM26033k4);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: to */
    public final void mo48867to() {
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5797ne m48880x1() {
        if (this.f35822k4.size() == 0) {
            return null;
        }
        return this.f35822k4.peek();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: k4 */
    public final void mo48858k4(IGenericList<InterfaceC3506x1> iGenericList) {
        C6333ck c6333ck = (C6333ck) this.f35820du.mo48817k4().m26033k4((short) 4, this.f35825x1, m48880x1());
        C6350um c6350umM25918m9 = c6333ck.m25918m9();
        IGenericEnumerator<InterfaceC3506x1> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                c6350umM25918m9.m26029k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m48879k4(c6333ck);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: kk */
    public final void mo48865kk(String str) {
        InterfaceC5777bv interfaceC5777bv = (InterfaceC5777bv) this.f35820du.mo48817k4().m26033k4((short) 0, this.f35825x1, m48880x1());
        interfaceC5777bv.mo23684x1(str);
        m48879k4(interfaceC5777bv);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: x1 */
    public final void mo48868x1(String str) {
        InterfaceC5781ck interfaceC5781ck = (InterfaceC5781ck) this.f35820du.mo48817k4().m26033k4((short) 2, this.f35825x1, m48880x1());
        interfaceC5781ck.mo23396k4(str);
        m48879k4(interfaceC5781ck);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: k4 */
    public final void mo48859k4(InterfaceC5775ar interfaceC5775ar) {
        C6339jd c6339jd = (C6339jd) C7019kk.m27452k4((Object) m48880x1(), C6339jd.class);
        C6345ne c6345ne = (C6345ne) interfaceC5775ar;
        c6345ne.m26018k4(this.f35825x1);
        if (c6339jd == null) {
            this.f35824to.m26004to().mo48786k4(new C9930to(C14113y2.m67402k4("CSS Rule '{0}' is not supported embedded stylesheets.", Short.valueOf(m48880x1().mo23403k4()))));
        } else {
            c6345ne.m26019k4(m48880x1());
            c6339jd.m25952k4(interfaceC5775ar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48879k4(InterfaceC5797ne interfaceC5797ne) {
        this.f35822k4.push(interfaceC5797ne);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: k4 */
    public final void mo48860k4(String str) {
        C6337h4 c6337h4 = (C6337h4) this.f35820du.mo48817k4().m26033k4((short) 11, this.f35825x1, m48880x1());
        c6337h4.m25947k4(str);
        m48879k4(c6337h4);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: k4 */
    public final void mo48861k4(String str, IGenericList<InterfaceC3506x1> iGenericList) {
        C6339jd c6339jd = (C6339jd) this.f35820du.mo48817k4().m26033k4((short) 3, this.f35825x1, m48880x1());
        c6339jd.m25953k4(str);
        C6350um c6350umM25951dy = c6339jd.m25951dy();
        IGenericEnumerator<InterfaceC3506x1> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                c6350umM25951dy.m26029k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m48879k4(c6339jd);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9938x6
    /* JADX INFO: renamed from: k4 */
    public final void mo48819k4(String str, InterfaceC9933up interfaceC9933up, boolean z) {
        int iM26006x1 = this.f35824to.m26006x1(C14113y2.m67361du(str));
        if (iM26006x1 == -1) {
            this.f35824to.m26004to().mo48786k4(new C9930to(C14113y2.m67402k4("Invalid property name '{0}'.", str)));
            return;
        }
        AbstractC3909u4 abstractC3909u4M25986h4 = this.f35824to.m25986h4(iM26006x1);
        if (this.f35824to.m25984dy(iM26006x1)) {
            ((AbstractC3913yj) C7019kk.m27452k4((Object) abstractC3909u4M25986h4, AbstractC3913yj.class)).mo15609k4(this.f35824to, this, interfaceC9933up, z);
            return;
        }
        AbstractC5788h4 abstractC5788h4Mo15578k4 = abstractC3909u4M25986h4.mo15578k4(interfaceC9933up, this.f35824to);
        if (abstractC5788h4Mo15578k4.m23417m9() != 2 && interfaceC9933up.mo48851kk() != null) {
            throw C9919h4.m48830to(str);
        }
        this.f35823kk.mo25908k4(iM26006x1, abstractC5788h4Mo15578k4, z);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: k4 */
    public final void mo48862k4(String str, String str2) {
        this.f35825x1.m26017du().mo65707k4(str, str2);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9924ks
    /* JADX INFO: renamed from: k4 */
    public final void mo48863k4(InterfaceC2563bz[] interfaceC2563bzArr) {
        C6342ks c6342ksM25938m9;
        InterfaceC5797ne interfaceC5797neM48880x1 = m48880x1();
        for (InterfaceC2563bz interfaceC2563bz : interfaceC2563bzArr) {
            if (interfaceC5797neM48880x1.mo23403k4() == 1) {
                c6342ksM25938m9 = ((C6356x6) interfaceC5797neM48880x1).m26048m9();
            } else if (interfaceC5797neM48880x1.mo23403k4() == 6) {
                c6342ksM25938m9 = ((C6336fa) interfaceC5797neM48880x1).m25938m9();
            }
            c6342ksM25938m9.m25956k4((AbstractC2566ca) interfaceC2563bz);
        }
    }
}
