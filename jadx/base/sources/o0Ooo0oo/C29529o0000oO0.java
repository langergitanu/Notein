package o0Ooo0oo;

import com.huawei.hms.network.embedded.C18416x7;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Ooo0oo.o0000oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29529o0000oO0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104741OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f104742OooOo0o;

    /* JADX INFO: renamed from: o0Ooo0oo.o0000oO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$special$$inlined$map$11$2", m80623f = "PenBarViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f104743OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104744OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f104744OooOo0o = obj;
            this.f104743OooOo |= Integer.MIN_VALUE;
            return C29529o0000oO0.this.emit(null, this);
        }
    }

    public C29529o0000oO0(InterfaceC33723OooO0oO interfaceC33723OooO0oO, com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0) {
        this.f104742OooOo0o = interfaceC33723OooO0oO;
        this.f104741OooOo = oooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f104743OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f104743OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f104744OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f104743OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
            Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75139oo000o);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Integer num = (Integer) abstractC24338OooO0o0.OooO0OO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75136o00oO0O);
            int iIntValue = num != null ? num.intValue() : 1;
            String str = (String) abstractC24338OooO0o0.OooO0OO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75138o0ooOO0);
            if (str == null) {
                str = C18416x7.f56644n;
            }
            Float[] fArr = (Float[]) this.f104741OooOo.f75150OooOOO0.fromJson(str, (Class) Float[].class);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(fArr);
            FavoriteToolBox.OooO00o oooO00o2 = new FavoriteToolBox.OooO00o(zBooleanValue, iIntValue, (Float) oOo000Oo.OooOOO.OooOooo(0, fArr), (Float) oOo000Oo.OooOOO.OooOooo(1, fArr));
            oooO00o.f104743OooOo = 1;
            if (this.f104742OooOo0o.emit(oooO00o2, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
