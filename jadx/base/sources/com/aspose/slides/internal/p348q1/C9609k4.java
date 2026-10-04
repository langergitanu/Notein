package com.aspose.slides.internal.p348q1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.q1.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9609k4<T> extends List<T> {

    /* JADX INFO: renamed from: k4 */
    private boolean f34755k4;

    /* JADX INFO: renamed from: kk */
    private C7182dy f34756kk;

    /* JADX INFO: renamed from: to */
    private C7186k4 f34757to;

    /* JADX INFO: renamed from: x1 */
    private C7187kk f34758x1;

    public C9609k4() {
        m46931to(new C7186k4());
    }

    /* JADX INFO: renamed from: kk */
    public static List<String> m46928kk(C7186k4 c7186k4) {
        if (c7186k4 == null) {
            return null;
        }
        List list = new List();
        for (int i = 0; i < c7186k4.m27778k4(); i++) {
            list.addItem(((C7182dy) c7186k4.m27787x1(i)).m27766k4());
        }
        return new C9609k4(list, c7186k4);
    }

    /* JADX INFO: renamed from: to */
    private static <T> C7186k4 m46930to(List<T> list) {
        C7185jd c7185jdM27775dy;
        C7185jd c7181du;
        long jLongValue;
        C7186k4 c7186k4 = new C7186k4();
        for (int i = 0; i < list.size(); i++) {
            T t = list.get_Item(i);
            if (C7019kk.m27469x1(t, String.class)) {
                c7181du = new C7191up((String) t);
            } else {
                if (C7019kk.m27469x1(t, Integer.class)) {
                    jLongValue = C14080ne.m66845c5((Integer) C7019kk.m27464to(t, Integer.TYPE));
                } else if (C7019kk.m27469x1(t, Long.class)) {
                    jLongValue = ((Long) C7019kk.m27464to(t, Long.TYPE)).longValue();
                } else if (C7019kk.m27469x1(t, Float.class)) {
                    c7181du = new C7181du(((Float) C7019kk.m27464to(t, Float.TYPE)).floatValue());
                } else if (C7019kk.m27469x1(t, Double.class)) {
                    c7181du = new C7181du(C14080ne.m66861ck(t));
                } else {
                    if (C7019kk.m27469x1(t, InterfaceC7193yj.class)) {
                        c7185jdM27775dy = ((InterfaceC7193yj) t).mo8461c5();
                    } else {
                        if (t != null) {
                            throw new ArgumentException("Illegal converting of type to CosObject");
                        }
                        c7185jdM27775dy = C7185jd.m27775dy();
                    }
                    c7186k4.m27783k4(c7185jdM27775dy);
                }
                c7185jdM27775dy = C7189m9.m27822k4(jLongValue);
                c7186k4.m27783k4(c7185jdM27775dy);
            }
            c7186k4.m27783k4(c7181du);
        }
        return c7186k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static List<Integer> m46932x1(C7186k4 c7186k4) {
        if (c7186k4 == null) {
            return null;
        }
        C9609k4 c9609k4 = new C9609k4();
        for (int i = 0; i < c7186k4.m27778k4(); i++) {
            C7179c5 c7179c5 = (C7179c5) C7019kk.m27452k4((Object) c7186k4.m27787x1(i), C7179c5.class);
            if (c7179c5 != null) {
                c9609k4.addItem(Integer.valueOf(c7179c5.m27752kk()));
            }
        }
        return new C9609k4(c9609k4, c7186k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C7186k4 m46933k4() {
        return this.f34757to;
    }

    public C9609k4(List<T> list, C7186k4 c7186k4) {
        super(list);
        m46931to(c7186k4);
        if (size() != m46933k4().m27778k4()) {
            this.f34755k4 = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C9609k4<Float> m46927k4(C7186k4 c7186k4) {
        if (c7186k4 == null) {
            return null;
        }
        List list = new List(c7186k4.m27778k4());
        for (int i = 0; i < c7186k4.m27778k4(); i++) {
            C7185jd c7185jdM27787x1 = c7186k4.m27787x1(i);
            list.addItem(Float.valueOf(C7019kk.m27469x1(c7185jdM27787x1, C7179c5.class) ? ((C7179c5) c7185jdM27787x1).m27753to() : Float.NaN));
        }
        return new C9609k4<>(list, c7186k4);
    }

    /* JADX INFO: renamed from: kk */
    public static <T> C7186k4 m46929kk(List<T> list) {
        if (list != null) {
            return C7019kk.m27469x1(list, C9609k4.class) ? ((C9609k4) list).m46933k4() : m46930to(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    private void m46931to(C7186k4 c7186k4) {
        this.f34757to = c7186k4;
    }

    public C9609k4(T t, C7185jd c7185jd, C7187kk c7187kk, C7182dy c7182dy) {
        m46931to(new C7186k4());
        m46933k4().m27783k4(c7185jd);
        addItem(t);
        this.f34758x1 = c7187kk;
        this.f34756kk = c7182dy;
    }
}
