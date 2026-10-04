package com.aspose.slides.internal.p333p8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p033b2.C1576x1;
import com.aspose.slides.internal.p200j6.AbstractC5200du;
import com.aspose.slides.internal.p200j6.C5203h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.internal.p401sl.AbstractC10239m9;
import com.aspose.slides.internal.p401sl.AbstractC10240to;
import com.aspose.slides.internal.p506xo.AbstractC12588to;
import com.aspose.slides.internal.p506xo.C12587m9;
import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9421c5 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: c5 */
    private final InterfaceC9428k4 f34287c5;

    /* JADX INFO: renamed from: du */
    private Dictionary<String, C1576x1> f34288du;

    /* JADX INFO: renamed from: dy */
    private Dictionary<String, AbstractC5200du> f34289dy;

    /* JADX INFO: renamed from: h4 */
    private Dictionary<String, AbstractC12588to> f34290h4;

    /* JADX INFO: renamed from: k4 */
    private final C7187kk f34291k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<AbstractC10239m9, String> f34292kk;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<AbstractC12588to, String> f34293m9;

    /* JADX INFO: renamed from: to */
    private Dictionary<String, C9431to> f34294to;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, AbstractC10239m9> f34295x1;

    public C9421c5() {
        this.f34291k4 = new C7187kk();
        this.f34287c5 = null;
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f34291k4;
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC9428k4 m46094du() {
        return this.f34287c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<String, AbstractC10239m9> m46095h4() {
        AbstractC10239m9 abstractC10239m9M50130k4;
        if (this.f34295x1 == null) {
            this.f34295x1 = new Dictionary<>();
            C7187kk c7187kk = this.f34291k4;
            C7182dy c7182dy = C7182dy.f19472iy;
            C7187kk c7187kk2 = (C7187kk) c7187kk.mo27768h4(c7182dy);
            if (c7187kk2 == null) {
                this.f34291k4.m27815x1(c7182dy, new C7187kk());
            } else {
                IGenericEnumerator<C7182dy> it = c7187kk2.m27798k4().iterator();
                while (it.hasNext()) {
                    try {
                        C7182dy next = it.next();
                        try {
                            abstractC10239m9M50130k4 = AbstractC10239m9.m50130k4(c7187kk2.mo27768h4(next), this);
                        } catch (IOException unused) {
                            abstractC10239m9M50130k4 = null;
                        }
                        String strM27766k4 = next.m27766k4();
                        if (abstractC10239m9M50130k4 != null && !this.f34295x1.containsKey(strM27766k4)) {
                            this.f34295x1.addItem(strM27766k4, abstractC10239m9M50130k4);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
            m46098k4(this.f34295x1);
        }
        return this.f34295x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, AbstractC5200du> m46096k4() {
        C7187kk c7187kk;
        AbstractC5200du abstractC5200duM22209k4;
        if (this.f34289dy == null && (c7187kk = (C7187kk) this.f34291k4.mo27768h4(C7182dy.f19487jw)) != null) {
            this.f34289dy = new Dictionary<>();
            IGenericEnumerator<C7182dy> it = c7187kk.m27798k4().iterator();
            while (it.hasNext()) {
                try {
                    C7182dy next = it.next();
                    try {
                        abstractC5200duM22209k4 = C5203h4.m22209k4(c7187kk.mo27768h4(next));
                    } catch (IOException unused) {
                        abstractC5200duM22209k4 = null;
                    }
                    if (abstractC5200duM22209k4 != null) {
                        String strM27766k4 = next.m27766k4();
                        if (this.f34289dy.containsKey(strM27766k4)) {
                            this.f34289dy.set_Item(strM27766k4, abstractC5200duM22209k4);
                        } else {
                            this.f34289dy.addItem(strM27766k4, abstractC5200duM22209k4);
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f34289dy;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<String, C9431to> m46099kk() {
        Dictionary<String, C9431to> dictionary = this.f34294to;
        if (dictionary != null) {
            return dictionary;
        }
        this.f34294to = new Dictionary<>();
        C7187kk c7187kk = (C7187kk) this.f34291k4.mo27768h4(C7182dy.f19433ga);
        if (c7187kk != null) {
            IGenericEnumerator<C7182dy> it = c7187kk.m27798k4().iterator();
            while (it.hasNext()) {
                try {
                    C7182dy next = it.next();
                    C7187kk c7187kk2 = (C7187kk) c7187kk.mo27768h4(next);
                    this.f34294to.addItem(next.m27766k4(), new C9431to(c7187kk2));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f34294to;
    }

    /* JADX INFO: renamed from: to */
    public final Dictionary<String, C1576x1> m46100to() {
        if (this.f34288du == null) {
            this.f34288du = new Dictionary<>();
            C7187kk c7187kk = (C7187kk) this.f34291k4.mo27768h4(C7182dy.f19507l6);
            if (c7187kk != null) {
                IGenericEnumerator<C7182dy> it = c7187kk.m27798k4().iterator();
                while (it.hasNext()) {
                    try {
                        C7182dy next = it.next();
                        C7187kk c7187kk2 = (C7187kk) c7187kk.mo27768h4(next);
                        this.f34288du.addItem(next.m27766k4(), C1576x1.m8466k4(c7187kk2));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
        return this.f34288du;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, AbstractC12588to> m46101x1() {
        AbstractC12588to abstractC12588toM58747k4;
        Dictionary<String, AbstractC12588to> dictionary = this.f34290h4;
        if (dictionary != null) {
            return dictionary;
        }
        this.f34290h4 = new Dictionary<>();
        C7187kk c7187kk = this.f34291k4;
        C7182dy c7182dy = C7182dy.f19461i5;
        C7187kk c7187kk2 = (C7187kk) c7187kk.mo27768h4(c7182dy);
        if (c7187kk2 == null) {
            this.f34291k4.m27815x1(c7182dy, new C7187kk());
        } else {
            IGenericEnumerator<C7182dy> it = c7187kk2.m27798k4().iterator();
            while (it.hasNext()) {
                try {
                    C7182dy next = it.next();
                    C7185jd c7185jdMo27768h4 = c7187kk2.mo27768h4(next);
                    if (C7019kk.m27469x1(c7185jdMo27768h4, C7187kk.class) && (abstractC12588toM58747k4 = C12587m9.m58747k4((C7187kk) c7185jdMo27768h4)) != null) {
                        this.f34290h4.addItem(next.m27766k4(), abstractC12588toM58747k4);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        m46102x1(this.f34290h4);
        return this.f34290h4;
    }

    public C9421c5(C7187kk c7187kk) {
        if (c7187kk == null) {
            throw new ArgumentNullException("'CosDictionary resources' parameter is null");
        }
        this.f34291k4 = c7187kk;
        this.f34287c5 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private C7185jd m46090k4(C7182dy c7182dy, C7182dy c7182dy2) {
        C7187kk c7187kk = (C7187kk) this.f34291k4.mo27768h4(c7182dy);
        if (c7187kk == null) {
            return null;
        }
        return c7187kk.mo27768h4(c7182dy2);
    }

    /* JADX INFO: renamed from: kk */
    private <T> Dictionary<T, String> m46092kk(Dictionary<String, T> dictionary) {
        C13630k4.AnonymousClass2 anonymousClass2 = (Dictionary<T, String>) new Dictionary();
        Dictionary.Enumerator<String, T> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                anonymousClass2.addItem(next.getValue(), next.getKey());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return anonymousClass2;
    }

    /* JADX INFO: renamed from: x1 */
    private C7185jd m46093x1(C7182dy c7182dy, C7182dy c7182dy2) {
        C7187kk c7187kk = (C7187kk) this.f34291k4.mo27768h4(c7182dy);
        if (c7187kk == null) {
            return null;
        }
        return c7187kk.mo27767fa(c7182dy2);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10239m9 m46097k4(C7182dy c7182dy) {
        AbstractC10239m9 abstractC10239m9M50131k4;
        AbstractC10239m9 abstractC10239m9M46160x1;
        C7182dy c7182dy2 = C7182dy.f19472iy;
        C7185jd c7185jdM46093x1 = m46093x1(c7182dy2, c7182dy);
        InterfaceC9428k4 interfaceC9428k4 = this.f34287c5;
        if (interfaceC9428k4 != null && c7185jdM46093x1 != null && (abstractC10239m9M46160x1 = interfaceC9428k4.m46160x1(c7185jdM46093x1)) != null) {
            return abstractC10239m9M46160x1;
        }
        C7185jd c7185jdM46090k4 = m46090k4(c7182dy2, c7182dy);
        if (c7185jdM46090k4 == null) {
            abstractC10239m9M50131k4 = null;
        } else {
            if (C7019kk.m27469x1(c7185jdM46090k4, C7185jd.class)) {
                c7185jdM46090k4 = c7185jdM46090k4.mo8461c5();
            }
            abstractC10239m9M50131k4 = AbstractC10239m9.m50131k4(c7185jdM46090k4, false, this);
        }
        boolean zM46091k4 = m46091k4(abstractC10239m9M50131k4);
        InterfaceC9428k4 interfaceC9428k42 = this.f34287c5;
        if (interfaceC9428k42 != null && zM46091k4) {
            interfaceC9428k42.m46159k4(c7185jdM46093x1, abstractC10239m9M50131k4);
        }
        return abstractC10239m9M50131k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46102x1(Dictionary<String, AbstractC12588to> dictionary) {
        Dictionary<AbstractC12588to, String> dictionaryM46092kk;
        this.f34290h4 = dictionary;
        if (dictionary != null) {
            C7187kk c7187kk = this.f34291k4;
            C7182dy c7182dy = C7182dy.f19461i5;
            if (c7187kk.m27805k4(c7182dy)) {
                return;
            }
            this.f34291k4.m27815x1(c7182dy, C7187kk.m27789k4(dictionary));
            dictionaryM46092kk = m46092kk(dictionary);
        } else {
            this.f34291k4.m27814x1(C7182dy.f19461i5);
            dictionaryM46092kk = null;
        }
        this.f34293m9 = dictionaryM46092kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46098k4(Dictionary<String, AbstractC10239m9> dictionary) {
        Dictionary<AbstractC10239m9, String> dictionaryM46092kk;
        this.f34295x1 = dictionary;
        if (dictionary != null) {
            this.f34291k4.m27815x1(C7182dy.f19472iy, C7187kk.m27789k4(dictionary));
            dictionaryM46092kk = m46092kk(this.f34295x1);
        } else {
            this.f34291k4.m27814x1(C7182dy.f19472iy);
            dictionaryM46092kk = null;
        }
        this.f34292kk = dictionaryM46092kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m46103x1(C7182dy c7182dy) {
        return m46090k4(C7182dy.f19487jw, c7182dy) != null;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m46091k4(AbstractC10239m9 abstractC10239m9) {
        if (!C7019kk.m27469x1(abstractC10239m9, AbstractC10240to.class)) {
            return true;
        }
        C7185jd c7185jdMo27768h4 = abstractC10239m9.m50133yj().mo27768h4(C7182dy.f19487jw);
        if (!C7019kk.m27469x1(c7185jdMo27768h4, C7182dy.class)) {
            return true;
        }
        C7182dy c7182dy = (C7182dy) c7185jdMo27768h4;
        boolean zM46103x1 = m46103x1(C7182dy.f19648u1);
        if (c7182dy.equals(C7182dy.f19335af) && zM46103x1) {
            return false;
        }
        boolean zM46103x12 = m46103x1(C7182dy.f19723yn);
        if (c7182dy.equals(C7182dy.f19650u5) && zM46103x12) {
            return false;
        }
        return ((c7182dy.equals(C7182dy.f19693x3) && m46103x1(C7182dy.f19719yg)) || m46103x1(c7182dy)) ? false : true;
    }
}
