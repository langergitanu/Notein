package oO0Oo0o0;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.ArrayList;
import oO0OOOo.C32995OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC33218OooO0oO f120211OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList<oO0O0OO.OooOO0O> f120212OooOo0o;

    public OooO0o(ArrayList<oO0O0OO.OooOO0O> arrayList, AbstractC33218OooO0oO abstractC33218OooO0oO) {
        this.f120212OooOo0o = arrayList;
        this.f120211OooOo = abstractC33218OooO0oO;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO0oO(oO0O0OO.OooO0O0 fakeOverride) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fakeOverride, "fakeOverride");
        C32995OooOOO0.OooOOo(fakeOverride, null);
        this.f120212OooOo0o.add(fakeOverride);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOO0(oO0O0OO.OooO0O0 oooO0O0, oO0O0OO.OooO0O0 fromCurrent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f120211OooOo.f120215OooO0O0 + ": " + oooO0O0 + " vs " + fromCurrent).toString());
    }
}
