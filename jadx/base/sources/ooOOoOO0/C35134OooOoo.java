package ooOOoOO0;

import java.util.List;
import oO0o.InterfaceC33531OooO0o0;
import oO0oO00.C33962Oooo;
import oOo000Oo.C34444Oooo0O0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34462OooOO0o;
import oOo00O0O.C34468OooOo0O;
import oOo00O0O.C34474OooOoo0;

/* JADX INFO: renamed from: ooOOoOO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35134OooOoo extends C35133OooOoOO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C34474OooOoo0 f126149OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<String> f126150OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f126151OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f126152OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35134OooOoo(AbstractC34457OooO0OO json, C34474OooOoo0 value) {
        super(json, value, (String) null, 12);
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f126149OooOO0 = value;
        List<String> listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(value.f123538OooOo0o.keySet());
        this.f126150OooOO0O = listO0ooOO0;
        this.f126151OooOO0o = listO0ooOO0.size() * 2;
        this.f126152OooOOO0 = -1;
    }

    @Override // ooOOoOO0.C35133OooOoOO, ooOOoOO0.AbstractC35115OooO0O0, oO0oO000.OooO00o
    public final void OooO0O0(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
    }

    @Override // ooOOoOO0.C35133OooOoOO, oO0oO000.OooO00o
    public final int OooOo0o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        int i = this.f126152OooOOO0;
        if (i >= this.f126151OooOO0o - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f126152OooOOO0 = i2;
        return i2;
    }

    @Override // ooOOoOO0.C35133OooOoOO, oO0oO00.o0OoOo0
    public final String OoooO00(InterfaceC33531OooO0o0 descriptor, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        return this.f126150OooOO0O.get(i / 2);
    }

    @Override // ooOOoOO0.C35133OooOoOO, ooOOoOO0.AbstractC35115OooO0O0
    public final oOo00O0O.OooOO0O OoooOO0(String tag) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        if (this.f126152OooOOO0 % 2 != 0) {
            return (oOo00O0O.OooOO0O) C34444Oooo0O0.OooO0oO(tag, this.f126149OooOO0);
        }
        C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
        return new C34468OooOo0O(tag, true);
    }

    @Override // ooOOoOO0.C35133OooOoOO, ooOOoOO0.AbstractC35115OooO0O0
    public final oOo00O0O.OooOO0O OoooOOO() {
        return this.f126149OooOO0;
    }

    @Override // ooOOoOO0.C35133OooOoOO
    /* JADX INFO: renamed from: OoooOoO */
    public final C34474OooOoo0 OoooOOO() {
        return this.f126149OooOO0;
    }
}
