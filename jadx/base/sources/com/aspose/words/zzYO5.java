package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO5 implements zzZD4 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ABOVE", "ÜBER", "ENCIMA", "LEFT", "LINKS", "IZQUIERDA", "BELOW", "UNTER", "DEBAJO", "RIGHT", "RECHTS", "DERECHA");
    private zzWQ zzXIL;
    private int zzZcp;

    private zzYO5(zzWQ zzwq, int i) {
        this.zzXIL = zzwq;
        this.zzZcp = i;
    }

    private int getOrientation() {
        int i = this.zzZcp;
        if (i == 0 || i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    public static zzTL zzZ(zzZQM zzzqm, String str, Ref<zzZD4> ref) {
        int i;
        ref.set(null);
        switch (zzUR.zzTP(str.toUpperCase())) {
            case 0:
            case 1:
            case 2:
                i = 0;
                break;
            case 3:
            case 4:
            case 5:
                i = 2;
                break;
            case 6:
            case 7:
            case 8:
                i = 1;
                break;
            case 9:
            case 10:
            case 11:
                i = 3;
                break;
            default:
                return null;
        }
        if (zzzqm.zzZex() == null) {
            return new zzZU3("!The Formula Not In Table");
        }
        zzWQ zzwq = new zzWQ(zzzqm.zzZex());
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (zzwq.zz5G()) {
                        return new zzZU3("!Table Index Cannot be Zero");
                    }
                } else if (zzwq.zz5F()) {
                    return new zzZVZ(0.0d);
                }
            } else if (zzwq.zz5H()) {
                return new zzZU3("!Table Index Cannot be Zero");
            }
        } else if (zzwq.zz5E()) {
            return new zzZVZ(0.0d);
        }
        ref.set(new zzYO5(zzwq, i));
        return null;
    }

    public final int getDirection() {
        return this.zzZcp;
    }

    @Override // java.lang.Iterable
    public final Iterator<Cell> iterator() {
        try {
            return zzYO4.zzZ(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZD4
    public final boolean zzYWS() {
        return false;
    }

    @Override // com.aspose.words.zzZD4
    public final zzTL zzYWT() {
        int orientation = getOrientation();
        if (orientation == 0) {
            return zzYU0.zzXSk;
        }
        if (orientation == 1) {
            return new zzZVZ(0.0d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.aspose.words.zzZD4
    public final zzWQ zzYWU() {
        return null;
    }

    @Override // com.aspose.words.zzZD4
    public final zzWQ zzYWV() {
        return null;
    }

    @Override // com.aspose.words.zzZD4
    public final boolean zzYWW() {
        return false;
    }

    @Override // com.aspose.words.zzZD4
    public final boolean zzYWX() {
        return false;
    }

    public final zzWQ zzYrg() {
        return this.zzXIL;
    }
}
