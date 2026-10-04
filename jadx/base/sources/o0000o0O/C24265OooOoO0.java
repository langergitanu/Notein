package o0000o0O;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0000o0O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m80623f = "DataStoreImpl.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4, StyleIdentifier.GRID_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
public final class C24265OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32443OooOOO<? extends AbstractC24302o0ooOO0<Object>, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81643OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Throwable f81644OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81645OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f81646OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f81647OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24265OooOoO0(OooOOO<Object> oooOOO, int i, Continuation<? super C24265OooOoO0> continuation) {
        super(2, continuation);
        this.f81645OooOoO = oooOOO;
        this.f81647OooOoOO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24265OooOoO0 c24265OooOoO0 = new C24265OooOoO0(this.f81645OooOoO, this.f81647OooOoOO, continuation);
        c24265OooOoO0.f81646OooOoO0 = ((Boolean) obj).booleanValue();
        return c24265OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Boolean bool, Continuation<? super C32443OooOOO<? extends AbstractC24302o0ooOO0<Object>, ? extends Boolean>> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C24265OooOoO0) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r0;
        ?? r02;
        AbstractC24302o0ooOO0 abstractC24302o0ooOO0;
        ?? r1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r12 = this.f81643OooOo;
        OooOOO<Object> oooOOO = this.f81645OooOoO;
        try {
        } catch (Throwable th2) {
            if (r12 != 0) {
                o000oOoO o000ooooOooO0oO = oooOOO.OooO0oO();
                this.f81644OooOo0o = th2;
                this.f81646OooOoO0 = r12;
                this.f81643OooOo = 2;
                Object objOooO0OO = o000ooooOooO0oO.OooO0OO(this);
                if (objOooO0OO != enumC32485OooO00o) {
                    r02 = r12;
                    th = th2;
                    obj = objOooO0OO;
                }
                return enumC32485OooO00o;
            }
            ?? r5 = r12;
            th = th2;
            iIntValue = this.f81647OooOoOO;
            r0 = r5 == true ? 1 : 0;
        }
        if (r12 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f81646OooOoO0;
            this.f81646OooOoO0 = z;
            this.f81643OooOo = 1;
            obj = OooOOO.OooO0o(oooOOO, z, this);
            r12 = z;
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = this.f81646OooOoO0;
                th = this.f81644OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r02 = z2;
                iIntValue = ((Number) obj).intValue();
                r0 = r02;
                C24297OoooooO c24297OoooooO = new C24297OoooooO(th, iIntValue);
                r1 = r0;
                abstractC24302o0ooOO0 = c24297OoooooO;
                return new C32443OooOOO(abstractC24302o0ooOO0, Boolean.valueOf((boolean) r1));
            }
            boolean z3 = this.f81646OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            r12 = z3;
        }
        abstractC24302o0ooOO0 = (AbstractC24302o0ooOO0) obj;
        r1 = r12;
        return new C32443OooOOO(abstractC24302o0ooOO0, Boolean.valueOf((boolean) r1));
    }
}
