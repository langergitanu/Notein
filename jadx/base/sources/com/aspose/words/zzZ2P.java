package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2P implements zzZAF {
    private int zzY5Q;
    private zzZ zzY5R;
    private ArrayList<zzZ> zzY5S;
    private zzY zzY5T;
    private zzZ2P zzY5U;
    private Iterable<zzYWB> zzY5V;
    private MailMerge zzY5W;
    private zzZAF zzYHV;
    private static Object zzY5P = new Object();
    private static Object zzY5O = new Object();

    public static class zzY extends zzZQF {
        private com.aspose.words.internal.zzZYT<Object> zzY5G;
        private com.aspose.words.internal.zzZYT<Object> zzY5H;
        private com.aspose.words.internal.zzZYT<Object> zzY5I;
        private zzZ2F zzY5J;
        private MailMerge zzY5W;

        public zzY(MailMerge mailMerge, Iterable<zzYWB> iterable, String str) throws Exception {
            this.zzY5W = mailMerge;
            zzZ(iterable, str);
        }

        private void zzIS(String str) {
            int iIndexOfKey;
            com.aspose.words.internal.zzZYT<Object> zzzyt = this.zzY5G;
            if (zzzyt == null) {
                this.zzY5G = new com.aspose.words.internal.zzZYT<>(false);
                iIndexOfKey = -1;
            } else {
                iIndexOfKey = zzzyt.indexOfKey(str);
            }
            if (iIndexOfKey == -1) {
                this.zzY5G.set(str, null);
            } else {
                this.zzY5G.zzT(iIndexOfKey, zzZ2P.zzY5O);
            }
        }

        private void zzIT(String str) {
            if (this.zzY5I == null) {
                this.zzY5I = new com.aspose.words.internal.zzZYT<>(false);
            }
            String strZzIX = this.zzY5W.zzIX(str);
            this.zzY5I.set(strZzIX, null);
            int iZzZz = zzZ2M.zzZz(strZzIX, -1);
            if (iZzZz != -1) {
                String strZzZy = zzZ2M.zzZy(strZzIX, iZzZz);
                if (this.zzY5H == null) {
                    this.zzY5H = new com.aspose.words.internal.zzZYT<>(false);
                }
                this.zzY5H.set(strZzZy, null);
            }
        }

        private static Collection<String> zzS(com.aspose.words.internal.zzZYT<Object> zzzyt) {
            if (zzzyt != null) {
                return zzzyt.getKeys();
            }
            return null;
        }

        private void zzZ(Iterable<zzYWB> iterable, String str) throws Exception {
            if (iterable == null) {
                return;
            }
            for (zzYWB zzywb : iterable) {
                if (this.zzY5J == null) {
                    this.zzY5J = new zzZ2F();
                }
                zzV(zzywb);
                this.zzY5J.zzYJl();
                if (zzZfT() || this.zzY5J.zzYJi()) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("A child mail merge region of '{0}' region is badly formed.", str));
                }
            }
        }

        public final zzY zzIO(String str) throws Exception {
            int iIndexOfKey = this.zzY5G.indexOfKey(str);
            zzY zzy = (zzY) com.aspose.words.internal.zzZKW.zzZ(this.zzY5G.zzVY(iIndexOfKey), zzY.class);
            if (zzy != null) {
                return zzy;
            }
            zzZ2F zzz2f = this.zzY5J;
            zzY zzy2 = new zzY(this.zzY5W, zzz2f != null ? zzZ2P.zzZ(zzz2f.zzYJh(), str) : null, str);
            this.zzY5G.zzT(iIndexOfKey, zzy2);
            return zzy2;
        }

        public final int zzIP(String str) {
            return this.zzY5G.indexOfKey(str);
        }

        public final int zzIQ(String str) {
            return this.zzY5H.indexOfKey(str);
        }

        public final int zzIR(String str) {
            return this.zzY5I.indexOfKey(str);
        }

        public final Collection<String> zzYJU() {
            return zzS(this.zzY5G);
        }

        public final Collection<String> zzYJV() {
            return zzS(this.zzY5H);
        }

        public final Collection<String> zzYJW() {
            return zzS(this.zzY5I);
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() throws Exception {
            zzZAA zzzaaZzL;
            if (zzZe6() != 59) {
                if (this.zzY5J.zzYJi() || zzZe7().isRemoved() || (zzzaaZzL = FieldMergeField.zzL(zzZe7())) == null) {
                    return;
                }
                zzIT(zzzaaZzL.getMergeFieldName());
                return;
            }
            boolean zZzYJi = this.zzY5J.zzYJi();
            if (!this.zzY5J.zzS(zzZe7(), false)) {
                if (this.zzY5J.zzYJi() || zzZe7().isRemoved()) {
                    return;
                }
                zzIT(((FieldMergeField) zzZe7()).getFieldNameNoPrefix());
                return;
            }
            if (zZzYJi || !this.zzY5J.zzYJi() || zzZe7().isRemoved()) {
                return;
            }
            zzIS(((FieldMergeField) zzZe7()).getFieldNameNoPrefix());
        }

        public final boolean zzvk(int i) {
            Object objZzVY = this.zzY5G.zzVY(i);
            return objZzVY == zzZ2P.zzY5O || (objZzVY instanceof zzY);
        }
    }

    public static class zzZ {
        private zzZAF[] zzY5L;
        private zzZAF[] zzY5M;
        private zzZ2P zzY5N;
        private Object[] zzY5X;

        /* JADX INFO: renamed from: com.aspose.words.zzZ2P$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19095zzZ implements zzZAF {
            private boolean zzY5K;
            private zzZAF zzYHV;
            private boolean zzYHW;

            public C19095zzZ(zzZAF zzzaf) {
                this.zzYHV = zzzaf;
            }

            @Override // com.aspose.words.zzZAF
            public final int getFieldCount() throws Exception {
                return this.zzYHV.getFieldCount();
            }

            @Override // com.aspose.words.zzZAF
            public final String getTableName() throws Exception {
                return this.zzYHV.getTableName();
            }

            @Override // com.aspose.words.zzZAF
            public final boolean getValue(String str, Ref<Object> ref) throws Exception {
                return this.zzYHV.getValue(str, ref);
            }

            @Override // com.aspose.words.zzZAG
            public final boolean moveNext() throws Exception {
                if (!this.zzYHW) {
                    this.zzY5K = this.zzYHV.moveNext();
                    this.zzYHW = true;
                }
                return this.zzY5K;
            }

            @Override // com.aspose.words.zzZAG
            public final void reset() {
            }

            @Override // com.aspose.words.zzZAF
            public final int zzMq(String str) throws Exception {
                return this.zzYHV.zzMq(str);
            }

            @Override // com.aspose.words.zzZAF
            public final boolean zzZ(int i, Ref<Object> ref) throws Exception {
                return this.zzYHV.zzZ(i, ref);
            }

            @Override // com.aspose.words.zzZAG
            public final boolean zzZha() {
                return true;
            }

            @Override // com.aspose.words.zzZAF
            public final boolean zzZhb() throws Exception {
                return this.zzYHV.zzZhb();
            }

            @Override // com.aspose.words.zzZAF
            public final zzZAF zzu(String str, boolean z) throws Exception {
                return this.zzYHV.zzu(str, z);
            }
        }

        public zzZ(zzZ2P zzz2p) throws Exception {
            this.zzY5N = zzz2p;
            zzYJZ();
            zzYJY();
            zzYJX();
        }

        private void zzYJX() throws Exception {
            Collection<String> collectionZzYJU = this.zzY5N.zzY5T.zzYJU();
            if (collectionZzYJU == null) {
                return;
            }
            this.zzY5L = new zzZAF[collectionZzYJU.size()];
            ArrayList arrayList = null;
            int i = 0;
            for (String str : collectionZzYJU) {
                zzZAF zzzafZzu = this.zzY5N.zzYHV.zzu(str, false);
                if (zzzafZzu != null && !zzzafZzu.zzZha() && this.zzY5N.zzY5T.zzvk(i)) {
                    zzZ2P zzz2p = new zzZ2P(zzzafZzu, this.zzY5N.zzY5W, this.zzY5N);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(str);
                    zzzafZzu = zzz2p;
                }
                this.zzY5L[i] = zzzafZzu;
                i++;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.zzY5N.zzY5T.zzIO((String) it.next());
                }
            }
        }

        private void zzYJY() throws Exception {
            Collection<String> collectionZzYJV = this.zzY5N.zzY5T.zzYJV();
            if (collectionZzYJV == null) {
                return;
            }
            this.zzY5M = new zzZAF[collectionZzYJV.size()];
            Iterator<String> it = collectionZzYJV.iterator();
            int i = 0;
            while (it.hasNext()) {
                zzZAF zzzafZzu = this.zzY5N.zzYHV.zzu(it.next(), true);
                int i2 = i + 1;
                this.zzY5M[i] = zzzafZzu != null ? new C19095zzZ(zzzafZzu) : null;
                i = i2;
            }
        }

        private void zzYJZ() throws Exception {
            Collection<String> collectionZzYJW = this.zzY5N.zzY5T.zzYJW();
            if (collectionZzYJW == null) {
                return;
            }
            this.zzY5X = new Object[collectionZzYJW.size()];
            int i = 0;
            for (String str : collectionZzYJW) {
                Ref<Object> ref = new Ref<>(null);
                boolean value = this.zzY5N.zzYHV.getValue(str, ref);
                Object obj = ref.get();
                if (!value) {
                    obj = zzZ2P.zzY5P;
                }
                this.zzY5X[i] = obj;
                i++;
            }
        }

        public final zzZAF zzIU(String str) {
            return this.zzY5L[this.zzY5N.zzY5T.zzIP(str)];
        }

        public final zzZAF zzIV(String str) {
            return this.zzY5M[this.zzY5N.zzY5T.zzIQ(str)];
        }

        public final Object zzIW(String str) {
            return this.zzY5X[this.zzY5N.zzY5T.zzIR(str)];
        }
    }

    public /* synthetic */ zzZ2P(zzZAF zzzaf, MailMerge mailMerge, zzZ2P zzz2p) {
        this(zzzaf, mailMerge, null, zzz2p);
    }

    private void zzYK2() throws Exception {
        if (this.zzY5T != null) {
            return;
        }
        zzZ2P zzz2p = this.zzY5U;
        this.zzY5T = zzz2p != null ? zzz2p.zzY5T.zzIO(this.zzYHV.getTableName()) : new zzY(this.zzY5W, this.zzY5V, this.zzYHV.getTableName());
    }

    private void zzYK3() throws Exception {
        if (this.zzY5S != null) {
            return;
        }
        this.zzY5S = new ArrayList<>();
        while (this.zzYHV.moveNext()) {
            zzYK2();
            com.aspose.words.internal.zzZQG.zzZ(this.zzY5S, new zzZ(this));
        }
    }

    @Override // com.aspose.words.zzZAF
    public final int getFieldCount() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZAF
    public final String getTableName() throws Exception {
        return this.zzYHV.getTableName();
    }

    @Override // com.aspose.words.zzZAF
    public final boolean getValue(String str, Ref<Object> ref) {
        ref.set(this.zzY5R.zzIW(str));
        if (ref.get() != zzY5P) {
            return true;
        }
        ref.set(null);
        return false;
    }

    @Override // com.aspose.words.zzZAG
    public final boolean moveNext() throws Exception {
        zzYK3();
        if (this.zzY5Q == this.zzY5S.size()) {
            return false;
        }
        ArrayList<zzZ> arrayList = this.zzY5S;
        int i = this.zzY5Q;
        this.zzY5Q = i + 1;
        this.zzY5R = arrayList.get(i);
        return true;
    }

    @Override // com.aspose.words.zzZAG
    public final void reset() {
        this.zzY5R = null;
        this.zzY5Q = 0;
    }

    @Override // com.aspose.words.zzZAF
    public final int zzMq(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZAG
    public final boolean zzZha() {
        return true;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZhb() {
        return false;
    }

    @Override // com.aspose.words.zzZAF
    public final zzZAF zzu(String str, boolean z) throws Exception {
        if (z) {
            return this.zzY5R.zzIV(str);
        }
        zzZAF zzzafZzIU = this.zzY5R.zzIU(str);
        if (zzzafZzIU != null && zzzafZzIU.zzZha()) {
            zzzafZzIU.reset();
        }
        return zzzafZzIU;
    }

    private zzZ2P(zzZAF zzzaf, MailMerge mailMerge, Iterable<zzYWB> iterable, zzZ2P zzz2p) {
        this.zzYHV = zzzaf;
        this.zzY5W = mailMerge;
        this.zzY5V = iterable;
        this.zzY5U = zzz2p;
    }

    public static /* synthetic */ Iterable zzZ(zzZ2G zzz2g, String str) {
        return zzZ(zzz2g, str, false);
    }

    public static zzZAF zzZ(zzZAF zzzaf, MailMerge mailMerge, zzZ2G zzz2g) throws Exception {
        Iterable<zzYWB> iterableZzZ;
        return (zzzaf == null || zzzaf.zzZha() || (iterableZzZ = zzZ(zzz2g, zzzaf.getTableName(), true)) == null) ? zzzaf : new zzZ2P(zzzaf, mailMerge, iterableZzZ, null);
    }

    private static Iterable<zzYWB> zzZ(zzZ2G zzz2g, String str, boolean z) {
        ArrayList arrayList = null;
        zzYWB zzywb = null;
        for (zzZ2H zzz2h : zzz2g) {
            if (zzz2h.isDefined() && com.aspose.words.internal.zzZYD.zzi(zzz2h.getName(), str)) {
                zzYWB zzywb2 = new zzYWB(zzz2h.zzYJE().getEnd(), false, zzz2h.zzYJD().getStart(), false);
                if (z && zzywb == null) {
                    zzywb = zzywb2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (zzywb != null) {
                            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYWB>) arrayList, zzywb);
                        }
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYWB>) arrayList, zzywb2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZ(int i, Ref<Object> ref) {
        throw new UnsupportedOperationException();
    }
}
