package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p353q7.C9773ix;
import com.aspose.slides.internal.p353q7.C9775k4;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p505xn.C12576x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.qvp;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.at */
/* JADX INFO: loaded from: classes3.dex */
final class C0762at {

    /* JADX INFO: renamed from: du */
    private Dictionary<String, Integer> f3942du;

    /* JADX INFO: renamed from: h4 */
    private List<qy7> f3943h4;

    /* JADX INFO: renamed from: k4 */
    private final Presentation f3944k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f3945kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f3946m9;

    /* JADX INFO: renamed from: to */
    private String[][] f3947to;

    /* JADX INFO: renamed from: x1 */
    private qy7 f3948x1;

    public C0762at(Presentation presentation, qy7 qy7Var) {
        this.f3948x1 = null;
        this.f3947to = null;
        this.f3942du = null;
        this.f3943h4 = null;
        int length = 0;
        this.f3946m9 = false;
        this.f3944k4 = presentation;
        this.f3942du = new Dictionary<>();
        this.f3943h4 = new List<>();
        this.f3947to = new String[][]{new String[0], new String[0], new String[0], new String[0], new String[0]};
        this.f3948x1 = qy7Var;
        this.f3942du.addItem(qy7Var.m69912ne(), 0);
        this.f3943h4.addItem(this.f3948x1);
        C14251ot c14251otM69882b3 = this.f3948x1.m69882b3();
        byte bM68809dy = c14251otM69882b3.m68809dy();
        byte[] bArrM69922uz = this.f3948x1.m69922uz();
        boolean zM68818to = c14251otM69882b3.m68818to();
        this.f3946m9 = zM68818to;
        if (zM68818to) {
            bM68809dy = c14251otM69882b3.m68811k4().m56646kk();
            bArrM69922uz = c14251otM69882b3.m68819x1().m23120k4().m48238v4();
        }
        this.f3945kk = bArrM69922uz;
        int iM69919u4 = this.f3948x1.m69919u4();
        C0758ap c0758apM7122k4 = presentation.m2385ks().m7122k4();
        String[] strArrM63262k4 = C13678ja.m63262k4(bM68809dy, iM69919u4, bArrM69922uz, this.f3948x1.f48466du.getLanguageId());
        String[] strArrM3696k4 = c0758apM7122k4.m3696k4(iM69919u4);
        int length2 = (strArrM63262k4 != null ? strArrM63262k4.length : 0) + strArrM3696k4.length;
        this.f3947to[3] = new String[C14113y2.m67411k4(presentation.m2349du().getDefaultRegularFont()) ? length2 : length2 + 1];
        if (strArrM3696k4.length > 0) {
            AbstractC14092to.m67208k4((Object) strArrM3696k4).copyTo(AbstractC14092to.m67208k4((Object) this.f3947to[3]), 0);
            length = strArrM3696k4.length;
        }
        if (!C14113y2.m67411k4(presentation.m2349du().getDefaultRegularFont())) {
            this.f3947to[3][length] = presentation.m2349du().getDefaultRegularFont();
            length++;
        }
        if (strArrM63262k4 != null) {
            AbstractC14092to.m67208k4((Object) strArrM63262k4).copyTo(AbstractC14092to.m67208k4((Object) this.f3947to[3]), length);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m3728k4(int i) {
        C1197hf c1197hfM2385ks = this.f3944k4.m2385ks();
        this.f3947to[0] = c1197hfM2385ks.m7128k4(i, this.f3948x1.m69912ne(), this.f3945kk);
        this.f3947to[1] = !C14113y2.m67411k4(c1197hfM2385ks.m7130kk()) ? new String[]{c1197hfM2385ks.m7130kk()} : new String[0];
        this.f3947to[2] = c1197hfM2385ks.m7129k4(i, this.f3945kk, this.f3948x1.m69893g8());
        this.f3947to[4] = qvp.m69775k4(i);
        String[][] strArr = this.f3947to;
        if (strArr[0] == null) {
            strArr[0] = new String[0];
        }
        if (strArr[4] == null) {
            strArr[4] = new String[0];
        }
        if (strArr[2] == null) {
            strArr[2] = new String[0];
        }
        qy7 qy7VarM3726k4 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            for (String str : this.f3947to[i2 % 5]) {
                qy7VarM3726k4 = m3726k4(str);
                C14251ot c14251otM69882b3 = qy7VarM3726k4.m69882b3();
                if (c14251otM69882b3.m68818to()) {
                    C9797wp c9797wpM48102k4 = c14251otM69882b3.m68819x1().m23120k4().m48221m9().m48102k4(i);
                    if (C3047dy.f8970k4.containsItem(Character.valueOf((char) i)) || c9797wpM48102k4 != null) {
                        return qy7VarM3726k4;
                    }
                }
            }
        }
        Dictionary<byte[], String> dictionary = new Dictionary<>();
        if (C12576x6.m58708k4() == 1) {
            for (C9773ix c9773ix : C9775k4.m48094x1().mo48027kk()) {
                qy7VarM3726k4.m69903k4(c9773ix.m48090k4());
                C14251ot c14251otM69882b32 = qy7VarM3726k4.m69882b3();
                if (c14251otM69882b32.m68818to() && c14251otM69882b32.m68819x1().m23120k4().m48221m9().m48102k4(i) != null && !dictionary.containsKey(c14251otM69882b32.m68819x1().m23120k4().m48238v4())) {
                    dictionary.addItem(c14251otM69882b32.m68819x1().m23120k4().m48238v4(), c9773ix.m48090k4());
                }
            }
        }
        String strM69923v4 = qy7VarM3726k4.m69923v4();
        for (C12004dy c12004dy : C12004dy.m56522k4()) {
            qy7VarM3726k4.m69903k4(c12004dy.m56527du());
            if (!"Segoe UI Emoji".equals(strM69923v4) || c12004dy.m56527du().toUpperCase().contains("EMOJI")) {
                C14251ot c14251otM69882b33 = qy7VarM3726k4.m69882b3();
                if (c14251otM69882b33.m68818to()) {
                    C9790ts c9790tsM23120k4 = c14251otM69882b33.m68819x1().m23120k4();
                    if (c9790tsM23120k4.m48221m9().m48102k4(i) != null && c9790tsM23120k4.m48238v4() != null && !dictionary.containsKey(c9790tsM23120k4.m48238v4())) {
                        dictionary.addItem(c9790tsM23120k4.m48238v4(), c12004dy.m56527du());
                    }
                }
            }
        }
        for (C9773ix c9773ix2 : C9775k4.m48094x1().mo48027kk()) {
            qy7VarM3726k4.m69903k4(c9773ix2.m48090k4());
            C14251ot c14251otM69882b34 = qy7VarM3726k4.m69882b3();
            if (c14251otM69882b34.m68818to() && c14251otM69882b34.m68819x1().m23120k4().m48221m9().m48102k4(i) != null && !dictionary.containsKey(c14251otM69882b34.m68819x1().m23120k4().m48238v4())) {
                dictionary.addItem(c14251otM69882b34.m68819x1().m23120k4().m48238v4(), c9773ix2.m48090k4());
            }
        }
        if (dictionary.size() > 0) {
            if (C12576x6.m58708k4() == 1) {
                int size = dictionary.getValues().size();
                KeyValuePair<byte[], String>[] keyValuePairArr = new KeyValuePair[size];
                dictionary.copyToTArray(keyValuePairArr, 0);
                AbstractC14092to.m67236k4((Object[]) keyValuePairArr, (Comparator) new Comparator<KeyValuePair<byte[], String>>() { // from class: com.aspose.slides.at.1
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public int compare(KeyValuePair<byte[], String> keyValuePair, KeyValuePair<byte[], String> keyValuePair2) {
                        return keyValuePair.getValue().compareTo(keyValuePair2.getValue());
                    }
                });
                dictionary.clear();
                for (int i3 = 0; i3 < size; i3++) {
                    dictionary.addItem(keyValuePairArr[i3]);
                }
            }
            String strM3727k4 = m3727k4(dictionary, i);
            if (!C14113y2.m67411k4(strM3727k4)) {
                qy7VarM3726k4.m69903k4(strM3727k4);
                qy7VarM3726k4.m69882b3();
                return m3726k4(strM3727k4);
            }
        }
        return qy7VarM3726k4;
    }

    /* JADX INFO: renamed from: k4 */
    private qy7 m3726k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f3942du.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            return this.f3943h4.get_Item(iIntValue);
        }
        qy7 qy7VarCloneT = this.f3948x1.cloneT();
        qy7VarCloneT.m69903k4(str);
        this.f3942du.addItem(qy7VarCloneT.m69912ne(), Integer.valueOf(this.f3943h4.size()));
        this.f3943h4.addItem(qy7VarCloneT);
        return qy7VarCloneT;
    }

    /* JADX INFO: renamed from: k4 */
    private String m3727k4(Dictionary<byte[], String> dictionary, int i) {
        qvp.C14362k4 c14362k4M69776x1 = qvp.m69776x1(i);
        if (c14362k4M69776x1 == null) {
            return null;
        }
        String strM7166k4 = new C1205hi(this.f3948x1.m69922uz()).m7166k4(dictionary);
        if (!C14113y2.m67411k4(strM7166k4)) {
            c14362k4M69776x1.m69778kk().addItem(strM7166k4);
        }
        return strM7166k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3729k4(C14251ot[] c14251otArr) {
        for (int i = 0; i < this.f3943h4.size(); i++) {
            C14251ot c14251otM69882b3 = this.f3943h4.get_Item(i).m69882b3();
            if (c14251otM69882b3.m68818to()) {
                c14251otArr[0] = c14251otM69882b3;
                return true;
            }
        }
        c14251otArr[0] = null;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m3730k4() {
        return this.f3947to[3];
    }
}
