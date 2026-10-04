package oO00ooOo;

import java.util.Comparator;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00ooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32474OooO0O0 implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32474OooO0O0 f116717OooOo0o = new C32474OooO0O0();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a = comparable;
        Comparable<? super Object> b = comparable2;
        OooOOO0.OooO0oO(a, "a");
        OooOOO0.OooO0oO(b, "b");
        return a.compareTo(b);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C32475OooO0OO.f116718OooOo0o;
    }
}
