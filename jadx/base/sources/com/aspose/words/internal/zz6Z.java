package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz6Z implements zzGW {
    private static String zzmG = zzXF.zzI("OrderBy");
    private static String zzmF = zzXF.zzI("OrderByDescending");
    private static String zzmE = zzXF.zzI("ThenBy");
    private static String zzmD = zzXF.zzI("ThenByDescending");
    static zzGW zzPD = new zz6Z();

    public static class zzW {
        private zzX zzmy;
        private zzZVP zzyt;

        public zzW(zzX zzx, zzZVP zzzvp) {
            this.zzmy = zzx;
            this.zzyt = zzzvp;
        }

        public final zzZVP zzGB() {
            return this.zzyt;
        }

        public final zzX zzx6() {
            return this.zzmy;
        }
    }

    public static class zzY implements zzH0 {
        private zzKO zzi;
        private zzW zzmC;

        public zzY(zzKO zzko, zzW zzw) {
            this.zzi = zzko;
            this.zzmC = zzw;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class getType() {
            return zzZ.class;
        }

        @Override // com.aspose.words.internal.zzF6
        public final boolean zzs() {
            return false;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzu() {
            return null;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzv() {
            return this.zzmC;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class zzw() {
            return zzZ.class;
        }

        @Override // com.aspose.words.internal.zzH0
        public final Object zzx() throws Exception {
            Iterable iterable = (Iterable) this.zzi.zzx();
            Collection collection = (Collection) zzZKW.zzZ(iterable, Collection.class);
            ArrayList arrayList = new ArrayList(collection != null ? collection.size() : 0);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzZQG.zzZ((ArrayList<Object>) arrayList, it.next());
            }
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, this.zzmC.zzx6());
            }
            return arrayList;
        }
    }

    public interface zzZ extends Iterable {
    }

    private zz6Z() {
    }

    private static int zzT(String str, String str2, String str3) {
        int i = zzZOF.ORDINAL$4894b8c8;
        if (zzZKN.zzX(str, str2, i)) {
            return 1;
        }
        return zzZKN.zzX(str, str3, i) ? 2 : 0;
    }

    private static zzH0 zzX(zzKO zzko, String str, zzKO[] zzkoArr) {
        int iZzT;
        zzC1 zzc1ZzZ;
        if (zzko.getType() != zzZ.class || (iZzT = zzT(str, zzmE, zzmD)) == 0 || (zzc1ZzZ = zzZ(zzkoArr)) == null) {
            return null;
        }
        ((zzW) zzko.zzv()).zzx6().zzZ(zzc1ZzZ, iZzT == 1);
        return zzko;
    }

    private static zzH0 zzY(zzKO zzko, String str, zzKO[] zzkoArr) {
        int iZzT;
        zzC1 zzc1ZzZ;
        if (!Iterable.class.isAssignableFrom(zzko.getType()) || (iZzT = zzT(str, zzmG, zzmF)) == 0 || (zzc1ZzZ = zzZ(zzkoArr)) == null) {
            return null;
        }
        return new zzY(zzko, new zzW(new zzX(zzc1ZzZ, iZzT == 1), zzko));
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str, zzH0[] zzh0Arr, zzGY zzgy) {
        zzKO zzkoZzZ = zzZ2.zzZ((zzKO) zzh0, zzgy);
        zzKO[] zzkoArr = (zzKO[]) zzh0Arr;
        zzH0 zzh0ZzY = zzY(zzkoZzZ, str, zzkoArr);
        return zzh0ZzY == null ? zzX(zzkoZzZ, str, zzkoArr) : zzh0ZzY;
    }

    public static class zzX implements Comparator<Object> {
        private zzZ zzmB;

        public static class zzZ {
            private zzC1 zzh;
            private boolean zzmA;
            private zzZ zzmz;

            public zzZ(zzC1 zzc1, boolean z) {
                this.zzh = zzc1;
                this.zzmA = z;
            }

            public final void zzZ(zzZ zzz) {
                this.zzmz = zzz;
            }

            public final zzZ zzx7() {
                return this.zzmz;
            }

            public final boolean zzx8() {
                return this.zzmA;
            }

            public final zzC1 zzx9() {
                return this.zzh;
            }
        }

        public zzX(zzC1 zzc1, boolean z) {
            this.zzmB = new zzZ(zzc1, z);
        }

        private static int zzD(Object obj, Object obj2) {
            if (obj != null) {
                return ((Comparable) obj).compareTo(obj2);
            }
            if (obj2 != null) {
                return -((Comparable) obj2).compareTo(obj);
            }
            return 0;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zzZ(obj, obj2, this.zzmB);
        }

        public final void zzZ(zzC1 zzc1, boolean z) {
            zzZ zzzZzx7 = this.zzmB;
            while (zzzZzx7.zzx7() != null) {
                zzzZzx7 = zzzZzx7.zzx7();
            }
            zzzZzx7.zzZ(new zzZ(zzc1, z));
        }

        private int zzZ(Object obj, Object obj2, zzZ zzz) {
            try {
                zzz.zzx9().zzBM()[0].setValue(obj);
                Object objZzx = zzz.zzx9().zzBN().zzx();
                zzz.zzx9().zzBM()[0].setValue(obj2);
                Object objZzx2 = zzz.zzx9().zzBN().zzx();
                zzz.zzx9().zzBM()[0].zzFi();
                int iZzD = zzD(objZzx, objZzx2);
                if (iZzD != 0) {
                    return zzz.zzx8() ? iZzD : -iZzD;
                }
                if (zzz.zzx7() != null) {
                    return zzZ(obj, obj2, zzz.zzx7());
                }
                return 0;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzY(zzF6 zzf6, zzGY zzgy) {
        if (zzf6.getType() != zzZ.class) {
            return null;
        }
        return zzRE.zzX(((zzW) zzf6.zzv()).zzGB(), zzgy);
    }

    private static zzC1 zzZ(zzKO[] zzkoArr) {
        if (zzkoArr.length == 1) {
            return zzC0.zzN(zzkoArr[0]);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6, zzGY zzgy) {
        if (zzf6.getType() != zzZ.class) {
            return null;
        }
        return zzRE.zzZ(((zzW) zzf6.zzv()).zzGB(), zzgy);
    }
}
