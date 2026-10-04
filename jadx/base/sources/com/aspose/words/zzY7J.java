package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7J {
    private boolean zzX7E;
    private Map<String, zzY7X> zzX7F;
    private com.aspose.words.internal.zzZQC<zzY7X> zzX7G;
    private zzY7D zzX7H;
    private zzMJ zzX7I;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzG> zzX7J;
    private HashMap<String, com.aspose.words.internal.zzPY> zzX7K;
    private HashMap<String, zzY7O> zzX7L;
    private HashMap<String, com.aspose.words.internal.zzP8> zzX7M;
    private boolean zzX7N;
    private ArrayList<zzY7X> zzX7O;
    private zzZYQ zzX7P;
    private zzY7X zzX7Q;
    private ArrayList<zzLT> zzYna;
    private zzZFF zzYpP;
    private zzMJ zzZop;
    private String zzZp0;

    public zzY7J(String str, zzZFF zzzff, zzZYQ zzzyq, ITextShaperFactory iTextShaperFactory, boolean z, boolean z2) {
        this(str, zzzff, null, null, null, zzzyq, iTextShaperFactory, z, z2);
    }

    private static String zzAn(String str) {
        return com.aspose.words.internal.zzZKN.zzS(str, "url", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? new com.aspose.words.internal.zzZNR("url\\(([^\\(\\)]+)\\)").zzUX(str).zzhJ().zzQx(1).getValue() : str;
    }

    private void zzR(zzY7X zzy7x) {
        if (!zzy7x.zzYDj() || this.zzX7F.containsKey(zzy7x.getId())) {
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzX7F, zzy7x.getId(), zzy7x);
    }

    private zzMJ zzT(zzY7X zzy7x) throws Exception {
        if (this.zzYna == null) {
            zzML zzmlZzZ = zzQH.zzZWz().zzZ(this.zzZp0, this.zzYpP);
            zzmlZzZ.zzW(zzy7x);
            this.zzYna = zzmlZzZ.zzZVv();
        }
        zzMJ zzmj = this.zzX7I;
        return zzmj == null ? zzQH.zzZWz().zzX(this.zzYna) : zzmj;
    }

    private void zzX(zzMJ zzmj, zzY7X zzy7x) {
        zzZ(zzmj, zzy7x);
        Iterator<zzY7X> it = zzy7x.zzQw().iterator();
        while (it.hasNext()) {
            zzX(zzmj, it.next());
        }
        zzY(zzmj, zzy7x);
    }

    private void zzY(zzY7X zzy7x, zzYB5 zzyb5, zzYB5 zzyb52) {
        double width;
        double height;
        double width2;
        double height2;
        if (zzy7x.zzY1x()) {
            return;
        }
        zzPT zzptZzSx = zzy7x.zzZWe().zzSx("width");
        zzPT zzptZzSx2 = zzy7x.zzZWe().zzSx("height");
        if (zzy7x.getWidth() < zzy7x.zzY1B()) {
            zzptZzSx = zzy7x.zzZWe().zzSx("min-width");
        }
        if (zzy7x.getHeight() < zzy7x.zzY1A()) {
            zzptZzSx2 = zzy7x.zzZWe().zzSx("min-height");
        }
        if (zzyb5 != null) {
            width = zzyb5.getWidth();
            height = zzyb5.getHeight();
        } else {
            width = 0.0d;
            height = 0.0d;
        }
        if (this.zzX7E) {
            width2 = 225.0d;
            height2 = 112.5d;
        } else {
            width2 = 0.0d;
            height2 = 0.0d;
        }
        if (zzptZzSx == null) {
            if (zzyb52 != null && zzyb52.getWidth() > 0.0d) {
                width2 = zzyb52.getWidth();
            }
            zzy7x.zzW4(width2);
        } else if (zzptZzSx.zzMt(5)) {
            zzy7x.zzW4((width / 100.0d) * zzptZzSx.zzZWj().zzZVx().getDoubleValue());
        }
        if (zzptZzSx2 != null) {
            if (zzptZzSx2.zzMt(5)) {
                zzy7x.zzW3((height / 100.0d) * zzptZzSx2.zzZWj().zzZVx().getDoubleValue());
            }
        } else {
            if (zzyb52 != null && zzyb52.getHeight() > 0.0d) {
                height2 = zzyb52.getHeight();
            }
            zzy7x.zzW3(height2);
        }
    }

    public final byte[] zzAo(String str) throws Exception {
        return this.zzYpP.zzZ4(this.zzZp0, str);
    }

    public final zzY7X zzAp(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        String strZzWG = com.aspose.words.internal.zzZVR.zzWG(zzAn(str));
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<String, V>) this.zzX7F, strZzWG, ref);
        zzY7X zzy7x = (zzY7X) ref.get();
        if (zZzZ) {
            return zzy7x;
        }
        return (zzY7X) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) this.zzX7F, com.aspose.words.internal.zzZKN.zzU(strZzWG, '#'));
    }

    public final zzY7O zzAq(String str) throws Exception {
        zzY7X zzy7xZzAp;
        String strZzAn = zzAn(str);
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzX7L, strZzAn, ref);
        zzY7O zzy7o = (zzY7O) ref.get();
        if (zZzZ || (zzy7xZzAp = zzAp(strZzAn)) == null) {
            return zzy7o;
        }
        zzY7O zzy7oZzP = zzY7O.zzP(this, zzy7xZzAp);
        com.aspose.words.internal.zzZQF.zzY(this.zzX7L, strZzAn, zzy7oZzP);
        return zzy7oZzP;
    }

    public final com.aspose.words.internal.zzP8 zzAr(String str) throws Exception {
        zzY7X zzy7xZzAp;
        String strZzAn = zzAn(str);
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzX7M, strZzAn, ref);
        com.aspose.words.internal.zzP8 zzp8ZzN = (com.aspose.words.internal.zzP8) ref.get();
        if (!zZzZ && (zzy7xZzAp = zzAp(strZzAn)) != null && (zzp8ZzN = zzY7G.zzN(this, zzy7xZzAp)) != null) {
            com.aspose.words.internal.zzZQF.zzY(this.zzX7M, strZzAn, zzp8ZzN);
        }
        return zzp8ZzN;
    }

    public final com.aspose.words.internal.zzG zzPM(boolean z) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        if (z) {
            zzY0U().zzX((com.aspose.words.internal.zzZL) zzg);
        }
        this.zzX7J.push(zzg);
        return zzg;
    }

    public final void zzS(com.aspose.words.internal.zzZL zzzl) {
        zzY0U().zzX(zzzl);
    }

    public final void zzU(zzY7X zzy7x) {
        if (zzy7x.zzY1q()) {
            this.zzX7G.peek();
            this.zzX7G.pop();
        }
    }

    public final void zzV(zzY7X zzy7x) {
        if (zzy7x.zzY1q()) {
            this.zzX7G.push(zzy7x);
        }
    }

    public final void zzW(zzY7X zzy7x) throws Exception {
        this.zzX7H.zzQ(zzy7x);
    }

    public final double zzW1(double d) {
        zzY7X zzy7xPeek;
        this.zzX7G.size();
        if (d < 0.0d || (zzy7xPeek = this.zzX7G.peek()) == null) {
            return 0.0d;
        }
        double dZzY1z = (!zzy7xPeek.zzY1x() || zzy7xPeek.zzY1s() == null) ? zzy7xPeek.zzY1z() : zzy7xPeek.zzY1s().getWidth();
        if (com.aspose.words.internal.zzAN.zzZC(dZzY1z)) {
            return 0.0d;
        }
        return (dZzY1z / 100.0d) * d;
    }

    public final double zzW2(double d) {
        zzY7X zzy7xPeek;
        this.zzX7G.size();
        if (d < 0.0d || (zzy7xPeek = this.zzX7G.peek()) == null) {
            return 0.0d;
        }
        double dZzY1y = (!zzy7xPeek.zzY1x() || zzy7xPeek.zzY1s() == null) ? zzy7xPeek.zzY1y() : zzy7xPeek.zzY1s().getHeight();
        if (com.aspose.words.internal.zzAN.zzZC(dZzY1y)) {
            return 0.0d;
        }
        return (dZzY1y / 100.0d) * d;
    }

    public final boolean zzY0R() {
        return this.zzX7N;
    }

    public final ArrayList<zzY7X> zzY0S() {
        return this.zzX7O;
    }

    public final zzY7X zzY0T() {
        return this.zzX7Q;
    }

    public final com.aspose.words.internal.zzG zzY0U() {
        if (this.zzX7J.size() > 0) {
            return this.zzX7J.peek();
        }
        return null;
    }

    public final com.aspose.words.internal.zzPY zzZ(zzY7X zzy7x, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        Ref ref = new Ref(null);
        boolean z = zzy7x.zzY1r() != null && com.aspose.words.internal.zzZQF.zzZ(this.zzX7K, zzy7x.getId(), ref);
        com.aspose.words.internal.zzPY zzpy = (com.aspose.words.internal.zzPY) ref.get();
        if (z) {
            return zzpy;
        }
        com.aspose.words.internal.zzPY zzpyZzX = zzY7S.zzX(this, zzy7x, zzzq4);
        if (zzpyZzX != null) {
            this.zzX7K.put(zzy7x.getId(), zzpyZzX);
        }
        return zzpyZzX;
    }

    public final void zzZAD() {
        if (zzY0U().getCount() == 0) {
            zzY0U().zzZ6();
        }
        this.zzX7J.pop();
    }

    public final zzZYQ zzZqx() {
        return this.zzX7P;
    }

    public final zzZYZ zzZqy() {
        return this.zzX7P.zzZqy();
    }

    public zzY7J(String str, zzZFF zzzff, Map<String, zzY7X> map, ArrayList<zzLT> arrayList, zzMJ zzmj, zzZYQ zzzyq, ITextShaperFactory iTextShaperFactory, boolean z, boolean z2) {
        this.zzX7M = new HashMap<>();
        this.zzX7L = new HashMap<>();
        this.zzX7K = new HashMap<>();
        this.zzX7J = new com.aspose.words.internal.zzZQC<>();
        this.zzX7G = new com.aspose.words.internal.zzZQC<>();
        this.zzX7P = zzzyq;
        this.zzZp0 = str;
        this.zzYpP = zzzff == null ? new zzZFF() : zzzff;
        this.zzX7F = map == null ? new HashMap<>() : map;
        this.zzX7O = map == null ? new ArrayList<>() : com.aspose.words.internal.zzZQG.zzY(map.values());
        this.zzX7H = new zzY7D(this, this.zzX7P.zzZqy(), iTextShaperFactory);
        zzPM(false);
        this.zzYna = arrayList;
        this.zzX7I = zzmj;
        this.zzX7E = z;
        this.zzX7N = z2;
    }

    private boolean zzS(zzY7X zzy7x) {
        return this.zzX7I != null && zzy7x == this.zzX7Q;
    }

    private void zzW(zzMJ zzmj, zzY7X zzy7x) {
        for (zzY7X zzy7x2 : zzy7x.zzQw()) {
            zzR(zzy7x2);
            zzZ(zzmj, zzy7x2);
            zzW(zzmj, zzy7x2);
            zzY(zzmj, zzy7x2);
        }
    }

    public final void zzZ(zzPS zzps, zzY7X zzy7x) {
        this.zzZop.zzZ(new zzY7X("g", "", new HashMap(), new HashMap(), null), zzps);
        zzX(this.zzZop, zzy7x);
        this.zzZop.zzZVt();
    }

    public final void zzT(int i, String str) {
        if (this.zzX7P.getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzX7P.getWarningCallback(), i, 22, str);
        }
    }

    private void zzZ(zzY7X zzy7x, zzMJ zzmj) {
        zzZ(zzmj, zzy7x);
        zzW(zzmj, zzy7x);
        zzY(zzmj, zzy7x);
    }

    private void zzZ(zzMJ zzmj, zzY7X zzy7x) {
        if (zzy7x.isText()) {
            zzy7x.zzG(zzy7x.zzY1C().zzZWe());
            return;
        }
        if ("http://www.w3.org/1999/xhtml".equals(zzy7x.zzZ2G())) {
            return;
        }
        if (!zzS(zzy7x)) {
            zzmj.zzR(zzy7x);
        }
        if (zzy7x.zzZWe() == null) {
            zzy7x.zzG(zzmj.zzZWe());
        } else {
            zzPR zzpr = new zzPR();
            zzpr.zzP(zzmj.zzZWe());
            zzpr.zzO(zzy7x.zzZWe());
            zzy7x.zzG(zzpr.zzZWe());
        }
        zzy7x.zzF(zzmj.zzZVr());
        zzY7B.zzK(null, zzy7x);
        zzY7B.zzG(zzy7x);
    }

    private void zzY(zzMJ zzmj, zzY7X zzy7x) {
        if ("http://www.w3.org/1999/xhtml".equals(zzy7x.zzZ2G()) || zzy7x.isText() || zzS(zzy7x)) {
            return;
        }
        zzmj.zzZVt();
    }

    public final void zzZ(zzY7X zzy7x, zzYB5 zzyb5, zzYB5 zzyb52) throws Exception {
        this.zzX7Q = zzy7x;
        zzMJ zzmjZzT = zzT(zzy7x);
        this.zzZop = zzmjZzT;
        zzZ(zzy7x, zzmjZzT);
        zzY(zzy7x, zzyb5, zzyb52);
    }
}
