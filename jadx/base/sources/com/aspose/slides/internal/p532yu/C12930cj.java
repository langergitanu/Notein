package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.cj */
/* JADX INFO: loaded from: classes5.dex */
public class C12930cj {

    /* JADX INFO: renamed from: k4 */
    private int f43486k4 = 0;

    /* JADX INFO: renamed from: kk */
    private Hashtable f43487kk = null;

    /* JADX INFO: renamed from: du */
    private Object f43484du = null;

    /* JADX INFO: renamed from: h4 */
    private boolean f43485h4 = true;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f43489x1 = new Hashtable();

    /* JADX INFO: renamed from: to */
    private ArrayList f43488to = new ArrayList();

    /* JADX INFO: renamed from: k4 */
    public final int m60134k4() {
        return this.f43486k4 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r6 = ((com.aspose.slides.p559ms.System.Xml.C13890ei) r2.getKey()).toString();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m60141x1(int i) {
        String strM67408k4;
        IDictionaryEnumerator it = this.f43489x1.iterator();
        while (true) {
            try {
                boolean zHasNext = it.hasNext();
                Class cls = Integer.TYPE;
                if (!zHasNext) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    Hashtable hashtable = this.f43487kk;
                    if (hashtable == null) {
                        return "##other:*";
                    }
                    it = hashtable.iterator();
                    while (it.hasNext()) {
                        try {
                            DictionaryEntry dictionaryEntry = (DictionaryEntry) it.next();
                            if (((Integer) C7019kk.m27464to(dictionaryEntry.getValue(), cls)).intValue() == i) {
                                strM67408k4 = C14113y2.m67408k4((String) dictionaryEntry.getKey(), ":*");
                                if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    return strM67408k4;
                                }
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                        }
                    }
                    if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        return "##other:*";
                    }
                    ((IDisposable) it).dispose();
                    return "##other:*";
                }
                DictionaryEntry dictionaryEntry2 = (DictionaryEntry) it.next();
                if (((Integer) C7019kk.m27464to(dictionaryEntry2.getValue(), cls)).intValue() == i) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return strM67408k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m60135k4(C13890ei c13890ei) {
        Object obj;
        Object objM27464to;
        Object obj2 = this.f43489x1.get_Item(c13890ei);
        Class cls = Integer.TYPE;
        if (obj2 != null) {
            objM27464to = C7019kk.m27464to(obj2, (Class<Object>) cls);
        } else {
            Hashtable hashtable = this.f43487kk;
            if (hashtable == null || (obj = hashtable.get_Item(c13890ei.m65284k4())) == null) {
                return this.f43486k4;
            }
            objM27464to = C7019kk.m27464to(obj, (Class<Object>) cls);
        }
        return ((Integer) objM27464to).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m60142x1() {
        return this.f43485h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m60136k4(C13890ei c13890ei, Object obj) {
        Object obj2 = this.f43489x1.get_Item(c13890ei);
        if (obj2 != null) {
            int iIntValue = ((Integer) C7019kk.m27464to(obj2, Integer.TYPE)).intValue();
            if (this.f43488to.get_Item(iIntValue) != obj) {
                this.f43485h4 = false;
            }
            return iIntValue;
        }
        this.f43489x1.addItem(c13890ei, Integer.valueOf(this.f43486k4));
        this.f43488to.addItem(obj);
        int i = this.f43486k4;
        this.f43486k4 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m60143x1(C13890ei c13890ei) {
        return this.f43489x1.get_Item(c13890ei) != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final ICollection m60137k4(C13086lm c13086lm) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f43489x1.getKeys().iterator();
        while (it.hasNext()) {
            try {
                C13890ei c13890ei = (C13890ei) it.next();
                if (C13890ei.m65281x1(c13890ei, C13890ei.f46456k4) && c13086lm.m61107k4(c13890ei)) {
                    arrayList.addItem(this.f43489x1.get_Item(c13890ei));
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
        Hashtable hashtable = this.f43487kk;
        if (hashtable != null) {
            it = hashtable.getKeys().iterator();
            while (it.hasNext()) {
                try {
                    String str = (String) it.next();
                    if (c13086lm.mo61008k4(str)) {
                        arrayList.addItem(this.f43487kk.get_Item(str));
                    }
                } finally {
                }
            }
        }
        if (c13086lm.m61110x1() != 0 && c13086lm.m61110x1() != 1) {
            return arrayList;
        }
        arrayList.addItem(Integer.valueOf(this.f43486k4));
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m60138k4(int i) {
        return i == this.f43486k4 ? this.f43484du : this.f43488to.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60139k4(C13086lm c13086lm, Object obj, boolean z) {
        int iM61110x1 = c13086lm.m61110x1();
        if (iM61110x1 == 0) {
            this.f43484du = obj;
            return;
        }
        if (iM61110x1 == 1) {
            m60133k4(c13086lm.m61108kk(), (Object) null);
            if (z) {
                return;
            }
            m60133k4(C14113y2.f47374k4, (Object) null);
            return;
        }
        if (iM61110x1 != 2) {
            return;
        }
        Iterator it = c13086lm.m61109to().iterator();
        while (it.hasNext()) {
            try {
                m60133k4((String) it.next(), obj);
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60133k4(String str, Object obj) {
        if (this.f43487kk == null) {
            this.f43487kk = new Hashtable();
        }
        Object obj2 = this.f43487kk.get_Item(str);
        if (obj2 == null) {
            this.f43487kk.addItem(str, Integer.valueOf(this.f43486k4));
            this.f43488to.addItem(obj);
            this.f43486k4++;
        } else if (obj != null) {
            this.f43488to.set_Item(((Integer) C7019kk.m27464to(obj2, Integer.TYPE)).intValue(), obj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60140k4(boolean z) {
        this.f43485h4 = z;
    }
}
