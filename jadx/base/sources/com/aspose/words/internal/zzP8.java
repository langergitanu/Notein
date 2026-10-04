package com.aspose.words.internal;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzP8 {
    private int zzH3;
    private ArrayList<zzP5> zzH4;

    public zzP8() {
        this(0);
    }

    public static zzP8 zzM(zzZQ4 zzzq4) {
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzH4, zzP5.zzK(zzzq4));
        return zzp8;
    }

    public static zzP8 zzT(long j, long j2) {
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzH4, zzP5.zzS(j, j2));
        return zzp8;
    }

    public static zzP8 zzY(zz0Q zz0q, boolean z, boolean z2) {
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzH4, zzP5.zzX(zz0q, z, z2));
        return zzp8;
    }

    public final int getCount() {
        return this.zzH4.size();
    }

    public final int zzO6() {
        return this.zzH3;
    }

    public final ArrayList<zzP5> zzO7() {
        return this.zzH4;
    }

    public final zzP8 zzO8() {
        zzP8 zzp8 = new zzP8(this.zzH4.size());
        zzp8.zzH3 = this.zzH3;
        Iterator<zzP5> it = this.zzH4.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ(zzp8.zzH4, it.next().zzNZ());
        }
        return zzp8;
    }

    public final boolean zzO9() {
        zzP5 zzp5 = this.zzH4.size() > 0 ? (zzP5) C21505OooO0Oo.OooO00o(1, this.zzH4) : null;
        return zzp5 != null && zzp5.isClosed();
    }

    public final void zzY1(int i) {
        this.zzH3 = i;
    }

    public zzP8(int i) {
        this.zzH4 = new ArrayList<>(i);
        this.zzH3 = 0;
    }

    public static zzP8 zzY(long[] jArr, boolean z, boolean z2) {
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzH4, zzP5.zzX(jArr, z, z2));
        return zzp8;
    }

    public final void zzY(zzP9 zzp9) {
        if (zzP9.zzO(zzp9)) {
            return;
        }
        Iterator<zzP5> it = this.zzH4.iterator();
        while (it.hasNext()) {
            it.next().zzY(zzp9);
        }
    }

    public final void zzY(zzH2 zzh2) throws Exception {
        Iterator<zzP5> it = this.zzH4.iterator();
        while (it.hasNext()) {
            it.next().zzY(zzh2);
        }
    }
}
