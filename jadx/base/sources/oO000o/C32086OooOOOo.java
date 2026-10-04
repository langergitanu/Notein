package oO000o;

import java.util.Iterator;
import java.util.List;
import oO00O0o0.C32190OooOOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO000o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32086OooOOOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<String, List<? extends String>, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f114937OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32086OooOOOo(InterfaceC32508OooOOOo<? super String, ? super String, C32460OooOooO> interfaceC32508OooOOOo) {
        super(2);
        this.f114937OooOo0o = (kotlin.jvm.internal.OooOOOO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOOOo] */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(String str, List<? extends String> list) {
        String key = str;
        List<? extends String> values = list;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        List<String> list2 = C32190OooOOo0.f115537OooO00o;
        if (!"Content-Length".equals(key) && !"Content-Type".equals(key)) {
            boolean zContains = C32087OooOOo0.f114938OooO00o.contains(key);
            ?? r1 = this.f114937OooOo0o;
            if (zContains) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    r1.invoke(key, (String) it.next());
                }
            } else {
                r1.invoke(key, OooOo.o000oOoO(values, ",", null, null, null, 62));
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
