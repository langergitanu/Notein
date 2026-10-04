package oO0O0Oo0;

import java.util.Collection;
import java.util.HashSet;
import oO0O0Oo0.C32680OooOoO0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0Oo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32678OooOo0o implements oO0O000o.OooO00o<Collection<oO0O0OO.OooOO0O>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32680OooOoO0.OooO00o f117429OooOo0o;

    public C32678OooOo0o(C32680OooOoO0.OooO00o oooO00o) {
        this.f117429OooOo0o = oooO00o;
    }

    @Override // oO0O000o.OooO00o
    public final Collection<oO0O0OO.OooOO0O> invoke() {
        C32680OooOoO0.OooO00o oooO00o = this.f117429OooOo0o;
        oooO00o.getClass();
        HashSet hashSet = new HashSet();
        for (C33479OooO0o c33479OooO0o : oooO00o.f117437OooO0o0.f117432OooOooo.invoke()) {
            if (c33479OooO0o == null) {
                C32680OooOoO0.OooO00o.OooO0oo(5);
                throw null;
            }
            hashSet.addAll((Collection) ((C33361OooO0Oo.OooOO0O) oooO00o.f117434OooO0O0).invoke(c33479OooO0o));
            hashSet.addAll((Collection) ((C33361OooO0Oo.OooOO0O) oooO00o.f117435OooO0OO).invoke(c33479OooO0o));
        }
        return hashSet;
    }
}
