package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzWL implements zzZBJ {
    private zzZQM zzZCC;
    private boolean zzZzN;
    private zzZD4 zzZzO;

    public static class zzY {
        private boolean zzZzG;
        private boolean zzZzH;
        private boolean zzZzI;
        private boolean zzZzJ;

        private zzY() {
        }

        public final boolean isStarted() {
            return this.zzZzJ;
        }

        public final boolean zz58() {
            return this.zzZzG;
        }

        public final boolean zz59() {
            return this.zzZzH;
        }

        public final boolean zz5a() {
            return this.zzZzI;
        }

        public final void zz5b() {
            this.zzZzJ = true;
        }

        public final void zzYA(boolean z) {
            this.zzZzH = z;
        }

        public final void zzYB(boolean z) {
            this.zzZzI = z;
        }

        public final void zzYz(boolean z) {
            this.zzZzG = z;
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static class zzZ {
        static zzZ zzZzM = new zzZ(null, false);
        private boolean zzZzK;
        private zzZVZ zzZzL;

        public zzZ(zzZVZ zzzvz, boolean z) {
            this.zzZzL = zzzvz;
            this.zzZzK = z;
        }

        public final boolean zz5c() {
            return this.zzZzK;
        }

        public final zzZVZ zz5d() {
            return this.zzZzL;
        }
    }

    private zzWL(zzZD4 zzzd4, zzZQM zzzqm, boolean z) {
        this.zzZzO = zzzd4;
        this.zzZCC = zzzqm;
        this.zzZzN = z;
    }

    private zzTL zz5e() throws Exception {
        zzY zzy = new zzY((byte) 0);
        zzS zzs = new zzS();
        Iterator<Cell> it = this.zzZzO.iterator();
        while (it.hasNext() && zzZ(it.next(), zzs, zzy)) {
        }
        return zzs;
    }

    private zzTL zz5f() throws Exception {
        if (this.zzZzO.zzYWV().zz6C() == null) {
            return this.zzZzN ? zzYU1.zzXSl : new zzZU3(com.aspose.words.internal.zzZKN.format("!{0} Is Not In Table", this.zzZzO.zzYWV()));
        }
        zzZVZ zzzvzZz5d = zzZ(this.zzZzO.zzYWV().zz6C(), true).zz5d();
        return zzzvzZz5d != null ? zzzvzZz5d : this.zzZzN ? zzYU0.zzXSk : new zzZVZ(0.0d);
    }

    private static zzZBJ zzY(zzZQM zzzqm, String str) {
        Ref ref = new Ref(null);
        zzTL zztlZzZ = zzYO5.zzZ(zzzqm, str, ref);
        zzZD4 zzzd4 = (zzZD4) ref.get();
        if (zztlZzZ != null) {
            return zztlZzZ;
        }
        if (zzzd4 != null) {
            return new zzWL(zzzd4, zzzqm, false);
        }
        return null;
    }

    public static zzZBJ zzZ(zzZQM zzzqm, String str) throws Exception {
        zzZBJ zzzbjZzY = zzY(zzzqm, str);
        return zzzbjZzY != null ? zzzbjZzY : zzZ(zzzqm, str, true);
    }

    public static zzZBJ zzZ(zzZQM zzzqm, String str, boolean z) throws Exception {
        Ref ref = new Ref(null);
        zzTL zztlZzZ = zzYK0.zzZ(zzzqm, str, z, ref);
        zzZD4 zzzd4 = (zzZD4) ref.get();
        if (zztlZzZ != null) {
            return zztlZzZ;
        }
        if (zzzd4 != null) {
            return new zzWL(zzzd4, zzzqm, z);
        }
        return null;
    }

    @Override // com.aspose.words.zzZBJ
    public final zzTL zzZ(zzTJ zztj) throws Exception {
        if (this.zzZzO.zzYWW()) {
            return zz5f();
        }
        return zz5e();
    }

    private boolean zzZ(Cell cell, zzS zzs, zzY zzy) throws Exception {
        zzZ zzZ2 = zzZ(cell, !zzy.zz58());
        zzy.zzYz(zzy.zz58() || zzZ2.zz5c());
        if (zzZ2.zz5d() != null) {
            if (!zzy.isStarted()) {
                zzs.zzbZ().zzY(zzZ2.zz5d());
                zzy.zz5b();
                zzy.zzYB(zzZ2.zz5d().zzZk4());
                zzy.zzYA(!zzy.zz5a());
                return true;
            }
            if (zzZ2.zz5d().zzZk4()) {
                if (zzy.zz59()) {
                    return false;
                }
                zzs.zzbZ().zzY(zzZ2.zz5d());
            } else {
                zzs.zzbZ().zzY(zzZ2.zz5d());
                zzy.zzYA(true);
            }
        } else if (!this.zzZzO.zzYWX()) {
            if (zzy.isStarted() && !zzy.zz5a()) {
                return false;
            }
            zzs.zzbZ().zzY(this.zzZzO.zzYWT());
        }
        return true;
    }

    private zzZ zzZ(Cell cell, boolean z) throws Exception {
        if (!cell.hasChildNodes()) {
            return zzZ.zzZzM;
        }
        StringBuilder sb = new StringBuilder();
        for (Paragraph paragraph : cell.getChildNodes(8, true)) {
            if (paragraph.hasChildNodes()) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzYVY.zzZ(paragraph.getFirstChild(), true, paragraph.getLastChild(), true, true)).append(ControlChar.SPACE_CHAR);
            }
        }
        String string = sb.toString();
        zzZVZ zzzvzZzMJ = zzZVZ.zzMJ(string);
        if (zzzvzZzMJ != null) {
            return new zzZ(zzzvzZzMJ, true);
        }
        if (z || this.zzZzO.zzYWS()) {
            zzzvzZzMJ = zzZSH.zzY(this.zzZCC, string, true);
        }
        return new zzZ(zzzvzZzMJ, false);
    }
}
