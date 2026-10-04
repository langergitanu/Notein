package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ79 {
    int zzYh2;
    int zzYh3;
    int zzYh4;
    int zzYh5;

    public zzZ79(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzXa();
        zzzox.zzXa();
        this.zzYh5 = zzzox.zzX9() & 65535;
        this.zzYh4 = zzzox.zzX9() & 65535;
        this.zzYh3 = zzzox.zzXa();
        this.zzYh2 = zzzox.zzXc();
    }

    public final zzZ7B zzS(com.aspose.words.internal.zzD3<String> zzd3) {
        zzZ7B zzz7b = new zzZ7B();
        zzz7b.zzYhn = this.zzYh5;
        int i = this.zzYh4;
        if (i == 255) {
            i = 0;
        }
        zzz7b.zzYhm = i;
        int i2 = this.zzYh3;
        if (i2 != 0) {
            if (i2 == 1) {
                zzz7b.zzYhl = 5;
                zzz7b.zzYhg = this.zzYh2;
                return zzz7b;
            }
            if (i2 != 3) {
                throw new IllegalStateException("Unknown kt value.");
            }
            zzz7b.zzYhl = 1;
            return zzz7b;
        }
        int i3 = this.zzYh2;
        int i4 = i3 & 7;
        if (i4 == 1) {
            zzz7b.zzYhl = 3;
            zzz7b.zzYhj = (i3 >> 3) & 8191;
            zzz7b.zzYhi = (i3 >> 16) & 65535;
            return zzz7b;
        }
        if (i4 == 2) {
            zzz7b.zzYhl = 4;
            zzz7b.zzYhh = zzd3.get((i3 >> 16) & 65535);
            return zzz7b;
        }
        if (i4 == 3) {
            zzz7b.zzYhl = 2;
            zzz7b.zzYhk = (i3 >> 16) & 65535;
            return zzz7b;
        }
        if (i4 != 7) {
            throw new IllegalStateException("Unknown cmt value.");
        }
        zzz7b.zzYhl = 0;
        return zzz7b;
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) this.zzYh5);
        zzzow.zzK((short) this.zzYh4);
        zzzow.zzK((short) this.zzYh3);
        zzzow.zzl(this.zzYh2);
    }

    public zzZ79(zzZ7B zzz7b, ArrayList<String> arrayList) {
        this.zzYh5 = zzz7b.zzYhn;
        int i = zzz7b.zzYhm;
        this.zzYh4 = i == 0 ? 255 : i;
        int i2 = zzz7b.zzYhl;
        if (i2 == 0) {
            this.zzYh3 = 0;
            this.zzYh2 = -1;
            return;
        }
        if (i2 == 1) {
            this.zzYh3 = 3;
            return;
        }
        if (i2 == 2) {
            this.zzYh3 = 0;
            this.zzYh2 = (zzz7b.zzYhk << 16) | 3;
            return;
        }
        if (i2 == 3) {
            this.zzYh3 = 0;
            this.zzYh2 = (zzz7b.zzYhj << 3) | (zzz7b.zzYhi << 16) | 1;
        } else if (i2 == 4) {
            this.zzYh3 = 0;
            this.zzYh2 = (arrayList.size() << 16) | 2;
            arrayList.add(zzz7b.zzYhh);
        } else {
            if (i2 == 5) {
                this.zzYh3 = 1;
                this.zzYh2 = zzz7b.zzYhg;
                return;
            }
            throw new IllegalStateException("Unknown keymap type.");
        }
    }
}
