package oO0oO00;

import com.orion.notein.data.p602db.entity.ImageEntity;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.C33523OooO00o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oo0oO0.o000O0;

/* JADX INFO: renamed from: oO0oO00.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33998o00o0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f122269OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f122270OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f122271OooOoO0;

    public /* synthetic */ C33998o00o0O(int i, Object obj, Object obj2) {
        this.f122270OooOo0o = i;
        this.f122269OooOo = obj;
        this.f122271OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f122270OooOo0o) {
            case 0:
                C33523OooO00o buildClassSerialDescriptor = (C33523OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C33523OooO00o.OooO00o(buildClassSerialDescriptor, "first", ((InterfaceC33911OooO0OO) this.f122269OooOo).getDescriptor());
                C33523OooO00o.OooO00o(buildClassSerialDescriptor, "second", ((InterfaceC33911OooO0OO) this.f122271OooOoO0).getDescriptor());
                break;
            default:
                ((o000O0) this.f122269OooOo).f125163OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (ImageEntity[]) this.f122271OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
