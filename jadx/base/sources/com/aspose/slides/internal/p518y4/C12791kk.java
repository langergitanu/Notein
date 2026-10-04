package com.aspose.slides.internal.p518y4;

import OooooOo.C21392OooOo00;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p182ii.C4913ks;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p284mx.OooO0O0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p365qn.C9893c5;
import com.aspose.slides.internal.p365qn.C9894du;
import com.aspose.slides.internal.p365qn.C9896h4;
import com.aspose.slides.internal.p365qn.C9899m9;
import com.aspose.slides.internal.p365qn.C9900to;
import com.aspose.slides.internal.p365qn.C9901x1;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.y4.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12791kk {

    /* JADX INFO: renamed from: com.aspose.slides.internal.y4.kk$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final Dictionary<Integer, Dictionary<Integer, C9894du>> f42550k4;

        /* JADX INFO: renamed from: kk */
        private int f42551kk;

        /* JADX INFO: renamed from: x1 */
        private final C9899m9 f42552x1;

        public k4() {
            Dictionary<Integer, Dictionary<Integer, C9894du>> dictionary = new Dictionary<>();
            this.f42550k4 = dictionary;
            dictionary.addItem(6, m59474to());
            dictionary.addItem(7, m59474to());
            dictionary.addItem(8, m59474to());
            this.f42552x1 = new C9899m9();
        }

        /* JADX INFO: renamed from: k4 */
        private int m59471k4(short s) {
            switch (s) {
                case 6:
                    return 1;
                case 7:
                    return 2;
                case 8:
                    return 3;
                case 9:
                    return 4;
                default:
                    return 0;
            }
        }

        /* JADX INFO: renamed from: to */
        private static Dictionary<Integer, C9894du> m59474to() {
            Dictionary<Integer, C9894du> dictionary = new Dictionary<>();
            dictionary.addItem(163, null);
            dictionary.addItem(164, null);
            dictionary.addItem(165, null);
            dictionary.addItem(166, null);
            return dictionary;
        }

        /* JADX INFO: renamed from: kk */
        public final boolean m59478kk() {
            if (m59479x1()) {
                return true;
            }
            Dictionary.Enumerator<Integer, C9894du> it = this.f42550k4.get_Item(7).iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    if (!m59473k4((C9894du) next.getValue(), (C9894du) this.f42550k4.get_Item(8).get_Item(next.getKey()))) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return false;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m59479x1() {
            if (!m59477k4()) {
                return true;
            }
            Dictionary.Enumerator<Integer, C9894du> it = this.f42550k4.get_Item(6).iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    if (!m59473k4((C9894du) next.getValue(), (C9894du) this.f42550k4.get_Item(7).get_Item(next.getKey())) || !m59473k4((C9894du) next.getValue(), (C9894du) this.f42550k4.get_Item(8).get_Item(next.getKey()))) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return false;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public final Dictionary<Integer, C9894du> m59475k4(int i) {
            return this.f42550k4.get_Item(Integer.valueOf(i));
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m59480x1(int i) {
            return (this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(163) == null && this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(164) == null && this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(165) == null && this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(166) == null) ? false : true;
        }

        /* JADX INFO: renamed from: k4 */
        private C9894du m59472k4(int i, AbstractC5788h4 abstractC5788h4, C9896h4 c9896h4) {
            C9894du c9894du;
            AbstractC5803to abstractC5803to = (AbstractC5803to) C7019kk.m27452k4((Object) abstractC5788h4, AbstractC5803to.class);
            if (abstractC5803to == null) {
                return null;
            }
            if (abstractC5803to.m23700k4() == 2) {
                c9894du = new C9894du((((i == 164 || i == 165) ? c9896h4.m48734k4().m48713k4() : c9896h4.m48734k4().m48715x1()).m48721x1() * abstractC5803to.mo23699k4((short) 3)) / 100.0f, c9896h4.m48734k4().m48713k4().m48718k4());
            } else {
                c9894du = new C9894du(abstractC5803to.mo23699k4(abstractC5803to.m23700k4()), m59471k4(abstractC5803to.m23700k4()));
            }
            return this.f42552x1.m48747k4(c9894du);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m59476k4(int i, int i2, AbstractC5788h4 abstractC5788h4, C9896h4 c9896h4) {
            C9894du c9894duM59472k4 = m59472k4(i2, abstractC5788h4, c9896h4);
            if (c9894duM59472k4 == null) {
                return;
            }
            if (this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(Integer.valueOf(i2)) == null) {
                this.f42550k4.get_Item(Integer.valueOf(i)).set_Item(Integer.valueOf(i2), c9894duM59472k4);
            } else {
                this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(Integer.valueOf(i2)).m48719k4(c9894duM59472k4.m48721x1() + this.f42550k4.get_Item(Integer.valueOf(i)).get_Item(Integer.valueOf(i2)).m48721x1());
            }
            this.f42551kk++;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m59477k4() {
            return this.f42551kk > 0;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m59473k4(C9894du c9894du, C9894du c9894du2) {
            if (c9894du == null && c9894du2 == null) {
                return true;
            }
            return (c9894du == null || c9894du2 != null) && c9894du != null && c9894du.m48718k4() == c9894du2.m48718k4() && C14064he.m66718x1(c9894du.m48721x1(), c9894du2.m48721x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static List<Integer> m59462k4() {
        List<Integer> list = new List<>();
        C21392OooOo00.OooO0O0(6, 7, 8, list);
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static List<Integer> m59469x1() {
        List<Integer> list = new List<>();
        OooO0O0.OooO00o(163, list, 164, 165, 166);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m59463k4(C4913ks c4913ks, C9901x1 c9901x1) {
        Class cls;
        C9896h4 c9896h4M48724h4;
        Dictionary<Integer, C11539rv> dictionaryMo25985h4 = c4913ks.mo20431k4().mo25985h4();
        List<Integer> listM59462k4 = m59462k4();
        List<Integer> listM59469x1 = m59469x1();
        k4 k4Var = new k4();
        List.Enumerator<Integer> it = listM59462k4.iterator();
        while (true) {
            try {
                boolean zHasNext = it.hasNext();
                cls = Integer.TYPE;
                if (!zHasNext) {
                    break;
                }
                Integer num = (Integer) C7019kk.m27464to(it.next(), cls);
                int iIntValue = num.intValue();
                List.Enumerator<Integer> it2 = listM59469x1.iterator();
                while (it2.hasNext()) {
                    try {
                        int iIntValue2 = ((Integer) C7019kk.m27464to(it2.next(), cls)).intValue();
                        if (dictionaryMo25985h4.containsKey(num)) {
                            AbstractC5788h4 abstractC5788h4M54525k4 = dictionaryMo25985h4.get_Item(num).m54525k4(c4913ks.mo20431k4().mo25987k4(iIntValue2));
                            if (abstractC5788h4M54525k4 != null) {
                                k4Var.m59476k4(iIntValue, iIntValue2, abstractC5788h4M54525k4, c9901x1.m48763m9().m48722du());
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (k4Var.m59477k4()) {
            if (k4Var.m59478kk()) {
                m59466k4(c9901x1.m48763m9().m48722du(), k4Var.m59475k4(7));
                if (k4Var.m59479x1()) {
                    return;
                }
                m59468k4(c9901x1);
                m59466k4(c9901x1.m48763m9().m48724h4(), k4Var.m59475k4(6));
                return;
            }
            it = listM59462k4.iterator();
            boolean z = false;
            while (it.hasNext()) {
                try {
                    int iIntValue3 = ((Integer) C7019kk.m27464to(it.next(), cls)).intValue();
                    if (k4Var.m59480x1(iIntValue3)) {
                        Dictionary<Integer, C9894du> dictionaryM59475k4 = k4Var.m59475k4(iIntValue3);
                        if (iIntValue3 == 6) {
                            m59468k4(c9901x1);
                            c9896h4M48724h4 = c9901x1.m48763m9().m48724h4();
                        } else if (iIntValue3 == 7 || iIntValue3 == 8) {
                            if (!z) {
                                m59470x1(c9901x1);
                                z = true;
                            }
                            c9896h4M48724h4 = iIntValue3 == 7 ? c9901x1.m48763m9().m48730to() : c9901x1.m48763m9().m48728kk();
                        }
                        m59466k4(c9896h4M48724h4, dictionaryM59475k4);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (c9901x1.m48763m9().m48724h4() == null || c9901x1.m48763m9().m48728kk() == null) {
                return;
            }
            if (!c4913ks.mo20431k4().mo25980c5(6)) {
                c9901x1.m48763m9().m48731x1(c9901x1.m48763m9().m48728kk());
                return;
            }
            m59465k4(c9901x1.m48763m9().m48724h4().m48736x1().m48751kk(), c9901x1.m48763m9().m48728kk().m48736x1().m48751kk());
            m59465k4(c9901x1.m48763m9().m48724h4().m48736x1().m48749k4(), c9901x1.m48763m9().m48728kk().m48736x1().m48749k4());
            m59465k4(c9901x1.m48763m9().m48724h4().m48736x1().m48753to(), c9901x1.m48763m9().m48728kk().m48736x1().m48753to());
            m59465k4(c9901x1.m48763m9().m48724h4().m48736x1().m48755x1(), c9901x1.m48763m9().m48728kk().m48736x1().m48755x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m59464k4(C9893c5 c9893c5) {
        C9899m9 c9899m9 = new C9899m9();
        c9893c5.m48716x1(c9899m9.m48747k4(c9893c5.m48715x1()));
        c9893c5.m48714k4(c9899m9.m48747k4(c9893c5.m48713k4()));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m59465k4(C9894du c9894du, C9894du c9894du2) {
        if (c9894du.m48721x1() > 0.0f) {
            return;
        }
        c9894du.m48719k4(c9894du2.m48721x1());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m59470x1(C9901x1 c9901x1) {
        C9896h4 c9896h4M48728kk = c9901x1.m48763m9().m48728kk();
        if (c9896h4M48728kk == null) {
            c9896h4M48728kk = new C9896h4(c9901x1.m48763m9().m48722du().m48734k4());
        }
        C9896h4 c9896h4M48730to = c9901x1.m48763m9().m48730to();
        if (c9896h4M48730to == null) {
            c9896h4M48730to = new C9896h4(c9901x1.m48763m9().m48722du().m48734k4());
        }
        c9901x1.m48763m9().m48727k4(c9896h4M48728kk, c9896h4M48730to);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m59466k4(C9896h4 c9896h4, Dictionary<Integer, C9894du> dictionary) {
        C9894du c9894duM48751kk;
        float fM48721x1;
        m59467k4(c9896h4.m48736x1());
        m59464k4(c9896h4.m48734k4());
        Dictionary.Enumerator<Integer, C9894du> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (next.getValue() != null) {
                    switch (((Integer) next.getKey()).intValue()) {
                        case 163:
                            c9894duM48751kk = c9896h4.m48736x1().m48751kk();
                            fM48721x1 = ((C9894du) next.getValue()).m48721x1();
                            break;
                        case 164:
                            c9894duM48751kk = c9896h4.m48736x1().m48753to();
                            fM48721x1 = ((C9894du) next.getValue()).m48721x1();
                            break;
                        case 165:
                            c9894duM48751kk = c9896h4.m48736x1().m48755x1();
                            fM48721x1 = ((C9894du) next.getValue()).m48721x1();
                            break;
                        case 166:
                            c9894duM48751kk = c9896h4.m48736x1().m48749k4();
                            fM48721x1 = ((C9894du) next.getValue()).m48721x1();
                            break;
                        default:
                            continue;
                    }
                    c9894duM48751kk.m48719k4(fM48721x1);
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
    }

    /* JADX INFO: renamed from: k4 */
    private static void m59467k4(C9900to c9900to) {
        C9899m9 c9899m9 = new C9899m9();
        c9900to.m48752kk(c9899m9.m48747k4(c9900to.m48751kk()));
        c9900to.m48754to(c9899m9.m48747k4(c9900to.m48753to()));
        c9900to.m48750k4(c9899m9.m48747k4(c9900to.m48749k4()));
        c9900to.m48756x1(c9899m9.m48747k4(c9900to.m48755x1()));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m59468k4(C9901x1 c9901x1) {
        C9896h4 c9896h4M48724h4 = c9901x1.m48763m9().m48724h4();
        if (c9896h4M48724h4 == null) {
            c9896h4M48724h4 = new C9896h4(c9901x1.m48763m9().m48722du().m48734k4());
        }
        c9901x1.m48763m9().m48731x1(c9896h4M48724h4);
    }
}
