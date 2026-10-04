package o0O0oooo;

import com.orion.penkit.models.DualLinkRefInfo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.C33523OooO00o;
import oO0oO00.o00Ooo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0O0oooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26367OooOO0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90473OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90474OooOo0o;

    public /* synthetic */ C26367OooOO0o(Object obj, int i) {
        this.f90474OooOo0o = i;
        this.f90473OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f90474OooOo0o) {
            case 0:
                DualLinkRefInfo it = (DualLinkRefInfo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(it.getId(), ((DualLinkRefInfo) this.f90473OooOo).getId()));
            default:
                C33523OooO00o buildSerialDescriptor = (C33523OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((o00Ooo) this.f90473OooOo).getClass();
                buildSerialDescriptor.f121094OooO0O0 = C34434OooOoO.f123453OooOo0o;
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
