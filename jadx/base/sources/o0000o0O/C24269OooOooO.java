package o0000o0O;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0000o0O.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m80623f = "DataStoreImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_1, StyleIdentifier.LIST_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
public final class C24269OooOooO extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81660OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81661OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f81662OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81663OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f81664OooOoOO;

    /* JADX INFO: renamed from: o0000o0O.OooOooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m80623f = "DataStoreImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f81665OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f81666OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24251OooO0o0<Object> f81667OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC32508OooOOOo<Object, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, C24251OooO0o0<Object> c24251OooO0o0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f81665OooOo = (AbstractC32476OooO) interfaceC32508OooOOOo;
            this.f81667OooOoO0 = c24251OooO0o0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f81665OooOo, this.f81667OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f81666OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            Object obj2 = this.f81667OooOoO0.f81529OooO0O0;
            this.f81666OooOo0o = 1;
            Object objInvoke = this.f81665OooOo.invoke(obj2, this);
            return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24269OooOooO(OooOOO<Object> oooOOO, InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo<Object, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C24269OooOooO> continuation) {
        super(1, continuation);
        this.f81663OooOoO0 = oooOOO;
        this.f81662OooOoO = interfaceC34415OooO0oo;
        this.f81664OooOoOO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C24269OooOooO(this.f81663OooOoO0, this.f81662OooOoO, this.f81664OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<Object> continuation) {
        return ((C24269OooOooO) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C24251OooO0o0 c24251OooO0o0;
        T t;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81660OooOo;
        OooOOO<Object> oooOOO = this.f81663OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f81660OooOo = 1;
            obj = OooOOO.OooO0o(oooOOO, true, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f81661OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return obj2;
            }
            c24251OooO0o0 = (C24251OooO0o0) this.f81661OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            t = c24251OooO0o0.f81529OooO0O0;
            if ((t == 0 ? t.hashCode() : 0) == c24251OooO0o0.f81530OooO0OO) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c24251OooO0o0.f81529OooO0O0, obj)) {
                this.f81661OooOo0o = obj;
                this.f81660OooOo = 3;
                if (oooOOO.OooOO0(obj, true, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        c24251OooO0o0 = (C24251OooO0o0) obj;
        OooO00o oooO00o = new OooO00o(this.f81664OooOoOO, c24251OooO0o0, null);
        this.f81661OooOo0o = c24251OooO0o0;
        this.f81660OooOo = 2;
        obj = C33609OooO0oo.OooO0o(this.f81662OooOoO, oooO00o, this);
        if (obj != enumC32485OooO00o) {
            t = c24251OooO0o0.f81529OooO0O0;
            if ((t == 0 ? t.hashCode() : 0) == c24251OooO0o0.f81530OooO0OO) {
            }
        }
        return enumC32485OooO00o;
    }
}
