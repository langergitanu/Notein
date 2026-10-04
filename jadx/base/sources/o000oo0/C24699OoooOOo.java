package o000oo0;

import com.aspose.words.StyleIdentifier;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o000oo0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker", m80623f = "InvalidationTracker.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "stopTrackingTable")
public final class C24699OoooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f83716OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOOOO f83717OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f83718OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String[] f83719OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f83720OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C24695OoooO00 f83721OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f83722OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f83723OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24699OoooOOo(C24695OoooO00 c24695OoooO00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83721OooOoo = c24695OoooO00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83722OooOoo0 = obj;
        this.f83723OooOooO |= Integer.MIN_VALUE;
        return C24695OoooO00.OooO0Oo(this.f83721OooOoo, null, 0, this);
    }
}
