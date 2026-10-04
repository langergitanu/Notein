package Ooooo0o;

import Ooooo0o.C21264OooOO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34624OooO0OO;

/* JADX INFO: renamed from: Ooooo0o.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21283OooOooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC34624OooO0OO.OooO00o, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FocusTargetModifierNode f61695OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FocusTargetModifierNode f61696OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C21264OooOO0o.OooO0O0 f61697OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f61698OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21283OooOooo(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C21264OooOO0o.OooO0O0 oooO0O0) {
        super(1);
        this.f61696OooOo0o = focusTargetModifierNode;
        this.f61695OooOo = focusTargetModifierNode2;
        this.f61698OooOoO0 = i;
        this.f61697OooOoO = oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(InterfaceC34624OooO0OO.OooO00o oooO00o) {
        InterfaceC34624OooO0OO.OooO00o searchBeyondBounds = oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(searchBeyondBounds, "$this$searchBeyondBounds");
        C21264OooOO0o.OooO0O0 oooO0O0 = this.f61697OooOoO;
        boolean zOooOO0O = Oooo000.OooOO0O(this.f61696OooOo0o, this.f61695OooOo, this.f61698OooOoO0, oooO0O0);
        Boolean boolValueOf = Boolean.valueOf(zOooOO0O);
        if (zOooOO0O || !searchBeyondBounds.OooO00o()) {
            return boolValueOf;
        }
        return null;
    }
}
