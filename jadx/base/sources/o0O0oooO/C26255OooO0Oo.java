package o0O0oooO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.App;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0O0oooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.App", m80623f = "App.kt", m80624l = {304, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6}, m80625m = "resetNightMode")
public final class C26255OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ App f89711OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f89712OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f89713OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26255OooO0Oo(App app, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f89711OooOo = app;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f89712OooOo0o = obj;
        this.f89713OooOoO0 |= Integer.MIN_VALUE;
        return App.OooO0OO(this.f89711OooOo, this);
    }
}
