package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.yj */
/* JADX INFO: loaded from: classes5.dex */
class C11995yj implements InterfaceC11918ak {

    /* JADX INFO: renamed from: k4 */
    static final Hashtable f40481k4 = Hashtable.sync(new Hashtable());

    /* JADX INFO: renamed from: x1 */
    public static Hashtable m56289x1() {
        Hashtable hashtable = f40481k4;
        synchronized (hashtable.getSyncRoot()) {
            m56288k4(hashtable.size());
        }
        return hashtable;
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: k4 */
    public C11986x1 mo15100k4(String str, AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        C11975um c11975um;
        if (interfaceC11926c6 == null || str == null || C14113y2.m67364dy(C14113y2.m67368h4(C14113y2.m67440x1(str)), "digest") == -1 || (c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994yg, C11975um.class)) == null) {
            return null;
        }
        C11965rv c11965rv = new C11965rv();
        if (!c11965rv.m56105k4(str)) {
            return null;
        }
        int iHashCode = (c11975um.m56209k4().hashCode() ^ interfaceC11926c6.hashCode()) ^ c11965rv.m56106kk().hashCode();
        C11965rv c11965rv2 = (C11965rv) m56289x1().get_Item(C7019kk.m27466x1(iHashCode));
        boolean z = c11965rv2 == null;
        if (!z) {
            if (!c11965rv2.m56105k4(str)) {
                return null;
            }
            c11965rv = c11965rv2;
        }
        if (z) {
            m56289x1().addItem(C7019kk.m27466x1(iHashCode), c11965rv);
        }
        return c11965rv.m56103k4(abstractC11994yg, interfaceC11926c6);
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: k4 */
    public String mo15101k4() {
        return "Digest";
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: x1 */
    public C11986x1 mo15102x1(AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        C11975um c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994yg, C11975um.class);
        if (c11975um == null || interfaceC11926c6 == null) {
            return null;
        }
        C11965rv c11965rv = (C11965rv) m56289x1().get_Item(C7019kk.m27466x1(c11975um.m56209k4().hashCode() ^ interfaceC11926c6.hashCode()));
        if (c11965rv == null) {
            return null;
        }
        return c11965rv.m56103k4(abstractC11994yg, interfaceC11926c6);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m56288k4(int i) {
        if (i < 10) {
            return;
        }
        C14084qq c14084qqClone = C14084qq.f47293kk.Clone();
        C14084qq c14084qqClone2 = C14084qq.m67081jd().Clone();
        Iterator<T> it = f40481k4.getKeys().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            C11965rv c11965rv = (C11965rv) f40481k4.get_Item(C7019kk.m27466x1(iIntValue));
            if (C14084qq.m67110kk(c11965rv.m56107m9(), c14084qqClone) && C14084qq.m67073c5(c11965rv.m56107m9(), c14084qqClone2).m66813du() > 6000000000L) {
                c11965rv.m56107m9().CloneTo(c14084qqClone);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addItem(C7019kk.m27466x1(iIntValue));
            }
        }
        if (arrayList != null) {
            Iterator<E> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f40481k4.removeItem(C7019kk.m27466x1(((Integer) it2.next()).intValue()));
            }
        }
    }
}
