package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7910i7;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class rmh extends wsu {

    /* JADX INFO: renamed from: du */
    private uus[] f48609du;

    /* JADX INFO: renamed from: k4 */
    private List<bay> f48610k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private uus[] f48611kk;

    /* JADX INFO: renamed from: to */
    private uus[] f48612to;

    /* JADX INFO: renamed from: x1 */
    private uus[] f48613x1;

    /* JADX INFO: renamed from: com.aspose.slides.rmh$k4 */
    public static abstract class AbstractC14405k4 extends AbstractC14085qw {
        private AbstractC14405k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo70185k4(uus uusVar);
    }

    public rmh(C7910i7 c7910i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public static boolean m70164du(uus uusVar) {
        return uusVar.m71927to() == 1 && uusVar.m71926m9() == 1 && uusVar.m71918dy() != 21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dy */
    private void m70165dy() {
        o5n o5nVarM72920ks;
        boolean z;
        List list = new List();
        List list2 = new List();
        IGenericEnumerator<wsu> it = m72920ks().iterator();
        while (it.hasNext()) {
            try {
                uus uusVar = (uus) it.next();
                if (uusVar.m71918dy() == 21) {
                    list.addItem(uusVar);
                } else {
                    list2.addItem(uusVar);
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
        Dictionary<Integer, List<uus>> dictionaryM70170k4 = m70170k4(list2);
        if (dictionaryM70170k4.containsKey(1)) {
            dictionaryM70170k4.get_Item(1);
            m70173k4(dictionaryM70170k4.get_Item(1), (List<uus>) list);
        }
        List<m6r> listM64777c5 = ((m6r) m72918k4(m6r.class)).m64777c5();
        listM64777c5.addRange(m72922rv().m3350k4().m64777c5());
        if (dictionaryM70170k4.containsKey(2)) {
            m70172k4(dictionaryM70170k4.get_Item(2), listM64777c5, (List<uus>) list);
        }
        if (dictionaryM70170k4.containsKey(3)) {
            m70172k4(dictionaryM70170k4.get_Item(3), listM64777c5, (List<uus>) list);
        }
        if (list.size() < m72920ks().m68339k4()) {
            IGenericEnumerator<wsu> it2 = m72920ks().iterator();
            while (it2.hasNext()) {
                try {
                    uus uusVar2 = (uus) it2.next();
                    if (!list.containsItem(uusVar2)) {
                        list.addItem(uusVar2);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
        this.f48609du = m70171k4(new AbstractC14405k4() { // from class: com.aspose.slides.rmh.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.SmartArt.LayoutTreeConstraintsNode.EqualizersPredicate(Aspose.Slides.SmartArt.LayoutTreeConstraintNode)";
            }

            @Override // com.aspose.slides.rmh.AbstractC14405k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo70185k4(uus uusVar3) {
                return rmh.m70166dy(uusVar3);
            }
        }).toArray(new uus[0]);
        m72920ks().m68342x1();
        List.Enumerator it3 = list.iterator();
        while (it3.hasNext()) {
            try {
                uus uusVar3 = (uus) it3.next();
                if (uusVar3.m71928up() == 4) {
                    it3 = list.iterator();
                    while (true) {
                        try {
                            if (!it3.hasNext()) {
                                z = false;
                                break;
                            }
                            uus uusVar4 = (uus) it3.next();
                            if (uusVar4 != uusVar3 && uusVar4.m71928up() == 3 && yz6.m74166k4(uusVar4.m71924kk()) && C14113y2.m67363du(uusVar4.m71917du(), uusVar3.m71917du()) && uusVar4.m71927to() == uusVar3.m71927to() && uusVar4.m71924kk() == uusVar3.m71924kk() && C14113y2.m67363du(uusVar4.m71915c5(), uusVar3.m71915c5()) && uusVar4.m71918dy() == uusVar3.m71918dy() && uusVar4.m71920h4() == uusVar3.m71920h4()) {
                                z = true;
                                break;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                    if (!z) {
                        o5nVarM72920ks = m72920ks();
                    }
                } else {
                    o5nVarM72920ks = m72920ks();
                }
                o5nVarM72920ks.m68340k4(uusVar3);
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                throw th2;
            }
        }
        this.f48612to = m70171k4(new AbstractC14405k4() { // from class: com.aspose.slides.rmh.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.SmartArt.LayoutTreeConstraintsNode.ForChildrenPredicate(Aspose.Slides.SmartArt.LayoutTreeConstraintNode)";
            }

            @Override // com.aspose.slides.rmh.AbstractC14405k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo70185k4(uus uusVar5) {
                return rmh.m70177m9(uusVar5);
            }
        }).toArray(new uus[0]);
        this.f48611kk = m70171k4(new AbstractC14405k4() { // from class: com.aspose.slides.rmh.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.SmartArt.LayoutTreeConstraintsNode.ForSelfFromChildrenPredicate(Aspose.Slides.SmartArt.LayoutTreeConstraintNode)";
            }

            @Override // com.aspose.slides.rmh.AbstractC14405k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo70185k4(uus uusVar5) {
                return rmh.m70167h4(uusVar5);
            }
        }).toArray(new uus[0]);
        this.f48613x1 = m70171k4(new AbstractC14405k4() { // from class: com.aspose.slides.rmh.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.SmartArt.LayoutTreeConstraintsNode.ForSelfFromSelfPredicate(Aspose.Slides.SmartArt.LayoutTreeConstraintNode)";
            }

            @Override // com.aspose.slides.rmh.AbstractC14405k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo70185k4(uus uusVar5) {
                return rmh.m70164du(uusVar5);
            }
        }).toArray(new uus[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public static boolean m70167h4(uus uusVar) {
        return (uusVar.m71927to() != 1 || uusVar.m71926m9() == 1 || uusVar.m71918dy() == 21) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private double m70168k4(bay bayVar, int i, int i2, double d) {
        return (i2 == 1 ? bayVar.m4072du(i) : bayVar.m4075h4(i)) * d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m9 */
    public static boolean m70177m9(uus uusVar) {
        return (uusVar.m71927to() == 1 || uusVar.m71918dy() == 21) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, List<uus>> m70179x1(IGenericEnumerable<uus> iGenericEnumerable) {
        List<uus> list;
        Dictionary<String, List<uus>> dictionary = new Dictionary<>();
        IGenericEnumerator<uus> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                uus next = it.next();
                if (dictionary.containsKey(next.m71917du())) {
                    list = dictionary.get_Item(next.m71917du());
                } else {
                    list = new List<>();
                    dictionary.addItem(next.m71917du(), list);
                }
                list.addItem(next);
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
        return dictionary;
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: L_ */
    public void mo4732L_() {
        m70165dy();
        List.Enumerator<bay> it = this.f48610k4.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                m70174k4(next);
                C14345qg c14345qg = (C14345qg) C7019kk.m27452k4((Object) next.m4077jd(), C14345qg.class);
                if (c14345qg != null) {
                    c14345qg.m69577dy(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dy */
    public static boolean m70166dy(uus uusVar) {
        return uusVar.m71928up() == 2;
    }

    /* JADX INFO: renamed from: k4 */
    private double m70169k4(uus uusVar, bay bayVar) {
        if (uusVar.m71918dy() == 21) {
            return uusVar.m71916ck();
        }
        if (uusVar.m71926m9() == 1) {
            return m70168k4(bayVar, uusVar.m71918dy(), uusVar.m71927to(), bayVar.m4079k4(uusVar));
        }
        uus uusVar2 = null;
        if (bayVar.m4104u4() != null) {
            IGenericEnumerator<wsu> it = bayVar.m4104u4().m72920ks().iterator();
            while (it.hasNext()) {
                try {
                    uus uusVar3 = (uus) it.next();
                    if (uusVar3 != uusVar && uusVar3.m71924kk() == uusVar.m71918dy() && uusVar3.m71927to() == uusVar.m71926m9() && C14113y2.m67363du(uusVar3.m71917du(), uusVar.m71915c5()) && uusVar3.m71920h4() == uusVar.m71921jd() && (uusVar3.m71928up() == 2 || uusVar3.m71928up() == 1)) {
                        uusVar2 = uusVar3;
                        break;
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (uusVar2 != null) {
            return m70169k4(uusVar2, bayVar) * bayVar.m4079k4(uusVar);
        }
        if (yz6.m74166k4(uusVar.m71918dy())) {
            return m70168k4(bayVar, uusVar.m71918dy(), 2, bayVar.m4079k4(uusVar));
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: du */
    public final uus[] m70181du() {
        return this.f48612to;
    }

    /* JADX INFO: renamed from: h4 */
    public final uus[] m70182h4() {
        return this.f48609du;
    }

    /* JADX INFO: renamed from: kk */
    public final uus[] m70183kk() {
        return this.f48613x1;
    }

    /* JADX INFO: renamed from: to */
    public final uus[] m70184to() {
        return this.f48611kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<Integer, List<uus>> m70170k4(IGenericEnumerable<uus> iGenericEnumerable) {
        List<uus> list;
        Dictionary<Integer, List<uus>> dictionary = new Dictionary<>();
        IGenericEnumerator<uus> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                uus next = it.next();
                if (dictionary.containsKey(Integer.valueOf(next.m71927to()))) {
                    list = dictionary.get_Item(Integer.valueOf(next.m71927to()));
                } else {
                    list = new List<>();
                    dictionary.addItem(Integer.valueOf(next.m71927to()), list);
                }
                list.addItem(next);
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
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private List<uus> m70171k4(AbstractC14405k4 abstractC14405k4) {
        List<uus> list = new List<>();
        IGenericEnumerator<wsu> it = m72920ks().iterator();
        while (it.hasNext()) {
            try {
                uus uusVar = (uus) it.next();
                if (abstractC14405k4.mo70185k4(uusVar)) {
                    list.addItem(uusVar);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70172k4(IGenericEnumerable<uus> iGenericEnumerable, IGenericEnumerable<m6r> iGenericEnumerable2, List<uus> list) {
        Dictionary<String, List<uus>> dictionaryM70179x1 = m70179x1(iGenericEnumerable);
        if (dictionaryM70179x1.containsKey(C14113y2.f47374k4)) {
            m70173k4(dictionaryM70179x1.get_Item(C14113y2.f47374k4), list);
            dictionaryM70179x1.removeItemByKey(C14113y2.f47374k4);
        }
        IGenericEnumerator<m6r> it = iGenericEnumerable2.iterator();
        while (it.hasNext()) {
            try {
                m6r next = it.next();
                if (dictionaryM70179x1.containsKey(next.mo4816J_())) {
                    m70173k4(dictionaryM70179x1.get_Item(next.mo4816J_()), list);
                    dictionaryM70179x1.removeItemByKey(next.mo4816J_());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70173k4(IGenericEnumerable<uus> iGenericEnumerable, List<uus> list) {
        List list2 = new List();
        List list3 = new List();
        IGenericEnumerator<uus> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                uus next = it.next();
                if (next.m71926m9() == 1) {
                    list2.addItem(next);
                } else {
                    list3.addItem(next);
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
        list2.sort();
        list3.sort();
        list.addRange(list2);
        list.addRange(list3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70174k4(bay bayVar) {
        IGenericEnumerator<wsu> it = m72920ks().iterator();
        while (it.hasNext()) {
            try {
                uus uusVar = (uus) it.next();
                List<bay> listM71923k4 = uusVar.m71923k4(bayVar);
                if (listM71923k4.size() > 0 && (uusVar.m71918dy() != 21 || uusVar.m71916ck() != 0.0d || uusVar.m71928up() == 1)) {
                    if (!yz6.m74166k4(uusVar.m71924kk()) || uusVar.m71928up() == 1 || uusVar.m71928up() == 2) {
                        double dM70169k4 = m70169k4(uusVar, bayVar);
                        List.Enumerator<bay> it2 = listM71923k4.iterator();
                        while (it2.hasNext()) {
                            try {
                                bay next = it2.next();
                                double dM4078k4 = next.m4078k4(uusVar.m71924kk());
                                if (dM4078k4 == 0.0d || (dM4078k4 != dM70169k4 && uusVar.m71927to() != 1)) {
                                    next.m4111x1(uusVar.m71924kk(), dM70169k4);
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
                    }
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: k4 */
    public void mo4817k4(bay bayVar, C14244on c14244on) {
        this.f48610k4.addItem(bayVar);
        bayVar.m4090k4(this);
    }
}
