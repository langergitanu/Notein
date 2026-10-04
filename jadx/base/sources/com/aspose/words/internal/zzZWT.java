package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWT {
    private String zz93;
    private ArrayList<zzZ> zz94 = new ArrayList<>();

    public static class zzZ {
        private String zz91;
        private zzZOS zz92;

        public zzZ(zzZOS zzzos, String str) {
            this.zz92 = zzzos;
            this.zz91 = str;
        }

        public final String zzoo() {
            return this.zz91;
        }

        public final zzZOS zzop() {
            return this.zz92;
        }
    }

    public zzZWT(String str) {
        this.zz93 = str;
    }

    public final void cleanup() throws Exception {
        for (zzZ zzz : this.zz94) {
            zzz.zzop().close();
            zzZOU.delete(zzz.zzoo());
        }
    }

    public final boolean zzoq() {
        return zzZYD.zzXk(this.zz93);
    }

    public final zzZOP zzor() throws Exception {
        if (!zzZYD.zzXk(this.zz93)) {
            return new zzZOR();
        }
        String strZzZW = zzZOQ.zzZW(this.zz93, zzZKN.format("{0}.tmp", zzZOZ.zziD()));
        zzZOS zzzos = new zzZOS(strZzZW, 2, 3);
        zzZQG.zzZ(this.zz94, new zzZ(zzzos, strZzZW));
        return zzzos;
    }
}
