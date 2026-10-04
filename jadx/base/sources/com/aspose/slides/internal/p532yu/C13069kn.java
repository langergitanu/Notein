package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10930to;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.kn */
/* JADX INFO: loaded from: classes5.dex */
public class C13069kn extends AbstractC12972ev {
    public C13069kn(C12943dd c12943dd) {
        super(c12943dd);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12974ex m61061k4(C12943dd c12943dd) {
        return new C13069kn(c12943dd);
    }

    /* JADX INFO: renamed from: kk */
    private Object m61062kk(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        return C14067j2.m66727k4(obj) == AbstractC12972ev.f43658up ? ((C12965eg) obj).mo52693k4(abstractC14068j5, interfaceC13980t6) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    /* JADX INFO: renamed from: to */
    private Object m61063to(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        return abstractC14068j5 == AbstractC12972ev.f43659uz ? (AbstractC10930to) mo60121k4(obj, AbstractC12972ev.f43658up, interfaceC13980t6) : mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60121k4(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        int iM60540x1;
        int iM60540x12;
        int iM60540x13;
        int iM60540x14;
        AbstractC14068j5 abstractC14068j5M60538to = abstractC14068j5;
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5M60538to == null) {
            throw new ArgumentNullException("destinationType");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M60538to == AbstractC12972ev.f43665yj) {
            abstractC14068j5M60538to = m60538to();
        }
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43660v4;
        if (abstractC14068j5M60538to == abstractC14068j52) {
            if (abstractC14068j5M66727k4 != abstractC14068j52 || ((iM60540x14 = m60540x1()) != 26 && iM60540x14 != 27)) {
                if (abstractC14068j5M66727k4 == AbstractC12972ev.f43644fa) {
                    int iM60540x15 = m60540x1();
                    if (iM60540x15 == 26) {
                        return AbstractC12972ev.m60478um((String) obj);
                    }
                    if (iM60540x15 == 27) {
                        return AbstractC12972ev.m60446dy((String) obj);
                    }
                }
            }
            return C7019kk.m27458kk(obj, byte[].class);
        }
        AbstractC14068j5 abstractC14068j53 = AbstractC12972ev.f43650lr;
        if (abstractC14068j5M60538to == abstractC14068j53) {
            if (abstractC14068j5M66727k4 != AbstractC12972ev.f43644fa || ((iM60540x13 = m60540x1()) != 29 && iM60540x13 != 30)) {
                if (AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, abstractC14068j53)) {
                    int iM60540x16 = m60540x1();
                    if (iM60540x16 == 29) {
                        return (C13890ei) obj;
                    }
                    if (iM60540x16 == 30) {
                        return (C13890ei) obj;
                    }
                }
            }
            return AbstractC12972ev.m60456k4((String) obj, interfaceC13980t6);
        }
        AbstractC14068j5 abstractC14068j54 = AbstractC12972ev.f43644fa;
        if (abstractC14068j5M60538to == abstractC14068j54) {
            return mo60123k4(obj, interfaceC13980t6);
        }
        AbstractC14068j5 abstractC14068j55 = AbstractC12972ev.f43638b3;
        if (abstractC14068j5M60538to == abstractC14068j55) {
            if (abstractC14068j5M66727k4 == abstractC14068j54) {
                int iM60540x17 = m60540x1();
                if (iM60540x17 == 17) {
                    return AbstractC12972ev.m60447fa((String) obj);
                }
                if (iM60540x17 == 53) {
                    return AbstractC12972ev.m60467lr((String) obj);
                }
                if (iM60540x17 == 54) {
                    return AbstractC12972ev.m60439ck((String) obj);
                }
            }
            if (abstractC14068j5M66727k4 == abstractC14068j55) {
                int iM60540x18 = m60540x1();
                if (iM60540x18 == 17) {
                    return C7019kk.m27464to(obj, C14077m4.class);
                }
                if (iM60540x18 == 53) {
                    return C7019kk.m27464to(obj, C14077m4.class);
                }
                if (iM60540x18 == 54) {
                    return C7019kk.m27464to(obj, C14077m4.class);
                }
            }
        }
        AbstractC14068j5 abstractC14068j56 = AbstractC12972ev.f43664yd;
        if (abstractC14068j5M60538to == abstractC14068j56) {
            if (abstractC14068j5M66727k4 == abstractC14068j54 && m60540x1() == 28) {
                return C13850af.m65125qq((String) obj);
            }
            if (AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, abstractC14068j56) && m60540x1() == 28) {
                return (C14062gk) obj;
            }
        }
        AbstractC14068j5 abstractC14068j57 = AbstractC12972ev.f43658up;
        if (abstractC14068j5M60538to == abstractC14068j57) {
            if (abstractC14068j5M66727k4 != abstractC14068j52 || ((iM60540x12 = m60540x1()) != 26 && iM60540x12 != 27)) {
                if (abstractC14068j5M66727k4 == abstractC14068j54) {
                    return new C12965eg(m60503k4(), (String) obj, interfaceC13980t6);
                }
                if (abstractC14068j5M66727k4 != abstractC14068j55 || ((iM60540x1 = m60540x1()) != 17 && iM60540x1 != 53 && iM60540x1 != 54)) {
                    if (AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, abstractC14068j56) && m60540x1() == 28) {
                        return new C12965eg(m60503k4(), obj);
                    }
                    if (abstractC14068j5M66727k4 == abstractC14068j57) {
                        return (C12965eg) obj;
                    }
                    if (AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, abstractC14068j53)) {
                        int iM60540x19 = m60540x1();
                        if (iM60540x19 == 29) {
                            return new C12965eg(m60503k4(), obj, interfaceC13980t6);
                        }
                        if (iM60540x19 == 30) {
                            return new C12965eg(m60503k4(), obj, interfaceC13980t6);
                        }
                    }
                }
                return new C12965eg(m60503k4(), obj);
            }
            return new C12965eg(m60503k4(), obj);
        }
        AbstractC14068j5 abstractC14068j58 = AbstractC12972ev.f43659uz;
        return (abstractC14068j5M60538to == abstractC14068j58 && abstractC14068j5M66727k4 == abstractC14068j57) ? (C12965eg) obj : abstractC14068j5M60538to == abstractC14068j58 ? (AbstractC10930to) mo60121k4(obj, abstractC14068j57, interfaceC13980t6) : abstractC14068j5M66727k4 == abstractC14068j57 ? ((C12965eg) obj).mo52693k4(abstractC14068j5M60538to, interfaceC13980t6) : mo60547x1(obj, abstractC14068j5M60538to, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60122k4(String str, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        int iM60540x1;
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (abstractC14068j5 == AbstractC12972ev.f43665yj) {
            abstractC14068j5 = m60538to();
        }
        if (abstractC14068j5 == AbstractC12972ev.f43660v4) {
            int iM60540x12 = m60540x1();
            if (iM60540x12 == 26) {
                return AbstractC12972ev.m60478um(str);
            }
            if (iM60540x12 == 27) {
                return AbstractC12972ev.m60446dy(str);
            }
        }
        if (abstractC14068j5 != AbstractC12972ev.f43650lr || ((iM60540x1 = m60540x1()) != 29 && iM60540x1 != 30)) {
            if (abstractC14068j5 == AbstractC12972ev.f43644fa) {
                return str;
            }
            if (abstractC14068j5 == AbstractC12972ev.f43638b3) {
                int iM60540x13 = m60540x1();
                if (iM60540x13 == 17) {
                    return AbstractC12972ev.m60447fa(str);
                }
                if (iM60540x13 == 53) {
                    return AbstractC12972ev.m60467lr(str);
                }
                if (iM60540x13 == 54) {
                    return AbstractC12972ev.m60439ck(str);
                }
            }
            return (abstractC14068j5 == AbstractC12972ev.f43664yd && m60540x1() == 28) ? C13850af.m65125qq(str) : abstractC14068j5 == AbstractC12972ev.f43658up ? new C12965eg(m60503k4(), str, interfaceC13980t6) : m61063to(str, abstractC14068j5, interfaceC13980t6);
        }
        return AbstractC12972ev.m60456k4(str, interfaceC13980t6);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public String mo60123k4(Object obj, InterfaceC13980t6 interfaceC13980t6) {
        int iM60540x1;
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43660v4) {
            int iM60540x12 = m60540x1();
            if (iM60540x12 == 26) {
                return C13850af.m65113k4((byte[]) C7019kk.m27458kk(obj, byte[].class));
            }
            if (iM60540x12 == 27) {
                return AbstractC12972ev.m60461k4((byte[]) C7019kk.m27458kk(obj, byte[].class));
            }
        }
        AbstractC14068j5 abstractC14068j5 = AbstractC12972ev.f43644fa;
        if (abstractC14068j5M66727k4 == abstractC14068j5) {
            return (String) obj;
        }
        if (AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, AbstractC12972ev.f43664yd) && m60540x1() == 28) {
            return AbstractC12972ev.m60459k4((C14062gk) obj);
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43638b3) {
            int iM60540x13 = m60540x1();
            if (iM60540x13 == 17) {
                return AbstractC12972ev.m60485x1(((C14077m4) C7019kk.m27464to(obj, C14077m4.class)).Clone());
            }
            if (iM60540x13 == 53) {
                return AbstractC12972ev.m60465kk(((C14077m4) C7019kk.m27464to(obj, C14077m4.class)).Clone());
            }
            if (iM60540x13 == 54) {
                return AbstractC12972ev.m60460k4(((C14077m4) C7019kk.m27464to(obj, C14077m4.class)).Clone());
            }
        }
        if (!AbstractC12972ev.m60462k4(abstractC14068j5M66727k4, AbstractC12972ev.f43650lr) || ((iM60540x1 = m60540x1()) != 29 && iM60540x1 != 30)) {
            return (String) m61062kk(obj, abstractC14068j5, interfaceC13980t6);
        }
        return AbstractC12972ev.m60458k4((C13890ei) obj, interfaceC13980t6);
    }
}
