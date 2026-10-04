package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.sd */
/* JADX INFO: loaded from: classes5.dex */
public class C13201sd extends AbstractC12972ev {
    public C13201sd(C12943dd c12943dd) {
        super(c12943dd);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12974ex m61463k4(C12943dd c12943dd) {
        return new C13201sd(c12943dd);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: du */
    public String mo60495du(Boolean bool) {
        return C13850af.m65112k4(bool.booleanValue());
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
        if (abstractC14068j5 == AbstractC12972ev.f43639bv) {
            bool.booleanValue();
            return bool;
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return C13850af.m65112k4(bool.booleanValue());
        }
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return mo60547x1(bool, abstractC14068j5, null);
        }
        return new C12965eg(m60503k4(), bool.booleanValue());
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
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43639bv;
        if (abstractC14068j5 == abstractC14068j52) {
            return Boolean.valueOf(mo60520k4(obj));
        }
        AbstractC14068j5 abstractC14068j53 = AbstractC12972ev.f43644fa;
        if (abstractC14068j5 == abstractC14068j53) {
            return mo60123k4(obj, interfaceC13980t6);
        }
        AbstractC14068j5 abstractC14068j54 = AbstractC12972ev.f43658up;
        Class cls = Boolean.TYPE;
        if (abstractC14068j5 == abstractC14068j54) {
            if (abstractC14068j5M66727k4 == abstractC14068j52) {
                return new C12965eg(m60503k4(), C7019kk.m27464to(obj, cls));
            }
            if (abstractC14068j5M66727k4 == abstractC14068j53) {
                return new C12965eg(m60503k4(), (String) obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j54) {
                return (C12965eg) obj;
            }
        }
        if (abstractC14068j5 == AbstractC12972ev.f43659uz) {
            if (abstractC14068j5M66727k4 == abstractC14068j52) {
                return new C12965eg(m60503k4(), C7019kk.m27464to(obj, cls));
            }
            if (abstractC14068j5M66727k4 == abstractC14068j53) {
                return new C12965eg(m60503k4(), (String) obj);
            }
            if (abstractC14068j5M66727k4 == abstractC14068j54) {
                return (C12965eg) obj;
            }
        }
        return mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
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
        if (abstractC14068j5 == AbstractC12972ev.f43639bv) {
            return Boolean.valueOf(C13850af.m65068c5(str));
        }
        if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return str;
        }
        if (abstractC14068j5 != AbstractC12972ev.f43658up && abstractC14068j5 != AbstractC12972ev.f43659uz) {
            return mo60547x1(str, abstractC14068j5, interfaceC13980t6);
        }
        return new C12965eg(m60503k4(), str);
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
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43644fa;
        return abstractC14068j5M66727k4 == abstractC14068j5 ? (String) obj : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? ((C12965eg) obj).mo21843dy() : (String) mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public boolean mo60520k4(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43639bv;
        Class cls = Boolean.TYPE;
        return abstractC14068j5M66727k4 == abstractC14068j5 ? ((Boolean) C7019kk.m27464to(obj, cls)).booleanValue() : abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa ? C13850af.m65068c5((String) obj) : abstractC14068j5M66727k4 == AbstractC12972ev.f43658up ? ((C12965eg) obj).m60383du() : ((Boolean) C7019kk.m27464to(mo60547x1(obj, abstractC14068j5, null), cls)).booleanValue();
    }
}
