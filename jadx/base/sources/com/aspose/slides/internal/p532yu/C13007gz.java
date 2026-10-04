package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.gz */
/* JADX INFO: loaded from: classes5.dex */
public class C13007gz extends AbstractC12972ev {
    public C13007gz(C12943dd c12943dd) {
        super(c12943dd);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12974ex m60657k4(C12943dd c12943dd) {
        return new C13007gz(c12943dd);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: du */
    public int mo60493du(String str) {
        if (str != null) {
            return m60540x1() == 14 ? AbstractC12972ev.m60484x1(C13850af.m65069ck(str).Clone()) : C13850af.m65151yj(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: h4 */
    public int mo60499h4(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43640c5) {
            return AbstractC12972ev.m60484x1(((C14046bv) C7019kk.m27464to(obj, C14046bv.class)).Clone());
        }
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43647jd;
        Class cls = Integer.TYPE;
        return abstractC14068j5M66727k4 == abstractC14068j5 ? ((Integer) C7019kk.m27464to(obj, cls)).intValue() : abstractC14068j5M66727k4 == AbstractC12972ev.f43641ck ? AbstractC12972ev.m60450h4((Long) C7019kk.m27464to(obj, Long.TYPE)) : abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa ? mo60493du((String) obj) : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? ((C12965eg) obj).m60382c5() : ((Integer) C7019kk.m27464to(m60658kk(obj, abstractC14068j5, null), cls)).intValue();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: kk */
    public C14046bv mo60527kk(String str) {
        if (str != null) {
            return m60540x1() == 14 ? C13850af.m65069ck(str) : C13850af.m65072fa(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: m9 */
    public long mo60530m9(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43640c5) {
            return AbstractC12972ev.m60463kk(((C14046bv) C7019kk.m27464to(obj, C14046bv.class)).Clone());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43647jd) {
            return ((Integer) obj).intValue();
        }
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43641ck;
        Class cls = Long.TYPE;
        return abstractC14068j5M66727k4 == abstractC14068j5 ? ((Long) C7019kk.m27464to(obj, cls)).longValue() : abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa ? mo60500h4((String) obj) : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? ((C12965eg) obj).m60385jd() : ((Long) C7019kk.m27464to(m60658kk(obj, abstractC14068j5, null), cls)).longValue();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: to */
    public int mo60533to(Long l) {
        l.longValue();
        return AbstractC12972ev.m60450h4(l);
    }

    /* JADX INFO: renamed from: kk */
    private Object m60658kk(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        return (abstractC14068j5M66727k4 == AbstractC12972ev.f43649ks && m60540x1() == 51) ? mo60511k4(Integer.valueOf(((Byte) obj).byteValue() & 255), abstractC14068j5) : abstractC14068j5M66727k4 == AbstractC12972ev.f43654rv ? mo60511k4(Integer.valueOf(((Short) obj).shortValue()), abstractC14068j5) : abstractC14068j5M66727k4 == AbstractC12972ev.f43663x6 ? mo60511k4(Integer.valueOf(((Byte) obj).byteValue()), abstractC14068j5) : abstractC14068j5M66727k4 == AbstractC12972ev.f43652ne ? mo60511k4(Integer.valueOf(((Integer) obj).intValue() & 65535), abstractC14068j5) : abstractC14068j5M66727k4 == AbstractC12972ev.f43646ix ? mo60512k4(Long.valueOf(((Long) obj).longValue() & 4294967295L), abstractC14068j5) : abstractC14068j5M66727k4 == AbstractC12972ev.f43656u4 ? mo60507k4(C7019kk.m27440jd((Long) obj, 12).Clone(), abstractC14068j5) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public String mo60496du(Integer num) {
        return C13850af.m65103k4(num.intValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: h4 */
    public long mo60500h4(String str) {
        if (str != null) {
            return m60540x1() == 14 ? AbstractC12972ev.m60463kk(C13850af.m65069ck(str).Clone()) : C13850af.m65122ks(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: k4 */
    public Object mo60507k4(C14046bv c14046bv, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        if (abstractC14068j5 == AbstractC12972ev.f43640c5) {
            return c14046bv;
        }
        if (abstractC14068j5 == AbstractC12972ev.f43647jd) {
            return Integer.valueOf(AbstractC12972ev.m60484x1(c14046bv.Clone()));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43641ck) {
            return Long.valueOf(AbstractC12972ev.m60463kk(c14046bv.Clone()));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return mo60514k4(c14046bv.Clone());
        }
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return m60659to(c14046bv.Clone(), abstractC14068j5, null);
        }
        return new C12965eg(m60503k4(), c14046bv.Clone());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: to */
    public long mo60536to(Integer num) {
        return num.intValue();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public String mo60497du(Long l) {
        return C13850af.m65104k4(l.longValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60511k4(Integer num, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        if (abstractC14068j5 == AbstractC12972ev.f43640c5) {
            num.intValue();
            return C7019kk.m27440jd(num, 9);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43647jd) {
            num.intValue();
            return num;
        }
        if (abstractC14068j5 == AbstractC12972ev.f43641ck) {
            return Long.valueOf(num.intValue());
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return C13850af.m65103k4(num.intValue());
        }
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return m60659to(num, abstractC14068j5, null);
        }
        return new C12965eg(m60503k4(), num.intValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: to */
    public C14046bv mo60537to(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43640c5;
        return abstractC14068j5M66727k4 == abstractC14068j5 ? (C14046bv) C7019kk.m27464to(obj, C14046bv.class) : abstractC14068j5M66727k4 == AbstractC12972ev.f43647jd ? C7019kk.m27440jd((Integer) obj, 9) : abstractC14068j5M66727k4 == AbstractC12972ev.f43641ck ? C7019kk.m27440jd((Long) obj, 11) : abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa ? mo60527kk((String) obj) : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? (C14046bv) C7019kk.m27464to(((C12965eg) obj).m52703k4(abstractC14068j5), C14046bv.class) : (C14046bv) C7019kk.m27464to(m60658kk(obj, abstractC14068j5, null), C14046bv.class);
    }

    /* JADX INFO: renamed from: to */
    private Object m60659to(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        return abstractC14068j5 == AbstractC12972ev.f43649ks ? Byte.valueOf(AbstractC12972ev.m60449h4(Integer.valueOf(mo60499h4(obj)))) : abstractC14068j5 == AbstractC12972ev.f43654rv ? Short.valueOf(AbstractC12972ev.m60471m9(Integer.valueOf(mo60499h4(obj)))) : abstractC14068j5 == AbstractC12972ev.f43663x6 ? Byte.valueOf(AbstractC12972ev.m60443dy(Integer.valueOf(mo60499h4(obj)))) : abstractC14068j5 == AbstractC12972ev.f43652ne ? Integer.valueOf(AbstractC12972ev.m60435c5(Integer.valueOf(mo60499h4(obj)))) : abstractC14068j5 == AbstractC12972ev.f43646ix ? Long.valueOf(AbstractC12972ev.m60468m9(Long.valueOf(mo60530m9(obj)))) : abstractC14068j5 == AbstractC12972ev.f43656u4 ? Long.valueOf(AbstractC12972ev.m60475to(mo60537to(obj).Clone())) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60512k4(Long l, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        if (abstractC14068j5 == AbstractC12972ev.f43640c5) {
            l.longValue();
            return C7019kk.m27440jd(l, 11);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43647jd) {
            l.longValue();
            return Integer.valueOf(AbstractC12972ev.m60450h4(l));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43641ck) {
            l.longValue();
            return l;
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return C13850af.m65104k4(l.longValue());
        }
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return m60659to(l, abstractC14068j5, null);
        }
        return new C12965eg(m60503k4(), l.longValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60121k4(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43640c5;
        if (abstractC14068j5 == abstractC14068j52) {
            return mo60537to(obj);
        }
        AbstractC14068j5 abstractC14068j53 = AbstractC12972ev.f43647jd;
        if (abstractC14068j5 == abstractC14068j53) {
            return Integer.valueOf(mo60499h4(obj));
        }
        AbstractC14068j5 abstractC14068j54 = AbstractC12972ev.f43641ck;
        if (abstractC14068j5 == abstractC14068j54) {
            return Long.valueOf(mo60530m9(obj));
        }
        AbstractC14068j5 abstractC14068j55 = AbstractC12972ev.f43644fa;
        if (abstractC14068j5 == abstractC14068j55) {
            return mo60123k4(obj, interfaceC13980t6);
        }
        AbstractC14068j5 abstractC14068j56 = AbstractC12972ev.f43658up;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        if (abstractC14068j5 == abstractC14068j56) {
            if (abstractC14068j5M66727k4 == abstractC14068j52) {
                return new C12965eg(m60503k4(), obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j53) {
                return new C12965eg(m60503k4(), C7019kk.m27464to(obj, cls2));
            }
            if (abstractC14068j5M66727k4 == abstractC14068j54) {
                return new C12965eg(m60503k4(), C7019kk.m27464to(obj, cls));
            }
            if (abstractC14068j5M66727k4 == abstractC14068j55) {
                return new C12965eg(m60503k4(), (String) obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j56) {
                return (C12965eg) obj;
            }
        }
        if (abstractC14068j5 == AbstractC12972ev.f43659uz) {
            if (abstractC14068j5M66727k4 == abstractC14068j52) {
                return new C12965eg(m60503k4(), obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j53) {
                return new C12965eg(m60503k4(), C7019kk.m27464to(obj, cls2));
            }
            if (abstractC14068j5M66727k4 == abstractC14068j54) {
                return new C12965eg(m60503k4(), C7019kk.m27464to(obj, cls));
            }
            if (abstractC14068j5M66727k4 == abstractC14068j55) {
                return new C12965eg(m60503k4(), (String) obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j56) {
                return (C12965eg) obj;
            }
        }
        AbstractC14068j5 abstractC14068j57 = AbstractC12972ev.f43649ks;
        if (abstractC14068j5 == abstractC14068j57) {
            return Byte.valueOf(AbstractC12972ev.m60449h4(Integer.valueOf(mo60499h4(obj))));
        }
        AbstractC14068j5 abstractC14068j58 = AbstractC12972ev.f43654rv;
        if (abstractC14068j5 == abstractC14068j58) {
            return Short.valueOf(AbstractC12972ev.m60471m9(Integer.valueOf(mo60499h4(obj))));
        }
        AbstractC14068j5 abstractC14068j59 = AbstractC12972ev.f43663x6;
        if (abstractC14068j5 == abstractC14068j59) {
            return Byte.valueOf(AbstractC12972ev.m60443dy(Integer.valueOf(mo60499h4(obj))));
        }
        AbstractC14068j5 abstractC14068j510 = AbstractC12972ev.f43652ne;
        if (abstractC14068j5 == abstractC14068j510) {
            return Integer.valueOf(AbstractC12972ev.m60435c5(Integer.valueOf(mo60499h4(obj))));
        }
        AbstractC14068j5 abstractC14068j511 = AbstractC12972ev.f43646ix;
        if (abstractC14068j5 == abstractC14068j511) {
            return Long.valueOf(AbstractC12972ev.m60468m9(Long.valueOf(mo60530m9(obj))));
        }
        AbstractC14068j5 abstractC14068j512 = AbstractC12972ev.f43656u4;
        return abstractC14068j5 == abstractC14068j512 ? Long.valueOf(AbstractC12972ev.m60475to(mo60537to(obj).Clone())) : (abstractC14068j5M66727k4 == abstractC14068j57 && m60540x1() == 51) ? mo60511k4(Integer.valueOf(((Byte) obj).byteValue() & 255), abstractC14068j5) : abstractC14068j5M66727k4 == abstractC14068j58 ? mo60511k4(Integer.valueOf(((Short) obj).shortValue()), abstractC14068j5) : abstractC14068j5M66727k4 == abstractC14068j59 ? mo60511k4(Integer.valueOf(((Byte) obj).byteValue()), abstractC14068j5) : abstractC14068j5M66727k4 == abstractC14068j510 ? mo60511k4(Integer.valueOf(((Integer) obj).intValue() & 65535), abstractC14068j5) : abstractC14068j5M66727k4 == abstractC14068j511 ? mo60512k4(Long.valueOf(((Long) obj).longValue() & 4294967295L), abstractC14068j5) : abstractC14068j5M66727k4 == abstractC14068j512 ? mo60507k4(C7019kk.m27440jd((Long) obj, 12).Clone(), abstractC14068j5) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60122k4(String str, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        if (abstractC14068j5 == AbstractC12972ev.f43640c5) {
            return mo60527kk(str);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43647jd) {
            return Integer.valueOf(mo60493du(str));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43641ck) {
            return Long.valueOf(mo60500h4(str));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return str;
        }
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return m60659to(str, abstractC14068j5, interfaceC13980t6);
        }
        return new C12965eg(m60503k4(), str);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: k4 */
    public String mo60514k4(C14046bv c14046bv) {
        int iM60540x1 = m60540x1();
        C14046bv c14046bvClone = c14046bv.Clone();
        return iM60540x1 == 14 ? C13850af.m65105k4(c14046bvClone) : C13850af.m65105k4(C14046bv.m66446c5(c14046bvClone).Clone());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public String mo60123k4(Object obj, InterfaceC13980t6 interfaceC13980t6) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43640c5) {
            return mo60514k4(((C14046bv) C7019kk.m27464to(obj, C14046bv.class)).Clone());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43647jd) {
            return C13850af.m65103k4(((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43641ck) {
            return C13850af.m65104k4(((Long) C7019kk.m27464to(obj, Long.TYPE)).longValue());
        }
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43644fa;
        return abstractC14068j5M66727k4 == abstractC14068j5 ? (String) obj : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? ((C12965eg) obj).mo21843dy() : (String) m60658kk(obj, abstractC14068j5, interfaceC13980t6);
    }
}
