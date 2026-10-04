package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p199j5.InterfaceC5192du;
import com.aspose.slides.internal.p199j5.InterfaceC5195kk;
import com.aspose.slides.internal.p199j5.InterfaceC5196to;
import com.aspose.slides.internal.p263m2.InterfaceC6307k4;
import com.aspose.slides.internal.p295na.C6791h4;
import com.aspose.slides.internal.p295na.C6795to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12774lr;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12779to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.ix */
/* JADX INFO: loaded from: classes.dex */
public class C5543ix extends AbstractC5535bv implements InterfaceC12769ix {

    /* JADX INFO: renamed from: k4 */
    public C5565yj f15229k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC5535bv f15230kk;

    /* JADX INFO: renamed from: to */
    private C5560wy f15231to;

    /* JADX INFO: renamed from: x1 */
    private C5561x1 f15232x1;

    public C5543ix(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5552rv);
        this.f15229k4 = c5565yj;
        this.f15231to = C5560wy.m22847k4(c5565yj.mo22875k4());
        this.f15232x1 = new C5561x1(this);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: A_ */
    public InterfaceC12779to mo22620A_() {
        return this.f15232x1;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: c5 */
    public String mo22604c5() {
        return this.f15229k4.mo22875k4();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ck */
    public String mo22626ck() {
        return this.f15229k4.m22873du();
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC12760ar m22699du(String str, String str2) {
        return C5557uz.m22840k4(this, str, str2);
    }

    /* JADX INFO: renamed from: dy */
    public final C5543ix m22702dy(String str) {
        if (mo22653ss() == null) {
            return null;
        }
        return (C5543ix) C7019kk.m27452k4((Object) new C6791h4(mo22653ss(), 1, new C6795to(str), false).mo22192k4(), C5543ix.class);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C5545k4 m22703h4(String str) {
        return (C5545k4) C7019kk.m27452k4((Object) this.f15232x1.mo22861x1(str), C5545k4.class);
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5197x1
    /* JADX INFO: renamed from: ix */
    public final InterfaceC12769ix mo22194ix() {
        AbstractC5535bv abstractC5535bvMo22654sv = mo22654sv();
        if (abstractC5535bvMo22654sv == null) {
            return null;
        }
        InterfaceC5196to interfaceC5196toMo22189k4 = mo22660v4().mo22189k4((InterfaceC12777qq) abstractC5535bvMo22654sv, 1, (InterfaceC5195kk) null, false);
        try {
            InterfaceC12769ix interfaceC12769ix = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC5196toMo22189k4.mo22193x1(), C5543ix.class);
            interfaceC5196toMo22189k4.dispose();
            return interfaceC12769ix;
        } catch (Throwable th) {
            if (interfaceC5196toMo22189k4 != null) {
                interfaceC5196toMo22189k4.dispose();
            }
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: jd */
    public String mo22634jd() {
        return this.f15229k4.m22877kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12772kk m22706k4(InterfaceC12772kk interfaceC12772kk) {
        return this.f15232x1.m22854k4((C5545k4) interfaceC12772kk);
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC12772kk m22713kk(InterfaceC12772kk interfaceC12772kk) {
        return this.f15232x1.m22858kk(interfaceC12772kk);
    }

    /* JADX INFO: renamed from: ks */
    public final InterfaceC12774lr m22715ks() {
        return new C5538dq(this);
    }

    /* JADX INFO: renamed from: m9 */
    public final InterfaceC12760ar m22716m9(String str) {
        return C5557uz.m22839k4(this, str);
    }

    /* JADX INFO: renamed from: ne */
    public final InterfaceC12769ix m22717ne() {
        InterfaceC5192du interfaceC5192duMo22190x1 = mo22660v4().mo22190x1(this, 1, null, false);
        try {
            InterfaceC12769ix interfaceC12769ix = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC5192duMo22190x1.mo22187to(), C5543ix.class);
            interfaceC5192duMo22190x1.dispose();
            return interfaceC12769ix;
        } catch (Throwable th) {
            if (interfaceC5192duMo22190x1 != null) {
                interfaceC5192duMo22190x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: rv */
    public final String m22718rv() {
        return ((InterfaceC6307k4) mo22660v4().mo22779h4().mo22732kk("LS", null)).mo22734x1().mo25859k4(this);
    }

    /* JADX INFO: renamed from: to */
    public final C5560wy m22719to() {
        return this.f15231to;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5197x1
    /* JADX INFO: renamed from: u4 */
    public final InterfaceC12769ix mo22195u4() {
        if (mo22631g8() == null) {
            return null;
        }
        InterfaceC5196to interfaceC5196toMo22189k4 = mo22660v4().mo22189k4((InterfaceC12777qq) mo22631g8(), 1, (InterfaceC5195kk) null, false);
        try {
            InterfaceC12769ix interfaceC12769ix = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC5196toMo22189k4.mo22192k4(), C5543ix.class);
            interfaceC5196toMo22189k4.dispose();
            return interfaceC12769ix;
        } catch (Throwable th) {
            if (interfaceC5196toMo22189k4 != null) {
                interfaceC5196toMo22189k4.dispose();
            }
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    /* JADX INFO: renamed from: um */
    public AbstractC5535bv mo22658um() {
        return this.f15230kk;
    }

    /* JADX INFO: renamed from: uz */
    public final long m22722uz() {
        return C5557uz.m22836k4(this).mo20312k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12772kk m22723x1(InterfaceC12772kk interfaceC12772kk) {
        return this.f15232x1.m22860x1(interfaceC12772kk);
    }

    /* JADX INFO: renamed from: x6 */
    public final InterfaceC12769ix m22725x6() {
        InterfaceC5192du interfaceC5192duMo22190x1 = mo22660v4().mo22190x1(this, 1, null, false);
        try {
            InterfaceC12769ix interfaceC12769ix = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC5192duMo22190x1.mo22186kk(), C5543ix.class);
            interfaceC5192duMo22190x1.dispose();
            return interfaceC12769ix;
        } catch (Throwable th) {
            if (interfaceC5192duMo22190x1 != null) {
                interfaceC5192duMo22190x1.dispose();
            }
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12769ix
    /* JADX INFO: renamed from: c5 */
    public final boolean mo22698c5(String str) {
        return m22704h4().mo59448to(str) != null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12769ix
    /* JADX INFO: renamed from: du */
    public final String mo22700du() {
        return this.f15231to.m22851kk();
    }

    /* JADX INFO: renamed from: h4 */
    public final C5561x1 m22704h4() {
        return this.f15232x1;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    /* JADX INFO: renamed from: k4 */
    public void mo22639k4(AbstractC5535bv abstractC5535bv) {
        this.f15230kk = abstractC5535bv;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: kk */
    public void mo22645kk(String str) {
        this.f15229k4.m22876k4(mo22660v4().m22796kk().mo65266k4(str));
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return mo22700du();
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC12772kk m22720to(String str, String str2) {
        return this.f15232x1.m22856k4(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        C5543ix c5543ix = (C5543ix) mo22660v4().m22787k4(mo22626ck(), mo22604c5(), mo22634jd());
        if (mo22657ts()) {
            IEnumerator it = this.f15232x1.iterator();
            while (it.hasNext()) {
                try {
                    c5543ix.m22704h4().m59441du((C5545k4) ((C5545k4) it.next()).mo22614x1(true));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
        if (z) {
            for (AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss(); abstractC5535bvMo22653ss != null; abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) {
                c5543ix.m22655to(abstractC5535bvMo22653ss.mo22614x1(z));
            }
        }
        return c5543ix;
    }

    /* JADX INFO: renamed from: du */
    public final void m22701du(String str) {
        this.f15232x1.m22859kk(str);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12769ix
    /* JADX INFO: renamed from: h4 */
    public final boolean mo22705h4(String str, String str2) {
        return this.f15232x1.m22856k4(str, str2) != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22707k4(InterfaceC12772kk interfaceC12772kk, boolean z) {
        C5545k4 c5545k4M22703h4 = m22703h4(interfaceC12772kk.mo22738k4());
        if (c5545k4M22703h4 != null) {
            c5545k4M22703h4.m22740k4(z);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m22714kk(String str, String str2) {
        this.f15232x1.m22862x1(str, str2);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12769ix
    /* JADX INFO: renamed from: to */
    public final String mo22721to(String str) {
        C5545k4 c5545k4M22703h4 = m22703h4(str);
        if (c5545k4M22703h4 != null) {
            return c5545k4M22703h4.mo22741kk();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12769ix
    /* JADX INFO: renamed from: x1 */
    public final String mo22724x1(String str, String str2) {
        InterfaceC12772kk interfaceC12772kkM22856k4 = this.f15232x1.m22856k4(str, str2);
        if (interfaceC12772kkM22856k4 != null) {
            return interfaceC12772kkM22856k4.mo22741kk();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12769ix
    /* JADX INFO: renamed from: k4 */
    public final void mo22708k4(String str, String str2) {
        C5545k4 c5545k4M22703h4 = m22703h4(str);
        if (c5545k4M22703h4 != null) {
            c5545k4M22703h4.mo22739k4(str2);
            return;
        }
        InterfaceC12772kk interfaceC12772kkMo22772c5 = mo22660v4().mo22772c5(str);
        interfaceC12772kkMo22772c5.mo22739k4(str2);
        m22706k4(interfaceC12772kkMo22772c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22709k4(String str, String str2, String str3) {
        InterfaceC12772kk interfaceC12772kkM22856k4 = this.f15232x1.m22856k4(str, str2);
        if (interfaceC12772kkM22856k4 != null) {
            interfaceC12772kkM22856k4.mo22739k4(str3);
            return;
        }
        C5545k4 c5545k4M22810x1 = mo22660v4().m22810x1(str, str2);
        c5545k4M22810x1.mo22739k4(str3);
        m22706k4((InterfaceC12772kk) c5545k4M22810x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22710k4(String str, String str2, boolean z) {
        InterfaceC12772kk interfaceC12772kkM22720to = m22720to(str, str2);
        if (interfaceC12772kkM22720to != null) {
            ((C5545k4) interfaceC12772kkM22720to).m22740k4(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22711k4(String str, boolean z) {
        C5545k4 c5545k4M22703h4 = m22703h4(str);
        if (c5545k4M22703h4 != null) {
            c5545k4M22703h4.m22740k4(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22712k4(C5560wy c5560wy) {
        if (C14067j2.m66729x1(null, c5560wy)) {
            return false;
        }
        return C14067j2.m66729x1(this.f15231to, c5560wy);
    }
}
