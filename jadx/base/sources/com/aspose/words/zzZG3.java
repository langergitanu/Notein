package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG3 implements Iterable<zzZG4> {
    private zzZIG zzYnM;
    private long zzYtu = 1;
    private ArrayList<zzZG4> zzZm = new ArrayList<>();

    public zzZG3(zzZIG zzzig) {
        this.zzYnM = zzzig;
    }

    private void zzZ0b() {
        this.zzZm.clear();
        this.zzYtu++;
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZG4> iterator() {
        return this.zzZm.iterator();
    }

    public final int zzV(zzZG4 zzzg4) {
        return this.zzZm.indexOf(zzzg4);
    }

    public final void zzW(zzZG4 zzzg4) {
        this.zzZm.indexOf(zzzg4);
        zzzg4.zzK(null);
        if (zzzg4.zzZ0c() != null) {
            zzzg4.zzZ0c().zzZ(zzzg4.zzZ0d());
        }
        if (zzzg4.zzZ0d() != null) {
            zzzg4.zzZ0d().zzY(zzzg4.zzZ0c());
        }
        zzzg4.zzY(null);
        zzzg4.zzZ(null);
        this.zzZm.remove(zzzg4);
        this.zzYtu++;
    }

    public final void zzX(zzZG4 zzzg4) {
        zzZG4 zzzg42;
        if ((zzzg4 instanceof zzZEC) && this.zzZm.size() > 0 && (C21505OooO0Oo.OooO00o(1, this.zzZm) instanceof zzZEC)) {
            zzZEC zzzec = (zzZEC) C21505OooO0Oo.OooO00o(1, this.zzZm);
            String str = zzzec.getText() + ((zzZEC) zzzg4).getText();
            zzW(zzzec);
            zzX(new zzZEC(str));
        } else {
            zzzg4.zzK(this.zzYnM);
            if (this.zzZm.size() > 0) {
                zzzg42 = (zzZG4) C21505OooO0Oo.OooO00o(1, this.zzZm);
                zzzg42.zzZ(zzzg4);
            } else {
                zzzg42 = null;
            }
            zzzg4.zzY(zzzg42);
            zzzg4.zzZ(null);
            com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzg4);
        }
        this.zzYtu++;
    }

    public final void zzZ(zzZG3 zzzg3) {
        this.zzZm.ensureCapacity(zzzg3.zzZm.size() + this.zzZm.size());
        Iterator<zzZG4> it = zzzg3.iterator();
        while (it.hasNext()) {
            zzX(it.next());
        }
        zzzg3.zzZ0b();
    }

    public final long zzZ4r() {
        return this.zzYtu;
    }

    public final zzZG4 zzzd(int i) {
        return this.zzZm.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(int i, zzZG4 zzzg4) {
        zzZG4 zzzg42;
        this.zzZm.indexOf(zzzg4);
        this.zzZm.size();
        boolean z = zzzg4 instanceof zzZEC;
        if (z && i > 0) {
            int i2 = i - 1;
            if (this.zzZm.get(i2) instanceof zzZEC) {
                zzZEC zzzec = (zzZEC) this.zzZm.get(i2);
                zzW(zzzec);
                zzZ(i2, new zzZEC(zzzec.getText() + ((zzZEC) zzzg4).getText()));
            }
        } else if (z && (this.zzZm.get(i) instanceof zzZEC)) {
            zzZEC zzzec2 = (zzZEC) this.zzZm.get(i);
            zzW(zzzec2);
            zzZ(i, new zzZEC(((zzZEC) zzzg4).getText() + zzzec2.getText()));
        } else {
            zzzg4.zzK(this.zzYnM);
            if (i > 0) {
                zzzg42 = this.zzZm.get(i - 1);
                zzzg42.zzZ(zzzg4);
            } else {
                zzzg42 = null;
            }
            zzzg4.zzY(zzzg42);
            zzzg4.zzZ(this.zzZm.get(i));
            zzzg4.zzZ0d().zzY(zzzg4);
            this.zzZm.add(i, zzzg4);
        }
        this.zzYtu++;
    }
}
