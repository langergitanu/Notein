package ooOOoOO0;

import oO0o.InterfaceC33531OooO0o0;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends AbstractC35115OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oOo00O0O.OooOO0O f126128OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(AbstractC34457OooO0OO json, oOo00O0O.OooOO0O value, String str) {
        super(json, value, str);
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f126128OooO0o = value;
        this.f122277OooO00o.add("primitive");
    }

    @Override // oO0oO000.OooO00o
    public final int OooOo0o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        return 0;
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0
    public final oOo00O0O.OooOO0O OoooOO0(String tag) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        if (tag == "primitive") {
            return this.f126128OooO0o;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0
    public final oOo00O0O.OooOO0O OoooOOO() {
        return this.f126128OooO0o;
    }
}
