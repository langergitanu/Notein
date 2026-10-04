package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7E extends zzYNE {
    private com.aspose.words.internal.zzZQ5 zzYhq;
    private ArrayList<zzUZ> zzYhr;
    private boolean zzYhs;

    public zzZ7E(zzYN8 zzyn8) {
        super(zzyn8);
    }

    private zzYMD zz6w() {
        for (int size = this.zzYhr.size() - 1; size >= 0; size--) {
            if (!this.zzYhr.get(size).isEmpty()) {
                return this.zzYhr.get(size).zz6w();
            }
        }
        return null;
    }

    private zzYMD zzG(zzYMD zzymd) {
        zzymd.zzZZJ();
        zzYMD zzymdZz5Y = zzymd.zz5Y();
        if (zzymdZz5Y != null) {
            return zzymdZz5Y;
        }
        int iIndexOf = this.zzYhr.indexOf((zzUZ) zzymd.zzZZJ());
        if (iIndexOf != -1) {
            return this.zzYhr.get(iIndexOf).zz6w();
        }
        throw new IllegalStateException("The part does not belong to the page columns.");
    }

    private int zzH(zzYMD zzymd) throws Exception {
        return (zzymd.zzZZJ().getY() - this.zzYhr.get(0).getY()) + zzymd.getBottom();
    }

    private ArrayList<zzYMD> zzYUB() {
        ArrayList<zzYMD> arrayList = new ArrayList<>();
        for (zzUZ zzuz : this.zzYhr) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) zzuz.zzZ((zzYMD) null, (zzYMD) null));
            if (!zzZYM()) {
                if (zzuz.zz09() != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZMW>) arrayList, zzuz.zz09());
                }
                if (zzuz.zz08() != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZUE>) arrayList, zzuz.zz08());
                }
            }
        }
        return arrayList;
    }

    private int zzYUC() throws Exception {
        int iMax = -1;
        for (zzZNO zzzno : zzYqE()) {
            com.aspose.words.internal.zzZQ5 zzzq5Zz7G = zzzno.zzZ8R().zz7G();
            boolean z = false;
            boolean z2 = zzzq5Zz7G.getX() < this.zzYhq.getX() && this.zzYhq.getX() < zzzq5Zz7G.getRight();
            if (zzzq5Zz7G.getX() < this.zzYhq.getRight() && this.zzYhq.getRight() < zzzq5Zz7G.getRight()) {
                z = true;
            }
            if (z2 || z) {
                iMax = Math.max(zzzno.zzZ8R().getBottom() - this.zzYhq.getY(), iMax);
            }
        }
        return iMax;
    }

    private ArrayList<zzZNN> zzYUD() throws Exception {
        ArrayList<zzZNN> arrayList = new ArrayList<>();
        for (zzZNO zzzno : zzYqE()) {
            if (this.zzYhq.zzP(zzzno.zzVH(true).zz7G())) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzZNN(zzzno, this.zzYhq.getY()));
            }
        }
        return arrayList;
    }

    private zzQ zzYUE() throws Exception {
        zzQ zzq = new zzQ();
        zzq.zzE(zzYUD());
        zzq.zzF(new ArrayList<>());
        int iZzYUC = zzYUC();
        ArrayList arrayList = null;
        int i = 0;
        int y = 0;
        for (zzYMD zzymd : zzYUB()) {
            if (zzYJP.zzk(zzymd) == 0) {
                boolean z = this.zzYhs && (zzymd instanceof zzYVR);
                if (zzq.zzbT().size() == i && !z) {
                    arrayList = new ArrayList();
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<ArrayList>) zzq.zzbT(), arrayList);
                    y = zzymd.getY();
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYMD>) arrayList, zzymd);
                zzYMD zzymdZz5Z = zzymd.zz5Z();
                if (zzymdZz5Z == null || (zzymd.zza9() != zzymdZz5Z.zza9() && (!(zzymdZz5Z instanceof zzZ55) || !((zzZ55) zzymdZz5Z).zzYQa()))) {
                    if (!zzymd.zza7().zzZYM() || !(zzymdZz5Z instanceof zzYIA) || !(zzymd instanceof zzYIA)) {
                        int iZzH = zzH(zzymd);
                        if (iZzH >= iZzYUC) {
                            boolean z2 = false;
                            for (zzZNN zzznn : zzq.zzbS()) {
                                if (zzznn.getY() < iZzH && iZzH < zzznn.getBottom()) {
                                    z2 = true;
                                }
                                if (zzznn.zzZ8f() && zzznn.getY() < iZzH && y < zzznn.getBottom()) {
                                    zzznn.zzBB(i);
                                }
                            }
                            if (!z2 && !(zzymd instanceof zzYVR)) {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return zzq;
    }

    private int zzYUF() throws Exception {
        zzYMD zzymdZzY = zzYNE.zzY(zz6w(), zzG(zz6w()));
        return Math.max(zzymdZzY == null ? 0 : zzH(zzymdZzY), zzL(this.zzYhq) - this.zzYhq.getY());
    }

    private void zzYUG() throws Exception {
        int height;
        zzQ zzqZzYUE = zzYUE();
        if (zzqZzYUE.zzbT().size() > 1 && (height = (this.zzYhq.getHeight() - zzYUF()) / (zzqZzYUE.zzbT().size() - 1)) > 0) {
            for (zzZNN zzznn : zzqZzYUE.zzbS()) {
                zzznn.zzZXN().zzMG(zzznn.zzZ8g() * height);
            }
            for (int i = 0; i < zzqZzYUE.zzbT().size(); i++) {
                int i2 = i * height;
                Iterator<zzYMD> it = zzqZzYUE.zzbT().get(i).iterator();
                while (it.hasNext()) {
                    ((zzTF) it.next()).zzMG(i2);
                }
            }
        }
    }

    public static boolean zzZw(ArrayList<zzUZ> arrayList) {
        int size = arrayList.size();
        if (size == 1) {
            return true;
        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            zzUZ zzuz = arrayList.get(i);
            zzUZ zzuz2 = (zzUZ) zzuz.zzYo1();
            if (zzuz2 != null && zzuz2.zz0H() == zzuz) {
                return false;
            }
        }
        return zzYNE.zzz(arrayList.get(size - 1));
    }

    private void zzZx(ArrayList<zzUZ> arrayList) throws Exception {
        this.zzYhr = arrayList;
        zzUZ zzuz = (zzUZ) C21505OooO0Oo.OooO00o(1, arrayList);
        this.zzYhs = this.zzYhr.size() == 1;
        this.zzYhq = zzYNE.zzV(this.zzYhr.get(0), zzuz.getBottom() - zzYNE.zzy(zzuz));
    }

    @Override // com.aspose.words.zzYNE
    public final void zz4x() throws Exception {
        if (((zzUZ) zzZ8m().zz6x()) != zzZ8m().zzYql()) {
            zzZx(zzYqD());
            zzYUG();
            return;
        }
        for (zzUZ zzuz : ((zzUZ) zzZ8m().zz6x()).zz0c()) {
            if (zzYNE.zzx(zzuz)) {
                ArrayList<zzUZ> arrayList = new ArrayList<>();
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzuz);
                zzZx(arrayList);
                zzYUG();
            }
        }
    }
}
