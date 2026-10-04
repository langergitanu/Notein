package oO0OoO0;

import OooOoo.C20644Ooooooo;
import java.util.LinkedHashMap;
import java.util.List;
import o00O0oo0.C24969OooOO0;
import oO0O0OO.o000oOoO;
import oO0OO00.C32888OooOO0o;
import oO0OO0Oo.C32919OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0OoO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33250OooOoo implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32919OooO0Oo f120336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0OO0O.OooO00o f120337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C20644Ooooooo f120338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f120339OooO0Oo;

    public C33250OooOoo(C32888OooOO0o c32888OooOO0o, C32919OooO0Oo c32919OooO0Oo, oO0OO0O.OooO00o oooO00o, C20644Ooooooo c20644Ooooooo) {
        this.f120336OooO00o = c32919OooO0Oo;
        this.f120337OooO0O0 = oooO00o;
        this.f120338OooO0OO = c20644Ooooooo;
        List<oO0OO00.OooO0O0> list = c32888OooOO0o.f118284OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0o(list, "proto.class_List");
        List<oO0OO00.OooO0O0> list2 = list;
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo < 16 ? 16 : iOooO0Oo);
        for (Object obj : list2) {
            linkedHashMap.put(C24969OooOO0.OooO00o(this.f120336OooO00o, ((oO0OO00.OooO0O0) obj).f118079OooOoOO), obj);
        }
        this.f120339OooO0Oo = linkedHashMap;
    }

    @Override // oO0OoO0.OooO
    public final C33238OooO0oo OooO00o(C33476OooO0O0 classId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        oO0OO00.OooO0O0 oooO0O0 = (oO0OO00.OooO0O0) this.f120339OooO0Oo.get(classId);
        if (oooO0O0 == null) {
            return null;
        }
        this.f120338OooO0OO.invoke(classId);
        return new C33238OooO0oo(this.f120336OooO00o, oooO0O0, this.f120337OooO0O0, o000oOoO.f117308OooO00o);
    }
}
