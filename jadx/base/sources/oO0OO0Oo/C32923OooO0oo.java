package oO0OO0Oo;

import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0OO00.C32893OooOo0;
import oO0OO00.C32895OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0OO0Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32923OooO0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32923OooO0oo f118802OooO0O0 = new C32923OooO0oo(C34434OooOoO.f123453OooOo0o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<C32893OooOo0> f118803OooO00o;

    /* JADX INFO: renamed from: oO0OO0Oo.OooO0oo$OooO00o */
    public static final class OooO00o {
        public static C32923OooO0oo OooO00o(C32895OooOo0O table) {
            OooOOO0.OooO0oO(table, "table");
            if (table.f118528OooOo.size() == 0) {
                return C32923OooO0oo.f118802OooO0O0;
            }
            List<C32893OooOo0> list = table.f118528OooOo;
            OooOOO0.OooO0o(list, "table.requirementList");
            return new C32923OooO0oo(list);
        }
    }

    public C32923OooO0oo(List<C32893OooOo0> list) {
        this.f118803OooO00o = list;
    }
}
