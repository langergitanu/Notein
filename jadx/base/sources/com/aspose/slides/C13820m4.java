package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.m4 */
/* JADX INFO: loaded from: classes3.dex */
class C13820m4 extends axo {

    /* JADX INFO: renamed from: k4 */
    private List<jrz> f46130k4;

    /* JADX INFO: renamed from: kk */
    private final List<jrz> f46131kk;

    /* JADX INFO: renamed from: to */
    private long f46132to;

    /* JADX INFO: renamed from: x1 */
    private List<jrz> f46133x1;

    public C13820m4(Dictionary<Byte, vbz> dictionary, int i, mcc mccVar, kup kupVar) {
        List.Enumerator<jrz> it;
        super(dictionary, i, mccVar);
        this.f46130k4 = null;
        this.f46133x1 = null;
        this.f46132to = 23L;
        this.f46131kk = new List<>();
        kup kupVarM3784c5 = m3784c5();
        if (kupVarM3784c5 != null) {
            List<jrz> listM64183x1 = kupVarM3784c5.m64183x1();
            this.f46133x1 = listM64183x1;
            if (listM64183x1 != null) {
                it = listM64183x1.iterator();
                while (it.hasNext()) {
                    try {
                        jrz next = it.next();
                        if (!next.m63528k4()) {
                            this.f46131kk.addItem(next);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        kup kupVarM3788jd = m3788jd();
        if (kupVarM3788jd != null) {
            List<jrz> listM64183x12 = kupVarM3788jd.m64183x1();
            this.f46130k4 = listM64183x12;
            if (listM64183x12 != null) {
                it = listM64183x12.iterator();
                while (it.hasNext()) {
                    try {
                        jrz next2 = it.next();
                        if (!next2.m63528k4()) {
                            this.f46131kk.addItem(next2);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (kupVar.m64183x1() != null) {
            this.f46131kk.addRange(kupVar.m64183x1());
        }
    }

    /* JADX INFO: renamed from: ck */
    private SortedDictionary<Long, SortedDictionary<Long, jrz>> m64691ck() {
        SortedDictionary<Long, SortedDictionary<Long, jrz>> sortedDictionary = new SortedDictionary<>();
        List.Enumerator<jrz> it = this.f46131kk.iterator();
        while (it.hasNext()) {
            try {
                jrz next = it.next();
                if (this.f46132to < next.m63519dy() + ((long) next.m63535up().size())) {
                    this.f46132to = next.m63519dy() + ((long) next.m63535up().size());
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
        int i = 0;
        while (true) {
            long j = i;
            if (j > this.f46132to) {
                break;
            }
            sortedDictionary.addItem(Long.valueOf(j), new SortedDictionary<>());
            it = this.f46131kk.iterator();
            while (it.hasNext()) {
                try {
                    jrz next2 = it.next();
                    if (j >= next2.m63519dy() && j < next2.m63519dy() + ((long) next2.m63535up().size())) {
                        while (sortedDictionary.get_Item(Long.valueOf(j)).containsKey(Long.valueOf(next2.m63531m9()))) {
                            next2.m63518du(next2.m63531m9() + 1);
                        }
                        sortedDictionary.get_Item(Long.valueOf(j)).addItem(Long.valueOf(next2.m63531m9()), next2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            i++;
        }
        for (int i2 = 0; i2 < sortedDictionary.size(); i2++) {
            SortedDictionary.ValueCollection.Enumerator<Long, jrz> it2 = sortedDictionary.get_Item(Long.valueOf(i2)).getValues().iterator();
            int iM63531m9 = 0;
            while (it2.hasNext()) {
                try {
                    jrz next3 = it2.next();
                    if (((int) next3.m63531m9()) <= iM63531m9) {
                        next3.m63518du(((long) iM63531m9) + 2);
                    }
                    iM63531m9 = (int) (next3.m63531m9() + next3.m63515c5());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        return sortedDictionary;
    }

    /* JADX INFO: renamed from: fa */
    private void m64692fa() {
        int i = 0;
        while (i < this.f46131kk.size()) {
            if (!m64693k4(this.f46131kk.get_Item(i), this.f46130k4) && !m64693k4(this.f46131kk.get_Item(i), this.f46133x1)) {
                this.f46131kk.removeAt(i);
                i--;
            }
            i++;
        }
    }

    @Override // com.aspose.slides.axo
    /* JADX INFO: renamed from: k4 */
    public String mo3789k4() {
        m64692fa();
        SortedDictionary<Long, SortedDictionary<Long, jrz>> sortedDictionaryM64691ck = m64691ck();
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26783k4('_', 80);
        c6765kp.m26804kk();
        for (int i = 0; i < sortedDictionaryM64691ck.size(); i++) {
            long j = i;
            SortedDictionary.ValueCollection.Enumerator<Long, jrz> it = sortedDictionaryM64691ck.get_Item(Long.valueOf(j)).getValues().iterator();
            int iM63531m9 = 0;
            while (it.hasNext()) {
                try {
                    jrz next = it.next();
                    if (((int) next.m63531m9()) < iM63531m9) {
                        next.m63518du(((long) iM63531m9) + 2);
                    }
                    c6765kp.m26783k4(ControlChar.SPACE_CHAR, ((int) next.m63531m9()) - iM63531m9);
                    if (i < ((int) next.m63519dy())) {
                        next.m63522h4(j);
                    }
                    c6765kp.m26792k4(next.m63535up().get_Item(i - ((int) next.m63519dy())));
                    iM63531m9 = (int) (next.m63531m9() + ((long) next.m63535up().get_Item(i - ((int) next.m63519dy())).length()));
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
            c6765kp.m26804kk();
        }
        c6765kp.m26804kk();
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m64693k4(jrz jrzVar, List<jrz> list) {
        if (jrzVar.m63538x1()) {
            List.Enumerator<jrz> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jrz next = it.next();
                    if (next.m63528k4()) {
                        if (jrzVar.m63523jd() != null) {
                            if (C14113y2.m67363du(next.m63523jd(), jrzVar.m63523jd())) {
                                jrzVar.m63526k4(next);
                                break;
                            }
                        } else if (C14113y2.m67363du(next.m63516ck(), jrzVar.m63516ck())) {
                            jrzVar.m63526k4(next);
                            break;
                        }
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
        return !jrzVar.m63538x1();
    }
}
