package o0000o0O;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m80623f = "DataStoreImpl.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3, 300}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32443OooOOO<? extends AbstractC24302o0ooOO0<Object>, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81612OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Throwable f81613OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81614OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(OooOOO<Object> oooOOO, Continuation<? super OooOo> continuation) {
        super(1, continuation);
        this.f81614OooOoO0 = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new OooOo(this.f81614OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32443OooOOO<? extends AbstractC24302o0ooOO0<Object>, ? extends Boolean>> continuation) {
        return ((OooOo) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        AbstractC24302o0ooOO0 c24297OoooooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81612OooOo;
        OooOOO<Object> oooOOO = this.f81614OooOoO0;
        try {
        } catch (Throwable th2) {
            o000oOoO o000ooooOooO0oO = oooOOO.OooO0oO();
            this.f81613OooOo0o = th2;
            this.f81612OooOo = 2;
            Object objOooO0OO = o000ooooOooO0oO.OooO0OO(this);
            if (objOooO0OO != enumC32485OooO00o) {
                th = th2;
                obj = objOooO0OO;
            }
            return enumC32485OooO00o;
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f81612OooOo = 1;
            obj = OooOOO.OooO0o(oooOOO, true, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f81613OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c24297OoooooO = new C24297OoooooO(th, ((Number) obj).intValue());
                return new C32443OooOOO(c24297OoooooO, Boolean.TRUE);
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        c24297OoooooO = (AbstractC24302o0ooOO0) obj;
        return new C32443OooOOO(c24297OoooooO, Boolean.TRUE);
    }
}
