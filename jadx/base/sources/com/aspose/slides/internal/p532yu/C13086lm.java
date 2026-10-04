package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.lm */
/* JADX INFO: loaded from: classes5.dex */
public class C13086lm implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private int f44079k4;

    /* JADX INFO: renamed from: kk */
    private String f44080kk;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f44081x1;

    public C13086lm() {
        this.f44079k4 = 0;
        this.f44081x1 = null;
    }

    /* JADX INFO: renamed from: du */
    public Object m61105du() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C13086lm m61106k4() {
        C13086lm c13086lm = (C13086lm) m61105du();
        if (this.f44079k4 == 2) {
            c13086lm.f44081x1 = (Hashtable) this.f44081x1.deepClone();
        }
        return c13086lm;
    }

    /* JADX INFO: renamed from: kk */
    public final String m61108kk() {
        return this.f44080kk;
    }

    /* JADX INFO: renamed from: to */
    public final ICollection m61109to() {
        if (this.f44079k4 == 2) {
            return this.f44081x1.getKeys();
        }
        throw new InvalidOperationException();
    }

    public String toString() {
        int i = this.f44079k4;
        if (i == 0) {
            return "##any";
        }
        boolean z = true;
        if (i == 1) {
            return "##other";
        }
        if (i != 2) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        Iterator it = this.f44081x1.getKeys().iterator();
        while (it.hasNext()) {
            try {
                String str = (String) it.next();
                if (z) {
                    z = false;
                } else {
                    c6765kp.m26792k4(" ");
                }
                if (C14113y2.m67363du(str, this.f44080kk)) {
                    str = "##targetNamespace";
                } else if (str.length() == 0) {
                    str = "##local";
                }
                c6765kp.m26792k4(str);
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m61110x1() {
        return this.f44079k4;
    }

    public C13086lm(String str, String str2) {
        Hashtable hashtable;
        String str3;
        this.f44079k4 = 0;
        this.f44081x1 = null;
        this.f44080kk = str2;
        String strM67440x1 = C14113y2.m67440x1(str);
        if ("##any".equals(strM67440x1) || strM67440x1.length() == 0) {
            this.f44079k4 = 0;
            return;
        }
        if ("##other".equals(strM67440x1)) {
            this.f44079k4 = 1;
            return;
        }
        this.f44079k4 = 2;
        this.f44081x1 = new Hashtable();
        String[] strArrM65133v4 = C13850af.m65133v4(strM67440x1);
        for (int i = 0; i < strArrM65133v4.length; i++) {
            if ("##local".equals(strArrM65133v4[i])) {
                hashtable = this.f44081x1;
                str3 = C14113y2.f47374k4;
            } else if ("##targetNamespace".equals(strArrM65133v4[i])) {
                this.f44081x1.set_Item(str2, str2);
            } else {
                C13850af.m65125qq(strArrM65133v4[i]);
                hashtable = this.f44081x1;
                str3 = strArrM65133v4[i];
            }
            hashtable.set_Item(str3, str3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C13086lm m61100k4(C13086lm c13086lm) {
        if (this.f44081x1.contains(c13086lm.f44080kk)) {
            return this.f44081x1.contains(C14113y2.f47374k4) ? new C13086lm() : new C13086lm("##other", C14113y2.f47374k4);
        }
        if (this.f44081x1.contains(C14113y2.f47374k4)) {
            return null;
        }
        return c13086lm.m61106k4();
    }

    /* JADX INFO: renamed from: x1 */
    public static C13086lm m61103x1(C13086lm c13086lm, C13086lm c13086lm2, boolean z) {
        int i = c13086lm.f44079k4;
        if (i == 0) {
            return c13086lm2.m61106k4();
        }
        int i2 = c13086lm2.f44079k4;
        if (i2 == 0) {
            return c13086lm.m61106k4();
        }
        if (i == 2 && i2 == 1) {
            C13086lm c13086lmM61106k4 = c13086lm.m61106k4();
            c13086lmM61106k4.m61104x1(c13086lm2.f44080kk);
            if (!z) {
                c13086lmM61106k4.m61104x1(C14113y2.f47374k4);
            }
            return c13086lmM61106k4;
        }
        if (i == 1 && i2 == 2) {
            C13086lm c13086lmM61106k42 = c13086lm2.m61106k4();
            c13086lmM61106k42.m61104x1(c13086lm.f44080kk);
            if (!z) {
                c13086lmM61106k42.m61104x1(C14113y2.f47374k4);
            }
            return c13086lmM61106k42;
        }
        if (i != 2 || i2 != 2) {
            if (i != 1 || i2 != 1) {
                return null;
            }
            if (C14113y2.m67363du(c13086lm.f44080kk, c13086lm2.f44080kk)) {
                return c13086lm.m61106k4();
            }
            if (z) {
                return null;
            }
            if (C14113y2.m67363du(c13086lm.f44080kk, C14113y2.f47374k4)) {
                return c13086lm2.m61106k4();
            }
            if (C14113y2.m67363du(c13086lm2.f44080kk, C14113y2.f47374k4)) {
                return c13086lm.m61106k4();
            }
            return null;
        }
        c13086lm.m61106k4();
        C13086lm c13086lm3 = new C13086lm();
        c13086lm3.f44079k4 = 2;
        c13086lm3.f44081x1 = new Hashtable();
        Iterator it = c13086lm.f44081x1.getKeys().iterator();
        while (it.hasNext()) {
            try {
                String str = (String) it.next();
                if (c13086lm2.f44081x1.contains(str)) {
                    c13086lm3.f44081x1.addItem(str, str);
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return c13086lm3;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13086lm m61101k4(C13086lm c13086lm, C13086lm c13086lm2, boolean z) {
        int i;
        int i2 = c13086lm.f44079k4;
        if (i2 != 0 && (i = c13086lm2.f44079k4) != 0) {
            if (i2 == 2 && i == 2) {
                C13086lm c13086lmM61106k4 = c13086lm.m61106k4();
                Iterator it = c13086lm2.f44081x1.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        String str = (String) it.next();
                        c13086lmM61106k4.f44081x1.set_Item(str, str);
                    } finally {
                        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                }
                return c13086lmM61106k4;
            }
            if (i2 == 1 && i == 1) {
                return C14113y2.m67363du(c13086lm.f44080kk, c13086lm2.f44080kk) ? c13086lm.m61106k4() : new C13086lm("##other", C14113y2.f47374k4);
            }
            if (i2 == 2 && i == 1) {
                return z ? c13086lm.f44081x1.contains(c13086lm2.f44080kk) ? new C13086lm() : c13086lm2.m61106k4() : !C14113y2.m67363du(c13086lm2.f44080kk, C14113y2.f47374k4) ? c13086lm.m61100k4(c13086lm2) : c13086lm.f44081x1.contains(C14113y2.f47374k4) ? new C13086lm() : new C13086lm("##other", C14113y2.f47374k4);
            }
            if (i == 2 && i2 == 1) {
                return z ? c13086lm2.f44081x1.contains(c13086lm2.f44080kk) ? new C13086lm() : c13086lm.m61106k4() : !C14113y2.m67363du(c13086lm.f44080kk, C14113y2.f47374k4) ? c13086lm2.m61100k4(c13086lm) : c13086lm2.f44081x1.contains(C14113y2.f47374k4) ? new C13086lm() : new C13086lm("##other", C14113y2.f47374k4);
            }
            return null;
        }
        return new C13086lm();
    }

    /* JADX INFO: renamed from: x1 */
    private void m61104x1(String str) {
        if (this.f44081x1.get_Item(str) != null) {
            this.f44081x1.removeItem(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m61102k4(C13086lm c13086lm, C13086lm c13086lm2) {
        int i = c13086lm2.f44079k4;
        if (i == 0) {
            return true;
        }
        int i2 = c13086lm.f44079k4;
        if (i2 == 1 && i == 1) {
            return C14113y2.m67363du(c13086lm2.f44080kk, c13086lm.f44080kk);
        }
        if (i2 != 2) {
            return false;
        }
        Hashtable hashtable = c13086lm.f44081x1;
        if (i == 1) {
            return !hashtable.contains(c13086lm2.f44080kk);
        }
        Iterator it = hashtable.getKeys().iterator();
        while (it.hasNext()) {
            try {
                if (!c13086lm2.f44081x1.contains((String) it.next())) {
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61107k4(C13890ei c13890ei) {
        return mo61008k4(c13890ei.m65284k4());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo61008k4(String str) {
        int i = this.f44079k4;
        if (i != 0) {
            return i != 1 ? i == 2 && this.f44081x1.get_Item(str) != null : (C14113y2.m67363du(str, this.f44080kk) || str.length() == 0) ? false : true;
        }
        return true;
    }
}
