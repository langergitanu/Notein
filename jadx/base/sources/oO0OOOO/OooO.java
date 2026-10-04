package oO0OOOO;

import java.util.ArrayList;
import java.util.Set;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public enum OooO {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Set<OooO> f118936OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final Set<OooO> f118938OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f118953OooOo0o;

    static {
        OooO[] oooOArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (OooO oooO : oooOArrValues) {
            if (oooO.f118953OooOo0o) {
                arrayList.add(oooO);
            }
        }
        f118936OooOo = OooOo.o0OO00O(arrayList);
        f118938OooOoO0 = oOo000Oo.OooOOO.OoooOo0(values());
    }

    OooO(boolean z) {
        this.f118953OooOo0o = z;
    }
}
