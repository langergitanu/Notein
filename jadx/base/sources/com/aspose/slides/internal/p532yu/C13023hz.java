package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14043ar;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.hz */
/* JADX INFO: loaded from: classes5.dex */
public class C13023hz extends C13012h9 {

    /* JADX INFO: renamed from: k4 */
    public static final AbstractC12974ex f43742k4 = new C13023hz(new C13023hz(), false);

    /* JADX INFO: renamed from: x1 */
    public static final AbstractC12974ex f43743x1 = new C13023hz(new C13023hz(), true);

    /* JADX INFO: renamed from: dq */
    private boolean f43744dq;

    public C13023hz() {
        super(AbstractC13279x6.m61681x1());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public double mo60491du(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? C13850af.m65132uz((String) obj) : ((Double) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43661wl, null), Double.TYPE)).doubleValue();
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: dy */
    public float mo60498dy(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? C13850af.m65129u4((String) obj) : ((Float) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43653qq, null), Float.TYPE)).floatValue();
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: h4 */
    public int mo60499h4(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? C13850af.m65151yj((String) obj) : ((Integer) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43647jd, null), Integer.TYPE)).intValue();
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: k4 */
    public C14084qq mo60506k4(String str) {
        if (str != null) {
            return AbstractC12972ev.m60487yd(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: kk */
    public C14043ar mo60526kk(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? AbstractC12972ev.m60433b3((String) obj) : (C14043ar) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43657um, null), C14043ar.class);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: m9 */
    public float mo60529m9(String str) {
        if (str != null) {
            return C13850af.m65129u4(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: to */
    public double mo60531to(String str) {
        if (str != null) {
            return C13850af.m65132uz(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: x1 */
    public C14043ar mo60542x1(String str) {
        if (str != null) {
            return AbstractC12972ev.m60433b3(str);
        }
        throw new ArgumentNullException("value");
    }

    public C13023hz(C13023hz c13023hz, boolean z) {
        super(c13023hz, z ? AbstractC12972ev.f43651m9 : AbstractC12972ev.f43644fa);
        this.f43744dq = z;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: du */
    public int mo60493du(String str) {
        if (str != null) {
            return C13850af.m65151yj(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: h4 */
    public long mo60500h4(String str) {
        if (str != null) {
            return C13850af.m65122ks(str);
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
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43644fa;
        C14046bv c14046bvClone = c14046bv.Clone();
        return abstractC14068j5 == abstractC14068j52 ? C13850af.m65105k4(c14046bvClone) : m60739to(c14046bvClone, abstractC14068j5, null);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: kk */
    public C14046bv mo60527kk(String str) {
        if (str != null) {
            return C13850af.m65069ck(str);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: m9 */
    public long mo60530m9(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? C13850af.m65122ks((String) obj) : ((Long) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43641ck, null), Long.TYPE)).longValue();
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: to */
    public C14046bv mo60537to(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? C13850af.m65069ck((String) obj) : (C14046bv) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43640c5, null), C14046bv.class);
        }
        throw new ArgumentNullException("value");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: x1 */
    public C14084qq mo60546x1(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? AbstractC12972ev.m60487yd((String) obj) : (C14084qq) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43637ar, null), C14084qq.class);
        }
        throw new ArgumentNullException("value");
    }

    /* JADX INFO: renamed from: kk */
    private Object m60738kk(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        return C14067j2.m66727k4(obj) == AbstractC12972ev.f43658up ? ((C12965eg) obj).mo52693k4(abstractC14068j5, interfaceC13980t6) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    /* JADX INFO: renamed from: to */
    private Object m60739to(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
        }
        return new C12965eg(m60503k4(), mo60123k4(obj, interfaceC13980t6));
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public String mo60495du(Boolean bool) {
        return C13850af.m65112k4(bool.booleanValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: h4 */
    public String mo60501h4(C14084qq c14084qq) {
        return AbstractC12972ev.m60445dy(c14084qq.Clone());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60508k4(C14084qq c14084qq, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43644fa;
        C14084qq c14084qqClone = c14084qq.Clone();
        return abstractC14068j5 == abstractC14068j52 ? AbstractC12972ev.m60445dy(c14084qqClone) : m60739to(c14084qqClone, abstractC14068j5, null);
    }

    @Override // com.aspose.slides.internal.p532yu.C13012h9, com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: x1 */
    public Object mo60547x1(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        AbstractC14068j5 abstractC14068j52;
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (((C13012h9) this).f43708ak != null && (this.f43744dq || abstractC14068j5M66727k4 == (abstractC14068j52 = AbstractC12972ev.f43644fa) || abstractC14068j5 == abstractC14068j52)) {
            return super.mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
        }
        if (m60737k4(abstractC14068j5M66727k4)) {
            throw new InvalidCastException(C13968ri.m65819k4("Xml type '{0}' cannot convert from Clr type '{1}' unless the destination type is String or XmlAtomicValue.", m60528kk(), abstractC14068j5M66727k4.mo48540du()));
        }
        if (m60737k4(abstractC14068j5)) {
            throw new InvalidCastException(C13968ri.m65819k4("Xml type '{0}' cannot convert to Clr type '{1}' unless the source value is a String or an XmlAtomicValue.", m60528kk(), abstractC14068j5.mo48540du()));
        }
        throw m60548x1(abstractC14068j5M66727k4, abstractC14068j5);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public String mo60496du(Integer num) {
        return C13850af.m65103k4(num.intValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: h4 */
    public String mo60502h4(Double d) {
        return C13850af.m65101k4(d.doubleValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60509k4(Boolean bool, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        return abstractC14068j5 == AbstractC12972ev.f43644fa ? C13850af.m65112k4(bool.booleanValue()) : m60739to(bool, abstractC14068j5, null);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: x1 */
    public String mo60549x1(C14043ar c14043ar) {
        return AbstractC12972ev.m60476to(c14043ar.Clone());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public String mo60497du(Long l) {
        return C13850af.m65104k4(l.longValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60510k4(Double d, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        return abstractC14068j5 == AbstractC12972ev.f43644fa ? C13850af.m65101k4(d.doubleValue()) : m60739to(d, abstractC14068j5, null);
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
        return abstractC14068j5 == AbstractC12972ev.f43644fa ? C13850af.m65103k4(num.intValue()) : m60739to(num, abstractC14068j5, null);
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
        return abstractC14068j5 == AbstractC12972ev.f43644fa ? C13850af.m65104k4(l.longValue()) : m60739to(l, abstractC14068j5, null);
    }

    @Override // com.aspose.slides.internal.p532yu.C13012h9, com.aspose.slides.internal.p532yu.AbstractC12974ex
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
        if (abstractC14068j5 == AbstractC12972ev.f43639bv && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Boolean.valueOf(C13850af.m65068c5((String) obj));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43649ks && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Byte.valueOf(AbstractC12972ev.m60449h4(Integer.valueOf(C13850af.m65151yj((String) obj))));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43660v4 && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return AbstractC12972ev.m60446dy((String) obj);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43637ar && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return AbstractC12972ev.m60487yd((String) obj);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43657um && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return AbstractC12972ev.m60433b3((String) obj);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43640c5 && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return C13850af.m65069ck((String) obj);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43661wl && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Double.valueOf(C13850af.m65132uz((String) obj));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43654rv && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Short.valueOf(AbstractC12972ev.m60471m9(Integer.valueOf(C13850af.m65151yj((String) obj))));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43647jd && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Integer.valueOf(C13850af.m65151yj((String) obj));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43641ck && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Long.valueOf(C13850af.m65122ks((String) obj));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43663x6 && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Byte.valueOf(AbstractC12972ev.m60443dy(Integer.valueOf(C13850af.m65151yj((String) obj))));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43653qq && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Float.valueOf(C13850af.m65129u4((String) obj));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43638b3 && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return AbstractC12972ev.m60447fa((String) obj);
        }
        if (abstractC14068j5 == AbstractC12972ev.f43652ne && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Integer.valueOf(AbstractC12972ev.m60435c5(Integer.valueOf(C13850af.m65151yj((String) obj))));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43646ix && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Long.valueOf(AbstractC12972ev.m60468m9(Long.valueOf(C13850af.m65122ks((String) obj))));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43656u4 && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return Long.valueOf(AbstractC12972ev.m60475to(C13850af.m65069ck((String) obj).Clone()));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43664yd && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return C13850af.m65125qq((String) obj);
        }
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43658up;
        if (abstractC14068j5 == abstractC14068j52) {
            if (abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
                return new C12965eg(m60503k4(), (String) obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j52) {
                return (C12965eg) obj;
            }
        }
        if (abstractC14068j5 == AbstractC12972ev.f43650lr && abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
            return AbstractC12972ev.m60456k4((String) obj, interfaceC13980t6);
        }
        AbstractC14068j5 abstractC14068j53 = AbstractC12972ev.f43659uz;
        if (abstractC14068j5 == abstractC14068j53) {
            if (abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
                return new C12965eg(m60503k4(), (String) obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j52) {
                return (C12965eg) obj;
            }
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return mo60123k4(obj, interfaceC13980t6);
        }
        if (abstractC14068j5 != abstractC14068j52 && abstractC14068j5 != abstractC14068j53) {
            return abstractC14068j5M66727k4 == abstractC14068j52 ? ((C12965eg) obj).mo52693k4(abstractC14068j5, interfaceC13980t6) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
        }
        return new C12965eg(m60503k4(), mo60123k4(obj, interfaceC13980t6));
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
        return abstractC14068j5 == AbstractC12972ev.f43639bv ? Boolean.valueOf(C13850af.m65068c5(str)) : abstractC14068j5 == AbstractC12972ev.f43649ks ? Byte.valueOf(AbstractC12972ev.m60449h4(Integer.valueOf(C13850af.m65151yj(str)))) : abstractC14068j5 == AbstractC12972ev.f43660v4 ? AbstractC12972ev.m60446dy(str) : abstractC14068j5 == AbstractC12972ev.f43637ar ? AbstractC12972ev.m60487yd(str) : abstractC14068j5 == AbstractC12972ev.f43657um ? AbstractC12972ev.m60433b3(str) : abstractC14068j5 == AbstractC12972ev.f43640c5 ? C13850af.m65069ck(str) : abstractC14068j5 == AbstractC12972ev.f43661wl ? Double.valueOf(C13850af.m65132uz(str)) : abstractC14068j5 == AbstractC12972ev.f43654rv ? Short.valueOf(AbstractC12972ev.m60471m9(Integer.valueOf(C13850af.m65151yj(str)))) : abstractC14068j5 == AbstractC12972ev.f43647jd ? Integer.valueOf(C13850af.m65151yj(str)) : abstractC14068j5 == AbstractC12972ev.f43641ck ? Long.valueOf(C13850af.m65122ks(str)) : abstractC14068j5 == AbstractC12972ev.f43663x6 ? Byte.valueOf(AbstractC12972ev.m60443dy(Integer.valueOf(C13850af.m65151yj(str)))) : abstractC14068j5 == AbstractC12972ev.f43653qq ? Float.valueOf(C13850af.m65129u4(str)) : abstractC14068j5 == AbstractC12972ev.f43638b3 ? AbstractC12972ev.m60447fa(str) : abstractC14068j5 == AbstractC12972ev.f43652ne ? Integer.valueOf(AbstractC12972ev.m60435c5(Integer.valueOf(C13850af.m65151yj(str)))) : abstractC14068j5 == AbstractC12972ev.f43646ix ? Long.valueOf(AbstractC12972ev.m60468m9(Long.valueOf(C13850af.m65122ks(str)))) : abstractC14068j5 == AbstractC12972ev.f43656u4 ? Long.valueOf(AbstractC12972ev.m60475to(C13850af.m65069ck(str).Clone())) : abstractC14068j5 == AbstractC12972ev.f43664yd ? C13850af.m65125qq(str) : abstractC14068j5 == AbstractC12972ev.f43658up ? new C12965eg(m60503k4(), str) : abstractC14068j5 == AbstractC12972ev.f43650lr ? AbstractC12972ev.m60456k4(str, interfaceC13980t6) : abstractC14068j5 == AbstractC12972ev.f43659uz ? new C12965eg(m60503k4(), str) : abstractC14068j5 == AbstractC12972ev.f43644fa ? str : m60739to(str, abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: k4 */
    public String mo60514k4(C14046bv c14046bv) {
        return C13850af.m65105k4(c14046bv.Clone());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: k4 */
    public String mo60515k4(Float f) {
        return C13850af.m65102k4(f.floatValue());
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public String mo60123k4(Object obj, InterfaceC13980t6 interfaceC13980t6) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43639bv) {
            return C13850af.m65112k4(((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue());
        }
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43649ks;
        Class cls = Byte.TYPE;
        if (abstractC14068j5M66727k4 == abstractC14068j5) {
            return C13850af.m65145x1(((Byte) C7019kk.m27464to(obj, cls)).byteValue());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43660v4) {
            return AbstractC12972ev.m60461k4((byte[]) C7019kk.m27458kk(obj, byte[].class));
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43637ar) {
            return AbstractC12972ev.m60445dy(((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).Clone());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43657um) {
            return AbstractC12972ev.m60476to(((C14043ar) C7019kk.m27464to(obj, C14043ar.class)).Clone());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43640c5) {
            return C13850af.m65105k4(((C14046bv) C7019kk.m27464to(obj, C14046bv.class)).Clone());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43661wl) {
            return C13850af.m65101k4(((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43654rv) {
            return C13850af.m65111k4(((Short) C7019kk.m27464to(obj, Short.TYPE)).shortValue());
        }
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43647jd;
        Class cls2 = Integer.TYPE;
        if (abstractC14068j5M66727k4 == abstractC14068j52) {
            return C13850af.m65103k4(((Integer) C7019kk.m27464to(obj, cls2)).intValue());
        }
        AbstractC14068j5 abstractC14068j53 = AbstractC12972ev.f43641ck;
        Class cls3 = Long.TYPE;
        if (abstractC14068j5M66727k4 == abstractC14068j53) {
            return C13850af.m65104k4(((Long) C7019kk.m27464to(obj, cls3)).longValue());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43663x6) {
            return C13850af.m65099k4(((Byte) C7019kk.m27464to(obj, cls)).byteValue());
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43653qq) {
            return C13850af.m65102k4(((Float) C7019kk.m27464to(obj, Float.TYPE)).floatValue());
        }
        AbstractC14068j5 abstractC14068j54 = AbstractC12972ev.f43644fa;
        return abstractC14068j5M66727k4 == abstractC14068j54 ? (String) obj : abstractC14068j5M66727k4 == AbstractC12972ev.f43638b3 ? AbstractC12972ev.m60485x1(((C14077m4) C7019kk.m27464to(obj, C14077m4.class)).Clone()) : abstractC14068j5M66727k4 == AbstractC12972ev.f43652ne ? C13850af.m65146x1(((Integer) C7019kk.m27464to(obj, cls2)).intValue()) : abstractC14068j5M66727k4 == AbstractC12972ev.f43646ix ? C13850af.m65147x1(((Long) C7019kk.m27464to(obj, cls3)).longValue()) : abstractC14068j5M66727k4 == AbstractC12972ev.f43656u4 ? C13850af.m65119kk(((Long) C7019kk.m27464to(obj, cls3)).longValue()) : AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, AbstractC12972ev.f43664yd) ? AbstractC12972ev.m60459k4((C14062gk) obj) : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? (String) ((C12965eg) obj).mo52693k4(abstractC14068j54, interfaceC13980t6) : AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, AbstractC12972ev.f43650lr) ? AbstractC12972ev.m60458k4((C13890ei) obj, interfaceC13980t6) : (String) m60738kk(obj, abstractC14068j54, interfaceC13980t6);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60737k4(AbstractC14068j5 abstractC14068j5) {
        return abstractC14068j5 == AbstractC12972ev.f43639bv || abstractC14068j5 == AbstractC12972ev.f43649ks || abstractC14068j5 == AbstractC12972ev.f43660v4 || abstractC14068j5 == AbstractC12972ev.f43637ar || abstractC14068j5 == AbstractC12972ev.f43657um || abstractC14068j5 == AbstractC12972ev.f43640c5 || abstractC14068j5 == AbstractC12972ev.f43661wl || abstractC14068j5 == AbstractC12972ev.f43654rv || abstractC14068j5 == AbstractC12972ev.f43647jd || abstractC14068j5 == AbstractC12972ev.f43641ck || abstractC14068j5 == AbstractC12972ev.f43663x6 || abstractC14068j5 == AbstractC12972ev.f43653qq || abstractC14068j5 == AbstractC12972ev.f43638b3 || abstractC14068j5 == AbstractC12972ev.f43652ne || abstractC14068j5 == AbstractC12972ev.f43646ix || abstractC14068j5 == AbstractC12972ev.f43656u4 || abstractC14068j5 == AbstractC12972ev.f43664yd || abstractC14068j5 == AbstractC12972ev.f43650lr;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public boolean mo60520k4(Object obj) {
        if (obj != null) {
            return C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa ? C13850af.m65068c5((String) obj) : ((Boolean) C7019kk.m27464to(m60738kk(obj, AbstractC12972ev.f43639bv, null), Boolean.TYPE)).booleanValue();
        }
        throw new ArgumentNullException("value");
    }
}
