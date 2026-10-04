package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ILoadOptions;
import com.aspose.slides.IWarningCallback;
import com.aspose.slides.IWarningInfo;
import com.aspose.slides.InvalidPasswordException;
import com.aspose.slides.PptCorruptFileException;
import com.aspose.slides.PptException;
import com.aspose.slides.PptReadException;
import com.aspose.slides.PptUnsupportedFormatException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3050f9;
import com.aspose.slides.internal.p077d8.C3065k4;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.AbstractC9818dy;
import com.aspose.slides.internal.p356qb.C9815c5;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.pk */
/* JADX INFO: loaded from: classes4.dex */
public final class C10591pk {

    /* JADX INFO: renamed from: du */
    private C10730yd f37291du;

    /* JADX INFO: renamed from: h4 */
    private C10483iu f37292h4;

    /* JADX INFO: renamed from: k4 */
    private List<byte[]> f37293k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f37294kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f37295m9;

    /* JADX INFO: renamed from: to */
    private C10469hn f37296to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f37297x1;

    public C10591pk() {
        C10483iu c10483iu = new C10483iu();
        this.f37292h4 = c10483iu;
        c10483iu.m50512x1(true);
        this.f37296to = new C10469hn();
        this.f37291du = new C10730yd();
        this.f37295m9 = false;
    }

    /* JADX INFO: renamed from: c5 */
    private void m51468c5() {
        C10641ss c10641ssM50965m9 = this.f37292h4.m50965m9();
        if (c10641ssM50965m9 != null) {
            List.Enumerator<AbstractC10571o4> it = this.f37292h4.m50513yj().iterator();
            while (it.hasNext()) {
                try {
                    C10556n5 c10556n5 = (C10556n5) C7019kk.m27452k4((Object) it.next(), C10556n5.class);
                    if (c10556n5 != null) {
                        c10556n5.m51364x1(c10641ssM50965m9.m51718x1(c10556n5.mo51092dy()).get_Item(0).m50592ix().m51011to());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m51470dy() {
        long jM50953du = m51483du().m50953du();
        m51483du().m50964ks().m50481x1(0L);
        m51483du().m50964ks().m50473k4(m51483du().m50966to());
        m51483du().m50964ks().m50478to(((jM50953du & 4294967295L) + 2) & 4294967295L);
        m51490to().m52066x1().m51215k4(((long) m51483du().m50967x1()) & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC10571o4 m51473k4(AbstractC3150x6 abstractC3150x6, long j, boolean z, AbstractC10571o4 abstractC10571o4) {
        abstractC3150x6.setPosition(j);
        C3110yd.m13239k4(abstractC3150x6);
        short sM13239k4 = C3110yd.m13239k4(abstractC3150x6);
        abstractC3150x6.setPosition(abstractC3150x6.getPosition() - 4);
        if ((sM13239k4 == 1000 || sM13239k4 == 1006 || sM13239k4 == 1016) && !z) {
            return null;
        }
        return C10576og.m51430k4(new C3134k4(abstractC3150x6), null, abstractC10571o4);
    }

    /* JADX INFO: renamed from: m9 */
    private void m51481m9(C9816ck c9816ck) {
        byte[] bArr = new byte[(m51490to().m52066x1().m51217kk().length() * 2) + m51490to().m52066x1().mo50440k4() + 8];
        C3149x1 c3149x1 = new C3149x1(new C3152yj(bArr));
        m51490to().m52066x1().m51412x1(c3149x1);
        c3149x1.m13450k4(new C6773ss().m26683x1(C14113y2.m67365dy(m51490to().m52066x1().m51217kk())));
        C9820h4 c9820h4 = new C9820h4("Current User");
        c9820h4.m48409k4(bArr);
        c9816ck.m48360k4().m48340du(c9820h4);
    }

    /* JADX INFO: renamed from: du */
    public final C10483iu m51483du() {
        return this.f37292h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<byte[]> m51484h4() {
        return this.f37293k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C10469hn m51488kk() {
        return this.f37296to;
    }

    /* JADX INFO: renamed from: to */
    public final C10730yd m51490to() {
        return this.f37291du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51491x1(C9816ck c9816ck) {
        C9815c5 c9815c5M48360k4 = c9816ck.m48360k4();
        m51470dy();
        m51482to(c9816ck);
        m51469du(c9816ck);
        m51472h4(c9816ck);
        m51481m9(c9816ck);
        if (m51484h4() == null || m51484h4().size() <= 0) {
            return;
        }
        C9815c5 c9815c5 = new C9815c5("_xmlsignatures");
        c9815c5M48360k4.m48340du(c9815c5);
        List.Enumerator<byte[]> it = m51484h4().iterator();
        while (it.hasNext()) {
            try {
                byte[] next = it.next();
                C9820h4 c9820h4 = new C9820h4();
                c9820h4.m48409k4(next);
                c9815c5.m48340du(c9820h4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public C10591pk(C9816ck c9816ck) {
        this(c9816ck, null);
    }

    /* JADX INFO: renamed from: du */
    private void m51469du(C9816ck c9816ck) {
        byte[] bArr = new byte[this.f37292h4.mo50440k4()];
        C3149x1 c3149x1 = new C3149x1(new C3152yj(bArr));
        this.f37292h4.mo50442k4(c3149x1);
        for (int position = (int) c3149x1.m13442k4().getPosition(); position < this.f37292h4.mo50440k4(); position++) {
            bArr[position] = 0;
        }
        C9820h4 c9820h4 = new C9820h4("PowerPoint Document");
        c9820h4.m48409k4(bArr);
        c9816ck.m48360k4().m48340du(c9820h4);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dy */
    private void m51471dy(C9816ck c9816ck) throws Throwable {
        List.Enumerator<C10734yl> enumerator;
        C10372bq c10372bq;
        C10372bq c10372bq2;
        C10755zn c10755zn;
        List<C10495ji> listM52056h4;
        C10591pk c10591pk = this;
        C10528lr c10528lrM51214k4 = C10528lr.m51214k4(c9816ck);
        c10591pk.f37291du = new C10730yd(c10528lrM51214k4);
        C10483iu c10483iu = new C10483iu();
        c10591pk.f37292h4 = c10483iu;
        IGenericCollection iGenericCollectionM50513yj = c10483iu.m50513yj();
        try {
            C3152yj c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("PowerPoint Document")).m48410k4());
            long j = 4294967295L;
            C10372bq c10372bq3 = (C10372bq) m51474k4(c3152yj, c10528lrM51214k4.m51218x1() & 4294967295L, c10591pk.f37292h4);
            C10755zn c10755zn2 = (C10755zn) m51474k4(c3152yj, c10372bq3.m50475kk(), c10591pk.f37292h4);
            SortedList sortedList = new SortedList();
            SortedList sortedList2 = new SortedList();
            List<C10734yl> listM52164x1 = c10755zn2.m52164x1();
            List.Enumerator<C10734yl> it = listM52164x1.iterator();
            while (it.hasNext()) {
                try {
                    C10734yl next = it.next();
                    if (next.m52079x1() != j) {
                        long j2 = j;
                        AbstractC10571o4 abstractC10571o4M51474k4 = m51474k4(c3152yj, next.m52079x1() & j, c10591pk.f37292h4);
                        if (C7019kk.m27469x1(abstractC10571o4M51474k4, InterfaceC10673uw.class)) {
                            ((InterfaceC10673uw) abstractC10571o4M51474k4).mo51093k4(next.m52077k4());
                            next.m52078k4((InterfaceC10673uw) abstractC10571o4M51474k4);
                        }
                        if (!sortedList.containsKey(Long.valueOf(next.m52077k4()))) {
                            sortedList.addItem(Long.valueOf(next.m52077k4()), abstractC10571o4M51474k4);
                            j = j2;
                        } else if (((AbstractC10571o4) sortedList.get_Item(Long.valueOf(next.m52077k4()))).m51404bv() == abstractC10571o4M51474k4.m51404bv()) {
                            sortedList.removeItemByKey(Long.valueOf(next.m52077k4()));
                            sortedList.addItem(Long.valueOf(next.m52077k4()), abstractC10571o4M51474k4);
                            j = j2;
                        } else {
                            sortedList2.addItem(Long.valueOf(next.m52077k4()), abstractC10571o4M51474k4);
                            j = j2;
                        }
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            long j3 = j;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            C10641ss c10641ss = (C10641ss) sortedList.get_Item(Long.valueOf(c10372bq3.m50477to()));
            Dictionary dictionary = new Dictionary();
            dictionary.set_Item(Long.valueOf(c10372bq3.m50477to()), 0L);
            List.Enumerator<C10495ji> it2 = c10641ss.m50513yj().iterator();
            while (it2.hasNext()) {
                try {
                    AbstractC10571o4 next2 = it2.next();
                    if (C7019kk.m27469x1(next2, C10706x4.class) && (listM52056h4 = ((C10706x4) C7019kk.m27452k4((Object) next2, C10706x4.class)).m51969x1().m52056h4()) != null) {
                        it2 = listM52056h4.iterator();
                        while (it2.hasNext()) {
                            try {
                                dictionary.set_Item(Long.valueOf(it2.next().m51012x1()), 0L);
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
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th2;
                }
            }
            C10372bq c10372bq4 = c10372bq3;
            while ((c10372bq4.m50479x1() & j3) > 0) {
                C10372bq c10372bq5 = (C10372bq) m51474k4(c3152yj, c10372bq4.m50479x1() & j3, c10591pk.f37292h4);
                List.Enumerator<C10734yl> it3 = ((C10755zn) m51474k4(c3152yj, c10372bq5.m50475kk(), c10591pk.f37292h4)).m52164x1().iterator();
                while (it3.hasNext()) {
                    try {
                        C10734yl next3 = it3.next();
                        if (c10755zn2.m52163k4(next3.m52077k4()) == null) {
                            List.Enumerator<C10734yl> enumerator2 = it3;
                            try {
                                c10372bq = c10372bq5;
                                enumerator = enumerator2;
                                try {
                                    Object objM51473k4 = c10591pk.m51473k4(c3152yj, next3.m52079x1() & j3, dictionary.containsKey(Long.valueOf(next3.m52077k4())), c10591pk.f37292h4);
                                    if (objM51473k4 == null || C7019kk.m27469x1(objM51473k4, C10647td.class)) {
                                        c10372bq2 = c10372bq3;
                                        c10755zn = c10755zn2;
                                    } else {
                                        c10372bq2 = c10372bq3;
                                        c10755zn = c10755zn2;
                                        C10734yl c10734yl = new C10734yl(next3.m52077k4(), next3.m52079x1());
                                        listM52164x1.addItem(c10734yl);
                                        c10734yl.m52078k4((InterfaceC10673uw) objM51473k4);
                                        ((InterfaceC10673uw) objM51473k4).mo51093k4(next3.m52077k4());
                                        sortedList.addItem(Long.valueOf(next3.m52077k4()), objM51473k4);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (C7019kk.m27456k4((Iterator) enumerator, (Class<IDisposable>) IDisposable.class)) {
                                        enumerator.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                enumerator = enumerator2;
                            }
                        } else {
                            c10372bq = c10372bq5;
                            c10372bq2 = c10372bq3;
                            c10755zn = c10755zn2;
                            enumerator = it3;
                        }
                        c10591pk = this;
                        c10372bq3 = c10372bq2;
                        it3 = enumerator;
                        c10755zn2 = c10755zn;
                        c10372bq5 = c10372bq;
                    } catch (Throwable th5) {
                        th = th5;
                        enumerator = it3;
                    }
                }
                C10372bq c10372bq6 = c10372bq5;
                C10372bq c10372bq7 = c10372bq3;
                C10755zn c10755zn3 = c10755zn2;
                List.Enumerator<C10734yl> enumerator3 = it3;
                if (C7019kk.m27456k4((Iterator) enumerator3, (Class<IDisposable>) IDisposable.class)) {
                    enumerator3.dispose();
                }
                if (c10372bq4.m50479x1() == c10372bq6.m50479x1()) {
                    throw new PptCorruptFileException();
                }
                c10591pk = this;
                c10372bq4 = c10372bq6;
                c10372bq3 = c10372bq7;
                c10755zn2 = c10755zn3;
            }
            C10372bq c10372bq8 = c10372bq3;
            C10755zn c10755zn4 = c10755zn2;
            IGenericEnumerator it4 = sortedList.iterator();
            while (it4.hasNext()) {
                try {
                    KeyValuePair keyValuePair = (KeyValuePair) it4.next();
                    if (!C7019kk.m27469x1(keyValuePair.getValue(), C10641ss.class) && !C7019kk.m27469x1(keyValuePair.getValue(), C10431f3.class) && !C7019kk.m27469x1(keyValuePair.getValue(), C10678v6.class)) {
                        dictionary.set_Item(keyValuePair.getKey(), 0L);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                it4.dispose();
            }
            IGenericEnumerator it5 = sortedList.iterator();
            while (it5.hasNext()) {
                try {
                    KeyValuePair keyValuePair2 = (KeyValuePair) it5.next();
                    if (dictionary.containsKey(keyValuePair2.getKey())) {
                        iGenericCollectionM50513yj.addItem(keyValuePair2.getValue());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                        it5.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                it5.dispose();
            }
            it4 = sortedList2.iterator();
            while (it4.hasNext()) {
                try {
                    KeyValuePair keyValuePair3 = (KeyValuePair) it4.next();
                    if (dictionary.containsKey(keyValuePair3.getKey())) {
                        iGenericCollectionM50513yj.addItem(keyValuePair3.getValue());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                }
            }
            iGenericCollectionM50513yj.addItem(c10755zn4);
            iGenericCollectionM50513yj.addItem(c10372bq8);
        } catch (PptException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new PptReadException("Couldn't read \"PowerPoint Document\" record.", e2);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m51472h4(C9816ck c9816ck) {
        if (this.f37297x1 != null) {
            C9820h4 c9820h4 = new C9820h4("\u0005SummaryInformation");
            c9820h4.m48409k4(this.f37297x1);
            c9816ck.m48360k4().m48340du(c9820h4);
        }
        if (this.f37294kk != null) {
            C9820h4 c9820h42 = new C9820h4("\u0005DocumentSummaryInformation");
            c9820h42.m48409k4(this.f37294kk);
            c9816ck.m48360k4().m48340du(c9820h42);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10571o4 m51474k4(C3152yj c3152yj, long j, AbstractC10571o4 abstractC10571o4) {
        C3134k4 c3134k4 = new C3134k4(c3152yj);
        c3134k4.m13371ck().setPosition(j);
        return C10576og.m51431k4(c3134k4, abstractC10571o4);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m51480kk(C9816ck c9816ck) {
        if (c9816ck == null) {
            throw new ArgumentNullException("fileSystem");
        }
        List.Enumerator<AbstractC9818dy> it = c9816ck.m48360k4().m48342k4().iterator();
        while (it.hasNext()) {
            try {
                if ("EncryptedSummary".equals(it.next().m48372ck())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m51482to(C9816ck c9816ck) {
        if (this.f37296to.m50513yj().size() > 0) {
            byte[] bArr = new byte[this.f37296to.mo50440k4()];
            C3149x1 c3149x1 = new C3149x1(new C3152yj(bArr));
            for (int i = 0; i < this.f37296to.m50513yj().size(); i++) {
                this.f37296to.m50510x1(i).m51412x1(c3149x1);
            }
            C9820h4 c9820h4 = new C9820h4("Pictures");
            c9820h4.m48409k4(bArr);
            c9816ck.m48360k4().m48340du(c9820h4);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m51489m9() {
        return this.f37295m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51492x1(byte[] bArr) {
        this.f37294kk = bArr;
    }

    public C10591pk(C9816ck c9816ck, ILoadOptions iLoadOptions) throws Throwable {
        C9815c5 c9815c5M48360k4 = c9816ck.m48360k4();
        boolean[] zArr = {this.f37295m9};
        m51476k4(c9816ck, iLoadOptions, zArr);
        this.f37295m9 = zArr[0];
        C9820h4 c9820h4 = (C9820h4) c9815c5M48360k4.m48344to("\u0005SummaryInformation");
        if (c9820h4 != null) {
            this.f37297x1 = c9820h4.m48410k4();
        }
        C9820h4 c9820h42 = (C9820h4) c9815c5M48360k4.m48344to("\u0005DocumentSummaryInformation");
        if (c9820h42 != null) {
            this.f37294kk = c9820h42.m48410k4();
        }
        if (m51489m9()) {
            return;
        }
        this.f37296to = new C10469hn(c9816ck);
        C9815c5 c9815c5 = (C9815c5) C7019kk.m27452k4((Object) c9815c5M48360k4.m48344to("_xmlsignatures"), C9815c5.class);
        if (c9815c5 != null) {
            List.Enumerator<AbstractC9818dy> it = c9815c5.m48342k4().iterator();
            List<byte[]> list = null;
            while (it.hasNext()) {
                try {
                    AbstractC9818dy next = it.next();
                    if (C7019kk.m27469x1(next, C9820h4.class)) {
                        byte[] bArrM48410k4 = ((C9820h4) C7019kk.m27452k4((Object) next, C9820h4.class)).m48410k4();
                        list = list == null ? new List<>() : list;
                        list.addItem(bArrM48410k4);
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
            m51485k4(list);
        }
        if (c9815c5 != null || c9815c5M48360k4.m48344to("_signatures") != null) {
            if (iLoadOptions != null && iLoadOptions.getWarningCallback() != null) {
                m51475k4(iLoadOptions.getWarningCallback(), new C3050f9());
            }
            if (c9815c5 != null) {
                c9815c5M48360k4.m48341h4(c9815c5);
            }
            AbstractC9818dy abstractC9818dyM48344to = c9815c5M48360k4.m48344to("_signatures");
            if (abstractC9818dyM48344to != null) {
                c9815c5M48360k4.m48341h4(abstractC9818dyM48344to);
            }
        }
        m51471dy(c9816ck);
        m51468c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51485k4(List<byte[]> list) {
        this.f37293k4 = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m51493x1() {
        return this.f37294kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51475k4(IWarningCallback iWarningCallback, IWarningInfo iWarningInfo) {
        if (iWarningCallback != null) {
            try {
                if (iWarningCallback.warning(iWarningInfo) == 1) {
                    throw new C3065k4(iWarningInfo);
                }
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51476k4(C9816ck c9816ck, ILoadOptions iLoadOptions, boolean[] zArr) {
        boolean[] zArr2 = {false};
        boolean[] zArr3 = {false};
        m51477k4(c9816ck, zArr2, zArr3, zArr);
        boolean z = zArr2[0];
        boolean z2 = zArr3[0];
        if (z) {
            if (!z2) {
                throw new PptUnsupportedFormatException("Microsoft PowerPoint 95 presentation format is not supported.");
            }
            throw new PptUnsupportedFormatException("Dual Microsoft PowerPoint 97-2002 and 95 presentation format is not supported.");
        }
        if (zArr[0] && iLoadOptions != null && !iLoadOptions.getOnlyLoadDocumentProperties()) {
            throw new InvalidPasswordException("The password could not be null or empty");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m51477k4(C9816ck c9816ck, boolean[] zArr, boolean[] zArr2, boolean[] zArr3) {
        zArr[0] = false;
        zArr2[0] = false;
        zArr3[0] = m51480kk(c9816ck);
        List.Enumerator<AbstractC9818dy> it = c9816ck.m48360k4().m48342k4().iterator();
        while (it.hasNext()) {
            try {
                AbstractC9818dy next = it.next();
                if (C7019kk.m27469x1(next, C9820h4.class) && "PersistentStorage Directory".equals(next.m48372ck())) {
                    zArr[0] = true;
                }
                if (C7019kk.m27469x1(next, C9815c5.class) && "PP97_DUALSTORAGE".equals(next.m48372ck())) {
                    zArr2[0] = true;
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
    public final void m51486k4(byte[] bArr) {
        this.f37297x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m51478k4(C9816ck c9816ck) {
        C10528lr c10528lrM51214k4 = C10528lr.m51214k4(c9816ck);
        byte[] bArrM48410k4 = ((C9820h4) c9816ck.m48360k4().m48344to("PowerPoint Document")).m48410k4();
        List.Enumerator<C10734yl> it = ((C10755zn) m51474k4(new C3152yj(bArrM48410k4), ((C10372bq) m51474k4(r2, c10528lrM51214k4.m51218x1() & 4294967295L, r3)).m50475kk(), new C10483iu())).m52164x1().iterator();
        while (it.hasNext()) {
            try {
                if ((C3110yd.m13257x1(bArrM48410k4, (int) ((it.next().m52079x1() & 4294967295L) + 2)) & 65535) == 12052) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m51479k4(C9816ck c9816ck, C9820h4 c9820h4) {
        if (c9820h4 == null) {
            return false;
        }
        m51476k4(c9816ck, (ILoadOptions) null, new boolean[]{false});
        C3152yj c3152yj = new C3152yj(c9820h4.m48410k4());
        try {
            return (((C10372bq) m51474k4(c3152yj, C10528lr.m51214k4(c9816ck).m51218x1() & 4294967295L, (AbstractC10571o4) null)).m50472h4() & 4294967295L) != 0;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m51487k4() {
        return this.f37297x1;
    }
}
