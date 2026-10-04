package o0OOOO00;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOOO00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27085OooO0Oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f94340OooOo0o;

    /* JADX INFO: renamed from: o0OOOO00.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.theme.ThemeLocalDataSource$getCustomBasePageColors$$inlined$map$1$2", m80623f = "ThemeLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f94341OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f94342OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f94342OooOo0o = obj;
            this.f94341OooOo |= Integer.MIN_VALUE;
            return C27085OooO0Oo.this.emit(null, this);
        }
    }

    public C27085OooO0Oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f94340OooOo0o = interfaceC33723OooO0oO;
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
            int i = oooO00o.f94341OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f94341OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f94342OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f94341OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(OooOO0O.f94369OooOo0O);
            List list = C34434OooOoO.f123453OooOo0o;
            if (str != null && str.length() != 0) {
                try {
                    Type type = new OooO0o().getType();
                    kotlin.jvm.internal.OooOOO0.OooO0o(type, "getType(...)");
                    Object objFromJson = C28028OooO0o.OooO00o().fromJson(str, type);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(objFromJson);
                    list = (List) objFromJson;
                } catch (Exception unused) {
                }
            }
            oooO00o.f94341OooOo = 1;
            if (this.f94340OooOo0o.emit(list, oooO00o) == enumC32485OooO00o) {
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
