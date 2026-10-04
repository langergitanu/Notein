package com.aspose.words;

import com.miui.penengine.p596e.C18773h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz6U implements zzZCC {
    private ArrayList<zz6W> zzZ35;
    private ArrayList<zz6W> zzZ36 = new ArrayList<>();
    private zzZCD zzZ34 = new zz6V();
    private com.aspose.words.internal.zz7E<String> zzZ33 = new com.aspose.words.internal.zz7E<>();
    private ArrayList<zz6W> zzZ32 = new ArrayList<>();

    private void zz1(ArrayList<zz6W> arrayList) {
        for (zz6W zz6w : arrayList) {
            this.zzZ33.zzY(zz6w.getName(), zz6w.zzZA6().zzX(this));
        }
    }

    public final void zzO(String str, String str2, boolean z) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ32, this.zzZ34.zzQ(str2, str, z));
    }

    @Override // com.aspose.words.zzZCC
    public final double zzOy(String str) {
        double dZzm = this.zzZ33.zzm(str);
        if (!com.aspose.words.internal.zz7E.zzZy(dZzm)) {
            return dZzm;
        }
        throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Guide with name '{0}' not found.", str) + "\r\nParameter name: " + str);
    }

    public final void zzP(String str, String str2, boolean z) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ36, this.zzZ34.zzQ(str2, str, z));
    }

    public final void zzS(String str, double d) {
        zzP(str, com.aspose.words.internal.zzZKN.format("val {0}", com.aspose.words.internal.zzJB.zzZZ(d)), false);
    }

    public final ArrayList<zz6W> zzZA1() {
        return this.zzZ32;
    }

    public final ArrayList<zz6W> zzZA2() {
        return this.zzZ36;
    }

    public final zz6U zzZA3() {
        zz6U zz6u = new zz6U();
        zz6u.zzZ32 = new ArrayList<>();
        Iterator<zz6W> it = this.zzZ32.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz6u.zzZ32, it.next().zzZA7());
        }
        zz6u.zzZ36 = new ArrayList<>();
        Iterator<zz6W> it2 = this.zzZ36.iterator();
        while (it2.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz6u.zzZ36, it2.next().zzZA7());
        }
        zz6u.zzZ33 = new com.aspose.words.internal.zz7E<>();
        com.aspose.words.internal.zz7E<String>.zzZ zzzZzxw = this.zzZ33.zzxw();
        while (zzzZzxw.moveNext()) {
            zz6u.zzZ33.zzZ(zzzZzxw.zzxv(), zzzZzxw.zzxu());
        }
        if (this.zzZ35 != null) {
            zz6u.zzZ35 = new ArrayList<>();
            Iterator<zz6W> it3 = this.zzZ35.iterator();
            while (it3.hasNext()) {
                zz6u.zzZ35.add(it3.next().zzZA7());
            }
        }
        return zz6u;
    }

    public final void zzp(double d, double d2) {
        this.zzZ33.clear();
        this.zzZ33.zzY("w", d);
        this.zzZ33.zzY(C18773h.f57233c, d2);
        ArrayList<zz6W> arrayListZzZA4 = this.zzZ34.zzZA4();
        this.zzZ35 = arrayListZzZA4;
        zz1(arrayListZzZA4);
        zz1(this.zzZ36);
        zz1(this.zzZ32);
    }
}
