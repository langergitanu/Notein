package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14061gi;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;
import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ae */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12892ae {
    /* JADX INFO: renamed from: h4 */
    public static AbstractC12892ae m60009h4(int i) {
        return AbstractC13279x6.m61672k4(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        r1 = ((com.aspose.slides.p559ms.System.InterfaceC14061gi) r1).mo66517k4("", com.aspose.slides.internal.p463vm.C11697x1.m55250kk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r0.m26792k4(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r6.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r0.m26792k4(" , ");
        r1 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27469x1(r1, com.aspose.slides.p559ms.System.InterfaceC14061gi.class) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r0.m26792k4("}");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27469x1(r1, com.aspose.slides.p559ms.System.InterfaceC14061gi.class) != false) goto L10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0064 -> B:10:0x003e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m60010k4(Object obj) {
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        String str = C14113y2.f47374k4;
        if (abstractC14068j5M66727k4 != C7019kk.m27443k4((Class<?>) IEnumerable.class) || abstractC14068j5M66727k4 == C7019kk.m27443k4((Class<?>) String.class)) {
            return C7019kk.m27469x1(obj, InterfaceC14061gi.class) ? ((InterfaceC14061gi) obj).mo66517k4("", C11697x1.m55250kk()) : obj.toString();
        }
        C6765kp c6765kp = new C6765kp();
        IEnumerator it = ((IEnumerable) C7019kk.m27452k4(obj, IEnumerable.class)).iterator();
        if (!it.hasNext()) {
            return str;
        }
        c6765kp.m26792k4("{");
        Object next = it.next();
    }

    /* JADX INFO: renamed from: m9 */
    public static AbstractC12892ae m60012m9(int i) {
        return AbstractC13279x6.m61682x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC12892ae m60013x1(String str) {
        return AbstractC13279x6.m61673k4(str);
    }

    /* JADX INFO: renamed from: ar */
    public final String m60015ar() {
        String str = C14113y2.f47374k4;
        int iMo60020fa = mo60020fa();
        int iMo60017ck = mo60017ck();
        return iMo60017ck != 0 ? iMo60017ck != 1 ? iMo60017ck != 2 ? str : "Union" : iMo60020fa == 10 ? "List of Union" : C14113y2.m67408k4("List of ", m60018du(iMo60020fa)) : iMo60020fa == 10 ? "anySimpleType" : m60018du(iMo60020fa);
    }

    /* JADX INFO: renamed from: c5 */
    public abstract int mo60016c5();

    /* JADX INFO: renamed from: ck */
    public int mo60017ck() {
        return 0;
    }

    /* JADX INFO: renamed from: du */
    public final String m60018du(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "AnyType";
        }
        if (i == 10) {
            return "AnyAtomicType";
        }
        switch (i) {
            case 12:
                return "String";
            case 13:
                return "Boolean";
            case 14:
                return "Decimal";
            case 15:
                return "Float";
            case 16:
                return "Double";
            case 17:
                return "Duration";
            case 18:
                return "DateTime";
            case 19:
                return PerfConstants.CodeMarkerParameters.TIME;
            case 20:
                return "Date";
            case 21:
                return "GYearMonth";
            case 22:
                return "GYear";
            case 23:
                return "GMonthDay";
            case 24:
                return "GDay";
            case 25:
                return "GMonth";
            case 26:
                return "HexBinary";
            case 27:
                return "Base64Binary";
            case 28:
                return "AnyUri";
            case 29:
                return "QName";
            case 30:
                return "Notation";
            case 31:
                return "NormalizedString";
            case 32:
                return "Token";
            case 33:
                return "Language";
            case 34:
                return "NmToken";
            case 35:
                return "Name";
            case 36:
                return "NCName";
            case 37:
                return "Id";
            case 38:
                return "Idref";
            case 39:
                return "Entity";
            case 40:
                return "Integer";
            case 41:
                return "NonPositiveInteger";
            case 42:
                return "NegativeInteger";
            case 43:
                return "Long";
            case 44:
                return "Int";
            case 45:
                return "Short";
            case 46:
                return "Byte";
            case 47:
                return "NonNegativeInteger";
            case 48:
                return "UnsignedLong";
            case 49:
                return "UnsignedInt";
            case 50:
                return "UnsignedShort";
            case 51:
                return "UnsignedByte";
            case 52:
                return "PositiveInteger";
            default:
                return C14042ak.m66410k4(C12982fb.class, i);
        }
    }

    /* JADX INFO: renamed from: dy */
    public abstract AbstractC12974ex mo60019dy();

    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 0;
    }

    /* JADX INFO: renamed from: ix */
    public abstract int mo60021ix();

    /* JADX INFO: renamed from: jd */
    public abstract AbstractC14068j5 mo60022jd();

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC12892ae mo60023k4(C12908be c12908be, AbstractC13883dt abstractC13883dt, C12943dd c12943dd);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC12892ae mo60024k4(C12943dd c12943dd);

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo60025k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6);

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo60026k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, boolean z);

    /* JADX INFO: renamed from: k4 */
    public abstract RuntimeException mo60027k4(Object obj, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr);

    /* JADX INFO: renamed from: k4 */
    public abstract RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo60029k4(C13005gv c13005gv, AbstractC13018hl abstractC13018hl);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo60031k4(Object obj, Object obj2);

    /* JADX INFO: renamed from: ks */
    public abstract boolean mo60032ks();

    /* JADX INFO: renamed from: up */
    public abstract C12909bg mo60033up();

    /* JADX INFO: renamed from: x1 */
    public abstract int mo60034x1(Object obj, Object obj2);

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo60035x1(AbstractC12892ae abstractC12892ae);

    /* JADX INFO: renamed from: yj */
    public abstract boolean mo60036yj();

    /* JADX INFO: renamed from: k4 */
    public static String m60011k4(String str, AbstractC13883dt abstractC13883dt, C13058k1 c13058k1) {
        boolean z = true;
        int i = 5;
        if (str.length() <= 5 || !C14113y2.m67412k4(str, "uuid:", (short) 4)) {
            if (str.length() <= 9 || !C14113y2.m67412k4(str, "urn:uuid:", (short) 4)) {
                z = false;
            } else {
                i = 9;
            }
        }
        if (z) {
            str = abstractC13883dt.mo65266k4(C14113y2.m67408k4(C14113y2.m67443x1(str, 0, i), C14113y2.m67444x1(OooO0OO.OooO00o(i, i, str, str), C11697x1.m55250kk())));
        }
        return (C13851ai.m65152k4(c13058k1.f44010x1, str) || C13851ai.m65152k4(c13058k1.f43946kk, str)) ? c13058k1.f43944k4 : C13851ai.m65152k4(c13058k1.f43955m9, str) ? c13058k1.f43931h4 : str;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC12892ae m60014x1(C13164q9[] c13164q9Arr, C12943dd c12943dd) {
        return AbstractC13279x6.m61674k4(c13164q9Arr, c12943dd);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo60030k4(AbstractC12892ae abstractC12892ae) {
        return false;
    }
}
