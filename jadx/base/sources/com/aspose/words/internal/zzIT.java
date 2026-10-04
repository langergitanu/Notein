package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzIT implements zzGW {
    private static String zzyA = zzXF.zzI("GroupBy");
    private static String zzyz = zzXF.zzI("Key");
    static zzGW zzPD = new zzIT();

    public static class zzV implements zzH0 {
        private zzKO zzys;

        public zzV(zzKO zzko) {
            this.zzys = zzko;
        }

        private zzZVP zzGC() {
            return ((zzX) this.zzys.zzv()).zzGC();
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class getType() {
            return zzGC().getType();
        }

        @Override // com.aspose.words.internal.zzF6
        public final boolean zzs() {
            return false;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzu() {
            return zzGC().zzu();
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzv() {
            return zzGC().zzv();
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class zzw() {
            return zzGC().zzw();
        }

        @Override // com.aspose.words.internal.zzH0
        public final Object zzx() throws Exception {
            return ((zzY) this.zzys.zzx()).getKey();
        }
    }

    public interface zzW extends Iterable {
    }

    public static class zzX {
        private zzZVP zzyt;
        private zzZVP zzyu;

        public zzX(zzZVP zzzvp, zzZVP zzzvp2) {
            this.zzyu = zzzvp;
            this.zzyt = zzzvp2;
        }

        public final zzZVP zzGB() {
            return this.zzyt;
        }

        public final zzZVP zzGC() {
            return this.zzyu;
        }
    }

    public static class zzY implements Iterable {
        private Iterable zzyv;
        private Object zzyw;

        public zzY(Object obj, Iterable iterable) {
            this.zzyw = obj;
            this.zzyv = iterable;
        }

        public final Object getKey() {
            return this.zzyw;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.zzyv.iterator();
        }
    }

    public static class zzZ implements zzH0 {
        private zzKO zzi;
        private zzX zzyx;
        private zzC1 zzyy;

        public zzZ(zzKO zzko, zzC1 zzc1, zzX zzx) {
            this.zzi = zzko;
            this.zzyy = zzc1;
            this.zzyx = zzx;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class getType() {
            return zzW.class;
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
            return this.zzyx;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class zzw() {
            return zzW.class;
        }

        @Override // com.aspose.words.internal.zzH0
        public final Object zzx() throws Exception {
            int i;
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            Iterator it = ((Iterable) this.zzi.zzx()).iterator();
            ArrayList arrayList2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                this.zzyy.zzBM()[0].setValue(next);
                Object objZzx = this.zzyy.zzBN().zzx();
                if (objZzx == null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        zzZQG.zzZ((ArrayList<Object>) arrayList, objZzx);
                    }
                    zzZQG.zzZ((ArrayList<Object>) arrayList2, next);
                } else {
                    ArrayList arrayList3 = (ArrayList) zzQW.zzZ(map, objZzx);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        zzZQF.zzY(map, objZzx, arrayList3);
                        zzZQG.zzZ((ArrayList<Object>) arrayList, objZzx);
                    }
                    zzZQG.zzZ((ArrayList<Object>) arrayList3, next);
                }
            }
            this.zzyy.zzBM()[0].zzFi();
            for (i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                arrayList.set(i, new zzY(obj, obj != null ? (Iterable) map.get(obj) : arrayList2));
            }
            return arrayList;
        }
    }

    private zzIT() {
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzY(zzF6 zzf6, zzGY zzgy) {
        if (zzf6.getType() == zzW.class) {
            return zzf6;
        }
        if (zzf6.getType() == zzY.class) {
            return zzRE.zzX(((zzX) zzf6.zzv()).zzGB(), zzgy);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str, zzH0[] zzh0Arr, zzGY zzgy) {
        return zzZ(zzZ2.zzZ((zzKO) zzh0, zzgy), str, (zzKO[]) zzh0Arr);
    }

    private static zzH0 zzZ(zzKO zzko, String str, zzKO[] zzkoArr) {
        zzC1 zzc1ZzM;
        if (Iterable.class.isAssignableFrom(zzko.getType()) && zzkoArr.length == 1 && zzZKN.zzX(str, zzyA, zzZOF.ORDINAL$4894b8c8) && (zzc1ZzM = zzC0.zzM(zzkoArr[0])) != null) {
            return new zzZ(zzko, zzc1ZzM, new zzX(zzc1ZzM.zzBN(), zzko));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str) {
        return zzZ((zzKO) zzh0, str);
    }

    private static zzH0 zzZ(zzKO zzko, String str) {
        if (zzko.getType() == zzY.class && zzZKN.zzX(str, zzyz, zzZOF.ORDINAL$4894b8c8)) {
            return new zzV(zzko);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6, zzGY zzgy) {
        if (zzf6.getType() == zzW.class) {
            return zzZVO.zzX(zzY.class, zzf6.zzv(), null);
        }
        if (zzf6.getType() == zzY.class) {
            return zzRE.zzZ(((zzX) zzf6.zzv()).zzGB(), zzgy);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6) {
        if (zzf6.getType() == zzY.class) {
            return zzZVO.zzX(zzW.class, zzf6.zzv(), null);
        }
        return null;
    }
}
