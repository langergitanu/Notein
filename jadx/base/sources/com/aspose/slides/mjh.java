package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p271mc.C6360ck;
import com.aspose.slides.internal.p271mc.C6365jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p505xn.C12577yj;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class mjh {

    /* JADX INFO: renamed from: k4 */
    static final char f46246k4 = C14080ne.m67037x1((Integer) 8226);

    /* JADX INFO: renamed from: k4 */
    private static IGenericDictionary<eck, C6365jd> m64915k4(C6360ck c6360ck, IGenericList<C6360ck> iGenericList, IGenericList<C6360ck> iGenericList2, IGenericList<C6365jd> iGenericList3) {
        int i;
        C12577yj c12577yj = new C12577yj(eck.class, C6365jd.class);
        IGenericEnumerator<C6365jd> it = iGenericList3.iterator();
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (it.hasNext()) {
            try {
                C6365jd next = it.next();
                float fM56895kk = c6360ck.m26086k4().m55565kk()[i3].m56895kk();
                if (iGenericList != null && iGenericList2 != null) {
                    int i6 = i3;
                    int i7 = i6;
                    while (true) {
                        if (i6 >= iGenericList.size()) {
                            i = i3;
                            break;
                        }
                        float fM56897x1 = c6360ck.m26086k4().m55565kk()[i3].m56897x1();
                        int i8 = i3;
                        while (true) {
                            if (i8 >= iGenericList2.size()) {
                                i = i3;
                                break;
                            }
                            i = i3;
                            int i9 = i5;
                            if (new C12007ix(fM56897x1, fM56895kk, iGenericList2.get_Item(i8).m26086k4().m55565kk()[1].m56897x1() - fM56897x1, iGenericList.get_Item(i6).m26086k4().m55565kk()[1].m56895kk() - fM56895kk).m56581x1(next.m26156kk().Clone())) {
                                i5 = (i2 == i6 && i4 == i8) ? i9 + 1 : i;
                                eck eckVar = new eck();
                                eckVar.m5419k4(i6);
                                eckVar.m5423x1(i5);
                                eckVar.m5421kk(i8);
                                c12577yj.set_Item(eckVar, next);
                                i2 = i6;
                                i4 = i8;
                                i7 = 1;
                            } else {
                                fM56897x1 = iGenericList2.get_Item(i8).m26086k4().m55565kk()[i].m56897x1();
                                i8++;
                                i3 = i;
                                i5 = i9;
                            }
                        }
                        fM56895kk = iGenericList.get_Item(i6).m26086k4().m55565kk()[i].m56895kk();
                        if (i7 != 0) {
                            break;
                        }
                        i6++;
                        i3 = i;
                    }
                } else {
                    i = i3;
                }
                i3 = i;
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
        return c12577yj;
    }

    /* JADX INFO: renamed from: x1 */
    private static IGenericList<C6360ck> m64919x1(C6360ck c6360ck, C6360ck c6360ck2, IGenericList<C6360ck> iGenericList) {
        List list = new List();
        IGenericEnumerator<C6360ck> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                C6360ck next = it.next();
                if ((C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56897x1() - c6360ck.m26086k4().m55565kk()[0].m56897x1()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56895kk() - c6360ck.m26086k4().m55565kk()[0].m56895kk()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[1].m56897x1() - c6360ck2.m26086k4().m55565kk()[0].m56897x1()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[1].m56895kk() - c6360ck2.m26086k4().m55565kk()[0].m56895kk()) < 2.0f) || (C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56897x1() - c6360ck.m26086k4().m55565kk()[1].m56897x1()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56895kk() - c6360ck.m26086k4().m55565kk()[1].m56895kk()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[1].m56897x1() - c6360ck2.m26086k4().m55565kk()[1].m56897x1()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[1].m56895kk() - c6360ck2.m26086k4().m55565kk()[1].m56895kk()) < 2.0f)) {
                    list.addItem(next);
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
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static IGenericList<e0e> m64916k4(IGenericList<C6360ck> iGenericList, IGenericList<C6365jd> iGenericList2) {
        IGenericList<C6360ck> iGenericListM64918k4;
        IGenericList<C6360ck> iGenericListM64917k4;
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        IGenericEnumerator<C6360ck> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                C6360ck next = it.next();
                if (!next.m26080du() && next.m26086k4().m55565kk().length == 2 && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56895kk() - next.m26086k4().m55565kk()[1].m56895kk()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56897x1() - next.m26086k4().m55565kk()[1].m56897x1()) > 10.0f) {
                    list2.addItem(next);
                }
                if (!next.m26080du() && next.m26086k4().m55565kk().length == 2 && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56897x1() - next.m26086k4().m55565kk()[1].m56897x1()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56895kk() - next.m26086k4().m55565kk()[1].m56895kk()) > 10.0f) {
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
        C6360ck c6360ck = (C6360ck) list2.get_Item(0);
        C6360ck c6360ck2 = null;
        do {
            int size = list2.size() - 1;
            while (true) {
                if (size < 0) {
                    size = 0;
                    iGenericListM64918k4 = null;
                    iGenericListM64917k4 = null;
                    break;
                }
                c6360ck2 = (C6360ck) list2.get_Item(size);
                if (C14116yg.m67480k4((c6360ck2.m26086k4().m55565kk()[1].m56897x1() - c6360ck2.m26086k4().m55565kk()[0].m56897x1()) - (c6360ck.m26086k4().m55565kk()[1].m56897x1() - c6360ck.m26086k4().m55565kk()[0].m56897x1())) < 2.0f) {
                    IGenericList<C6360ck> iGenericListM64919x1 = m64919x1(c6360ck, c6360ck2, list3);
                    if (iGenericListM64919x1.size() == 2) {
                        iGenericListM64917k4 = m64917k4(c6360ck, c6360ck2, list2);
                        iGenericListM64918k4 = m64918k4(c6360ck, iGenericListM64917k4.get_Item(1), iGenericListM64919x1.get_Item(0), iGenericListM64919x1.get_Item(1), list3);
                        break;
                    }
                }
                size--;
            }
            IGenericDictionary<eck, C6365jd> iGenericDictionaryM64915k4 = m64915k4(c6360ck, iGenericListM64917k4, iGenericListM64918k4, iGenericList2);
            e0e e0eVar = new e0e();
            e0eVar.m5324k4(c6360ck.m26086k4().m55565kk()[0].m56897x1());
            e0eVar.m5330x1(c6360ck.m26086k4().m55565kk()[0].m56895kk());
            e0eVar.m5326k4(iGenericListM64917k4);
            e0eVar.m5331x1(iGenericListM64918k4);
            e0eVar.m5325k4(iGenericDictionaryM64915k4);
            list.addItem(e0eVar);
            if (c6360ck2 != list2.get_Item(list2.size() - 1)) {
                c6360ck = (C6360ck) list2.get_Item(size + 1);
            }
            if (c6360ck == list2.get_Item(list2.size() - 1)) {
                break;
            }
        } while (c6360ck2 != list2.get_Item(list2.size() - 1));
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static IGenericList<C6360ck> m64917k4(C6360ck c6360ck, C6360ck c6360ck2, IGenericList<C6360ck> iGenericList) {
        List list = new List();
        list.addItem(c6360ck);
        float fM56897x1 = c6360ck.m26086k4().m55565kk()[1].m56897x1() - c6360ck.m26086k4().m55565kk()[0].m56897x1();
        float fM56895kk = c6360ck.m26086k4().m55565kk()[0].m56895kk();
        float fM56895kk2 = c6360ck2.m26086k4().m55565kk()[0].m56895kk();
        IGenericEnumerator<C6360ck> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                C6360ck next = it.next();
                float fM56897x12 = next.m26086k4().m55565kk()[1].m56897x1() - next.m26086k4().m55565kk()[0].m56897x1();
                if (next != c6360ck && next != c6360ck2 && C14116yg.m67480k4(fM56897x12 - fM56897x1) < 4.0f && next.m26086k4().m55565kk()[0].m56895kk() > fM56895kk && next.m26086k4().m55565kk()[0].m56895kk() < fM56895kk2) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.addItem(c6360ck2);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static IGenericList<C6360ck> m64918k4(C6360ck c6360ck, C6360ck c6360ck2, C6360ck c6360ck3, C6360ck c6360ck4, IGenericList<C6360ck> iGenericList) {
        List list = new List();
        list.addItem(c6360ck3);
        IGenericEnumerator<C6360ck> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                C6360ck next = it.next();
                if (next != c6360ck3 && next != c6360ck4 && C14116yg.m67480k4(next.m26086k4().m55565kk()[0].m56895kk() - c6360ck.m26086k4().m55565kk()[0].m56895kk()) < 2.0f && C14116yg.m67480k4(next.m26086k4().m55565kk()[1].m56895kk() - c6360ck2.m26086k4().m55565kk()[0].m56895kk()) < 2.0f) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.addItem(c6360ck4);
        return list;
    }
}
