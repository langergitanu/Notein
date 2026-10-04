package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C13265wl extends C12904b3 {

    /* JADX INFO: renamed from: ks */
    private int f44445ks;

    /* JADX INFO: renamed from: yj */
    private AbstractC13279x6 f44446yj;

    public C13265wl(AbstractC13279x6 abstractC13279x6, int i) {
        this.f44446yj = abstractC13279x6;
        this.f44445ks = i;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: c5 */
    public int mo60016c5() {
        return this.f44446yj.mo60016c5();
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return this.f44446yj.mo60020fa();
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return mo60046x6();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60027k4(Object obj, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        RuntimeException runtimeExceptionMo60131x1;
        RuntimeException runtimeExceptionMo60131x12;
        RuntimeException runtimeExceptionM60173k4;
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        String str = (String) C7019kk.m27452k4(obj, String.class);
        objArr[0] = null;
        if (str != null) {
            return mo60028k4(str, abstractC13883dt, interfaceC13980t6, objArr);
        }
        try {
            Object objMo60121k4 = mo60019dy().mo60121k4(obj, mo60022jd(), interfaceC13980t6);
            AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27452k4(objMo60121k4, AbstractC14092to.class);
            boolean zMo60036yj = this.f44446yj.mo60036yj();
            boolean zMo60032ks = this.f44446yj.mo60032ks();
            AbstractC12942dc abstractC12942dcMo60043m9 = this.f44446yj.mo60043m9();
            AbstractC12974ex abstractC12974exMo60019dy = this.f44446yj.mo60019dy();
            for (int i = 0; i < abstractC14092to.m67265du(); i++) {
                Object objM67275kk = abstractC14092to.m67275kk(i);
                if (zMo60036yj && (runtimeExceptionM60173k4 = abstractC12942dcMo60043m9.m60173k4(new String[]{(String) abstractC12974exMo60019dy.mo60121k4(objM67275kk, C7019kk.m27443k4((Class<?>) String.class), interfaceC13980t6)}, this.f44446yj)) != null) {
                    return runtimeExceptionM60173k4;
                }
                if (zMo60032ks && (runtimeExceptionMo60131x12 = abstractC12942dcMo60043m9.mo60131x1(objM67275kk, this.f44446yj)) != null) {
                    return runtimeExceptionMo60131x12;
                }
            }
            if (mo60036yj()) {
                RuntimeException runtimeExceptionM60173k42 = AbstractC13279x6.f44467c5.m60173k4(new String[]{(String) mo60019dy().mo60121k4(objMo60121k4, C7019kk.m27443k4((Class<?>) String.class), interfaceC13980t6)}, this);
                if (runtimeExceptionM60173k42 != null) {
                    return runtimeExceptionM60173k42;
                }
            }
            if (mo60032ks() && (runtimeExceptionMo60131x1 = AbstractC13279x6.f44467c5.mo60131x1(objMo60121k4, this)) != null) {
                return runtimeExceptionMo60131x1;
            }
            objArr[0] = objMo60121k4;
            return null;
        } catch (ArgumentException e) {
            e = e;
            return e;
        } catch (FormatException e2) {
            e = e2;
            return e;
        } catch (OverflowException e3) {
            e = e3;
            return e;
        } catch (ClassCastException e4) {
            e = e4;
            return e;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return AbstractC13279x6.f44467c5;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return 63;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27458kk(obj, AbstractC14092to.class);
        AbstractC14092to abstractC14092to2 = (AbstractC14092to) C7019kk.m27458kk(obj2, AbstractC14092to.class);
        if (abstractC14092to.m67265du() != abstractC14092to2.m67265du()) {
            return -1;
        }
        C12965eg[] c12965egArr = (C12965eg[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to), C12965eg[].class);
        if (c12965egArr == null) {
            for (int i = 0; i < abstractC14092to.m67265du(); i++) {
                if (this.f44446yj.mo60034x1(abstractC14092to.m67275kk(i), abstractC14092to2.m67275kk(i)) != 0) {
                    return -1;
                }
            }
            return 0;
        }
        C12965eg[] c12965egArr2 = (C12965eg[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to2), C12965eg[].class);
        for (int i2 = 0; i2 < c12965egArr.length; i2++) {
            C12943dd c12943ddM60390x1 = c12965egArr[i2].m60390x1();
            if (c12943ddM60390x1 != c12965egArr2[i2].m60390x1() || !c12943ddM60390x1.m60211bz().mo60031k4(c12965egArr[i2].m60389to(), c12965egArr2[i2].m60389to())) {
                return -1;
            }
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return this.f44446yj.mo60046x6();
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        AbstractC14068j5 abstractC14068j5Mo60022jd;
        objArr[0] = null;
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44467c5.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        ArrayList arrayList = new ArrayList();
        int iMo60017ck = this.f44446yj.mo60017ck();
        String[] strArrM65133v4 = C13850af.m65133v4(str2);
        if (iMo60017ck == 2) {
            Object obj = null;
            for (String str3 : strArrM65133v4) {
                Object[] objArr2 = {obj};
                RuntimeException runtimeExceptionMo60028k4 = this.f44446yj.mo60028k4(str3, abstractC13883dt, interfaceC13980t6, objArr2);
                obj = objArr2[0];
                if (runtimeExceptionMo60028k4 != null) {
                    return runtimeExceptionMo60028k4;
                }
                C13165qa c13165qa = (C13165qa) obj;
                arrayList.addItem(new C12965eg(c13165qa.m61418k4(), c13165qa.m61419x1(), interfaceC13980t6));
            }
            abstractC14068j5Mo60022jd = C7019kk.m27443k4((Class<?>) C12965eg.class);
        } else {
            for (String str4 : strArrM65133v4) {
                RuntimeException runtimeExceptionMo60028k42 = this.f44446yj.mo60028k4(str4, abstractC13883dt, interfaceC13980t6, objArr);
                if (runtimeExceptionMo60028k42 != null) {
                    return runtimeExceptionMo60028k42;
                }
                arrayList.addItem(objArr[0]);
            }
            abstractC14068j5Mo60022jd = this.f44446yj.mo60022jd();
        }
        AbstractC14092to array = arrayList.toArray(abstractC14068j5Mo60022jd);
        if (arrayList.size() < this.f44445ks) {
            return new XmlSchemaException("The attribute value cannot be empty.", C14113y2.f47374k4);
        }
        RuntimeException runtimeExceptionMo60131x1 = AbstractC13279x6.f44467c5.mo60131x1(array, this);
        if (runtimeExceptionMo60131x1 != null) {
            return runtimeExceptionMo60131x1;
        }
        objArr[0] = array;
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        C13164q9 c13164q9;
        C13164q9 c13164q9M61676kk;
        C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) c12943dd, C12969en.class);
        if (c12969en != null) {
            do {
                c13164q9 = (C13164q9) C7019kk.m27452k4((Object) c12969en.m60231yd(), C13164q9.class);
                if (c13164q9 != null || (c12969en = (C12969en) C7019kk.m27452k4((Object) c12969en.m60231yd(), C12969en.class)) == null) {
                    break;
                }
            } while (c12969en != C12969en.m60399k4());
        } else {
            c13164q9 = (C13164q9) C7019kk.m27452k4((Object) c12943dd, C13164q9.class);
        }
        if (c13164q9 != null) {
            do {
                C13263wh c13263wh = (C13263wh) C7019kk.m27452k4((Object) c13164q9.m61416k4(), C13263wh.class);
                if (c13263wh == null) {
                    c13164q9 = (C13164q9) C7019kk.m27452k4((Object) c13164q9.m60231yd(), C13164q9.class);
                    if (c13164q9 == null) {
                        break;
                    }
                } else {
                    c13164q9M61676kk = c13263wh.m61657h4();
                    break;
                }
            } while (c13164q9 != AbstractC13279x6.m61669k4());
            c13164q9M61676kk = null;
        } else {
            c13164q9M61676kk = null;
        }
        if (c13164q9M61676kk == null) {
            c13164q9M61676kk = AbstractC13279x6.m61676kk(c12943dd.m60211bz().mo60020fa());
        }
        return C13012h9.m60668k4(c13164q9M61676kk.m60215g8());
    }
}
