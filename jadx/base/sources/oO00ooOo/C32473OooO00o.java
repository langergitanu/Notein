package oO00ooOo;

import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO00ooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32473OooO00o implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o[] f116716OooOo0o;

    public /* synthetic */ C32473OooO00o(InterfaceC32507OooOO0o[] interfaceC32507OooOO0oArr) {
        this.f116716OooOo0o = interfaceC32507OooOO0oArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (InterfaceC32507OooOO0o interfaceC32507OooOO0o : this.f116716OooOo0o) {
            int iOooO0O0 = C24536OooO0Oo.OooO0O0((Comparable) interfaceC32507OooOO0o.invoke(obj), (Comparable) interfaceC32507OooOO0o.invoke(obj2));
            if (iOooO0O0 != 0) {
                return iOooO0O0;
            }
        }
        return 0;
    }
}
