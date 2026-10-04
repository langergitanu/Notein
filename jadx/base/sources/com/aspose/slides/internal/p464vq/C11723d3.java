package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.d3 */
/* JADX INFO: loaded from: classes4.dex */
public class C11723d3 implements IGenericEnumerable<C11709bg> {

    /* JADX INFO: renamed from: du */
    private static final char[] f39705du = {IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f39706dy = new C7017h4("TargetMode", "Target", "Type", "Id");

    /* JADX INFO: renamed from: h4 */
    private AbstractC11819tq f39707h4;

    /* JADX INFO: renamed from: k4 */
    private SortedList<String, C11709bg> f39708k4 = new SortedList<>();

    /* JADX INFO: renamed from: kk */
    private int f39709kk = 1;

    /* JADX INFO: renamed from: m9 */
    private Object f39710m9 = new Object();

    /* JADX INFO: renamed from: to */
    private int f39711to;

    /* JADX INFO: renamed from: x1 */
    private C11709bg f39712x1;

    public C11723d3(AbstractC11819tq abstractC11819tq) {
        this.f39707h4 = abstractC11819tq;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: kk */
    private List<C11709bg> m55299kk(C11801r5 c11801r5) {
        List<C11709bg> list;
        IGenericEnumerator<C11709bg> it;
        synchronized (this.f39710m9) {
            try {
                list = new List<>();
                if (C14113y2.m67429to(c11801r5.m55382k4(), IOUtils.DIR_SEPARATOR_UNIX) < 0) {
                    it = this.f39708k4.getValues().iterator();
                    while (it.hasNext()) {
                        try {
                            C11709bg next = it.next();
                            if (C14113y2.m67363du(next.m55295to(), c11801r5.m55382k4())) {
                                list.addItem(next);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } else {
                    it = this.f39708k4.getValues().iterator();
                    while (it.hasNext()) {
                        try {
                            C11709bg next2 = it.next();
                            if (C14113y2.m67363du(next2.m55291h4(), c11801r5.m55382k4())) {
                                list.addItem(next2);
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    private String m55300to() {
        String strM67408k4;
        do {
            int i = this.f39709kk;
            this.f39709kk = i + 1;
            strM67408k4 = C14113y2.m67408k4("rId", C14057f9.m66591x1(i));
        } while (this.f39708k4.containsKey(strM67408k4));
        return strM67408k4;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C11709bg> iterator() {
        return this.f39708k4.getValues().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m55301k4() {
        return this.f39708k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final C11709bg m55311x1(C11791os c11791os) {
        c11791os.m55422k4(true);
        return m55305k4(c11791os.m55372fa().mo55275x1().m55382k4(), c11791os.m55427x1(), (byte) -1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg m55302k4(C11791os c11791os) {
        IGenericEnumerator<C11709bg> it = this.f39708k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                C11709bg next = it.next();
                if (next.m55293kk() == c11791os) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC11819tq m55310kk() {
        return this.f39707h4;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: x1 */
    public final void m55312x1(C11801r5 c11801r5) {
        synchronized (this.f39710m9) {
            try {
                List<C11709bg> listM55299kk = m55299kk(c11801r5);
                List.Enumerator<C11709bg> it = listM55299kk.iterator();
                while (it.hasNext()) {
                    try {
                        this.f39708k4.removeItemByKey(it.next().m55289du());
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                this.f39711to += listM55299kk.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f39712x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg m55303k4(String str) {
        C11709bg c11709bg;
        synchronized (this.f39710m9) {
            C11709bg[] c11709bgArr = {null};
            this.f39708k4.tryGetValue(str, c11709bgArr);
            c11709bg = c11709bgArr[0];
        }
        return c11709bg;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: x1 */
    public final C11709bg[] m55313x1() {
        C11709bg[] c11709bgArr;
        synchronized (this.f39710m9) {
            try {
                List list = new List();
                IGenericEnumerator<C11709bg> it = this.f39708k4.getValues().iterator();
                while (it.hasNext()) {
                    try {
                        C11709bg next = it.next();
                        if (!next.m55290dy()) {
                            list.addItem(next);
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                c11709bgArr = (C11709bg[]) list.toArray(new C11709bg[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11709bgArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg m55304k4(String str, String str2) {
        return m55305k4(str, str2, (byte) -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C11709bg m55305k4(String str, String str2, byte b) {
        String str3;
        synchronized (this.f39710m9) {
            try {
                C11709bg c11709bg = this.f39712x1;
                if (c11709bg != null && C14113y2.m67363du(c11709bg.m55292k4(), str2) && C14113y2.m67363du(this.f39712x1.m55291h4(), str) && this.f39712x1.m55294m9() == b) {
                    return this.f39712x1;
                }
                IGenericEnumerator<KeyValuePair<String, C11709bg>> it = this.f39708k4.iterator();
                while (it.hasNext()) {
                    try {
                        C11709bg value = it.next().getValue();
                        if (C14113y2.m67363du(value.m55292k4(), str2) && C14113y2.m67363du(value.m55291h4(), str) && value.m55294m9() == b) {
                            this.f39712x1 = value;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return value;
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                boolean z = true;
                if (this.f39711to > this.f39708k4.size() / 5) {
                    this.f39711to = 0;
                    this.f39709kk = 1;
                }
                String strM55300to = m55300to();
                if (this.f39707h4.m55346k4()) {
                    String[] strArr = {null};
                    if (C14113y2.m67411k4(str) || !C3059ii.m12950k4(str, strArr)) {
                        z = false;
                    }
                    str3 = z ? strArr[0] : str;
                }
                C11709bg c11709bg2 = new C11709bg(this.f39707h4, strM55300to, str3, str2, b);
                this.f39712x1 = c11709bg2;
                this.f39708k4.set_Item(strM55300to, c11709bg2);
                return c11709bg2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg m55306k4(String str, String str2, String str3, byte b) {
        C11709bg c11709bg;
        synchronized (this.f39710m9) {
            try {
                if (this.f39708k4.containsKey(str)) {
                    throw new Exception();
                }
                c11709bg = new C11709bg(this.f39707h4, str, str2, str3, b);
                this.f39712x1 = c11709bg;
                this.f39708k4.set_Item(str, c11709bg);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11709bg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m55307k4(AbstractC3150x6 abstractC3150x6, String str) {
        String strM67443x1 = C14113y2.m67443x1(str, 0, C14113y2.m67430to(str, "/") + 1);
        C13991ub c13991ub = new C13991ub(abstractC3150x6, AbstractC6747ar.m26635ix());
        c13991ub.m66260kk(true);
        c13991ub.m66262x1(4);
        c13991ub.m66258k4(this.f39707h4.m55349x1() ? 1 : 0);
        c13991ub.mo65747x1(true);
        c13991ub.m65807up("Relationships");
        c13991ub.m65806to("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
        List.Enumerator it = new List(this.f39708k4.getValues()).iterator();
        while (it.hasNext()) {
            try {
                C11709bg c11709bg = (C11709bg) it.next();
                String strM55292k4 = c11709bg.m55292k4();
                if (c11709bg.m55294m9() != 1 && !C14113y2.m67432to(c11709bg.m55292k4(), "NULL", (short) 4) && C14113y2.m67367h4(c11709bg.m55292k4(), "://", (short) 4) < 0) {
                    if (strM55292k4 != null) {
                        int iM67507x1 = C14116yg.m67507x1(strM67443x1.length(), strM55292k4.length());
                        int i = 0;
                        for (int i2 = 0; i2 < iM67507x1 && strM67443x1.charAt(i2) == strM55292k4.charAt(i2); i2++) {
                            if (strM67443x1.charAt(i2) == '/') {
                                i = i2;
                            }
                        }
                        int length = strM67443x1.length() - 2;
                        C6765kp c6765kp = new C6765kp();
                        while (length > i) {
                            int i3 = length - 1;
                            if (strM67443x1.charAt(length) == '/') {
                                c6765kp.m26792k4("../");
                            }
                            length = i3;
                        }
                        c6765kp.m26793k4(strM55292k4, i + 1, (strM55292k4.length() - i) - 1);
                        strM55292k4 = c6765kp.toString();
                    }
                }
                c13991ub.m65807up("Relationship");
                c13991ub.m65806to("Id", c11709bg.m55289du());
                c13991ub.m65806to("Type", c11709bg.m55291h4());
                c13991ub.m65806to("Target", strM55292k4);
                if (c11709bg.m55294m9() != -1) {
                    c13991ub.m65806to("TargetMode", c11709bg.m55294m9() == 1 ? "External" : "Internal");
                }
                c13991ub.mo21898jd();
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c13991ub.mo21898jd();
        c13991ub.m66257k4();
        c13991ub.mo21896h4();
        c13991ub.mo21893du();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[LOOP:1: B:16:0x0039->B:75:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0083 A[EDGE_INSN: B:87:0x0083->B:37:0x0083 BREAK  A[LOOP:1: B:16:0x0039->B:75:0x0129], SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m55308k4(AbstractC13912i5 abstractC13912i5, String str) {
        int i;
        String str2;
        synchronized (this.f39710m9) {
            try {
                abstractC13912i5.m65487xk();
                while (abstractC13912i5.mo65039m9() != 3) {
                    if (abstractC13912i5.mo65028jd() == 1 && "http://schemas.openxmlformats.org/package/2006/relationships".equals(abstractC13912i5.mo65050up()) && "Relationship".equals(abstractC13912i5.mo65023fa()) && abstractC13912i5.mo65035kk()) {
                        byte b = -1;
                        String strMo65042rv = null;
                        String strMo65042rv2 = null;
                        String string = null;
                        while (true) {
                            int iM27428k4 = f39706dy.m27428k4(abstractC13912i5.mo65023fa());
                            if (iM27428k4 != 0) {
                                if (iM27428k4 == 1) {
                                    string = abstractC13912i5.mo65042rv();
                                } else if (iM27428k4 == 2) {
                                    strMo65042rv2 = abstractC13912i5.mo65042rv();
                                } else if (iM27428k4 == 3) {
                                    strMo65042rv = abstractC13912i5.mo65042rv();
                                }
                            } else if ("External".equals(abstractC13912i5.mo65042rv())) {
                                b = 1;
                            } else {
                                if ("Internal".equals(abstractC13912i5.mo65042rv())) {
                                    str2 = strMo65042rv;
                                    b = 0;
                                }
                                if (abstractC13912i5.mo65047to()) {
                                    break;
                                } else {
                                    strMo65042rv = str2;
                                }
                            }
                            str2 = strMo65042rv;
                            if (abstractC13912i5.mo65047to()) {
                            }
                        }
                        if (str2 != null && strMo65042rv2 != null && string != null) {
                            if (b != 1 && string.length() > 0 && !C14113y2.m67432to(string, "NULL", (short) 4) && string.charAt(0) != '/' && C14113y2.m67367h4(string, "://", (short) 4) < 0) {
                                String[] strArrM67369h4 = C14113y2.m67369h4(C14113y2.m67408k4(str, "/", string), f39705du);
                                for (int i2 = 0; i2 < strArrM67369h4.length; i2++) {
                                    if ("..".equals(strArrM67369h4[i2])) {
                                        strArrM67369h4[i2] = null;
                                        int i3 = i2 - 1;
                                        while (i3 > 0 && strArrM67369h4[i3] == null) {
                                            i3--;
                                        }
                                        strArrM67369h4[i3] = null;
                                    }
                                }
                                C6765kp c6765kp = new C6765kp();
                                for (String str3 : strArrM67369h4) {
                                    if (!C14113y2.m67411k4(str3)) {
                                        c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
                                        c6765kp.m26792k4(str3);
                                    }
                                }
                                if (m55310kk().m55392h4(c6765kp.toString()) != null) {
                                    string = c6765kp.toString();
                                }
                            }
                            this.f39708k4.addItem(str2, new C11709bg(this.f39707h4, str2, m55310kk().m55342k4(strMo65042rv2), string, b));
                        }
                        abstractC13912i5.mo65020du();
                    }
                    abstractC13912i5.mo65026h4();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg[] m55309k4(C11801r5 c11801r5) {
        C11709bg[] array;
        synchronized (this.f39710m9) {
            array = m55299kk(c11801r5).toArray(new C11709bg[0]);
        }
        return array;
    }
}
