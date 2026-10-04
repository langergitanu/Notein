package ooOOoOO0;

import oO0o.InterfaceC33531OooO0o0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34458OooO0Oo;

/* JADX INFO: renamed from: ooOOoOO0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35135OooOoo0 extends AbstractC35115OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C34458OooO0Oo f126153OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f126154OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f126155OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35135OooOoo0(AbstractC34457OooO0OO json, C34458OooO0Oo value) {
        super(json, value, null);
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f126153OooO0o = value;
        this.f126154OooO0oO = value.f123494OooOo0o.size();
        this.f126155OooO0oo = -1;
    }

    @Override // oO0oO000.OooO00o
    public final int OooOo0o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        int i = this.f126155OooO0oo;
        if (i >= this.f126154OooO0oO - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f126155OooO0oo = i2;
        return i2;
    }

    @Override // oO0oO00.o0OoOo0
    public final String OoooO00(InterfaceC33531OooO0o0 descriptor, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0
    public final oOo00O0O.OooOO0O OoooOO0(String tag) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        return this.f126153OooO0o.f123494OooOo0o.get(Integer.parseInt(tag));
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0
    public final oOo00O0O.OooOO0O OoooOOO() {
        return this.f126153OooO0o;
    }
}
