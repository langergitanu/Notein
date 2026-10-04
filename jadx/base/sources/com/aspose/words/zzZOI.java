package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOI {
    private ArrayList<String> zzYAa = new ArrayList<>();
    private zzZZG<zzZOJ> zzYA9 = new zzZZG<>(0);
    private zzZZG<zzZOK> zzYA8 = new zzZZG<>(0);
    private com.aspose.words.internal.zzZYI zzYA7 = new com.aspose.words.internal.zzZYI(false);

    public static class zzY implements zzZ9P {
        private ArrayList<String> zzYA5 = new ArrayList<>();
        private zzZOI zzYA6;

        public zzY(zzZOI zzzoi) {
            this.zzYA6 = zzzoi;
        }

        private zzZOK zzZam() {
            for (int i = 0; i < this.zzYA6.zzZao().getItemCount(); i++) {
                zzZOK item = this.zzYA6.zzZao().getItem(i);
                if (item.getName() == null) {
                    return item;
                }
            }
            return null;
        }

        @Override // com.aspose.words.zzZ9P
        public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
            String str = (String) this.zzYA6.zzYAa.get(this.zzYA6.zzYA9.getItemCount());
            short sZzXa = zzzox.zzXa();
            this.zzYA6.zzYA9.zzX(i, new zzZOJ(str, sZzXa, zzzox.zzX9() & 65535));
            zzZOK zzzokZzCk = this.zzYA6.zzCk(sZzXa);
            if (zzzokZzCk.getName() != null) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYA5, zzzokZzCk.getName());
            }
            zzzokZzCk.setName(str);
        }

        public final void zzZan() {
            zzZOK zzzokZzZam;
            for (int i = 0; i < this.zzYA5.size() && (zzzokZzZam = zzZam()) != null; i++) {
                zzzokZzZam.setName(this.zzYA5.get(i));
            }
        }
    }

    public static class zzZ implements zzZ9P {
        private zzZOI zzYA6;

        public zzZ(zzZOI zzzoi) {
            this.zzYA6 = zzzoi;
        }

        @Override // com.aspose.words.zzZ9P
        public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) {
            this.zzYA6.zzYA8.zzX(i, new zzZOK());
        }
    }

    public zzZOI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZOK zzCk(int i) {
        return this.zzYA8.getItem(i);
    }

    private zzZOJ zzCl(int i) {
        return this.zzYA9.getItem(i);
    }

    private int zzCm(int i) {
        return this.zzYA8.zzTe(i);
    }

    private int zzCn(int i) {
        return this.zzYA9.zzTe(i);
    }

    private int zzLy(String str) {
        int i = this.zzYA7.get(str);
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            return -1;
        }
        return i;
    }

    public final void zzW(int i, String str, int i2) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYAa, str);
        this.zzYA7.add(str, this.zzYA9.zzX(i, new zzZOJ(str, -1, ((short) i2) & 65535)));
    }

    public final zzZZG<zzZOK> zzZao() {
        return this.zzYA8;
    }

    public final zzZZG<zzZOJ> zzZap() {
        return this.zzYA9;
    }

    public final void zzy(int i, String str) {
        zzCl(zzLy(str)).zzCo(this.zzYA8.zzX(i, new zzZOK(str)));
    }

    private void zzZ(zzZRA zzzra) {
        zzYBC zzybc = new zzYBC(0, zzzra.zzYGY);
        for (int i = 0; i < this.zzYA9.getItemCount(); i++) {
            if (zzybc.contains(zzCn(i))) {
                int iZzZaq = zzCl(i).zzZaq();
                if (!zzybc.contains(zzCm(iZzZaq))) {
                    this.zzYA8.zzZD(iZzZaq, zzybc.getEnd() - 1);
                }
            }
        }
    }

    private int zzY(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        if (this.zzYA8.getItemCount() == 0) {
            return 0;
        }
        long position = zzzow.zzq().getPosition();
        for (int i2 = 0; i2 < this.zzYA8.getItemCount(); i2++) {
            zzzow.zzl(zzCm(i2));
        }
        zzzow.zzl(i);
        return (int) (zzzow.zzq().getPosition() - position);
    }

    public zzZOI(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzZRA.zzDL(zzzra.zzYHB)) {
            zzY91.zzZ(zzzox, zzzra.zzYGE.zzXAk, this.zzYAa);
        } else {
            zzY91.zzY(zzzox, zzzra.zzYGE.zzXAk, this.zzYAa);
        }
        zzzox.zzq().zzU(zzzra.zzYGE.zzXAi.zzYHK, 0);
        zzYLK.zzZ(zzzox, zzzra.zzYGE.zzXAi.zzYHJ, 0, new zzZ(this), "Plcfbkl");
        zzY zzy = new zzY(this);
        zzzox.zzq().zzU(zzzra.zzYGE.zzXAj.zzYHK, 0);
        zzYLK.zzZ(zzzox, zzzra.zzYGE.zzXAj.zzYHJ, 4, zzy, "Plcfbkf");
        zzy.zzZan();
        this.zzYAa.size();
        this.zzYA9.getItemCount();
        this.zzYAa.size();
        this.zzYA8.getItemCount();
        this.zzYA9.add(Integer.MAX_VALUE);
        this.zzYA8.add(Integer.MAX_VALUE);
        zzZ(zzzra);
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        this.zzYAa.size();
        this.zzYA9.getItemCount();
        this.zzYAa.size();
        this.zzYA8.getItemCount();
        zzzra.zzYGE.zzXAk.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXAk.zzYHJ = zzY91.zzZ(zzzow, this.zzYAa);
        zzzra.zzYGE.zzXAj.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXAj.zzYHJ = zzZ(zzzow, i);
        zzzra.zzYGE.zzXAi.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXAi.zzYHJ = zzY(zzzow, i);
    }

    public final void zzZ(zzZOI zzzoi, int i) {
        for (int i2 = 0; i2 < zzzoi.zzYA9.getItemCount(); i2++) {
            int iZzCn = zzzoi.zzCn(i2);
            zzZOJ zzzojZzCl = zzzoi.zzCl(i2);
            zzW(iZzCn + i, zzzojZzCl.getName(), zzzojZzCl.getFlags());
        }
        for (int i3 = 0; i3 < zzzoi.zzYA8.getItemCount(); i3++) {
            zzy(zzzoi.zzCm(i3) + i, zzzoi.zzCk(i3).getName());
        }
    }

    private int zzZ(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        if (this.zzYA9.getItemCount() == 0) {
            return 0;
        }
        long position = zzzow.zzq().getPosition();
        for (int i2 = 0; i2 < this.zzYA9.getItemCount(); i2++) {
            zzzow.zzl(zzCn(i2));
        }
        zzzow.zzl(i);
        for (int i3 = 0; i3 < this.zzYA9.getItemCount(); i3++) {
            zzZOJ zzzojZzCl = zzCl(i3);
            zzzow.zzK((short) zzzojZzCl.zzZaq());
            zzzow.zzJ((short) zzzojZzCl.getFlags());
        }
        return (int) (zzzow.zzq().getPosition() - position);
    }
}
