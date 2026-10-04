package oO0O0OOo;

import java.util.ArrayList;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public enum OooOO0 {
    READ(1),
    WRITE(4),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPT(16),
    CONNECT(8);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOO0[] f117367OooOo = values();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f117369OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f117373OooOo0o;

    static {
        OooOO0[] oooOO0ArrValues = values();
        ArrayList arrayList = new ArrayList(oooOO0ArrValues.length);
        for (OooOO0 oooOO02 : oooOO0ArrValues) {
            arrayList.add(Integer.valueOf(oooOO02.f117373OooOo0o));
        }
        f117369OooOoO0 = OooOo.o00oO0O(arrayList);
        int length = values().length;
    }

    OooOO0(int i) {
        this.f117373OooOo0o = i;
    }
}
