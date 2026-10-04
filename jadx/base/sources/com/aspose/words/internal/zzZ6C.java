package com.aspose.words.internal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ6C {
    private static final Set zzWmp;
    private static final Set zzWmq;
    private static final Set zzWmr;
    private static final Set<String> zzWms;

    static {
        HashSet hashSet = new HashSet();
        zzWms = hashSet;
        HashSet hashSet2 = new HashSet();
        zzWmr = hashSet2;
        HashSet hashSet3 = new HashSet();
        zzWmq = hashSet3;
        zzWmp = new HashSet();
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(zzZ9K.zzWz0.getId());
        hashSet.add(zzZ96.zzWya.getId());
        hashSet.add(zzZ96.zzWwu.getId());
        hashSet2.add(zzZ6W.zzWny);
        hashSet2.add(zzZ8T.zzWur);
        hashSet2.add(zzZ8T.zzWuq);
        hashSet2.add(zzZ8T.zzWup);
        hashSet2.add(zzZ8T.zzWuo);
        hashSet3.add(zzZ6W.zzWnz);
        hashSet3.add(zzZ6W.zzWnA);
        hashSet3.add(zzZ8T.zzWuv);
        hashSet3.add(zzZ8T.zzWuz);
        hashSet3.add(zzZ8T.zzWuu);
        hashSet3.add(zzZ8T.zzWuy);
        hashSet3.add(zzZ8T.zzWut);
        hashSet3.add(zzZ8T.zzWux);
        hashSet3.add(zzZ8T.zzWus);
        hashSet3.add(zzZ8T.zzWuw);
    }

    public static zzZD2 zzT(List list) {
        zzZDJ zzzdj = new zzZDJ();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzzdj.zzZ((zzZDK) it.next());
        }
        return new zzZBM(zzzdj);
    }

    public static zzZD2 zzU(List list) {
        zzZDJ zzzdj = new zzZDJ();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzzdj.zzZ((zzZDK) it.next());
        }
        return new zzZCN(zzzdj);
    }

    public static zzZD2 zzX(Set<zzZ86> set) {
        return new zzZBM((zzZ86[]) set.toArray(new zzZ86[set.size()]));
    }

    public static List zzY(zzYGK zzygk) throws zzZ6M {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = zzygk.zzZ(null).iterator();
            while (it.hasNext()) {
                arrayList.add(((zzZ6T) it.next()).zzXHp());
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new zzZ6M("error processing certs", e);
        }
    }

    public static void zzZ(Set<zzZ86> set, zzZ63 zzz63, zzYHG zzyhg) {
        zzZ6E zzz6e = zzZ6E.zzWmz;
        set.add(zzZ6E.zzZ(zzz63.zzXHe(), zzyhg));
        for (zzZ63 zzz632 : zzz63.zzXHb()) {
            zzZ6E zzz6e2 = zzZ6E.zzWmz;
            set.add(zzZ6E.zzZ(zzz632.zzXHe(), zzyhg));
        }
    }

    public static OutputStream zzT(OutputStream outputStream) {
        return outputStream == null ? new zzZ68() : outputStream;
    }

    public static OutputStream zzZ(Collection collection, OutputStream outputStream) {
        Iterator it = collection.iterator();
        OutputStream outputStreamZzZ = null;
        while (it.hasNext()) {
            outputStreamZzZ = zzZ(outputStreamZzZ, ((zzZ65) it.next()).zzXHh());
        }
        return outputStreamZzZ;
    }

    private static OutputStream zzZ(OutputStream outputStream, OutputStream outputStream2) {
        if (outputStream == null) {
            return zzT(outputStream2);
        }
        return outputStream2 == null ? zzT(outputStream) : new zzYG8(outputStream, outputStream2);
    }
}
