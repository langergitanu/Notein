package oO0Ooo;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.C22220Oooo00o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33314OooOo00 extends AbstractC33350Oooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f120551OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC33350Oooooo f120552OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC33350Oooooo f120553OooO0OO;

    public C33314OooOo00(AbstractC33350Oooooo abstractC33350Oooooo, AbstractC33350Oooooo abstractC33350Oooooo2) {
        this.f120552OooO0O0 = abstractC33350Oooooo;
        this.f120553OooO0OO = abstractC33350Oooooo2;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final boolean OooO00o() {
        return this.f120552OooO0O0.OooO00o() || this.f120553OooO0OO.OooO00o();
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final boolean OooO0O0() {
        return this.f120552OooO0O0.OooO0O0() || this.f120553OooO0OO.OooO0O0();
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final InterfaceC34588OooO0oO OooO0OO(InterfaceC34588OooO0oO annotations) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotations, "annotations");
        return this.f120553OooO0OO.OooO0OO(this.f120552OooO0O0.OooO0OO(annotations));
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final InterfaceC33348OooooOO OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo) {
        InterfaceC33348OooooOO interfaceC33348OooooOOOooO0Oo = this.f120552OooO0O0.OooO0Oo(abstractC33320OooOoo);
        return interfaceC33348OooooOOOooO0Oo == null ? this.f120553OooO0OO.OooO0Oo(abstractC33320OooOoo) : interfaceC33348OooooOOOooO0Oo;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final AbstractC33320OooOoo OooO0o(int i, AbstractC33320OooOoo topLevelType) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(topLevelType, "topLevelType");
        C22220Oooo00o.OooO0OO(i, RequestParameters.POSITION);
        return this.f120553OooO0OO.OooO0o(i, this.f120552OooO0O0.OooO0o(i, topLevelType));
    }
}
