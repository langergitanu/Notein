package oO0oO00;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.C33523OooO00o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oo0oO0.C34923o00oOO;

/* JADX INFO: renamed from: oO0oO00.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33984OooooOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f122208OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f122209OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f122210OooOoO0;

    public /* synthetic */ C33984OooooOO(int i, Object obj, Object obj2) {
        this.f122209OooOo0o = i;
        this.f122208OooOo = obj;
        this.f122210OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f122209OooOo0o) {
            case 0:
                C33523OooO00o buildSerialDescriptor = (C33523OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C33523OooO00o.OooO00o(buildSerialDescriptor, "key", ((InterfaceC33911OooO0OO) this.f122208OooOo).getDescriptor());
                C33523OooO00o.OooO00o(buildSerialDescriptor, "value", ((InterfaceC33911OooO0OO) this.f122210OooOoO0).getDescriptor());
                break;
            default:
                ((C34923o00oOO) this.f122208OooOo).f125504OooO0Oo.OoooOOO((InterfaceC24747OooO0O0) obj, (PageLayerEntity[]) this.f122210OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
