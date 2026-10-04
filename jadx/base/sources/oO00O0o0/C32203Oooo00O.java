package oO00O0o0;

import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO00O0o0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32203Oooo00O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<String, List<? extends String>, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32200OooOooO f115585OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32203Oooo00O(C32200OooOooO c32200OooOooO) {
        super(2);
        this.f115585OooOo0o = c32200OooOooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(String str, List<? extends String> list) {
        String key = str;
        List<? extends String> values = list;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        this.f115585OooOo0o.f115570OooO.OooO00o(key, values);
        return C32460OooOooO.f116667OooO00o;
    }
}
