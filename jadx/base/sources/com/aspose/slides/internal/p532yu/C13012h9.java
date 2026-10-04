package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10930to;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
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
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.h9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13012h9 extends AbstractC12972ev {

    /* JADX INFO: renamed from: ak */
    protected AbstractC12974ex f43708ak;

    public C13012h9(C12943dd c12943dd) {
        super(c12943dd);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12974ex m60668k4(AbstractC12974ex abstractC12974ex) {
        return abstractC12974ex == C13023hz.f43742k4 ? C13023hz.f43743x1 : abstractC12974ex == C13296y1.f44599k4 ? C13104mi.f44112k4 : abstractC12974ex == C13296y1.f44600x1 ? C13104mi.f44113x1 : new C13012h9((AbstractC12972ev) abstractC12974ex);
    }

    /* JADX INFO: renamed from: kk */
    private RuntimeException m60672kk(AbstractC14068j5 abstractC14068j5, AbstractC14068j5 abstractC14068j52) {
        return abstractC14068j5 == abstractC14068j52 ? new InvalidCastException(C13968ri.m65819k4("Xml type 'List of {0}' does not support Clr type '{1}'.", m60528kk(), abstractC14068j5.mo48540du())) : new InvalidCastException(C13968ri.m65819k4("Xml type 'List of {0}' does not support a conversion from Clr type '{1}' to Clr type '{2}'.", m60528kk(), abstractC14068j5.mo48540du(), abstractC14068j52.mo48540du()));
    }

    /* JADX INFO: renamed from: wy */
    private List<String> m60673wy(String str) {
        return new List<>(AbstractC14092to.m67204k4((Object[]) C13850af.m65133v4(str)));
    }

    /* JADX INFO: renamed from: x1 */
    private IList m60674x1(Object obj, InterfaceC13980t6 interfaceC13980t6) {
        IList iList = (IList) C7019kk.m27452k4(obj, IList.class);
        if (iList != null) {
            Object[] objArr = new Object[iList.size()];
            for (int i = 0; i < iList.size(); i++) {
                objArr[i] = this.f43708ak.mo60121k4(iList.get_Item(i), AbstractC12972ev.f43665yj, interfaceC13980t6);
            }
            return AbstractC14092to.m67208k4((Object) objArr);
        }
        IEnumerable iEnumerable = (IEnumerable) C7019kk.m27452k4(obj, IEnumerable.class);
        ArrayList arrayList = new ArrayList();
        IEnumerator it = iEnumerable.iterator();
        while (it.hasNext()) {
            arrayList.addItem(this.f43708ak.mo60121k4(it.next(), AbstractC12972ev.f43665yj, interfaceC13980t6));
        }
        return arrayList;
    }

    public C13012h9(AbstractC12972ev abstractC12972ev) {
        super(abstractC12972ev);
        this.f43708ak = abstractC12972ev;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60121k4(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5 != null) {
            return mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
        }
        throw new ArgumentNullException("destinationType");
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12972ev
    /* JADX INFO: renamed from: x1 */
    public Object mo60547x1(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (obj.getClass().getName().startsWith("[")) {
            obj = AbstractC14092to.m67208k4(obj);
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43665yj;
        if (abstractC14068j5 == abstractC14068j52) {
            abstractC14068j5 = m60538to();
        }
        if (!C7019kk.m27469x1(obj, IEnumerable.class) || !m60670k4(abstractC14068j5)) {
            throw m60672kk(abstractC14068j5M66727k4, abstractC14068j5);
        }
        AbstractC14068j5 abstractC14068j53 = AbstractC12972ev.f43644fa;
        if (abstractC14068j5 == abstractC14068j53) {
            return abstractC14068j5M66727k4 == abstractC14068j53 ? obj : m60669k4((IEnumerable) obj, interfaceC13980t6);
        }
        if (abstractC14068j5M66727k4 == abstractC14068j53) {
            obj = m60673wy((String) obj);
        }
        if (abstractC14068j5.m66739b3()) {
            AbstractC14068j5 abstractC14068j5Mo48611c5 = abstractC14068j5.mo48611c5();
            if (abstractC14068j5Mo48611c5 == abstractC14068j52) {
                return m60671k4(Object.class, obj, interfaceC13980t6);
            }
            if (abstractC14068j5M66727k4 != abstractC14068j5) {
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43639bv) {
                    return m60671k4(Boolean.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43649ks) {
                    return m60671k4(Byte.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43660v4) {
                    return m60671k4(byte[].class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43637ar) {
                    return m60671k4(C14084qq.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43657um) {
                    return m60671k4(C14043ar.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43640c5) {
                    return m60671k4(C14046bv.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43661wl) {
                    return m60671k4(Double.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43654rv) {
                    return m60671k4(Short.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43647jd) {
                    return m60671k4(Integer.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43641ck) {
                    return m60671k4(Long.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43663x6) {
                    return m60671k4(Byte.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43653qq) {
                    return m60671k4(Float.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == abstractC14068j53) {
                    return m60671k4(String.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43638b3) {
                    return m60671k4(C14077m4.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43652ne) {
                    return m60671k4(Integer.class, obj, interfaceC13980t6);
                }
                if (abstractC14068j5Mo48611c5 != AbstractC12972ev.f43646ix && abstractC14068j5Mo48611c5 != AbstractC12972ev.f43656u4) {
                    if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43664yd) {
                        return m60671k4(C14062gk.class, obj, interfaceC13980t6);
                    }
                    if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43658up) {
                        return m60671k4(C12965eg.class, obj, interfaceC13980t6);
                    }
                    if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43650lr) {
                        return m60671k4(C13890ei.class, obj, interfaceC13980t6);
                    }
                    if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43659uz) {
                        return m60671k4(AbstractC10930to.class, obj, interfaceC13980t6);
                    }
                    if (abstractC14068j5Mo48611c5 == AbstractC12972ev.f43662wy) {
                        return m60671k4(AbstractC10925du.class, obj, interfaceC13980t6);
                    }
                    throw m60672kk(abstractC14068j5M66727k4, abstractC14068j5);
                }
                return m60671k4(Long.class, obj, interfaceC13980t6);
            }
        } else if (abstractC14068j5M66727k4 != m60538to() || abstractC14068j5M66727k4 == AbstractC12972ev.f43645h4) {
            return m60674x1(obj, interfaceC13980t6);
        }
        return obj;
    }

    public C13012h9(AbstractC12972ev abstractC12972ev, AbstractC14068j5 abstractC14068j5) {
        super(abstractC12972ev, abstractC14068j5);
        this.f43708ak = abstractC12972ev;
    }

    /* JADX INFO: renamed from: k4 */
    private String m60669k4(IEnumerable iEnumerable, InterfaceC13980t6 interfaceC13980t6) {
        C6765kp c6765kp = new C6765kp();
        IEnumerator it = iEnumerable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                if (c6765kp.m26807x1() != 0) {
                    c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                }
                c6765kp.m26792k4(this.f43708ak.mo60123k4(next, interfaceC13980t6));
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60670k4(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == AbstractC12972ev.f43642du || abstractC14068j5 == AbstractC12972ev.f43648kk || abstractC14068j5 == AbstractC12972ev.f43655to || abstractC14068j5 == AbstractC12972ev.f43644fa) {
            return true;
        }
        return abstractC14068j5.m66739b3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private <T> T[] m60671k4(Class<T> cls, Object obj, InterfaceC13980t6 interfaceC13980t6) {
        IList iList = (IList) C7019kk.m27452k4(obj, IList.class);
        if (iList != null) {
            T[] tArr = (T[]) ((Object[]) C7019kk.m27450k4((Class) cls, iList.size()));
            for (int i = 0; i < iList.size(); i++) {
                tArr[i] = this.f43708ak.mo60121k4(iList.get_Item(i), C7019kk.m27443k4((Class<?>) cls), interfaceC13980t6);
            }
            return tArr;
        }
        IEnumerable iEnumerable = (IEnumerable) C7019kk.m27452k4(obj, IEnumerable.class);
        List list = new List();
        IEnumerator<T> it = iEnumerable.iterator();
        while (it.hasNext()) {
            list.addItem(this.f43708ak.mo60121k4(it.next(), C7019kk.m27443k4((Class<?>) cls), interfaceC13980t6));
        }
        return (T[]) list.toArray();
    }
}
