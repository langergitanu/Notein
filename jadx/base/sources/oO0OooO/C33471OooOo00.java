package oO0OooO;

import java.util.LinkedHashSet;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OooO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33471OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<String> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f120943OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33471OooOo00(LinkedHashSet linkedHashSet) {
        super(0);
        this.f120943OooOo0o = linkedHashSet;
    }

    @Override // oO0O000o.OooO00o
    public final String invoke() {
        return "This collections cannot be empty! input types: " + OooOo.o000oOoO(this.f120943OooOo0o, null, null, null, null, 63);
    }
}
