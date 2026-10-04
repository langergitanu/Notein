package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.y9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13301y9 extends C12904b3 {

    /* JADX INFO: renamed from: rv */
    private C13164q9[] f44606rv;

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44605yj = C7019kk.m27443k4((Class<?>) Object.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44604ks = C7019kk.m27443k4((Class<?>) Object[].class);

    public C13301y9(C13164q9[] c13164q9Arr) {
        this.f44606rv = c13164q9Arr;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 10;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44605yj;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60027k4(Object obj, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        C13164q9 c13164q9;
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        objArr[0] = null;
        String str = (String) C7019kk.m27452k4(obj, String.class);
        if (str != null) {
            return mo60028k4(str, abstractC13883dt, interfaceC13980t6, objArr);
        }
        int i = 0;
        Object obj2 = null;
        while (true) {
            C13164q9[] c13164q9Arr = this.f44606rv;
            if (i >= c13164q9Arr.length) {
                c13164q9 = null;
                break;
            }
            Object[] objArr2 = {obj2};
            boolean z = c13164q9Arr[i].m60211bz().mo60027k4(obj, abstractC13883dt, interfaceC13980t6, objArr2) == null;
            obj2 = objArr2[0];
            if (z) {
                c13164q9 = this.f44606rv[i];
                break;
            }
            i++;
        }
        if (obj2 == null) {
            return new XmlSchemaException("The value '{0}' is not valid according to any of the memberTypes of the union.", obj.toString());
        }
        try {
            if (mo60036yj()) {
                RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44470ck.m60173k4(new String[]{(String) mo60019dy().mo60121k4(obj2, C7019kk.m27443k4((Class<?>) String.class), interfaceC13980t6)}, this);
                if (runtimeExceptionM60173k4 != null) {
                    return runtimeExceptionM60173k4;
                }
            }
            objArr[0] = new C13165qa(c13164q9, obj2);
            if (mo60032ks()) {
                RuntimeException runtimeExceptionMo60131x1 = AbstractC13279x6.f44470ck.mo60131x1(objArr[0], this);
                if (runtimeExceptionMo60131x1 != null) {
                    return runtimeExceptionMo60131x1;
                }
            }
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
        return AbstractC13279x6.f44470ck;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return 24;
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m61768qq() {
        int i = 0;
        while (true) {
            C13164q9[] c13164q9Arr = this.f44606rv;
            if (i >= c13164q9Arr.length) {
                return true;
            }
            if (c13164q9Arr[i].m60211bz().mo60017ck() == 1) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: wl */
    public final C13164q9[] m61769wl() {
        return this.f44606rv;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        C13164q9 c13164q9M61418k4;
        C13165qa c13165qa = (C13165qa) C7019kk.m27452k4(obj, C13165qa.class);
        C13165qa c13165qa2 = (C13165qa) C7019kk.m27452k4(obj2, C13165qa.class);
        if (c13165qa == null || c13165qa2 == null || (c13164q9M61418k4 = c13165qa.m61418k4()) != c13165qa2.m61418k4()) {
            return -1;
        }
        return c13164q9M61418k4.m60211bz().mo60034x1(c13165qa.m61419x1(), c13165qa2.m61419x1());
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44604ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        C13164q9 c13164q9;
        objArr[0] = null;
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44470ck.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        int i = 0;
        while (true) {
            C13164q9[] c13164q9Arr = this.f44606rv;
            if (i >= c13164q9Arr.length) {
                c13164q9 = null;
                break;
            }
            if (c13164q9Arr[i].m60211bz().mo60028k4(str2, abstractC13883dt, interfaceC13980t6, objArr) == null) {
                c13164q9 = this.f44606rv[i];
                break;
            }
            i++;
        }
        if (c13164q9 == null) {
            return new XmlSchemaException("The value '{0}' is not valid according to any of the memberTypes of the union.", str2);
        }
        C13165qa c13165qa = new C13165qa(c13164q9, objArr[0]);
        objArr[0] = c13165qa;
        RuntimeException runtimeExceptionMo60131x1 = AbstractC13279x6.f44470ck.mo60131x1(c13165qa, this);
        if (runtimeExceptionMo60131x1 != null) {
            return runtimeExceptionMo60131x1;
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C13157pq.m61408k4(c12943dd);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61767k4(AbstractC13279x6 abstractC13279x6) {
        int i = 0;
        while (true) {
            C13164q9[] c13164q9Arr = this.f44606rv;
            if (i >= c13164q9Arr.length) {
                return false;
            }
            if (abstractC13279x6.mo60030k4(c13164q9Arr[i].m60211bz())) {
                return true;
            }
            i++;
        }
    }
}
