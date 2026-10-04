package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz59 extends zz33 {
    private ArrayList<zzZ> zzBA;

    public static class zzX extends zzZ {
        private int zzVL;
        private int zzk5;
        private int zzk6;

        public zzX(int i, int i2, int i3) {
            super((byte) 0);
            this.zzk6 = i;
            this.zzk5 = i2;
            this.zzVL = i3;
        }

        @Override // com.aspose.words.internal.zz59.zzZ
        public final void zzM(zzFY zzfy) throws Exception {
            zzfy.writeInt(this.zzk6);
            zzfy.zzFh();
            zzfy.writeInt(this.zzk5);
            zzfy.zzFh();
            zzfy.writeInt(this.zzVL);
        }

        @Override // com.aspose.words.internal.zz59.zzZ
        public final boolean zzvQ() {
            return true;
        }
    }

    public static class zzY extends zzZ {
        private int zzk6;
        private int[] zzkp;

        public zzY(int i, int[] iArr) {
            super((byte) 0);
            this.zzk6 = i;
            this.zzkp = iArr;
        }

        @Override // com.aspose.words.internal.zz59.zzZ
        public final void zzM(zzFY zzfy) throws Exception {
            zzfy.writeInt(this.zzk6);
            zzfy.writeIntArray(this.zzkp);
        }

        @Override // com.aspose.words.internal.zz59.zzZ
        public final boolean zzvQ() {
            return false;
        }
    }

    public static abstract class zzZ {
        private zzZ() {
        }

        public abstract void zzM(zzFY zzfy) throws Exception;

        public abstract boolean zzvQ();

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zz59(zz4W zz4w) {
        super(zz4w);
        this.zzBA = new ArrayList<>();
    }

    public final void zzZ(zzZYV<Integer> zzzyv, zzZXH zzzxh, int i) {
        zzDB zzdb = new zzDB();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < zzzyv.getCount(); i5++) {
            int iZzT3 = zzzyv.zzT3(i5);
            int iZzZP = zz3Q.zzZP(zzzxh.zzpP().zzSt(zzzyv.zzVY(i5).intValue()).zzoZ(), zzzxh.zzpO());
            if (iZzZP != 1000) {
                if (zzdb.getCount() > 0 && iZzT3 != i2 + 1) {
                    if (!z || zzdb.getCount() <= 1) {
                        zzZQG.zzZ((ArrayList<zzY>) this.zzBA, new zzY(i3, zzdb.toArray()));
                    } else {
                        zzZQG.zzZ((ArrayList<zzX>) this.zzBA, new zzX(i3, i2, i4));
                    }
                    zzdb.clear();
                }
                if (zzdb.getCount() == 0) {
                    zzdb.add(iZzZP);
                } else {
                    if (z && iZzZP != i4) {
                        if (zzdb.getCount() >= 5) {
                            zzZQG.zzZ((ArrayList<zzX>) this.zzBA, new zzX(i3, i2, i4));
                            zzdb.clear();
                            zzdb.add(iZzZP);
                        } else {
                            z = false;
                        }
                    }
                    if (!z && iZzZP == i4 && zzZ(zzdb, iZzZP) >= 5) {
                        int count = zzdb.getCount() - zzZ(zzdb, iZzZP);
                        zzZQG.zzZ((ArrayList<zzY>) this.zzBA, new zzY(i3, zzdb.zzVI(count).toArray()));
                        zzdb.removeRange(0, count);
                        i3 += count;
                        z = true;
                    }
                    zzdb.add(iZzZP);
                    i2 = iZzT3;
                    i4 = iZzZP;
                }
                i2 = iZzT3;
                i3 = i2;
                z = true;
                i4 = iZzZP;
            }
        }
        if (zzdb.getCount() > 0) {
            if (!z || zzdb.getCount() <= 1) {
                zzZQG.zzZ((ArrayList<zzY>) this.zzBA, new zzY(i3, zzdb.toArray()));
            } else {
                zzZQG.zzZ((ArrayList<zzX>) this.zzBA, new zzX(i3, i2, i4));
            }
        }
    }

    private static int zzZ(zzDB zzdb, int i) {
        for (int count = zzdb.getCount() - 1; count >= 0; count--) {
            if (zzdb.get(count) != i) {
                return (zzdb.getCount() - 1) - count;
            }
        }
        return zzdb.getCount();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFf();
        for (int i = 0; i < this.zzBA.size(); i++) {
            this.zzBA.get(i).zzM(zzfy);
            if (i < this.zzBA.size() - 1 && this.zzBA.get(i).zzvQ()) {
                zzfy.zzFh();
            }
        }
        zzfy.zzFe();
    }
}
