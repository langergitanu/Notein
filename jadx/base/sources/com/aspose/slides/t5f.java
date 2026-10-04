package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class t5f {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f49026k4;

    /* JADX INFO: renamed from: kk */
    private final C13748ku f49027kk;

    /* JADX INFO: renamed from: to */
    private final Object f49028to;

    /* JADX INFO: renamed from: x1 */
    private int f49029x1;

    public t5f(AbstractC3150x6 abstractC3150x6, int i, Object obj) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream", "Stream is null.");
        }
        if (abstractC3150x6.getLength() == 0) {
            throw new ArgumentException("The stream is empty.", "stream");
        }
        this.f49026k4 = abstractC3150x6;
        this.f49029x1 = i;
        this.f49028to = obj;
        this.f49027kk = new C13748ku(this);
    }

    /* JADX INFO: renamed from: k4 */
    private int m70947k4(List<C14731wb> list) {
        List.Enumerator<C14731wb> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (it.next().m72674to() == 1) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    private gwj m70963x1(C12275wy c12275wy, byte[] bArr, int i) {
        if (i == 1) {
            pe5.m69032k4();
        }
        List<C14731wb>[] listArr = {null};
        m70958k4(c12275wy, listArr);
        List<C14731wb> list = listArr[0];
        srb srbVar = new srb(c12275wy, 0, list.size());
        try {
            return m70950k4(srbVar, list, i);
        } finally {
            srbVar.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private List<C14731wb> m70948k4(mcc mccVar, List<C14731wb> list) {
        List<C14731wb> list2 = new List<>(list.size());
        List list3 = new List();
        Dictionary.Enumerator<Integer, eng> it = mccVar.m64831kk().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!list3.containsItem(Integer.valueOf(((eng) next.getValue()).m5605k4()))) {
                    list3.addItem(Integer.valueOf(((eng) next.getValue()).m5605k4()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator<C14731wb> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                C14731wb next2 = it2.next();
                if (!h5e.m7041k4(next2.m72671k4()) || list3.containsItem(Integer.valueOf(h5e.m7044x1(next2.m72671k4())))) {
                    list2.addItem(next2);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m70964x1(byte b, gwj gwjVar, int i, C0813bd c0813bd) {
        this.f49027kk.m64173k4(b, c0813bd.m4147kk(), gwjVar, c0813bd, i == 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final PresentationText m70965k4() {
        byte[] bArrM70962k4 = m70962k4(this.f49026k4);
        C12275wy c12275wyM57437k4 = C12275wy.m57437k4(bArrM70962k4);
        try {
            if (C3085sv.m13074k4((Object[]) c12275wyM57437k4.m57499um().toArray(new String[0]), (AbstractC14041ai) new AbstractC14041ai<Object>() { // from class: com.aspose.slides.t5f.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
                public boolean invoke(Object obj) {
                    return C14113y2.m67448x1((String) obj, "ppt/slides");
                }
            }) == -1) {
                throw new NotImplementedException();
            }
            PresentationText presentationTextM70949k4 = m70949k4(c12275wyM57437k4, bArrM70962k4, this.f49029x1);
            c12275wyM57437k4.dispose();
            return presentationTextM70949k4;
        } catch (Throwable th) {
            if (c12275wyM57437k4 != null) {
                c12275wyM57437k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m70966x1() {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) this.f49028to, bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        C14113y2.m67403k4(" ", strArr[0]);
        return ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1) || Arrays.equals(iArrM2334k4, r1s.f48531x1)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private PresentationText m70949k4(C12275wy c12275wy, byte[] bArr, int i) {
        return m70963x1(c12275wy, bArr, i).m6928k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private gwj m70950k4(srb srbVar, List<C14731wb> list, int i) {
        gwj gwjVar = new gwj(this, m70947k4(list));
        m70959k4(srbVar, list);
        m70956k4(list, gwjVar.m6929k4());
        m70955k4(m70948k4(gwjVar.m6929k4(), list), i, gwjVar);
        return gwjVar;
    }

    /* JADX INFO: renamed from: k4 */
    private C3148wl m70951k4(C12275wy c12275wy, AbstractC3150x6 abstractC3150x6, String str) {
        c12275wy.m57505x1(str).m57338k4(abstractC3150x6);
        abstractC3150x6.seek(0L, 0);
        return new C3148wl(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    private String m70952k4(C12275wy c12275wy, String str, C3152yj c3152yj, List<C3148wl> list) {
        C3148wl c3148wlM70951k4 = m70951k4(c12275wy, c3152yj, str);
        list.addItem(c3148wlM70951k4);
        return c3148wlM70951k4.mo13427dy();
    }

    /* JADX INFO: renamed from: k4 */
    private void m70953k4(byte b, gwj gwjVar, int i, C0813bd c0813bd) {
        if (m70966x1()) {
            m70954k4(b, gwjVar, c0813bd);
        } else {
            m70964x1(b, gwjVar, i, c0813bd);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70954k4(byte b, gwj gwjVar, C0813bd c0813bd) {
        C6765kp c6765kpM64171k4 = this.f49027kk.m64171k4(b, c0813bd.m4147kk());
        if (c6765kpM64171k4 != null) {
            this.f49027kk.m64172k4(b, new vbz(c6765kpM64171k4), gwjVar, c0813bd);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70955k4(List<C14731wb> list, int i, gwj gwjVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m70961k4(list.get_Item(i2), gwjVar, i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70956k4(List<C14731wb> list, mcc mccVar) {
        for (int i = 0; i < list.size(); i++) {
            C14731wb c14731wb = list.get_Item(i);
            if (c14731wb.m72675x1()) {
                m70957k4(new C0813bd(c14731wb.m72673kk(), mccVar, c14731wb.m72670du()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70957k4(C0813bd c0813bd) {
        int[] iArr = {0};
        boolean zM70697k4 = so4.m70697k4(c0813bd.m4147kk(), iArr);
        int i = iArr[0];
        if (zM70697k4) {
            c0813bd.m4148x1().m64827k4().set_Item(Integer.valueOf(c0813bd.m4146k4()), new eng(i, (byte) 0));
        }
        int[] iArr2 = {0};
        boolean zM70700x1 = so4.m70700x1(c0813bd.m4147kk(), iArr2);
        int i2 = iArr2[0];
        if (zM70700x1) {
            c0813bd.m4148x1().m64831kk().set_Item(Integer.valueOf(c0813bd.m4146k4()), new eng(i2, (byte) 2));
        }
        int[] iArr3 = {0};
        boolean zM70698kk = so4.m70698kk(c0813bd.m4147kk(), iArr3);
        int i3 = iArr3[0];
        if (zM70698kk) {
            c0813bd.m4148x1().m64824du().set_Item(Integer.valueOf(c0813bd.m4146k4()), new eng(i3, (byte) 3));
        }
        int[] iArr4 = {0};
        boolean zM70699to = so4.m70699to(c0813bd.m4147kk(), iArr4);
        int i4 = iArr4[0];
        if (zM70699to) {
            c0813bd.m4148x1().m64833m9().set_Item(Integer.valueOf(c0813bd.m4146k4()), new eng(i4, (byte) 4));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70958k4(C12275wy c12275wy, List<C14731wb>[] listArr) {
        listArr[0] = new List<>();
        for (int i = 0; i < c12275wy.m57502v4(); i++) {
            C12262lr c12262lrM57487kk = c12275wy.m57487kk(i);
            if (!C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "[trash]") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "customXml") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/handoutMasters") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/theme") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/notesMasters") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/media") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "_rels") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/_rels") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/presentation.xml") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/tableStyles.xml") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/viewProps.xml") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "[Content_Types].xml ") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/embeddings") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "docProps/app.xml") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "docProps/core.xml") && !C14113y2.m67448x1(c12262lrM57487kk.m57356to(), "ppt/charts")) {
                int[] iArr = {0};
                boolean[] zArr = {false};
                boolean zM7043k4 = h5e.m7043k4(c12262lrM57487kk.m57356to(), iArr, zArr);
                int i2 = iArr[0];
                boolean z = zArr[0];
                if (zM7043k4) {
                    listArr[0].addItem(new C14731wb(c12262lrM57487kk.m57356to(), i2, z));
                } else {
                    iArr[0] = i2;
                    byte[] bArr = {0};
                    boolean zM7042k4 = h5e.m7042k4(c12262lrM57487kk.m57356to(), iArr, bArr);
                    int i3 = iArr[0];
                    byte b = bArr[0];
                    if (zM7042k4) {
                        listArr[0].addItem(new C14731wb(c12262lrM57487kk.m57356to(), i3, b));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70959k4(srb srbVar, List<C14731wb> list) {
        for (int i = 0; i < list.size(); i++) {
            m70960k4(srbVar, list.get_Item(i), srbVar.m70745k4(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70960k4(srb srbVar, C14731wb c14731wb, C3152yj c3152yj) {
        c14731wb.m72672k4(m70952k4(srbVar.m70746k4(), c14731wb.m72671k4(), c3152yj, srbVar.m70747x1()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m70961k4(C14731wb c14731wb, gwj gwjVar, int i) {
        if (c14731wb.m72675x1()) {
            return;
        }
        m70953k4(c14731wb.m72674to(), gwjVar, i, new C0813bd(c14731wb.m72673kk(), gwjVar.m6929k4(), c14731wb.m72670du()));
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m70962k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = new byte[16384];
        C3152yj c3152yj = new C3152yj();
        while (true) {
            try {
                int i = abstractC3150x6.read(bArr, 0, 16384);
                if (i <= 0) {
                    byte[] array = c3152yj.toArray();
                    c3152yj.dispose();
                    return array;
                }
                c3152yj.write(bArr, 0, i);
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
    }
}
