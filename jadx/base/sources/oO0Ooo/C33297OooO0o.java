package oO0Ooo;

import java.util.ArrayList;
import java.util.Iterator;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo.C33340OoooOOo;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0o0000.InterfaceC33542OooO0oo;

/* JADX INFO: renamed from: oO0Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33297OooO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33340OoooOOo.OooO00o, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33340OoooOOo f120523OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f120524OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33542OooO0oo f120525OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33452OooO0O0 f120526OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33297OooO0o(ArrayList arrayList, C33340OoooOOo c33340OoooOOo, InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        super(1);
        this.f120524OooOo0o = arrayList;
        this.f120523OooOo = c33340OoooOOo;
        this.f120526OooOoO0 = interfaceC33452OooO0O0;
        this.f120525OooOoO = interfaceC33542OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(C33340OoooOOo.OooO00o oooO00o) {
        C33340OoooOOo.OooO00o runForkingPoint = oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(runForkingPoint, "$this$runForkingPoint");
        Iterator it = this.f120524OooOo0o.iterator();
        while (it.hasNext()) {
            runForkingPoint.OooO00o(new C33298OooO0o0(this.f120523OooOo, this.f120526OooOoO0, (InterfaceC33542OooO0oo) it.next(), this.f120525OooOoO));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
