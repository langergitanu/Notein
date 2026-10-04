package OooOoo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DragLogic", m80623f = "Draggable.kt", m80624l = {422, 425}, m80625m = "processDragCancel")
public final class C20606OooOOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33636Oooo00o f58963OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C20608OooOo0O f58964OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20608OooOo0O f58965OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f58966OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f58967OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20606OooOOoo(C20608OooOo0O c20608OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f58965OooOoO = c20608OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f58966OooOoO0 = obj;
        this.f58967OooOoOO |= Integer.MIN_VALUE;
        return this.f58965OooOoO.OooO00o(null, this);
    }
}
