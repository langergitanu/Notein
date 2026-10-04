package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYJV extends zzTI {
    private zzZ4Y zzXCr;
    private String zzXCs;

    private String getLabel() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzXCs) ? com.aspose.words.internal.zzZKN.zzZ(this.zzXCs, com.aspose.words.internal.zzZP1.zzj8()) : com.aspose.words.internal.zzZKN.zzZ(getText(), com.aspose.words.internal.zzZP1.zzj8());
    }

    private boolean zzY(String str, HashMap<String, zzZ4Y> map) {
        Ref ref = new Ref(this.zzXCr);
        boolean z = zzYlZ() != null || com.aspose.words.internal.zzZQF.zzZ(map, str, ref);
        this.zzXCr = (zzZ4Y) ref.get();
        return z;
    }

    private zzZ4X zzYlZ() {
        return (zzZ4X) com.aspose.words.internal.zzZKW.zzZ(zz9G(), zzZ4X.class);
    }

    private boolean zzYm1() {
        if (zzYlZ() != null) {
            return false;
        }
        zzZ4R zzz4r = (zzZ4R) com.aspose.words.internal.zzZKW.zzZ(zz9H(), zzZ4R.class);
        zzZ8H zzz8h = (zzZ8H) com.aspose.words.internal.zzZKW.zzZ(zz9H(), zzZ8H.class);
        zzZ4R zzz4r2 = (zzZ4R) com.aspose.words.internal.zzZKW.zzZ(zz9G(), zzZ4R.class);
        if (!((zzz4r == null && zzz8h == null) || zzz4r2 == null) || (zzz4r == null && zzz8h == null && zzz4r2 == null)) {
            return false;
        }
        return (zzz4r == null && zzz8h == null) ? false : true;
    }

    private boolean zzYm2() {
        return zzYm1() && !com.aspose.words.internal.zzZYD.zzXk(getText());
    }

    private boolean zzYm3() {
        return zzYm1() && com.aspose.words.internal.zzZYD.zzXk(getText());
    }

    public final void zzCR(String str) {
        this.zzXCs = str;
    }

    public final boolean zzYPm() {
        return zzYm0() != null;
    }

    public abstract String zzYVW();

    public final zzZ4X zzYm0() {
        if (zzYlZ() != null) {
            return zzYlZ();
        }
        zzZ4Y zzz4y = this.zzXCr;
        if (zzz4y != null) {
            return zzz4y.zzYPq();
        }
        return null;
    }

    public final String zzYm4() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzXCs) ? com.aspose.words.internal.zzZKN.format("{0}{1}{2}", '[', this.zzXCs, ']') : "";
    }

    public final void zzYm5() {
        if (getCount() == 0) {
            zzY(new zzZ7V(""));
        }
        zzZ7V zzz7v = (zzZ7V) com.aspose.words.internal.zzZKW.zzZ(zzMH(0), zzZ7V.class);
        if (zzz7v != null) {
            zzz7v.zzf(com.aspose.words.internal.zzZKN.format("{0}{1}{2}", zzYVW(), zzz7v.zz9A(), ']'), 0);
        }
    }

    public final boolean zzZ(HashMap<String, zzZ4Y> map, com.aspose.words.internal.zzZQC<zzYJV> zzzqc) {
        if (!zzY(getLabel(), map)) {
            if (zzYm2()) {
                return true;
            }
            zzzqc.push(this);
            this.zzXCs = "";
            return false;
        }
        if (!zzYm3() || zzzqc.size() <= 0) {
            return false;
        }
        zzYJV zzyjvPop = zzzqc.pop();
        zzyjvPop.zzY(getLabel(), map);
        zzyjvPop.zzXCs = this.zzXCs;
        return true;
    }
}
