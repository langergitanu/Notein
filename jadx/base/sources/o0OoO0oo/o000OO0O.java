package o0OoO0oo;

import o00oOo00.C25602OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.C33523OooO00o;
import oOo00O0O.C34463OooOOOo;
import oOo00O0O.C34464OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o000OO0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101944OooOo0o;

    public /* synthetic */ o000OO0O(int i) {
        this.f101944OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f101944OooOo0o) {
            case 0:
                oOo00O0O.OooO0o Json = (oOo00O0O.OooO0o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(Json, "$this$Json");
                Json.f123498OooO0OO = true;
                break;
            default:
                C33523OooO00o buildSerialDescriptor = (C33523OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C33523OooO00o.OooO00o(buildSerialDescriptor, "JsonPrimitive", new C34464OooOOo(new C25602OooO0O0(1)));
                C33523OooO00o.OooO00o(buildSerialDescriptor, "JsonNull", new C34464OooOOo(new oOo00O0O.OooOOO0()));
                C33523OooO00o.OooO00o(buildSerialDescriptor, "JsonLiteral", new C34464OooOOo(new oOo00O0O.OooOOO()));
                C33523OooO00o.OooO00o(buildSerialDescriptor, "JsonObject", new C34464OooOOo(new oOo00O0O.OooOOOO()));
                C33523OooO00o.OooO00o(buildSerialDescriptor, "JsonArray", new C34464OooOOo(new C34463OooOOOo()));
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
