package oO0Ooo0o;

import java.util.Comparator;
import java.util.Map;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33443OooOOOo<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0((String) ((Map.Entry) t).getKey(), (String) ((Map.Entry) t2).getKey());
    }
}
