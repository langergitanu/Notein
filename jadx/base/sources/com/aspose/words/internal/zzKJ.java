package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKJ {
    private HashMap<zzJJ, String> zzBZ;
    private Iterable<zzGO> zzC0;
    private zzJT zzC1;
    private zzZYG<zzZXG> zzC2;
    private Iterable<zzGP> zzC3;

    public zzKJ(Iterable<zzGP> iterable) {
        this(iterable, new zzJT(iterable));
    }

    private static zzGO[] zzIm() {
        return new zzGO[]{new zzJH(), new zzJI()};
    }

    private zzZXH zzT(String str, int i) {
        if (!zzZYD.zzXk(str)) {
            return null;
        }
        zzZXG zzzxgZzZW = this.zzC2.get(str);
        if (zzzxgZzZW == null) {
            try {
                zzzxgZzZW = zzZW(str);
                this.zzC2.set(str, zzzxgZzZW);
            } catch (Exception unused) {
                return null;
            }
        }
        return zzzxgZzZW.zzSB(i);
    }

    private zzZXH zzU(String str, int i) {
        if (zzJF.zzHd().containsKey(str)) {
            return zzT(zzJF.zzHd().get(str), i);
        }
        return null;
    }

    private static zzD3<zzJU> zzX(Iterable<zzJU> iterable) {
        zzD3<zzJU> zzd3 = new zzD3<>();
        for (zzJU zzju : iterable) {
            zzJU zzju2 = zzd3.get(zzju.getStyle());
            if (zzju2 == null) {
                zzd3.set(zzju.getStyle(), zzju);
            } else {
                zzd3.set(zzju.getStyle(), zzZ(zzju, zzju2));
            }
        }
        return zzd3;
    }

    private Iterable<zzJU> zzZV(String str) {
        ArrayList arrayList = new ArrayList();
        for (zzJU zzju : this.zzC1.zzHA()) {
            if (zzju.zzHI().contains(str)) {
                zzZQG.zzZ((ArrayList<zzJU>) arrayList, zzju);
            }
        }
        if (arrayList.size() == 0) {
            for (zzJU zzju2 : this.zzC1.zzHA()) {
                if (zzju2.zzHJ().contains(str)) {
                    zzZQG.zzZ((ArrayList<zzJU>) arrayList, zzju2);
                }
            }
        }
        return arrayList;
    }

    private zzZXG zzZW(String str) throws Exception {
        return zzZ(str, zzX(zzZV(str)));
    }

    public final void zzIi() {
        this.zzC1.zzIi();
    }

    public final Collection<zzJU> zzIj() {
        return this.zzC1.zzHA();
    }

    public final zzZXH zzIk() {
        Iterator<zzJU> it = this.zzC1.zzHA().iterator();
        while (it.hasNext()) {
            zzZXH zzzxhZzV = zzV(it.next().getFontFamilyName(), 0);
            if (zzzxhZzV != null) {
                return zzzxhZzV;
            }
        }
        return null;
    }

    public final Iterable<zzGP> zzIl() {
        return this.zzC3;
    }

    public final void zzN(zzZOP zzzop) throws Exception {
        this.zzC1.zzH(zzzop);
    }

    public final zzZXH zzV(String str, int i) {
        if (!zzZYD.zzXk(str)) {
            return null;
        }
        zzZXH zzzxhZzT = zzT(str, i);
        if (zzzxhZzT != null) {
            return zzzxhZzT;
        }
        String strZzU = zzZKN.zzU(zzZKN.zzTX(str), '@');
        if (!zzZYD.zzXk(strZzU)) {
            return null;
        }
        zzZXH zzzxhZzT2 = zzT(strZzU, i);
        return zzzxhZzT2 != null ? zzzxhZzT2 : zzU(strZzU, i);
    }

    public final zzZXH zzZ(zzJJ zzjj, int i) {
        if (!this.zzBZ.containsKey(zzjj)) {
            zzZQF.zzY(this.zzBZ, zzjj, zzZ(zzjj));
        }
        return zzV(this.zzBZ.get(zzjj), i);
    }

    public zzKJ(zzGP[] zzgpArr) {
        this.zzC2 = new zzZYG<>(false);
        this.zzBZ = new HashMap<>();
        Iterable<zzGP> iterableZzZY = zzZKV.zzZY(zzgpArr);
        this.zzC3 = iterableZzZY;
        this.zzC1 = new zzJT(iterableZzZY);
        this.zzC0 = zzZKV.zzZY(zzIm());
    }

    private String zzZ(zzJJ zzjj) {
        Iterator<zzGO> it = this.zzC0.iterator();
        while (it.hasNext()) {
            String strZzZ = it.next().zzZ(zzjj, this.zzC1.zzHA());
            if (zzV(strZzZ, 0) != null) {
                return strZzZ;
            }
        }
        return null;
    }

    private zzKJ(Iterable<zzGP> iterable, zzJT zzjt) {
        this.zzC2 = new zzZYG<>(false);
        this.zzBZ = new HashMap<>();
        if (iterable != null) {
            this.zzC3 = iterable;
            this.zzC1 = zzjt;
            this.zzC0 = zzZKV.zzZY(zzIm());
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: sources");
    }

    private static zzJU zzZ(zzJU zzju, zzJU zzju2) {
        return (zzju.zzHE() <= zzju2.zzHE() && (zzju2.zzHE() > zzju.zzHE() || ((!zzju.zzHH() || zzju2.zzHH()) && ((zzju2.zzHH() && !zzju.zzHH()) || ((zzju.zzHG() || !zzju2.zzHG()) && !zzju2.zzHG() && zzju.zzHG()))))) ? zzju2 : zzju;
    }

    private static zzZXG zzZ(String str, zzD3<zzJU> zzd3) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (zzJU zzju : zzd3.zzCJ()) {
            zzZQG.zzZ((ArrayList<zzZXH>) arrayList, new zzZXF().zzZ(zzju.zzHL(), zzju.zzHF()));
        }
        return new zzZXG(str, arrayList);
    }

    public static zzKJ zzZ(Iterable<zzGP> iterable, zzZOP zzzop) throws Exception {
        return new zzKJ(iterable, zzJT.zzY(iterable, zzzop));
    }
}
