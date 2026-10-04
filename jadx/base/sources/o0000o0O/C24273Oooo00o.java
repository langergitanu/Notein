package o0000o0O;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0000o0O.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$writeData$2", m80623f = "DataStoreImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_4, StyleIdentifier.LIST_TABLE_4_ACCENT_4}, m80625m = "invokeSuspend")
public final class C24273Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o0O0O00<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81684OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24033OooOooo f81685OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f81686OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81687OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81688OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f81689OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f81690OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24273Oooo00o(C24033OooOooo c24033OooOooo, OooOOO<Object> oooOOO, Object obj, boolean z, Continuation<? super C24273Oooo00o> continuation) {
        super(2, continuation);
        this.f81686OooOoO = c24033OooOooo;
        this.f81688OooOoOO = oooOOO;
        this.f81690OooOoo0 = obj;
        this.f81689OooOoo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24273Oooo00o c24273Oooo00o = new C24273Oooo00o(this.f81686OooOoO, this.f81688OooOoOO, this.f81690OooOoo0, this.f81689OooOoo, continuation);
        c24273Oooo00o.f81687OooOoO0 = obj;
        return c24273Oooo00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o0O0O00<Object> o0o0o00, Continuation<? super C32460OooOooO> continuation) {
        return ((C24273Oooo00o) create(o0o0o00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.OooO0O0(r3, r7) == r0) goto L16;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o0O0O00 o0o0o00;
        C24033OooOooo c24033OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81684OooOo;
        C24033OooOooo c24033OooOooo2 = this.f81686OooOoO;
        Object obj2 = this.f81690OooOoo0;
        OooOOO<Object> oooOOO = this.f81688OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0O0O00 o0o0o002 = (o0O0O00) this.f81687OooOoO0;
            o000oOoO o000ooooOooO0oO = oooOOO.OooO0oO();
            this.f81687OooOoO0 = o0o0o002;
            this.f81685OooOo0o = c24033OooOooo2;
            this.f81684OooOo = 1;
            Object objOooO0o0 = o000ooooOooO0oO.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
                o0o0o00 = o0o0o002;
                obj = objOooO0o0;
                c24033OooOooo = c24033OooOooo2;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (this.f81689OooOoo) {
                oooOOO.f81558OooO0oo.OooO0O0(new C24251OooO0o0(obj2, obj2 != null ? obj2.hashCode() : 0, c24033OooOooo2.f80940OooOo0o));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        c24033OooOooo = this.f81685OooOo0o;
        o0o0o00 = (o0O0O00) this.f81687OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        c24033OooOooo.f80940OooOo0o = ((Number) obj).intValue();
        this.f81687OooOoO0 = null;
        this.f81685OooOo0o = null;
        this.f81684OooOo = 2;
    }
}
