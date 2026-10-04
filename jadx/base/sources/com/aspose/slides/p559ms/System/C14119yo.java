package com.aspose.slides.p559ms.System;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.yo */
/* JADX INFO: loaded from: classes5.dex */
public class C14119yo {

    /* JADX INFO: renamed from: x1 */
    static Hashtable f47384x1;

    /* JADX INFO: renamed from: h4 */
    private int f47385h4;

    /* JADX INFO: renamed from: kk */
    String f47386kk;

    /* JADX INFO: renamed from: k4 */
    static final Object f47382k4 = new Object();

    /* JADX INFO: renamed from: to */
    static C12380dy f47383to = new C12380dy("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?", 0);

    /* JADX INFO: renamed from: du */
    static C12380dy f47381du = new C12380dy("^(([^@]+)@)?(.*?)(:([0-9]+))?$");

    /* JADX INFO: renamed from: x1 */
    public static C14119yo m67564x1(String str) {
        if (str == null) {
            return null;
        }
        m67565x1();
        return (C14119yo) f47384x1.get_Item(C14113y2.m67398k4(str, C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public int m67566k4() {
        return this.f47385h4;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m67565x1() {
        if (f47384x1 != null) {
            return;
        }
        Hashtable hashtable = new Hashtable();
        m67563k4(hashtable, new C14075lr(), C14062gk.f47220x1, -1);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47214kk, 21);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47217to, 70);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47207du, 80);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47211h4, 443);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47215m9, 25);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47212jd, -1);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47206ck, -1);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47208dy, -1);
        m67563k4(hashtable, new C14075lr(), C14062gk.f47204c5, 119);
        m67563k4(hashtable, new C14075lr(), "ldap", 389);
        synchronized (f47382k4) {
            try {
                if (f47384x1 == null) {
                    f47384x1 = hashtable;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m67567k4(int i) {
        this.f47385h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67563k4(Hashtable hashtable, C14119yo c14119yo, String str, int i) {
        c14119yo.m67569k4(str);
        c14119yo.m67567k4(i);
        if (c14119yo instanceof C14055e0) {
            hashtable.addItem(str, c14119yo);
        } else {
            C14075lr c14075lr = new C14075lr();
            c14075lr.m67569k4(str);
            c14075lr.m67567k4(i);
            hashtable.addItem(str, c14075lr);
        }
        c14119yo.m67570k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m67568k4(C14062gk c14062gk, UriFormatException[] uriFormatExceptionArr) {
        if (C14113y2.m67363du(c14062gk.m66689ks(), this.f47386kk) || C18358t1.g.f56183c.equals(this.f47386kk)) {
            uriFormatExceptionArr[0] = null;
        } else {
            uriFormatExceptionArr[0] = new UriFormatException("The argument Uri's scheme does not match");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m67569k4(String str) {
        this.f47386kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m67570k4(String str, int i) {
    }
}
