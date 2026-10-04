package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p172hu.C4684k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class nrw implements InterfaceC0901dh {

    /* JADX INFO: renamed from: du */
    private boolean f47601du;

    /* JADX INFO: renamed from: h4 */
    private final List<r7c> f47602h4 = new List<>();

    /* JADX INFO: renamed from: k4 */
    final fqc f47603k4;

    /* JADX INFO: renamed from: kk */
    private String f47604kk;

    /* JADX INFO: renamed from: to */
    private byte[] f47605to;

    /* JADX INFO: renamed from: x1 */
    public final Paragraph f47606x1;

    public nrw(Paragraph paragraph) {
        this.f47606x1 = paragraph;
        this.f47603k4 = paragraph.m2161k4().m2200ks();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static IGenericList<nrw> m68182k4(Paragraph paragraph, int i) {
        r7c r7cVar;
        List list = new List();
        if (paragraph.getPortions().getCount() > 0) {
            nrw nrwVar = new nrw(paragraph);
            list.addItem(nrwVar);
            for (int i2 = 0; i2 < paragraph.getPortions().getCount(); i2++) {
                Portion portion = (Portion) paragraph.getPortions().get_Item(i2);
                lrb lrbVarM2305bv = portion.m2295x1().m2305bv();
                String[] strArrM67369h4 = C14113y2.m67369h4(portion.m2283h4(), ay6.f3982dy);
                if (strArrM67369h4.length > 1) {
                    for (int i3 = 0; i3 < strArrM67369h4.length - 1; i3++) {
                        nrwVar.f47602h4.addItem(new r7c(portion, strArrM67369h4[i3], lrbVarM2305bv));
                        nrwVar.f47601du = true;
                        nrwVar = new nrw(paragraph);
                        list.addItem(nrwVar);
                    }
                    r7cVar = new r7c(portion, strArrM67369h4[strArrM67369h4.length - 1], lrbVarM2305bv);
                } else {
                    r7cVar = new r7c(portion, portion.m2286k4(i), lrbVarM2305bv);
                }
                nrwVar.f47602h4.addItem(r7cVar);
            }
        } else if (paragraph.m2166kk() == null) {
            nrw nrwVar2 = new nrw(paragraph);
            list.addItem(nrwVar2);
            nrwVar2.f47602h4.addItem(new r7c(null, C14113y2.f47374k4, nrwVar2.f47603k4.f5104ix));
        }
        PortionFormat portionFormat = (PortionFormat) paragraph.m2166kk();
        if (portionFormat != null && !m68186k4(paragraph)) {
            if (list.size() == 0) {
                list.addItem(new nrw(paragraph));
            }
            Portion portion2 = (Portion) portionFormat.getParent_Immediate();
            ((nrw) OooO0O0.OooO00o(list, 1)).m68194to().addItem(new r7c(portion2, portion2.m2286k4(i), portion2.m2295x1().m2305bv()));
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                List<r7c> listM68194to = ((nrw) it.next()).m68194to();
                int length = 0;
                for (int i4 = 0; i4 < listM68194to.size(); i4++) {
                    r7c r7cVar2 = listM68194to.get_Item(i4);
                    r7cVar2.m70033k4(length);
                    length += r7cVar2.f48544x1.length();
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
        it = list.iterator();
        while (it.hasNext()) {
            try {
                nrw nrwVar3 = (nrw) it.next();
                nrwVar3.m68184k4(m68187k4(nrwVar3.m68194to()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: du */
    public final String m68189du() {
        return this.f47604kk;
    }

    /* JADX INFO: renamed from: dy */
    public final char m68190dy() {
        List.Enumerator<r7c> it = this.f47602h4.iterator();
        while (it.hasNext()) {
            try {
                String str = it.next().f48544x1;
                if (!C14113y2.m67411k4(str)) {
                    return str.charAt(0);
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
        it = this.f47602h4.iterator();
        while (it.hasNext()) {
            try {
                if (C7019kk.m27469x1(it.next().f48542kk, MathPortion.class)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return 'a';
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
        throw new ArgumentOutOfRangeException();
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m68191h4() {
        return this.f47605to;
    }

    @Override // com.aspose.slides.InterfaceC0901dh
    /* JADX INFO: renamed from: kk */
    public final IGenericEnumerable<InterfaceC14342qd> mo5099kk() {
        return new C4684k4(this.f47602h4);
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m68193m9() {
        if (this.f47602h4.size() == 0) {
            return false;
        }
        if (this.f47602h4.size() == 1) {
            return "\t".equals(this.f47602h4.get_Item(0).f48544x1);
        }
        List.Enumerator<r7c> it = this.f47602h4.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                r7c next = it.next();
                if ("\t".equals(next.f48544x1)) {
                    if (z) {
                        return false;
                    }
                    z = true;
                } else if (!C14113y2.m67411k4(next.f48544x1)) {
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
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return z;
    }

    /* JADX INFO: renamed from: to */
    public final List<r7c> m68194to() {
        return this.f47602h4;
    }

    @Override // com.aspose.slides.InterfaceC0901dh
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1134g7 mo5100x1() {
        return this.f47603k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68183k4(String str) {
        this.f47604kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68184k4(byte[] bArr) {
        this.f47605to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68185k4(nrw[] nrwVarArr, boolean z) {
        String[] strArrM70968k4 = t5o.m70968k4(AbstractC14092to.m67204k4((Object[]) nrwVarArr), nrwVarArr.length, z);
        for (int i = 0; i < nrwVarArr.length; i++) {
            nrwVarArr[i].m68183k4(strArrM70968k4[i]);
        }
    }

    @Override // com.aspose.slides.InterfaceC0901dh
    /* JADX INFO: renamed from: k4 */
    public final boolean mo5098k4() {
        return this.f47601du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68192k4(byte b) {
        List.Enumerator<r7c> it = m68194to().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    return false;
                }
                String str = it.next().f48544x1;
                for (int i = 0; i < str.length(); i++) {
                    if (C3047dy.m12881to((int) str.charAt(i)) == b) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return true;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68186k4(Paragraph paragraph) {
        IPortionCollection portions = paragraph.getPortions();
        if (portions.getCount() > 0) {
            return scu.m70501k4(paragraph.m2166kk(), portions.get_Item(portions.getCount() - 1).getPortionFormat());
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m68187k4(IGenericList<r7c> iGenericList) {
        if (iGenericList.size() <= 0) {
            return new byte[0];
        }
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < iGenericList.size(); i++) {
            c6765kp.m26792k4(iGenericList.get_Item(i).f48544x1);
        }
        if (c6765kp.m26807x1() <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[c6765kp.m26807x1()];
        byte[] bArr2 = new byte[c6765kp.m26807x1()];
        int i2 = 0;
        for (int i3 = 0; i3 < iGenericList.size(); i3++) {
            r7c r7cVar = iGenericList.get_Item(i3);
            String languageId = r7cVar.f48541k4.getLanguageId();
            byte b = (C14113y2.m67411k4(languageId) || !C3047dy.m12870k4(languageId)) ? (byte) 0 : (byte) 3;
            int length = r7cVar.f48544x1.length();
            while (length > 0) {
                bArr2[i2] = C3047dy.m12856jd(c6765kp.m26806x1(i2));
                bArr[i2] = b;
                length--;
                i2++;
            }
        }
        if (c6765kp.m26807x1() > 0) {
            C3047dy.m12863k4(bArr2, bArr);
            C3047dy.m12862k4(c6765kp.toString(), bArr);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static nrw[] m68188k4(TextFrame textFrame, int i) {
        boolean zM63959k4 = kke.m63959k4(SmartArtShape.class, textFrame, new SmartArtShape[]{null});
        List list = new List();
        for (int i2 = 0; i2 < textFrame.getParagraphs().getCount(); i2++) {
            list.addRange(m68182k4((Paragraph) textFrame.getParagraphs().get_Item(i2), i));
        }
        nrw[] nrwVarArr = (nrw[]) list.toArray(new nrw[0]);
        m68185k4(nrwVarArr, zM63959k4);
        return nrwVarArr;
    }
}
