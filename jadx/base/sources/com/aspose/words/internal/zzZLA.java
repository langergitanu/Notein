package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLA {
    private boolean zzZQi;
    private zzX[] zzZQj;

    public static class zzX {
        private String zzLJ;
        private String zzZQa = "";
        private boolean zzZQb;
        private boolean zzZQc;
        private boolean zzZQd;

        public final void setName(String str) {
            this.zzLJ = str;
        }

        public final void zzfv() {
            this.zzZQb = true;
        }

        public final void zzfw() {
            this.zzZQc = true;
        }

        public final boolean zzfx() {
            return this.zzZQc;
        }

        public final void zzfy() {
            this.zzZQd = true;
        }

        public final boolean zzfz() {
            return this.zzZQd;
        }
    }

    public static class zzY {
        zzZ[] zzZQe;
        List<zzZ> zzZQf = new ArrayList();
        zzZLA[] zzZQg;

        public zzY(zzZLD zzzld) {
            this.zzZQg = zzzld.zzZQF;
        }

        public final void zzZ(zzZ zzz) {
            this.zzZQe = null;
            this.zzZQf.add(zzz);
        }
    }

    public static class zzZ {
        int index;
        zzZLA[] zzZQh;

        public zzZ(zzZLD zzzld, int i) {
            this.index = i;
            this.zzZQh = zzzld.zzZQF;
        }
    }

    public final void zzZ(zzX[] zzxArr) {
        this.zzZQj = zzxArr;
    }

    public final void zzfA() {
        this.zzZQi = true;
    }
}
