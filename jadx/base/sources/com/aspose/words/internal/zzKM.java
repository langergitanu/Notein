package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzKM implements zzGY {
    private boolean zzCk;
    private zzY zzCl;
    private Map zzCm;

    public static class zzY implements zzGV {
        private Map zzCh;
        private zzGY zzCi;

        public zzY(zzGY zzgy) {
            this(zzgy, new HashMap());
        }

        private void zzY(zzGW zzgw) {
            this.zzCh.put(zzgw, null);
        }

        public final Map zzIF() {
            return this.zzCh;
        }

        @Override // com.aspose.words.internal.zzGV
        public final zzF6 zzW(zzF6 zzf6) {
            return zzZ(2, zzf6);
        }

        @Override // com.aspose.words.internal.zzGV
        public final void zzX(zzGW zzgw) {
            this.zzCh.remove(zzgw);
        }

        @Override // com.aspose.words.internal.zzGV
        public final void zzZ(zzGW zzgw) {
            zzY(zzgw);
        }

        public zzY(zzGY zzgy, Map map) {
            this.zzCi = zzgy;
            this.zzCh = map;
        }

        @Override // com.aspose.words.internal.zzGV
        public final zzF6 zzX(zzF6 zzf6) {
            return zzZ(1, zzf6);
        }

        @Override // com.aspose.words.internal.zzGV
        public final zzH0 zzY(zzH0 zzh0, String str) {
            return zzZ(1, zzh0, str, null);
        }

        @Override // com.aspose.words.internal.zzGV
        public final void zzZ(zzGW[] zzgwArr) {
            for (zzGW zzgw : zzgwArr) {
                zzY(zzgw);
            }
        }

        @Override // com.aspose.words.internal.zzGV
        public final zzF6 zzY(zzF6 zzf6) {
            return zzZ(0, zzf6);
        }

        @Override // com.aspose.words.internal.zzGV
        public final zzH0 zzZ(zzH0 zzh0, String str, zzH0[] zzh0Arr) {
            return zzZ(0, zzh0, str, zzh0Arr);
        }

        private zzH0 zzZ(int i, zzH0 zzh0, String str, zzH0[] zzh0Arr) {
            Iterator it = this.zzCh.keySet().iterator();
            zzH0 zzh02 = null;
            while (it.hasNext()) {
                int i2 = i;
                zzH0 zzh03 = zzh0;
                String str2 = str;
                zzH0[] zzh0Arr2 = zzh0Arr;
                zzH0 zzh0ZzZ = zzZ((zzGW) it.next(), i2, zzh03, str2, zzh0Arr2);
                if (zzh0ZzZ != null) {
                    if (zzh02 != null) {
                        return null;
                    }
                    zzh02 = zzh0ZzZ;
                }
                i = i2;
                zzh0 = zzh03;
                str = str2;
                zzh0Arr = zzh0Arr2;
            }
            return zzh02;
        }

        private zzH0 zzZ(zzGW zzgw, int i, zzH0 zzh0, String str, zzH0[] zzh0Arr) {
            if (i == 0) {
                return zzgw.zzZ(zzh0, str, zzh0Arr, this.zzCi);
            }
            if (i == 1) {
                return zzgw.zzZ(zzh0, str);
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: kind");
        }

        private zzF6 zzZ(int i, zzF6 zzf6) {
            Iterator it = this.zzCh.keySet().iterator();
            zzF6 zzf62 = null;
            while (it.hasNext()) {
                zzF6 zzf6ZzZ = zzZ((zzGW) it.next(), i, zzf6);
                if (zzf6ZzZ != null) {
                    if (zzf62 != null) {
                        return null;
                    }
                    zzf62 = zzf6ZzZ;
                }
            }
            return zzf62;
        }

        private zzF6 zzZ(zzGW zzgw, int i, zzF6 zzf6) {
            if (i == 0) {
                return zzgw.zzZ(zzf6, this.zzCi);
            }
            if (i == 1) {
                return zzgw.zzZ(zzf6);
            }
            if (i == 2) {
                return zzgw.zzY(zzf6, this.zzCi);
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: kind");
        }
    }

    public static class zzZ {
        private Map zzCj;
        private boolean zzCk;
        private Map zzCm;

        public zzZ(boolean z, Map map, Map map2) {
            this.zzCm = map;
            this.zzCj = new HashMap(map2);
            this.zzCk = z;
        }

        public final Map zzIG() {
            return new HashMap(this.zzCj);
        }

        public final boolean zzIH() {
            return this.zzCk;
        }

        public final Map zzIJ() {
            return this.zzCm;
        }
    }

    public zzKM(boolean z) {
        this.zzCm = new HashMap();
        this.zzCl = new zzY(this);
        this.zzCk = z;
    }

    @Override // com.aspose.words.internal.zzGY
    public final boolean zzIH() {
        return this.zzCk;
    }

    @Override // com.aspose.words.internal.zzGY
    public final zzGV zzII() {
        return this.zzCl;
    }

    @Override // com.aspose.words.internal.zzGY
    public final Map zzIJ() {
        return this.zzCm;
    }

    public final Object zzIK() {
        return new zzZ(this.zzCk, this.zzCm, this.zzCl.zzIF());
    }

    public zzKM(Object obj) {
        zzZ zzz = (zzZ) zzZKW.zzZ(obj, zzZ.class);
        this.zzCm = zzz.zzIJ();
        this.zzCl = new zzY(this, zzz.zzIG());
        this.zzCk = zzz.zzIH();
    }
}
