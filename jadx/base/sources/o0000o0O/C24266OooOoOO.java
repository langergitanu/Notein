package o0000o0O;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0000o0O.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m80623f = "DataStoreImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, StyleIdentifier.SMART_LINK}, m80625m = "invokeSuspend")
public final class C24266OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C24251OooO0o0<Object>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81648OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81649OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81650OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f81651OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f81652OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24266OooOoOO(OooOOO<Object> oooOOO, int i, Continuation<? super C24266OooOoOO> continuation) {
        super(2, continuation);
        this.f81650OooOoO = oooOOO;
        this.f81652OooOoOO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24266OooOoOO c24266OooOoOO = new C24266OooOoOO(this.f81650OooOoO, this.f81652OooOoOO, continuation);
        c24266OooOoOO.f81651OooOoO0 = ((Boolean) obj).booleanValue();
        return c24266OooOoOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Boolean bool, Continuation<? super C24251OooO0o0<Object>> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C24266OooOoOO) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        int iIntValue;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81648OooOo;
        OooOOO<Object> oooOOO = this.f81650OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            z = this.f81651OooOoO0;
            this.f81651OooOoO0 = z;
            this.f81648OooOo = 1;
            obj = oooOOO.OooO(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f81649OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            iIntValue = ((Number) obj).intValue();
            return new C24251OooO0o0(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
        }
        z = this.f81651OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        if (!z) {
            obj2 = obj;
            iIntValue = this.f81652OooOoOO;
            return new C24251OooO0o0(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
        }
        o000oOoO o000ooooOooO0oO = oooOOO.OooO0oO();
        this.f81649OooOo0o = obj;
        this.f81648OooOo = 2;
        Object objOooO0OO = o000ooooOooO0oO.OooO0OO(this);
        if (objOooO0OO != enumC32485OooO00o) {
            obj2 = obj;
            obj = objOooO0OO;
            iIntValue = ((Number) obj).intValue();
            return new C24251OooO0o0(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
        }
        return enumC32485OooO00o;
    }
}
