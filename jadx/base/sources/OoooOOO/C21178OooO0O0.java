package OoooOOO;

import OoooOOO.InterfaceC21182OooO0o0;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OoooOOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21178OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21185OooOO0 f61422OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21180OooO0Oo<Object> f61423OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f61424OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21182OooO0o0 f61425OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f61426OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object[] f61427OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21178OooO0O0(C21180OooO0Oo<Object> c21180OooO0Oo, C21185OooOO0 c21185OooOO0, InterfaceC21182OooO0o0 interfaceC21182OooO0o0, String str, Object obj, Object[] objArr) {
        super(0);
        this.f61423OooOo0o = c21180OooO0Oo;
        this.f61422OooOo = c21185OooOO0;
        this.f61425OooOoO0 = interfaceC21182OooO0o0;
        this.f61424OooOoO = str;
        this.f61426OooOoOO = obj;
        this.f61427OooOoo0 = objArr;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        boolean z;
        C21180OooO0Oo<Object> c21180OooO0Oo = this.f61423OooOo0o;
        InterfaceC21182OooO0o0 interfaceC21182OooO0o0 = c21180OooO0Oo.f61429OooOo;
        InterfaceC21182OooO0o0 interfaceC21182OooO0o02 = this.f61425OooOoO0;
        boolean z2 = true;
        if (interfaceC21182OooO0o0 != interfaceC21182OooO0o02) {
            c21180OooO0Oo.f61429OooOo = interfaceC21182OooO0o02;
            z = true;
        } else {
            z = false;
        }
        String str = c21180OooO0Oo.f61432OooOoO0;
        String str2 = this.f61424OooOoO;
        if (OooOOO0.OooO0O0(str, str2)) {
            z2 = z;
        } else {
            c21180OooO0Oo.f61432OooOoO0 = str2;
        }
        c21180OooO0Oo.f61430OooOo0o = this.f61422OooOo;
        c21180OooO0Oo.f61431OooOoO = this.f61426OooOoOO;
        c21180OooO0Oo.f61433OooOoOO = this.f61427OooOoo0;
        InterfaceC21182OooO0o0.OooO00o oooO00o = c21180OooO0Oo.f61435OooOoo0;
        if (oooO00o != null && z2) {
            oooO00o.unregister();
            c21180OooO0Oo.f61435OooOoo0 = null;
            c21180OooO0Oo.OooO0O0();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
