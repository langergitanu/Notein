package oO0O0oO0;

import java.lang.reflect.Member;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32735OooOO0 extends kotlin.jvm.internal.OooOO0O implements InterfaceC32507OooOO0o<Member, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32735OooOO0 f117679OooOo0o = new C32735OooOO0(1);

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34596OooO0o getOwner() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(Member.class);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(Member member) {
        Member p0 = member;
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}
