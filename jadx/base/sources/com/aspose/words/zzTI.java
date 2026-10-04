package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzTI extends zzYI implements Iterable<zzYI> {
    private ArrayList<zzYI> zzZsy = new ArrayList<>();

    public final int getCount() {
        return this.zzZsy.size();
    }

    @Override // com.aspose.words.zzYI
    public String getText() {
        StringBuilder sb = new StringBuilder();
        Iterator<zzYI> it = this.zzZsy.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().getText());
        }
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.zzZsy.size() == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<zzYI> iterator() {
        return this.zzZsy.iterator();
    }

    public final zzYI zzMH(int i) {
        return this.zzZsy.get(i);
    }

    public final void zzX(zzYI zzyi) {
        this.zzZsy.remove(zzyi);
        zzyi.zzZ((zzTI) null);
    }

    public final zzYI zzY(zzYI zzyi) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZsy, zzyi);
        zzyi.zzZ(this);
        return zzyi;
    }

    public final zzYI zzYy(byte... bArr) {
        zzYI zzyiZzYy;
        for (int size = this.zzZsy.size() - 1; size >= 0; size--) {
            zzYI zzyi = this.zzZsy.get(size);
            zzTI zzti = (zzTI) com.aspose.words.internal.zzZKW.zzZ(zzyi, zzTI.class);
            if (zzti != null && (zzyiZzYy = zzti.zzYy(bArr)) != null) {
                return zzyiZzYy;
            }
            if (zzyi.zzYD(bArr) && zzyi.isOpened()) {
                return zzyi;
            }
        }
        return null;
    }

    public final void zzYz(byte... bArr) {
        for (zzYI zzyi : this.zzZsy) {
            zzTI zzti = (zzTI) com.aspose.words.internal.zzZKW.zzZ(zzyi, zzTI.class);
            if (zzti != null) {
                zzti.zzYz(bArr);
            }
            if (!zzyi.zzYD(bArr)) {
                zzyi.close();
            }
        }
    }

    @Override // com.aspose.words.zzYI
    public void zzZ(zzZ1T zzz1t) throws Exception {
        zzz1t.zzT(this);
        Iterator<zzYI> it = this.zzZsy.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzz1t);
        }
        zzz1t.zzS(this);
    }

    public final zzYI zzZY2() {
        if (this.zzZsy.size() > 0) {
            return (zzYI) C21505OooO0Oo.OooO00o(1, this.zzZsy);
        }
        return null;
    }

    public final zzYI zzZY3() {
        return zzx((byte) 0);
    }

    public final void zzZY4() {
        zzYI zzyiZzx = zzx((byte) 0);
        while (zzyiZzx != null) {
            zzyiZzx.close();
            zzyiZzx = zzx((byte) 0);
        }
    }

    public final zzYI zzx(byte b) {
        zzYI zzyiZzx;
        for (int size = this.zzZsy.size() - 1; size >= 0; size--) {
            zzYI zzyi = this.zzZsy.get(size);
            zzTI zzti = (zzTI) com.aspose.words.internal.zzZKW.zzZ(zzyi, zzTI.class);
            if (zzti != null && (zzyiZzx = zzti.zzx(b)) != null) {
                return zzyiZzx;
            }
            if ((zzyi.zzkz() == b || b == 0) && zzyi.isOpened()) {
                return zzyi;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzYI
    public boolean zzZ(zzYI zzyi) {
        zzYI zzyiZzx = zzx((byte) 0);
        while (zzyiZzx != null) {
            boolean zZzZ = zzyiZzx.zzZ(zzyi);
            if (zzyiZzx.getAction() == 1) {
                zzyiZzx.remove();
            }
            if (zzyi.getAction() == 2) {
                return zZzZ;
            }
            if (zZzZ) {
                return true;
            }
            zzyiZzx.close();
            if (zzyiZzx.zzkz() == 13) {
                zzyiZzx.remove();
            }
            zzyiZzx = zzx((byte) 0);
        }
        return false;
    }
}
