package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz64 {
    private zz9K zzZ2c;
    private zz8Z zzZ7J;
    private com.aspose.words.internal.zzD3<zz65> zzZ2g = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzZYG<zzZC8> zzZ2f = new com.aspose.words.internal.zzZYG<>();
    private ArrayList<zz68> zzZ2e = new ArrayList<>();
    private ArrayList<zz69> zzZ2d = new ArrayList<>();
    private ArrayList<zz66> zzBv = new ArrayList<>();

    public zz64(zz9K zz9k, zz8Z zz8z) {
        this.zzZ2c = zz9k;
        this.zzZ7J = zz8z;
    }

    private static void zz0(ArrayList<zzZC9> arrayList) {
        Iterator<zzZC9> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().invalidate();
        }
    }

    private static String zzN(zzBE zzbe) {
        return com.aspose.words.internal.zzZKN.format("{0}-{1}-{2}-{3}", Integer.valueOf(zzbe.getType()), Integer.valueOf(zzbe.zzZF7()), zzbe.zzZF6(), Integer.valueOf(zzbe.zzZF5()));
    }

    private ArrayList<zz69> zzW(zzZC9 zzzc9) {
        ArrayList<zz69> arrayList = new ArrayList<>();
        for (zz69 zz69Var : this.zzZ2d) {
            if (zz69Var.zzZzy() == zzzc9) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zz69Var);
            }
        }
        return arrayList;
    }

    private ArrayList<zzBC> zzX5(boolean z) {
        zzB9 zzb9ZzZzi;
        ArrayList<zzBC> arrayList = new ArrayList<>();
        for (zzZC8 zzzc8 : this.zzZ2f.zzCJ()) {
            if (z == zzB5.zzJs(zzzc8.getType()) && (zzb9ZzZzi = zzzc8.zzZzi()) != null && !this.zzZ7J.zzZCH().zzY(zzb9ZzZzi)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzB9>) arrayList, zzb9ZzZzi);
            }
        }
        return arrayList;
    }

    private void zzZ(ArrayList<zzZC9> arrayList, float f) {
        zzZC9 zzzc9 = arrayList.get(0);
        zzZC9 zzzc92 = (zzZC9) C21505OooO0Oo.OooO00o(1, arrayList);
        if (arrayList.size() != 1) {
            if (zzzc92 == zzzc9) {
                if (f < 1.0f) {
                    zz0(arrayList);
                    return;
                }
                return;
            } else {
                for (int i = 1; i < arrayList.size() - 2; i++) {
                    if (arrayList.get(i) == zzzc92) {
                        return;
                    }
                }
            }
        }
        for (zz69 zz69Var : zzW(zzzc92)) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zz69Var.zzZzx());
            zzZ(arrayList, zz69Var.zzZzw() * f);
            Class.getSimpleName();
        }
    }

    private void zzZz6() {
        Iterator<zz65> it = this.zzZ2g.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().zzZzf();
        }
        Iterator<zzZC8> it2 = this.zzZ2f.zzCJ().iterator();
        while (it2.hasNext()) {
            it2.next().zzZzf();
        }
    }

    private void zzZz7() {
        for (zz68 zz68Var : this.zzZ2e) {
            if (!zz68Var.zzZzv()) {
                zz68Var.zzZzy().zzYT(zz68Var.zzPv());
            }
        }
    }

    private void zzZz8() {
        int i = 0;
        do {
            Iterator<zz69> it = this.zzZ2d.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (it.next().zzZzu()) {
                    z = false;
                }
            }
            if (z) {
                return;
            } else {
                i++;
            }
        } while (i <= this.zzZ2d.size());
    }

    private void zzZz9() {
        for (zzBC zzbc : this.zzZ7J.zzZCH().zzZF1()) {
            if (zzbc.zzZF3().zzZzn() == this.zzZ2c && !(zzbc instanceof zzBA)) {
                zzbc.apply();
            }
        }
    }

    private void zzZza() {
        for (zzBC zzbc : this.zzZ7J.zzZCH().zzZF1()) {
            if (zzbc.zzZF3() == this.zzZ2c.zzZDN() && (zzbc instanceof zzBA)) {
                zzbc.apply();
            }
        }
        for (zzBC zzbc2 : this.zzZ7J.zzZCH().zzZF1()) {
            if (zzbc2.zzZF3() == this.zzZ2c.zzZDM() && (zzbc2 instanceof zzBA)) {
                zzbc2.apply();
            }
        }
    }

    public final zz65 zzHW(int i) {
        this.zzZ2g.set(i, new zz65(i, this.zzZ2c));
        return this.zzZ2g.get(i);
    }

    public final zz65 zzHX(int i) {
        return this.zzZ2g.get(i);
    }

    public final zzZC8 zzO(zzBE zzbe) {
        return this.zzZ2f.get(zzN(zzbe));
    }

    public final zzZC9 zzR(zzBE zzbe) {
        return zzbe.zzZF7() == 2 ? zzHX(zzbe.getType()) : zzO(zzbe);
    }

    public final boolean zzX6(boolean z) {
        return zzX5(z).size() > 0;
    }

    public final void zzX7(boolean z) {
        this.zzZ7J.zzZCH().zzL(zzX5(z));
    }

    public final ArrayList<zz66> zzZz1() {
        return this.zzBv;
    }

    public final ArrayList<zz69> zzZz2() {
        return this.zzZ2d;
    }

    public final ArrayList<zz68> zzZz3() {
        return this.zzZ2e;
    }

    public final com.aspose.words.internal.zzD3<zz65> zzZz4() {
        return this.zzZ2g;
    }

    public final void zzZz5() {
        this.zzZ2c.zzZDK().zzV(this.zzZ2c);
        for (zzZC8 zzzc8 : this.zzZ2f.zzCJ()) {
            if (!zzzc8.zzZzm()) {
                this.zzZ7J.zzZCH().zzL(zzzc8.zzZzj());
            }
        }
        for (zzZC8 zzzc82 : this.zzZ2f.zzCJ()) {
            if (zzzc82.zzZzm()) {
                this.zzZ7J.zzZCH().zzL(zzzc82.zzZzj());
            }
        }
    }

    public final void zzZzb() {
        zzZz6();
        zzZz9();
        zzZza();
        zzZz7();
        zzZz8();
    }

    public final void zzZzc() {
        for (zz65 zz65Var : this.zzZ2g.zzCJ()) {
            ArrayList<zzZC9> arrayList = new ArrayList<>();
            arrayList.add(zz65Var);
            zzZ(arrayList, 1.0f);
        }
        for (zzZC8 zzzc8 : this.zzZ2f.zzCJ()) {
            ArrayList<zzZC9> arrayList2 = new ArrayList<>();
            arrayList2.add(zzzc8);
            zzZ(arrayList2, 1.0f);
        }
    }

    public final void zzZ(zzZC8 zzzc8) {
        this.zzZ2f.set(zzN(zzzc8.zzZzt()), zzzc8);
    }
}
